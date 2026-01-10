package io.github.ctgnz.jmsfx.standard.dismountedindividual;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum DismountedIndividualSectorTwoModifier implements SectorTwoModifier {
    VIDEO_IMAGERY("03", "Video Imagery (Combat Camera)", ModifierCategory.Task),
    J1("04", "J1", ModifierCategory.FunctionalStaffArea),
    J2("05", "J2", ModifierCategory.FunctionalStaffArea),
    J3("06", "J3", ModifierCategory.FunctionalStaffArea),
    J4("07", "J4", ModifierCategory.FunctionalStaffArea),
    J5("08", "J5", ModifierCategory.FunctionalStaffArea),
    J6("09", "J6", ModifierCategory.FunctionalStaffArea),
    J7("10", "J7", ModifierCategory.FunctionalStaffArea),
    J8("11", "J8", ModifierCategory.FunctionalStaffArea),
    J9("12", "J9", ModifierCategory.FunctionalStaffArea),
    OF01("14", "OF-1", ModifierCategory.Rank),
    OF02("15", "OF-2", ModifierCategory.Rank),
    OF03("16", "OF-3", ModifierCategory.Rank),
    OF04("17", "OF-4", ModifierCategory.Rank),
    OF05("18", "OF-5", ModifierCategory.Rank),
    OF06("19", "OF-6", ModifierCategory.Rank),
    OF07("20", "OF-7", ModifierCategory.Rank),
    OF08("21", "OF-8", ModifierCategory.Rank),
    OF09("22", "OF-9", ModifierCategory.Rank),
    OF10("23", "OF-10", ModifierCategory.Rank),
    OFD("24", "OF-D", ModifierCategory.Rank),
    OR1("25", "OR-1", ModifierCategory.Rank),
    OR2("26", "OR-2", ModifierCategory.Rank),
    OR3("27", "OR-3", ModifierCategory.Rank),
    OR4("28", "OR-4", ModifierCategory.Rank),
    OR5("29", "OR-5", ModifierCategory.Rank),
    OR6("30", "OR-6", ModifierCategory.Rank),
    OR7("31", "OR-7", ModifierCategory.Rank),
    OR8("32", "OR-8", ModifierCategory.Rank),
    OR9("33", "OR-9", ModifierCategory.Rank),
    WO1("34", "WO-1", ModifierCategory.Rank),
    WO2("35", "WO-2", ModifierCategory.Rank),
    WO3("36", "WO-3", ModifierCategory.Rank),
    WO4("37", "WO-4", ModifierCategory.Rank),
    WO5("38", "WO-5", ModifierCategory.Rank);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    DismountedIndividualSectorTwoModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
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
        return SymbolSetEnum.DISMOUNTED;
    }

}