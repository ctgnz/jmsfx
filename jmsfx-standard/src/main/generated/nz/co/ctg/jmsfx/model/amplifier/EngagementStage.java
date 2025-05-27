package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifierType;

public enum EngagementStage implements EnumeratedAmplifier {
    NA("", "Unspecified"),
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

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.ENGAGEMENT_STAGE;

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
    
    @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}