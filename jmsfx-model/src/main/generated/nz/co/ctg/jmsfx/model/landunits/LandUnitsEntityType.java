package nz.co.ctg.jmsfx.model.landunits;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum LandUnitsEntityType implements EntityType {
    BROADCAST_TRANSMITTER_ANTENNAE("01", "Broadcast Transmitter Antennae", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.FULL_OCTAGON),
    CIVIL_AFFAIRS("02", "Civil Affairs", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    CIVIL_MILITARY_COOPERATION("03", "Civil-Military Cooperation", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    INFORMATION_OPERATIONS("04", "Information Operations", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    LIAISON("05", "Liaison", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    MILITARY_INFORMATION_SUPPORT_OPERATIONS_MISO("06", "Military Information Support Operations (MISO)", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    RADIO("07", "Radio", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    RADIO_RELAY("08", "Radio Relay", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    RADIO_TELETYPE_CENTER("09", "Radio Teletype Center", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    SIGNAL("10", "Signal", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.FULL_FRAME),
    TACTICAL_SATELLITE("11", "Tactical Satellite", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    VIDEO_IMAGERY_COMBAT_CAMERA("12", "Video Imagery (Combat Camera)", LandUnitsEntity.COMMAND_AND_CONTROL, IconType.MAIN),
    AIR_ASSAULT_WITH_ORGANIC_LIFT("01", "Air Assault with Organic Lift", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.FULL_FRAME),
    AIR_TRAFFIC_SERVICES_AIRFIELD_OPERATIONS("02", "Air Traffic Services/Airfield Operations", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    AMPHIBIOUS("03", "Amphibious", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.FULL_FRAME),
    ANTITANK_ANTIARMOR("04", "Antitank/Antiarmor", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.FULL_FRAME),
    ARMOR_ARMORED_MECHANIZED_SELF_PROPELLED_TRACKED("05", "Armor/Armored/Mechanized/Self-Propelled/Tracked", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    ARMY_AVIATION_AVIATION_ROTARY_WING("06", "Army Aviation/Aviation Rotary Wing", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    AVIATION_COMPOSITE("07", "Aviation Composite", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    AVIATION_FIXED_WING("08", "Aviation Fixed Wing", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    COMBAT("09", "Combat", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    COMBINED_ARMS("10", "Combined Arms", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    INFANTRY("11", "Infantry", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.FULL_FRAME),
    OBSERVER("12", "Observer", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    RECON_CAVALRY_SCOUT("13", "Reconnaissance/Cavalry/Scout", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.FULL_FRAME),
    SEA_AIR_LAND_SEAL("14", "Sea Air Land (SEAL)", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    SNIPER("15", "Sniper", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    SURVEILLANCE("16", "Surveillance", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    SPECIAL_FORCES("17", "Special Forces", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    SPECIAL_OPERATIONS_FORCES_SOF("18", "Special Operations Forces (SOF)", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    UNMANNED_AERIAL_SYSTEMS("19", "Unmanned Aerial Systems", LandUnitsEntity.MOVEMENT_AND_MANEUVER, IconType.MAIN),
    AIR_DEFENSE("01", "Air Defense", LandUnitsEntity.FIRES, IconType.FULL_FRAME),
    AIR_LAND_NAVAL_GUNFIRE_LIAISON("02", "Air/Land Naval Gunfire Liaison", LandUnitsEntity.FIRES, IconType.FULL_FRAME),
    FIELD_ARTILLERY("03", "Field Artillery", LandUnitsEntity.FIRES, IconType.MAIN),
    FIELD_ARTILLERY_OBSERVER("04", "Field Artillery Observer", LandUnitsEntity.FIRES, IconType.MAIN),
    JOINT_FIRE_SUPPORT("05", "Joint Fire Support", LandUnitsEntity.FIRES, IconType.MAIN),
    METEOROLOGICAL("06", "Meteorological", LandUnitsEntity.FIRES, IconType.MAIN),
    MISSILE("07", "Missile", LandUnitsEntity.FIRES, IconType.MAIN),
    MORTAR("08", "Mortar", LandUnitsEntity.FIRES, IconType.MAIN),
    SURVEY("09", "Survey", LandUnitsEntity.FIRES, IconType.MAIN),
    CHEMICAL_BIOLOGICAL_RADIOLOGICAL_NUCLEAR_DEFENSE("01", "Chemical Biological Radiological Nuclear Defense", LandUnitsEntity.PROTECTION, IconType.MAIN),
    COMBAT_SUPPORT_MANEUVER_ENHANCEMENT("02", "Combat Support (Maneuver Enhancement)", LandUnitsEntity.PROTECTION, IconType.MAIN),
    CRIMINAL_INVESTIGATION_DIVISION("03", "Criminal Investigation Division", LandUnitsEntity.PROTECTION, IconType.MAIN),
    DIVING("04", "Diving", LandUnitsEntity.PROTECTION, IconType.MAIN),
    DOG("05", "Dog", LandUnitsEntity.PROTECTION, IconType.MAIN),
    DRILLING("06", "Drilling", LandUnitsEntity.PROTECTION, IconType.MAIN),
    ENGINEER("07", "Engineer", LandUnitsEntity.PROTECTION, IconType.MAIN),
    EXPLOSIVE_ORDNANCE_DISPOSAL_EOD("08", "Explosive Ordnance Disposal (EOD)", LandUnitsEntity.PROTECTION, IconType.MAIN),
    FIELD_CAMP_CONSTRUCTION("09", "Field Camp Construction", LandUnitsEntity.PROTECTION, IconType.MAIN_1),
    FIRE_FIGHTING_FIRE_PROTECTION("10", "Fire Fighting/Fire Protection", LandUnitsEntity.PROTECTION, IconType.MAIN),
    GEOSPATIAL_SUPPORT_GEOSPATIAL_INFORMATION_SUPPORT("11", "Geospatial Support/Geospatial Information Support", LandUnitsEntity.PROTECTION, IconType.MAIN),
    MILITARY_POLICE("12", "Military Police", LandUnitsEntity.PROTECTION, IconType.MAIN),
    MINE("13", "Mine", LandUnitsEntity.PROTECTION, IconType.MAIN),
    MINE_CLEARING("14", "Mine Clearing", LandUnitsEntity.PROTECTION, IconType.FULL_OCTAGON),
    MINE_LAUNCHING("15", "Mine Launching", LandUnitsEntity.PROTECTION, IconType.FULL_OCTAGON),
    MINE_LAYING("16", "Mine Laying", LandUnitsEntity.PROTECTION, IconType.FULL_OCTAGON),
    SECURITY("17", "Security", LandUnitsEntity.PROTECTION, IconType.MAIN),
    SEARCH_AND_RESCUE("18", "Search and Rescue", LandUnitsEntity.PROTECTION, IconType.MAIN),
    SECURITY_POLICE_AIR("19", "Security Police (Air)", LandUnitsEntity.PROTECTION, IconType.MAIN_2),
    SHORE_PATROL("20", "Shore Patrol", LandUnitsEntity.PROTECTION, IconType.MAIN),
    TOPOGRAPHIC("21", "Topographic", LandUnitsEntity.PROTECTION, IconType.MAIN),
    ANALYSIS("01", "Analysis", LandUnitsEntity.INTELLIGENCE, IconType.FULL_OCTAGON),
    COUNTERINTELLIGENCE("02", "Counterintelligence", LandUnitsEntity.INTELLIGENCE, IconType.MAIN),
    DIRECTION_FINDING("03", "Direction Finding", LandUnitsEntity.INTELLIGENCE, IconType.FULL_OCTAGON),
    ELECTRONIC_RANGING("04", "Electronic Ranging", LandUnitsEntity.INTELLIGENCE, IconType.MAIN),
    ELECTRONIC_WARFARE("05", "Electronic Warfare", LandUnitsEntity.INTELLIGENCE, IconType.MAIN),
    INTERCEPT_SEARCH_RECORDING("06", "Intercept (Search and Recording)", LandUnitsEntity.INTELLIGENCE, IconType.FULL_OCTAGON),
    INTERROGATION("07", "Interrogation", LandUnitsEntity.INTELLIGENCE, IconType.MAIN),
    JAMMING("08", "Jamming", LandUnitsEntity.INTELLIGENCE, IconType.FULL_FRAME),
    JOINT_INTELLIGENCE_CENTER("09", "Joint Intelligence Center", LandUnitsEntity.INTELLIGENCE, IconType.MAIN),
    MILITARY_INTELLIGENCE("10", "Military Intelligence", LandUnitsEntity.INTELLIGENCE, IconType.MAIN),
    SEARCH("11", "Search", LandUnitsEntity.INTELLIGENCE, IconType.FULL_OCTAGON),
    SENSOR("12", "Sensor", LandUnitsEntity.INTELLIGENCE, IconType.MAIN),
    ADMINISTRATIVE("01", "Administrative", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    ALL_CLASSES_SUPPLY("02", "All Classes of Supply", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    AIRPORT_DEBARKATION_AIRPORT_EMBARKATION("03", "Airport of Debarkation/Airport of Embarkation", LandUnitsEntity.SUSTAINMENT, IconType.MAIN_1),
    AMMUNITION("04", "Ammunition", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    BAND("05", "Band", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    COMBAT_SERVICE_SUPPORT("06", "Combat Service Support", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    FINANCE("07", "Finance", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    JUDGE_ADVOCATE_GENERAL("08", "Judge Advocate General", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    LABOR("09", "Labor", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    LAUNDRY_BATH("10", "Laundry/Bath", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    MAINTENANCE("11", "Maintenance", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    MATERIAL("12", "Material", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    MEDICAL("13", "Medical", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    MEDICAL_TREATMENT_FACILITY("14", "Medical Treatment Facility", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    MORALE_WELFARE_AND_RECREATION("15", "Morale Welfare and Recreation", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    MORTUARY_AFFAIRS_GRAVES_REGISTRATION("16", "Mortuary Affairs/Graves Registration", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    MULTIPLE_CLASSES_OF_SUPPLY("17", "Multiple Classes of Supply", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    NATO_SUPPLY_CLASS_I("18", "NATO Supply Class I", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    NATO_SUPPLY_CLASS_II("19", "NATO Supply Class II", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    NATO_SUPPLY_CLASS_III("20", "NATO Supply Class III", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    NATO_SUPPLY_CLASS_IV("21", "NATO Supply Class IV", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    NATO_SUPPLY_CLASS_V("22", "NATO Supply Class V", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    ORDNANCE("23", "Ordnance", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    PERSONNEL_SERVICES("24", "Personnel Services", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    PETROLEUM_OIL_LUBRICANTS("25", "Petroleum Oil and Lubricants", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    PIPELINE("26", "Pipeline", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    POSTAL("27", "Postal", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    PUBLIC_AFFAIRS_PUBLIC_INFORMATION("28", "Public Affairs/Public Information", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    QUARTERMASTER("29", "Quartermaster", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    RAILHEAD("30", "Railhead", LandUnitsEntity.SUSTAINMENT, IconType.MAIN_1),
    RELIGIOUS_SUPPORT("31", "Religious Support", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    REPLACEMENT_HOLDING_UNIT("32", "Replacement Holding Unit", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    SEA_PORT_DEBARKATION_SEA_PORT_EMBARKATION("33", "Sea Port of Debarkation/Sea Port of Embarkation", LandUnitsEntity.SUSTAINMENT, IconType.MAIN_1),
    SUPPLY("34", "Supply", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    JOINT_INFORMATION_BUREAU("35", "Joint Information Bureau", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    TRANSPORTATION("36", "Transportation", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    US_SUPPLY_CLASS_I("37", "US Supply Class I", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_II("38", "US Supply Class II", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_III("39", "US Supply Class III", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_IV("40", "US Supply Class IV", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_V("41", "US Supply Class V", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_VI("42", "US Supply Class VI", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_VII("43", "US Supply Class VII", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_VIII("44", "US Supply Class VIII", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_IX("45", "US Supply Class IX", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    US_SUPPLY_CLASS_X("46", "US Supply Class X", LandUnitsEntity.SUSTAINMENT, IconType.FULL_FRAME),
    WATER("47", "Water", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    WATER_PURIFICATION("48", "Water Purification", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    BROADCAST("49", "Broadcast", LandUnitsEntity.SUSTAINMENT, IconType.MAIN),
    NAVAL_ET("01", "Naval", LandUnitsEntity.NAVAL, IconType.MAIN),
    ALLIED_COMMAND_EUROPE_RAPID_REACTION_CORPS_ARRC("01", "Allied Command Europe Rapid Reaction Corps (ARRC)", LandUnitsEntity.NAMED_HEADQUARTERS, IconType.MAIN),
    ALLIED_COMMAND_OPERATIONS("02", "Allied Command Operations", LandUnitsEntity.NAMED_HEADQUARTERS, IconType.MAIN),
    INTERNATIONAL_SECURITY_ASSISTANCE_FORCE_ISAF("03", "International Security Assistance Force (ISAF)", LandUnitsEntity.NAMED_HEADQUARTERS, IconType.MAIN),
    MULTINATIONAL_MN("04", "Multinational (MN)", LandUnitsEntity.NAMED_HEADQUARTERS, IconType.MAIN),
    BUREAU_ATF("01", "Bureau of Alcohol Tobacco Firearms and Explosives (ATF) (Department of Justice)", LandUnitsEntity.LAW_ENFORCEMENT, IconType.MAIN),
    BORDER_PATROL("02", "Border Patrol", LandUnitsEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    CUSTOMS_SERVICE("03", "Customs Service", LandUnitsEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    DRUG_ENFORCEMENT_ADMINISTRATION_DEA("04", "Drug Enforcement Administration (DEA)", LandUnitsEntity.LAW_ENFORCEMENT, IconType.MAIN),
    DEPARTMENT_JUSTICE_DOJ("05", "Department of Justice (DOJ)", LandUnitsEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    FEDERAL_BUREAU_INVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", LandUnitsEntity.LAW_ENFORCEMENT, IconType.MAIN),
    POLICE("07", "Police", LandUnitsEntity.LAW_ENFORCEMENT, IconType.MAIN),
    PRISON("08", "Prison", LandUnitsEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    UNITED_STATES_SECRET_SERVICE_USSS("09", "United States Secret Service (USSS)", LandUnitsEntity.LAW_ENFORCEMENT, IconType.MAIN),
    TRANSPORTATION_SECURITY_ADMINISTRATION_TSA("10", "Transportation Security Administration (TSA)", LandUnitsEntity.LAW_ENFORCEMENT, IconType.MAIN),
    COAST_GUARD("11", "Coast Guard", LandUnitsEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    US_MARSHALS_SERVICE("12", "US Marshals Service", LandUnitsEntity.LAW_ENFORCEMENT, IconType.FULL_OCTAGON),
    INTERNAL_SECURITY_FORCE("13", "Internal Security Force", LandUnitsEntity.LAW_ENFORCEMENT, IconType.MAIN);

    private final String id;
    private final String label;
    private final LandUnitsEntity entity;
    private final IconType iconType;
    
    private LandUnitsEntityType(String id, String label, LandUnitsEntity entity, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }
    
   @Override
    public List<EntitySubType> getEntitySubTypes() {
        return LandUnitsSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}