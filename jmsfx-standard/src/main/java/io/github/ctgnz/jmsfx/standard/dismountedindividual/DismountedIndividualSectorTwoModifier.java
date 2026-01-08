package io.github.ctgnz.jmsfx.standard.dismountedindividual;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum DismountedIndividualSectorTwoModifier implements SectorTwoModifier {
    VIDEO_IMAGERY("03", "Video Imagery (Combat Camera)", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    J1("04", "J1", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    J2("05", "J2", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    J3("06", "J3", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    J4("07", "J4", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    J5("08", "J5", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    J6("09", "J6", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    J7("10", "J7", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    J8("11", "J8", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    J9("12", "J9", ModifierCategory.FunctionalStaffArea, SymbolSetEnum.DISMOUNTED),
    OF01("14", "OF-1", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF02("15", "OF-2", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF03("16", "OF-3", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF04("17", "OF-4", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF05("18", "OF-5", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF06("19", "OF-6", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF07("20", "OF-7", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF08("21", "OF-8", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF09("22", "OF-9", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OF10("23", "OF-10", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OFD("24", "OF-D", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR1("25", "OR-1", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR2("26", "OR-2", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR3("27", "OR-3", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR4("28", "OR-4", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR5("29", "OR-5", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR6("30", "OR-6", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR7("31", "OR-7", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR8("32", "OR-8", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    OR9("33", "OR-9", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    WO1("34", "WO-1", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    WO2("35", "WO-2", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    WO3("36", "WO-3", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    WO4("37", "WO-4", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED),
    WO5("38", "WO-5", ModifierCategory.Rank, SymbolSetEnum.DISMOUNTED);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    DismountedIndividualSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }

    @Override
    public ModifierCategory getCategory() {
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