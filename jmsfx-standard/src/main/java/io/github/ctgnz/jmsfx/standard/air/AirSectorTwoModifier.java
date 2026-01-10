package io.github.ctgnz.jmsfx.standard.air;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum AirSectorTwoModifier implements SectorTwoModifier {
    BOOM("04", "Boom-Only", ModifierCategory.RefuelingCapability),
    DROGUE("05", "Drogue-Only", ModifierCategory.RefuelingCapability),
    BOOM_DROGUE("06", "Boom and Drogue", ModifierCategory.RefuelingCapability),
    DOWNLINK("11", "Downlinked", ModifierCategory.TrackLinkAvailability);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.AIR;
    }

}