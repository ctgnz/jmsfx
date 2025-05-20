package nz.co.ctg.jmsfx.model.dismountedindividual;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum DismountedIndividualSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_ONE_MOD("00", "Unspecified", SymbolSet.SS_DISMOUNTED),
    NGO_MOD("07", "Non-Governmental Organization Member", SymbolSet.SS_DISMOUNTED),
    JOINT_FIRE_SUPPORT("12", "Joint Fire Support", SymbolSet.SS_DISMOUNTED),
    LIAISON("13", "Liaison", SymbolSet.SS_DISMOUNTED),
    MESSENGER("14", "Messenger", SymbolSet.SS_DISMOUNTED),
    MILITARY_POLICE("15", "Military Police (MP)", SymbolSet.SS_DISMOUNTED),
    OBSERVER("16", "Observer", SymbolSet.SS_DISMOUNTED),
    DESIGNATED_MARKSMAN("17", "Designated Marksman (DM)", SymbolSet.SS_DISMOUNTED),
    SIGNALLER("20", "Signaller", SymbolSet.SS_DISMOUNTED),
    RECONNAISSANCE("21", "Reconnaissance", SymbolSet.SS_DISMOUNTED),
    INFANTRY("22", "Infantry", SymbolSet.SS_DISMOUNTED),
    COMMANDER("23", "Commander (CDR)", SymbolSet.SS_DISMOUNTED),
    SECOND_IN_COMMAND("24", "Second in Command (SIC)", SymbolSet.SS_DISMOUNTED),
    DEMOLITION("25", "Demolition", SymbolSet.SS_DISMOUNTED),
    POLICE("26", "Police", SymbolSet.SS_DISMOUNTED),
    INDIVIDUAL_MOD("46", "Individual", SymbolSet.SS_DISMOUNTED),
    TEAM_MOD("47", "Team/Crew", SymbolSet.SS_DISMOUNTED),
    SQUAD_MOD("48", "Squad", SymbolSet.SS_DISMOUNTED),
    SECTION_MOD("49", "Section", SymbolSet.SS_DISMOUNTED),
    PLATOON_MOD("50", "Platoon/Detachment", SymbolSet.SS_DISMOUNTED),
    COMPANY_MOD("51", "Company", SymbolSet.SS_DISMOUNTED),
    BATTALION_MOD("52", "Battalion", SymbolSet.SS_DISMOUNTED),
    REGIMENT_MOD("53", "Regiment/Group", SymbolSet.SS_DISMOUNTED),
    STAFFEL_MOD("54", "Staffel", SymbolSet.SS_DISMOUNTED);

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