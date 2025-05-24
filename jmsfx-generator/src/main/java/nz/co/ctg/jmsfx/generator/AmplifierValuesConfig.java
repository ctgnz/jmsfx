package nz.co.ctg.jmsfx.generator;

public class AmplifierValuesConfig {
    private String amplifier;
    private String valuesId;
    private String enumType;
    private String enumId;
    private String enumDesc;

     public String getEnumDesc() {
        return enumDesc;
    }

    public String getEnumId() {
        return enumId;
    }

    public String getEnumType() {
        return enumType;
    }

    public String getAmplifier() {
        return amplifier;
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

    public void setAmplifier(String graphicLocation) {
        this.amplifier = graphicLocation;
    }

    public String getValuesId() {
        return valuesId;
    }

    public void setValuesId(String valuesId) {
        this.valuesId = valuesId;
    }
}
