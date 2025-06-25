package io.github.ctgnz.jmsfx.standard.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

public enum SpeedUnit implements AmplifierListItem {
    KPH("KPH", "Kilometers Per Hour"),
    MPS("MPS", "Meters Per Second"),
    KTS("KTS", "Nautical Miles Per Hour (Knots)"),
    MPH("MPH", "Statute Miles Per Hour");

    private final String id;
    private final String label;

    SpeedUnit(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.SPEED_UNIT;
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