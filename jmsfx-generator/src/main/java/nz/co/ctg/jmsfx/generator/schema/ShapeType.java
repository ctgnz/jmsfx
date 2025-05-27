package nz.co.ctg.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ShapeType")
@XmlEnum
public enum ShapeType {

        NA,
        CIRCLE,
        CLOVER,
        CURVE,
        DIAMOND,
        RECTANGLE,
        SQUARE;

    public static ShapeType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
