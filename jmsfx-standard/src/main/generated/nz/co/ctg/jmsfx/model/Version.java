package nz.co.ctg.jmsfx.model;

public enum Version implements SymbolIdentificationCodeElement {
    ORIGINAL("10", "APP-6(D)/MIL-STD-2525D October 2017"),
    MS2525D1("11", "MIL-STD-2525D Chg 1 August 2018"),
    MS2525E("13", "MIL-STD-2525E December 2022"),
    CURRENT("14", "APP-6(E) October 2023");

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