package io.github.ctgnz.jmsfx.generator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang3.StringUtils;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.DumperOptions.LineBreak;
import org.yaml.snakeyaml.LoaderOptions;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import static java.util.stream.Collectors.toList;

import freemarker.template.Template;
import io.github.ctgnz.jmsfx.generator.model.AmplifierModel;
import io.github.ctgnz.jmsfx.generator.model.EntityModel;
import io.github.ctgnz.jmsfx.generator.model.EntitySubTypeModel;
import io.github.ctgnz.jmsfx.generator.model.EntityTypeModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierListModel;
import io.github.ctgnz.jmsfx.generator.model.SectorOneModifierModel;
import io.github.ctgnz.jmsfx.generator.model.SectorTwoModifierModel;
import io.github.ctgnz.jmsfx.generator.model.StandardEnumModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;
import io.github.ctgnz.jmsfx.generator.schema.DoubleDigitType;
import io.github.ctgnz.jmsfx.generator.schema.Library;
import io.github.ctgnz.jmsfx.generator.schema.Library.Dimensions.Dimension.SymbolSets.SymbolSetRef;
import io.github.ctgnz.jmsfx.generator.schema.SymbolSet;
import io.github.ctgnz.jmsfx.generator.schema.SymbolSet.Entities.Entity;
import io.github.ctgnz.jmsfx.generator.schema.SymbolSet.Entities.Entity.EntityTypes.EntityType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class DomainModelGenerator {
    private static JAXBContext CTX_LIBRARY;
    private static JAXBContext CTX_SYMBOL_SET;

    public static void main(String[] args) {
        try {
            DomainModelGenerator generator = new DomainModelGenerator(args.length > 0 ? args[0] : "/config.yml");
            generator.generate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private GeneratorConfig config;

    public DomainModelGenerator(String configFile) {
        try (InputStream inputStream = DomainModelGenerator.class.getResourceAsStream(configFile)) {
            ObjectMapper mapper = createObjectMapper();
            config = mapper.readValue(inputStream, GeneratorConfig.class);
            System.out.format("Writing to %s%n", config.getOutputDir());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generate() throws Exception {
        deleteOldSourceFiles();
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("basePackage", config.getBasePackage());
        dataModel.put("iconPackage", config.getIconPackage());
        dataModel.put("typePackage", config.getTypePackage());
        dataModel.put("amplifierPackage", config.getAmplifierPackage());
        dataModel.put("commonPackage", config.getCommonPackage());
        Library library = parseLibraryFile(config.getInputDir().resolve(config.getLibraryFile()));
        dataModel.put("dimensionGraphics", config.getDimensionGraphicLocations());
        config.getStandardEnums().forEach(enumConfig -> generateStandardEnum(dataModel, library, enumConfig));
        generateCommonModifiers(config.getCommonPackageDir(), dataModel, library);
        generateAmplifierEnum(dataModel, library);
        generateListAmplifierEnums(dataModel, library);
        generateSymbolSets(dataModel, library);
    }

    public synchronized JAXBContext getLibraryContext() throws JAXBException {
        if (CTX_LIBRARY == null) {
            CTX_LIBRARY = JAXBContext.newInstance(Library.class);
        }
        return CTX_LIBRARY;
    }

    public synchronized JAXBContext getSymbolSetContext() throws JAXBException {
        if (CTX_SYMBOL_SET == null) {
            CTX_SYMBOL_SET = JAXBContext.newInstance(SymbolSet.class);
        }
        return CTX_SYMBOL_SET;
    }

    private ObjectMapper createObjectMapper() {
        DumperOptions options = new DumperOptions();
        options.setPrettyFlow(false);
        options.setDefaultFlowStyle(FlowStyle.BLOCK);
        options.setCanonical(false);
        options.setWidth(480);
        options.setLineBreak(LineBreak.WIN);
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setCodePointLimit(16 * 1024 * 1024);
        YAMLFactory factory = YAMLFactory.builder()
            .enable(YAMLGenerator.Feature.MINIMIZE_QUOTES)
            .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
            .loaderOptions(loaderOptions)
            .dumperOptions(options).build();
        ObjectMapper mapper = new ObjectMapper(factory);
        mapper.setSerializationInclusion(Include.NON_DEFAULT);
        mapper.registerModule(new JavaTimeModule());
        SimpleModule module = new SimpleModule("basic");
        mapper.registerModule(module);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return mapper;
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

    @SuppressWarnings("unchecked")
    private String findAmplifier(String code, Map<String, Object> dataModel) {
        List<AmplifierModel> amplifiers = (List<AmplifierModel>) dataModel.get("amplifiers");
        return amplifiers.stream().filter(amp -> StringUtils.equals(amp.getId(), code)).findFirst().map(AmplifierModel::getConstantName).orElse(null);
    }

    private void generateAmplifierEnum(Map<String, Object> dataModel, Library library) throws Exception {
        List<AmplifierModel> amplifiers = library.getAmplifiers().getAmplifier().stream().map(AmplifierModel::new).collect(toList());
        dataModel.put("amplifiers", amplifiers);
        Template template = config.getTemplateConfig().getTemplate("AmplifierEnum.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve("AmplifierEnum.java"))));
    }

    @SuppressWarnings("unchecked")
    private void generateCommonModifiers(Path packagePath, Map<String, Object> dataModel, Library library) throws Exception {
        System.out.format("Processing common modifiers%n");
        if (!Files.exists(packagePath)) {
            Files.createDirectories(packagePath);
        }
        SymbolSet symbolSet = new SymbolSet();
        symbolSet.setSymbolSetCode(new DoubleDigitType(12, 0));
        symbolSet.setSectorOneModifiers(library.getCommonModifiers().getSectorOneModifiers());
        symbolSet.setSectorTwoModifiers(library.getCommonModifiers().getSectorTwoModifiers());
        dataModel.remove("sectorOneMods");
        dataModel.remove("sectorTwoMods");
        Template symSetInfoTemplate = config.getTemplateConfig().getTemplate("CommonSymbolSet.ftl");
        symSetInfoTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve("CommonSymbolSet.java"))));
        symbolSet.getSectorOneModifiers().getModifier().forEach(mod -> {
            List<SectorOneModifierModel> values = (List<SectorOneModifierModel>) dataModel.computeIfAbsent("sectorOneMods", key -> new ArrayList<SectorOneModifierModel>());
            values.add(new SectorOneModifierModel(mod));
        });
        symbolSet.getSectorTwoModifiers().getModifier().forEach(mod -> {
            List<SectorTwoModifierModel> values = (List<SectorTwoModifierModel>) dataModel.computeIfAbsent("sectorTwoMods", key -> new ArrayList<SectorTwoModifierModel>());
            values.add(new SectorTwoModifierModel(mod));
        });
        Template s1ModTemplate = config.getTemplateConfig().getTemplate("CommonSectorOneModifier.ftl");
        s1ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve("CommonSectorOneModifier.java"))));
        Template s2ModTemplate = config.getTemplateConfig().getTemplate("CommonSectorTwoModifier.ftl");
        s2ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve("CommonSectorTwoModifier.java"))));
    }

    @SuppressWarnings("unchecked")
    private void generateEntities(Path packagePath, Map<String, Object> dataModel, SymbolSetModel symSetDetails, SymbolSet symbolSet) throws Exception {
        System.out.format("  Adding entities for symbol set %s%n", symbolSet.getLabel());
        dataModel.put("symbolSet", symSetDetails);
        dataModel.remove("entities");
        dataModel.remove("entityTypes");
        dataModel.remove("entitySubTypes");
        dataModel.remove("specialEntitySubTypes");
        dataModel.remove("sectorOneMods");
        dataModel.remove("sectorTwoMods");
        symbolSet.getEntities().getEntity().forEach(entity -> {
            try {
                List<EntityModel> values = (List<EntityModel>) dataModel.computeIfAbsent("entities", key -> new ArrayList<EntityModel>());
                EntityModel entityValue = new EntityModel(entity);
                if (config.getEntitySymbolSets().containsKey(entityValue.getId())) {
                    entityValue.setBaseSymbolSet(config.getEntitySymbolSets().get(entityValue.getId()));
                }
                values.add(entityValue);
                if (entity.getEntityTypes() != null && entity.getEntityTypes().getEntityType() != null) {
                    getEntityTypes(packagePath, dataModel, entity, entityValue, symSetDetails);
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to generate entity types", e);
            }
        });
        getFrameAmplifierClass(dataModel, symSetDetails).ifPresent(amplifierClass -> {
            symSetDetails.setFrameAmplifierPresent(true);
            symSetDetails.setFrameAmplifierClass(amplifierClass);
        });
        String[] amplifierClasses = getAmplifierClasses(dataModel, symSetDetails);
        if (amplifierClasses.length >= 1) {
            symSetDetails.setAmplifierPresent(true);
            symSetDetails.setAmplifierClass(amplifierClasses[0]);
        }
        if (amplifierClasses.length >= 2) {
            symSetDetails.setAmplifierTwoPresent(true);
            symSetDetails.setAmplifierTwoClass(amplifierClasses[1]);
        }
        if (amplifierClasses.length >= 3) {
            symSetDetails.setAmplifierThreePresent(true);
            symSetDetails.setAmplifierThreeClass(amplifierClasses[2]);
        }
        if (symbolSet.getSectorOneModifiers() != null) {
            System.out.format("  Adding sector 1 modifiers for symbol set %s%n", symbolSet.getLabel());
            symSetDetails.setSectorOneModifierPresent(true);
            symbolSet.getSectorOneModifiers().getModifier().forEach(mod -> {
                List<SectorOneModifierModel> values = (List<SectorOneModifierModel>) dataModel.computeIfAbsent("sectorOneMods", key -> new ArrayList<SectorOneModifierModel>());
                values.add(new SectorOneModifierModel(mod));
            });
        }
        if (symbolSet.getSectorTwoModifiers() != null) {
            System.out.format("  Adding sector 2 modifiers for symbol set %s%n", symbolSet.getLabel());
            symSetDetails.setSectorTwoModifierPresent(true);
            symbolSet.getSectorTwoModifiers().getModifier().forEach(mod -> {
                List<SectorTwoModifierModel> values = (List<SectorTwoModifierModel>) dataModel.computeIfAbsent("sectorTwoMods", key -> new ArrayList<SectorTwoModifierModel>());
                values.add(new SectorTwoModifierModel(mod));
            });
        }
        if (config.getUnframedSymbolSets().contains(symSetDetails.getId())) {
            symSetDetails.setUseFrame(false);
        }
        Template symSetInfoTemplate = config.getTemplateConfig().getTemplate("SymbolSetInfo.ftl");
        symSetInfoTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "SymbolSet.java"))));
        Template entityTemplate = config.getTemplateConfig().getTemplate("Entity.ftl");
        entityTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "Entity.java"))));
        if (dataModel.containsKey("entityTypes")) {
            Template entityTypeTemplate = config.getTemplateConfig().getTemplate("EntityType.ftl");
            entityTypeTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "EntityType.java"))));
        }
        if (dataModel.containsKey("entitySubTypes")) {
            Template entitySubTypeTemplate = config.getTemplateConfig().getTemplate("EntitySubType.ftl");
            entitySubTypeTemplate.process(dataModel,
                                          new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "EntitySubType.java"))));
        }
        if (dataModel.containsKey("specialEntitySubTypes")) {
            Template entitySubTypeTemplate = config.getTemplateConfig().getTemplate("SpecialEntitySubType.ftl");
            entitySubTypeTemplate.process(dataModel,
                                          new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "SpecialEntitySubType.java"))));
        }
        if (dataModel.containsKey("sectorOneMods")) {
            Template s1ModTemplate = config.getTemplateConfig().getTemplate("SectorOneModifier.ftl");
            s1ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "SectorOneModifier.java"))));
        }
        if (dataModel.containsKey("sectorTwoMods")) {
            Template s2ModTemplate = config.getTemplateConfig().getTemplate("SectorTwoModifier.ftl");
            s2ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "SectorTwoModifier.java"))));
        }
        if (symSetDetails.isAmplifierGuidesPresent()) {
            Template template = config.getTemplateConfig().getTemplate("AmplifierGuide.ftl");
            template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "AmplifierGuide.java"))));
        }
    }

    @SuppressWarnings("unchecked")
    private void generateListAmplifierEnums(Map<String, Object> dataModel, Library library) throws Exception {
        List<StandardAmplifierConfig> amplifierTypeConfigs = config.getStandardAmplifiers();
        List<AmplifierModel> amplifiers = (List<AmplifierModel>) dataModel.get("amplifiers");
        List<AmplifierListModel> amplifierGroups = (List<AmplifierListModel>) dataModel.computeIfAbsent("amplifierGroups", key -> new ArrayList<AmplifierListModel>());
        library.getAmplifierGroups().getAmplifierGroup().forEach(group -> {
            StandardAmplifierConfig groupConfig = amplifierTypeConfigs.stream().filter(config -> config.isForGroup(group.getName())).findAny().orElse(null);
            if (groupConfig != null) {
                AmplifierListModel amplifierType = (AmplifierListModel) dataModel.computeIfAbsent(groupConfig.getEnumType(), type -> {
                    AmplifierListModel amplifierTypeEnum = new AmplifierListModel(groupConfig, group);
                    amplifierGroups.add(amplifierTypeEnum);
                    return amplifierTypeEnum;
                });
                group.getAmplifiers().getAmplifier().forEach(amplifier -> amplifierType.addAmplifier(group, amplifier));
            }
        });
        library.getAmplifiers().getAmplifier().forEach(amplifier -> {
            AmplifierModel amplifierEnum = amplifiers.stream().filter(amp -> StringUtils.equals(amp.getId(), amplifier.getID())).findFirst().orElse(null);
            if (!amplifier.getValues().isEmpty()) {
                List<ListAmplifierConfig> valueConfigs = config.getAmplifierValues(amplifier);
                amplifier.getValues().forEach(value -> {
                    ListAmplifierConfig valueConfig = valueConfigs.stream().filter(config -> StringUtils.equals(value.getID(), config.getValuesId())).findFirst().orElse(null);
                    if (valueConfig != null) {
                        AmplifierListModel amplifierType = (AmplifierListModel) dataModel.computeIfAbsent(valueConfig.getEnumType(), type -> {
                            AmplifierListModel amplifierTypeEnum = new AmplifierListModel(valueConfig, value);
                            amplifierTypeEnum.setAmplifierId(amplifierEnum.getConstantName());
                            amplifierGroups.add(amplifierTypeEnum);
                            return amplifierTypeEnum;
                        });
                        value.getValue().forEach(amplifierType::addAmplifier);
                        StandardAmplifierConfig agc = new StandardAmplifierConfig();
                        agc.setStandard(false);
                        agc.setEnumId(valueConfig.getEnumId());
                        agc.setEnumType(valueConfig.getEnumType());
                        agc.setEnumDesc(valueConfig.getEnumDesc());
                        amplifierTypeConfigs.add(agc);
                    }
                });
            }
            if (StringUtils.isNotBlank(amplifier.getAmplifierGroup())) {
                AmplifierListModel typeEnum = amplifierGroups.stream().filter(type -> StringUtils.equals(type.getId(), amplifier.getAmplifierGroup())).findFirst().orElse(null);
                typeEnum.setAmplifierId(amplifierEnum.getConstantName());
            }
        });
        Template template = config.getTemplateConfig().getTemplate("AmplifierListEnum.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve("AmplifierListEnum.java"))));
        Template amplifierTemplate = config.getTemplateConfig().getTemplate("AmplifierListItem.ftl");
        Path amplifierPath = config.getAmplifierPackageDir();
        if (!Files.exists(amplifierPath)) {
            Files.createDirectories(amplifierPath);
        }
        amplifierTypeConfigs.forEach(group -> {
            try {
                AmplifierListModel enumType = (AmplifierListModel) dataModel.get(group.getEnumType());
                System.out.format("Processing amplifier enum %s%n", enumType.getTypeName());
                dataModel.put("amplifier", enumType);
                amplifierTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(amplifierPath.resolve(enumType.getTypeName() + ".java"))));
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to create amplifier group enum", e);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private <E extends StandardEnumModel, V> void generateStandardEnum(Map<String, Object> dataModel, Library library, StandardEnumConfig<E, V> enumConfig) {
        try {
            System.out.format("Processing standard enum %s%n", enumConfig.getTypeName());
            enumConfig.getValues(library).forEach(value -> {
                List<E> values = (List<E>) dataModel.computeIfAbsent(enumConfig.getTemplateParameterName(), key -> new ArrayList<E>());
                values.add(enumConfig.createEnumModel(value));
            });
            List<E> values = (List<E>) dataModel.get(enumConfig.getTemplateParameterName());
            Collections.sort(values, StandardEnumModel.getStandardOrder());
            Template template = config.getTemplateConfig().getTemplate(enumConfig.getTypeName() + ".ftl");
            template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve(enumConfig.getTypeName() + ".java"))));
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to create enum", e);
        }
    }

    private void generateSymbolSet(Map<String, Object> dataModel, SymbolSetModel symSetDetails) {
        try {
            String packageName = symSetDetails.getPackageName();
            Path packagePath = config.getIconPackageDir().resolve(packageName);
            if (!Files.exists(packagePath)) {
                Files.createDirectories(packagePath);
            }
            SymbolSet symbolSet = parseSymbolSet(config.getInputDir().resolve(symSetDetails.getFileName()));
            List<AmplifierGuideConfig> amplifierGuides = symbolSet.getAmplifiers().getAmplifierRef().stream().map(AmplifierGuideConfig::new).toList();
            amplifierGuides.forEach(guide -> guide.setAmplifier(findAmplifier(guide.getCode(), dataModel)));
            symSetDetails.getAmplifierGuides().addAll(amplifierGuides);
            System.out.format("Processing symbol set %s%n", symbolSet.getLabel());
            generateEntities(packagePath, dataModel, symSetDetails, symbolSet);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Unable to generate symbol set code", e);
        }
    }

    @SuppressWarnings("unchecked")
    private void generateSymbolSets(Map<String, Object> dataModel, Library library) throws Exception {
        Map<String, String> symbolGraphicLocations = config.getSymbolGraphicLocations();
        library.getDimensions().getDimension().forEach(dim -> {
            List<SymbolSetRef> symbolSetRef = dim.getSymbolSets().getSymbolSetRef();
            symbolSetRef.forEach(symSet -> {
                List<SymbolSetModel> values = (List<SymbolSetModel>) dataModel.computeIfAbsent("symbolSets", key -> new ArrayList<SymbolSetModel>());
                if (values.stream().noneMatch(sym -> sym.getId().equals(symSet.getID()))) {
                    SymbolSetModel symSetEnum = new SymbolSetModel(dim, symSet, symbolGraphicLocations.get(symSet.getID()));
                    values.add(symSetEnum);
                    generateSymbolSet(dataModel, symSetEnum);
                }
            });
        });
        List<SymbolSetModel> values = (List<SymbolSetModel>) dataModel.get("symbolSets");
        Collections.sort(values, StandardEnumModel.getStandardOrder());
        Template template = config.getTemplateConfig().getTemplate("SymbolSetEnum.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getIconPackageDir().resolve("SymbolSetEnum.java"))));
    }

    @SuppressWarnings("unchecked")
    private String[] getAmplifierClasses(Map<String, Object> dataModel, SymbolSetModel symSetDetails) {
        List<AmplifierListModel> enumAmplifiers = (List<AmplifierListModel>) dataModel.get("amplifierGroups");
        return enumAmplifiers.stream()
            .filter(amplifier -> !amplifier.isFrameAmplifier())
            .filter(amplifier -> amplifier.isFor(symSetDetails.getId()))
            .map(AmplifierListModel::getTypeName)
            .toArray(size -> new String[size]);
    }

    @SuppressWarnings("unchecked")
    private void getEntitySubTypes(Path packagePath, Map<String, Object> dataModel, EntityTypeModel entityTypeValue, EntityType entityType, SymbolSetModel symSetDetails) throws Exception {
        System.out.format("      Adding entity sub-types for entity type %s%n", entityTypeValue.getLabel());
        symSetDetails.setEntitySubTypePresent(true);
        dataModel.put("entityType", entityTypeValue);
        entityType.getEntitySubTypes().getEntitySubType().forEach(entitySubType -> {
            List<EntitySubTypeModel> values = (List<EntitySubTypeModel>) dataModel.computeIfAbsent("entitySubTypes", key -> new ArrayList<EntitySubTypeModel>());
            EntitySubTypeModel entitySubTypeValue = new EntitySubTypeModel(entityType, entitySubType);
            values.add(entitySubTypeValue);
        });
    }

    @SuppressWarnings("unchecked")
    private void getEntityTypes(Path packagePath, Map<String, Object> dataModel, Entity entity, EntityModel entityValue, SymbolSetModel symSetDetails) throws Exception {
        System.out.format("    Adding entity types for entity %s%n", entityValue.getLabel());
        symSetDetails.setEntityTypePresent(true);
        dataModel.put("entity", entityValue);
        entity.getEntityTypes().getEntityType().forEach(entityType -> {
            try {
                List<EntityTypeModel> values = (List<EntityTypeModel>) dataModel.computeIfAbsent("entityTypes", key -> new ArrayList<EntityTypeModel>());
                EntityTypeModel entityTypeValue = new EntityTypeModel(entity, entityType);
                values.add(entityTypeValue);
                if (entityType.getEntitySubTypes() != null && entityType.getEntitySubTypes().getEntitySubType() != null) {
                    getEntitySubTypes(packagePath, dataModel, entityTypeValue, entityType, symSetDetails);
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to generate entity sub types", e);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private Optional<String> getFrameAmplifierClass(Map<String, Object> dataModel, SymbolSetModel symSetDetails) {
        List<AmplifierListModel> enumAmplifiers = (List<AmplifierListModel>) dataModel.get("amplifierGroups");
        return enumAmplifiers.stream()
            .filter(AmplifierListModel::isFrameAmplifier)
            .filter(amplifier -> amplifier.isFor(symSetDetails.getId()))
            .map(AmplifierListModel::getTypeName)
            .findFirst();
    }

    private Library parseLibraryFile(Path filePath) throws JAXBException, IOException {
        Unmarshaller u = getLibraryContext().createUnmarshaller();
        return u.unmarshal(new StreamSource(Files.newInputStream(filePath)), Library.class).getValue();
    }

    private SymbolSet parseSymbolSet(Path filePath) throws JAXBException, IOException {
        Unmarshaller u = getSymbolSetContext().createUnmarshaller();
        return u.unmarshal(new StreamSource(Files.newInputStream(filePath)), SymbolSet.class).getValue();
    }
}
