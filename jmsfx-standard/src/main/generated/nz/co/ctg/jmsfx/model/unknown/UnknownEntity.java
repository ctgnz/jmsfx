package nz.co.ctg.jmsfx.model.unknown;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum UnknownEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private UnknownEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_UNKNOWN;
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}