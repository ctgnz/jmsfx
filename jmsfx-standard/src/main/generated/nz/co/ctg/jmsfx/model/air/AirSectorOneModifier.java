package nz.co.ctg.jmsfx.model.air;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum AirSectorOneModifier implements SectorOneModifier {
    NOT_APPLICABLE_MOD("00", "Not Applicable", "General", SymbolSet.SS_AIR),
    BOMBER_MOD("02", "Bomber", "Military Aircraft Type", SymbolSet.SS_AIR),
    FIGHTER_MOD("04", "Fighter", "Military Aircraft Type", SymbolSet.SS_AIR),
    INTERCEPTOR_MOD("05", "Interceptor", "Military Aircraft Type", SymbolSet.SS_AIR),
    TANKER_MOD("06", "Tanker", "Aircraft Type", SymbolSet.SS_AIR),
    PASSENGER_MOD("09", "Passenger", "Aircraft Type", SymbolSet.SS_AIR),
    ULTRA_LIGHT_MOD("10", "Ultra Light", "Aircraft Type", SymbolSet.SS_AIR),
    ACP_MOD("11", "Airborne Command Post (ACP)", "Military Aircraft Type", SymbolSet.SS_AIR),
    AEW_MOD("12", "Airborne Early Warning (AEW)", "Military Aircraft Type", SymbolSet.SS_AIR),
    GOV_MOD("13", "Government", "Aircraft Type", SymbolSet.SS_AIR),
    EC_MOD("16", "Electronic Combat (EC)/Jammer", "Military Mission Area", SymbolSet.SS_AIR),
    PATROL_MOD("17", "Patrol", "Mission Area", SymbolSet.SS_AIR),
    RECON_MOD("18", "Reconnaissance", "Mission Area", SymbolSet.SS_AIR),
    TRAINER_MOD("19", "Trainer", "Mission Area", SymbolSet.SS_AIR),
    PHOTO_MOD("20", "Photographic (Reconnaissance)", "Mission Area", SymbolSet.SS_AIR),
    PERSONNEL_RECOVERY_MOD("21", "Personnel Recovery", "Mission Area", SymbolSet.SS_AIR),
    COMMS_MOD("23", "Communications", "Mission Area", SymbolSet.SS_AIR),
    ESM_MOD("24", "Electronic Support Measures (ESM)", "Military Mission Area", SymbolSet.SS_AIR),
    VIP_MOD("29", "Very Important Person (VIP) Transport", "Mission Area", SymbolSet.SS_AIR),
    CSAR_MOD("30", "Combat Search and Rescue (CSAR)", "Military Mission Area", SymbolSet.SS_AIR),
    SUPP_EAD_MOD("31", "Suppression of Enemy Air Defenses", "Military Mission Area", SymbolSet.SS_AIR),
    ASUW_MOD("32", "Antisurface Warfare", "Military Mission Area", SymbolSet.SS_AIR),
    FB_MOD("33", "Fighter/Bomber", "Military Aircraft Type", SymbolSet.SS_AIR),
    IC_MOD("34", "Intensive Care", "Mission Area", SymbolSet.SS_AIR),
    EA_MOD("35", "Electronic Attack (EA)", "Military Mission Area", SymbolSet.SS_AIR),
    MULTIMISSION_MOD("36", "Multimission", "Mission Area", SymbolSet.SS_AIR),
    ASW_HELO_LAMPS_MOD("38", "ASW Helo - LAMPS", "Mission Area", SymbolSet.SS_AIR),
    ASW_HELO_SH_60R_MOD("39", "ASW Helo - SH-60R", "Mission Area", SymbolSet.SS_AIR);

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