package io.github.ctgnz.jmsfx.battleorder.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.battleorder.AmplifierListEnum;

public enum ServiceBranch implements StandardAmplifierItem {
        UNKNOWN("0", "Unknown", "FFFF80"),
        INFANTRY("1", "Infantry", "5BAA5B"),
        ARMOR_RECON("2", "Armor/Recon", "FFD00B"),
        ARTILLERY_AIR_DEFENSE("3", "Artillery/Air Defense", "FF3333"),
        COMBAT_SUPPORT_MEDICAL("4", "Combat Support, Medical", "F7F7F7"),
        LOGISTICS_SERVICES("5", "Logistics, Services", "D87600"),
        AVIATION("6", "Aviation", "A2E3E8"),
        MARITIME("7", "Maritime", "67C6EF");

    private final String id;
    private final String label;
    private final String backgroundFill;

    ServiceBranch(String id, String label, String backgroundFill) {
        this.id = id;
        this.label = label;
        this.backgroundFill = backgroundFill;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.SERVICE_BRANCH;
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

    @Override
    public String getBackgroundFill() {
        return backgroundFill;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public boolean isGraphicalIcon() {
        return false;
    }

}