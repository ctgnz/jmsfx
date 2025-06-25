package io.github.ctgnz.jmsfx.standard.dismountedindividual;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum DismountedIndividualSectorTwoModifier implements SectorTwoModifier {
    VIDEO_IMAGERY_MOD("03", "Video Imagery (Combat Camera)", "Task", SymbolSetEnum.DISMOUNTED),
    J1_MOD("04", "J1", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    J2_MOD("05", "J2", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    J3_MOD("06", "J3", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    J4_MOD("07", "J4", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    J5_MOD("08", "J5", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    J6_MOD("09", "J6", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    J7_MOD("10", "J7", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    J8_MOD("11", "J8", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    J9_MOD("12", "J9", "Functional Staff Area", SymbolSetEnum.DISMOUNTED),
    OF01_MOD("14", "OF-1", "Rank", SymbolSetEnum.DISMOUNTED),
    OF02_MOD("15", "OF-2", "Rank", SymbolSetEnum.DISMOUNTED),
    OF03_MOD("16", "OF-3", "Rank", SymbolSetEnum.DISMOUNTED),
    OF04_MOD("17", "OF-4", "Rank", SymbolSetEnum.DISMOUNTED),
    OF05_MOD("18", "OF-5", "Rank", SymbolSetEnum.DISMOUNTED),
    OF06_MOD("19", "OF-6", "Rank", SymbolSetEnum.DISMOUNTED),
    OF07_MOD("20", "OF-7", "Rank", SymbolSetEnum.DISMOUNTED),
    OF08_MOD("21", "OF-8", "Rank", SymbolSetEnum.DISMOUNTED),
    OF09_MOD("22", "OF-9", "Rank", SymbolSetEnum.DISMOUNTED),
    OF10_MOD("23", "OF-10", "Rank", SymbolSetEnum.DISMOUNTED),
    OFD_MOD("24", "OF-D", "Rank", SymbolSetEnum.DISMOUNTED),
    OR1_MOD("25", "OR-1", "Rank", SymbolSetEnum.DISMOUNTED),
    OR2_MOD("26", "OR-2", "Rank", SymbolSetEnum.DISMOUNTED),
    OR3_MOD("27", "OR-3", "Rank", SymbolSetEnum.DISMOUNTED),
    OR4_MOD("28", "OR-4", "Rank", SymbolSetEnum.DISMOUNTED),
    OR5_MOD("29", "OR-5", "Rank", SymbolSetEnum.DISMOUNTED),
    OR6_MOD("30", "OR-6", "Rank", SymbolSetEnum.DISMOUNTED),
    OR7_MOD("31", "OR-7", "Rank", SymbolSetEnum.DISMOUNTED),
    OR8_MOD("32", "OR-8", "Rank", SymbolSetEnum.DISMOUNTED),
    OR9_MOD("33", "OR-9", "Rank", SymbolSetEnum.DISMOUNTED),
    WO1_MOD("34", "WO-1", "Rank", SymbolSetEnum.DISMOUNTED),
    WO2_MOD("35", "WO-2", "Rank", SymbolSetEnum.DISMOUNTED),
    WO3_MOD("36", "WO-3", "Rank", SymbolSetEnum.DISMOUNTED),
    WO4_MOD("37", "WO-4", "Rank", SymbolSetEnum.DISMOUNTED),
    WO5_MOD("38", "WO-5", "Rank", SymbolSetEnum.DISMOUNTED);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    DismountedIndividualSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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