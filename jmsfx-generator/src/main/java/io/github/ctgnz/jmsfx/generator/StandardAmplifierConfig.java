package io.github.ctgnz.jmsfx.generator;

import org.apache.commons.lang3.StringUtils;

public class StandardAmplifierConfig {
    private String enumType;
    private String enumId;
    private String enumDesc;
    private String graphicLocation;
    private String xmlId;
    private boolean standard = true;
    private boolean frameAmplifier;
    private boolean unknown;

    public String getEnumDesc() {
        return enumDesc;
    }

    public String getEnumId() {
        return enumId;
    }

    public String getEnumType() {
        return enumType;
    }

    public String getGraphicLocation() {
        return graphicLocation;
    }

    public String getXmlId() {
        return xmlId;
    }

    public boolean isForGroup(String name) {
        return StringUtils.equals(name, xmlId);
    }

    public boolean isFrameAmplifier() {
        return frameAmplifier;
    }

    public boolean isStandard() {
        return standard;
    }

    public boolean isUnknown() {
        return unknown;
    }

    public void setEnumDesc(String enumDesc) {
        this.enumDesc = enumDesc;
    }

    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }

    public void setFrameAmplifier(boolean colorModifier) {
        this.frameAmplifier = colorModifier;
    }

    public void setGraphicLocation(String graphicLocation) {
        this.graphicLocation = graphicLocation;
    }

    public void setStandard(boolean standard) {
        this.standard = standard;
    }

    public void setUnknown(boolean unknown) {
        this.unknown = unknown;
    }

    public void setXmlId(String xmlId) {
        this.xmlId = xmlId;
    }
}
