package nz.co.ctg.jmsfx.model.landequipment;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum LandEquipmentSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_LAND_EQUIPMENT),
    EARLY_WARNING_RADAR_MOD("03", "Early Warning Radar", SymbolSet.SS_LAND_EQUIPMENT),
    INTRUSION_MOD("04", "Intrusion", SymbolSet.SS_LAND_EQUIPMENT),
    UPGRADED_EARLY_WARNING_RADAR_MOD("07", "Upgraded Early Warning Radar", SymbolSet.SS_LAND_EQUIPMENT),
    MULTI_PURPOSE_BLADE_MOD("12", "Multi Purpose Blade", SymbolSet.SS_LAND_EQUIPMENT),
    TANK_WIDTH_MINE_PLOW_MOD("13", "Tank Width Mine Plow", SymbolSet.SS_LAND_EQUIPMENT);

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