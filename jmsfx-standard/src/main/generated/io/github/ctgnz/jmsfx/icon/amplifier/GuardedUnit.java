package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum GuardedUnit implements IListAmplifier {
    BG("BG", "Guarded Unit");

    private static final ListAmplifierType TYPE = ListAmplifierType.GUARDED_UNIT;
    private final String id;
    private final String label;

    GuardedUnit(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public String getGraphicLocation() {
        return "NA";
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
            return GuardedUnit.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return GuardedUnit.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}