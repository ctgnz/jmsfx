package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

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

    public static AttributeTypeType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
