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
 * <p>Java class for GeometryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeometryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="POINT"/>
 *     &lt;enumeration value="LINE"/>
 *     &lt;enumeration value="AREA"/>
 *     &lt;enumeration value="MIXED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeometryType")
@XmlEnum
public enum GeometryType {

    NA,
    POINT,
    LINE,
    AREA,
    MIXED;

    public String value() {
        return name();
    }

    public static GeometryType fromValue(String v) {
        return valueOf(v);
    }

}
