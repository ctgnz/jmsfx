//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 04:45:07 PM NZDT 
//


package nz.co.ctg.jmsfx.generator.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IconType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IconType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="MAIN_1"/>
 *     &lt;enumeration value="MAIN_2"/>
 *     &lt;enumeration value="FULL_OCTAGON"/>
 *     &lt;enumeration value="FULL_FRAME"/>
 *     &lt;enumeration value="SPECIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IconType")
@XmlEnum
public enum IconType {

    NA,
    MAIN,
    MAIN_1,
    MAIN_2,
    FULL_OCTAGON,
    FULL_FRAME,
    SPECIAL;

    public String value() {
        return name();
    }

    public static IconType fromValue(String v) {
        return valueOf(v);
    }

}
