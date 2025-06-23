package io.github.ctgnz.jmsfx.generator.model;

import java.util.Set;

import io.github.ctgnz.jmsfx.generator.schema.Library.StandardIdentities.StandardIdentity;

public class StandardIdentityModel extends StandardEnumModel {

    private static final Set<String> KNOWN_IDENTITIES = Set.of("SI_UNKNOWN", "SI_FRIEND", "SI_NEUTRAL", "SI_HOSTILE_FAKER");
    private static final Set<String> HOSTILE_IDENTITIES = Set.of("SI_SUSPECT_JOKER", "SI_HOSTILE_FAKER");
    private final String groupID;

    public StandardIdentityModel(StandardIdentity identity) {
        super(identity.getID(), identity.getLabel(), Integer.toString(identity.getStandardIdentityCode()), null);
        this.groupID = identity.getGroupID();
    }

    public String getGroupID() {
        return groupID;
    }

    public boolean isConfirmed() {
        return KNOWN_IDENTITIES.contains(id);
    }

    public boolean isHostile() {
        return HOSTILE_IDENTITIES.contains(id);
    }

}
