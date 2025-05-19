package nz.co.ctg.jmsfx.model;

public enum HqtfDummy implements SymbolIdentificationCodeElement {
    NA("0", "Not Applicable"),
    FEINT_DUMMY("1", "Feint/Dummy"),
    HQ("2", "Headquarters"),
    FEINT_DUMMY_HQ("3", "Feint/Dummy Headquarters"),
    TF("4", "Task Force"),
    FEINT_DUMMY_TF("5", "Feint/Dummy Task Force"),
    TF_HQ("6", "Task Force Headquarters"),
    FEINT_DUMMY_TF_HQ("7", "Feint/Dummy Task Force Headquarters");

    private final String id;
    private final String label;
    
    private HqtfDummy(String id, String label) {
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