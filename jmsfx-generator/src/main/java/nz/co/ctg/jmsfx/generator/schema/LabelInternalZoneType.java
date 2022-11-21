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
 * <p>Java class for LabelInternalZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelInternalZoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="AboveLeft"/>
 *     &lt;enumeration value="AboveCenter"/>
 *     &lt;enumeration value="AboveRight"/>
 *     &lt;enumeration value="CenterRight"/>
 *     &lt;enumeration value="BelowRight"/>
 *     &lt;enumeration value="BelowCenter"/>
 *     &lt;enumeration value="BelowLeft"/>
 *     &lt;enumeration value="CenterLeft"/>
 *     &lt;enumeration value="Center"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelInternalZoneType")
@XmlEnum
public enum LabelInternalZoneType {

    NA("NA"),
    @XmlEnumValue("AboveLeft")
    ABOVE_LEFT("AboveLeft"),
    @XmlEnumValue("AboveCenter")
    ABOVE_CENTER("AboveCenter"),
    @XmlEnumValue("AboveRight")
    ABOVE_RIGHT("AboveRight"),
    @XmlEnumValue("CenterRight")
    CENTER_RIGHT("CenterRight"),
    @XmlEnumValue("BelowRight")
    BELOW_RIGHT("BelowRight"),
    @XmlEnumValue("BelowCenter")
    BELOW_CENTER("BelowCenter"),
    @XmlEnumValue("BelowLeft")
    BELOW_LEFT("BelowLeft"),
    @XmlEnumValue("CenterLeft")
    CENTER_LEFT("CenterLeft"),
    @XmlEnumValue("Center")
    CENTER("Center");
    private final String value;

    LabelInternalZoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelInternalZoneType fromValue(String v) {
        for (LabelInternalZoneType c: LabelInternalZoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
