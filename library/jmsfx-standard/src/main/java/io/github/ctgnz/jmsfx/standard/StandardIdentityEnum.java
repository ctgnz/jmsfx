package io.github.ctgnz.jmsfx.standard;

import java.util.EnumSet;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;

public enum StandardIdentityEnum implements StandardIdentity {
        PENDING("0", StandardIdentityGroupEnum.UNKNOWN, "Pending"),
        UNKNOWN("1", StandardIdentityGroupEnum.UNKNOWN, "Unknown"),
        ASSUMED_FRIEND("2", StandardIdentityGroupEnum.FRIEND, "Assumed Friend"),
        FRIEND("3", StandardIdentityGroupEnum.FRIEND, "Friend"),
        NEUTRAL("4", StandardIdentityGroupEnum.NEUTRAL, "Neutral"),
        SUSPECT_JOKER("5", StandardIdentityGroupEnum.HOSTILE, "Suspect/Joker"),
        HOSTILE_FAKER("6", StandardIdentityGroupEnum.HOSTILE, "Hostile/Faker");

    private static final EnumSet<StandardIdentityEnum> KNOWN_IDENTITIES = EnumSet.of(UNKNOWN, FRIEND, NEUTRAL, HOSTILE_FAKER);
    private static final EnumSet<StandardIdentityEnum> HOSTILE_IDENTITIES = EnumSet.of(SUSPECT_JOKER, HOSTILE_FAKER);

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
    public String getName() {
        return name();
    }

    @Override
    public boolean isConfirmed() {
        return KNOWN_IDENTITIES.contains(this);
    }

    @Override
    public boolean isHostile() {
        return HOSTILE_IDENTITIES.contains(this);
    }

}