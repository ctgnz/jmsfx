package io.github.ctgnz.jmsfx.hallux;

import java.util.List;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.Dimension;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.SymbolSetInfo;
import io.github.ctgnz.jmsfx.hallux.activity.ActivitySymbolSet;
import io.github.ctgnz.jmsfx.hallux.air.AirSymbolSet;
import io.github.ctgnz.jmsfx.hallux.airmissile.AirMissileSymbolSet;
import io.github.ctgnz.jmsfx.hallux.common.CommonSymbolSet;
import io.github.ctgnz.jmsfx.hallux.controlmeasure.ControlMeasureSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspace.CyberspaceSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspaceair.CyberspaceAirSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspacedismountedindividual.CyberspaceDismountedIndividualSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspacelandequipment.CyberspaceLandEquipmentSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspacelandinstallation.CyberspaceLandInstallationSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspacelandunit.CyberspaceLandUnitSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspaceseasubsurface.CyberspaceSeaSubsurfaceSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspaceseasurface.CyberspaceSeaSurfaceSymbolSet;
import io.github.ctgnz.jmsfx.hallux.cyberspacespace.CyberspaceSpaceSymbolSet;
import io.github.ctgnz.jmsfx.hallux.dismountedindividual.DismountedIndividualSymbolSet;
import io.github.ctgnz.jmsfx.hallux.landcivilian.LandCivilianSymbolSet;
import io.github.ctgnz.jmsfx.hallux.landequipment.LandEquipmentSymbolSet;
import io.github.ctgnz.jmsfx.hallux.landinstallation.LandInstallationSymbolSet;
import io.github.ctgnz.jmsfx.hallux.landunits.LandUnitsSymbolSet;
import io.github.ctgnz.jmsfx.hallux.minewarfare.MineWarfareSymbolSet;
import io.github.ctgnz.jmsfx.hallux.seasubsurface.SeaSubsurfaceSymbolSet;
import io.github.ctgnz.jmsfx.hallux.seasurface.SeaSurfaceSymbolSet;
import io.github.ctgnz.jmsfx.hallux.space.SpaceSymbolSet;

