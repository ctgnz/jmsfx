package io.github.ctgnz.jmsfx.icon.dismountedindividual;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum DismountedIndividualSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_ONE_MOD("00", "Unspecified", "General", SymbolSetEnum.DISMOUNTED),
    NGO_MOD("07", "Non-Governmental Organization Member", "Organization", SymbolSetEnum.DISMOUNTED),
    FAO_MOD("11", "Field Artillery Observer", "Task", SymbolSetEnum.DISMOUNTED),
    JOINT_FIRE_SUPPORT_MOD("12", "Joint Fire Support", "Task", SymbolSetEnum.DISMOUNTED),
    LIAISON_MOD("13", "Liaison", "Task", SymbolSetEnum.DISMOUNTED),
    MESSENGER_MOD("14", "Messenger", "Task", SymbolSetEnum.DISMOUNTED),
    MILITARY_POLICE_MOD("15", "Military Police (MP)", "Task", SymbolSetEnum.DISMOUNTED),
    OBSERVER_MOD("16", "Observer", "Task", SymbolSetEnum.DISMOUNTED),
    DESIGNATED_MARKSMAN_MOD("17", "Designated Marksman (DM)", "Task", SymbolSetEnum.DISMOUNTED),
    SIGNALLER_MOD("20", "Signaller", "Service", SymbolSetEnum.DISMOUNTED),
    RECONNAISSANCE_MOD("21", "Reconnaissance", "Service", SymbolSetEnum.DISMOUNTED),
    INFANTRY_MOD("22", "Infantry", "Service", SymbolSetEnum.DISMOUNTED),
    COMMANDER_MOD("23", "Commander (CDR)", "Task", SymbolSetEnum.DISMOUNTED),
    SECOND_IN_COMMAND_MOD("24", "Second in Command (SIC)", "Task", SymbolSetEnum.DISMOUNTED),
    DEMOLITION_MOD("25", "Demolition", "Task", SymbolSetEnum.DISMOUNTED),
    POLICE_MOD("26", "Police", "Organization", SymbolSetEnum.DISMOUNTED),
    INDIVIDUAL_MOD("46", "Individual", "Echelon", SymbolSetEnum.DISMOUNTED),
    TEAM_MOD("47", "Team/Crew", "Echelon", SymbolSetEnum.DISMOUNTED),
    SQUAD_MOD("48", "Squad", "Echelon", SymbolSetEnum.DISMOUNTED),
    SECTION_MOD("49", "Section", "Echelon", SymbolSetEnum.DISMOUNTED),
    PLATOON_MOD("50", "Platoon/Detachment", "Echelon", SymbolSetEnum.DISMOUNTED),
    COMPANY_MOD("51", "Company", "Echelon", SymbolSetEnum.DISMOUNTED),
    BATTALION_MOD("52", "Battalion", "Echelon", SymbolSetEnum.DISMOUNTED),
    REGIMENT_MOD("53", "Regiment/Group", "Echelon", SymbolSetEnum.DISMOUNTED);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    DismountedIndividualSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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