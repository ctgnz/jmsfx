package nz.co.ctg.jmsfx.model;

public enum UnitEchelon implements AmplifierGroup {
    TEAM_CREW("1", "Team/Crew"),
    SQUAD("2", "Squad"),
    SEC("3", "Section"),
    PLT_DETACHMENT("4", "Platoon/Detachment"),
    CPY_BTY_TRP("5", "Company/Battery/Troop"),
    BN_SQUADRON("6", "Battalion/Squadron"),
    REGT_GRP("7", "Regiment/Group"),
    BDE("8", "Brigade"),
    DIV("9", "Division"),
    CORPS_MEF("A", "Corps/MEF"),
    ARMY("B", "Army"),
    ARMY_GROUP_FRONT("C", "Army Group/Front"),
    REGION_THEATER("D", "Region/Theater"),
    COMMAND("E", "Command"),
    STAFFEL("F", "Staffel");
    private static final AmplifierGroupType TYPE = AmplifierGroupType.UNIT_ECHELON;

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