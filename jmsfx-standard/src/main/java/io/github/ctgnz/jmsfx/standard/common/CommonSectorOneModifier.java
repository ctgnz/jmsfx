package io.github.ctgnz.jmsfx.standard.common;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum CommonSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED("0", "00", "Unspecified", ModifierCategory.None),
    UAV_DRONE("1", "00", "UAV/Drone Equipped/Drone", ModifierCategory.Mobility),
    ROBOTIC("1", "01", "Robotic", ModifierCategory.Mobility),
    FIXED_WING("1", "02", "Fixed Wing", ModifierCategory.Mobility),
    ROTARY_WING("1", "03", "Rotary Wing", ModifierCategory.Mobility),
    TILT_ROTOR("1", "04", "Tilt Rotor", ModifierCategory.Mobility),
    VSTOL_VTOL("1", "05", "VSTOL/VTOL or Helicopter Equipped", ModifierCategory.Capability),
    ATTACK("1", "06", "Attack or Attack/Strike", ModifierCategory.Capability),
    ARMOURED("1", "07", "Armoured", ModifierCategory.Capability),
    BALLISTIC_MISSILE("1", "08", "Ballistic Missile/Ballistic Missile Defence Shooter", ModifierCategory.Capability),
    BRIDGE("1", "09", "Bridge/Bridging", ModifierCategory.Capability),
    CARGO("1", "10", "Cargo", ModifierCategory.Capability),
    UTILITY("1", "11", "Utility", ModifierCategory.Capability),
    LIGHT("1", "12", "Light", ModifierCategory.Capability),
    MEDIUM("1", "13", "Medium", ModifierCategory.Capability),
    HEAVY("1", "14", "Heavy", ModifierCategory.Capability),
    CYBERSPACE("1", "15", "Cyberspace", ModifierCategory.Capability),
    COMMAND_POST_NODE("1", "16", "Command Post Node", ModifierCategory.Capability),
    JOINT_NETWORK_NODE("1", "17", "Joint Network Node", ModifierCategory.Capability),
    RETRANSMISSION("1", "18", "Retransmission", ModifierCategory.Capability),
    BRIGADE("1", "19", "Brigade", ModifierCategory.Capability),
    CLOSE_PROTECTION("1", "20", "Close Protection", ModifierCategory.Capability),
    COMBAT("1", "21", "Combat", ModifierCategory.Capability),
    COMMAND_CONTROL("1", "22", "Command and Control", ModifierCategory.Capability),
    CROWD_RIOT_CONTROL("1", "23", "Crowd and Riot Control", ModifierCategory.Capability),
    EXPLOSIVE_ORDNANCE_DISPOSAL("1", "24", "Explosive Ordnance Disposal (EOD)", ModifierCategory.Capability),
    INTELLIGENCE_SURVEILLANCE_RECONNAISSANCE("1", "25", "Intelligence, Surveillance, Reconnaissance", ModifierCategory.Capability),
    MAINTENANCE("1", "26", "Maintenance", ModifierCategory.Capability),
    MEDEVAC_MEDICAL("1", "27", "MEDEVAC/Medic/Medical", ModifierCategory.Capability),
    SEARCH_RESCUE("1", "28", "Search and Rescue", ModifierCategory.Capability),
    SECURITY("1", "29", "Security", ModifierCategory.Capability),
    SNIPER("1", "30", "Sniper", ModifierCategory.Capability),
    SPECIAL_OPERATIONS_FORCES("1", "31", "Special Operations Forces", ModifierCategory.Capability),
    SPECIAL_WEAPONS_TACTICS("1", "32", "Special Weapons and Tactics (SWAT)", ModifierCategory.Capability),
    GUIDED_MISSILE("1", "33", "Guided Missile", ModifierCategory.Capability),
    OTHER_GUIDED_MISSILE("1", "34", "Other Guided Missile", ModifierCategory.Capability),
    POL("1", "35", "Petroleum, Oil and Lubricants", ModifierCategory.Capability),
    WATER("1", "36", "Water", ModifierCategory.Capability),
    WEAPONS("1", "37", "Weapon or Weapons", ModifierCategory.Capability),
    CHEMICAL("1", "38", "Chemical", ModifierCategory.CBRN),
    BIOLOGICAL("1", "39", "Biological", ModifierCategory.CBRN),
    RADIOLOGICAL("1", "40", "Radiological", ModifierCategory.CBRN),
    NUCLEAR("1", "41", "Nuclear", ModifierCategory.CBRN),
    DECONTAMINATION("1", "42", "Decontamination", ModifierCategory.CBRN),
    CIVILIAN("1", "43", "Civilian", ModifierCategory.Organization),
    GOVERNMENT_ORGANIZATION("1", "44", "Government Organization/Government Organization Member", ModifierCategory.Organization),
    ACCIDENT("1", "45", "Accident", ModifierCategory.CompositeLoss),
    ASSASSINATION("1", "46", "Assassination", ModifierCategory.Crime),
    EXECUTION("1", "47", "Execution", ModifierCategory.Crime),
    KIDNAPPING("1", "48", "Kidnapping", ModifierCategory.Crime),
    PIRACY("1", "49", "Piracy", ModifierCategory.Crime),
    RAPE("1", "50", "Rape", ModifierCategory.Crime),
    ANTISUBMARINE_WARFARE("1", "51", "Antisubmarine Warfare", ModifierCategory.MissionArea),
    ESCORT("1", "52", "Escort", ModifierCategory.MissionArea),
    MINE_COUNTERMEASURES("1", "53", "Mine Countermeasures", ModifierCategory.MissionArea),
    MINE_WARFARE("1", "54", "Mine Warfare", ModifierCategory.MissionArea),
    SURFACE_WARFARE("1", "55", "Surface Warfare", ModifierCategory.MissionArea),
    HIJACK("1", "65", "Hijack/Hijacking/Hijacker", ModifierCategory.Crime),
    ELECTROMAGNETIC_WARFARE("1", "66", "Electromagnetic Warfare", ModifierCategory.Capability);

    private final String groupId;
    private final String id;
    private final String label;
    private final ModifierCategory category;

    CommonSectorOneModifier(String groupId, String id, String label, ModifierCategory category) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
        return category;
    }

    @Override
    public String getGraphicIdentifier() {
        return String.format("C1%s%s", getGroupId(), getId());
    }

    @Override
    public String getGroupId() {
        return groupId;
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
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.COMMON;
    }

    @Override
    public boolean isUnknown() {
        return StringUtils.equals("0", groupId) && StringUtils.equals("00", id);
    }

}