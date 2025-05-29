package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "OffsetAlongLinePlacementType")
@XmlEnum
public enum OffsetAlongLinePlacementType {

        @XmlEnumValue("BestPositionAlongLine")
        BEST_POSITION_ALONG_LINE("BestPositionAlongLine"),
        @XmlEnumValue("BeforeStartOfLine")
        BEFORE_START_OF_LINE("BeforeStartOfLine"),
        @XmlEnumValue("AlongLineFromStart")
        ALONG_LINE_FROM_START("AlongLineFromStart"),
        @XmlEnumValue("AlongLineFromEnd")
        ALONG_LINE_FROM_END("AlongLineFromEnd"),
        @XmlEnumValue("AfterEndOfLine")
        AFTER_END_OF_LINE("AfterEndOfLine");

    public static OffsetAlongLinePlacementType fromValue(String v) {
        for (OffsetAlongLinePlacementType c : OffsetAlongLinePlacementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    OffsetAlongLinePlacementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
