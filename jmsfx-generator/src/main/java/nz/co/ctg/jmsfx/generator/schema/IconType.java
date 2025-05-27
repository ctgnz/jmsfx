package nz.co.ctg.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

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

    public static IconType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
