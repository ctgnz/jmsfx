package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifier;
import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum TargetDesignation implements EnumeratedAmplifier {
    TA("TA", "Hostile Target"),
    NT("TA", "Hostile Non-Target"),
    EX("EX", "Expired");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.TARGET_DESIGNATION;

    private final String id;
    private final String label;
    
    private TargetDesignation(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicLocation() {
        return "NA";
    }
    
    @Override
    public String getFullId() {
        return String.format("%s%s", TYPE.getId(), id);
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
    
    public boolean isDeprecated() {
        try {
            return TargetDesignation.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return TargetDesignation.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

   @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}