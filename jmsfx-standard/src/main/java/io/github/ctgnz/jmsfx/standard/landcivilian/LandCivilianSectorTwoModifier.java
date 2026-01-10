package io.github.ctgnz.jmsfx.standard.landcivilian;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandCivilianSectorTwoModifier implements SectorTwoModifier {
    LEADER("01", "Leader or Leadership", ModifierCategory.Organization);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandCivilianSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_CIVILIAN;
    }

}