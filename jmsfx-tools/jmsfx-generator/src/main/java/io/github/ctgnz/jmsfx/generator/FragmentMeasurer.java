package io.github.ctgnz.jmsfx.generator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

import javafx.application.Platform;
import javafx.geometry.Bounds;
import javafx.scene.Group;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.SvgGraphic;

import io.github.ctgnz.jmsfx.generator.model.AbstractModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierListItemModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierListModel;
import io.github.ctgnz.jmsfx.generator.model.BoundsModel;
import io.github.ctgnz.jmsfx.generator.model.DimensionModel;
import io.github.ctgnz.jmsfx.generator.model.HqtfDummyModel;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityGroupModel;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityModel;
import io.github.ctgnz.jmsfx.generator.model.StatusModel;
import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

/**
 * Measures the SVG fragments and writes their bounds back into the model file.
 * <p>
 * This is deliberately separate from {@link DomainModelGenerator}. Measuring needs a JavaFX toolkit, because reading a bounding box means instantiating a {@code Node}; code
 * generation does not, and keeping the two apart is what lets generation run headless. The fragments are static - they change on an edition revision, or when a new variant like
 * the historical extension is created - so this runs occasionally and by hand rather than on every build.
 * <p>
 * Run it with the same config file as the generator:
 *
 * <pre>
 * java io.github.ctgnz.jmsfx.generator.FragmentMeasurer [/config.yml]
 * </pre>
 */
public class FragmentMeasurer {

    /** Bounds are rounded to this many decimals - beyond it the numbers are float32 noise, not signal. */
    private static final int PRECISION = 2;

    /** The bounding octagon from BoundingOctagon.svg - x 183.5 to 426.5, y 272.5 to 516.5. */
    private static final double OCTAGON_MIN_X = 183.5;
    private static final double OCTAGON_MIN_Y = 272.5;
    private static final double OCTAGON_MAX_X = 426.5;
    private static final double OCTAGON_MAX_Y = 516.5;

    /** Matches the rounding applied to measurements, so a fragment is not called escaping by less than it is recorded to. */
    private static final double TOLERANCE = 0.01;

