package io.github.ctgnz.jmsfx.standard.minewarfare;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.ModifierBounds;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum MineWarfareSectorOneModifier implements SectorOneModifier {
    ;

    private final String id;
    private final String label;
    private final ModifierCategory category;

    MineWarfareSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.MINE_WARFARE;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}