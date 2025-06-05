package io.github.ctgnz.jmsfx.icon.dismountedindividual;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.icon.GraphicType;

public enum DismountedIndividualEntitySubType implements IEntitySubType {
    EOD("01", "Explosive Ordnance Disposal", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    FO("02", "Field Artillery Observer", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    JFS("03", "Joint Fire Support", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    LNO("04", "Liaison", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    MESSENGER("05", "Messenger", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    MP("06", "Military Police", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    OBSERVER("07", "Observer", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    SECURITY("08", "Security", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    SNIPER("09", "Sniper", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    SOF("10", "Special Operations Forces (SOF)", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    DESIGNATED_MARKSMAN("11", "Designated Marksman (DM)", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    MEDICAL("12", "Medical", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    SIGNAL("13", "Signal", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    RECONNAISSANCE("14", "Reconnaissance", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    INFANTRY("15", "Infantry", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    CLOSE_PROTECTION("16", "Close Protection (CLP)", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    CROWD_RIOT_CONTROL("17", "Infantry", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    SWAT("18", "Special Weapons and Tactics (SWAT)", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    DEMOLITION("19", "Demolition", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    COMMANDER("20", "Commander", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    SECOND_IN_COMMAND("21", "Second in Command", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
    RIFLE("01", "Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    SINGLE_SHOT_RIFLE("02", "Single-Shot Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    SEMIAUTOMATIC_RIFLE("03", "Semiautomatic Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    AUTOMATIC_RIFLE("04", "Automatic Rifle", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    MACHINE_GUN("05", "Machine Gun", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    MACHINE_GUN_LIGHT("06", "Machine Gun-Light", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    MACHINE_GUN_MEDIUM("07", "Machine Gun-Medium", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    MACHINE_GUN_HEAVY("08", "Machine Gun-Heavy", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    GRENADE_LAUNCHER("09", "Grenade Launcher", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    GRENADE_LAUNCHER_LIGHT("10", "Grenade Launcher-Light", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    GRENADE_LAUNCHER_MEDIUM("11", "Grenade Launcher-Medium", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    GRENADE_LAUNCHER_HEAVY("12", "Grenade Launcher-Heavy", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    FLAMETHROWER("13", "Flamethrower", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    MORTAR("14", "Mortar", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    ROCKET_LAUCHER_SINGLE("15", "Rocket Launcher-Single", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    ROCKET_LAUCHER_ANTITANK("16", "Rocket Launcher-Antitank", DismountedIndividualEntityType.LETHAL_WEAPONS, GraphicType.MAIN),
    NON_LETHAL_WEAPON("01", "Non-Lethal Weapon", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, GraphicType.MAIN),
    NON_LETHAL_GRENADE_LAUNCHER("02", "Non-Lethal Grenade Launcher", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, GraphicType.MAIN),
    TASER("03", "Taser", DismountedIndividualEntityType.NON_LETHAL_WEAPONS, GraphicType.MAIN),
    POLICE("01", "Police", DismountedIndividualEntityType.TASK2, GraphicType.MAIN),
    NON_GOVT_ORG("02", "Non-Governmental Organizational Member or Non-Governmental Organization (NGO)", DismountedIndividualEntityType.TASK2, GraphicType.MAIN),
    GOVT_ORG("03", "Government Organization (GO)", DismountedIndividualEntityType.TASK2, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final DismountedIndividualEntityType entityType;
    private final GraphicType graphicType;

    DismountedIndividualEntitySubType(String id, String label, DismountedIndividualEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public IEntityType getEntityType() {
        return entityType;
    }

}