    /** The one symbol set excluded throughout - see jmsfx#52. */
    private static final String CONTROL_MEASURES = "CONTROL_MEASURE";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("usage: FragmentMeasurer <library>/src/main/model/config.yml [<base-library>/src/main/model/config.yml]");
            return;
        }
        Path configFile = Path.of(args[0]);
        Path baseConfigFile = args.length > 1 ? Path.of(args[1]) : null;
        try {
            startToolkit();
            FragmentMeasurer measurer = new FragmentMeasurer(configFile, baseConfigFile);
            measurer.measure();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Platform.exit();
        }
    }

    /**
     * The toolkit has to be up before any {@code Node} is instantiated, and every measurement has to happen on the FX thread afterwards.
     */
    private static void startToolkit() throws InterruptedException {
        CountDownLatch started = new CountDownLatch(1);
        Platform.startup(started::countDown);
        started.await();
    }

    private final GeneratorConfig config;
    private final GeneratorConfig baseConfig;
    private final FragmentTree tree;
    private final JmsfxParser parser;
    private final FoxgloveParser svgParser = new FoxgloveParser();

    /**
     * @param baseConfigFile
     *            the config of the library this one extends, or null. Required when the config names a {@code baseLibrary}, because a fragment this library does not carry itself
     *            lives in that base's tree and would otherwise measure as absent - see {@link FragmentTree}.
     */
    public FragmentMeasurer(Path configFile, Path baseConfigFile) throws Exception {
        this.parser = new JmsfxParser();
        this.config = GeneratorConfig.load(configFile);
        this.baseConfig = baseConfigFile == null ? null : GeneratorConfig.load(baseConfigFile);
        if (config.isOverlay() && baseConfig == null) {
            throw new IllegalArgumentException(String.format("%s extends %s, so the base library's config must be given as the second argument", config.getLibraryPrefix(),
                config.getBaseLibrary()));
        }
        this.tree = FragmentTree.of(config, baseConfig);
        // The two null checks that used to be here are gone with the paths they guarded: the
        // fragments are the config's own directory and the model is the file beside it, so neither
        // can be unset. Whether they exist is a different question, and reported where they are read.
    }

    public void measure() throws Exception {
        LibraryModel own = parser.readLibraryModel(Files.newInputStream(config.getModelFile()));
        // Measure against the whole shape, not the overlay's slice of it. An overlay restates only
        // what it adds (jmsfx#137), so its Equipment Mobility entry carries three values and no
        // `standard: true` - and the loops below, which ask whether a list is standard and iterate
        // the dimensions and identities, would skip it entirely.
        LibraryModel model = config.isOverlay()
            ? new ModelComposer().compose(parser.readLibraryModel(Files.newInputStream(baseConfig.getModelFile())), parser.readLibraryModel(Files.newInputStream(config
                .getModelFile())))
            : own;
        List<StandardIdentityGroupModel> groups = model.getIdentityGroups();
        System.out.format("Measuring against %s%n", config.getModelDir());
        System.out.format("Identity groups: %s%n", groups.stream()
            .map(StandardIdentityGroupModel::getCode)
            .toList());

        int measured = 0;
        int missing = 0;
        for (AmplifierListModel list : model.getAmplifierGroups()) {
            if (!list.isStandard() || list.isUnknown()) {
                continue;
            }
            int perList = 0;
            for (AmplifierListItemModel item : list.getValues()) {
                Map<String, BoundsModel> byGroup = new LinkedHashMap<>();
                for (StandardIdentityGroupModel group : groups) {
                    Path file = fragmentFor(list, item, group);
                    if (!Files.exists(file)) {
                        missing++;
                        continue;
                    }
                    Bounds bounds = onFxThread(() -> measureFile(file));
                    if (bounds != null && !bounds.isEmpty() && bounds.getWidth() > 0 && bounds.getHeight() > 0) {
                        byGroup.put(group.getCode(), rectangle(bounds));
                    }
                }
                if (!byGroup.isEmpty()) {
                    item.setBounds(byGroup);
                    measured++;
                    perList++;
                }
            }
            System.out.format("  %-24s %d of %d items measured%n", list.getTypeName(), perList, list.getValues()
                .size());
        }

        System.out.format("  %-24s %d items, %d fragments absent%n", "(amplifiers total)", measured, missing);

        measureStatuses(model);
        measureHqtfDummies(model);
        measureFrames(model);
        // Written to whichever model is about to be saved, and holding only fragments from this
        // library's own tree: a table is keyed by fragment, so an overlay recording the base's would
        // put the same measurement in two model files.
        measureIcons(model, own);
        measureSectorModifiers(own);

        if (config.isOverlay()) {
            carryBack(model, own);
        }
        Path modelFile = config.getModelFile();
        Files.writeString(modelFile, parser.writeLibraryModel(config.isOverlay() ? own : model), StandardCharsets.UTF_8);
        System.out.format("%nWrote %s%n", modelFile);
    }

    /**
     * Status graphics live at {@code /svg/Status/{dimension}/{identityGroup}/{status}.svg} (jmsfx#136), and the bounds stay keyed by identity group and frame id - the two things
     * that vary the fragment, and what the generated {@code getStatusBounds} switches on. {@code frameId} is the dimension's code.
     */
    private void measureStatuses(LibraryModel model) throws InterruptedException {
        int measured = 0;
        int absent = 0;
        for (StatusModel status : model.getStatuses()) {
            Map<String, BoundsModel> byKey = new LinkedHashMap<>();
            for (StandardIdentityGroupModel group : model.getIdentityGroups()) {
                for (DimensionModel dimension : model.getDimensions()) {
                    String key = group.getCode() + dimension.getCode();
                    Path file = tree.resolve("Status", dimension.getId(), group.getId(), status.getId() + ".svg");
                    Bounds bounds = boundsOf(file);
                    if (bounds == null) {
                        absent++;
                        continue;
                    }
                    byKey.put(key, rectangle(bounds));
                }
            }
            if (!byKey.isEmpty()) {
                status.setBounds(byKey);
                measured++;
            }
        }
        System.out.format("  %-24s %d of %d measured, %d absent%n", "statuses", measured, model.getStatuses()
            .size(), absent);
    }

    /** HQ/task force/dummy graphics live at {@code /svg/HQTFFD/{dimension}/{identityGroup}/{hqtfDummy}.svg}. See jmsfx#136. */
    private void measureHqtfDummies(LibraryModel model) throws InterruptedException {
        int measured = 0;
        int absent = 0;
        for (HqtfDummyModel hqtfDummy : model.getHqtfDummies()) {
            Map<String, BoundsModel> byKey = new LinkedHashMap<>();
            for (StandardIdentityGroupModel group : model.getIdentityGroups()) {
                for (DimensionModel dimension : model.getDimensions()) {
                    String key = group.getCode() + dimension.getCode();
                    Path file = tree.resolve("HQTFFD", dimension.getId(), group.getId(), hqtfDummy.getId() + ".svg");
                    Bounds bounds = boundsOf(file);
                    if (bounds == null) {
                        absent++;
                        continue;
                    }
                    byKey.put(key, rectangle(bounds));
                }
            }
            if (!byKey.isEmpty()) {
                hqtfDummy.setBounds(byKey);
                measured++;
            }
        }
        System.out.format("  %-24s %d of %d measured, %d absent%n", "hqtf/dummy", measured, model.getHqtfDummies()
            .size(), absent);
    }

    /**
     * Frames live at {@code /svg/Frames/{dimension}/{identity}/{status}.svg} (jmsfx#136), and the bounds hang off the dimension because the frame is the dimension's shape. The
     * status names its own frame only for a confirmed identity; otherwise the frame is the Present one, which is what {@code Status.getFrameId(identity)} encodes as "0".
     * <p>
     * Civilian is not measured. A civilian frame is the military one recoloured and so occupies the same space - every one of the 88 that used to be measured separately matched
     * its counterpart exactly - and since jmsfx#123 the {@code c} files no longer exist to measure.
     */
    private void measureFrames(LibraryModel model) throws InterruptedException {
        int measured = 0;
        int absent = 0;
        for (DimensionModel dimension : model.getDimensions()) {
            Map<String, BoundsModel> byKey = new LinkedHashMap<>();
            for (StandardIdentityModel identity : model.getIdentities()) {
                for (StatusModel status : model.getStatuses()) {
                    String statusFrameId = identity.isConfirmed() ? status.getCode() : "0";
                    String key = identity.getCode() + statusFrameId;
                    if (byKey.containsKey(key)) {
                        continue;
                    }
                    String statusName = identity.isConfirmed() ? status.getId() : "PRESENT";
                    Path file = tree.resolve("Frames", dimension.getId(), identity.getId(), statusName + ".svg");
                    Bounds bounds = boundsOf(file);
                    if (bounds == null) {
                        absent++;
                        continue;
                    }
                    byKey.put(key, rectangle(bounds));
                }
            }
            if (!byKey.isEmpty()) {
                dimension.setBounds(byKey);
                measured++;
            }
        }
        System.out.format("  %-24s %d of %d measured, %d absent%n", "frames (by dimension)", measured, model.getDimensions()
            .size(), absent);
    }

    /**
     * The extent of every {@code FREE_CANVAS} main icon, which is the only kind that has to be measured.
     * <p>
     * Every other main icon's extent follows from its graphic type - the octagon, or the frame for a {@code FULL_FRAME} one - so only these need a number recorded. Which icons
     * those are, and which fragment each draws, is {@link FreeCanvasIcons}. A fragment that resolves nowhere is reported rather than quietly skipped, because the identifier is
     * derived rather than read, so a path going nowhere means either the derivation or the model is wrong. See jmsfx#52.
     */
    private void measureIcons(LibraryModel model, LibraryModel target) throws Exception {
        Map<String, BoundsModel> measured = new TreeMap<>();
        List<String> missing = new ArrayList<>();
        List<String> elsewhere = new ArrayList<>();
        List<FreeCanvasIcons.Icon> icons = FreeCanvasIcons.collect(model, tree);
        for (FreeCanvasIcons.Icon icon : icons) {
            if (!icon.fragment()
                .startsWith(tree.own())) {
                elsewhere.add(icon.identifier());
                continue;
            }
            Bounds bounds = boundsOf(icon.fragment());
            if (bounds == null) {
                missing.add(String.format("%s / %s (%s)", icon.symbolSet(), icon.label(), icon.identifier()));
                continue;
            }
            measured.put(icon.identifier(), rectangle(bounds));
        }
        target.setIconBounds(measured.isEmpty() ? null : measured);
        System.out.format("  %-24s %d free-canvas icons, %d measured, %d unreadable or absent, %d in the base's tree%n", "main icons", icons.size(), measured.size(),
            missing.size(), elsewhere.size());
        missing.forEach(name -> System.out.format("      no fragment for %s%n", name));
    }

    /**
     * Sector modifiers are drawn within the bounding octagon, so only the fragments that break that rule need recording - 46 of 449 at the time of writing, from the Land Units
     * supply bar down to sub-pixel stroke overhangs.
     * <p>
     * This walks {@code Dimensions/*}/mod1 and mod2 rather than deriving paths from the model (jmsfx#136), and keys each by the path it found it at - dimension, sector and file
     * stem - which is what {@link FragmentSource#modifierBoundsKey} looks it up by. The stem alone would collide: 30 modifier names appear under more than one dimension.
     */
    private void measureSectorModifiers(LibraryModel model) throws Exception {
        // The overlay's own tree only. A base's modifiers are measured when the base is measured, and
        // recording them here would put the same number in two model files.
        List<Path> dimensionRoots = Stream.of(tree.own()
            .resolve("Dimensions"))
            .filter(Files::isDirectory)
            .toList();
        if (dimensionRoots.isEmpty()) {
            model.setModifierBounds(null);
            System.out.format("  %-24s no Dimensions directory of its own, so no modifier bounds%n", "sector modifiers");
            return;
        }
        Map<String, BoundsModel> escaping = new TreeMap<>();
        int inspected = 0;
        try (Stream<Path> walked = dimensionRoots.stream()
            .flatMap(FragmentMeasurer::walk)) {
            List<Path> fragments = walked.filter(Files::isRegularFile)
                .filter(path -> path.getFileName()
                    .toString()
                    .endsWith(".svg"))
                .filter(FragmentMeasurer::isSectorModifier)
                .sorted()
                .toList();
            for (Path fragment : fragments) {
                inspected++;
                Bounds bounds = boundsOf(fragment);
                if (bounds == null || containedInOctagon(bounds)) {
                    continue;
                }
                String fileName = fragment.getFileName()
                    .toString();
                Path sector = fragment.getParent();
                escaping.put(FragmentSource.modifierBoundsKey(sector.getParent()
                    .getFileName()
                    .toString(),
                    sector.getFileName()
                        .toString(),
                    fileName.substring(0, fileName.length() - ".svg".length())), rectangle(bounds));
            }
        }
        model.setModifierBounds(escaping.isEmpty() ? null : escaping);
        System.out.format("  %-24s %d inspected, %d escaping the octagon%n", "sector modifiers", inspected, escaping.size());
    }

    /**
     * Copies what was measured onto the overlay's own elements, so what is written stays an overlay.
     * <p>
     * Matched by id within the container that holds them, which is what identifies an element across the two models - composition matches on the same thing. An element the overlay
     * does not carry is left behind: its bounds belong in the base's model, measured when the base is measured, and copying them here is the fragment duplication jmsfx#133 removed
     * wearing a different hat.
     */
    private static void carryBack(LibraryModel measured, LibraryModel own) {
        for (AmplifierListModel list : own.getAmplifierGroups()) {
            AmplifierListModel from = byId(measured.getAmplifierGroups(), list.getId());
            if (from == null) {
                continue;
            }
            for (AmplifierListItemModel item : list.getValues()) {
                copyBounds(byId(from.getValues(), item.getId()), item);
            }
        }
        own.getStatuses()
            .forEach(status -> copyBounds(byId(measured.getStatuses(), status.getId()), status));
        own.getHqtfDummies()
            .forEach(dummy -> copyBounds(byId(measured.getHqtfDummies(), dummy.getId()), dummy));
        own.getDimensions()
            .forEach(dimension -> copyBounds(byId(measured.getDimensions(), dimension.getId()), dimension));
    }

    private static <E extends AbstractModel> E byId(List<E> elements, String id) {
        return elements == null ? null : elements.stream()
            .filter(element -> Objects.equals(element.getId(), id))
            .findFirst()
            .orElse(null);
    }

    private static void copyBounds(AbstractModel from, AbstractModel to) {
        if (from != null && from.getBounds() != null) {
            to.setBounds(from.getBounds());
        }
    }

    private static boolean isSectorModifier(Path fragment) {
        Path parent = fragment.getParent();
        if (parent == null || parent.getParent() == null) {
            return false;
        }
        String directory = parent.getFileName()
            .toString();
        if (!"mod1".equals(directory) && !"mod2".equals(directory)) {
            return false;
        }
        // Control Measures do not obey the icon composition rules - they are map graphics rather than
        // symbols built within the octagon - so their fragments are excluded here as everywhere else.
        return !CONTROL_MEASURES.equals(parent.getParent()
            .getFileName()
            .toString());
    }

    /** Within the octagon of {@code BoundingOctagon.svg}, allowing the same tolerance the measurements are rounded to. */
    private static boolean containedInOctagon(Bounds bounds) {
        return bounds.getMinX() >= OCTAGON_MIN_X - TOLERANCE && bounds.getMinY() >= OCTAGON_MIN_Y - TOLERANCE
               && bounds.getMaxX() <= OCTAGON_MAX_X + TOLERANCE && bounds.getMaxY() <= OCTAGON_MAX_Y + TOLERANCE;
    }

    /**
     * Every file under a root, or nothing if it cannot be read.
     * <p>
     * Wrapped because {@code Files.walk} throws a checked exception and this is used inside a stream. Failing silently is right here: the caller has already established the
     * directory exists, and a scan that finds nothing reports zero fragments rather than pretending to have checked.
     */
    private static Stream<Path> walk(Path root) {
        try {
            return Files.walk(root);
        } catch (IOException e) {
            return Stream.empty();
        }
    }

    private Path svg(String directory, String fileName) {
        return tree.resolve(directory, fileName);
    }

    /** Measured bounds for a fragment, or null when the file is absent or draws nothing. */
    private Bounds boundsOf(Path file) throws InterruptedException {
        if (!Files.exists(file)) {
            return null;
        }
        Bounds bounds = onFxThread(() -> measureFile(file));
        if (bounds == null || bounds.isEmpty() || bounds.getWidth() <= 0 || bounds.getHeight() <= 0) {
            return null;
        }
        return bounds;
    }

    /**
     * {@code /svg/Amplifiers/{list}/{identityGroup}/{item}.svg}, the same path the library loads at runtime. See jmsfx#136.
     * <p>
     * The directory is the list's generated constant rather than its id, which is what puts Echelon inside {@code Amplifiers/} beside Equipment Mobility.
     */
    private Path fragmentFor(AmplifierListModel list, AmplifierListItemModel item, StandardIdentityGroupModel group) {
        return tree.resolve("Amplifiers", list.getEnumId(), group.getId(), item.getId() + ".svg");
    }

    private Bounds measureFile(Path file) {
        // parseFile(File), not parseFile(String) - the String overload resolves against the classpath,
        // and the fragments live in another module's source tree. Every overload swallows failures and
        // hands back an empty SvgGraphic rather than throwing, so a wrong path reads as "measured
        // nothing" instead of an error.
        SvgGraphic graphic = svgParser.parseFile(file.toFile());
        if (graphic == null || graphic.getVisibleContent() == null || graphic.getVisibleContent()
            .isEmpty()) {
            return null;
        }
        SvgGraphic solo = new SvgGraphic();
        solo.getContent()
            .addAll(graphic.getVisibleContent());
        Group group = solo.createGroup();
        group.autosize();
        return group.getBoundsInLocal();
    }

    private BoundsModel rectangle(Bounds bounds) {
        return new BoundsModel(round(bounds.getMinX()), round(bounds.getMinY()), round(bounds.getWidth()), round(bounds.getHeight()));
    }

    private double round(double value) {
        double factor = Math.pow(10, PRECISION);
        return Math.round(value * factor) / factor;
    }

    /** Every measurement runs on the FX thread, since instantiating a {@code Node} off it is not allowed. */
    private <T> T onFxThread(java.util.function.Supplier<T> work) throws InterruptedException {
        List<T> result = new ArrayList<>(1);
        CountDownLatch done = new CountDownLatch(1);
        Platform.runLater(() -> {
            try {
                result.add(work.get());
            } catch (RuntimeException e) {
                result.add(null);
            } finally {
                done.countDown();
            }
        });
        done.await();
        return result.isEmpty() ? null : result.get(0);
    }

}
