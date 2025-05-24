package nz.co.ctg.jmsfx.model.dismountedindividual;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum DismountedIndividualSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_ONE_MOD("00", "Unspecified", "General", SymbolSet.SS_DISMOUNTED),
    NGO_MOD("07", "Non-Governmental Organization Member", "Organization", SymbolSet.SS_DISMOUNTED),
    JOINT_FIRE_SUPPORT("12", "Joint Fire Support", "Task", SymbolSet.SS_DISMOUNTED),
    LIAISON("13", "Liaison", "Task", SymbolSet.SS_DISMOUNTED),
    MESSENGER("14", "Messenger", "Task", SymbolSet.SS_DISMOUNTED),
    MILITARY_POLICE("15", "Military Police (MP)", "Task", SymbolSet.SS_DISMOUNTED),
    OBSERVER("16", "Observer", "Task", SymbolSet.SS_DISMOUNTED),
    DESIGNATED_MARKSMAN("17", "Designated Marksman (DM)", "Task", SymbolSet.SS_DISMOUNTED),
    SIGNALLER("20", "Signaller", "Service", SymbolSet.SS_DISMOUNTED),
    RECONNAISSANCE("21", "Reconnaissance", "Service", SymbolSet.SS_DISMOUNTED),
    INFANTRY("22", "Infantry", "Service", SymbolSet.SS_DISMOUNTED),
    COMMANDER("23", "Commander (CDR)", "Task", SymbolSet.SS_DISMOUNTED),
    SECOND_IN_COMMAND("24", "Second in Command (SIC)", "Task", SymbolSet.SS_DISMOUNTED),
    DEMOLITION("25", "Demolition", "Task", SymbolSet.SS_DISMOUNTED),
    POLICE("26", "Police", "Organization", SymbolSet.SS_DISMOUNTED),
    INDIVIDUAL_MOD("46", "Individual", "Echelon", SymbolSet.SS_DISMOUNTED),
    TEAM_MOD("47", "Team/Crew", "Echelon", SymbolSet.SS_DISMOUNTED),
    SQUAD_MOD("48", "Squad", "Echelon", SymbolSet.SS_DISMOUNTED),
    SECTION_MOD("49", "Section", "Echelon", SymbolSet.SS_DISMOUNTED),
    PLATOON_MOD("50", "Platoon/Detachment", "Echelon", SymbolSet.SS_DISMOUNTED),
    COMPANY_MOD("51", "Company", "Echelon", SymbolSet.SS_DISMOUNTED),
    BATTALION_MOD("52", "Battalion", "Echelon", SymbolSet.SS_DISMOUNTED),
    REGIMENT_MOD("53", "Regiment/Group", "Echelon", SymbolSet.SS_DISMOUNTED),
    STAFFEL_MOD("54", "Staffel", "Echelon", SymbolSet.SS_DISMOUNTED);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private DismountedIndividualSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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