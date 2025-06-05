package io.github.ctgnz.jmsfx.icon;

import java.util.List;

import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.ISymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.unknown.UnknownSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.air.AirSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.space.SpaceSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.landunits.LandUnitsSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.landequipment.LandEquipmentSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.landinstallation.LandInstallationSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.dismountedindividual.DismountedIndividualSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.seasurface.SeaSurfaceSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.seasubsurface.SeaSubsurfaceSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.minewarfare.MineWarfareSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.activity.ActivitySymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspace.CyberspaceSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspacespace.CyberspaceSpaceSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspaceair.CyberspaceAirSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspacelandunit.CyberspaceLandUnitSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspacelandequipment.CyberspaceLandEquipmentSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspacelandinstallation.CyberspaceLandInstallationSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspacedismountedindividual.CyberspaceDismountedIndividualSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspaceseasurface.CyberspaceSeaSurfaceSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.cyberspaceseasubsurface.CyberspaceSeaSubsurfaceSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.internal.InternalSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.common.CommonSymbolSetInfo;

public enum SymbolSet implements ISymbolSet {
    COMMON("C", "Common", Dimension.INTERNAL, "Common", CommonSymbolSetInfo.INSTANCE),
    UNKNOWN("00", "Unknown", Dimension.UNKNOWN, null, UnknownSymbolSetInfo.INSTANCE),
    AIR("01", "Air", Dimension.AIR, null, AirSymbolSetInfo.INSTANCE),
    AIR_MISSILE("02", "Air Missile", Dimension.AIR, null, AirMissileSymbolSetInfo.INSTANCE),
    SPACE("05", "Space", Dimension.SPACE, null, SpaceSymbolSetInfo.INSTANCE),
    LAND_UNIT("10", "Land Units", Dimension.LAND_UNIT, null, LandUnitsSymbolSetInfo.INSTANCE),
    LAND_CIVILIAN("11", "Land Civilian", Dimension.LAND_UNIT, null, LandCivilianSymbolSetInfo.INSTANCE),
    LAND_EQUIPMENT("15", "Land Equipment", Dimension.LAND_EQUIPMENT, null, LandEquipmentSymbolSetInfo.INSTANCE),
    LAND_INSTALLATION("20", "Land Installation", Dimension.LAND_INSTALLATION, null, LandInstallationSymbolSetInfo.INSTANCE),
    CONTROL_MEASURE("25", "Control Measure", Dimension.CONTROL_MEASURE, null, ControlMeasureSymbolSetInfo.INSTANCE),
    DISMOUNTED("27", "Dismounted Individual", Dimension.DISMOUNTED, null, DismountedIndividualSymbolSetInfo.INSTANCE),
    SEA_SURFACE("30", "Sea Surface", Dimension.SEA_SURFACE, null, SeaSurfaceSymbolSetInfo.INSTANCE),
    SEA_SUBSURFACE("35", "Sea Subsurface", Dimension.SEA_SUBSURFACE, null, SeaSubsurfaceSymbolSetInfo.INSTANCE),
    MINE_WARFARE("36", "Mine Warfare", Dimension.SEA_SUBSURFACE, null, MineWarfareSymbolSetInfo.INSTANCE),
    ACTIVITY("40", "Activity", Dimension.ACTIVITY, null, ActivitySymbolSetInfo.INSTANCE),
    CYBERSPACE("60", "Cyberspace", Dimension.CYBERSPACE, "Cyberspace", CyberspaceSymbolSetInfo.INSTANCE),
    CYBERSPACE_SPACE("61", "Cyberspace Space", Dimension.SPACE, "Cyberspace", CyberspaceSpaceSymbolSetInfo.INSTANCE),
    CYBERSPACE_AIR("62", "Cyberspace Air", Dimension.AIR, "Cyberspace", CyberspaceAirSymbolSetInfo.INSTANCE),
    CYBERSPACE_LAND_UNIT("63", "Cyberspace Land Unit", Dimension.LAND_UNIT, "Cyberspace", CyberspaceLandUnitSymbolSetInfo.INSTANCE),
    CYBERSPACE_LAND_EQUIPMENT("64", "Cyberspace Land Equipment", Dimension.LAND_EQUIPMENT, "Cyberspace", CyberspaceLandEquipmentSymbolSetInfo.INSTANCE),
    CYBERSPACE_LAND_INSTALLATION("65", "Cyberspace Land Installation", Dimension.LAND_INSTALLATION, "Cyberspace", CyberspaceLandInstallationSymbolSetInfo.INSTANCE),
    CYBERSPACE_DISMOUNTED("66", "Cyberspace Dismounted Individual", Dimension.DISMOUNTED, "Cyberspace", CyberspaceDismountedIndividualSymbolSetInfo.INSTANCE),
    CYBERSPACE_SEA_SURFACE("67", "Cyberspace Sea Surface", Dimension.SEA_SURFACE, "Cyberspace", CyberspaceSeaSurfaceSymbolSetInfo.INSTANCE),
    CYBERSPACE_SEA_SUBSURFACE("68", "Cyberspace Sea Subsurface", Dimension.SEA_SUBSURFACE, "Cyberspace", CyberspaceSeaSubsurfaceSymbolSetInfo.INSTANCE),
    INTERNAL("98", "Internal", Dimension.INTERNAL, "", InternalSymbolSetInfo.INSTANCE);

    private final String id;
    private final String label;
    private final Dimension dimension;
    private final String graphicLocation;
    private final ISymbolSetInfo symbolSetInfo;

    SymbolSet(String id, String label, Dimension dimension, String graphicLocation, ISymbolSetInfo symbolSetInfo) {
        this.id = id;
        this.label = label;
        this.dimension = dimension;
        this.graphicLocation = graphicLocation;
        this.symbolSetInfo = symbolSetInfo;
    }

    @Override
    public AmplifierGuide getAmplifierGuide(IAmplifier amplifier) {
        return getAmplifierGuides().stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    @Override
    public <A extends IListAmplifier> List<A> getAmplifierThreeGroups() {
        return symbolSetInfo.getAmplifiersThree();
    }

    @Override
    public <A extends IListAmplifier> List<A> getAmplifierTwoGroups() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public <E extends IEntity> List<E> getEntities() {
        return symbolSetInfo.getEntities();
    }

    @Override
    public String getFrameId() {
        return dimension.getFrameId();
    }

    @Override
    public <A extends IListAmplifier> List<A> getFrameListAmplifiers() {
        return symbolSetInfo.getFrameAmplifiers();
    }

    @Override
    public String getGraphicLocation() {
        return defaultIfNull(graphicLocation, dimension.getGraphicLocation());
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
    public <A extends IListAmplifier> List<A> getListAmplifiers() {
        return symbolSetInfo.getAmplifiers();
    }

    @Override
    public <M extends ISectorOneModifier> List<M> getSectorOneModifiers() {
        return symbolSetInfo.getSectorOneModifiers();
    }

    @Override
    public <M extends ISectorTwoModifier> List<M> getSectorTwoModifiers() {
        return symbolSetInfo.getSectorTwoModifiers();
    }

    @Override
    public ISymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo;
    }

}