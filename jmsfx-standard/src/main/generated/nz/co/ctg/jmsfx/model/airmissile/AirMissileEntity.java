package nz.co.ctg.jmsfx.model.airmissile;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum AirMissileEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MISSILE("11", "Missile", IconType.MAIN);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private AirMissileEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_AIR_MISSILE;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}