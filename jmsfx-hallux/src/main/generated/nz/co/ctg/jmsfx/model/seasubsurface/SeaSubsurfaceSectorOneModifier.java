package nz.co.ctg.jmsfx.model.seasubsurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum SeaSubsurfaceSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_SEA_SUBSURFACE),
    ANTISUBMARINE_WARFARE_MOD("01", "Antisubmarine Warfare", SymbolSet.SS_SEA_SUBSURFACE),
    AUXILIARY_MOD("02", "Auxiliary", SymbolSet.SS_SEA_SUBSURFACE),
    COMMAND_AND_CONTROL_MOD("03", "Command and Control", SymbolSet.SS_SEA_SUBSURFACE),
    INTELLIGENCE_SURVEILLANCE_RECONNAISSANCE_MOD("04", "Intelligence Surveillance Reconnaissance", SymbolSet.SS_SEA_SUBSURFACE),
    MINE_COUNTERMEASURES_MOD("05", "Mine Countermeasures", SymbolSet.SS_SEA_SUBSURFACE),
    MINE_WARFARE_MOD("06", "Mine Warfare", SymbolSet.SS_SEA_SUBSURFACE),
    SURFACE_WARFARE_MOD("07", "Surface Warfare", SymbolSet.SS_SEA_SUBSURFACE),
    ATTACK_MOD("08", "Attack", SymbolSet.SS_SEA_SUBSURFACE),
    BALLISTIC_MISSILE_MOD("09", "Ballistic Missile", SymbolSet.SS_SEA_SUBSURFACE),
    GUIDED_MISSILE_MOD("10", "Guided Missile", SymbolSet.SS_SEA_SUBSURFACE),
    OTHER_GUIDED_MISSILE_MOD("11", "Other Guided Missile", SymbolSet.SS_SEA_SUBSURFACE),
    SPECIAL_OPERATIONS_FORCES_SOF_MOD("12", "Special Operations Forces (SOF)", SymbolSet.SS_SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_LOW_1_MOD("13", "Possible Submarine Low 1", SymbolSet.SS_SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_LOW_2_MOD("14", "Possible Submarine Low 2", SymbolSet.SS_SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_HIGH_3_MOD("15", "Possible Submarine High 3", SymbolSet.SS_SEA_SUBSURFACE),
    POSSIBLE_SUBMARINE_HIGH_4_MOD("16", "Possible Submarine High 4", SymbolSet.SS_SEA_SUBSURFACE),
    PROBABLE_SUBMARINE_MOD("17", "Probable Submarine", SymbolSet.SS_SEA_SUBSURFACE),
    CERTAIN_SUBMARINE_MOD("18", "Certain Submarine", SymbolSet.SS_SEA_SUBSURFACE),
    ANTI_TORPEDO_TORPEDO_MOD("19", "Anti-torpedo Torpedo", SymbolSet.SS_SEA_SUBSURFACE),
    HIJACKING_HIGHJACKED_MOD("20", "Hijacking/Highjacked", SymbolSet.SS_SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SeaSubsurfaceSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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