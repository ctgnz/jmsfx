package io.github.ctgnz.jmsfx.generator;

public class EnumeratedAmplifierConfig {
    private String amplifier;
    private String valuesId;
    private String code;
    private String enumType;
    private String enumId;
    private String enumDesc;
    private boolean coded;

    public String getAmplifier() {
        return amplifier;
    }

    public String getCode() {
        return code;
    }

    public String getEnumDesc() {
        return enumDesc;
    }

    public String getEnumId() {
        return enumId;
    }

    public String getEnumType() {
        return enumType;
    }

    public String getValuesId() {
        return valuesId;
    }

    public boolean isCoded() {
        return coded;
    }

    public void setAmplifier(String graphicLocation) {
        this.amplifier = graphicLocation;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCoded(boolean coded) {
        this.coded = coded;
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

    public void setValuesId(String valuesId) {
        this.valuesId = valuesId;
    }
}
