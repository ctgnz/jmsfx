package io.github.ctgnz.jmsfx.standard.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

public enum SpecialDesignator implements AmplifierListItem {
    NRT("NRT", "Non-Real Time"),
    SIG("SIG", "Tactically Significant Tracks");

    private final String id;
    private final String label;

    SpecialDesignator(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.SPECIAL_DESIGNATOR;
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