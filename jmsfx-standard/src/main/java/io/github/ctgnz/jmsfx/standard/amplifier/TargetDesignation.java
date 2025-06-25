package io.github.ctgnz.jmsfx.standard.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

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

    @Override
    public String getName() {
        return name();
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}