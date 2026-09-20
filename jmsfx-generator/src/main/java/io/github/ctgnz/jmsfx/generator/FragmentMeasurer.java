package io.github.ctgnz.jmsfx.generator;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import javafx.application.Platform;
import javafx.geometry.Bounds;
import javafx.scene.Group;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.SvgGraphic;

import io.github.ctgnz.jmsfx.generator.model.AmplifierListItemModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierListModel;
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
                Map<String, List<Double>> byGroup = new LinkedHashMap<>();
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
            Map<String, List<Double>> byKey = new LinkedHashMap<>();
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
            Map<String, List<Double>> byKey = new LinkedHashMap<>();
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
            Map<String, List<Double>> byKey = new LinkedHashMap<>();
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

    /** {@code /svg/{location}/{identityGroup}{listCode}{itemCode}.svg}, the same path the library loads at runtime. */
    private Path fragmentFor(AmplifierListModel list, AmplifierListItemModel item, StandardIdentityGroupModel group) {
        String name = group.getCode() + list.getCode() + item.getCode() + ".svg";
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

    private List<Double> rectangle(Bounds bounds) {
        List<Double> values = new ArrayList<>(4);
        values.add(round(bounds.getMinX()));
        values.add(round(bounds.getMinY()));
        values.add(round(bounds.getWidth()));
        values.add(round(bounds.getHeight()));
        return values;
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
