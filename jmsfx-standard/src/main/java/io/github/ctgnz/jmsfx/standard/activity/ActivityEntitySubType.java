package io.github.ctgnz.jmsfx.standard.activity;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum ActivityEntitySubType implements EntitySubType {
    ARREST("01", "Arrest", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    ATTEMPTED_CRIMINAL_ACTIVITY("03", "Attempted Criminal Activity", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    DRIVE_BY_SHOOTING("04", "Drive-by Shooting", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    DRUG_RELATED("05", "Drug Related", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    EXTORTION("06", "Extortion", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    GRAFFITI("07", "Graffiti", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    KILLING("08", "Killing", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    POISONING("09", "Poisoning", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    CIVIL_RIOTING("10", "Civil Rioting", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    BOOBY_TRAP("11", "Booby Trap", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    BLACK_MARKETING("13", "Black Marketing", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    VANDALISM_LOOT_RANSACK_PLUNDER("14", "Vandalism / Loot / Ransack / Plunder", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    ROBBERY("16", "Robbery", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    THEFT("17", "Theft", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    BURGLARY("18", "Burglary", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    SMUGGLING("19", "Smuggling", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    DEAD_BODY("21", "Dead Body", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.FULL_OCTAGON),
    SABOTAGE("22", "Sabotage", ActivityEntityType.CRIMINAL_ACTIVITY_INCIDENT, GraphicType.MAIN),
    BOMB_THREAT("01", "Bomb Threat", ActivityEntityType.BOMB_BOMBING, GraphicType.FULL_OCTAGON),
    IED_EXPLOSION("01", "IED Explosion", ActivityEntityType.IED_EVENT, GraphicType.FULL_OCTAGON),
    PREMATURE_IED_EXPLOSION("02", "Premature IED Explosion", ActivityEntityType.IED_EVENT, GraphicType.FULL_OCTAGON),
    IED_CACHE("03", "IED Cache", ActivityEntityType.IED_EVENT, GraphicType.FULL_FRAME),
    IED_SUICIDE_BOMBER("04", "IED Suicide Bomber", ActivityEntityType.IED_EVENT, GraphicType.FULL_OCTAGON),
    SNIPING("01", "Sniping", ActivityEntityType.SHOOTING, GraphicType.FULL_OCTAGON),
    TRAFFICKING("01", "Trafficking", ActivityEntityType.ILLEGAL_DRUG_OPERATION, GraphicType.FULL_OCTAGON),
    ILLEGAL_DRUG_LAB("02", "Illegal Drug Lab", ActivityEntityType.ILLEGAL_DRUG_OPERATION, GraphicType.FULL_OCTAGON),
    GRENADE_EXPLOSION("01", "Grenade Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON),
    INCENDIARY_EXPLOSION("02", "Incendiary Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON),
    MINE_EXPLOSION("03", "Mine Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON),
    MORTAR_FIRE_EXPLOSION("04", "Mortar Fire Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON),
    ROCKET_EXPLOSION("05", "Rocket Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON),
    BOMB_EXPLOSION("06", "Bomb Explosion", ActivityEntityType.EXPLOSION, GraphicType.FULL_OCTAGON),
    TV_AND_RADIO_PROPAGANDA("01", "TV and Radio Propaganda", ActivityEntityType.PSYCHOLOGICAL_OPERATIONS, GraphicType.FULL_FRAME),
    WILLING("01", "Willing", ActivityEntityType.RECRUITMENT, GraphicType.FULL_OCTAGON),
    COERCED_IMPRESSED("02", "Coerced/Impressed", ActivityEntityType.RECRUITMENT, GraphicType.FULL_OCTAGON),
    POLLING_PLACE_ELECTION("01", "Polling Place/Election", ActivityEntityType.MEETING, GraphicType.MAIN),
    EMERGENCY_FOOD_DISTRIBUTION("02", "Emergency Food Distribution", ActivityEntityType.EMERGENCY_OPERATION, GraphicType.FULL_FRAME),
    EMERGENCY_WATER_DISTRIBUTION_CENTER("08", "Emergency Water Distribution Center", ActivityEntityType.EMERGENCY_OPERATION, GraphicType.FULL_FRAME),
    PHARMACY("05", "Pharmacy", ActivityEntityType.EMERGENCY_MEDICAL_OPERATION, GraphicType.FULL_OCTAGON),
    BUREAU_ATF("01", "Bureau of Alcohol,Tobacco,Firearms and Explosives (ATF) (Department of Justice)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN),
    DRUG_ENFORCEMENT_ADMIN_DEA("04", "Drug Enforcement Administration (DEA)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN),
    FEDERAL_BUREAU_NVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN),
    POLICE("07", "Police", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN),
    US_SECRET_SERVICE_USSS("09", "United States Secret Service (USSS)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN),
    TRANS_SECURITY_ADMIN_TSA("10", "Transportation Security Administration (TSA)", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN),
    COAST_GUARD("11", "Coast Guard", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.FULL_OCTAGON),
    INTERNAL_SECURITY_FORCE("13", "Internal Security Force", ActivityEntityType.LAW_ENFORCEMENT_OPERATION, GraphicType.MAIN),
    UNEXPLODED_ORDNANCE("15", "Unexploded Ordnance", ActivityEntityType.HAZARD_MATERIALS_INCIDENT, GraphicType.FULL_OCTAGON),
    VOLCANIC_ERUPTION("06", "Volcanic Eruption", ActivityEntityType.GEOLOGIC, GraphicType.FULL_OCTAGON),
    VOLCANIC_THREAT("07", "Volcanic Threat", ActivityEntityType.GEOLOGIC, GraphicType.FULL_OCTAGON),
    CAVE_ENTRANCE("08", "Cave Entrance", ActivityEntityType.GEOLOGIC, GraphicType.FULL_OCTAGON);

    private final String id;
    private final String label;
    private final ActivityEntityType entityType;
    private final GraphicType graphicType;

    ActivityEntitySubType(String id, String label, ActivityEntityType entityType, GraphicType graphicType) {
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
    public EntityType getEntityType() {
        return entityType;
    }

}