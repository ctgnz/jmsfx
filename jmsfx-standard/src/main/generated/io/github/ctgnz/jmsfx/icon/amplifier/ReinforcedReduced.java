package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.icon.ListAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum ReinforcedReduced implements ListAmplifier {
    REINFORCED("+", "Reinforced"),
    REDUCED("-", "Reduced"),
    REINFORCED_REDUCED("±", "Reinforced and Reduced");

    private static final ListAmplifierType TYPE = ListAmplifierType.REINFORCED;

    private final String id;
    private final String label;
    
    private ReinforcedReduced(String id, String label) {
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
            return ReinforcedReduced.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return ReinforcedReduced.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}