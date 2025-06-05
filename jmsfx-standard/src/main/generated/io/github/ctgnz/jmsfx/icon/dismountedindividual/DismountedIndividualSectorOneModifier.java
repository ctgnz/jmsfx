package io.github.ctgnz.jmsfx.icon.dismountedindividual;

import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum DismountedIndividualSectorOneModifier implements ISectorOneModifier {
    UNSPECIFIED_ONE_MOD("00", "Unspecified", "General", SymbolSet.DISMOUNTED),
    NGO_MOD("07", "Non-Governmental Organization Member", "Organization", SymbolSet.DISMOUNTED),
    FAO_MOD("11", "Field Artillery Observer", "Task", SymbolSet.DISMOUNTED),
    JOINT_FIRE_SUPPORT_MOD("12", "Joint Fire Support", "Task", SymbolSet.DISMOUNTED),
    LIAISON_MOD("13", "Liaison", "Task", SymbolSet.DISMOUNTED),
    MESSENGER_MOD("14", "Messenger", "Task", SymbolSet.DISMOUNTED),
    MILITARY_POLICE_MOD("15", "Military Police (MP)", "Task", SymbolSet.DISMOUNTED),
    OBSERVER_MOD("16", "Observer", "Task", SymbolSet.DISMOUNTED),
    DESIGNATED_MARKSMAN_MOD("17", "Designated Marksman (DM)", "Task", SymbolSet.DISMOUNTED),
    SIGNALLER_MOD("20", "Signaller", "Service", SymbolSet.DISMOUNTED),
    RECONNAISSANCE_MOD("21", "Reconnaissance", "Service", SymbolSet.DISMOUNTED),
    INFANTRY_MOD("22", "Infantry", "Service", SymbolSet.DISMOUNTED),
    COMMANDER_MOD("23", "Commander (CDR)", "Task", SymbolSet.DISMOUNTED),
    SECOND_IN_COMMAND_MOD("24", "Second in Command (SIC)", "Task", SymbolSet.DISMOUNTED),
    DEMOLITION_MOD("25", "Demolition", "Task", SymbolSet.DISMOUNTED),
    POLICE_MOD("26", "Police", "Organization", SymbolSet.DISMOUNTED),
    INDIVIDUAL_MOD("46", "Individual", "Echelon", SymbolSet.DISMOUNTED),
    TEAM_MOD("47", "Team/Crew", "Echelon", SymbolSet.DISMOUNTED),
    SQUAD_MOD("48", "Squad", "Echelon", SymbolSet.DISMOUNTED),
    SECTION_MOD("49", "Section", "Echelon", SymbolSet.DISMOUNTED),
    PLATOON_MOD("50", "Platoon/Detachment", "Echelon", SymbolSet.DISMOUNTED),
    COMPANY_MOD("51", "Company", "Echelon", SymbolSet.DISMOUNTED),
    BATTALION_MOD("52", "Battalion", "Echelon", SymbolSet.DISMOUNTED),
    REGIMENT_MOD("53", "Regiment/Group", "Echelon", SymbolSet.DISMOUNTED),
    STAFFEL_MOD("54", "Staffel", "Echelon", SymbolSet.DISMOUNTED);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    DismountedIndividualSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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