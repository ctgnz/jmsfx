package nz.co.ctg.jmsfx.model.air;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum AirSectorOneModifier implements SectorOneModifier {
    NOT_APPLICABLE_MOD("00", "Not Applicable", SymbolSet.SS_AIR),
    BOMBER_MOD("02", "Bomber", SymbolSet.SS_AIR),
    FIGHTER_MOD("04", "Fighter", SymbolSet.SS_AIR),
    INTERCEPTOR_MOD("05", "Interceptor", SymbolSet.SS_AIR),
    TANKER_MOD("06", "Tanker", SymbolSet.SS_AIR),
    PASSENGER_MOD("09", "Passenger", SymbolSet.SS_AIR),
    ULTRA_LIGHT_MOD("10", "Ultra Light", SymbolSet.SS_AIR),
    ACP_MOD("11", "Airborne Command Post (ACP)", SymbolSet.SS_AIR),
    AEW_MOD("12", "Airborne Early Warning (AEW)", SymbolSet.SS_AIR),
    GOV_MOD("13", "Government", SymbolSet.SS_AIR),
    EC_MOD("16", "Electronic Combat (EC)/Jammer", SymbolSet.SS_AIR),
    PATROL_MOD("17", "Patrol", SymbolSet.SS_AIR),
    RECON_MOD("18", "Reconnaissance", SymbolSet.SS_AIR),
    TRAINER_MOD("19", "Trainer", SymbolSet.SS_AIR),
    PHOTO_MOD("20", "Photographic (Reconnaissance)", SymbolSet.SS_AIR),
    PERSONNEL_RECOVERY_MOD("21", "Personnel Recovery", SymbolSet.SS_AIR),
    COMMS_MOD("23", "Communications", SymbolSet.SS_AIR),
    ESM_MOD("24", "Electronic Support Measures (ESM)", SymbolSet.SS_AIR),
    VIP_MOD("29", "Very Important Person (VIP) Transport", SymbolSet.SS_AIR),
    CSAR_MOD("30", "Combat Search and Rescue (CSAR)", SymbolSet.SS_AIR),
    SUPP_EAD_MOD("31", "Suppression of Enemy Air Defenses", SymbolSet.SS_AIR),
    ASUW_MOD("32", "Antisurface Warfare", SymbolSet.SS_AIR),
    FB_MOD("33", "Fighter/Bomber", SymbolSet.SS_AIR),
    IC_MOD("34", "Intensive Care", SymbolSet.SS_AIR),
    EA_MOD("35", "Electronic Attack (EA)", SymbolSet.SS_AIR),
    MULTIMISSION_MOD("36", "Multimission", SymbolSet.SS_AIR),
    ASW_HELO_LAMPS_MOD("38", "ASW Helo - LAMPS", SymbolSet.SS_AIR),
    ASW_HELO_SH_60R_MOD("39", "ASW Helo - SH-60R", SymbolSet.SS_AIR);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private AirSectorOneModifier(String id, String label, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.symbolSet = symbolSet;
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