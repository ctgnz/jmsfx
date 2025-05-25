package nz.co.ctg.jmsfx.model.cyberspacelandunit;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum CyberspaceLandUnitSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    RESPONSE_ACTIONS("03", "Response Actions", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    SOCIAL("06", "Social", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    WIRED("07", "Wired", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    RADIO_FREQUENCY("08", "Radio Frequency", "General", SymbolSet.CYBERSPACE_LAND_UNIT),
    OPERATING_SYSTEM("09", "Operating System", "General", SymbolSet.CYBERSPACE_LAND_UNIT);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;
    
    private CyberspaceLandUnitSectorOneModifier(String id, String label, String category, SymbolSet symbolSet) {
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