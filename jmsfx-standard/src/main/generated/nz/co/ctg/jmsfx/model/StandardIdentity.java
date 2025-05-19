package nz.co.ctg.jmsfx.model;

public enum StandardIdentity implements SymbolIdentificationCodeElement {
    SI_PENDING("0", "Pending"),
    SI_UNKNOWN("1", "Unknown"),
    SI_ASSUMED_FRIEND("2", "Assumed Friend"),
    SI_FRIEND("3", "Friend"),
    SI_NEUTRAL("4", "Neutral"),
    SI_SUSPECT_JOKER("5", "Suspect/Joker"),
    SI_HOSTILE_FAKER("6", "Hostile/Faker");

    private final String id;
    private final String label;
    
    private StandardIdentity(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    public StandardIdentityGroup getGroup() {
        return StandardIdentityGroup.forId(this);
    }

    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }

}