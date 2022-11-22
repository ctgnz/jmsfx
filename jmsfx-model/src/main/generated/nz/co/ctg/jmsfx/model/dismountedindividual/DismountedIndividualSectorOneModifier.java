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
    J1_MOD("12", "J1", SymbolSet.SS_DISMOUNTED),
    J2_MOD("13", "J2", SymbolSet.SS_DISMOUNTED),
    J3_MOD("14", "J3", SymbolSet.SS_DISMOUNTED),
    J4_MOD("15", "J4", SymbolSet.SS_DISMOUNTED),
    J5_MOD("16", "J5", SymbolSet.SS_DISMOUNTED),
    J6_MOD("17", "J6", SymbolSet.SS_DISMOUNTED),
    J7_MOD("18", "J7", SymbolSet.SS_DISMOUNTED),
    J8_MOD("19", "J8", SymbolSet.SS_DISMOUNTED),
    J9_MOD("20", "J9", SymbolSet.SS_DISMOUNTED),
    OF01_MOD("21", "OF-1", SymbolSet.SS_DISMOUNTED),
    OF02_MOD("22", "OF-2", SymbolSet.SS_DISMOUNTED),
    OF03_MOD("23", "OF-3", SymbolSet.SS_DISMOUNTED),
    OF04_MOD("24", "OF-4", SymbolSet.SS_DISMOUNTED),
    OF05_MOD("25", "OF-5", SymbolSet.SS_DISMOUNTED),
    OF06_MOD("26", "OF-6", SymbolSet.SS_DISMOUNTED),
    OF07_MOD("27", "OF-7", SymbolSet.SS_DISMOUNTED),
    OF08_MOD("28", "OF-8", SymbolSet.SS_DISMOUNTED),
    OF09_MOD("29", "OF-9", SymbolSet.SS_DISMOUNTED),
    OF10_MOD("30", "OF-10", SymbolSet.SS_DISMOUNTED),
    OFD_MOD("31", "OF-D", SymbolSet.SS_DISMOUNTED),
    OR1_MOD("32", "OR-1", SymbolSet.SS_DISMOUNTED),
    OR2_MOD("33", "OR-2", SymbolSet.SS_DISMOUNTED),
    OR3_MOD("34", "OR-3", SymbolSet.SS_DISMOUNTED),
    OR4_MOD("35", "OR-4", SymbolSet.SS_DISMOUNTED),
    OR5_MOD("36", "OR-5", SymbolSet.SS_DISMOUNTED),
    OR6_MOD("37", "OR-6", SymbolSet.SS_DISMOUNTED),
    OR7_MOD("38", "OR-7", SymbolSet.SS_DISMOUNTED),
    OR8_MOD("39", "OR-8", SymbolSet.SS_DISMOUNTED),
    OR9_MOD("40", "OR-9", SymbolSet.SS_DISMOUNTED),
    WO1_MOD("41", "WO-1", SymbolSet.SS_DISMOUNTED),
    WO2_MOD("42", "WO-2", SymbolSet.SS_DISMOUNTED),
    WO3_MOD("43", "WO-3", SymbolSet.SS_DISMOUNTED),
    WO4_MOD("44", "WO-4", SymbolSet.SS_DISMOUNTED),
    WO5_MOD("45", "WO-5", SymbolSet.SS_DISMOUNTED),
    INDIVIDUAL_MOD("46", "Individual", SymbolSet.SS_DISMOUNTED),
    TEAM_MOD("47", "Team/Crew", SymbolSet.SS_DISMOUNTED),
    SQUAD_MOD("48", "Squad", SymbolSet.SS_DISMOUNTED),
    SECTION_MOD("49", "Section", SymbolSet.SS_DISMOUNTED),
    PLATOON_MOD("50", "Platoon/Detachment", SymbolSet.SS_DISMOUNTED),
    COMPANY_MOD("51", "Company", SymbolSet.SS_DISMOUNTED),
    BATTALION_MOD("52", "Battalion", SymbolSet.SS_DISMOUNTED),
    REGIMENT_MOD("53", "Regiment/Group", SymbolSet.SS_DISMOUNTED),
    BRIGADE_MOD("54", "Brigade", SymbolSet.SS_DISMOUNTED),
    DIVISION_MOD("55", "Division", SymbolSet.SS_DISMOUNTED);

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