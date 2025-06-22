package io.github.ctgnz.jmsfx.icon;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;

public enum StandardIdentityEnum implements StandardIdentity {
    SI_PENDING("0", StandardIdentityGroupEnum.SIG_UNKNOWN, "Pending"),
    SI_UNKNOWN("1", StandardIdentityGroupEnum.SIG_UNKNOWN, "Unknown"),
    SI_ASSUMED_FRIEND("2", StandardIdentityGroupEnum.SIG_FRIEND, "Assumed Friend"),
    SI_FRIEND("3", StandardIdentityGroupEnum.SIG_FRIEND, "Friend"),
    SI_NEUTRAL("4", StandardIdentityGroupEnum.SIG_NEUTRAL, "Neutral"),
    SI_SUSPECT_JOKER("5", StandardIdentityGroupEnum.SIG_HOSTILE, "Suspect/Joker"),
    SI_HOSTILE_FAKER("6", StandardIdentityGroupEnum.SIG_HOSTILE, "Hostile/Faker");

    private final String id;
    private final StandardIdentityGroup group;
    private final String label;

    StandardIdentityEnum(String id, StandardIdentityGroup group, String label) {
        this.id = id;
        this.group = group;
        this.label = label;
    }

    @Override
    public StandardIdentityGroup getGroup() {
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