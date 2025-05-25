package nz.co.ctg.jmsfx.model.space;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SpaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SPACE),
    LEO_MOD("01", "Low Earth Orbit (LEO)", "Orbit", SymbolSet.SPACE),
    MEO_MOD("02", "Medium Earth Orbit (MEO)", "Orbit", SymbolSet.SPACE),
    HEO_MOD("03", "High Earth Orbit (HEO)", "Orbit", SymbolSet.SPACE),
    GSO_MOD("04", "Geosynchronous Orbit (GSO)", "Orbit", SymbolSet.SPACE),
    GEO_MOD("05", "Geostationary Orbit (GEO)", "Orbit", SymbolSet.SPACE),
    MO_MOD("06", "Molniya Orbit (MO)", "Orbit", SymbolSet.SPACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private SpaceSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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