package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;

public enum EngagementStage implements AmplifierListItem {
    NA("", "Unspecified"),
    ASN("ASN", "Assign/Cover"),
    ENG("ENG", "Engage"),
    MIF("MIF", "Missile in Flight"),
    CF("CF", "Cease Fire"),
    CE("CE", "Cease Engage"),
    HF("HF", "Hold Fire"),
    TE("TE", "Terminate Engagement"),
    BE("BE", "Break Engagement"),
    MBE("MBE", "Management by Exception"),
    MT("MT", "MBE Less Than Threshold"),
    MLT("MLT", "Multiple Engagements");

    private final String id;
    private final String label;

    EngagementStage(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.ENGAGEMENT_STAGE;
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