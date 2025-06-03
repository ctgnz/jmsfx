package io.github.ctgnz.jmsfx.icon.internal;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum InternalEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    INVALID("10", "Invalid Symbol", IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    InternalEntity(String id, String label, IconType iconType) {
        this.id = id;
        this.label = label;
        this.iconType = iconType;
    }
    
    @Override
    public IconType getIconType() {
        return iconType;
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
        return SymbolSet.INTERNAL;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}