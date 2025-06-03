package io.github.ctgnz.jmsfx.generator.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.generator.AmplifierGuideConfig;
import io.github.ctgnz.jmsfx.generator.schema.Library.Dimensions.Dimension;
import io.github.ctgnz.jmsfx.generator.schema.Library.Dimensions.Dimension.SymbolSets.SymbolSetRef;

public class SymbolSetEnum extends StandardEnum {

    private final String dimensionId;
    private final String fileName;
    private final String graphicLocation;
    private final List<AmplifierGuideConfig> amplifierGuides = new ArrayList<>();
    private boolean useFrame = true;
    private boolean entityTypePresent = false;
    private boolean entitySubTypePresent = false;
    private boolean amplifierPresent = false;
    private boolean amplifierTwoPresent = false;
    private boolean amplifierThreePresent = false;
    private boolean frameAmplifierPresent = false;
    private boolean sectorOneModifierPresent = false;
    private boolean sectorTwoModifierPresent = false;
    private String amplifierClass;
    private String amplifierTwoClass;
    private String amplifierThreeClass;
    private String frameAmplifierClass;
    private String baseSymbolSet;

    public SymbolSetEnum(Dimension dimension, SymbolSetRef symbolSet, String graphicLocation) {
        super(symbolSet.getID().toString(), symbolSet.getLabel(), symbolSet.getSymbolSetCode().getCodeString(), null);
        this.graphicLocation = graphicLocation;
        this.dimensionId = dimension.getID();
        this.fileName = symbolSet.getInstance();
        this.baseSymbolSet = symbolSet.getBaseSymbolSet();
    }

    public String getAmplifierClass() {
        return amplifierClass;
    }

    public List<AmplifierGuideConfig> getAmplifierGuides() {
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

    public String getBaseTypeName() {
        return StringUtils.remove(StringUtils.deleteWhitespace(label), '-');
    }

    public String getDimensionId() {
        return dimensionId;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFrameAmplifierClass() {
        return frameAmplifierClass;
    }

    public String getGraphicLocation() {
        return graphicLocation;
    }

    public String getPackageName() {
        return StringUtils.remove(StringUtils.deleteWhitespace(label).toLowerCase(), '-');
    }

    public boolean isAmplifierGuidesPresent() {
        return amplifierGuides != null && !amplifierGuides.isEmpty();
    }

    public boolean isAmplifierPresent() {
        return amplifierPresent;
    }

    public boolean isAmplifierThreePresent() {
        return amplifierThreePresent;
    }

    public boolean isAmplifierTwoPresent() {
        return amplifierTwoPresent;
    }

    public boolean isAnyNotPresent() {
        if (amplifierPresent && entityTypePresent && entitySubTypePresent && sectorOneModifierPresent && sectorTwoModifierPresent) {
            return !amplifierTwoPresent || !amplifierThreePresent;
        }
        return !amplifierPresent || ! entityTypePresent || !entitySubTypePresent || !sectorOneModifierPresent || !sectorTwoModifierPresent || !isAmplifierGuidesPresent();
    }

    public boolean isEntitySubTypePresent() {
        return entitySubTypePresent;
    }

    public boolean isEntityTypePresent() {
        return entityTypePresent;
    }

    public boolean isFrameAmplifierPresent() {
        return frameAmplifierPresent;
    }

    public boolean isSectorOneModifierPresent() {
        return sectorOneModifierPresent;
    }

    public boolean isSectorTwoModifierPresent() {
        return sectorTwoModifierPresent;
    }

    public boolean isUseFrame() {
        return useFrame;
    }

    public void setAmplifierClass(String amplifierClass) {
        this.amplifierClass = amplifierClass;
    }

    public void setAmplifierPresent(boolean amplifierPresent) {
        this.amplifierPresent = amplifierPresent;
    }

    public void setAmplifierThreeClass(String amplifierThreeClass) {
        this.amplifierThreeClass = amplifierThreeClass;
    }

    public void setAmplifierThreePresent(boolean amplifierThreePresent) {
        this.amplifierThreePresent = amplifierThreePresent;
    }

    public void setAmplifierTwoClass(String amplifierTwoClass) {
        this.amplifierTwoClass = amplifierTwoClass;
    }

    public void setAmplifierTwoPresent(boolean amplifierTwoPresent) {
        this.amplifierTwoPresent = amplifierTwoPresent;
    }

    public void setBaseSymbolSet(String baseSymbolSet) {
        this.baseSymbolSet = baseSymbolSet;
    }

    public void setEntitySubTypePresent(boolean entitySubTypePresent) {
        this.entitySubTypePresent = entitySubTypePresent;
    }

    public void setEntityTypePresent(boolean entityTypePresent) {
        this.entityTypePresent = entityTypePresent;
    }

    public void setFrameAmplifierClass(String amplifierFourClass) {
        this.frameAmplifierClass = amplifierFourClass;
    }

    public void setFrameAmplifierPresent(boolean frameAmplifierPresent) {
        this.frameAmplifierPresent = frameAmplifierPresent;
    }

    public void setSectorOneModifierPresent(boolean sectorOneModifierPresent) {
        this.sectorOneModifierPresent = sectorOneModifierPresent;
    }

    public void setSectorTwoModifierPresent(boolean sectorTwoModifierPresent) {
        this.sectorTwoModifierPresent = sectorTwoModifierPresent;
    }

    public void setUseFrame(boolean useFrame) {
        this.useFrame = useFrame;
    }

}
