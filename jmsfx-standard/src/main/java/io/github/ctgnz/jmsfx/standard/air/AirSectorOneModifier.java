package io.github.ctgnz.jmsfx.standard.air;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum AirSectorOneModifier implements SectorOneModifier {
    BOMBER("02", "Bomber", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    FIGHTER("04", "Fighter", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    INTERCEPTOR("05", "Interceptor", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    TANKER("06", "Tanker", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    PASSENGER("09", "Passenger", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    ULTRA_LIGHT("10", "Ultra Light", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    ACP("11", "Airborne Command Post (ACP)", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    AEW("12", "Airborne Early Warning (AEW)", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    GOV("13", "Government", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    EC("16", "Electronic Combat (EC)/Jammer", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    PATROL("17", "Patrol", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    RECON("18", "Reconnaissance", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    TRAINER("19", "Trainer", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    PHOTO("20", "Photographic (Reconnaissance)", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    PERSONNEL_RECOVERY("21", "Personnel Recovery", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    COMMS("23", "Communications", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    ESM("24", "Electronic Support Measures (ESM)", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    VIP("29", "Very Important Person (VIP) Transport", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    CSAR("30", "Combat Search and Rescue (CSAR)", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    SUPP_EAD("31", "Suppression of Enemy Air Defenses", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    ASUW("32", "Antisurface Warfare", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    FB("33", "Fighter/Bomber", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    IC("34", "Intensive Care", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    EA("35", "Electronic Attack (EA)", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    MULTIMISSION("36", "Multimission", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    ASW_HELO_LAMPS("38", "ASW Helo - LAMPS", ModifierCategory.MissionArea, SymbolSetEnum.AIR),
    ASW_HELO_SH_60R("39", "ASW Helo - SH-60R", ModifierCategory.MissionArea, SymbolSetEnum.AIR);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    AirSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
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
        return symbolSet;
    }

}