package nz.co.ctg.jmsfx.model.seasurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SeaSurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SEA_SURFACE),
    OWN_MOD("01", "Own Ship", SymbolSet.SS_SEA_SURFACE),
    AA_MOD("02", "Antiair Warfare", SymbolSet.SS_SEA_SURFACE),
    ASW_MOD("03", "Antisubmarine Warfare", SymbolSet.SS_SEA_SURFACE),
    ESCORT_MOD("04", "Escort", SymbolSet.SS_SEA_SURFACE),
    EW_MOD("05", "Electronic Warfare", SymbolSet.SS_SEA_SURFACE),
    ISR_MOD("06", "Intelligence, Surveillance, Reconnaissance", SymbolSet.SS_SEA_SURFACE),
    MCM_MOD("07", "Mine Countermeasures", SymbolSet.SS_SEA_SURFACE),
    MD_MOD("08", "Missile Defense", SymbolSet.SS_SEA_SURFACE),
    MED_MOD("09", "Medical", SymbolSet.SS_SEA_SURFACE),
    MIW_MOD("10", "Mine Warfare", SymbolSet.SS_SEA_SURFACE),
    RMV_MOD("11", "Remote Multi-Mission Vehicle (USV-only)", SymbolSet.SS_SEA_SURFACE),
    SOF_MOD("12", "Special Operations Forces (SOF)", SymbolSet.SS_SEA_SURFACE),
    SUW_MOD("13", "Surface Warfare", SymbolSet.SS_SEA_SURFACE),
    BALLISTIC_MOD("14", "Ballistic Missile", SymbolSet.SS_SEA_SURFACE),
    GUIDED_MOD("15", "Guided Missile", SymbolSet.SS_SEA_SURFACE),
    OTHER_GUIDED_MOD("16", "Other Guided Missile", SymbolSet.SS_SEA_SURFACE),
    TORPEDO_MOD("17", "Torpedo", SymbolSet.SS_SEA_SURFACE),
    DRONE_EQUIP_MOD("18", "Drone-Equipped", SymbolSet.SS_SEA_SURFACE),
    HELO_EQUIP_MOD("19", "Helicopter-Equipped/VSTOL", SymbolSet.SS_SEA_SURFACE),
    BALLISTIC_DEFENSE_MOD("20", "Ballistic Missile Defense, Shooter", SymbolSet.SS_SEA_SURFACE),
    LRST_MOD("21", "Ballistic Missile Defense, Long-Range Surveillance and Track (LRST)", SymbolSet.SS_SEA_SURFACE),
    SEA_BASED_X_MOD("22", "Sea-Base X-Band", SymbolSet.SS_SEA_SURFACE),
    HIJACK_MOD("23", "Hijacking/Hijacked", SymbolSet.SS_SEA_SURFACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SeaSurfaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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