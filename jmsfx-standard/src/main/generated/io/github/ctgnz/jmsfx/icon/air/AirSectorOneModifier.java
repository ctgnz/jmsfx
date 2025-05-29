package io.github.ctgnz.jmsfx.icon.air;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;

public enum AirSectorOneModifier implements SectorOneModifier {
    NOT_APPLICABLE_MOD("00", "Not Applicable", "General", SymbolSet.AIR),
    BOMBER_MOD("02", "Bomber", "Military Aircraft Type", SymbolSet.AIR),
    FIGHTER_MOD("04", "Fighter", "Military Aircraft Type", SymbolSet.AIR),
    INTERCEPTOR_MOD("05", "Interceptor", "Military Aircraft Type", SymbolSet.AIR),
    TANKER_MOD("06", "Tanker", "Aircraft Type", SymbolSet.AIR),
    PASSENGER_MOD("09", "Passenger", "Aircraft Type", SymbolSet.AIR),
    ULTRA_LIGHT_MOD("10", "Ultra Light", "Aircraft Type", SymbolSet.AIR),
    ACP_MOD("11", "Airborne Command Post (ACP)", "Military Aircraft Type", SymbolSet.AIR),
    AEW_MOD("12", "Airborne Early Warning (AEW)", "Military Aircraft Type", SymbolSet.AIR),
    GOV_MOD("13", "Government", "Aircraft Type", SymbolSet.AIR),
    EC_MOD("16", "Electronic Combat (EC)/Jammer", "Military Mission Area", SymbolSet.AIR),
    PATROL_MOD("17", "Patrol", "Mission Area", SymbolSet.AIR),
    RECON_MOD("18", "Reconnaissance", "Mission Area", SymbolSet.AIR),
    TRAINER_MOD("19", "Trainer", "Mission Area", SymbolSet.AIR),
    PHOTO_MOD("20", "Photographic (Reconnaissance)", "Mission Area", SymbolSet.AIR),
    PERSONNEL_RECOVERY_MOD("21", "Personnel Recovery", "Mission Area", SymbolSet.AIR),
    COMMS_MOD("23", "Communications", "Mission Area", SymbolSet.AIR),
    ESM_MOD("24", "Electronic Support Measures (ESM)", "Military Mission Area", SymbolSet.AIR),
    VIP_MOD("29", "Very Important Person (VIP) Transport", "Mission Area", SymbolSet.AIR),
    CSAR_MOD("30", "Combat Search and Rescue (CSAR)", "Military Mission Area", SymbolSet.AIR),
    SUPP_EAD_MOD("31", "Suppression of Enemy Air Defenses", "Military Mission Area", SymbolSet.AIR),
    ASUW_MOD("32", "Antisurface Warfare", "Military Mission Area", SymbolSet.AIR),
    FB_MOD("33", "Fighter/Bomber", "Military Aircraft Type", SymbolSet.AIR),
    IC_MOD("34", "Intensive Care", "Mission Area", SymbolSet.AIR),
    EA_MOD("35", "Electronic Attack (EA)", "Military Mission Area", SymbolSet.AIR),
    MULTIMISSION_MOD("36", "Multimission", "Mission Area", SymbolSet.AIR),
    ASW_HELO_LAMPS_MOD("38", "ASW Helo - LAMPS", "Mission Area", SymbolSet.AIR),
    ASW_HELO_SH_60R_MOD("39", "ASW Helo - SH-60R", "Mission Area", SymbolSet.AIR);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private AirSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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