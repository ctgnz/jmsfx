package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;
import java.util.List;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStandardIdentityGroup;

public enum StandardIdentityGroup implements IStandardIdentityGroup {
    SIG_UNKNOWN("1", "Unknown", "_0"),
    SIG_FRIEND("3", "Friend", "_1"),
    SIG_NEUTRAL("4", "Neutral", "_2"),
    SIG_HOSTILE("6", "Hostile", "_3");

    private final String id;
    private final String label;
    private final String graphicSuffix;

    StandardIdentityGroup(String id, String label, String graphicSuffix) {
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
    public List<IStandardIdentity> getIdentities() {
        return Arrays.stream(StandardIdentity.values()).filter(this::owns).map(IStandardIdentity.class::cast).toList();
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public boolean owns(IStandardIdentity id) {
        return id.getGroup() == this;
    }

}