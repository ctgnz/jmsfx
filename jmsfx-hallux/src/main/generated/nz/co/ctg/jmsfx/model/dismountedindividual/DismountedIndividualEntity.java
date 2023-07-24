package nz.co.ctg.jmsfx.model.dismountedindividual;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum DismountedIndividualEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    MILITARY("11", "Military", IconType.NA),
    CIVILIAN2("12", "Civilian", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private DismountedIndividualEntity(String id, String label, IconType iconType) {
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
        return SymbolSet.SS_DISMOUNTED;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return DismountedIndividualSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}