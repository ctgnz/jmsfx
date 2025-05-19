package nz.co.ctg.jmsfx.model;

public enum Status implements SymbolIdentificationCodeElement {
    PRESENT("0", "Present"),
    PLANNED("1", "Planned/Anticipated/Suspect"),
    FULLY_CAPABLE("2", "Present/Fully Capable"),
    DAMAGED("3", "Present/Damaged"),
    DESTROYED("4", "Present/Destroyed"),
    FULL("5", "Present/Full to Capacity");

    private final String id;
    private final String label;
    
    private Status(String id, String label) {
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