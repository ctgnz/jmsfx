package io.github.ctgnz.jmsfx.standard.controlmeasure;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.ModifierCategory;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum ControlMeasureSectorOneModifier implements SectorOneModifier {
    STANDARD_ON_ROAD_MOBILITY("01", "Standard Mobility/On-Road Mobility", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    HIGH_OFF_ROAD_MOBILITY("02", "High Mobility/Off-Road Mobility", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    TRACKED("03", "Tracked", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    TRACKED_WHEELED("04", "Tracked and Wheeled Combination (Half-Track)", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    TOWED("05", "Towed", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    RAILWAY("06", "Railway", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    OVER_SNOW_PRIME_MOVER("07", "Over-Snow (Prime Mover)", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    SLED("08", "Sled", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    PACK_ANIMAL("09", "Pack Animal", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    BARGE("10", "Barge", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    AMPHIBIOUS("11", "Amphibious", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    NO_VEHICLES("12", "No Vehicles", ModifierCategory.Mobility, SymbolSetEnum.CONTROL_MEASURE),
    UNSPECIFIED_MINE("13", "Unspecified Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM("14", "Antipersonnel Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX("15", "Antipersonnel Mine with Directional Effects", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATM("16", "Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATMAHD("17", "Antitank Mine with Antihandling Device", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATMWA("18", "Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    CLUSTER("19", "Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX("20", "Antipersonnel Mine and Antipersonnel Mine with Directional Effects", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATM("21", "Antipersonnel Mine and Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMAHD("22", "Antipersonnel Mine and Antitank Mine with Antihandling Device", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMWA("23", "Antipersonnel Mine and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_CLUSTER("24", "Antipersonnel Mine and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATM("25", "Antipersonnel Mine with Directional Effects and Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMAHD("26", "Antipersonnel Mine with Directional Effects and Antitank Mine with Antihandling Device", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMWA("27", "Antipersonnel Mine with Directional Effects and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_CLUSTER("28", "Antipersonnel Mine with Directional Effects and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATM_ATMAHD("29", "Antitank Mine and Antitank Mine with Antihandling Device", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATM_ATMWA("30", "Antitank Mine and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATM_CLUSTER("31", "Antitank Mine and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATMAHD_ATMWA("32", "Antitank Mine with Antihandling Device and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATMAHD_CLUSTER("33", "Antitank Mine with Antihandling Device and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    ATMWA_CLUSTER("34", "Wide Area Antitank Mine and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_ATM("35", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_ATMAHD("36", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Antitank Mine with Antihandling Device", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_ATMWA("37", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_APMDFX_CLUSTER("38", "Antipersonnel Mine, Antipersonnel Mine with Directional Effects and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATM_ATMAHD("39", "Antipersonnel Mine, Antitank Mine and Antitank Mine with Antihandling Device", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATM_ATMWA("40", "Antipersonnel Mine, Antitank Mine and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATM_CLUSTER("41", "Antipersonnel Mine, Antitank Mine and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMAHD_ATMWA("42", "Antipersonnel Mine, Antitank Mine with Antihandling Device and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMAHD_CLUSTER("43", "Antipersonnel Mine, Antitank Mine with Antihandling Device and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APM_ATMWA_CLUSTER("44", "Antipersonnel Mine, Wide Area Antitank Mine and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATM_ATMAHD("45", "Antipersonnel Mine with Directional Effects, Antitank Mine and Antitank Mine with Antihandling Device", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATM_ATMWA("46", "Antipersonnel Mine with Directional Effects, Antitank Mine and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATM_CLUSTER("47", "Antipersonnel Mine with Directional Effects, Antitank Mine and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMAHD_ATMWA("48", "Antipersonnel Mine with Directional Effects, Antitank Mine with Antihandling Device and Wide Area Antitank Mine", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMAHD_CLUSTER("49", "Antipersonnel Mine with Directional Effects, Antitank Mine with Antihandling Device and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    APMDFX_ATMWA_CLUSTER("50", "Antipersonnel Mine with Directional Effects, Wide Area Antitank Mine and Mine Cluster", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE),
    DISMOUNTED("51", "Dismounted", ModifierCategory.MineType, SymbolSetEnum.CONTROL_MEASURE);

    private final String id;
    private final String label;
    private final ModifierCategory category;
    private final SymbolSet symbolSet;

    ControlMeasureSectorOneModifier(String id, String label, ModifierCategory category, SymbolSetEnum symbolSet) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.symbolSet = symbolSet;
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
        return symbolSet;
    }

}