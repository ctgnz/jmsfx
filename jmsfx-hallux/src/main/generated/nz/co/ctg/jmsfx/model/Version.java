package nz.co.ctg.jmsfx.model;

public enum Version implements SymbolIdentificationCodeElement {
    Base("10", "No changes to APP-6(C)/2525D");

    private final String id;
    private final String label;
    
    private Version(String id, String label) {
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