package io.github.ctgnz.jmsfx.icon.landunits;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandUnitsEntityType implements IEntityType {
    BROADCAST_TRANSMITTER_ANTENNAE("01", "Broadcast Transmitter Antennae", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.FULL_OCTAGON),
    CIVIL_AFFAIRS("02", "Civil Affairs", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    CIVIL_MILITARY_COOPERATION("03", "Civil-Military Cooperation", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    INFORMATION_OPERATIONS("04", "Information Operations", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    LIAISON("05", "Liaison", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    PSYCHOLOGICAL_OPERATIONS_MISO("06", "Psychological Operations (PSYOPS)", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    RADIO("07", "Radio", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    RADIO_RELAY("08", "Radio Relay", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    RADIO_TELETYPE_CENTER("09", "Radio Teletype Center", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    SIGNAL("10", "Signal", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.FULL_FRAME),
    VIDEO_IMAGERY_COMBAT_CAMERA("12", "Video Imagery (Combat Camera)", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    SPACE("13", "Space", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    SPECIAL_TROOPS("14", "Special Troops", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    MULTI_DOMAIN("15", "Multi-Domain", LandUnitsEntity.COMMAND_AND_CONTROL, GraphicType.MAIN),
    AIR_ASSAULT_WITH_ORGANIC_LIFT("01", "Air Assault with Organic Lift", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.FULL_FRAME),
    AIR_TRAFFIC_SERVICES_AIRFIELD_OPERATIONS("02", "Air Traffic Services/Airfield Operations", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    ANTIARMOUR("04", "Antiarmor", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.FULL_FRAME),
    ARMOUR("05", "Armour", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    ARMY_AVIATION_AVIATION_ROTARY_WING("06", "Army Aviation/Aviation Rotary Wing", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    AVIATION_COMPOSITE("07", "Aviation Composite", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    AVIATION_FIXED_WING("08", "Aviation Fixed Wing", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    COMBAT("09", "Combat", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    COMBINED_ARMS("10", "Combined Arms", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    INFANTRY("11", "Infantry", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.FULL_FRAME),
    OBSERVER("12", "Observer", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    RECON_CAVALRY("13", "Reconnaissance/Cavalry", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.FULL_FRAME),
    SEA_AIR_LAND_SEAL("14", "Sea Air Land (SEAL)", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    SNIPER("15", "Sniper", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    SURVEILLANCE("16", "Surveillance", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    SPECIAL_FORCES("17", "Special Forces", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    SPECIAL_OPERATIONS_FORCES_SOF("18", "Special Operations Forces (SOF)", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    UNMANNED_AERIAL_SYSTEMS("19", "Unmanned Aerial Systems", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    RANGER("20", "Ranger", LandUnitsEntity.MOVEMENT_AND_MANEUVER, GraphicType.MAIN),
    AIR_DEFENSE("01", "Air Defense", LandUnitsEntity.FIRES, GraphicType.FULL_FRAME),
    AIR_LAND_NAVAL_GUNFIRE_LIAISON("02", "Air/Land Naval Gunfire Liaison", LandUnitsEntity.FIRES, GraphicType.FULL_FRAME),
    FIELD_ARTILLERY("03", "Field Artillery", LandUnitsEntity.FIRES, GraphicType.MAIN),
    FIELD_ARTILLERY_OBSERVER("04", "Field Artillery Observer", LandUnitsEntity.FIRES, GraphicType.MAIN),
    JOINT_FIRE_SUPPORT("05", "Joint Fire Support", LandUnitsEntity.FIRES, GraphicType.MAIN),
    METEOROLOGICAL("06", "Meteorological", LandUnitsEntity.FIRES, GraphicType.MAIN),
    MISSILE("07", "Missile", LandUnitsEntity.FIRES, GraphicType.MAIN),
    MORTAR("08", "Mortar", LandUnitsEntity.FIRES, GraphicType.MAIN),
    SURVEY("09", "Survey", LandUnitsEntity.FIRES, GraphicType.MAIN),
    CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR("01", "Chemical, Biological, Radiological and Nuclear", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    COMBAT_SUPPORT_MANEUVER_ENHANCEMENT("02", "Combat Support (Maneuver Enhancement)", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    CRIMINAL_INVESTIGATION_DIVISION("03", "Criminal Investigation Division", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    DIVING("04", "Diving", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    DOG("05", "Dog", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    DRILLING("06", "Drilling", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    ENGINEER("07", "Engineer", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    EXPLOSIVE_ORDNANCE_DISPOSAL_EOD("08", "Explosive Ordnance Disposal (EOD)", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    FIELD_CAMP_CONSTRUCTION("09", "Field Camp Construction", LandUnitsEntity.PROTECTION, GraphicType.MAIN_1),
    FIRE_FIGHTING("10", "Fire Fighting", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    GEOSPATIAL_SUPPORT_GEOSPATIAL_INFORMATION_SUPPORT("11", "Geospatial Support/Geospatial Information Support", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    MILITARY_POLICE("12", "Military Police", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    MINE("13", "Mine", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    MINE_CLEARING("14", "Mine Clearing", LandUnitsEntity.PROTECTION, GraphicType.FULL_OCTAGON),
    MINE_LAUNCHING("15", "Mine Launching", LandUnitsEntity.PROTECTION, GraphicType.FULL_OCTAGON),
    MINE_LAYING("16", "Mine Laying", LandUnitsEntity.PROTECTION, GraphicType.FULL_OCTAGON),
    SECURITY("17", "Security", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    SEARCH_AND_RESCUE("18", "Search and Rescue", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    SHORE_PATROL("20", "Shore Patrol", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    GEOSPATIAL_INFORMATION("21", "Geospatial Information", LandUnitsEntity.PROTECTION, GraphicType.MAIN),
    MISSILE_DEFENCE("22", "Missile Defence", LandUnitsEntity.PROTECTION, GraphicType.FULL_OCTAGON),
    ANALYSIS("01", "Analysis", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_OCTAGON),
    COUNTERINTELLIGENCE("02", "Counterintelligence", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN),
    DIRECTION_FINDING("03", "Direction Finding", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_OCTAGON),
    ELECTRONIC_RANGING("04", "Electronic Ranging", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN),
    ELECTROMAGNETIC_WARFARE("05", "Electromagnetic Warfare", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN),
    INTERCEPT_SEARCH_RECORDING("06", "Intercept (Search and Recording)", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_OCTAGON),
    INTERROGATION("07", "Interrogation", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN),
    JAMMING("08", "Jamming", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_FRAME),
    JOINT_INTELLIGENCE_CENTER("09", "Joint Intelligence Center", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN),
    MILITARY_INTELLIGENCE("10", "Military Intelligence", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN),
    SEARCH("11", "Search", LandUnitsEntity.INTELLIGENCE, GraphicType.FULL_OCTAGON),
    SENSOR("12", "Sensor", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN),
    MILITARY_HISTORY("13", "Military History", LandUnitsEntity.INTELLIGENCE, GraphicType.MAIN),
    ADMINISTRATIVE("01", "Administrative", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    ALL_CLASSES_SUPPLY("02", "All Classes of Supply", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    AMMUNITION("04", "Ammunition", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    BAND("05", "Band", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    COMBAT_SERVICE_SUPPORT("06", "Combat Service Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    FINANCE("07", "Finance", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    JUDGE_ADVOCATE_GENERAL("08", "Judge Advocate General", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    LABOR("09", "Labor", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    LAUNDRY_BATH("10", "Laundry/Bath", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    MAINTENANCE("11", "Maintenance", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    MATERIAL("12", "Material", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    MEDICAL("13", "Medical", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    MEDICAL_TREATMENT_FACILITY("14", "Medical Treatment Facility", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    MORALE_WELFARE_AND_RECREATION("15", "Morale Welfare and Recreation", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    MORTUARY_AFFAIRS_GRAVES_REGISTRATION("16", "Mortuary Affairs/Graves Registration", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    MULTIPLE_CLASSES_OF_SUPPLY("17", "Multiple Classes of Supply", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    NATO_SUPPLY_CLASS_I("18", "NATO Supply Class I", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    NATO_SUPPLY_CLASS_II("19", "NATO Supply Class II", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    NATO_SUPPLY_CLASS_III("20", "NATO Supply Class III", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    NATO_SUPPLY_CLASS_IV("21", "NATO Supply Class IV", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    NATO_SUPPLY_CLASS_V("22", "NATO Supply Class V", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    ORDNANCE("23", "Ordnance", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    PERSONNEL_SERVICES("24", "Personnel Services", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    PETROLEUM_OIL_LUBRICANTS("25", "Petroleum Oil and Lubricants", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    PUBLIC_AFFAIRS_PUBLIC_INFORMATION("28", "Public Affairs/Public Information", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    QUARTERMASTER("29", "Quartermaster", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    RELIGIOUS_SUPPORT("31", "Religious Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    REPLACEMENT_HOLDING_UNIT("32", "Replacement Holding Unit", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    JOINT_INFORMATION_BUREAU("35", "Joint Information Bureau", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    TRANSPORTATION("36", "Transportation", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    US_SUPPLY_CLASS_I("37", "US Supply Class I", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    US_SUPPLY_CLASS_IV("40", "US Supply Class IV", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    US_SUPPLY_CLASS_VI("42", "US Supply Class VI", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    US_SUPPLY_CLASS_VII("43", "US Supply Class VII", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    US_SUPPLY_CLASS_VIII("44", "US Supply Class VIII", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    US_SUPPLY_CLASS_IX("45", "US Supply Class IX", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    US_SUPPLY_CLASS_X("46", "US Supply Class X", LandUnitsEntity.SUSTAINMENT, GraphicType.FULL_FRAME),
    WATER_PURIFICATION("48", "Water Purification", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    BROADCAST("49", "Broadcast", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    INTERPRETER_TRANSLATOR("51", "Interpreter/Translator", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    SUPPORT("52", "Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    ARMY_FIELD_SUPPORT("53", "Army Field Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    CONTRACTOR_SUPPORT("54", "Contractor Support", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    PARACHUTE_RIGGER("55", "Parachute Rigger", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    HUMAN_RESOURCES("56", "Human Resources (HR)", LandUnitsEntity.SUSTAINMENT, GraphicType.MAIN),
    NAVAL_ET("01", "Naval", LandUnitsEntity.NAVAL, GraphicType.MAIN),
    ALLIED_COMMAND_EUROPE_RAPID_REACTION_CORPS_ARRC("01", "Allied Command Europe Rapid Reaction Corps (ARRC)", LandUnitsEntity.NAMED_HEADQUARTERS, GraphicType.MAIN),
    ALLIED_COMMAND_OPERATIONS("02", "Allied Command Operations", LandUnitsEntity.NAMED_HEADQUARTERS, GraphicType.MAIN),
    INTERNATIONAL_SECURITY_ASSISTANCE_FORCE_ISAF("03", "International Security Assistance Force (ISAF)", LandUnitsEntity.NAMED_HEADQUARTERS, GraphicType.MAIN),
    MULTINATIONAL_MN("04", "Multinational (MN)", LandUnitsEntity.NAMED_HEADQUARTERS, GraphicType.MAIN),
    BUREAU_ATF("01", "Bureau of Alcohol Tobacco Firearms and Explosives (ATF) (Department of Justice)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    DRUG_ENFORCEMENT_ADMINISTRATION_DEA("04", "Drug Enforcement Administration (DEA)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    FEDERAL_BUREAU_INVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    POLICE("07", "Police", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    UNITED_STATES_SECRET_SERVICE_USSS("09", "United States Secret Service (USSS)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    TRANSPORTATION_SECURITY_ADMINISTRATION_TSA("10", "Transportation Security Administration (TSA)", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN),
    COAST_GUARD("11", "Coast Guard", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.FULL_OCTAGON),
    INTERNAL_SECURITY_FORCE("13", "Internal Security Force", LandUnitsEntity.LAW_ENFORCEMENT, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final LandUnitsEntity entity;
    private final GraphicType graphicType;

    LandUnitsEntityType(String id, String label, LandUnitsEntity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public IEntity getEntity() {
        return entity;
    }

    @Override
    public List<IEntitySubType> getEntitySubTypes() {
        return LandUnitsSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }

}