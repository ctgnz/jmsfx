package io.github.ctgnz.jmsfx.standard.seasurface;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum SeaSurfaceSectorTwoModifier implements SectorTwoModifier {
    NUCLEAR("01", "Nuclear Powered", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SURFACE),
    DOCK("05", "Dock", ModifierCategory.CargoCapacity, SymbolSetEnum.SEA_SURFACE),
    LOGISTICS("06", "Logistics", ModifierCategory.CargoCapacity, SymbolSetEnum.SEA_SURFACE),
    TANK("07", "Tank", ModifierCategory.CargoCapacity, SymbolSetEnum.SEA_SURFACE),
    VEHICLE("08", "Vehicle", ModifierCategory.CargoCapacity, SymbolSetEnum.SEA_SURFACE),
    FAST("09", "Fast", ModifierCategory.ShipMobility, SymbolSetEnum.SEA_SURFACE),
    COMBINE_GEV("10", "Air-Cushioned (US)", ModifierCategory.ShipMobility, SymbolSetEnum.SEA_SURFACE),
    PANEURO_GEV("11", "Air-Cushioned (NATO)", ModifierCategory.ShipMobility, SymbolSetEnum.SEA_SURFACE),
    HYDROFOIL("12", "Hydrofoil", ModifierCategory.ShipMobility, SymbolSetEnum.SEA_SURFACE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    SeaSurfaceSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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