public enum SymbolSetEnum implements SymbolSet {
        COMMON("00", "Common", DimensionEnum.COMMON, CommonSymbolSet.INSTANCE),
        AIR("01", "Air", DimensionEnum.AIR, AirSymbolSet.INSTANCE),
        AIR_MISSILE("02", "Air Missile", DimensionEnum.AIR, AirMissileSymbolSet.INSTANCE),
        SPACE("05", "Space", DimensionEnum.SPACE, SpaceSymbolSet.INSTANCE),
        LAND_UNIT("10", "Land Units", DimensionEnum.LAND_UNIT, LandUnitsSymbolSet.INSTANCE),
        LAND_CIVILIAN("11", "Land Civilian", DimensionEnum.LAND_UNIT, LandCivilianSymbolSet.INSTANCE),
        LAND_EQUIPMENT("15", "Land Equipment", DimensionEnum.LAND_EQUIPMENT, LandEquipmentSymbolSet.INSTANCE),
        LAND_INSTALLATION("20", "Land Installation", DimensionEnum.LAND_INSTALLATION, LandInstallationSymbolSet.INSTANCE),
        CONTROL_MEASURE("25", "Control Measure", DimensionEnum.CONTROL_MEASURE, ControlMeasureSymbolSet.INSTANCE),
        DISMOUNTED("27", "Dismounted Individual", DimensionEnum.DISMOUNTED, DismountedIndividualSymbolSet.INSTANCE),
        SEA_SURFACE("30", "Sea Surface", DimensionEnum.SEA_SURFACE, SeaSurfaceSymbolSet.INSTANCE),
        SEA_SUBSURFACE("35", "Sea Subsurface", DimensionEnum.SEA_SUBSURFACE, SeaSubsurfaceSymbolSet.INSTANCE),
        MINE_WARFARE("36", "Mine Warfare", DimensionEnum.SEA_SUBSURFACE, MineWarfareSymbolSet.INSTANCE),
        ACTIVITY("40", "Activity", DimensionEnum.ACTIVITY, ActivitySymbolSet.INSTANCE),
        CYBERSPACE("60", "Cyberspace", DimensionEnum.CYBERSPACE, "Cyberspace", CyberspaceSymbolSet.INSTANCE),
        CYBERSPACE_SPACE("61", "Cyberspace Space", DimensionEnum.SPACE, "Cyberspace", CyberspaceSpaceSymbolSet.INSTANCE),
        CYBERSPACE_AIR("62", "Cyberspace Air", DimensionEnum.AIR, "Cyberspace", CyberspaceAirSymbolSet.INSTANCE),
        CYBERSPACE_LAND_UNIT("63", "Cyberspace Land Unit", DimensionEnum.LAND_UNIT, "Cyberspace", CyberspaceLandUnitSymbolSet.INSTANCE),
        CYBERSPACE_LAND_EQUIPMENT("64", "Cyberspace Land Equipment", DimensionEnum.LAND_EQUIPMENT, "Cyberspace", CyberspaceLandEquipmentSymbolSet.INSTANCE),
        CYBERSPACE_LAND_INSTALLATION("65", "Cyberspace Land Installation", DimensionEnum.LAND_INSTALLATION, "Cyberspace", CyberspaceLandInstallationSymbolSet.INSTANCE),
        CYBERSPACE_DISMOUNTED("66", "Cyberspace Dismounted Individual", DimensionEnum.DISMOUNTED, "Cyberspace", CyberspaceDismountedIndividualSymbolSet.INSTANCE),
        CYBERSPACE_SEA_SURFACE("67", "Cyberspace Sea Surface", DimensionEnum.SEA_SURFACE, "Cyberspace", CyberspaceSeaSurfaceSymbolSet.INSTANCE),
        CYBERSPACE_SEA_SUBSURFACE("68", "Cyberspace Sea Subsurface", DimensionEnum.SEA_SUBSURFACE, "Cyberspace", CyberspaceSeaSubsurfaceSymbolSet.INSTANCE);

    private final String id;
    private final String label;
    private final DimensionEnum dimension;
    private final String graphicLocation;
    private final SymbolSetInfo symbolSetInfo;

    SymbolSetEnum(String id, String label, DimensionEnum dimension, SymbolSetInfo symbolSetInfo) {
        this(id, label, dimension, dimension.getGraphicLocation(), symbolSetInfo);
    }

    SymbolSetEnum(String id, String label, DimensionEnum dimension, String graphicLocation, SymbolSetInfo symbolSetInfo) {
        this.id = id;
        this.label = label;
        this.dimension = dimension;
        this.graphicLocation = graphicLocation;
        this.symbolSetInfo = symbolSetInfo;
    }

    @Override
    public AmplifierGuide getAmplifierGuide(Amplifier amplifier) {
        return getAmplifierGuides().stream()
            .filter(guide -> guide.getAmplifier() == amplifier)
            .findFirst()
            .orElse(null);
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifierList() {
        return symbolSetInfo.getAmplifiers();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifierListTwo() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    @Override
    public List<StandardAmplifierItem> getAmplifierListThree() {
        return symbolSetInfo.getAmplifiersThree();
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public List<Entity> getEntities() {
        return symbolSetInfo.getEntities();
    }

    @Override
    public String getFrameId() {
        return dimension.getFrameId();
    }

    @Override
    public List<StandardAmplifierItem> getFrameAmplifierList() {
        return symbolSetInfo.getFrameAmplifiers();
    }

    @Override
    public String getGraphicLocation() {
        return graphicLocation;
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
    public List<SectorOneModifier> getSectorOneModifiers() {
        return symbolSetInfo.getSectorOneModifiers();
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return symbolSetInfo.getSectorTwoModifiers();
    }

    @Override
    public SymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo;
    }

}