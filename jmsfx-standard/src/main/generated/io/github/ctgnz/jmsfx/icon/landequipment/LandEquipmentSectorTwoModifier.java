package io.github.ctgnz.jmsfx.icon.landequipment;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;

public enum LandEquipmentSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSet.LAND_EQUIPMENT),
    TRACTOR_TRAILER_MOD("06", "Tractor Trailer", "Capability", SymbolSet.LAND_EQUIPMENT);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private LandEquipmentSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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