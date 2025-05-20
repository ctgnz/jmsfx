package nz.co.ctg.jmsfx.generator.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleDigitType")
public class HexDigit {
    @XmlValue
    protected String hexValue;

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public int toInt() {
        return Integer.parseInt(hexValue, 16);
    }

}
