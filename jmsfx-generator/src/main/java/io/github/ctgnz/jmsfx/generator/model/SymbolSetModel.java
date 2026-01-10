package io.github.ctgnz.jmsfx.generator.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@JsonIgnoreProperties({ "id", "label", "code", "extension", "deprecated", "remarks"})
@JsonPropertyOrder({ "details", "config", "amplifierGuides", "entities", "sectorOneMods", "sectorTwoMods" })
public class SymbolSetModel extends AbstractModel {
    @YamlFlowStyle
    @YamlForceQuote(properties = { "code", "label", "remarks" })
    public record Details(String code, String dimensionId, String id, boolean extension, boolean deprecated, String label, String remarks) {}

    @YamlFlowStyle
    @YamlForceQuote(properties = { "graphicLocation", "baseSymbolSet" })
    public record Config(String graphicLocation, String baseSymbolSet, boolean useFrame, String frameAmplifierClass, String amplifierClass, String amplifierTwoClass, String amplifierThreeClass) {}

    private @JsonIgnore String dimensionId;
    private @JsonIgnore String fileName;
    private @JsonIgnore String graphicLocation;
    private @JsonIgnore boolean useFrame = true;
    private @JsonIgnore String amplifierClass;
    private @JsonIgnore String amplifierTwoClass;
    private @JsonIgnore String amplifierThreeClass;
    private @JsonIgnore String frameAmplifierClass;
    private @JsonIgnore String baseSymbolSet;
    private final @JsonManagedReference List<AmplifierGuideModel> amplifierGuides = new ArrayList<>();
    private final @JsonManagedReference List<EntityModel> entities = new ArrayList<>();
    private final @JsonManagedReference List<SectorOneModifierModel> sectorOneMods = new ArrayList<>();
    private final @JsonManagedReference List<SectorTwoModifierModel> sectorTwoMods = new ArrayList<>();

    public SymbolSetModel() {
    }

    public void addEntity(EntityModel entity) {
        entity.setSymbolSet(this);
        entities.add(entity);
    }

    public void addSectorOneMod(SectorOneModifierModel modifier) {
        modifier.setSymbolSet(this);
        sectorOneMods.add(modifier);
    }

    public void addSectorTwoMod(SectorTwoModifierModel modifier) {
        modifier.setSymbolSet(this);
        sectorTwoMods.add(modifier);
    }

    public String getAmplifierClass() {
        return amplifierClass;
    }

    public List<AmplifierGuideModel> getAmplifierGuides() {
        return amplifierGuides;
    }

    public String getAmplifierThreeClass() {
        return amplifierThreeClass;
    }

    public String getAmplifierTwoClass() {
        return amplifierTwoClass;
    }

    public String getBaseSymbolSet() {
        return baseSymbolSet;
    }

    @JsonIgnore
    public String getBaseTypeName() {
        return StringUtils.remove(StringUtils.deleteWhitespace(label), '-');
    }

    public String getDimensionId() {
        return dimensionId;
    }

    public List<EntityModel> getEntities() {
        return entities;
    }

    @JsonIgnore
    public List<EntitySubTypeModel> getEntitySubTypes() {
        return entities.stream().flatMap(EntityModel::streamEntitySubTypes).toList();
    }

    @JsonIgnore
    public List<EntityTypeModel> getEntityTypes() {
        return entities.stream().flatMap(EntityModel::streamEntityTypes).toList();
    }

    @JsonIgnore
    public String getFileName() {
        return fileName;
    }

    public String getFrameAmplifierClass() {
        return frameAmplifierClass;
    }

    public String getGraphicLocation() {
        return graphicLocation;
    }

    @JsonIgnore
    public String getPackageName() {
        return StringUtils.remove(StringUtils.deleteWhitespace(label).toLowerCase(), '-');
    }

    public List<SectorOneModifierModel> getSectorOneMods() {
        return sectorOneMods;
    }

