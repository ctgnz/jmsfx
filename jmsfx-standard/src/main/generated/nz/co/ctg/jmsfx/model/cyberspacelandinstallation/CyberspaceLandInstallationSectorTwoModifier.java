package nz.co.ctg.jmsfx.model.cyberspacelandinstallation;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum CyberspaceLandInstallationSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    SECURED_MOD("01", "Secured", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    OPEN_MOD("02", "Open", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private CyberspaceLandInstallationSectorTwoModifier(String id, String label, String category, SymbolSet symbolSet) {
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