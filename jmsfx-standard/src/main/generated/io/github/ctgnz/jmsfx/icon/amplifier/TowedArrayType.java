package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.icon.StandardAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum TowedArrayType implements StandardAmplifier {
    SHORT_TOWED_ARRAY("1", "Short towed array"),
    LONG_TOWED_ARRAY("2", "Long towed array");

    private static final ListAmplifierType TYPE = ListAmplifierType.TOWED_ARRAYS;

    private final String id;
    private final String label;
    
    private TowedArrayType(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicLocation() {
        return "Amplifier";
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public ListAmplifierType getType() {
        return TYPE;
    }
    
    public boolean isDeprecated() {
        try {
            return TowedArrayType.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return TowedArrayType.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}