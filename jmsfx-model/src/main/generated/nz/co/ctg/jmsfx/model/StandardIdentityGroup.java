package nz.co.ctg.jmsfx.model;

import java.util.Arrays;

public enum StandardIdentityGroup implements SymbolIdentificationCodeElement {
    SIG_UNKNOWN("1", "Unknown", StandardIdentity.SI_PENDING, StandardIdentity.SI_UNKNOWN),
    SIG_FRIEND("3", "Friend", StandardIdentity.SI_ASSUMED_FRIEND, StandardIdentity.SI_FRIEND),
    SIG_NEUTRAL("4", "Neutral", StandardIdentity.SI_NEUTRAL),
    SIG_HOSTILE("6", "Hostile", StandardIdentity.SI_HOSTILE_FAKER, StandardIdentity.SI_SUSPECT_JOKER);

    public static StandardIdentityGroup forId(StandardIdentity id) {
        return Arrays.stream(StandardIdentityGroup.values()).filter(grp -> grp.owns(id)).findFirst().orElse(null);
    }

    private final String id;
    private final String label;
    private final StandardIdentity[] identities;
    
    private StandardIdentityGroup(String id, String label, StandardIdentity... identities) {
        this.id = id;
        this.label = label;
        this.identities = identities;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    public StandardIdentity[] getIdentities() {
        return identities;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
    
    public boolean owns(StandardIdentity id) {
        return Arrays.stream(identities).anyMatch(ident -> ident == id);
    }
    
}