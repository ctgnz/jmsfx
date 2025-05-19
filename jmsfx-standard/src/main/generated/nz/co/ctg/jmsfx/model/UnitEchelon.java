package nz.co.ctg.jmsfx.model;

public enum UnitEchelon implements AmplifierGroup {
    TEAM_CREW("11", "Team/Crew"),
    SQUAD("12", "Squad"),
    SEC("13", "Section"),
    PLT_DETACHMENT("14", "Platoon/Detachment"),
    CPY_BTY_TRP("15", "Company/Battery/Troop"),
    BN_SQUADRON("16", "Battalion/Squadron"),
    REGT_GRP("17", "Regiment/Group"),
    BDE("18", "Brigade"),
    DIV("19", "Division"),
    CORPS_MEF("10", "Corps/MEF"),
    ARMY("10", "Army"),
    ARMY_GROUP_FRONT("10", "Army Group/Front"),
    REGION_THEATER("10", "Region/Theater"),
    COMMAND("10", "Command"),
    STAFFEL("10", "Staffel");

    private final String id;
    private final String label;
    
    private UnitEchelon(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicLocation() {
        return "Echelon";
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