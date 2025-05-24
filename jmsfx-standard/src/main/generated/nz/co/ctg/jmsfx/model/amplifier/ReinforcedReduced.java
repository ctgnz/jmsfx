package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGroupType;

public enum ReinforcedReduced implements AmplifierGroup {
    REINFORCED("+", "Reinforced"),
    REDUCED("-", "Reduced"),
    REINFORCED_REDUCED("±", "Reinforced and Reduced");

    private static final AmplifierGroupType TYPE = AmplifierGroupType.REINFORCED;

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