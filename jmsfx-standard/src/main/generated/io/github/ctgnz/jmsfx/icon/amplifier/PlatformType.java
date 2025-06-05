package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum PlatformType implements IListAmplifier {
    ELNOT("ELNOT", "Electronic Intelligence Notation"),
    CENOT("CENOT", "Communications Intelligence Notation");

    private static final ListAmplifierType TYPE = ListAmplifierType.PLATFORM_TYPE;
    private final String id;
    private final String label;

    PlatformType(String id, String label) {
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
            return PlatformType.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return PlatformType.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}