package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;

public enum CredibilityRating implements AmplifierListItem {
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
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.CREDIBILITY_RATING;
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