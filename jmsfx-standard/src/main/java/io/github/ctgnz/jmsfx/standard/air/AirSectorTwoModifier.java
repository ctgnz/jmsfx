package io.github.ctgnz.jmsfx.standard.air;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum AirSectorTwoModifier implements SectorTwoModifier {
    BOOM("04", "Boom-Only", ModifierCategory.RefuelingCapability, SymbolSetEnum.AIR),
    DROGUE("05", "Drogue-Only", ModifierCategory.RefuelingCapability, SymbolSetEnum.AIR),
    BOOM_DROGUE("06", "Boom and Drogue", ModifierCategory.RefuelingCapability, SymbolSetEnum.AIR),
    DOWNLINK("11", "Downlinked", ModifierCategory.TrackLinkAvailability, SymbolSetEnum.AIR);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    AirSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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