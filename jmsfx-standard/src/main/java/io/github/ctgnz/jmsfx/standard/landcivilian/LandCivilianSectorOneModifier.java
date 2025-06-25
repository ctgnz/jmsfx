package io.github.ctgnz.jmsfx.standard.landcivilian;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandCivilianSectorOneModifier implements SectorOneModifier {
    MURDER_VICTIMS_MOD("03", "Murder Victims", "Crime", SymbolSetEnum.LAND_CIVILIAN),
    DISPLACED_MOD("09", "Displaced Person(s), Refugee(s) and Evacuee(s)", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    FOREIGN_FIGHTER_MOD("10", "Foreign Fighter(s)", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    GANG_MOD("11", "Gang Member or Gang", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    LEADER_1_MOD("13", "Leader or Leadership", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    NONGOVERNMENTAL_ORGANIZATION_MOD("14", "Nongovernmental Organization Member or Nongovernmental Organization", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    COERCED_RECRUIT_MOD("15", "Coerced/Impressed Recruit", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    WILLING_RECRUIT_MOD("16", "Willing Recruit", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    RELIGIOUS_MOD("17", "Religious or Religious Organization", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    TARGETED_MOD("18", "Targeted Individual or Organization", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    TERRORIST_MOD("19", "Terrorist or Terrorist Organization", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    SPEAKER_MOD("20", "Speaker", "Organization", SymbolSetEnum.LAND_CIVILIAN),
    OTHER_MOD("23", "Other", "Composite Loss", SymbolSetEnum.LAND_CIVILIAN),
    LOOT_MOD("24", "Loot", "Crime", SymbolSetEnum.LAND_CIVILIAN);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    LandCivilianSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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