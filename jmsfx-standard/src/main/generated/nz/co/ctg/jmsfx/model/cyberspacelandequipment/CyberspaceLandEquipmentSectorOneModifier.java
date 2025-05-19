package nz.co.ctg.jmsfx.model.cyberspacelandequipment;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum CyberspaceLandEquipmentSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    RESPONSE_ACTIONS("03", "Response Actions", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    SOCIAL("06", "Social", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    WIRED("07", "Wired", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    RADIO_FREQUENCY("08", "Radio Frequency", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT),
    OPERATING_SYSTEM("09", "Operating System", SymbolSet.SS_CYBERSPACE_LAND_EQUIPMENT);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private CyberspaceLandEquipmentSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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