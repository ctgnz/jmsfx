package nz.co.ctg.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "GeometryType")
@XmlEnum
public enum GeometryType {

        NA,
        POINT,
        LINE,
        AREA,
        MIXED;

    public static GeometryType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
