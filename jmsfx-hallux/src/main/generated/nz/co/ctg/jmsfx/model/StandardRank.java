package nz.co.ctg.jmsfx.model;

public enum StandardRank implements AmplifierGroup {
    RANK_OR1("71", "OR-1"),
    RANK_OR2("72", "OR-2"),
    RANK_OR3("73", "OR-3"),
    RANK_OR4("74", "OR-4"),
    RANK_OR5("75", "OR-5"),
    RANK_OR6("76", "OR-6"),
    RANK_OR7("77", "OR-7"),
    RANK_OR8("78", "OR-8"),
    RANK_OR9("79", "OR-9"),
    RANK_WO1("81", "WO-1"),
    RANK_WO2("82", "WO-2"),
    RANK_WO3("83", "WO-3"),
    RANK_WO4("84", "WO-4"),
    RANK_WO5("85", "WO-5"),
    RANK_OFD("88", "OF(D)"),
    RANK_OF1A("89", "OF-1A"),
    RANK_OF1("90", "OF-1"),
    RANK_OF2("91", "OF-2"),
    RANK_OF3("92", "OF-3"),
    RANK_OF4("93", "OF-4"),
    RANK_OF5("94", "OF-5"),
    RANK_OF6("95", "OF-6"),
    RANK_OF7("96", "OF-7"),
    RANK_OF8("97", "OF-8"),
    RANK_OF9("98", "OF-9"),
    RANK_OF10("99", "OF-10");

    private final String id;
    private final String label;
    
    private StandardRank(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicLocation() {
        return "Extension";
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