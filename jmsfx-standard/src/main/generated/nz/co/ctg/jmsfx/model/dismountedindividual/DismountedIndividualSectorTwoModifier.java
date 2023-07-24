package nz.co.ctg.jmsfx.model.dismountedindividual;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum DismountedIndividualSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_TWO_MOD("00", "Unspecified", SymbolSet.SS_DISMOUNTED),
    AIRBORNE_MOD("01", "Airborne", SymbolSet.SS_DISMOUNTED),
    BICYCLE_MOD("02", "Bicycle Equipped", SymbolSet.SS_DISMOUNTED),
    DEMOLITION_MOD("03", "Demolition", SymbolSet.SS_DISMOUNTED),
    J1_MOD2("04", "J1", SymbolSet.SS_DISMOUNTED),
    J2_MOD2("05", "J2", SymbolSet.SS_DISMOUNTED),
    J3_MOD2("06", "J3", SymbolSet.SS_DISMOUNTED),
    J4_MOD2("07", "J4", SymbolSet.SS_DISMOUNTED),
    J5_MOD2("08", "J5", SymbolSet.SS_DISMOUNTED),
    J6_MOD2("09", "J6", SymbolSet.SS_DISMOUNTED),
    J7_MOD2("10", "J7", SymbolSet.SS_DISMOUNTED),
    J8_MOD2("11", "J8", SymbolSet.SS_DISMOUNTED),
    J9_MOD2("12", "J9", SymbolSet.SS_DISMOUNTED),
    MOUNTAIN_MOD2("13", "Mountain", SymbolSet.SS_DISMOUNTED),
    OF01_MOD2("14", "OF-1", SymbolSet.SS_DISMOUNTED),
    OF02_MOD2("15", "OF-2", SymbolSet.SS_DISMOUNTED),
    OF03_MOD2("16", "OF-3", SymbolSet.SS_DISMOUNTED),
    OF04_MOD2("17", "OF-4", SymbolSet.SS_DISMOUNTED),
    OF05_MOD2("18", "OF-5", SymbolSet.SS_DISMOUNTED),
    OF06_MOD2("19", "OF-6", SymbolSet.SS_DISMOUNTED),
    OF07_MOD2("20", "OF-7", SymbolSet.SS_DISMOUNTED),
    OF08_MOD2("21", "OF-8", SymbolSet.SS_DISMOUNTED),
    OF09_MOD2("22", "OF-9", SymbolSet.SS_DISMOUNTED),
    OF10_MOD2("23", "OF-10", SymbolSet.SS_DISMOUNTED),
    OFD_MOD2("24", "OF-D", SymbolSet.SS_DISMOUNTED),
    OR1_MOD2("25", "OR-1", SymbolSet.SS_DISMOUNTED),
    OR2_MOD2("26", "OR-2", SymbolSet.SS_DISMOUNTED),
    OR3_MOD2("27", "OR-3", SymbolSet.SS_DISMOUNTED),
    OR4_MOD2("28", "OR-4", SymbolSet.SS_DISMOUNTED),
    OR5_MOD2("29", "OR-5", SymbolSet.SS_DISMOUNTED),
    OR6_MOD2("30", "OR-6", SymbolSet.SS_DISMOUNTED),
    OR7_MOD2("31", "OR-7", SymbolSet.SS_DISMOUNTED),
    OR8_MOD2("32", "OR-8", SymbolSet.SS_DISMOUNTED),
    OR9_MOD2("33", "OR-9", SymbolSet.SS_DISMOUNTED),
    WO1_MOD2("34", "WO-1", SymbolSet.SS_DISMOUNTED),
    WO2_MOD2("35", "WO-2", SymbolSet.SS_DISMOUNTED),
    WO3_MOD2("36", "WO-3", SymbolSet.SS_DISMOUNTED),
    WO4_MOD2("37", "WO-4", SymbolSet.SS_DISMOUNTED),
    WO5_MOD2("38", "WO-5", SymbolSet.SS_DISMOUNTED),
    SKI_MOD2("39", "Ski", SymbolSet.SS_DISMOUNTED);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private DismountedIndividualSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.symbolSet = symbolSet;
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