package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierList;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum CredibilityRating implements IAmplifierListItem {
    CONFIRMED("1", "Confirmed by Other Sources"),
    PROBABLY("2", "Probably True"),
    POSSIBLY("3", "Possibly True"),
    DOUBTFULLY("4", "Doubtfully True"),
    IMPROBABLE("5", "Improbable"),
    CRED_CANNOT_BE_JUDGED("6", "Truth Cannot Be Judged");

    private final String id;
    private final String label;

    CredibilityRating(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public IAmplifierList getAmplifierList() {
        return AmplifierList.CREDIBILITY_RATING;
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
            return CredibilityRating.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return CredibilityRating.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}