package io.github.ctgnz.jmsfx.standard.landcivilian;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandCivilianSectorOneModifier implements SectorOneModifier {
    MURDER_VICTIMS("03", "Murder Victims", ModifierCategory.Crime, SymbolSetEnum.LAND_CIVILIAN),
    DISPLACED("09", "Displaced Person(s), Refugee(s) and Evacuee(s)", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    FOREIGN_FIGHTER("10", "Foreign Fighter(s)", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    GANG("11", "Gang Member or Gang", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    LEADER_1("13", "Leader or Leadership", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    NONGOVERNMENTAL_ORGANIZATION("14", "Nongovernmental Organization Member or Nongovernmental Organization", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    COERCED_RECRUIT("15", "Coerced/Impressed Recruit", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    WILLING_RECRUIT("16", "Willing Recruit", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    RELIGIOUS("17", "Religious or Religious Organization", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    TARGETED("18", "Targeted Individual or Organization", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    TERRORIST("19", "Terrorist or Terrorist Organization", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    SPEAKER("20", "Speaker", ModifierCategory.Organization, SymbolSetEnum.LAND_CIVILIAN),
    OTHER("23", "Other", ModifierCategory.CompositeLoss, SymbolSetEnum.LAND_CIVILIAN),
    LOOT("24", "Loot", ModifierCategory.Crime, SymbolSetEnum.LAND_CIVILIAN);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    LandCivilianSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
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