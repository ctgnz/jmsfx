package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGroupType;

public enum EngagementStage implements AmplifierGroup {
    ASN("ASN", "Assign/Cover"),
    ENG("ENG", "Engage"),
    MIF("MIF", "Missile in Flight"),
    CF("CF", "Cease Fire"),
    CE("CE", "Cease Engage"),
    HF("HF", "Hold Fire"),
    TE("TE", "Terminate Engagement"),
    BE("BE", "Break Engagement"),
    MBE("MBE", "Management by Exception"),
    MT("MT", "MBE Less Than Threshold"),
    MLT("MLT", "Multiple Engagements");

    private static final AmplifierGroupType TYPE = AmplifierGroupType.ENGAGEMENT_STAGE;

    private final String id;
    private final String label;
    
    private EngagementStage(String id, String label) {
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