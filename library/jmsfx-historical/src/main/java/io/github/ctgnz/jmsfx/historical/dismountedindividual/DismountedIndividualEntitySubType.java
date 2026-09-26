package io.github.ctgnz.jmsfx.historical.dismountedindividual;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.historical.IconBounds;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum DismountedIndividualEntitySubType implements EntitySubType {
        AVIATION("01", "Aviation", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        MUSIC("02", "Music", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        CBRN("03", "CBRN", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        ENGINEERS("05", "Engineers", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        ARTILLERY("06", "Artillery", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        INFANTRY("07", "Infantry", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        MEDICAL("08", "Medical", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        ORDNANCE("09", "Ordnance", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        QUARTERMASTER("10", "Quartermaster", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        SIGNAL("11", "Signals", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        ADMINISTRATION("12", "Administration", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        FINANCE("14", "Finance", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        RELIGIOUS_SUPPORT("16", "Religious Support", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        ARMOUR("17", "Armour", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        RECONNAISSANCE("18", "Reconnaissance", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        MILITARY_POLICE("19", "Military Police", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        GENERAL("20", "General", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        LEGAL("27", "Legal", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        COMBAT("29", "Combat", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        MILITARY_INTELLIGENCE("30", "Military Intelligence", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        SPECIAL_FORCES("31", "Special Forces", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        SECURITY_SERVICE("32", "Security", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        PSYCHOLOGICAL_OPERATIONS("33", "Psychological Operations (MISO)", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        CYBER("34", "Cyber", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        COMBAT_SUPPORT("37", "Combat Support (Maneuver Enhancement)", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        SPACE("40", "Space Operations", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        CIVIL_AFFAIRS("41", "Civil Affairs", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        MAINTENANCE("43", "Maintenance", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        AIR_DEFENCE_ARTILLERY("44", "Air Defence Artillery", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        PUBLIC_AFFAIRS("45", "Public Affairs", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        INFORMATION_OPERATIONS("53", "Information Operations", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        LOGISTICS("54", "Logistics", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        TRANSPORTATION("55", "Transportation", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        COMBAT_SERVICE_SUPPORT("63", "Combat Service Support (Sustainment)", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        TACTICAL_CYBER("71", "Tactical Cyber", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        ACQUISITION("90", "Acquisition", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        TRAINING_EDUCATION("97", "Training/Education", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
        NAVAL("99", "Naval", DismountedIndividualEntityType.SERVICE, GraphicType.FULL_OCTAGON),
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
        MEDIC("12", "Medic", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        SIGNALLER("13", "Signaller", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        SCOUT("14", "Reconnaissance Scout", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        INFANTEER("15", "Infanteer", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        CLOSE_PROTECTION("16", "Close Protection (CLP)", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        CROWD_RIOT_CONTROL("17", "Infantry", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        SWAT("18", "Special Weapons and Tactics (SWAT)", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        DEMOLITION("19", "Demolition", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        COMMANDER("20", "Commander", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        SECOND_IN_COMMAND("21", "Second in Command", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        STAFF("A0", "Staff", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        DRIVER("A1", "Driver", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        GUNNER("A2", "Gunner", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        LOADER("A3", "Loader", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        PILOT("A4", "Pilot", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        NAVIGATOR("A5", "Navigator", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        FLIGHT_ENGINEER("A6", "Flight Engineer", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        LOADMASTER("A7", "Loadmaster", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        OPERATOR("A8", "Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        SURVEYOR("A9", "Topographical Surveyor", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        MUSICIAN("AA", "Musician", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        FOOD_PROVISION("AB", "Food Provision/Chef", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        ANALYST("AC", "Analyst", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        INSTRUCTOR("AD", "Instructor", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        DETECTIVE("AE", "Detective", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        UAS_OPERATOR("AF", "UAS Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        AVIATION_TECHNICIAN("B0", "Aviation Technician", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        AVIATION_OPERATIONS("B1", "Aviation Operations", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        WATERCRAFT_OPERATOR("B2", "Watercraft Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        METEOROLOGIST("B3", "Meteorologist", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        DIVER("B4", "Diver", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        FIREFIGHTER("B5", "Firefighter", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        DOG_HANDLER("B6", "DogHandler", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        VETERINARY("B7", "Veterinary", DismountedIndividualEntityType.TASK, GraphicType.FULL_OCTAGON),
        DENTIST("B8", "Dentist", DismountedIndividualEntityType.TASK, GraphicType.FULL_OCTAGON),
        NURSE("B9", "Nurse", DismountedIndividualEntityType.TASK, GraphicType.FULL_OCTAGON),
        SEAPORT_OPERATOR("BA", "Sea Port Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        AIRPORT_OPERATOR("BB", "Airport Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
        RAILWAY_OPERATOR("BC", "Railway Operator", DismountedIndividualEntityType.TASK, GraphicType.MAIN),
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
    public Rectangle2D getIconBounds() {
        return IconBounds.lookup(getGraphicIdentifier(), getGraphicType());
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