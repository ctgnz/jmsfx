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
 * <p>Java class for AttributeTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DATETIME"/>
 *     &lt;enumeration value="DOUBLE"/>
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="STRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeTypeType")
@XmlEnum
public enum AttributeTypeType {

    BOOLEAN,
    DATETIME,
    DOUBLE,
    INTEGER,
    LONG,
    SINGLE,
    STRING;

    public String value() {
        return name();
    }

    public static AttributeTypeType fromValue(String v) {
        return valueOf(v);
    }

}
