package io.github.ctgnz.jmsfx.standard.landcivilian;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandCivilianSectorOneModifier implements SectorOneModifier {
    MURDER_VICTIMS("03", "Murder Victims", ModifierCategory.Crime),
    DISPLACED("09", "Displaced Person(s), Refugee(s) and Evacuee(s)", ModifierCategory.Organization),
    FOREIGN_FIGHTER("10", "Foreign Fighter(s)", ModifierCategory.Organization),
    GANG("11", "Gang Member or Gang", ModifierCategory.Organization),
    LEADER_1("13", "Leader or Leadership", ModifierCategory.Organization),
    NONGOVERNMENTAL_ORGANIZATION("14", "Nongovernmental Organization Member or Nongovernmental Organization", ModifierCategory.Organization),
    COERCED_RECRUIT("15", "Coerced/Impressed Recruit", ModifierCategory.Organization),
    WILLING_RECRUIT("16", "Willing Recruit", ModifierCategory.Organization),
    RELIGIOUS("17", "Religious or Religious Organization", ModifierCategory.Organization),
    TARGETED("18", "Targeted Individual or Organization", ModifierCategory.Organization),
    TERRORIST("19", "Terrorist or Terrorist Organization", ModifierCategory.Organization),
    SPEAKER("20", "Speaker", ModifierCategory.Organization),
    OTHER("23", "Other", ModifierCategory.CompositeLoss),
    LOOT("24", "Loot", ModifierCategory.Crime);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandCivilianSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_CIVILIAN;
    }

}