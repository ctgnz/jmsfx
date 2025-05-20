package nz.co.ctg.jmsfx.model;

public enum LeadershipRole implements AmplifierGroup {
    LEADER_INDIVIDUAL("1", "Leader"),
    DEPUTY_LEADER_INDIVIDUAL("2", "Deputy Leader");
    private static final AmplifierGroupType TYPE = AmplifierGroupType.LEADERSHIP_ROLE;

    private final String id;
    private final String label;
    
    private LeadershipRole(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicLocation() {
        return "Amplifier";
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