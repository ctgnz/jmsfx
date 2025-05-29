package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifierType;
import nz.co.ctg.jmsfx.model.Extension;

public enum SpecialDesignator implements EnumeratedAmplifier {
    NRT("NRT", "Non-Real Time"),
    SIG("SIG", "Tactically Significant Tracks");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.SPECIAL_DESIGNATOR;

    private final String id;
    private final String label;
    
    private SpecialDesignator(String id, String label) {
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
            return SpecialDesignator.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return SpecialDesignator.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

   @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}