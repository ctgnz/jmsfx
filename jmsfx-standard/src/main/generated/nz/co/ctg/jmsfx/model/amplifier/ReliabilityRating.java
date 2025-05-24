package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGroupType;

public enum ReliabilityRating implements AmplifierGroup {
    COMPLETELY("A", "Completely Reliable"),
    USUALLY("B", "Usually Reliable"),
    FAIRLY("C", "Fairly Reliable"),
    NOT_USUALLY("D", "Not Usually Reliable"),
    UNRELIABLE("E", "Unreliable"),
    REL_CANNOT_BE_JUDGED("F", "Reliability Cannot Be Judged");

    private static final AmplifierGroupType TYPE = AmplifierGroupType.RELIABILITY_RATING;

    private final String id;
    private final String label;
    
    private ReliabilityRating(String id, String label) {
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