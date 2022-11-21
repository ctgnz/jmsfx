package nz.co.ctg.jmsfx.generator;

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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

import nz.co.ctg.jmsfx.generator.model.AmplifierEnum;
import nz.co.ctg.jmsfx.generator.model.AmplifierGroupTypeEnum;
import nz.co.ctg.jmsfx.generator.model.EntityEnum;
import nz.co.ctg.jmsfx.generator.model.EntitySubTypeEnum;
import nz.co.ctg.jmsfx.generator.model.EntityTypeEnum;
import nz.co.ctg.jmsfx.generator.model.SectorOneModEnum;
import nz.co.ctg.jmsfx.generator.model.SectorTwoModEnum;
import nz.co.ctg.jmsfx.generator.model.SpecialEntitySubTypeEnum;
import nz.co.ctg.jmsfx.generator.model.StandardEnum;
import nz.co.ctg.jmsfx.generator.model.SymbolSetEnum;
import nz.co.ctg.jmsfx.generator.schema.Library;
import nz.co.ctg.jmsfx.generator.schema.Library.Dimensions.Dimension.SymbolSets.SymbolSetRef;
import nz.co.ctg.jmsfx.generator.schema.SymbolSet;
import nz.co.ctg.jmsfx.generator.schema.SymbolSet.Entities.Entity;
import nz.co.ctg.jmsfx.generator.schema.SymbolSet.Entities.Entity.EntityTypes.EntityType;

import static java.util.stream.Collectors.toList;

import freemarker.template.Template;

public class DomainModelGenerator {
    private static JAXBContext CTX_LIBRARY;

    private static JAXBContext CTX_SYMBOL_SET;
    public static void main(String[] args) {
        try {
            DomainModelGenerator generator = new DomainModelGenerator();
            generator.generate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private GeneratorConfig config;

    public DomainModelGenerator() {
        try (InputStream inputStream = DomainModelGenerator.class.getResourceAsStream("/config.json")) {
            ObjectMapper mapper = new ObjectMapper(new JsonFactory());
            config = mapper.readValue(inputStream, GeneratorConfig.class);
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
        generateAmplifierEnum(dataModel, library);
        generateAmplifierGroupEnums(dataModel, library);
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

    private void generateAmplifierEnum(Map<String, Object> dataModel, Library library) throws Exception {
        List<AmplifierEnum> amplifiers = library.getAmplifiers().getAmplifier().stream().map(AmplifierEnum::new).collect(toList());
        dataModel.put("amplifiers", amplifiers);
        Template template = config.getTemplateConfig().getTemplate("Amplifier.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve("Amplifier.java"))));
    }

    @SuppressWarnings("unchecked")
    private void generateAmplifierGroupEnums(Map<String, Object> dataModel, Library library) throws Exception {
        List<AmplifierGroupConfig> amplifierGroups = config.getAmplifierGroups();
        List<AmplifierGroupTypeEnum> amplifierGroupValues = (List<AmplifierGroupTypeEnum>) dataModel.computeIfAbsent("amplifierGroups", key -> new ArrayList<AmplifierGroupTypeEnum>());
        library.getAmplifierGroups().getAmplifierGroup().forEach(group -> {
            AmplifierGroupConfig groupConfig = amplifierGroups.stream().filter(config -> config.isForGroup(group.getName())).findAny().orElse(null);
            if (groupConfig != null) {
                AmplifierGroupTypeEnum amplifierType = (AmplifierGroupTypeEnum) dataModel.computeIfAbsent(groupConfig.getEnumType(), type -> {
                    AmplifierGroupTypeEnum amplifierGroupType = new AmplifierGroupTypeEnum(groupConfig, group);
                    amplifierGroupValues.add(amplifierGroupType);
                    return amplifierGroupType;
                });
                group.getAmplifiers().getAmplifier().forEach(amplifier -> amplifierType.addAmplifier(group, amplifier));
            }
        });
        Template template = config.getTemplateConfig().getTemplate("AmplifierGroupType.ftl");
        template.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve("AmplifierGroupType.java"))));
        Template amplifierTemplate = config.getTemplateConfig().getTemplate("AmplifierGroup.ftl");
        amplifierGroups.forEach(group -> {
            try {
                AmplifierGroupTypeEnum enumType = (AmplifierGroupTypeEnum) dataModel.get(group.getEnumType());
                System.out.format("Processing amplifier enum %s%n", enumType.getTypeName());
                dataModel.put("amplifier", enumType);
                amplifierTemplate.process(dataModel, new OutputStreamWriter(Files.newOutputStream(config.getBasePackageDir().resolve(enumType.getTypeName() + ".java"))));
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to create amplifier group enum", e);
            }
        });
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
        if (symbolSet.getSpecialEntitySubTypes() != null) {
            symSetDetails.setSpecialEntitySubTypePresent(true);
            symbolSet.getSpecialEntitySubTypes().getEntitySubType().forEach(subType -> {
                List<SpecialEntitySubTypeEnum> values = (List<SpecialEntitySubTypeEnum>) dataModel.computeIfAbsent("specialEntitySubTypes", key -> new ArrayList<SpecialEntitySubTypeEnum>());
                values.add(new SpecialEntitySubTypeEnum(subType));
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
        Map<String, List<AmplifierGuideConfig>> amplifierGuides = config.getAmplifierGuides();
        library.getDimensions().getDimension().forEach(dim -> {
            List<SymbolSetRef> symbolSetRef = dim.getSymbolSets().getSymbolSetRef();
            symbolSetRef.forEach(symSet -> {
                List<SymbolSetEnum> values = (List<SymbolSetEnum>) dataModel.computeIfAbsent("symbolSets", key -> new ArrayList<SymbolSetEnum>());
                if (values.stream().noneMatch(sym -> sym.getId().equals(symSet.getID()))) {
                    SymbolSetEnum symSetEnum = new SymbolSetEnum(dim, symSet, symbolGraphicLocations.get(symSet.getID()), amplifierGuides.get(dim.getID()));
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
        List<AmplifierGroupTypeEnum> amplifierGroupValues = (List<AmplifierGroupTypeEnum>) dataModel.get("amplifierGroups");
        return amplifierGroupValues.stream()
                        .filter(amplifier -> !amplifier.isFrameAmplifier())
                        .filter(amplifier -> amplifier.isFor(symSetDetails.getId()))
                        .map(AmplifierGroupTypeEnum::getTypeName)
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
        List<AmplifierGroupTypeEnum> amplifierGroupValues = (List<AmplifierGroupTypeEnum>) dataModel.get("amplifierGroups");
        return amplifierGroupValues.stream()
                        .filter(AmplifierGroupTypeEnum::isFrameAmplifier)
                        .filter(amplifier -> amplifier.isFor(symSetDetails.getId()))
                        .map(AmplifierGroupTypeEnum::getTypeName)
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
