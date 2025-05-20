package nz.co.ctg.jmsfx.model.seasurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum SeaSurfaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_SEA_SURFACE),
    NUCLEAR_MOD("01", "Nuclear Powered", SymbolSet.SS_SEA_SURFACE),
    DOCK_MOD("05", "Dock", SymbolSet.SS_SEA_SURFACE),
    LOGISTICS_MOD("06", "Logistics", SymbolSet.SS_SEA_SURFACE),
    TANK_MOD("07", "Tank", SymbolSet.SS_SEA_SURFACE),
    VEHICLE_MOD("08", "Vehicle", SymbolSet.SS_SEA_SURFACE),
    FAST_MOD("09", "Fast", SymbolSet.SS_SEA_SURFACE),
    COMBINE_GEV_MOD("10", "Air-Cushioned (US)", SymbolSet.SS_SEA_SURFACE),
    PANEURO_GEV_MOD("11", "Air-Cushioned (NATO)", SymbolSet.SS_SEA_SURFACE),
    HYDROFOIL_MOD("12", "Hydrofoil", SymbolSet.SS_SEA_SURFACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SeaSurfaceSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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