package io.github.ctgnz.jmsfx.historical.seasurface;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.ModifierBounds;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum SeaSurfaceSectorTwoModifier implements SectorTwoModifier {
        NUCLEAR("01", "Nuclear Powered", ModifierCategory.ShipPropulsion),
        DOCK("05", "Dock", ModifierCategory.CargoCapacity),
        LOGISTICS("06", "Logistics", ModifierCategory.CargoCapacity),
        TANK("07", "Tank", ModifierCategory.CargoCapacity),
        VEHICLE("08", "Vehicle", ModifierCategory.CargoCapacity),
        FAST("09", "Fast", ModifierCategory.ShipMobility),
        COMBINE_GEV("10", "Air-Cushioned (US)", ModifierCategory.ShipMobility),
        PANEURO_GEV("11", "Air-Cushioned (NATO)", ModifierCategory.ShipMobility),
        HYDROFOIL("12", "Hydrofoil", ModifierCategory.ShipMobility);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SeaSurfaceSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.SEA_SURFACE;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}