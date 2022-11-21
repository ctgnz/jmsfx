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
    DIV("21", "Division"),
    CORPS_MEF("22", "Corps/MEF"),
    ARMY("23", "Army"),
    ARMY_GROUP_FRONT("24", "Army Group/Front"),
    REGION_THEATER("25", "Region/Theater"),
    COMMAND("26", "Command");

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