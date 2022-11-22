package nz.co.ctg.jmsfx.model.dismountedindividual;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum DismountedIndividualEntitySubType implements EntitySubType {
    UNSPECIFIED("00", "Unspecified", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    AVIATION("01", "Aviation", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    MUSIC("02", "Music", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    CBRN("03", "CBRN", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    ENGINEERS("05", "Engineers", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    ARTILLERY("06", "Artillery", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    INFANTRY("07", "Infantry", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    MEDICAL("08", "Medical", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    ORDNANCE("09", "Ordnance", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    QUARTERMASTER("10", "Quartermaster", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    SIGNAL("11", "Signals", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    ADMINISTRATION("12", "Administration", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    FINANCE("14", "Finance", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    RELIGIOUS_SUPPORT("16", "Religious Support", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    ARMOUR("17", "Armour", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    RECONNAISSANCE("18", "Reconnaissance", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    MILITARY_POLICE("19", "Military Police", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    GENERAL("20", "General", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    LEGAL("27", "Legal", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    COMBAT("29", "Combat", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    MILITARY_INTELLIGENCE("30", "Military Intelligence", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    SPECIAL_FORCES("31", "Special Forces", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    SECURITY_SERVICE("32", "Security", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    PSYCHOLOGICAL_OPERATIONS("33", "Psychological Operations (MISO)", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    CYBER("34", "Cyber", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    COMBAT_SUPPORT("37", "Combat Support (Maneuver Enhancement)", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    SPACE("40", "Space Operations", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    CIVIL_AFFAIRS("41", "Civil Affairs", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    MAINTENANCE("43", "Maintenance", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    AIR_DEFENCE_ARTILLERY("44", "Air Defence Artillery", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    PUBLIC_AFFAIRS("45", "Public Affairs", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    INFORMATION_OPERATIONS("53", "Information Operations", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    LOGISTICS("54", "Logistics", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    TRANSPORTATION("55", "Transportation", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    COMBAT_SERVICE_SUPPORT("63", "Combat Service Support (Sustainment)", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    TACTICAL_CYBER("71", "Tactical Cyber", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    ACQUISITION("90", "Acquisition", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    TRAINING_EDUCATION("97", "Training/Education", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
    NAVAL("99", "Naval", DismountedIndividualEntityType.SERVICE, IconType.FULL_OCTAGON),
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
    DRIVER("11", "Driver", DismountedIndividualEntityType.TASK, IconType.MAIN),
    GUNNER("12", "Gunner", DismountedIndividualEntityType.TASK, IconType.MAIN),
    LOADER("13", "Loader", DismountedIndividualEntityType.TASK, IconType.MAIN),
    PILOT("14", "Pilot", DismountedIndividualEntityType.TASK, IconType.MAIN),
    NAVIGATOR("15", "Navigator", DismountedIndividualEntityType.TASK, IconType.MAIN),
    FLIGHT_ENGINEER("16", "Flight Engineer", DismountedIndividualEntityType.TASK, IconType.MAIN),
    LOADMASTER("17", "Loadmaster", DismountedIndividualEntityType.TASK, IconType.MAIN),
    OPERATOR("18", "Operator", DismountedIndividualEntityType.TASK, IconType.MAIN),
    COMMAND_CONTROL("19", "Command/Control", DismountedIndividualEntityType.TASK, IconType.MAIN),
    SURVEYOR("20", "Topographical Surveyor", DismountedIndividualEntityType.TASK, IconType.MAIN),
    MUSICIAN("21", "Musician", DismountedIndividualEntityType.TASK, IconType.MAIN),
    FOOD_PROVISION("22", "Food Provision/Chef", DismountedIndividualEntityType.TASK, IconType.MAIN),
    ANALYST("23", "Analyst", DismountedIndividualEntityType.TASK, IconType.MAIN),
    INSTRUCTOR("24", "Instructor", DismountedIndividualEntityType.TASK, IconType.MAIN),
    DETECTIVE("25", "Detective", DismountedIndividualEntityType.TASK, IconType.MAIN),
    UAS_OPERATOR("26", "UAS Operator", DismountedIndividualEntityType.TASK, IconType.MAIN),
    AVIATION_TECHNICIAN("27", "Aviation Technician", DismountedIndividualEntityType.TASK, IconType.MAIN),
    AVIATION_OPERATIONS("28", "Aviation Operations", DismountedIndividualEntityType.TASK, IconType.MAIN),
    WATERCRAFT_OPERATOR("29", "Watercraft Operator", DismountedIndividualEntityType.TASK, IconType.MAIN),
    METEOROLOGIST("30", "Meteorologist", DismountedIndividualEntityType.TASK, IconType.MAIN),
    DIVER("31", "Diver", DismountedIndividualEntityType.TASK, IconType.MAIN),
    FIREFIGHTER("32", "Firefighter", DismountedIndividualEntityType.TASK, IconType.MAIN),
    DOG_HANDLER("33", "DogHandler", DismountedIndividualEntityType.TASK, IconType.MAIN),
    VETERINARY("34", "Veterinary", DismountedIndividualEntityType.TASK, IconType.FULL_OCTAGON),
    DENTIST("35", "Dentist", DismountedIndividualEntityType.TASK, IconType.FULL_OCTAGON),
    NURSE("36", "Nurse", DismountedIndividualEntityType.TASK, IconType.FULL_OCTAGON),
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