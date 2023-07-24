package nz.co.ctg.jmsfx.model.landequipment;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum LandEquipmentSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_LAND_EQUIPMENT),
    BIOLOGICAL_MOD("01", "Biological", SymbolSet.SS_LAND_EQUIPMENT),
    CHEMICAL_MOD("02", "Chemical", SymbolSet.SS_LAND_EQUIPMENT),
    EARLY_WARNING_RADAR_MOD("03", "Early Warning Radar", SymbolSet.SS_LAND_EQUIPMENT),
    INTRUSION_MOD("04", "Intrusion", SymbolSet.SS_LAND_EQUIPMENT),
    NUCLEAR_MOD("05", "Nuclear", SymbolSet.SS_LAND_EQUIPMENT),
    RADIOLOGICAL_MOD("06", "Radiological", SymbolSet.SS_LAND_EQUIPMENT),
    UPGRADED_EARLY_WARNING_RADAR_MOD("07", "Upgraded Early Warning Radar", SymbolSet.SS_LAND_EQUIPMENT),
    HIJACKING_MOD("08", "Hijacking", SymbolSet.SS_LAND_EQUIPMENT),
    CIVILIAN_MOD("09", "Civilian", SymbolSet.SS_LAND_EQUIPMENT);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private LandEquipmentSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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