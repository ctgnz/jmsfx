package io.github.ctgnz.jmsfx.standard.air;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum AirSectorOneModifier implements SectorOneModifier {
    BOMBER_MOD("02", "Bomber", "Military Aircraft Type", SymbolSetEnum.AIR),
    FIGHTER_MOD("04", "Fighter", "Military Aircraft Type", SymbolSetEnum.AIR),
    INTERCEPTOR_MOD("05", "Interceptor", "Military Aircraft Type", SymbolSetEnum.AIR),
    TANKER_MOD("06", "Tanker", "Aircraft Type", SymbolSetEnum.AIR),
    PASSENGER_MOD("09", "Passenger", "Aircraft Type", SymbolSetEnum.AIR),
    ULTRA_LIGHT_MOD("10", "Ultra Light", "Aircraft Type", SymbolSetEnum.AIR),
    ACP_MOD("11", "Airborne Command Post (ACP)", "Military Aircraft Type", SymbolSetEnum.AIR),
    AEW_MOD("12", "Airborne Early Warning (AEW)", "Military Aircraft Type", SymbolSetEnum.AIR),
    GOV_MOD("13", "Government", "Aircraft Type", SymbolSetEnum.AIR),
    EC_MOD("16", "Electronic Combat (EC)/Jammer", "Military Mission Area", SymbolSetEnum.AIR),
    PATROL_MOD("17", "Patrol", "Mission Area", SymbolSetEnum.AIR),
    RECON_MOD("18", "Reconnaissance", "Mission Area", SymbolSetEnum.AIR),
    TRAINER_MOD("19", "Trainer", "Mission Area", SymbolSetEnum.AIR),
    PHOTO_MOD("20", "Photographic (Reconnaissance)", "Mission Area", SymbolSetEnum.AIR),
    PERSONNEL_RECOVERY_MOD("21", "Personnel Recovery", "Mission Area", SymbolSetEnum.AIR),
    COMMS_MOD("23", "Communications", "Mission Area", SymbolSetEnum.AIR),
    ESM_MOD("24", "Electronic Support Measures (ESM)", "Military Mission Area", SymbolSetEnum.AIR),
    VIP_MOD("29", "Very Important Person (VIP) Transport", "Mission Area", SymbolSetEnum.AIR),
    CSAR_MOD("30", "Combat Search and Rescue (CSAR)", "Military Mission Area", SymbolSetEnum.AIR),
    SUPP_EAD_MOD("31", "Suppression of Enemy Air Defenses", "Military Mission Area", SymbolSetEnum.AIR),
    ASUW_MOD("32", "Antisurface Warfare", "Military Mission Area", SymbolSetEnum.AIR),
    FB_MOD("33", "Fighter/Bomber", "Military Aircraft Type", SymbolSetEnum.AIR),
    IC_MOD("34", "Intensive Care", "Mission Area", SymbolSetEnum.AIR),
    EA_MOD("35", "Electronic Attack (EA)", "Military Mission Area", SymbolSetEnum.AIR),
    MULTIMISSION_MOD("36", "Multimission", "Mission Area", SymbolSetEnum.AIR),
    ASW_HELO_LAMPS_MOD("38", "ASW Helo - LAMPS", "Mission Area", SymbolSetEnum.AIR),
    ASW_HELO_SH_60R_MOD("39", "ASW Helo - SH-60R", "Mission Area", SymbolSetEnum.AIR);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    AirSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }

    @Override
    public String getCategory() {
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