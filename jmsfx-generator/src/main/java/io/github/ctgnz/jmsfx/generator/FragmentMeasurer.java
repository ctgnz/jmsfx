package io.github.ctgnz.jmsfx.generator;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

import javafx.application.Platform;
import javafx.geometry.Bounds;
import javafx.scene.Group;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.SvgGraphic;

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
 * hallux is created - so this runs occasionally and by hand rather than on every build.
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
    private static final String CONTROL_MEASURES = "ControlMeasures";

    public static void main(String[] args) {
        String configFile = args.length > 0 ? args[0] : "/config.yml";
        try {
            startToolkit();
            FragmentMeasurer measurer = new FragmentMeasurer(configFile);
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
    private final JmsfxParser parser;
    private final FoxgloveParser svgParser = new FoxgloveParser();

    public FragmentMeasurer(String configFile) throws Exception {
        this.parser = new JmsfxParser();
        try (InputStream inputStream = FragmentMeasurer.class.getResourceAsStream(configFile)) {
            this.config = parser.readConfig(inputStream);
        }
        if (config.getResourceDir() == null) {
            throw new IllegalStateException(configFile + " has no resourceDir, so the SVG fragments cannot be found");
        }
        if (config.getModelSourceFile() == null) {
            throw new IllegalStateException(configFile + " has no modelSourceFile, so there is nowhere to write the bounds back to");
        }
    }

    public void measure() throws Exception {
        LibraryModel model = parser.readLibraryModel(Files.newInputStream(config.getModelFile()));
        List<StandardIdentityGroupModel> groups = model.getIdentityGroups();
        System.out.format("Measuring against %s%n", config.getResourceDir());
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
        measureSectorModifiers(model);

        Path modelFile = config.getModelSourceFile();
        Files.writeString(modelFile, parser.writeLibraryModel(model), StandardCharsets.UTF_8);
        System.out.format("%nWrote %s%n", modelFile);
    }

    /**
     * Status graphics live at {@code /svg/OCA/0{identityGroup}{frameId}{status}2.svg}, so the bounds are keyed by identity group and frame id - the two things that vary the
     * fragment. {@code frameId} is the dimension's code.
     */
    private void measureStatuses(LibraryModel model) throws InterruptedException {
        int measured = 0;
        int absent = 0;
        for (StatusModel status : model.getStatuses()) {
            Map<String, BoundsModel> byKey = new LinkedHashMap<>();
            for (StandardIdentityGroupModel group : model.getIdentityGroups()) {
                for (DimensionModel dimension : model.getDimensions()) {
                    String key = group.getCode() + dimension.getCode();
                    Path file = svg("OCA", "0" + key + status.getCode() + "2.svg");
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

    /** HQ/task force/dummy graphics live at {@code /svg/HQTFFD/{identityGroup}{dimension}{hqtfDummy}.svg}. */
    private void measureHqtfDummies(LibraryModel model) throws InterruptedException {
        int measured = 0;
        int absent = 0;
        for (HqtfDummyModel hqtfDummy : model.getHqtfDummies()) {
            Map<String, BoundsModel> byKey = new LinkedHashMap<>();
            for (StandardIdentityGroupModel group : model.getIdentityGroups()) {
                for (DimensionModel dimension : model.getDimensions()) {
                    String key = group.getCode() + dimension.getCode();
                    Path file = svg("HQTFFD", key + hqtfDummy.getCode() + ".svg");
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
     * Frames live at {@code /svg/Frames/0_{identity}{frameId}_{statusFrameId}{c}.svg}, and hang off the dimension because {@code frameId} is the dimension's code. The status
     * contributes its own code only for a confirmed identity; otherwise the frame is the "0" variant, which is what {@code Status.getFrameId(identity)} encodes.
     */
    private void measureFrames(LibraryModel model) throws InterruptedException {
        int measured = 0;
        int absent = 0;
        for (DimensionModel dimension : model.getDimensions()) {
            Map<String, BoundsModel> byKey = new LinkedHashMap<>();
            for (StandardIdentityModel identity : model.getIdentities()) {
                for (StatusModel status : model.getStatuses()) {
                    String statusFrameId = identity.isConfirmed() ? status.getCode() : "0";
                    for (boolean civilian : new boolean[] {
                        false, true
                    }) {
                        String key = identity.getCode() + statusFrameId + (civilian ? "c" : "");
                        if (byKey.containsKey(key)) {
                            continue;
                        }
                        Path file = svg("Frames", "0_" + identity.getCode() + dimension.getCode() + "_" + statusFrameId + (civilian ? "c" : "") + ".svg");
                        Bounds bounds = boundsOf(file);
                        if (bounds == null) {
                            absent++;
                            continue;
                        }
                        byKey.put(key, rectangle(bounds));
                    }
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
     * Sector modifiers are drawn within the bounding octagon, so only the fragments that break that rule need recording - 46 of 449 at the time of writing, from the Land Units
     * supply bar down to sub-pixel stroke overhangs.
     * <p>
     * This walks {@code Appendices/*}/mod1 and mod2 rather than deriving paths from the model. A modifier's identifier is built three different ways depending on whether it
     * belongs to a symbol set or to one of the two common sets, and the file stem already is that identifier - so scanning avoids duplicating logic that has gone wrong before.
     */
    private void measureSectorModifiers(LibraryModel model) throws Exception {
        Path appendices = config.getResourceDir()
            .resolve("svg")
            .resolve("Appendices");
        if (!Files.isDirectory(appendices)) {
            System.out.format("  %-24s no Appendices directory at %s%n", "sector modifiers", appendices);
            return;
        }
        Map<String, BoundsModel> escaping = new TreeMap<>();
        int inspected = 0;
        try (Stream<Path> tree = Files.walk(appendices)) {
            List<Path> fragments = tree.filter(Files::isRegularFile)
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
                escaping.put(fileName.substring(0, fileName.length() - ".svg".length()), rectangle(bounds));
            }
        }
        model.setModifierBounds(escaping.isEmpty() ? null : escaping);
        System.out.format("  %-24s %d inspected, %d escaping the octagon%n", "sector modifiers", inspected, escaping.size());
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

    private Path svg(String directory, String fileName) {
        return config.getResourceDir()
            .resolve("svg")
            .resolve(directory)
            .resolve(fileName);
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
     * {@code /svg/{location}/{identityGroup}{itemCode}.svg}, the same path the library loads at runtime.
     * <p>
     * A standard amplifier's own code is the complete two-digit value from Table A-8, so the list's code is not part of the name. It used to be, which is why echelon could not
     * express division and above - those codes begin with a 2, and every item was prefixed with the list's 1.
     */
    private Path fragmentFor(AmplifierListModel list, AmplifierListItemModel item, StandardIdentityGroupModel group) {
        String name = group.getCode() + item.getCode() + ".svg";
        return config.getResourceDir()
            .resolve("svg")
            .resolve(list.getGraphicLocation())
            .resolve(name);
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
