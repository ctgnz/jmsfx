package io.github.ctgnz.jmsfx.icon;

import java.util.List;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IAmplifierGuide;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.ISymbolSetInfo;
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

public enum SymbolSet implements ISymbolSet {
    COMMON("C", "Common", Dimension.INTERNAL, "Common", CommonSymbolSet.INSTANCE),
    UNKNOWN("00", "Unknown", Dimension.UNKNOWN, UnknownSymbolSet.INSTANCE),
    AIR("01", "Air", Dimension.AIR, AirSymbolSet.INSTANCE),
    AIR_MISSILE("02", "Air Missile", Dimension.AIR, AirMissileSymbolSet.INSTANCE),
    SPACE("05", "Space", Dimension.SPACE, SpaceSymbolSet.INSTANCE),
    LAND_UNIT("10", "Land Units", Dimension.LAND_UNIT, LandUnitsSymbolSet.INSTANCE),
    LAND_CIVILIAN("11", "Land Civilian", Dimension.LAND_UNIT, LandCivilianSymbolSet.INSTANCE),
    LAND_EQUIPMENT("15", "Land Equipment", Dimension.LAND_EQUIPMENT, LandEquipmentSymbolSet.INSTANCE),
    LAND_INSTALLATION("20", "Land Installation", Dimension.LAND_INSTALLATION, LandInstallationSymbolSet.INSTANCE),
    CONTROL_MEASURE("25", "Control Measure", Dimension.CONTROL_MEASURE, ControlMeasureSymbolSet.INSTANCE),
    DISMOUNTED("27", "Dismounted Individual", Dimension.DISMOUNTED, DismountedIndividualSymbolSet.INSTANCE),
    SEA_SURFACE("30", "Sea Surface", Dimension.SEA_SURFACE, SeaSurfaceSymbolSet.INSTANCE),
    SEA_SUBSURFACE("35", "Sea Subsurface", Dimension.SEA_SUBSURFACE, SeaSubsurfaceSymbolSet.INSTANCE),
    MINE_WARFARE("36", "Mine Warfare", Dimension.SEA_SUBSURFACE, MineWarfareSymbolSet.INSTANCE),
    ACTIVITY("40", "Activity", Dimension.ACTIVITY, ActivitySymbolSet.INSTANCE),
    CYBERSPACE("60", "Cyberspace", Dimension.CYBERSPACE, "Cyberspace", CyberspaceSymbolSet.INSTANCE),
    CYBERSPACE_SPACE("61", "Cyberspace Space", Dimension.SPACE, "Cyberspace", CyberspaceSpaceSymbolSet.INSTANCE),
    CYBERSPACE_AIR("62", "Cyberspace Air", Dimension.AIR, "Cyberspace", CyberspaceAirSymbolSet.INSTANCE),
    CYBERSPACE_LAND_UNIT("63", "Cyberspace Land Unit", Dimension.LAND_UNIT, "Cyberspace", CyberspaceLandUnitSymbolSet.INSTANCE),
    CYBERSPACE_LAND_EQUIPMENT("64", "Cyberspace Land Equipment", Dimension.LAND_EQUIPMENT, "Cyberspace", CyberspaceLandEquipmentSymbolSet.INSTANCE),
    CYBERSPACE_LAND_INSTALLATION("65", "Cyberspace Land Installation", Dimension.LAND_INSTALLATION, "Cyberspace", CyberspaceLandInstallationSymbolSet.INSTANCE),
    CYBERSPACE_DISMOUNTED("66", "Cyberspace Dismounted Individual", Dimension.DISMOUNTED, "Cyberspace", CyberspaceDismountedIndividualSymbolSet.INSTANCE),
    CYBERSPACE_SEA_SURFACE("67", "Cyberspace Sea Surface", Dimension.SEA_SURFACE, "Cyberspace", CyberspaceSeaSurfaceSymbolSet.INSTANCE),
    CYBERSPACE_SEA_SUBSURFACE("68", "Cyberspace Sea Subsurface", Dimension.SEA_SUBSURFACE, "Cyberspace", CyberspaceSeaSubsurfaceSymbolSet.INSTANCE),
    INTERNAL("98", "Internal", Dimension.INTERNAL, "", InternalSymbolSet.INSTANCE);

    private final String id;
    private final String label;
    private final Dimension dimension;
    private final String graphicLocation;
    private final ISymbolSetInfo symbolSetInfo;

    SymbolSet(String id, String label, Dimension dimension, ISymbolSetInfo symbolSetInfo) {
        this(id, label, dimension, dimension.getGraphicLocation(), symbolSetInfo);
    }
    
    SymbolSet(String id, String label, Dimension dimension, String graphicLocation, ISymbolSetInfo symbolSetInfo) {
        this.id = id;
        this.label = label;
        this.dimension = dimension;
        this.graphicLocation = graphicLocation;
        this.symbolSetInfo = symbolSetInfo;
    }

    @Override
    public IAmplifierGuide getAmplifierGuide(IAmplifier amplifier) {
        return getAmplifierGuides().stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    public List<IAmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierList() {
        return symbolSetInfo.getAmplifiers();
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListTwo() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListThree() {
        return symbolSetInfo.getAmplifiersThree();
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
    public <A extends IStandardAmplifierItem> List<A> getFrameAmplifierList() {
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