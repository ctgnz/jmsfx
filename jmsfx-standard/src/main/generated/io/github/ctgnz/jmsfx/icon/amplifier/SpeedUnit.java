package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifier;
import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum SpeedUnit implements EnumeratedAmplifier {
    KPH("KPH", "Kilometers Per Hour"),
    MPS("MPS", "Meters Per Second"),
    KTS("KTS", "Nautical Miles Per Hour (Knots)"),
    MPH("MPH", "Statute Miles Per Hour");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.SPEED_UNIT;

    private final String id;
    private final String label;
    
    private SpeedUnit(String id, String label) {
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
            return SpeedUnit.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return SpeedUnit.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

   @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}