package nz.co.ctg.jmsfx.model;

public enum LeadershipRole implements AmplifierGroup {
    LEADER_INDIVIDUAL("51", "Leader"),
    DEPUTY_LEADER_INDIVIDUAL("52", "Deputy Leader"),
    STAFF_INDIVIDUAL("53", "Staff"),
    ACTING_LEADER_INDIVIDUAL("54", "Acting Leader"),
    SENIOR_ENLISTED_ADVISOR("55", "Senior Enlisted Advisor"),
    STAFF_J1("61", "J1 Personnel/Manpower"),
    STAFF_J2("62", "J2 Intelligence/Security"),
    STAFF_J3("63", "J3 Operations"),
    STAFF_J4("64", "J4 Logistics"),
    STAFF_J5("65", "J5 Plans"),
    STAFF_J6("66", "J6 Signals/Communications"),
    STAFF_J7("67", "J7 Training/Military Education"),
    STAFF_J8("68", "J8 Finance/Contracts"),
    STAFF_J9("69", "J9 Civil-Military Co-operation");

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