package io.github.ctgnz.jmsfx.icon.dismountedindividual;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;

public enum DismountedIndividualSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_TWO_MOD("00", "Unspecified", "General", SymbolSet.DISMOUNTED),
    VIDEO_IMAGERY_MOD("03", "Video Imagery (Combat Camera)", "Task", SymbolSet.DISMOUNTED),
    J1_MOD("04", "J1", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J2_MOD("05", "J2", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J3_MOD("06", "J3", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J4_MOD("07", "J4", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J5_MOD("08", "J5", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J6_MOD("09", "J6", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J7_MOD("10", "J7", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J8_MOD("11", "J8", "Functional Staff Area", SymbolSet.DISMOUNTED),
    J9_MOD("12", "J9", "Functional Staff Area", SymbolSet.DISMOUNTED),
    OF01_MOD("14", "OF-1", "Rank", SymbolSet.DISMOUNTED),
    OF02_MOD("15", "OF-2", "Rank", SymbolSet.DISMOUNTED),
    OF03_MOD("16", "OF-3", "Rank", SymbolSet.DISMOUNTED),
    OF04_MOD("17", "OF-4", "Rank", SymbolSet.DISMOUNTED),
    OF05_MOD("18", "OF-5", "Rank", SymbolSet.DISMOUNTED),
    OF06_MOD("19", "OF-6", "Rank", SymbolSet.DISMOUNTED),
    OF07_MOD("20", "OF-7", "Rank", SymbolSet.DISMOUNTED),
    OF08_MOD("21", "OF-8", "Rank", SymbolSet.DISMOUNTED),
    OF09_MOD("22", "OF-9", "Rank", SymbolSet.DISMOUNTED),
    OF10_MOD("23", "OF-10", "Rank", SymbolSet.DISMOUNTED),
    OFD_MOD("24", "OF-D", "Rank", SymbolSet.DISMOUNTED),
    OR1_MOD("25", "OR-1", "Rank", SymbolSet.DISMOUNTED),
    OR2_MOD("26", "OR-2", "Rank", SymbolSet.DISMOUNTED),
    OR3_MOD("27", "OR-3", "Rank", SymbolSet.DISMOUNTED),
    OR4_MOD("28", "OR-4", "Rank", SymbolSet.DISMOUNTED),
    OR5_MOD("29", "OR-5", "Rank", SymbolSet.DISMOUNTED),
    OR6_MOD("30", "OR-6", "Rank", SymbolSet.DISMOUNTED),
    OR7_MOD("31", "OR-7", "Rank", SymbolSet.DISMOUNTED),
    OR8_MOD("32", "OR-8", "Rank", SymbolSet.DISMOUNTED),
    OR9_MOD("33", "OR-9", "Rank", SymbolSet.DISMOUNTED),
    WO1_MOD("34", "WO-1", "Rank", SymbolSet.DISMOUNTED),
    WO2_MOD("35", "WO-2", "Rank", SymbolSet.DISMOUNTED),
    WO3_MOD("36", "WO-3", "Rank", SymbolSet.DISMOUNTED),
    WO4_MOD("37", "WO-4", "Rank", SymbolSet.DISMOUNTED),
    WO5_MOD("38", "WO-5", "Rank", SymbolSet.DISMOUNTED);

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