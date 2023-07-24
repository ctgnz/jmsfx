package nz.co.ctg.jmsfx.model.cyberspace;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum CyberspaceEntitySubType implements EntitySubType {
    APT_WITH_C2("01", "APT with C2", CyberspaceEntityType.ADVANCED_PERSISTENT_THREAT_APT, IconType.MAIN),
    APT_WITH_SELF_PROPAGATION("02", "APT with Self Propagation", CyberspaceEntityType.ADVANCED_PERSISTENT_THREAT_APT, IconType.MAIN),
    APT_WITH_C2_AND_SELF_PROPAGATION("03", "APT with C2 and Self Propagation", CyberspaceEntityType.ADVANCED_PERSISTENT_THREAT_APT, IconType.MAIN),
    APT_OTHER("04", "APT Other", CyberspaceEntityType.ADVANCED_PERSISTENT_THREAT_APT, IconType.MAIN),
    NAPT_WITH_C2("01", "NAPT with C2", CyberspaceEntityType.NON_ADVANCED_PERSISTENT_THREAT_NAPT, IconType.MAIN),
    NAPT_WITH_SELF_PROPAGATION("02", "NAPT with Self Propagation", CyberspaceEntityType.NON_ADVANCED_PERSISTENT_THREAT_NAPT, IconType.MAIN),
    NAPT_WITH_C2_AND_SELF_PROPAGATION("03", "NAPT with C2 and Self Propagation", CyberspaceEntityType.NON_ADVANCED_PERSISTENT_THREAT_NAPT, IconType.MAIN),
    NAPT_OTHER("04", "NAPT Other", CyberspaceEntityType.NON_ADVANCED_PERSISTENT_THREAT_NAPT, IconType.MAIN);

    private final String id;
    private final String label;
    private final CyberspaceEntityType entityType;
    private final IconType iconType;
    
    private CyberspaceEntitySubType(String id, String label, CyberspaceEntityType entityType, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
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
    public EntityType getEntityType() {
        return entityType;
    }
    
}