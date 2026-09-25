package io.github.ctgnz.jmsfx.hallux.seasurface;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.hallux.ModifierBounds;
import io.github.ctgnz.jmsfx.hallux.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum SeaSurfaceSectorOneModifier implements SectorOneModifier {
        OWN("01", "Own Ship", ModifierCategory.MissionArea),
        AA("02", "Antiair Warfare", ModifierCategory.MissionArea),
        MD("08", "Missile Defense", ModifierCategory.MissionArea),
        RMV("11", "Remote Multi-Mission Vehicle (USV-only)", ModifierCategory.MissionArea),
        TORPEDO("17", "Torpedo", ModifierCategory.WeaponsCapability),
        LRST("21", "Ballistic Missile Defense, Long-Range Surveillance and Track (LRST)", ModifierCategory.MissionArea),
        SEA_BASED_X("22", "Sea-Base X-Band", ModifierCategory.MissionArea);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SeaSurfaceSectorOneModifier(String id, String label, ModifierCategory category) {
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