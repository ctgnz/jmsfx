package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGroupType;

public enum EngagementType implements AmplifierGroup {
    L("", "Local"),
    R("R", "Remote"),
    B("B", "Both");

    private static final AmplifierGroupType TYPE = AmplifierGroupType.ENGAGEMENT_TYPE;

    private final String id;
    private final String label;
    
    private EngagementType(String id, String label) {
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