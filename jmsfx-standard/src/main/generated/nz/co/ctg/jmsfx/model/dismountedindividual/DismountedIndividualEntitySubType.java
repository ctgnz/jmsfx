package nz.co.ctg.jmsfx.model.dismountedindividual;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum DismountedIndividualEntitySubType implements EntitySubType {
    INFANTRY("01", "Infantry", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    MEDICAL("02", "Medical", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    RECONNAISSANCE("03", "Reconnaissance", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    SIGNAL("04", "Signal", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    EOD("01", "Explosive Ordnance Disposal", DismountedIndividualEntityType.TASK, IconType.MAIN),
    FO("02", "Field Artillery Observer", DismountedIndividualEntityType.TASK, IconType.MAIN),
    JFS("03", "Joint Fire Support", DismountedIndividualEntityType.TASK, IconType.MAIN),
    LNO("04", "Liaison", DismountedIndividualEntityType.TASK, IconType.MAIN),
    MESSENGER("05", "Messenger", DismountedIndividualEntityType.TASK, IconType.MAIN),
    MP("06", "Military Police", DismountedIndividualEntityType.TASK, IconType.MAIN),
    OBSERVER("07", "Observer", DismountedIndividualEntityType.TASK, IconType.MAIN),
    SECURITY("08", "Security", DismountedIndividualEntityType.TASK, IconType.MAIN),
    SNIPER("09", "Sniper", DismountedIndividualEntityType.TASK, IconType.MAIN),
    SOF("10", "Special Operations Forces (SOF)", DismountedIndividualEntityType.TASK, IconType.MAIN),
    RIFLE("01", "Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    SINGLE_SHOT_RIFLE("02", "Single-Shot Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    SEMIAUTOMATIC_RIFLE("03", "Semiautomatic Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    AUTOMATIC_RIFLE("04", "Automatic Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    MACHINE_GUN("05", "Machine Gun", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    MACHINE_GUN_LIGHT("06", "Machine Gun-Light", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    MACHINE_GUN_MEDIUM("07", "Machine Gun-Medium", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    MACHINE_GUN_HEAVY("08", "Machine Gun-Heavy", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    GRENADE_LAUNCHER("09", "Grenade Launcher", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    GRENADE_LAUNCHER_LIGHT("10", "Grenade Launcher-Light", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    GRENADE_LAUNCHER_MEDIUM("11", "Grenade Launcher-Medium", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    GRENADE_LAUNCHER_HEAVY("12", "Grenade Launcher-Heavy", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    FLAMETHROWER("13", "Flamethrower", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    MORTAR("14", "Mortar", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    ROCKET_LAUCHER_SINGLE("15", "Rocket Launcher-Single", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    ROCKET_LAUCHER_ANTITANK("16", "Rocket Launcher-Antitank", DismountedIndividualEntityType.LETHAL_WEAPONS, IconType.MAIN),
    NON_LETHAL_WEAPON("01", "Non-Lethal Weapon", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, IconType.MAIN),
    NON_LETHAL_GRENADE_LAUNCHER("02", "Non-Lethal Grenade Launcher", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, IconType.MAIN),
    TASER("03", "Taser", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, IconType.MAIN),
    POLICE("01", "Police", DismountedIndividualEntityType.TASK2, IconType.MAIN);

    private final String id;
    private final String label;
    private final DismountedIndividualEntityType entityType;
    private final IconType iconType;
    
    private DismountedIndividualEntitySubType(String id, String label, DismountedIndividualEntityType entityType, IconType iconType) {
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