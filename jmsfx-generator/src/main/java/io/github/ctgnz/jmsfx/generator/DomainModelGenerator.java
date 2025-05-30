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
import io.github.ctgnz.jmsfx.generator.model.AmplifierEnum;
import io.github.ctgnz.jmsfx.generator.model.EntityEnum;
import io.github.ctgnz.jmsfx.generator.model.EntitySubTypeEnum;
import io.github.ctgnz.jmsfx.generator.model.EntityTypeEnum;
import io.github.ctgnz.jmsfx.generator.model.EnumeratedAmplifierTypeEnum;
import io.github.ctgnz.jmsfx.generator.model.SectorOneModEnum;
import io.github.ctgnz.jmsfx.generator.model.SectorTwoModEnum;
import io.github.ctgnz.jmsfx.generator.model.StandardEnum;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetEnum;
import io.github.ctgnz.jmsfx.generator.schema.AmplifierType;
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
        Library library = parseLibraryFile(config.getInputDir().resolve(config.getLibraryFile()));
        dataModel.put("dimensionGraphics", config.getDimensionGraphicLocations());
        config.getStandardEnums().forEach(enumConfig -> generateStandardEnum(dataModel, library, enumConfig));
        generateCommonModifiers(config.getBasePackageDir().resolve("common"), dataModel, library);
        generateAmplifierEnum(dataModel, library);
        generateEnumeratedAmplifierEnums(dataModel, library);
        generateSymbolSets(dataModel, library);
        generateSimpleTypes(dataModel);
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
        List<AmplifierEnum> amplifiers = (List<AmplifierEnum>) dataModel.get("amplifiers");
        return amplifiers.stream().filter(amp -> StringUtils.equals(amp.getId(), code)).findFirst().map(AmplifierEnum::getConstantName).orElse(null);
    }

    private void generateAmplifierEnum(Map<String, Object> dataModel, Library library) throws Exception {
        Template typeTemplate = config.getTemplateConfig().getTemplate("AmplifierType.ftl");
        dataModel.put("amplifierTypes", AmplifierType.values());
        typeTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve("AmplifierType.java"))));
        List<AmplifierEnum> amplifiers = library.getAmplifiers().getAmplifier().stream().map(AmplifierEnum::new).collect(toList());
        dataModel.put("amplifiers", amplifiers);
        Template template = config.getTemplateConfig().getTemplate("Amplifier.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve("Amplifier.java"))));
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
        Template symSetInfoTemplate = config.getTemplateConfig().getTemplate("CommonSymbolSetInfo.ftl");
        symSetInfoTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve("CommonSymbolSetInfo.java"))));
        symbolSet.getSectorOneModifiers().getModifier().forEach(mod -> {
            List<SectorOneModEnum> values = (List<SectorOneModEnum>) dataModel.computeIfAbsent("sectorOneMods", key -> new ArrayList<SectorOneModEnum>());
            values.add(new SectorOneModEnum(mod));
        });
        symbolSet.getSectorTwoModifiers().getModifier().forEach(mod -> {
            List<SectorTwoModEnum> values = (List<SectorTwoModEnum>) dataModel.computeIfAbsent("sectorTwoMods", key -> new ArrayList<SectorTwoModEnum>());
            values.add(new SectorTwoModEnum(mod));
        });
        Template s1ModTemplate = config.getTemplateConfig().getTemplate("CommonSectorOneModifier.ftl");
        s1ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve("CommonSectorOneModifier.java"))));
        Template s2ModTemplate = config.getTemplateConfig().getTemplate("CommonSectorTwoModifier.ftl");
        s2ModTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve("CommonSectorTwoModifier.java"))));
    }

    @SuppressWarnings("unchecked")
    private void generateEntities(Path packagePath, Map<String, Object> dataModel, SymbolSetEnum symSetDetails, SymbolSet symbolSet) throws Exception {
        System.out.format("Processing entities for symbol set %s%n", symbolSet.getLabel());
        dataModel.put("symbolSet", symSetDetails);
        dataModel.remove("entities");
        dataModel.remove("entityTypes");
        dataModel.remove("entitySubTypes");
        dataModel.remove("specialEntitySubTypes");
        dataModel.remove("sectorOneMods");
        dataModel.remove("sectorTwoMods");
        symbolSet.getEntities().getEntity().forEach(entity -> {
            try {
                List<EntityEnum> values = (List<EntityEnum>) dataModel.computeIfAbsent("entities", key -> new ArrayList<EntityEnum>());
                EntityEnum entityValue = new EntityEnum(entity);
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
            symSetDetails.setSectorOneModifierPresent(true);
            symbolSet.getSectorOneModifiers().getModifier().forEach(mod -> {
                List<SectorOneModEnum> values = (List<SectorOneModEnum>) dataModel.computeIfAbsent("sectorOneMods", key -> new ArrayList<SectorOneModEnum>());
                values.add(new SectorOneModEnum(mod));
            });
        }
        if (symbolSet.getSectorTwoModifiers() != null) {
            symSetDetails.setSectorTwoModifierPresent(true);
            symbolSet.getSectorTwoModifiers().getModifier().forEach(mod -> {
                List<SectorTwoModEnum> values = (List<SectorTwoModEnum>) dataModel.computeIfAbsent("sectorTwoMods", key -> new ArrayList<SectorTwoModEnum>());
                values.add(new SectorTwoModEnum(mod));
            });
        }
        Template symSetInfoTemplate = config.getTemplateConfig().getTemplate("SymbolSetInfo.ftl");
        symSetInfoTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(packagePath.resolve(symSetDetails.getBaseTypeName() + "SymbolSetInfo.java"))));
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
    }

    @SuppressWarnings("unchecked")
    private void generateEnumeratedAmplifierEnums(Map<String, Object> dataModel, Library library) throws Exception {
        List<StandardAmplifierConfig> amplifierGroups = config.getStandardAmplifiers();
        List<EnumeratedAmplifierTypeEnum> amplifierGroupTypes = (List<EnumeratedAmplifierTypeEnum>) dataModel.computeIfAbsent("enumAmplifierTypes", key -> new ArrayList<EnumeratedAmplifierTypeEnum>());
        library.getAmplifierGroups().getAmplifierGroup().forEach(group -> {
            StandardAmplifierConfig groupConfig = amplifierGroups.stream().filter(config -> config.isForGroup(group.getName())).findAny().orElse(null);
            if (groupConfig != null) {
                EnumeratedAmplifierTypeEnum amplifierType = (EnumeratedAmplifierTypeEnum) dataModel.computeIfAbsent(groupConfig.getEnumType(), type -> {
                    EnumeratedAmplifierTypeEnum amplifierGroupType = new EnumeratedAmplifierTypeEnum(groupConfig, group);
                    amplifierGroupTypes.add(amplifierGroupType);
                    return amplifierGroupType;
                });
                group.getAmplifiers().getAmplifier().forEach(amplifier -> amplifierType.addAmplifier(group, amplifier));
            }
        });
        library.getAmplifiers().getAmplifier().forEach(amplifier -> {
            if (!amplifier.getValues().isEmpty()) {
                List<EnumeratedAmplifierConfig> valueConfigs = config.getAmplifierValues(amplifier);
                amplifier.getValues().forEach(value -> {
                    EnumeratedAmplifierConfig valueConfig = valueConfigs.stream().filter(config -> StringUtils.equals(value.getID(), config.getValuesId())).findFirst().orElse(null);
                    if (valueConfig != null) {
                        EnumeratedAmplifierTypeEnum amplifierType = (EnumeratedAmplifierTypeEnum) dataModel.computeIfAbsent(valueConfig.getEnumType(), type -> {
                            EnumeratedAmplifierTypeEnum amplifierGroupType = new EnumeratedAmplifierTypeEnum(valueConfig, value);
                            amplifierGroupTypes.add(amplifierGroupType);
                            return amplifierGroupType;
                        });
                        value.getValue().forEach(amplifierType::addAmplifier);
                        StandardAmplifierConfig agc = new StandardAmplifierConfig();
                        agc.setStandard(false);
                        agc.setEnumId(valueConfig.getEnumId());
                        agc.setEnumType(valueConfig.getEnumType());
                        agc.setEnumDesc(valueConfig.getEnumDesc());
                        amplifierGroups.add(agc);
                    }
                });
            }
        });
        Template template = config.getTemplateConfig().getTemplate("EnumeratedAmplifierType.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve("EnumeratedAmplifierType.java"))));
        Template amplifierTemplate = config.getTemplateConfig().getTemplate("EnumeratedAmplifier.ftl");
        Path amplifierPath = config.getBasePackageDir().resolve("amplifier");
        if (!Files.exists(amplifierPath)) {
            Files.createDirectories(amplifierPath);
        }
        amplifierGroups.forEach(group -> {
            try {
                EnumeratedAmplifierTypeEnum enumType = (EnumeratedAmplifierTypeEnum) dataModel.get(group.getEnumType());
                System.out.format("Processing amplifier enum %s%n", enumType.getTypeName());
                dataModel.put("amplifier", enumType);
                amplifierTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(amplifierPath.resolve(enumType.getTypeName() + ".java"))));
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to create amplifier group enum", e);
            }
        });
    }

    private void generateSimpleTypes(Map<String, Object> dataModel) {
        Map<String, String> simpleTypes = config.getSimpleTypes();
        simpleTypes.keySet().forEach(key -> {
            try {
                Template template = config.getTemplateConfig().getTemplate(key + ".ftl");
                dataModel.put("config", config);
                template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve(simpleTypes.get(key) + ".java"))));
            } catch (Exception e) {
                e.printStackTrace();
                throw new IllegalArgumentException("Unable to generate simple types", e);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private <E extends StandardEnum, V> void generateStandardEnum(Map<String, Object> dataModel, Library library, StandardEnumConfig<E, V> enumConfig) {
        try {
            System.out.format("Processing standard enum %s%n", enumConfig.getTypeName());
            enumConfig.getValues(library).forEach(value -> {
                List<E> values = (List<E>) dataModel.computeIfAbsent(enumConfig.getTemplateParameterName(), key -> new ArrayList<E>());
                values.add(enumConfig.createEnumModel(value));
            });
            List<E> values = (List<E>) dataModel.get(enumConfig.getTemplateParameterName());
            Collections.sort(values, StandardEnum.getStandardOrder());
            Template template = config.getTemplateConfig().getTemplate(enumConfig.getTypeName() + ".ftl");
            template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve(enumConfig.getTypeName() + ".java"))));
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to create enum", e);
        }
    }

    private void generateSymbolSet(Map<String, Object> dataModel, SymbolSetEnum symSetDetails) {
        try {
            String packageName = symSetDetails.getPackageName();
            Path packagePath = config.getBasePackageDir().resolve(packageName);
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
                List<SymbolSetEnum> values = (List<SymbolSetEnum>) dataModel.computeIfAbsent("symbolSets", key -> new ArrayList<SymbolSetEnum>());
                if (values.stream().noneMatch(sym -> sym.getId().equals(symSet.getID()))) {
                    SymbolSetEnum symSetEnum = new SymbolSetEnum(dim, symSet, symbolGraphicLocations.get(symSet.getID()));
                    values.add(symSetEnum);
                    generateSymbolSet(dataModel, symSetEnum);
                }
            });
        });
        List<SymbolSetEnum> values = (List<SymbolSetEnum>) dataModel.get("symbolSets");
        Collections.sort(values, StandardEnum.getStandardOrder());
        Template template = config.getTemplateConfig().getTemplate("SymbolSet.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve("SymbolSet.java"))));
    }

    @SuppressWarnings("unchecked")
    private String[] getAmplifierClasses(Map<String, Object> dataModel, SymbolSetEnum symSetDetails) {
        List<EnumeratedAmplifierTypeEnum> enumAmplifiers = (List<EnumeratedAmplifierTypeEnum>) dataModel.get("enumAmplifierTypes");
        return enumAmplifiers.stream()
            .filter(amplifier -> !amplifier.isFrameAmplifier())
            .filter(amplifier -> amplifier.isFor(symSetDetails.getId()))
            .map(EnumeratedAmplifierTypeEnum::getTypeName)
            .toArray(size -> new String[size]);
    }

    @SuppressWarnings("unchecked")
    private void getEntitySubTypes(Path packagePath, Map<String, Object> dataModel, EntityTypeEnum entityTypeValue, EntityType entityType, SymbolSetEnum symSetDetails) throws Exception {
        System.out.format("Finding entity sub-types for entity type %s%n", entityTypeValue.getLabel());
        symSetDetails.setEntitySubTypePresent(true);
        dataModel.put("entityType", entityTypeValue);
        entityType.getEntitySubTypes().getEntitySubType().forEach(entitySubType -> {
            List<EntitySubTypeEnum> values = (List<EntitySubTypeEnum>) dataModel.computeIfAbsent("entitySubTypes", key -> new ArrayList<EntitySubTypeEnum>());
            EntitySubTypeEnum entitySubTypeValue = new EntitySubTypeEnum(entityType, entitySubType);
            values.add(entitySubTypeValue);
        });
    }

    @SuppressWarnings("unchecked")
    private void getEntityTypes(Path packagePath, Map<String, Object> dataModel, Entity entity, EntityEnum entityValue, SymbolSetEnum symSetDetails) throws Exception {
        System.out.format("Finding entity types for entity %s%n", entityValue.getLabel());
        symSetDetails.setEntityTypePresent(true);
        dataModel.put("entity", entityValue);
        entity.getEntityTypes().getEntityType().forEach(entityType -> {
            try {
                List<EntityTypeEnum> values = (List<EntityTypeEnum>) dataModel.computeIfAbsent("entityTypes", key -> new ArrayList<EntityTypeEnum>());
                EntityTypeEnum entityTypeValue = new EntityTypeEnum(entity, entityType);
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
    private Optional<String> getFrameAmplifierClass(Map<String, Object> dataModel, SymbolSetEnum symSetDetails) {
        List<EnumeratedAmplifierTypeEnum> enumAmplifiers = (List<EnumeratedAmplifierTypeEnum>) dataModel.get("enumAmplifierTypes");
        return enumAmplifiers.stream()
            .filter(EnumeratedAmplifierTypeEnum::isFrameAmplifier)
            .filter(amplifier -> amplifier.isFor(symSetDetails.getId()))
            .map(EnumeratedAmplifierTypeEnum::getTypeName)
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
