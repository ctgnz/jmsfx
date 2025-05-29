package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "MultiPartOptionType")
@XmlEnum
public enum MultiPartOptionType {

        @XmlEnumValue("OneLabelPerFeature")
        ONE_LABEL_PER_FEATURE("OneLabelPerFeature"),
        @XmlEnumValue("OneLabelPerPart")
        ONE_LABEL_PER_PART("OneLabelPerPart"),
        @XmlEnumValue("OneLabelPerSegment")
        ONE_LABEL_PER_SEGMENT("OneLabelPerSegment");

    public static MultiPartOptionType fromValue(String v) {
        for (MultiPartOptionType c : MultiPartOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    private final String value;

    MultiPartOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

}
