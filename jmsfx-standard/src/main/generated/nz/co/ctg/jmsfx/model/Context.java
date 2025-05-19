package nz.co.ctg.jmsfx.model;

public enum Context implements SymbolIdentificationCodeElement {
    REALITY("0", "Reality"),
    EXERCISE("1", "Exercise"),
    SIMULATION("2", "Simulation"),
    RESTRICTED_TARGET("3", "Restricted Target"),
    NO_STRIKE_ENTITY("4", "No Strike Entity"),
    RESTRICTED_TARGET_EXERCISE("5", "Restricted Target - Exercise"),
    NO_STRIKE_ENTITY_EXERCISE("6", "No Strike Entity - Exercise"),
    RESTRICTED_TARGET_SIMULATION("7", "Restricted Target - Simulation"),
    NO_STRIKE_ENTITY_SIMULATION("8", "No Strike Entity - Simulation");

    private final String id;
    private final String label;
    
    private Context(String id, String label) {
        this.id = id;
        this.label = label;
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