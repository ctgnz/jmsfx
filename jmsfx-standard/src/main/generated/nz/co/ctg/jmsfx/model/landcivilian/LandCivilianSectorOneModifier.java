package nz.co.ctg.jmsfx.model.landcivilian;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum LandCivilianSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_LAND_CIVILIAN),
    MURDER_VICTIMS_MOD("03", "Murder Victims", SymbolSet.SS_LAND_CIVILIAN),
    DISPLACED_MOD("09", "Displaced Person(s), Refugee(s) and Evacuee(s)", SymbolSet.SS_LAND_CIVILIAN),
    FOREIGN_FIGHTER_MOD("10", "Foreign Fighter(s)", SymbolSet.SS_LAND_CIVILIAN),
    GANG_MOD("11", "Gang Member or Gang", SymbolSet.SS_LAND_CIVILIAN),
    LEADER_1_MOD("13", "Leader or Leadership", SymbolSet.SS_LAND_CIVILIAN),
    NONGOVERNMENTAL_ORGANIZATION_MOD("14", "Nongovernmental Organization Member or Nongovernmental Organization", SymbolSet.SS_LAND_CIVILIAN),
    COERCED_RECRUIT_MOD("15", "Coerced/Impressed Recruit", SymbolSet.SS_LAND_CIVILIAN),
    WILLING_RECRUIT_MOD("16", "Willing Recruit", SymbolSet.SS_LAND_CIVILIAN),
    RELIGIOUS_MOD("17", "Religious or Religious Organization", SymbolSet.SS_LAND_CIVILIAN),
    TARGETED_MOD("18", "Targeted Individual or Organization", SymbolSet.SS_LAND_CIVILIAN),
    TERRORIST_MOD("19", "Terrorist or Terrorist Organization", SymbolSet.SS_LAND_CIVILIAN),
    SPEAKER_MOD("20", "Speaker", SymbolSet.SS_LAND_CIVILIAN),
    OTHER_MOD("23", "Other", SymbolSet.SS_LAND_CIVILIAN),
    LOOT_MOD("24", "Loot", SymbolSet.SS_LAND_CIVILIAN);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private LandCivilianSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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