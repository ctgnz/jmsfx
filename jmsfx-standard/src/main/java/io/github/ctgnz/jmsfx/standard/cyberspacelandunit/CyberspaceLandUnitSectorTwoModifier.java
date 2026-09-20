package io.github.ctgnz.jmsfx.standard.cyberspacelandunit;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.ModifierBounds;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum CyberspaceLandUnitSectorTwoModifier implements SectorTwoModifier {
        SECURED("01", "Secured", ModifierCategory.None),
        OPEN("02", "Open", ModifierCategory.None);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    CyberspaceLandUnitSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.CYBERSPACE_LAND_UNIT;
    }

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}