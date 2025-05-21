package nz.co.ctg.jmsfx.model.activity;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum ActivityEntitySubType implements EntitySubType {
    ARREST("01", "Arrest", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    ATTEMPTED_CRIMINAL_ACTIVITY("03", "Attempted Criminal Activity", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    DRIVE_BY_SHOOTING("04", "Drive-by Shooting", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    DRUG_RELATED("05", "Drug Related", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    EXTORTION("06", "Extortion", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    GRAFFITI("07", "Graffiti", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    KILLING("08", "Killing", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    POISONING("09", "Poisoning", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    CIVIL_RIOTING("10", "Civil Rioting", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    BOOBY_TRAP("11", "Booby Trap", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    BLACK_MARKETING("13", "Black Marketing", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    VANDALISM_LOOT_RANSACK_PLUNDER("14", "Vandalism / Loot / Ransack / Plunder", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    ROBBERY("16", "Robbery", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    THEFT("17", "Theft", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    BURGLARY("18", "Burglary", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    SMUGGLING("19", "Smuggling", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    DEAD_BODY("21", "Dead Body", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    SABOTAGE("22", "Sabotage", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.MAIN),
    SUSPICIOUS_ACTIVITY("23", "Suspicious Activity", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, IconType.FULL_OCTAGON),
    BOMB_THREAT("01", "Bomb Threat", ActivityEntityType.BOMB_BOMBING, IconType.FULL_OCTAGON),
    IED_EXPLOSION("01", "IED Explosion", ActivityEntityType.IED_EVENT, IconType.FULL_OCTAGON),
    PREMATURE_IED_EXPLOSION("02", "Premature IED Explosion", ActivityEntityType.IED_EVENT, IconType.FULL_OCTAGON),
    IED_CACHE("03", "IED Cache", ActivityEntityType.IED_EVENT, IconType.FULL_FRAME),
    IED_SUICIDE_BOMBER("04", "IED Suicide Bomber", ActivityEntityType.IED_EVENT, IconType.FULL_OCTAGON),
    SNIPING("01", "Sniping", ActivityEntityType.SHOOTING, IconType.FULL_OCTAGON),
    TRAFFICKING("01", "Trafficking", ActivityEntityType.ILLEGAL_DRUG_OPERATION, IconType.FULL_OCTAGON),
    ILLEGAL_DRUG_LAB("02", "Illegal Drug Lab", ActivityEntityType.ILLEGAL_DRUG_OPERATION, IconType.FULL_OCTAGON),
    GRENADE_EXPLOSION("01", "Grenade Explosion", ActivityEntityType.EXPLOSION, IconType.FULL_OCTAGON),
    INCENDIARY_EXPLOSION("02", "Incendiary Explosion", ActivityEntityType.EXPLOSION, IconType.FULL_OCTAGON),
    MINE_EXPLOSION("03", "Mine Explosion", ActivityEntityType.EXPLOSION, IconType.FULL_OCTAGON),
    MORTAR_FIRE_EXPLOSION("04", "Mortar Fire Explosion", ActivityEntityType.EXPLOSION, IconType.FULL_OCTAGON),
    ROCKET_EXPLOSION("05", "Rocket Explosion", ActivityEntityType.EXPLOSION, IconType.FULL_OCTAGON),
    BOMB_EXPLOSION("06", "Bomb Explosion", ActivityEntityType.EXPLOSION, IconType.FULL_OCTAGON),
    TV_AND_RADIO_PROPAGANDA("01", "TV and Radio Propaganda", ActivityEntityType.PSYCHOLOGICAL_OPERATIONS, IconType.FULL_FRAME),
    WILLING("01", "Willing", ActivityEntityType.RECRUITMENT, IconType.FULL_OCTAGON),
    COERCED_IMPRESSED("02", "Coerced/Impressed", ActivityEntityType.RECRUITMENT, IconType.FULL_OCTAGON),
    POLLING_PLACE_ELECTION("01", "Polling Place/Election", ActivityEntityType.MEETING, IconType.MAIN),
    EMERGENCY_FOOD_DISTRIBUTION("02", "Emergency Food Distribution", ActivityEntityType.EMERGENCY_OPERATION, IconType.FULL_FRAME),
    EMERGENCY_WATER_DISTRIBUTION_CENTER("08", "Emergency Water Distribution Center", ActivityEntityType.EMERGENCY_OPERATION, IconType.FULL_FRAME),
    PHARMACY("05", "Pharmacy", ActivityEntityType.EMERGENCY_MEDICAL_OPERATION, IconType.FULL_OCTAGON),
    BUREAU_ATF("01", "Bureau of Alcohol,Tobacco,Firearms and Explosives (ATF) (Department of Justice)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, IconType.MAIN),
    DRUG_ENFORCEMENT_ADMIN_DEA("04", "Drug Enforcement Administration (DEA)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, IconType.MAIN),
    FEDERAL_BUREAU_NVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, IconType.MAIN),
    POLICE("07", "Police", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, IconType.MAIN),
    US_SECRET_SERVICE_USSS("09", "United States Secret Service (USSS)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, IconType.MAIN),
    TRANS_SECURITY_ADMIN_TSA("10", "Transportation Security Administration (TSA)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, IconType.MAIN),
    COAST_GUARD("11", "Coast Guard", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, IconType.FULL_OCTAGON),
    INTERNAL_SECURITY_FORCE("13", "Internal Security Force", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, IconType.MAIN),
    UNEXPLODED_ORDNANCE("15", "Unexploded Ordnance", ActivityEntityType.HAZARD_MATERIALS_INCIDENT, IconType.FULL_OCTAGON),
    VOLCANIC_ERUPTION("06", "Volcanic Eruption", ActivityEntityType.GEOLOGIC, IconType.FULL_OCTAGON),
    VOLCANIC_THREAT("07", "Volcanic Threat", ActivityEntityType.GEOLOGIC, IconType.FULL_OCTAGON),
    CAVE_ENTRANCE("08", "Cave Entrance", ActivityEntityType.GEOLOGIC, IconType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final ActivityEntityType entityType;
    private final IconType iconType;
    
    private ActivityEntitySubType(String id, String label, ActivityEntityType entityType, IconType iconType) {
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