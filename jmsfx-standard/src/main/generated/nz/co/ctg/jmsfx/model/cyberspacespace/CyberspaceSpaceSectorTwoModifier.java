package nz.co.ctg.jmsfx.model.cyberspacespace;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum CyberspaceSpaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.CYBERSPACE_SPACE),
    SECURED_MOD("01", "Secured", "General", SymbolSet.CYBERSPACE_SPACE),
    OPEN_MOD("02", "Open", "General", SymbolSet.CYBERSPACE_SPACE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private CyberspaceSpaceSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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