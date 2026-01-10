package io.github.ctgnz.jmsfx.generator.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "IconType")
@XmlEnum
public enum GraphicType {

        NA,
        MAIN,
        MAIN_1,
        MAIN_2,
        FULL_OCTAGON,
        FULL_FRAME,
        SPECIAL;

    public static GraphicType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
