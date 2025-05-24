package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGroupType;

public enum CombatEffectiveness implements AmplifierGroup {
    FULLY_OPERATIONAL("FO", "Fully Operational"),
    SUBSTANTIALLY_OPERATIONAL("SO", "Substantially Operational"),
    MARGINALLY_OPERATIONAL("MO", "Marginally Operational"),
    NOT_OPERATIONAL("NO", "Not Operational"),
    UNKNOWN_EFFECTIVENESS("UNK", "Unknown");

    private static final AmplifierGroupType TYPE = AmplifierGroupType.COMBAT_EFFECTIVENESS;

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

}