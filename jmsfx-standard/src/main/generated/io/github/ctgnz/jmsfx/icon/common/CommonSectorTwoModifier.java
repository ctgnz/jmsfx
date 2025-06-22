package io.github.ctgnz.jmsfx.icon.common;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum CommonSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("0", "00", "Unspecified", "General"),
    AIRBORNE_2_MOD("1", "00", "Airborne", "Mobility"),
    BICYCLE_EQUIPPED_2_MOD("1", "01", "Bicycle Equipped", "Mobility"),
    RAILROAD_RAILWAY_2_MOD("1", "02", "Railroad/Railway", "Mobility"),
    SKI_2_MOD("1", "03", "Ski", "Mobility"),
    TRACKED_2_MOD("1", "04", "Tracked", "Mobility"),
    STANDARD_ON_ROAD_MOBILITY_2_MOD("1", "05", "Standard Mobility/On-Road Mobility", "Mobility"),
    HIGH_OFF_ROAD_MOBILITY_2_MOD("1", "06", "High Mobility/Off-Road Mobility", "Mobility"),
    FIXED_WING_2_MOD("1", "07", "Fixed Wing", "Mobility"),
    ROTARY_WING_2_MOD("1", "08", "Rotary Wing", "Mobility"),
    ROBOTIC_2_MOD("1", "09", "Robotic", "Mobility"),
    AUTONOMOUS_CONTROL_2_MOD("1", "10", "Autonomous Control", "Capability"),
    REMOTELY_PILOTED_2_MOD("1", "11", "Remotely Piloted", "Capability"),
    EXPENDABLE_2_MOD("1", "12", "Expendable", "Capability"),
    MOUNTAIN_2_MOD("1", "13", "Mountain", "Capability"),
    LONG_RANGE_2_MOD("1", "14", "Long Range", "Capability"),
    MEDIUM_RANGE_2_MOD("1", "15", "Medium Range", "Capability"),
    SHORT_RANGE_2_MOD("1", "16", "Short Range", "Capability"),
    CLOSE_RANGE_2_MOD("1", "17", "Close Range", "Capability"),
    HEAVY_2_MOD("1", "18", "Heavy", "Capability"),
    MEDIUM_2_MOD("1", "19", "Medium", "Capability"),
    LIGHT_MEDIUM_2_MOD("1", "20", "Light and Medium", "Capability"),
    LIGHT_2_MOD("1", "21", "Light", "Capability"),
    CYBERSPACE_2_MOD("1", "22", "Cyberspace", "Capability"),
    SECURITY_FORCE_ASSISTANCE_2_MOD("1", "23", "Security Force Assistance", "Capability"),
    MEDICAL_BED_2_MOD("1", "24", "Medical Bed", "Capability"),
    MULTIFUNCTIONAL_2_MOD("1", "25", "Multifunctional", "Capability");

    private final String groupId;
    private final String id;
    private final String label;
    private final String category;

    CommonSectorTwoModifier(String groupId, String id, String label, String category) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public String getCategory() {
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
        return StringUtils.equals("0", groupId) && StringUtils.equals("00", id);
    }

}