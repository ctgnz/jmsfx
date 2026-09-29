package io.github.ctgnz.jmsfx.generator;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import freemarker.template.Template;
import io.github.ctgnz.jmsfx.generator.model.AbstractModel;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;
import io.github.ctgnz.jmsfx.generator.yaml.JmsfxParser;

public class DomainModelGenerator {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("usage: DomainModelGenerator <library>/config.yml [<base-library>/config.yml]");
            System.err.println("       the second argument is required only for an overlay, and is the config of the library it composes onto");
            return;
        }
        try {
            DomainModelGenerator generator = new DomainModelGenerator(Path.of(args[0]), args.length > 1 ? Path.of(args[1]) : null);
            LibraryModel dataModel = generator.parse();
            generator.generate(dataModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private GeneratorConfig config;
    private GeneratorConfig baseConfig;
    private JmsfxParser parser;

    public DomainModelGenerator(Path configFile) throws IOException {
        this(configFile, null);
    }

    /**
     * @param configFile
     *            the library to generate
     * @param baseConfigFile
     *            the config of the library it composes onto, for an overlay; null for a model complete in itself
     */
    public DomainModelGenerator(Path configFile, Path baseConfigFile) throws IOException {
        this.parser = new JmsfxParser();
        this.config = GeneratorConfig.load(configFile);
        this.baseConfig = baseConfigFile == null ? null : GeneratorConfig.load(baseConfigFile);
        checkBaseMatchesDeclaration();
        if (baseConfig != null) {
            config.inheritFrom(baseConfig);
        }
        System.out.format("Writing to %s%n", config.getOutputDir());
    }

    /**
     * That the base handed in is the one the config asked for.
     * <p>
     * The config declares what it extends by library prefix and the caller supplies where that library is, so the two can disagree - and resolving an extension's fragments, or
     * composing its model, against the wrong base produces a library that generates, compiles and renders while meaning something different. Cheaper to refuse than to notice
     * later.
     * <p>
     * Naming a base is what every extension does, since jmsfx#133, to resolve the fragments it does not carry itself. Composing a model onto that base is the narrower case, and
     * {@code overlayModel} is what says so.
     */
    private void checkBaseMatchesDeclaration() {
        if (config.hasBase() && baseConfig == null) {
            throw new IllegalArgumentException(String.format("%s extends %s, so the base library's config must be given as the second argument", config.getLibraryPrefix(),
                config.getBaseLibrary()));
        }
        if (!config.hasBase() && baseConfig != null) {
            throw new IllegalArgumentException(String.format("%s extends nothing, so it takes no base - remove the second argument, or give it a baseLibrary",
                config.getLibraryPrefix()));
        }
        if (baseConfig != null && !config.getBaseLibrary()
            .equals(baseConfig.getLibraryPrefix())) {
            throw new IllegalArgumentException(String.format("%s extends %s, but the config given as its base is %s", config.getLibraryPrefix(), config.getBaseLibrary(),
                baseConfig.getLibraryPrefix()));
        }
    }

    /**
     * Reads every fragment the model names and hangs it on the element that draws it, so the generated constant carries its own drawing - jmsfx#122.
     * <p>
     * After composition, deliberately: an overlay has no symbol sets of its own, so run against one alone this would find nothing.
     */
    private void injectFragments(LibraryModel dataModel) throws Exception {
        FragmentSource.Result result = FragmentSource.inject(dataModel, FragmentTree.of(config, baseConfig));
        System.out.format("Injected %d fragments%n", result.injected());
        if (!result.missing()
            .isEmpty()) {
            // Reported rather than fatal: these elements now draw the Invalid Symbol, which is visible,
            // where before they drew nothing at all and nobody noticed.
            System.out.format("  %d named by the model but not found, and will draw the Invalid Symbol: %s%n", result.missing()
                .size(), String.join(", ", result.missing()));
        }
    }

    public void generate(LibraryModel dataModel) throws Exception {
        deleteOldSourceFiles();
        config.getStandardEnums()
            .forEach(enumConfig -> generateStandardEnum(dataModel, enumConfig));
        generateAmplifierEnum(dataModel);
        generateListAmplifierEnums(dataModel);
        generateIconBounds(dataModel);
        generateModifierBounds(dataModel);
        generateSymbolSets(dataModel);
        generateLibrary(dataModel);
    }

    /**
     * Reads the model, composing it onto a base first when the config names one, then stamps this generator's naming onto the result.
     * <p>
     * The model file describes symbology; what a library is called and which packages it lands in are properties of generating one, not of the standard it implements. So they live
     * in the config alone, and are applied here rather than being declared a second time at the head of every model file - which is what jmsfx#108 was about.
     * <p>
     * A config declaring {@code overlayModel} has an <em>overlay</em> rather than a whole model: only what the extension adds, composed onto the base by {@link ModelComposer}.
     * Where that base lives is the generator's second argument rather than something derived from this one's location - see {@link GeneratorConfig#getBaseLibrary()}. jmsfx#81.
     * <p>
     * Composition turns on {@code overlayModel} and not on the base being present, since jmsfx#133: a library names a base to resolve the fragments it does not carry, which
     * jmsfx-historical does with a complete model of its own. Composing that onto the base would try to add every element the base already has.
     */
    public LibraryModel parse() throws Exception {
        LibraryModel dataModel = parser.readLibraryModel(Files.newInputStream(config.getModelFile()));
        if (config.isOverlay()) {
            System.out.format("Composing onto %s%n", baseConfig.getModelFile());
            dataModel = new ModelComposer().compose(parser.readLibraryModel(Files.newInputStream(baseConfig.getModelFile())), dataModel);
        }
        dataModel.setLibraryPrefix(config.getLibraryPrefix());
        dataModel.setCountryCodeClass(config.getCountryCodeClass());
        dataModel.setIconPackage(config.getIconPackage());
        dataModel.setAmplifierPackage(config.getAmplifierPackage());
        dataModel.setCommonPackage(config.getCommonPackage());
        injectFragments(dataModel);
        return dataModel;
    }

    /** Generated sources always come out UTF-8, regardless of the JVM's platform-default encoding. */
    private static Writer newWriter(Path file) throws IOException {
        return new OutputStreamWriter(Files.newOutputStream(file), StandardCharsets.UTF_8);
    }

    private void deleteOldSourceFiles() throws IOException {
        Path outputDir = config.getOutputDir();
        if (Files.notExists(outputDir)) {
            // A library being generated for the first time has no sources to clear, which is not a
            // problem worth an exception - jmsfx-battleorder hit this as the first library composed
            // from an overlay rather than checked in whole.
            return;
        }
        Files.list(outputDir)
            .findFirst()
            .ifPresent(packageRoot -> {
                try {
                    Files.walk(packageRoot)
                        .map(Path::toFile)
                        .sorted(Comparator.reverseOrder())
                        .forEach(File::delete);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
    }

    private void generateAmplifierEnum(LibraryModel dataModel) throws Exception {
        Template template = config.getTemplateConfig()
            .getTemplate("AmplifierEnum.ftl");
        template.process(dataModel, newWriter(config.getIconPackageDir()
            .resolve("AmplifierEnum.java")));
    }

    private void generateLibrary(LibraryModel dataModel) throws Exception {
        Template template = config.getTemplateConfig()
            .getTemplate("IconLibrary.ftl");
        String className = dataModel.getLibraryPrefix() + "IconLibrary";
        template.process(dataModel, newWriter(config.getIconPackageDir()
            .resolve(className + ".java")));
        generateServiceDeclaration(className);
    }

    /**
     * Declares the generated library as an {@code IconLibrary} service, so a consumer finds it with {@link IconLibrary#discover()} rather than naming it.
     * <p>
     * Written here rather than kept as a checked-in resource because the class it names is generated: the library prefix comes from the config, so hand-maintaining this file would
     * mean one more thing to remember when a new library is set up, and a silent failure to discover anything when it was forgotten.
     * <p>
     * The interface is named from the configured base package rather than referenced as a class, which is how the templates name every other core type. The generator writes source
     * for the library rather than depending on it, and that is worth keeping: it has no need of jmsfx-core on its own classpath.
     */
    private void generateServiceDeclaration(String className) throws IOException {
        Path services = config.getResourcesDir()
            .resolve("META-INF")
            .resolve("services");
        Files.createDirectories(services);
        try (Writer writer = newWriter(services.resolve(config.getBasePackage() + ".IconLibrary"))) {
            writer.write(String.format("# Generated by %s - do not edit.%n", DomainModelGenerator.class.getSimpleName()));
            writer.write(String.format("%s.%s%n", config.getIconPackage(), className));
        }
    }

    private void generateListAmplifierEnums(LibraryModel dataModel) throws Exception {
        Template template = config.getTemplateConfig()
            .getTemplate("AmplifierListEnum.ftl");
        template.process(dataModel, newWriter(config.getIconPackageDir()
            .resolve("AmplifierListEnum.java")));
        Template amplifierTemplate = config.getTemplateConfig()
            .getTemplate("AmplifierListItem.ftl");
        Path amplifierPath = config.getAmplifierPackageDir();
        if (!Files.exists(amplifierPath)) {
            Files.createDirectories(amplifierPath);
        }
        dataModel.getAmplifierGroups()
            .forEach(enumType -> {
                try {
                    System.out.format("Processing amplifier enum %s%n", enumType.getTypeName());
                    dataModel.setAmplifier(enumType);
                    amplifierTemplate.process(dataModel, newWriter(amplifierPath.resolve(enumType.getTypeName() + ".java")));
                } catch (Exception e) {
                    throw new IllegalArgumentException("Unable to create amplifier group enum", e);
                }
            });
    }

    /** Only emitted when there is something to emit - a model with no FREE_CANVAS elements needs no lookup. */
    private void generateIconBounds(LibraryModel dataModel) throws Exception {
        if (dataModel.getIconBounds() == null || dataModel.getIconBounds()
            .isEmpty()) {
            return;
        }
        Template template = config.getTemplateConfig()
            .getTemplate("IconBounds.ftl");
        template.process(dataModel, newWriter(config.getIconPackageDir()
            .resolve("IconBounds.java")));
    }

    /** Only emitted when there is something to emit - a model whose modifiers all keep within the octagon needs no lookup. */
    private void generateModifierBounds(LibraryModel dataModel) throws Exception {
        if (dataModel.getModifierBounds() == null || dataModel.getModifierBounds()
            .isEmpty()) {
            return;
        }
        Template template = config.getTemplateConfig()
            .getTemplate("ModifierBounds.ftl");
        template.process(dataModel, newWriter(config.getIconPackageDir()
            .resolve("ModifierBounds.java")));
    }

    private void generateStandardEnum(LibraryModel dataModel, String typeName) {
        try {
            System.out.format("Processing standard enum %s%n", typeName);
            Template template = config.getTemplateConfig()
                .getTemplate(typeName + ".ftl");
            template.process(dataModel, newWriter(config.getIconPackageDir()
                .resolve(typeName + ".java")));
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to create enum", e);
        }
    }

    private void generateSymbolSet(LibraryModel dataModel, SymbolSetModel symSetDetails) {
        try {
            String packageName = symSetDetails.getPackageName();
            Path packagePath = config.getIconPackageDir()
                .resolve(packageName);
            if (!Files.exists(packagePath)) {
                Files.createDirectories(packagePath);
            }
            System.out.format("  Adding entities for symbol set %s%n", symSetDetails.getLabel());
            dataModel.setSymbolSet(symSetDetails);
            Template symSetInfoTemplate = config.getTemplateConfig()
                .getTemplate("SymbolSetInfo.ftl");
            symSetInfoTemplate.process(dataModel, newWriter(packagePath.resolve(symSetDetails.getBaseTypeName() + "SymbolSet.java")));
            Template entityTemplate = config.getTemplateConfig()
                .getTemplate("Entity.ftl");
            entityTemplate.process(dataModel, newWriter(packagePath.resolve(symSetDetails.getBaseTypeName() + "Entity.java")));
            if (symSetDetails.isEntityTypePresent()) {
                Template entityTypeTemplate = config.getTemplateConfig()
                    .getTemplate("EntityType.ftl");
                entityTypeTemplate.process(dataModel, newWriter(packagePath.resolve(symSetDetails.getBaseTypeName() + "EntityType.java")));
            }
            if (symSetDetails.isEntitySubTypePresent()) {
                Template entitySubTypeTemplate = config.getTemplateConfig()
                    .getTemplate("EntitySubType.ftl");
                entitySubTypeTemplate.process(dataModel, newWriter(packagePath.resolve(symSetDetails.getBaseTypeName() + "EntitySubType.java")));
            }
            if (symSetDetails.isCommon()) {
                Template s1ModTemplate = config.getTemplateConfig()
                    .getTemplate("CommonSectorOneModifier.ftl");
                s1ModTemplate.process(dataModel, newWriter(packagePath.resolve("CommonSectorOneModifier.java")));
                Template s2ModTemplate = config.getTemplateConfig()
                    .getTemplate("CommonSectorTwoModifier.ftl");
                s2ModTemplate.process(dataModel, newWriter(packagePath.resolve("CommonSectorTwoModifier.java")));
            } else {
                // Emitted for every symbol set, including the two whose lists are empty. An enum with no
                // constants is valid Java, and having one means a consumer always has a concrete type to
                // name: jmsfx-server's controllers are generic over the modifier types, and where no enum
                // existed they fell back to the interface, which Spring cannot convert a path variable to -
                // so the request failed as a server error rather than a bad one. See #90.
                Template s1ModTemplate = config.getTemplateConfig()
                    .getTemplate("SectorOneModifier.ftl");
                s1ModTemplate.process(dataModel, newWriter(packagePath.resolve(symSetDetails.getBaseTypeName() + "SectorOneModifier.java")));
                Template s2ModTemplate = config.getTemplateConfig()
                    .getTemplate("SectorTwoModifier.ftl");
                s2ModTemplate.process(dataModel, newWriter(packagePath.resolve(symSetDetails.getBaseTypeName() + "SectorTwoModifier.java")));
            }
            if (symSetDetails.isAmplifierGuidesPresent()) {
                Template template = config.getTemplateConfig()
                    .getTemplate("AmplifierGuide.ftl");
                template.process(dataModel, newWriter(packagePath.resolve(symSetDetails.getBaseTypeName() + "AmplifierGuide.java")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to generate symbol set code", e);
        }
    }

    private void generateSymbolSets(LibraryModel dataModel) throws Exception {
        List<SymbolSetModel> values = dataModel.getSymbolSets();
        Collections.sort(values, AbstractModel.getStandardOrder());
        Template template = config.getTemplateConfig()
            .getTemplate("SymbolSetEnum.ftl");
        template.process(dataModel, newWriter(config.getIconPackageDir()
            .resolve("SymbolSetEnum.java")));
        dataModel.getSymbolSets()
            .forEach(symSet -> generateSymbolSet(dataModel, symSet));
    }

}
