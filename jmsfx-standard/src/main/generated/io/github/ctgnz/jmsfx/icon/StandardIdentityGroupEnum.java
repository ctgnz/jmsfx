package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;
import java.util.List;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;

public enum StandardIdentityGroupEnum implements StandardIdentityGroup {
    SIG_UNKNOWN("1", "Unknown", "_0"),
    SIG_FRIEND("3", "Friend", "_1"),
    SIG_NEUTRAL("4", "Neutral", "_2"),
    SIG_HOSTILE("6", "Hostile", "_3");

    private final String id;
    private final String label;
    private final String graphicSuffix;

    StandardIdentityGroupEnum(String id, String label, String graphicSuffix) {
        this.id = id;
        this.label = label;
        this.graphicSuffix = graphicSuffix;
    }

    @Override
    public String getGraphicSuffix() {
        return graphicSuffix;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public List<StandardIdentity> getIdentities() {
        return Arrays.stream(StandardIdentityEnum.values()).filter(this::owns).map(StandardIdentity.class::cast).toList();
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public boolean owns(StandardIdentity id) {
        return id.getGroup() == this;
    }

}