package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierList;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum EngagementStage implements IAmplifierListItem {
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
    public IAmplifierList getAmplifierList() {
        return AmplifierList.ENGAGEMENT_STAGE;
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
            return EngagementStage.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return EngagementStage.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}