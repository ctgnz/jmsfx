package nz.co.ctg.jmsfx.model.space;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SpaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SPACE),
    LEO_MOD("01", "Low Earth Orbit (LEO)", SymbolSet.SS_SPACE),
    MEO_MOD("02", "Medium Earth Orbit (MEO)", SymbolSet.SS_SPACE),
    HEO_MOD("03", "High Earth Orbit (HEO)", SymbolSet.SS_SPACE),
    GSO_MOD("04", "Geosynchronous Orbit (GSO)", SymbolSet.SS_SPACE),
    GO_MOD("05", "Geostationary Orbit (GO)", SymbolSet.SS_SPACE),
    MO_MOD("06", "Molniya Orbit (MO)", SymbolSet.SS_SPACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SpaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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