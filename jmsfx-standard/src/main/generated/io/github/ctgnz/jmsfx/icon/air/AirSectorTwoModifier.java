package io.github.ctgnz.jmsfx.icon.air;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum AirSectorTwoModifier implements SectorTwoModifier {
    NOT_APPLICABLE_2_MOD("00", "Not Applicable", "General", SymbolSetEnum.AIR),
    BOOM_MOD("04", "Boom-Only", "Re-fueling Capability", SymbolSetEnum.AIR),
    DROGUE_MOD("05", "Drogue-Only", "Re-fueling Capability", SymbolSetEnum.AIR),
    BOOM_DROGUE_MOD("06", "Boom and Drogue", "Re-fueling Capability", SymbolSetEnum.AIR),
    DOWNLINK_MOD("11", "Downlinked", "Track Link Availability", SymbolSetEnum.AIR);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    AirSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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