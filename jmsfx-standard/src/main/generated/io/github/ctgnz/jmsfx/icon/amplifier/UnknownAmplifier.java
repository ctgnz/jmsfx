package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.icon.StandardEnumeratedAmplifier;
import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum UnknownAmplifier implements StandardEnumeratedAmplifier {
    NA("0", "Unknown", "FFFF80");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.UNKNOWN;

    private final String id;
    private final String label;
    private final String backgroundFill;
    
    private UnknownAmplifier(String id, String label, String backgroundFill) {
        this.id = id;
        this.label = label;
        this.backgroundFill = backgroundFill;
    }
    
    @Override
    public String getGraphicLocation() {
        return "Amplifier";
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

    @Override
    public String getBackgroundFill() {
        return backgroundFill;
    }
    
    public boolean isDeprecated() {
        try {
            return UnknownAmplifier.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return UnknownAmplifier.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

   @Override
    public boolean isGraphicalIcon() {
        return false;
    }


    @Override
    public boolean isUnknown() {
        return true;
    }

}