package nz.co.ctg.jmsfx.model.controlmeasure;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorOneModifier;

public enum ControlMeasureSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", SymbolSet.SS_CONTROL_MEASURE),
    STANDARD_ON_ROAD_MOBILITY_MOD("01", "Standard Mobility/On-Road Mobility", SymbolSet.SS_CONTROL_MEASURE),
    HIGH_OFF_ROAD_MOBILITY_MOD("02", "High Mobility/Off-Road Mobility", SymbolSet.SS_CONTROL_MEASURE),
    TRACKED_MOD("03", "Tracked", SymbolSet.SS_CONTROL_MEASURE),
    TRACKED_WHEELED_MOD("04", "Tracked and Wheeled Combination (Half-Track)", SymbolSet.SS_CONTROL_MEASURE),
    TOWED_MOD("05", "Towed", SymbolSet.SS_CONTROL_MEASURE),
    RAILWAY_MOD("06", "Railway", SymbolSet.SS_CONTROL_MEASURE),
    OVER_SNOW_PRIME_MOVER_MOD("07", "Over-Snow (Prime Mover)", SymbolSet.SS_CONTROL_MEASURE),
    SLED_MOD("08", "Sled", SymbolSet.SS_CONTROL_MEASURE),
    PACK_ANIMAL_MOD("09", "Pack Animal", SymbolSet.SS_CONTROL_MEASURE),
    BARGE_MOD("10", "Barge", SymbolSet.SS_CONTROL_MEASURE),
    AMPHIBIOUS_MOD("11", "Amphibious", SymbolSet.SS_CONTROL_MEASURE),
    NO_VEHICLES_MOD("12", "No Vehicles", SymbolSet.SS_CONTROL_MEASURE),
    UNSPECIFIED_MINE_MOD("13", "Unspecified Mine", SymbolSet.SS_CONTROL_MEASURE),
    APM_MOD("14", "Antipersonnel Mine", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_MOD("15", "Antipersonnel Mine with Directional Effects", SymbolSet.SS_CONTROL_MEASURE),
    ATM_MOD("16", "Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    ATMAHD_MOD("17", "Antitank Mine with Antihandling Device", SymbolSet.SS_CONTROL_MEASURE),
    ATMWA_MOD("18", "Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    CLUSTER_MOD("19", "Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APM_APMDFX_MOD("20", "Antipersonnel Mine and Antipersonnel Mine with Directional Effects", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATM_MOD("21", "Antipersonnel Mine and Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATMAHD_MOD("22", "Antipersonnel Mine and Antitank Mine with Antihandling Device", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATMWA_MOD("23", "Antipersonnel Mine and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APM_CLUSTER_MOD("24", "Antipersonnel Mine and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATM_MOD("25", "Antipersonnel Mine with Directional Effects and Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATMAHD_MOD("26", "Antipersonnel Mine with Directional Effects and Antitank Mine with Antihandling Device", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATMWA_MOD("27", "Antipersonnel Mine with Directional Effects and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_CLUSTER_MOD("28", "Antipersonnel Mine with Directional Effects and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    ATM_ATMAHD_MOD("29", "Antitank Mine and Antitank Mine with Antihandling Device", SymbolSet.SS_CONTROL_MEASURE),
    ATM_ATMWA_MOD("30", "Antitank Mine and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    ATM_CLUSTER_MOD("31", "Antitank Mine and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    ATMAHD_ATMWA_MOD("32", "Antitank Mine with Antihandling Device and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    ATMAHD_CLUSTER_MOD("33", "Antitank Mine with Antihandling Device and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    ATMWA_CLUSTER_MOD("34", "Wide Area Antitank Mine and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APM_APMDFX_ATM_MOD("35", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APM_APMDFX_ATMAHD_MOD("36", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Antitank Mine with Antihandling Device", SymbolSet.SS_CONTROL_MEASURE),
    APM_APMDFX_ATMWA_MOD("37", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APM_APMDFX_CLUSTER_MOD("38", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATM_ATMAHD_MOD("39", "Antipersonnel Mine, Antitank Mine and Antitank Mine with Antihandling Device", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATM_ATMWA_MOD("40", "Antipersonnel Mine, Antitank Mine and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATM_CLUSTER_MOD("41", "Antipersonnel Mine, Antitank Mine and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATMAHD_ATMWA_MOD("42", "Antipersonnel Mine, Antitank Mine with Antihandling Device and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATMAHD_CLUSTER_MOD("43", "Antipersonnel Mine, Antitank Mine with Antihandling Device and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APM_ATMWA_CLUSTER_MOD("44", "Antipersonnel Mine, Wide Area Antitank Mine and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATM_ATMAHD_MOD("45", "Antipersonnel Mine with Directional Effects, Antitank Mine and Antitank Mine with Antihandling Device", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATM_ATMWA_MOD("46", "Antipersonnel Mine with Directional Effects, Antitank Mine and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATM_CLUSTER_MOD("47", "Antipersonnel Mine with Directional Effects, Antitank Mine and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATMAHD_ATMWA_MOD("48", "Antipersonnel Mine with Directional Effects, Antitank Mine with Antihandling Device and Wide Area Antitank Mine", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATMAHD_CLUSTER_MOD("49", "Antipersonnel Mine with Directional Effects, Antitank Mine with Antihandling Device and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    APMDFX_ATMWA_CLUSTER_MOD("50", "Antipersonnel Mine with Directional Effects, Wide Area Antitank Mine and Mine Cluster", SymbolSet.SS_CONTROL_MEASURE),
    DISMOUNTED_MOD("51", "Dismounted", SymbolSet.SS_CONTROL_MEASURE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private ControlMeasureSectorOneModifier(String id, String label, SymbolSet symbolSet) {
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