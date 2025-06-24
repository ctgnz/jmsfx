package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.Extension;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;

public enum UnitEchelon implements StandardAmplifierItem {
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