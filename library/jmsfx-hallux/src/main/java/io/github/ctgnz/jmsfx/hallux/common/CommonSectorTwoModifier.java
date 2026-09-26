package io.github.ctgnz.jmsfx.hallux.common;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.hallux.ModifierBounds;
import io.github.ctgnz.jmsfx.hallux.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum CommonSectorTwoModifier implements SectorTwoModifier {
        UNSPECIFIED("0", "00", "Unspecified", ModifierCategory.None),
        AIRBORNE("1", "00", "Airborne", ModifierCategory.Mobility),
        BICYCLE_EQUIPPED("1", "01", "Bicycle Equipped", ModifierCategory.Mobility),
        RAILROAD_RAILWAY("1", "02", "Railroad/Railway", ModifierCategory.Mobility),
        SKI("1", "03", "Ski", ModifierCategory.Mobility),
        TRACKED("1", "04", "Tracked", ModifierCategory.Mobility),
        STANDARD_ON_ROAD_MOBILITY("1", "05", "Standard Mobility/On-Road Mobility", ModifierCategory.Mobility),
        HIGH_OFF_ROAD_MOBILITY("1", "06", "High Mobility/Off-Road Mobility", ModifierCategory.Mobility),
        FIXED_WING("1", "07", "Fixed Wing", ModifierCategory.Mobility),
        ROTARY_WING("1", "08", "Rotary Wing", ModifierCategory.Mobility),
        ROBOTIC("1", "09", "Robotic", ModifierCategory.Mobility),
        AUTONOMOUS_CONTROL("1", "10", "Autonomous Control", ModifierCategory.Capability),
        REMOTELY_PILOTED("1", "11", "Remotely Piloted", ModifierCategory.Capability),
        EXPENDABLE("1", "12", "Expendable", ModifierCategory.Capability),
        MOUNTAIN("1", "13", "Mountain", ModifierCategory.Capability),
        LONG_RANGE("1", "14", "Long Range", ModifierCategory.Capability),
        MEDIUM_RANGE("1", "15", "Medium Range", ModifierCategory.Capability),
        SHORT_RANGE("1", "16", "Short Range", ModifierCategory.Capability),
        CLOSE_RANGE("1", "17", "Close Range", ModifierCategory.Capability),
        HEAVY("1", "18", "Heavy", ModifierCategory.Capability),
        MEDIUM("1", "19", "Medium", ModifierCategory.Capability),
        LIGHT_MEDIUM("1", "20", "Light and Medium", ModifierCategory.Capability),
        LIGHT("1", "21", "Light", ModifierCategory.Capability),
        CYBERSPACE("1", "22", "Cyberspace", ModifierCategory.Capability),
        SECURITY_FORCE_ASSISTANCE("1", "23", "Security Force Assistance", ModifierCategory.Capability),
        MEDICAL_BED("1", "24", "Medical Bed", ModifierCategory.Capability),
        MULTIFUNCTIONAL("1", "25", "Multifunctional", ModifierCategory.Capability),
        VERY_HEAVY("1", "A1", "Very Heavy", ModifierCategory.Capability),
        VERY_LONG_RANGE("1", "A2", "Very Long Range", ModifierCategory.Capability),
        BOMBER("2", "A1", "Bomber", ModifierCategory.MissionArea),
        FIGHTER("2", "A2", "Fighter", ModifierCategory.MissionArea),
        INTERCEPTOR("2", "A3", "Interceptor", ModifierCategory.MissionArea),
        TANKER("2", "A4", "Tanker", ModifierCategory.MissionArea),
        PASSENGER("2", "A5", "Passenger", ModifierCategory.MissionArea),
        ULTRA_LIGHT("2", "A6", "Ultra Light", ModifierCategory.MissionArea),
        ACP("2", "A7", "Airborne Command Post (ACP)", ModifierCategory.MissionArea),
        AEW("2", "A8", "Airborne Early Warning (AEW)", ModifierCategory.MissionArea),
        GOV("2", "A9", "Government", ModifierCategory.MissionArea),
        EC("2", "AA", "Electronic Combat (EC)/Jammer", ModifierCategory.MissionArea),
        PATROL("2", "AB", "Patrol", ModifierCategory.MissionArea),
        RECON("2", "AC", "Reconnaissance", ModifierCategory.MissionArea),
        TRAINER("2", "AD", "Trainer", ModifierCategory.MissionArea),
        PHOTO("2", "AE", "Photographic (Reconnaissance)", ModifierCategory.MissionArea),
        PERSONNEL_RECOVERY("2", "AF", "Personnel Recovery", ModifierCategory.MissionArea),
        COMMS("2", "B1", "Communications", ModifierCategory.MissionArea),
        ESM("2", "B2", "Electronic Support Measures (ESM)", ModifierCategory.MissionArea),
        VIP("2", "B3", "Very Important Person (VIP) Transport", ModifierCategory.MissionArea),
        CSAR("2", "B4", "Combat Search and Rescue (CSAR)", ModifierCategory.MissionArea),
        SUPP_EAD("2", "B5", "Suppression of Enemy Air Defenses", ModifierCategory.MissionArea),
        ASUW("2", "B6", "Antisurface Warfare", ModifierCategory.MissionArea),
        FB("2", "B7", "Fighter/Bomber", ModifierCategory.MissionArea),
        IC("2", "B8", "Intensive Care", ModifierCategory.MissionArea),
        EA("2", "B9", "Electronic Attack (EA)", ModifierCategory.MissionArea),
        MULTIMISSION("2", "BA", "Multimission", ModifierCategory.MissionArea),
        LIAISON("2", "BB", "Liaison", ModifierCategory.MissionArea),
        ESCORT("2", "BC", "Escort", ModifierCategory.MissionArea),
        CARGO("2", "BD", "Cargo/Transport", ModifierCategory.MissionArea),
        WEATHER("2", "BE", "Weather", ModifierCategory.MissionArea),
        OBSERVATION("2", "BF", "Observation", ModifierCategory.MissionArea),
        DAY("2", "C1", "Day", ModifierCategory.Capability),
        NIGHT("2", "C2", "Night", ModifierCategory.Capability),
        ALL_WEATHER("2", "C3", "All Weather", ModifierCategory.Capability),
        DIVE("2", "C4", "Dive", ModifierCategory.Capability),
        PARACHUTE("2", "D1", "Parachute", ModifierCategory.Mobility);

    private final String groupId;
    private final String id;
    private final String label;
    private final ModifierCategory category;

    CommonSectorTwoModifier(String groupId, String id, String label, ModifierCategory category) {
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
        return String.format("C2%s%s", getGroupId(), getId());
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
        return "0".equals(groupId) && "00".equals(id);
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}