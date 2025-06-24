package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;

public enum UnknownAmplifier implements StandardAmplifierItem {
    NA("0", "Unknown", "FFFF80");

    private final String id;
    private final String label;
    private final String backgroundFill;

    UnknownAmplifier(String id, String label, String backgroundFill) {
        this.id = id;
        this.label = label;
        this.backgroundFill = backgroundFill;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.UNKNOWN;
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

    @Override
    public boolean isUnknown() {
        return true;
    }

}