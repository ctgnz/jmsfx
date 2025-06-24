package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;

public enum UnitEchelon implements StandardAmplifierItem {
    TEAM_CREW("1", "Team/Crew"),
    SQUAD("2", "Squad"),
    SEC("3", "Section"),
    PLT_DETACHMENT("4", "Platoon/Detachment"),
    STAFFEL("5", "Staffel"),
    CPY_BTY_TRP("6", "Company/Battery/Troop"),
    BN_SQUADRON("7", "Battalion/Squadron"),
    REGT_GRP("8", "Regiment/Group"),
    BDE("9", "Brigade"),
    DIV("A", "Division"),
    CORPS_MEF("B", "Corps/MEF"),
    ARMY("C", "Army"),
    ARMY_GROUP_FRONT("D", "Army Group/Front"),
    REGION_THEATRE("E", "Region/Theatre"),
    COMMAND("F", "Command");

    private final String id;
    private final String label;

    UnitEchelon(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.UNIT_ECHELON;
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
    public String getName() {
        return name();
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}