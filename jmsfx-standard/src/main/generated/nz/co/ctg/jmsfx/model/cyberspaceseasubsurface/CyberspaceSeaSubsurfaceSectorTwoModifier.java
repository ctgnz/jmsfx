package nz.co.ctg.jmsfx.model.cyberspaceseasubsurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum CyberspaceSeaSubsurfaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    SECURED_MOD("01", "Secured", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE),
    OPEN_MOD("02", "Open", "General", SymbolSet.SS_CYBERSPACE_SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private CyberspaceSeaSubsurfaceSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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