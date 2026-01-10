package io.github.ctgnz.jmsfx.standard.air;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum AirSectorOneModifier implements SectorOneModifier {
    BOMBER("02", "Bomber", ModifierCategory.MissionArea),
    FIGHTER("04", "Fighter", ModifierCategory.MissionArea),
    INTERCEPTOR("05", "Interceptor", ModifierCategory.MissionArea),
    TANKER("06", "Tanker", ModifierCategory.MissionArea),
    PASSENGER("09", "Passenger", ModifierCategory.MissionArea),
    ULTRA_LIGHT("10", "Ultra Light", ModifierCategory.MissionArea),
    ACP("11", "Airborne Command Post (ACP)", ModifierCategory.MissionArea),
    AEW("12", "Airborne Early Warning (AEW)", ModifierCategory.MissionArea),
    GOV("13", "Government", ModifierCategory.MissionArea),
    EC("16", "Electronic Combat (EC)/Jammer", ModifierCategory.MissionArea),
    PATROL("17", "Patrol", ModifierCategory.MissionArea),
    RECON("18", "Reconnaissance", ModifierCategory.MissionArea),
    TRAINER("19", "Trainer", ModifierCategory.MissionArea),
    PHOTO("20", "Photographic (Reconnaissance)", ModifierCategory.MissionArea),
    PERSONNEL_RECOVERY("21", "Personnel Recovery", ModifierCategory.MissionArea),
    COMMS("23", "Communications", ModifierCategory.MissionArea),
    ESM("24", "Electronic Support Measures (ESM)", ModifierCategory.MissionArea),
    VIP("29", "Very Important Person (VIP) Transport", ModifierCategory.MissionArea),
    CSAR("30", "Combat Search and Rescue (CSAR)", ModifierCategory.MissionArea),
    SUPP_EAD("31", "Suppression of Enemy Air Defenses", ModifierCategory.MissionArea),
    ASUW("32", "Antisurface Warfare", ModifierCategory.MissionArea),
    FB("33", "Fighter/Bomber", ModifierCategory.MissionArea),
    IC("34", "Intensive Care", ModifierCategory.MissionArea),
    EA("35", "Electronic Attack (EA)", ModifierCategory.MissionArea),
    MULTIMISSION("36", "Multimission", ModifierCategory.MissionArea),
    ASW_HELO_LAMPS("38", "ASW Helo - LAMPS", ModifierCategory.MissionArea),
    ASW_HELO_SH_60R("39", "ASW Helo - SH-60R", ModifierCategory.MissionArea);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirSectorOneModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
        return category;
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
        return SymbolSetEnum.AIR;
    }

}