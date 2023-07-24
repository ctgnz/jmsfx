package nz.co.ctg.jmsfx.model;

public enum Context implements SymbolIdentificationCodeElement {
    REALITY("0", "Reality"),
    EXERCISE("1", "Exercise"),
    SIMULATION("2", "Simulation"),
    EXTENSION("9", "Extension");

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