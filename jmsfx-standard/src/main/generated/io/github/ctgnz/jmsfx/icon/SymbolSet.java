package io.github.ctgnz.jmsfx.icon;

import java.util.List;

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

import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

public enum SymbolSet implements SymbolIdentificationCodeElement {
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
    CYBERSPACE("60", "Cyberspace", Dimension.CYBERSPACE, null, CyberspaceSymbolSetInfo.INSTANCE),
    CYBERSPACE_SPACE("61", "Cyberspace Space", Dimension.SPACE, null, CyberspaceSpaceSymbolSetInfo.INSTANCE),
    CYBERSPACE_AIR("62", "Cyberspace Air", Dimension.AIR, null, CyberspaceAirSymbolSetInfo.INSTANCE),
    CYBERSPACE_LAND_UNIT("63", "Cyberspace Land Unit", Dimension.LAND_UNIT, null, CyberspaceLandUnitSymbolSetInfo.INSTANCE),
    CYBERSPACE_LAND_EQUIPMENT("64", "Cyberspace Land Equipment", Dimension.LAND_EQUIPMENT, null, CyberspaceLandEquipmentSymbolSetInfo.INSTANCE),
    CYBERSPACE_LAND_INSTALLATION("65", "Cyberspace Land Installation", Dimension.LAND_INSTALLATION, null, CyberspaceLandInstallationSymbolSetInfo.INSTANCE),
    CYBERSPACE_DISMOUNTED("66", "Cyberspace Dismounted Individual", Dimension.DISMOUNTED, null, CyberspaceDismountedIndividualSymbolSetInfo.INSTANCE),
    CYBERSPACE_SEA_SURFACE("67", "Cyberspace Sea Surface", Dimension.SEA_SURFACE, null, CyberspaceSeaSurfaceSymbolSetInfo.INSTANCE),
    CYBERSPACE_SEA_SUBSURFACE("68", "Cyberspace Sea Subsurface", Dimension.SEA_SUBSURFACE, null, CyberspaceSeaSubsurfaceSymbolSetInfo.INSTANCE),
    INTERNAL("98", "Internal", Dimension.INTERNAL, null, InternalSymbolSetInfo.INSTANCE);

    private final String id;
    private final String label;
    private final Dimension dimension;
    private final String graphicLocation;
    private final SymbolSetInfo symbolSetInfo;
    
    private SymbolSet(String id, String label, Dimension dimension, String graphicLocation, SymbolSetInfo symbolSetInfo) {
        this.id = id;
        this.label = label;
        this.dimension = dimension;
        this.graphicLocation = graphicLocation;
        this.symbolSetInfo = symbolSetInfo;
    }
    
    public List<AmplifierGuide> getAmplifierGuides() {
        return symbolSetInfo.getAmplifierGuides();
    }

    public AmplifierGuide getAmplifierGuide(Amplifier amplifier) {
        return getAmplifierGuides().stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    public <A extends EnumeratedAmplifier> List<A> getEnumeratedAmplifiers() {
        return symbolSetInfo.getAmplifiers();
    }

    public <A extends EnumeratedAmplifier> List<A> getAmplifierTwoGroups() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    public <A extends EnumeratedAmplifier> List<A> getAmplifierThreeGroups() {
        return symbolSetInfo.getAmplifiersThree();
    }

    public Dimension getDimension() {
        return dimension;
    }

    public <E extends Entity> List<E> getEntities() {
        return symbolSetInfo.getEntities();
    }

    public <A extends EnumeratedAmplifier> List<A> getFrameEnumeratedAmplifiers() {
        return symbolSetInfo.getFrameAmplifiers();
    }

    public String getFrameId() {
        return dimension.getFrameId();
    }

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

    public <M extends SectorOneModifier> List<M> getSectorOneModifiers() {
        return symbolSetInfo.getSectorOneModifiers();
    }

    public <M extends SectorTwoModifier> List<M> getSectorTwoModifiers() {
        return symbolSetInfo.getSectorTwoModifiers();
    }

    public SymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo;
    }

}