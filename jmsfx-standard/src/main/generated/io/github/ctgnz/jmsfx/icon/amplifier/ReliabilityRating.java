package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierList;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum ReliabilityRating implements IAmplifierListItem {
    COMPLETELY("A", "Completely Reliable"),
    USUALLY("B", "Usually Reliable"),
    FAIRLY("C", "Fairly Reliable"),
    NOT_USUALLY("D", "Not Usually Reliable"),
    UNRELIABLE("E", "Unreliable"),
    REL_CANNOT_BE_JUDGED("F", "Reliability Cannot Be Judged");

    private final String id;
    private final String label;

    ReliabilityRating(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public IAmplifierList getAmplifierList() {
        return AmplifierList.RELIABILITY_RATING;
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
            return ReliabilityRating.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return ReliabilityRating.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}