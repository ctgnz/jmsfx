package io.github.ctgnz.jmsfx.standard.dismountedindividual;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum DismountedIndividualSectorOneModifier implements SectorOneModifier {
    NGO("07", "Non-Governmental Organization Member", ModifierCategory.Organization, SymbolSetEnum.DISMOUNTED),
    FAO("11", "Field Artillery Observer", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    JOINT_FIRE_SUPPORT("12", "Joint Fire Support", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    LIAISON("13", "Liaison", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    MESSENGER("14", "Messenger", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    MILITARY_POLICE("15", "Military Police (MP)", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    OBSERVER("16", "Observer", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    DESIGNATED_MARKSMAN("17", "Designated Marksman (DM)", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    SIGNALLER("20", "Signaller", ModifierCategory.Service, SymbolSetEnum.DISMOUNTED),
    RECONNAISSANCE("21", "Reconnaissance", ModifierCategory.Service, SymbolSetEnum.DISMOUNTED),
    INFANTRY("22", "Infantry", ModifierCategory.Service, SymbolSetEnum.DISMOUNTED),
    COMMANDER("23", "Commander (CDR)", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    SECOND_IN_COMMAND("24", "Second in Command (SIC)", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    DEMOLITION("25", "Demolition", ModifierCategory.Task, SymbolSetEnum.DISMOUNTED),
    POLICE("26", "Police", ModifierCategory.Organization, SymbolSetEnum.DISMOUNTED),
    INDIVIDUAL("46", "Individual", ModifierCategory.Echelon, SymbolSetEnum.DISMOUNTED),
    TEAM("47", "Team/Crew", ModifierCategory.Echelon, SymbolSetEnum.DISMOUNTED),
    SQUAD("48", "Squad", ModifierCategory.Echelon, SymbolSetEnum.DISMOUNTED),
    SECTION("49", "Section", ModifierCategory.Echelon, SymbolSetEnum.DISMOUNTED),
    PLATOON("50", "Platoon/Detachment", ModifierCategory.Echelon, SymbolSetEnum.DISMOUNTED),
    COMPANY("51", "Company", ModifierCategory.Echelon, SymbolSetEnum.DISMOUNTED),
    BATTALION("52", "Battalion", ModifierCategory.Echelon, SymbolSetEnum.DISMOUNTED),
    REGIMENT("53", "Regiment/Group", ModifierCategory.Echelon, SymbolSetEnum.DISMOUNTED);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    DismountedIndividualSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
    }

    @Override
    public ModifierCategory getCategory() {
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