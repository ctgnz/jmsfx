package nz.co.ctg.jmsfx.model.landequipment;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum LandEquipmentSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_LAND_EQUIPMENT),
    TRACTOR_TRAILER_MOD("06", "Tractor Trailer", SymbolSet.SS_LAND_EQUIPMENT);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private LandEquipmentSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.symbolSet = symbolSet;
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