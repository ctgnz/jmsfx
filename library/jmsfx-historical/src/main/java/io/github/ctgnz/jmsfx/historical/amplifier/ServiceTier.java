package io.github.ctgnz.jmsfx.historical.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.historical.AmplifierListEnum;

public enum ServiceTier implements StandardAmplifierItem {
        REGULARS("1", "Regulars", "#80E0FF"),
        CONSCRIPTS("2", "Conscripts", "#FF8080"),
        RESERVE_L1("3", "Reserve Level 1 (Regulars)", "#AAFFAA"),
        RESERVE_L2("4", "Reserve Level 2 (Volunteers)", "#FFFF80"),
        RESERVE_L3("5", "Reserve Level 3 (Militia)", "#E68646"),
        CONTRACTORS("6", "Civilian Contractors", "#FFA1FF");

    private final String id;
    private final String label;
    private final String backgroundFill;

    ServiceTier(String id, String label, String backgroundFill) {
        this.id = id;
        this.label = label;
        this.backgroundFill = backgroundFill;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.SERVICE_TIER;
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