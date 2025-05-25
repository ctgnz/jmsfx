package nz.co.ctg.jmsfx.model.seasurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum SeaSurfaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", "General", SymbolSet.SEA_SURFACE),
    NUCLEAR_MOD("01", "Nuclear Powered", "Ship Propulsion", SymbolSet.SEA_SURFACE),
    DOCK_MOD("05", "Dock", "Cargo Capacity", SymbolSet.SEA_SURFACE),
    LOGISTICS_MOD("06", "Logistics", "Cargo Capacity", SymbolSet.SEA_SURFACE),
    TANK_MOD("07", "Tank", "Cargo Capacity", SymbolSet.SEA_SURFACE),
    VEHICLE_MOD("08", "Vehicle", "Cargo Capacity", SymbolSet.SEA_SURFACE),
    FAST_MOD("09", "Fast", "Ship Mobility", SymbolSet.SEA_SURFACE),
    COMBINE_GEV_MOD("10", "Air-Cushioned (US)", "Ship Mobility", SymbolSet.SEA_SURFACE),
    PANEURO_GEV_MOD("11", "Air-Cushioned (NATO)", "Ship Mobility", SymbolSet.SEA_SURFACE),
    HYDROFOIL_MOD("12", "Hydrofoil", "Ship Mobility", SymbolSet.SEA_SURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private SeaSurfaceSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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