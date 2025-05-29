package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifierType;
import nz.co.ctg.jmsfx.model.Extension;

public enum CombatEffectiveness implements EnumeratedAmplifier {
    FULLY_OPERATIONAL("FO", "Fully Operational"),
    SUBSTANTIALLY_OPERATIONAL("SO", "Substantially Operational"),
    MARGINALLY_OPERATIONAL("MO", "Marginally Operational"),
    NOT_OPERATIONAL("NO", "Not Operational"),
    UNKNOWN_EFFECTIVENESS("UNK", "Unknown");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.COMBAT_EFFECTIVENESS;

    private final String id;
    private final String label;
    
    private CombatEffectiveness(String id, String label) {
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
            return CombatEffectiveness.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return CombatEffectiveness.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

   @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}