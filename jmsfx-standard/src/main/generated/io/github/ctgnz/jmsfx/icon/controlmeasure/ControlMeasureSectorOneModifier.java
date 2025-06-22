package io.github.ctgnz.jmsfx.icon.controlmeasure;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum ControlMeasureSectorOneModifier implements SectorOneModifier {
    UNSPECIFIED_MOD("00", "Unspecified", "General", SymbolSetEnum.CONTROL_MEASURE),
    STANDARD_ON_ROAD_MOBILITY_MOD("01", "Standard Mobility/On-Road Mobility", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    HIGH_OFF_ROAD_MOBILITY_MOD("02", "High Mobility/Off-Road Mobility", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    TRACKED_MOD("03", "Tracked", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    TRACKED_WHEELED_MOD("04", "Tracked and Wheeled Combination (Half-Track)", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    TOWED_MOD("05", "Towed", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    RAILWAY_MOD("06", "Railway", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    OVER_SNOW_PRIME_MOVER_MOD("07", "Over-Snow (Prime Mover)", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    SLED_MOD("08", "Sled", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    PACK_ANIMAL_MOD("09", "Pack Animal", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    BARGE_MOD("10", "Barge", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    AMPHIBIOUS_MOD("11", "Amphibious", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    NO_VEHICLES_MOD("12", "No Vehicles", "Mobility", SymbolSetEnum.CONTROL_MEASURE),
    UNSPECIFIED_MINE_MOD("13", "Unspecified Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_MOD("14", "Antipersonnel Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_MOD("15", "Antipersonnel Mine with Directional Effects", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATM_MOD("16", "Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATMAHD_MOD("17", "Antitank Mine with Antihandling Device", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATMWA_MOD("18", "Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    CLUSTER_MOD("19", "Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_MOD("20", "Antipersonnel Mine and Antipersonnel Mine with Directional Effects", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATM_MOD("21", "Antipersonnel Mine and Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMAHD_MOD("22", "Antipersonnel Mine and Antitank Mine with Antihandling Device", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMWA_MOD("23", "Antipersonnel Mine and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_CLUSTER_MOD("24", "Antipersonnel Mine and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATM_MOD("25", "Antipersonnel Mine with Directional Effects and Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMAHD_MOD("26", "Antipersonnel Mine with Directional Effects and Antitank Mine with Antihandling Device", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMWA_MOD("27", "Antipersonnel Mine with Directional Effects and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_CLUSTER_MOD("28", "Antipersonnel Mine with Directional Effects and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATM_ATMAHD_MOD("29", "Antitank Mine and Antitank Mine with Antihandling Device", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATM_ATMWA_MOD("30", "Antitank Mine and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATM_CLUSTER_MOD("31", "Antitank Mine and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATMAHD_ATMWA_MOD("32", "Antitank Mine with Antihandling Device and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATMAHD_CLUSTER_MOD("33", "Antitank Mine with Antihandling Device and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    ATMWA_CLUSTER_MOD("34", "Wide Area Antitank Mine and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_ATM_MOD("35", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_ATMAHD_MOD("36", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Antitank Mine with Antihandling Device", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_ATMWA_MOD("37", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_CLUSTER_MOD("38", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATM_ATMAHD_MOD("39", "Antipersonnel Mine, Antitank Mine and Antitank Mine with Antihandling Device", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATM_ATMWA_MOD("40", "Antipersonnel Mine, Antitank Mine and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATM_CLUSTER_MOD("41", "Antipersonnel Mine, Antitank Mine and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMAHD_ATMWA_MOD("42", "Antipersonnel Mine, Antitank Mine with Antihandling Device and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMAHD_CLUSTER_MOD("43", "Antipersonnel Mine, Antitank Mine with Antihandling Device and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMWA_CLUSTER_MOD("44", "Antipersonnel Mine, Wide Area Antitank Mine and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATM_ATMAHD_MOD("45", "Antipersonnel Mine with Directional Effects, Antitank Mine and Antitank Mine with Antihandling Device", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATM_ATMWA_MOD("46", "Antipersonnel Mine with Directional Effects, Antitank Mine and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATM_CLUSTER_MOD("47", "Antipersonnel Mine with Directional Effects, Antitank Mine and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMAHD_ATMWA_MOD("48", "Antipersonnel Mine with Directional Effects, Antitank Mine with Antihandling Device and Wide Area Antitank Mine", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMAHD_CLUSTER_MOD("49", "Antipersonnel Mine with Directional Effects, Antitank Mine with Antihandling Device and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMWA_CLUSTER_MOD("50", "Antipersonnel Mine with Directional Effects, Wide Area Antitank Mine and Mine Cluster", "Mine Type", SymbolSetEnum.CONTROL_MEASURE),
    DISMOUNTED_MOD("51", "Dismounted", "Mine Type", SymbolSetEnum.CONTROL_MEASURE);

    private final String id;
    private final String label;
    private final String category;
    private final SymbolSet symbolSet;

    ControlMeasureSectorOneModifier(String id, String label, String category, SymbolSetEnum symbolSet) {
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