//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 04:45:07 PM NZDT 
//


package nz.co.ctg.jmsfx.generator.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstrainOffsetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstrainOffsetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoConstraint"/>
 *     &lt;enumeration value="AboveLine"/>
 *     &lt;enumeration value="BelowLine"/>
 *     &lt;enumeration value="LeftOfLine"/>
 *     &lt;enumeration value="RightOfLine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstrainOffsetType")
@XmlEnum
public enum ConstrainOffsetType {

    @XmlEnumValue("NoConstraint")
    NO_CONSTRAINT("NoConstraint"),
    @XmlEnumValue("AboveLine")
    ABOVE_LINE("AboveLine"),
    @XmlEnumValue("BelowLine")
    BELOW_LINE("BelowLine"),
    @XmlEnumValue("LeftOfLine")
    LEFT_OF_LINE("LeftOfLine"),
    @XmlEnumValue("RightOfLine")
    RIGHT_OF_LINE("RightOfLine");
    private final String value;

    ConstrainOffsetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstrainOffsetType fromValue(String v) {
        for (ConstrainOffsetType c: ConstrainOffsetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
