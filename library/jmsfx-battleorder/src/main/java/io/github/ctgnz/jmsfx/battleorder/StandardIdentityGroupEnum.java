package io.github.ctgnz.jmsfx.battleorder;

import java.util.Arrays;
import java.util.List;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;

public enum StandardIdentityGroupEnum implements StandardIdentityGroup {
        UNKNOWN("1", "Unknown"),
        FRIEND("3", "Friend"),
        NEUTRAL("4", "Neutral"),
        HOSTILE("6", "Hostile");

    private final String id;
    private final String label;

    StandardIdentityGroupEnum(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public List<StandardIdentity> getIdentities() {
        return Arrays.stream(StandardIdentityEnum.values())
            .filter(this::owns)
            .map(StandardIdentity.class::cast)
            .toList();
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
    public boolean owns(StandardIdentity id) {
        return id.getGroup() == this;
    }

}