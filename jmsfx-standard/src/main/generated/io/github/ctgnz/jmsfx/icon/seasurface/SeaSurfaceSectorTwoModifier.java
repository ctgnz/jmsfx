package io.github.ctgnz.jmsfx.icon.seasurface;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum SeaSurfaceSectorTwoModifier implements SectorTwoModifier {
    NUCLEAR_MOD("01", "Nuclear Powered", "Ship Propulsion", SymbolSetEnum.SEA_SURFACE),
    DOCK_MOD("05", "Dock", "Cargo Capacity", SymbolSetEnum.SEA_SURFACE),
    LOGISTICS_MOD("06", "Logistics", "Cargo Capacity", SymbolSetEnum.SEA_SURFACE),
    TANK_MOD("07", "Tank", "Cargo Capacity", SymbolSetEnum.SEA_SURFACE),
    VEHICLE_MOD("08", "Vehicle", "Cargo Capacity", SymbolSetEnum.SEA_SURFACE),
    FAST_MOD("09", "Fast", "Ship Mobility", SymbolSetEnum.SEA_SURFACE),
    COMBINE_GEV_MOD("10", "Air-Cushioned (US)", "Ship Mobility", SymbolSetEnum.SEA_SURFACE),
    PANEURO_GEV_MOD("11", "Air-Cushioned (NATO)", "Ship Mobility", SymbolSetEnum.SEA_SURFACE),
    HYDROFOIL_MOD("12", "Hydrofoil", "Ship Mobility", SymbolSetEnum.SEA_SURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    SeaSurfaceSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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