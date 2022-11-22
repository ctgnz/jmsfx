package nz.co.ctg.jmsfx.model.landunits;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandUnitsSpecialEntitySubType implements EntitySubType {
    HQ_ELEMENT("95", "Headquarters Element", "10xxxx95"),
    DIVISION_AND_BELOW_SUPPORT("96", "Division and Below Support", "10xxxx96"),
    CORPS_SUPPORT("97", "Corps Support", "10xxxx97"),
    ECHELONS_ABOVE_CORPS_SUPPORT("98", "Theater/Echelons Above Corps Support", "10xxxx98");

    private final String id;
    private final String label;
    private final String graphicIdentifier;
    
    private LandUnitsSpecialEntitySubType(String id, String label, String graphicIdentifier) {
        this.id = id;
        this.label = label;
        this.graphicIdentifier = graphicIdentifier;
    }
    
    @Override
    public Entity getEntity() {
        return null;
    }
    
    @Override
    public EntityType getEntityType() {
        return null;
    }
    
    @Override
    public String getGraphicIdentifier() {
        return graphicIdentifier;
    }

    @Override
    public IconType getIconType() {
        return IconType.SPECIAL;
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
    public boolean isFullFrameIcon() {
        return true;
    }
    
}