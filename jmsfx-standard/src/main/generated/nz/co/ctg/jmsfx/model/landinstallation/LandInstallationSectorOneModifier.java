package nz.co.ctg.jmsfx.model.landinstallation;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum LandInstallationSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_LAND_INSTALLATION),
    BIOLOGICAL_1_MOD("01", "Biological", SymbolSet.SS_LAND_INSTALLATION),
    CHEMICAL_1_MOD("02", "Chemical", SymbolSet.SS_LAND_INSTALLATION),
    NUCLEAR_1_MOD("03", "Nuclear", SymbolSet.SS_LAND_INSTALLATION),
    RADIOLOGICAL_1_MOD("04", "Radiological", SymbolSet.SS_LAND_INSTALLATION),
    DECONTAMINATION_MOD("05", "Decontamination", SymbolSet.SS_LAND_INSTALLATION),
    COAL_MOD("06", "Coal", SymbolSet.SS_LAND_INSTALLATION),
    GEOTHERMAL_MOD("07", "Geothermal", SymbolSet.SS_LAND_INSTALLATION),
    HYDROELECTRIC_MOD("08", "Hydroelectric", SymbolSet.SS_LAND_INSTALLATION),
    NATURAL_GAS_MOD("09", "Natural Gas", SymbolSet.SS_LAND_INSTALLATION),
    PETROLEUM_MOD("10", "Petroleum", SymbolSet.SS_LAND_INSTALLATION),
    CIVILIAN_MOD("11", "Civilian", SymbolSet.SS_LAND_INSTALLATION),
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