    public List<SectorTwoModifierModel> getSectorTwoMods() {
        return sectorTwoMods;
    }

    @JsonIgnore
    public boolean isAmplifierGuidesPresent() {
        return amplifierGuides != null && !amplifierGuides.isEmpty();
    }

    @JsonIgnore
    public boolean isAmplifierPresent() {
        return StringUtils.isNotBlank(amplifierClass);
    }

    @JsonIgnore
    public boolean isAmplifierThreePresent() {
        return StringUtils.isNotBlank(amplifierThreeClass);
    }

    @JsonIgnore
    public boolean isAmplifierTwoPresent() {
        return StringUtils.isNotBlank(amplifierTwoClass);
    }

    @JsonIgnore
    public boolean isAnyNotPresent() {
        if (isAmplifierPresent() && isEntityTypePresent() && isEntitySubTypePresent() && isSectorOneModifierPresent() && isSectorTwoModifierPresent()) {
            return !isAmplifierTwoPresent() || !isAmplifierThreePresent();
        }
        return !isAmplifierPresent() || !isEntityTypePresent() || !isEntitySubTypePresent() || !isSectorOneModifierPresent() || !isSectorTwoModifierPresent() || !isAmplifierGuidesPresent();
    }

    @JsonIgnore
    public boolean isCommon() {
        return "COMMON".equals(getId());
    }

    @JsonIgnore
    public boolean isEntitySubTypePresent() {
        return !getEntitySubTypes().isEmpty();
    }

    @JsonIgnore
    public boolean isEntityTypePresent() {
        return !getEntityTypes().isEmpty();
    }

    @JsonIgnore
    public boolean isFrameAmplifierPresent() {
        return StringUtils.isNotBlank(frameAmplifierClass);
    }

    @JsonIgnore
    public boolean isSectorOneModifierPresent() {
        return !sectorOneMods.isEmpty();
    }

    @JsonIgnore
    public boolean isSectorTwoModifierPresent() {
        return !sectorTwoMods.isEmpty();
    }

    public boolean isUseFrame() {
        return useFrame;
    }

    public void setAmplifierClass(String amplifierClass) {
        this.amplifierClass = amplifierClass;
    }

    public void setAmplifierThreeClass(String amplifierThreeClass) {
        this.amplifierThreeClass = amplifierThreeClass;
    }

    public void setAmplifierTwoClass(String amplifierTwoClass) {
        this.amplifierTwoClass = amplifierTwoClass;
    }

    public void setBaseSymbolSet(String baseSymbolSet) {
        this.baseSymbolSet = baseSymbolSet;
    }

    public void setFrameAmplifierClass(String amplifierFourClass) {
        this.frameAmplifierClass = amplifierFourClass;
    }

    public void setUseFrame(boolean useFrame) {
        this.useFrame = useFrame;
    }

    @JsonGetter("config")
    private Config getConfig() {
        return new Config(graphicLocation, baseSymbolSet, useFrame, frameAmplifierClass, amplifierClass, amplifierTwoClass, amplifierThreeClass);
    }

    @JsonGetter("details")
    private Details getDetails() {
        return new Details(code, dimensionId, id, extension, deprecated, label, remarks);
    }

    @JsonSetter("config")
    private void setConfig(Config config) {
        this.graphicLocation = config.graphicLocation;
        this.baseSymbolSet = config.baseSymbolSet;
        this.useFrame = config.useFrame;
        this.frameAmplifierClass = config.frameAmplifierClass;
        this.amplifierClass = config.amplifierClass;
        this.amplifierTwoClass = config.amplifierTwoClass;
        this.amplifierThreeClass = config.amplifierThreeClass;
    }

    @JsonSetter("details")
    private void setDetails(Details details) {
        this.id = details.id;
        this.code = details.code;
        this.extension = details.extension;
        this.deprecated = details.deprecated;
        this.label = details.label;
        this.remarks = details.remarks;
        this.dimensionId = details.dimensionId;
    }

}
