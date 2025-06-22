package io.github.ctgnz.jmsfx.icon;

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
import io.github.ctgnz.jmsfx.icon.unknown.UnknownSymbolSet;
import io.github.ctgnz.jmsfx.icon.air.AirSymbolSet;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileSymbolSet;
import io.github.ctgnz.jmsfx.icon.space.SpaceSymbolSet;
import io.github.ctgnz.jmsfx.icon.landunits.LandUnitsSymbolSet;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianSymbolSet;
import io.github.ctgnz.jmsfx.icon.landequipment.LandEquipmentSymbolSet;
import io.github.ctgnz.jmsfx.icon.landinstallation.LandInstallationSymbolSet;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureSymbolSet;
import io.github.ctgnz.jmsfx.icon.dismountedindividual.DismountedIndividualSymbolSet;
import io.github.ctgnz.jmsfx.icon.seasurface.SeaSurfaceSymbolSet;
import io.github.ctgnz.jmsfx.icon.seasubsurface.SeaSubsurfaceSymbolSet;
import io.github.ctgnz.jmsfx.icon.minewarfare.MineWarfareSymbolSet;
import io.github.ctgnz.jmsfx.icon.activity.ActivitySymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspace.CyberspaceSymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspacespace.CyberspaceSpaceSymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspaceair.CyberspaceAirSymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspacelandunit.CyberspaceLandUnitSymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspacelandequipment.CyberspaceLandEquipmentSymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspacelandinstallation.CyberspaceLandInstallationSymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspacedismountedindividual.CyberspaceDismountedIndividualSymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspaceseasurface.CyberspaceSeaSurfaceSymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspaceseasubsurface.CyberspaceSeaSubsurfaceSymbolSet;
import io.github.ctgnz.jmsfx.icon.internal.InternalSymbolSet;
import io.github.ctgnz.jmsfx.icon.common.CommonSymbolSet;

public enum SymbolSetEnum implements SymbolSet {
    COMMON("C", "Common", DimensionEnum.INTERNAL, "Common", CommonSymbolSet.INSTANCE),
    UNKNOWN("00", "Unknown", DimensionEnum.UNKNOWN, UnknownSymbolSet.INSTANCE),
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
    CYBERSPACE_SEA_SUBSURFACE("68", "Cyberspace Sea Subsurface", DimensionEnum.SEA_SUBSURFACE, "Cyberspace", CyberspaceSeaSubsurfaceSymbolSet.INSTANCE),
    INTERNAL("98", "Internal", DimensionEnum.INTERNAL, "", InternalSymbolSet.INSTANCE);

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
        return getAmplifierGuides().stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    @Override
    public <A extends StandardAmplifierItem> List<A> getAmplifierList() {
        return symbolSetInfo.getAmplifiers();
    }

    @Override
    public <A extends StandardAmplifierItem> List<A> getAmplifierListTwo() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    @Override
    public <A extends StandardAmplifierItem> List<A> getAmplifierListThree() {
        return symbolSetInfo.getAmplifiersThree();
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public <E extends Entity> List<E> getEntities() {
        return symbolSetInfo.getEntities();
    }

    @Override
    public String getFrameId() {
        return dimension.getFrameId();
    }

    @Override
    public <A extends StandardAmplifierItem> List<A> getFrameAmplifierList() {
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
    public <M extends SectorOneModifier> List<M> getSectorOneModifiers() {
        return symbolSetInfo.getSectorOneModifiers();
    }

    @Override
    public <M extends SectorTwoModifier> List<M> getSectorTwoModifiers() {
        return symbolSetInfo.getSectorTwoModifiers();
    }

    @Override
    public SymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo;
    }

}