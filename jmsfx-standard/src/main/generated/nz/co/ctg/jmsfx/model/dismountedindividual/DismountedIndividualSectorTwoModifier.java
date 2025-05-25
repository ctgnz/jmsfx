package nz.co.ctg.jmsfx.model.dismountedindividual;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum DismountedIndividualSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_TWO_MOD("00", "Unspecified", "General", SymbolSet.DISMOUNTED),
    VIDEO_IMAGERY_MOD2("03", "Video Imagery (Combat Camera)", "Task", SymbolSet.DISMOUNTED),
    J1_MOD2("04", "J1", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J2_MOD2("05", "J2", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J3_MOD2("06", "J3", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J4_MOD2("07", "J4", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J5_MOD2("08", "J5", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J6_MOD2("09", "J6", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J7_MOD2("10", "J7", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J8_MOD2("11", "J8", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J9_MOD2("12", "J9", "Functional Staff Area", SymbolSet.DISMOUNTED),
    OF01_MOD2("14", "OF-1", "Rank", SymbolSet.DISMOUNTED),
    OF02_MOD2("15", "OF-2", "Rank", SymbolSet.DISMOUNTED),
    OF03_MOD2("16", "OF-3", "Rank", SymbolSet.DISMOUNTED),
    OF04_MOD2("17", "OF-4", "Rank", SymbolSet.DISMOUNTED),
    OF05_MOD2("18", "OF-5", "Rank", SymbolSet.DISMOUNTED),
    OF06_MOD2("19", "OF-6", "Rank", SymbolSet.DISMOUNTED),
    OF07_MOD2("20", "OF-7", "Rank", SymbolSet.DISMOUNTED),
    OF08_MOD2("21", "OF-8", "Rank", SymbolSet.DISMOUNTED),
    OF09_MOD2("22", "OF-9", "Rank", SymbolSet.DISMOUNTED),
    OF10_MOD2("23", "OF-10", "Rank", SymbolSet.DISMOUNTED),
    OFD_MOD2("24", "OF-D", "Rank", SymbolSet.DISMOUNTED),
    OR1_MOD2("25", "OR-1", "Rank", SymbolSet.DISMOUNTED),
    OR2_MOD2("26", "OR-2", "Rank", SymbolSet.DISMOUNTED),
    OR3_MOD2("27", "OR-3", "Rank", SymbolSet.DISMOUNTED),
    OR4_MOD2("28", "OR-4", "Rank", SymbolSet.DISMOUNTED),
    OR5_MOD2("29", "OR-5", "Rank", SymbolSet.DISMOUNTED),
    OR6_MOD2("30", "OR-6", "Rank", SymbolSet.DISMOUNTED),
    OR7_MOD2("31", "OR-7", "Rank", SymbolSet.DISMOUNTED),
    OR8_MOD2("32", "OR-8", "Rank", SymbolSet.DISMOUNTED),
    OR9_MOD2("33", "OR-9", "Rank", SymbolSet.DISMOUNTED),
    WO1_MOD2("34", "WO-1", "Rank", SymbolSet.DISMOUNTED),
    WO2_MOD2("35", "WO-2", "Rank", SymbolSet.DISMOUNTED),
    WO3_MOD2("36", "WO-3", "Rank", SymbolSet.DISMOUNTED),
    WO4_MOD2("37", "WO-4", "Rank", SymbolSet.DISMOUNTED),
    WO5_MOD2("38", "WO-5", "Rank", SymbolSet.DISMOUNTED);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private DismountedIndividualSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }
    
    @Override
    public String getCategory() {
        return category;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public SymbolSet getSymbolSet() {
        return symbolSet;
    }
    
}