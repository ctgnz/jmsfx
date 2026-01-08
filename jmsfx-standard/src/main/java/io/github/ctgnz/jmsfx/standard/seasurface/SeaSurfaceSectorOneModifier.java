package io.github.ctgnz.jmsfx.standard.seasurface;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum SeaSurfaceSectorOneModifier implements SectorOneModifier {
    OWN("01", "Own Ship", ModifierCategory.MissionArea, SymbolSetEnum.SEA_SURFACE),
    AA("02", "Antiair Warfare", ModifierCategory.MissionArea, SymbolSetEnum.SEA_SURFACE),
    MD("08", "Missile Defense", ModifierCategory.MissionArea, SymbolSetEnum.SEA_SURFACE),
    RMV("11", "Remote Multi-Mission Vehicle (USV-only)", ModifierCategory.MissionArea, SymbolSetEnum.SEA_SURFACE),
    TORPEDO("17", "Torpedo", ModifierCategory.WeaponsCapability, SymbolSetEnum.SEA_SURFACE),
    LRST("21", "Ballistic Missile Defense, Long-Range Surveillance and Track (LRST)", ModifierCategory.MissionArea, SymbolSetEnum.SEA_SURFACE),
    SEA_BASED_X("22", "Sea-Base X-Band", ModifierCategory.MissionArea, SymbolSetEnum.SEA_SURFACE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    SeaSurfaceSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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