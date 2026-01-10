package io.github.ctgnz.jmsfx.standard.controlmeasure;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum ControlMeasureSectorOneModifier implements SectorOneModifier {
    STANDARD_ON_ROAD_MOBILITY("01", "Standard Mobility/On-Road Mobility", ModifierCategory.Mobility),
    HIGH_OFF_ROAD_MOBILITY("02", "High Mobility/Off-Road Mobility", ModifierCategory.Mobility),
    TRACKED("03", "Tracked", ModifierCategory.Mobility),
    TRACKED_WHEELED("04", "Tracked and Wheeled Combination (Half-Track)", ModifierCategory.Mobility),
    TOWED("05", "Towed", ModifierCategory.Mobility),
    RAILWAY("06", "Railway", ModifierCategory.Mobility),
    OVER_SNOW_PRIME_MOVER("07", "Over-Snow (Prime Mover)", ModifierCategory.Mobility),
    SLED("08", "Sled", ModifierCategory.Mobility),
    PACK_ANIMAL("09", "Pack Animal", ModifierCategory.Mobility),
    BARGE("10", "Barge", ModifierCategory.Mobility),
    AMPHIBIOUS("11", "Amphibious", ModifierCategory.Mobility),
    NO_VEHICLES("12", "No Vehicles", ModifierCategory.Mobility),
    UNSPECIFIED_MINE("13", "Unspecified Mine", ModifierCategory.MineType),
    APM("14", "Antipersonnel Mine", ModifierCategory.MineType),
    APMDFX("15", "Antipersonnel Mine with Directional Effects", ModifierCategory.MineType),
    ATM("16", "Antitank Mine", ModifierCategory.MineType),
    ATMAHD("17", "Antitank Mine with Antihandling Device", ModifierCategory.MineType),
    ATMWA("18", "Wide Area Antitank Mine", ModifierCategory.MineType),
    CLUSTER("19", "Mine Cluster", ModifierCategory.MineType),
    APM_APMDFX("20", "Antipersonnel Mine and Antipersonnel Mine with Directional Effects", ModifierCategory.MineType),
    APM_ATM("21", "Antipersonnel Mine and Antitank Mine", ModifierCategory.MineType),
    APM_ATMAHD("22", "Antipersonnel Mine and Antitank Mine with Antihandling Device", ModifierCategory.MineType),
    APM_ATMWA("23", "Antipersonnel Mine and Wide Area Antitank Mine", ModifierCategory.MineType),
    APM_CLUSTER("24", "Antipersonnel Mine and Mine Cluster", ModifierCategory.MineType),
    APMDFX_ATM("25", "Antipersonnel Mine with Directional Effects and Antitank Mine", ModifierCategory.MineType),
    APMDFX_ATMAHD("26", "Antipersonnel Mine with Directional Effects and Antitank Mine with Antihandling Device", ModifierCategory.MineType),
    APMDFX_ATMWA("27", "Antipersonnel Mine with Directional Effects and Wide Area Antitank Mine", ModifierCategory.MineType),
    APMDFX_CLUSTER("28", "Antipersonnel Mine with Directional Effects and Mine Cluster", ModifierCategory.MineType),
    ATM_ATMAHD("29", "Antitank Mine and Antitank Mine with Antihandling Device", ModifierCategory.MineType),
    ATM_ATMWA("30", "Antitank Mine and Wide Area Antitank Mine", ModifierCategory.MineType),
    ATM_CLUSTER("31", "Antitank Mine and Mine Cluster", ModifierCategory.MineType),
    ATMAHD_ATMWA("32", "Antitank Mine with Antihandling Device and Wide Area Antitank Mine", ModifierCategory.MineType),
    ATMAHD_CLUSTER("33", "Antitank Mine with Antihandling Device and Mine Cluster", ModifierCategory.MineType),
    ATMWA_CLUSTER("34", "Wide Area Antitank Mine and Mine Cluster", ModifierCategory.MineType),
    APM_APMDFX_ATM("35", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Antitank Mine", ModifierCategory.MineType),
    APM_APMDFX_ATMAHD("36", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Antitank Mine with Antihandling Device", ModifierCategory.MineType),
    APM_APMDFX_ATMWA("37", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Wide Area Antitank Mine", ModifierCategory.MineType),
    APM_APMDFX_CLUSTER("38", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Mine Cluster", ModifierCategory.MineType),
    APM_ATM_ATMAHD("39", "Antipersonnel Mine, Antitank Mine and Antitank Mine with Antihandling Device", ModifierCategory.MineType),
    APM_ATM_ATMWA("40", "Antipersonnel Mine, Antitank Mine and Wide Area Antitank Mine", ModifierCategory.MineType),
    APM_ATM_CLUSTER("41", "Antipersonnel Mine, Antitank Mine and Mine Cluster", ModifierCategory.MineType),
    APM_ATMAHD_ATMWA("42", "Antipersonnel Mine, Antitank Mine with Antihandling Device and Wide Area Antitank Mine", ModifierCategory.MineType),
    APM_ATMAHD_CLUSTER("43", "Antipersonnel Mine, Antitank Mine with Antihandling Device and Mine Cluster", ModifierCategory.MineType),
    APM_ATMWA_CLUSTER("44", "Antipersonnel Mine, Wide Area Antitank Mine and Mine Cluster", ModifierCategory.MineType),
    APMDFX_ATM_ATMAHD("45", "Antipersonnel Mine with Directional Effects, Antitank Mine and Antitank Mine with Antihandling Device", ModifierCategory.MineType),
    APMDFX_ATM_ATMWA("46", "Antipersonnel Mine with Directional Effects, Antitank Mine and Wide Area Antitank Mine", ModifierCategory.MineType),
    APMDFX_ATM_CLUSTER("47", "Antipersonnel Mine with Directional Effects, Antitank Mine and Mine Cluster", ModifierCategory.MineType),
    APMDFX_ATMAHD_ATMWA("48", "Antipersonnel Mine with Directional Effects, Antitank Mine with Antihandling Device and Wide Area Antitank Mine", ModifierCategory.MineType),
    APMDFX_ATMAHD_CLUSTER("49", "Antipersonnel Mine with Directional Effects, Antitank Mine with Antihandling Device and Mine Cluster", ModifierCategory.MineType),
    APMDFX_ATMWA_CLUSTER("50", "Antipersonnel Mine with Directional Effects, Wide Area Antitank Mine and Mine Cluster", ModifierCategory.MineType),
    DISMOUNTED("51", "Dismounted", ModifierCategory.MineType);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    ControlMeasureSectorOneModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
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
        return SymbolSetEnum.CONTROL_MEASURE;
    }

}