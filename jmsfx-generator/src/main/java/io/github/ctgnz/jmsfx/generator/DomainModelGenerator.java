package io.github.ctgnz.jmsfx.generator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
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
import jakarta.xml.bind.JAXBException;

public class DomainModelGenerator {

    public static void main(String[] args) {
        try {
            DomainModelGenerator generator = new DomainModelGenerator(args.length > 0 ? args[0] : "/config.yml");
            LibraryModel dataModel = generator.parse();
            generator.generate(dataModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private GeneratorConfig config;
    private JmsfxParser parser;

    public DomainModelGenerator(String configFile) {
        this.parser = new JmsfxParser();
        try (InputStream inputStream = DomainModelGenerator.class.getResourceAsStream(configFile)) {
            config = parser.readConfig(inputStream);
            System.out.format("Writing to %s%n", config.getOutputDir());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generate(LibraryModel dataModel) throws Exception {
        deleteOldSourceFiles();
        config.getStandardEnums().forEach(enumConfig -> generateStandardEnum(dataModel, enumConfig));
        generateAmplifierEnum(dataModel);
        generateListAmplifierEnums(dataModel);
        generateSymbolSets(dataModel);
        generateLibrary(dataModel);
    }

    public LibraryModel parse() throws JAXBException, IOException, Exception {
        return parser.readLibraryModel(Files.newInputStream(config.getModelFile()));
    }

    private void deleteOldSourceFiles() throws IOException {
        Path outputDir = config.getOutputDir();
        Files.list(outputDir).findFirst().ifPresent(packageRoot -> {
            try {
                Files.walk(packageRoot).map(Path::toFile).sorted(Comparator.reverseOrder()).forEach(File::delete);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void generateAmplifierEnum(LibraryModel dataModel) throws Exception {
        Template template = config.getTemplateConfig().getTemplate("AmplifierEnum.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve("AmplifierEnum.java"))));
    }

    private void generateLibrary(LibraryModel dataModel) throws Exception {
        Template template = config.getTemplateConfig().getTemplate("IconLibrary.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve(dataModel.getLibraryPrefix() + "IconLibrary.java"))));
    }

    private void generateListAmplifierEnums(LibraryModel dataModel) throws Exception {
        Template template = config.getTemplateConfig().getTemplate("AmplifierListEnum.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve("AmplifierListEnum.java"))));
        Template amplifierTemplate = config.getTemplateConfig().getTemplate("AmplifierListItem.ftl");
        Path amplifierPath = config.getAmplifierPackageDir();
        if (!Files.exists(amplifierPath)) {
            Files.createDirectories(amplifierPath);
        }
        dataModel.getAmplifierGroups().forEach(enumType -> {
            try {
                System.out.format("Processing amplifier enum %s%n", enumType.getTypeName());
                dataModel.setAmplifier(enumType);
                amplifierTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(amplifierPath.resolve(enumType.getTypeName() + ".java"))));
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to create amplifier group enum", e);
            }
        });
    }

    private void generateStandardEnum(LibraryModel dataModel, String typeName) {
        try {
            System.out.format("Processing standard enum %s%n", typeName);
            Template template = config.getTemplateConfig().getTemplate(typeName + ".ftl");
            template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve(typeName + ".java"))));
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to create enum", e);
        }
    }

    private void generateSymbolSet(LibraryModel dataModel, SymbolSetModel symSetDetails) {
        try {
            String packageName = symSetDetails.getPackageName();
            Path packagePath = config.getIconPackageDir().resolve(packageName);
            if (!Files.exists(packagePath)) {
                Files.createDirectories(packagePath);
            }
            System.out.format("  Adding entities for symbol set %s%n", symSetDetails.getLabel());
            dataModel.setSymbolSet(symSetDetails);
            Template symSetInfoTemplate = config.getTemplateConfig().getTemplate("SymbolSetInfo.ftl");
            symSetInfoTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "SymbolSet.java"))));
            Template entityTemplate = config.getTemplateConfig().getTemplate("Entity.ftl");
            entityTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "Entity.java"))));
            if (symSetDetails.isEntityTypePresent()) {
                Template entityTypeTemplate = config.getTemplateConfig().getTemplate("EntityType.ftl");
                entityTypeTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "EntityType.java"))));
            }
            if (symSetDetails.isEntitySubTypePresent()) {
                Template entitySubTypeTemplate = config.getTemplateConfig().getTemplate("EntitySubType.ftl");
                entitySubTypeTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "EntitySubType.java"))));
            }
            if (symSetDetails.isCommon()) {
                Template s1ModTemplate = config.getTemplateConfig().getTemplate("CommonSectorOneModifier.ftl");
                s1ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve("CommonSectorOneModifier.java"))));
                Template s2ModTemplate = config.getTemplateConfig().getTemplate("CommonSectorTwoModifier.ftl");
                s2ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve("CommonSectorTwoModifier.java"))));
            } else {
                if (!symSetDetails.getSectorOneMods().isEmpty()) {
                    Template s1ModTemplate = config.getTemplateConfig().getTemplate("SectorOneModifier.ftl");
                    s1ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "SectorOneModifier.java"))));
                }
                if (!symSetDetails.getSectorTwoMods().isEmpty()) {
                    Template s2ModTemplate = config.getTemplateConfig().getTemplate("SectorTwoModifier.ftl");
                    s2ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "SectorTwoModifier.java"))));
                }
            }
            if (symSetDetails.isAmplifierGuidesPresent()) {
                Template template = config.getTemplateConfig().getTemplate("AmplifierGuide.ftl");
                template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "AmplifierGuide.java"))));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to generate symbol set code", e);
        }
    }

    private void generateSymbolSets(LibraryModel dataModel) throws Exception {
        List<SymbolSetModel> values = dataModel.getSymbolSets();
        Collections.sort(values, AbstractModel.getStandardOrder());
        Template template = config.getTemplateConfig().getTemplate("SymbolSetEnum.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve("SymbolSetEnum.java"))));
        dataModel.getSymbolSets().forEach(symSet -> generateSymbolSet(dataModel, symSet));
    }

}
