package io.github.ctgnz.jmsfx.standard.common;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

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
    MULTIFUNCTIONAL("1", "25", "Multifunctional", ModifierCategory.Capability);

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
        return StringUtils.equals("0", groupId) && StringUtils.equals("00", id);
    }

}