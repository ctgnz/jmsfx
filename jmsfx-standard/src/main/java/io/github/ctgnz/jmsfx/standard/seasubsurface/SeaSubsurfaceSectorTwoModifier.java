package io.github.ctgnz.jmsfx.standard.seasubsurface;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum SeaSubsurfaceSectorTwoModifier implements SectorTwoModifier {
    AIR_INDEPENDENT_PROPULSION("01", "Air Independent Propulsion", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    DIESEL_ELECTRIC_GENERAL("02", "Diesel Electric General", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    DIESEL___TYPE_1("03", "Diesel - Type 1", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    DIESEL___TYPE("04", "Diesel - Type 2", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    DIESEL___TYPE_3("05", "Diesel - Type 3", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR_POWERED_GENERAL("06", "Nuclear Powered General", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_1("07", "Nuclear - Type 1", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE("08", "Nuclear - Type 2", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_3("09", "Nuclear - Type 3", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_4("10", "Nuclear - Type 4", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_5("11", "Nuclear - Type 5", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_6("12", "Nuclear - Type 6", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_7("13", "Nuclear - Type 7", ModifierCategory.ShipPropulsion, SymbolSetEnum.SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    SeaSubsurfaceSectorTwoModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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