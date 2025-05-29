package io.github.ctgnz.jmsfx.icon.air;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;

public enum AirSectorTwoModifier implements SectorTwoModifier {
    NOT_APPLICABLE_2_MOD("00", "Not Applicable", "General", SymbolSet.AIR),
    BOOM_MOD("04", "Boom-Only", "Re-fueling Capability", SymbolSet.AIR),
    DROGUE_MOD("05", "Drogue-Only", "Re-fueling Capability", SymbolSet.AIR),
    BOOM_DROGUE_MOD("06", "Boom and Drogue", "Re-fueling Capability", SymbolSet.AIR),
    DOWNLINK_MOD("11", "Downlinked", "Track Link Availability", SymbolSet.AIR);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private AirSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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