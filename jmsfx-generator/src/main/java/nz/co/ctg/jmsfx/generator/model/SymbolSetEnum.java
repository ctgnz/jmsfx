package nz.co.ctg.jmsfx.generator.model;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.AmplifierGuideConfig;
import nz.co.ctg.jmsfx.generator.schema.Library.Dimensions.Dimension;
import nz.co.ctg.jmsfx.generator.schema.Library.Dimensions.Dimension.SymbolSets.SymbolSetRef;

public class SymbolSetEnum extends StandardEnum {

    private final String dimensionId;
    private final String fileName;
    private final String graphicLocation;
    private final List<AmplifierGuideConfig> amplifierGuides;
    private boolean entityTypePresent = false;
    private boolean entitySubTypePresent = false;
    private boolean amplifierPresent = false;
    private boolean amplifierTwoPresent = false;
    private boolean amplifierThreePresent = false;
    private boolean frameAmplifierPresent = false;
    private boolean sectorOneModifierPresent = false;
    private boolean sectorTwoModifierPresent = false;
    private boolean specialEntitySubTypePresent = false;
    private String amplifierClass;
    private String amplifierTwoClass;
    private String amplifierThreeClass;
    private String frameAmplifierClass;

    public SymbolSetEnum(Dimension dimension, SymbolSetRef symbolSet, String graphicLocation, List<AmplifierGuideConfig> amplifierGuides) {
        super(symbolSet.getID().toString(), symbolSet.getLabel(), symbolSet.getSymbolSetCode().getCodeString());
        this.graphicLocation = graphicLocation;
        this.amplifierGuides = amplifierGuides;
        this.dimensionId = dimension.getID();
        this.fileName = symbolSet.getInstance();
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
        return !amplifierPresent || ! entityTypePresent || !entitySubTypePresent || !sectorOneModifierPresent || !sectorTwoModifierPresent || !specialEntitySubTypePresent || !isAmplifierGuidesPresent();
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

    public boolean isSpecialEntitySubTypePresent() {
        return specialEntitySubTypePresent;
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

    public void setSpecialEntitySubTypePresent(boolean specialEntitySubTypePresent) {
        this.specialEntitySubTypePresent = specialEntitySubTypePresent;
    }


}
