package nz.co.ctg.jmsfx.model.cyberspacelandinstallation;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum CyberspaceLandInstallationSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    RESPONSE_ACTIONS("03", "Response Actions", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    SOCIAL("06", "Social", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    WIRED("07", "Wired", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    RADIO_FREQUENCY("08", "Radio Frequency", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION),
    OPERATING_SYSTEM("09", "Operating System", "General", SymbolSet.CYBERSPACE_LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private CyberspaceLandInstallationSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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