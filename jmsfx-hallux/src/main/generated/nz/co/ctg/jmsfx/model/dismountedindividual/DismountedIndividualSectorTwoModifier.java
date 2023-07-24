package nz.co.ctg.jmsfx.model.dismountedindividual;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum DismountedIndividualSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_TWO_MOD("00", "Unspecified", SymbolSet.SS_DISMOUNTED),
    AIRBORNE_MOD("01", "Airborne", SymbolSet.SS_DISMOUNTED),
    BICYCLE_MOD("02", "Bicycle Equipped", SymbolSet.SS_DISMOUNTED),
    DEMOLITION_MOD("03", "Demolition", SymbolSet.SS_DISMOUNTED),
    MOUNTAIN_MOD2("13", "Mountain", SymbolSet.SS_DISMOUNTED),
    SKI_MOD2("39", "Ski", SymbolSet.SS_DISMOUNTED),
    COMMAND_CONTROL_MOD2("41", "Command/Control", SymbolSet.SS_DISMOUNTED),
    DRIVER_MOD2("42", "Driver", SymbolSet.SS_DISMOUNTED),
    GUNNER_MOD2("43", "Gunner", SymbolSet.SS_DISMOUNTED),
    LOADER_MOD2("44", "Loader", SymbolSet.SS_DISMOUNTED),
    PILOT_MOD2("45", "Pilot", SymbolSet.SS_DISMOUNTED),
    NAVIGATOR_MOD2("46", "Navigator", SymbolSet.SS_DISMOUNTED),
    FLIGHT_ENGINEER_MOD2("47", "Flight Engineer", SymbolSet.SS_DISMOUNTED),
    OPERATOR_MOD2("48", "Operator", SymbolSet.SS_DISMOUNTED),
    OBSERVER_MOD2("49", "Observer", SymbolSet.SS_DISMOUNTED),
    SIGNAL_MOD2("50", "Signal", SymbolSet.SS_DISMOUNTED),
    MEDICAL_MOD2("51", "Medical", SymbolSet.SS_DISMOUNTED),
    LOGISTICS_MOD2("52", "Logistics", SymbolSet.SS_DISMOUNTED),
    MAINTENANCE_MOD2("53", "Maintenance", SymbolSet.SS_DISMOUNTED),
    FAO_MOD2("54", "FAO", SymbolSet.SS_DISMOUNTED);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private DismountedIndividualSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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