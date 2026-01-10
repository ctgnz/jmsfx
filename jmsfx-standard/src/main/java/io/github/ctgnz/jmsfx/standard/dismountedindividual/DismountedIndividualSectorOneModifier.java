package io.github.ctgnz.jmsfx.standard.dismountedindividual;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum DismountedIndividualSectorOneModifier implements SectorOneModifier {
    NGO("07", "Non-Governmental Organization Member", ModifierCategory.Organization),
    FAO("11", "Field Artillery Observer", ModifierCategory.Task),
    JOINT_FIRE_SUPPORT("12", "Joint Fire Support", ModifierCategory.Task),
    LIAISON("13", "Liaison", ModifierCategory.Task),
    MESSENGER("14", "Messenger", ModifierCategory.Task),
    MILITARY_POLICE("15", "Military Police (MP)", ModifierCategory.Task),
    OBSERVER("16", "Observer", ModifierCategory.Task),
    DESIGNATED_MARKSMAN("17", "Designated Marksman (DM)", ModifierCategory.Task),
    SIGNALLER("20", "Signaller", ModifierCategory.Service),
    RECONNAISSANCE("21", "Reconnaissance", ModifierCategory.Service),
    INFANTRY("22", "Infantry", ModifierCategory.Service),
    COMMANDER("23", "Commander (CDR)", ModifierCategory.Task),
    SECOND_IN_COMMAND("24", "Second in Command (SIC)", ModifierCategory.Task),
    DEMOLITION("25", "Demolition", ModifierCategory.Task),
    POLICE("26", "Police", ModifierCategory.Organization),
    INDIVIDUAL("46", "Individual", ModifierCategory.Echelon),
    TEAM("47", "Team/Crew", ModifierCategory.Echelon),
    SQUAD("48", "Squad", ModifierCategory.Echelon),
    SECTION("49", "Section", ModifierCategory.Echelon),
    PLATOON("50", "Platoon/Detachment", ModifierCategory.Echelon),
    COMPANY("51", "Company", ModifierCategory.Echelon),
    BATTALION("52", "Battalion", ModifierCategory.Echelon),
    REGIMENT("53", "Regiment/Group", ModifierCategory.Echelon);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    DismountedIndividualSectorOneModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
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
        return SymbolSetEnum.DISMOUNTED;
    }

}