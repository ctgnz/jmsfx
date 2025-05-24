package nz.co.ctg.jmsfx.model.landinstallation;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum LandInstallationSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SS_LAND_INSTALLATION),
    COAL_MOD("06", "Coal", "Electric Power Type", SymbolSet.SS_LAND_INSTALLATION),
    GEOTHERMAL_MOD("07", "Geothermal", "Electric Power Type", SymbolSet.SS_LAND_INSTALLATION),
    HYDROELECTRIC_MOD("08", "Hydroelectric", "Electric Power Type", SymbolSet.SS_LAND_INSTALLATION),
    NATURAL_GAS_MOD("09", "Natural Gas", "Electric Power Type", SymbolSet.SS_LAND_INSTALLATION),
    CIVILIAN_TELEPHONE_MOD("12", "Civilian Telephone", "Civilian Telecommunications Type", SymbolSet.SS_LAND_INSTALLATION),
    CIVILIAN_TELEVISION_MOD("13", "Civilian Television", "Civilian Telecommunications Type", SymbolSet.SS_LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private LandInstallationSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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