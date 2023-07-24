package nz.co.ctg.jmsfx.model;

public enum LeadershipRole implements AmplifierGroup {
    LEADER_INDIVIDUAL("71", "Leader"),
    DEPUTY_LEADER_INDIVIDUAL("72", "Deputy Leader");

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
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
}