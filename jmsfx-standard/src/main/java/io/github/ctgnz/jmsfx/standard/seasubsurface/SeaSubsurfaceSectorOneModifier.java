package io.github.ctgnz.jmsfx.standard.seasubsurface;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum SeaSubsurfaceSectorOneModifier implements SectorOneModifier {
    AUXILIARY("02", "Auxiliary", ModifierCategory.MissionArea),
    POSSIBLE_SUBMARINE_LOW_1("13", "Possible Submarine Low 1", ModifierCategory.SubmarineConfidence),
    POSSIBLE_SUBMARINE_LOW("14", "Possible Submarine Low 2", ModifierCategory.SubmarineConfidence),
    POSSIBLE_SUBMARINE_HIGH_3("15", "Possible Submarine High 3", ModifierCategory.SubmarineConfidence),
    POSSIBLE_SUBMARINE_HIGH_4("16", "Possible Submarine High 4", ModifierCategory.SubmarineConfidence),
    PROBABLE_SUBMARINE("17", "Probable Submarine", ModifierCategory.SubmarineConfidence),
    CERTAIN_SUBMARINE("18", "Certain Submarine", ModifierCategory.SubmarineConfidence),
    ANTI_TORPEDO_TORPEDO("19", "Anti-torpedo Torpedo", ModifierCategory.WeaponsCapability);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SeaSubsurfaceSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.SEA_SUBSURFACE;
    }

}