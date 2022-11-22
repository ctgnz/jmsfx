package nz.co.ctg.jmsfx.model.dismountedindividual;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum DismountedIndividualSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_ONE_MOD("00", "Unspecified", SymbolSet.SS_DISMOUNTED),
    CLOSE_PROTECTION_MOD("01", "Close Protection", SymbolSet.SS_DISMOUNTED),
    CROWD_RIOT_CONTROL_MOD("02", "Crowd and Riot Control", SymbolSet.SS_DISMOUNTED),
    EOD_MOD("03", "Explosive Ordnance Disposal (EOD)", SymbolSet.SS_DISMOUNTED),
    SECURITY_MOD("04", "Security", SymbolSet.SS_DISMOUNTED),
    SNIPER_MOD("05", "Sniper", SymbolSet.SS_DISMOUNTED),
    SWAT_MOD("06", "Special Weapons and Tactics", SymbolSet.SS_DISMOUNTED),
    NGO_MOD("07", "Non-Governmental Organization Member", SymbolSet.SS_DISMOUNTED),
    MULTINATIONAL_MOD("08", "Multinational", SymbolSet.SS_DISMOUNTED),
    MSU_MOD("09", "Multinational Specialized Unit", SymbolSet.SS_DISMOUNTED),
    GOVERNMENTAL("10", "Governmental Organization Member", SymbolSet.SS_DISMOUNTED),
    COMBAT_CAMERA("11", "Video Imagery (Combat Camera)", SymbolSet.SS_DISMOUNTED),
    INDIVIDUAL_MOD("46", "Individual", SymbolSet.SS_DISMOUNTED);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private DismountedIndividualSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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