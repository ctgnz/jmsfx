package nz.co.ctg.jmsfx.model.seasubsurface;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum SeaSubsurfaceSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_SEA_SUBSURFACE),
    AIR_INDEPENDENT_PROPULSION_MOD("01", "Air Independent Propulsion", SymbolSet.SS_SEA_SUBSURFACE),
    DIESEL_ELECTRIC_GENERAL_MOD("02", "Diesel Electric General", SymbolSet.SS_SEA_SUBSURFACE),
    DIESEL___TYPE_1_MOD("03", "Diesel - Type 1", SymbolSet.SS_SEA_SUBSURFACE),
    DIESEL___TYPE_2_MOD("04", "Diesel - Type 2", SymbolSet.SS_SEA_SUBSURFACE),
    DIESEL___TYPE_3_MOD("05", "Diesel - Type 3", SymbolSet.SS_SEA_SUBSURFACE),
    NUCLEAR_POWERED_GENERAL_MOD("06", "Nuclear Powered General", SymbolSet.SS_SEA_SUBSURFACE),
    NUCLEAR___TYPE_1_MOD("07", "Nuclear - Type 1", SymbolSet.SS_SEA_SUBSURFACE),
    NUCLEAR___TYPE_2_MOD("08", "Nuclear - Type 2", SymbolSet.SS_SEA_SUBSURFACE),
    NUCLEAR___TYPE_3_MOD("09", "Nuclear - Type 3", SymbolSet.SS_SEA_SUBSURFACE),
    NUCLEAR___TYPE_4_MOD("10", "Nuclear - Type 4", SymbolSet.SS_SEA_SUBSURFACE),
    NUCLEAR___TYPE_5_MOD("11", "Nuclear - Type 5", SymbolSet.SS_SEA_SUBSURFACE),
    NUCLEAR___TYPE_6_MOD("12", "Nuclear - Type 6", SymbolSet.SS_SEA_SUBSURFACE),
    NUCLEAR___TYPE_7_MOD("13", "Nuclear - Type 7", SymbolSet.SS_SEA_SUBSURFACE),
    AUTONOMOUS_CONTROL_MOD("14", "Autonomous Control", SymbolSet.SS_SEA_SUBSURFACE),
    REMOTELY_PILOTED_MOD("15", "Remotely Piloted", SymbolSet.SS_SEA_SUBSURFACE),
    EXPENDABLE_MOD("16", "Expendable", SymbolSet.SS_SEA_SUBSURFACE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private SeaSubsurfaceSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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