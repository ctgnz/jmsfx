package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum TargetDesignation implements AmplifierListItem {
    TA("TA", "Hostile Target"),
    NT("TA", "Hostile Non-Target"),
    EX("EX", "Expired");

    private final String id;
    private final String label;

    TargetDesignation(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.TARGET_DESIGNATION;
    }

    @Override
    public String getGraphicLocation() {
        return "NA";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public boolean isDeprecated() {
        try {
            return TargetDesignation.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return TargetDesignation.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}