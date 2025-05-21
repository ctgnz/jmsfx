package nz.co.ctg.jmsfx.model.landinstallation;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum LandInstallationSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_LAND_INSTALLATION),
    COAL_MOD("06", "Coal", SymbolSet.SS_LAND_INSTALLATION),
    GEOTHERMAL_MOD("07", "Geothermal", SymbolSet.SS_LAND_INSTALLATION),
    HYDROELECTRIC_MOD("08", "Hydroelectric", SymbolSet.SS_LAND_INSTALLATION),
    NATURAL_GAS_MOD("09", "Natural Gas", SymbolSet.SS_LAND_INSTALLATION),
    CIVILIAN_TELEPHONE_MOD("12", "Civilian Telephone", SymbolSet.SS_LAND_INSTALLATION),
    CIVILIAN_TELEVISION_MOD("13", "Civilian Television", SymbolSet.SS_LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private LandInstallationSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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