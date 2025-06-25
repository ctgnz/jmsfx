package io.github.ctgnz.jmsfx.icon.seasubsurface;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum SeaSubsurfaceSectorTwoModifier implements SectorTwoModifier {
    AIR_INDEPENDENT_PROPULSION_MOD("01", "Air Independent Propulsion", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    DIESEL_ELECTRIC_GENERAL_MOD("02", "Diesel Electric General", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    DIESEL___TYPE_1_MOD("03", "Diesel - Type 1", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    DIESEL___TYPE_2_MOD("04", "Diesel - Type 2", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    DIESEL___TYPE_3_MOD("05", "Diesel - Type 3", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR_POWERED_GENERAL_MOD("06", "Nuclear Powered General", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_1_MOD("07", "Nuclear - Type 1", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_2_MOD("08", "Nuclear - Type 2", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_3_MOD("09", "Nuclear - Type 3", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_4_MOD("10", "Nuclear - Type 4", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_5_MOD("11", "Nuclear - Type 5", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_6_MOD("12", "Nuclear - Type 6", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE),
    NUCLEAR___TYPE_7_MOD("13", "Nuclear - Type 7", "Ship Propulsion", SymbolSetEnum.SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    SeaSubsurfaceSectorTwoModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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