package io.github.ctgnz.jmsfx.icon.airmissile;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IconType;

public enum AirMissileEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MISSILE("11", "Missile", IconType.MAIN);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    AirMissileEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.AIR_MISSILE;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}