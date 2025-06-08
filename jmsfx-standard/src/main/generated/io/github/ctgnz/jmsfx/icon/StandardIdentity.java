package io.github.ctgnz.jmsfx.icon;

import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStandardIdentityGroup;

public enum StandardIdentity implements IStandardIdentity {
    SI_PENDING("0", StandardIdentityGroup.SIG_UNKNOWN, "Pending"),
    SI_UNKNOWN("1", StandardIdentityGroup.SIG_UNKNOWN, "Unknown"),
    SI_ASSUMED_FRIEND("2", StandardIdentityGroup.SIG_FRIEND, "Assumed Friend"),
    SI_FRIEND("3", StandardIdentityGroup.SIG_FRIEND, "Friend"),
    SI_NEUTRAL("4", StandardIdentityGroup.SIG_NEUTRAL, "Neutral"),
    SI_SUSPECT_JOKER("5", StandardIdentityGroup.SIG_HOSTILE, "Suspect/Joker"),
    SI_HOSTILE_FAKER("6", StandardIdentityGroup.SIG_HOSTILE, "Hostile/Faker");

    private final String id;
    private final IStandardIdentityGroup group;
    private final String label;

    StandardIdentity(String id, IStandardIdentityGroup group, String label) {
        this.id = id;
        this.group = group;
        this.label = label;
    }

    @Override
    public IStandardIdentityGroup getGroup() {
        return group;
    }

    @Override
    public String getGroupId() {
        return group.getId();
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
    public boolean isConfirmed() {
        return Library.getKnownIdentities().contains(this);
    }

    @Override
    public boolean isHostile() {
        return Library.getHostileIdentities().contains(this);
    }

}