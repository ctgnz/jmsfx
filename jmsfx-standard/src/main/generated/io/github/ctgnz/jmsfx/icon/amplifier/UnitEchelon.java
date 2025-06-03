package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.icon.StandardAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum UnitEchelon implements StandardAmplifier {
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
    REGION_THEATRE("D", "Region/Theatre"),
    COMMAND("E", "Command"),
    @Extension STAFFEL("F", "Staffel");

    private static final ListAmplifierType TYPE = ListAmplifierType.UNIT_ECHELON;

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

    @Override
    public ListAmplifierType getType() {
        return TYPE;
    }
    
    public boolean isDeprecated() {
        try {
            return UnitEchelon.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return UnitEchelon.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}