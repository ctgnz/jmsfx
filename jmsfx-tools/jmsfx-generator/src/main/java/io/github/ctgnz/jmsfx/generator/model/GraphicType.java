package io.github.ctgnz.jmsfx.generator.model;

public enum GraphicType {

        NA,
        MAIN,
        MAIN_1,
        MAIN_2,
        FULL_OCTAGON,
        FULL_FRAME,
        FREE_CANVAS,
        SPECIAL;

    public static GraphicType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
