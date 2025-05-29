package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifierType;
import nz.co.ctg.jmsfx.model.Extension;

public enum GuardedUnit implements EnumeratedAmplifier {
    BG("BG", "Guarded Unit");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.GUARDED_UNIT;

    private final String id;
    private final String label;
    
    private GuardedUnit(String id, String label) {
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