package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGroupType;

public enum SigintMobility implements AmplifierGroup {
    MOBILE_INDICATOR("M", "Mobile"),
    STATIC_INDICATOR("S", "Static"),
    UNCERTAIN_INDICATOR("U", "Uncertain");

    private static final AmplifierGroupType TYPE = AmplifierGroupType.SIGINT_MOBILITY;

    private final String id;
    private final String label;
    
    private SigintMobility(String id, String label) {
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