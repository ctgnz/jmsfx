package nz.co.ctg.jmsfx.model;

import java.util.List;

import nz.co.ctg.jmsfx.model.unknown.UnknownSymbolSetInfo;
import nz.co.ctg.jmsfx.model.air.AirSymbolSetInfo;
import nz.co.ctg.jmsfx.model.airmissile.AirMissileSymbolSetInfo;
import nz.co.ctg.jmsfx.model.space.SpaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.landunits.LandUnitsSymbolSetInfo;
import nz.co.ctg.jmsfx.model.landcivilian.LandCivilianSymbolSetInfo;
import nz.co.ctg.jmsfx.model.landequipment.LandEquipmentSymbolSetInfo;
import nz.co.ctg.jmsfx.model.landinstallation.LandInstallationSymbolSetInfo;
import nz.co.ctg.jmsfx.model.controlmeasure.ControlMeasureSymbolSetInfo;
import nz.co.ctg.jmsfx.model.dismountedindividual.DismountedIndividualSymbolSetInfo;
import nz.co.ctg.jmsfx.model.seasurface.SeaSurfaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.seasubsurface.SeaSubsurfaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.minewarfare.MineWarfareSymbolSetInfo;
import nz.co.ctg.jmsfx.model.activity.ActivitySymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspace.CyberspaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspacespace.CyberspaceSpaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspaceair.CyberspaceAirSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspacelandunit.CyberspaceLandUnitSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspacelandequipment.CyberspaceLandEquipmentSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspacelandinstallation.CyberspaceLandInstallationSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspacedismountedindividual.CyberspaceDismountedIndividualSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspaceseasurface.CyberspaceSeaSurfaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspaceseasubsurface.CyberspaceSeaSubsurfaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.internal.InternalSymbolSetInfo;

import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

public enum SymbolSet implements SymbolIdentificationCodeElement {
    SS_UNKNOWN("00", "Unknown", Dimension.UNKNOWN, null, UnknownSymbolSetInfo.INSTANCE),
    SS_AIR("01", "Air", Dimension.AIR, null, AirSymbolSetInfo.INSTANCE),
    SS_AIR_MISSILE("02", "Air Missile", Dimension.AIR, null, AirMissileSymbolSetInfo.INSTANCE),
    SS_SPACE("05", "Space", Dimension.SPACE, null, SpaceSymbolSetInfo.INSTANCE),
    SS_LAND_UNIT("10", "Land Units", Dimension.LAND_UNIT, null, LandUnitsSymbolSetInfo.INSTANCE),
    SS_LAND_CIVILIAN("11", "Land Civilian", Dimension.LAND_UNIT, null, LandCivilianSymbolSetInfo.INSTANCE),
    SS_LAND_EQUIPMENT("15", "Land Equipment", Dimension.LAND_EQUIPMENT, null, LandEquipmentSymbolSetInfo.INSTANCE),
    SS_LAND_INSTALLATION("20", "Land Installation", Dimension.LAND_INSTALLATION, null, LandInstallationSymbolSetInfo.INSTANCE),
    SS_CONTROL_MEASURE("25", "Control Measure", Dimension.CONTROL_MEASURE, null, ControlMeasureSymbolSetInfo.INSTANCE),
    SS_DISMOUNTED("27", "Dismounted Individual", Dimension.DISMOUNTED, null, DismountedIndividualSymbolSetInfo.INSTANCE),
    SS_SEA_SURFACE("30", "Sea Surface", Dimension.SEA_SURFACE, null, SeaSurfaceSymbolSetInfo.INSTANCE),
    SS_SEA_SUBSURFACE("35", "Sea Subsurface", Dimension.SEA_SUBSURFACE, null, SeaSubsurfaceSymbolSetInfo.INSTANCE),
    SS_MINE_WARFARE("36", "Mine Warfare", Dimension.SEA_SUBSURFACE, null, MineWarfareSymbolSetInfo.INSTANCE),
    SS_ACTIVITY("40", "Activity", Dimension.ACTIVITY, null, ActivitySymbolSetInfo.INSTANCE),
    SS_CYBERSPACE("60", "Cyberspace", Dimension.CYBERSPACE, "Cyberspace", CyberspaceSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE_SPACE("61", "Cyberspace Space", Dimension.SPACE, null, CyberspaceSpaceSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE_AIR("62", "Cyberspace Air", Dimension.AIR, null, CyberspaceAirSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE_LAND_UNIT("63", "Cyberspace Land Unit", Dimension.LAND_UNIT, null, CyberspaceLandUnitSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE_LAND_EQUIPMENT("64", "Cyberspace Land Equipment", Dimension.LAND_EQUIPMENT, null, CyberspaceLandEquipmentSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE_LAND_INSTALLATION("65", "Cyberspace Land Installation", Dimension.LAND_INSTALLATION, null, CyberspaceLandInstallationSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE_DISMOUNTED("66", "Cyberspace Dismounted Individual", Dimension.DISMOUNTED, null, CyberspaceDismountedIndividualSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE_SEA_SURFACE("67", "Cyberspace Sea Surface", Dimension.SEA_SURFACE, null, CyberspaceSeaSurfaceSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE_SEA_SUBSURFACE("68", "Cyberspace Sea Subsurface", Dimension.SEA_SUBSURFACE, null, CyberspaceSeaSubsurfaceSymbolSetInfo.INSTANCE),
    SS_INTERNAL("98", "Internal", Dimension.INTERNAL, null, InternalSymbolSetInfo.INSTANCE);

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

    public <A extends AmplifierGroup> List<A> getAmplifierGroups() {
        return symbolSetInfo.getAmplifiers();
    }

    public <A extends AmplifierGroup> List<A> getAmplifierTwoGroups() {
        return symbolSetInfo.getAmplifiersTwo();
    }

    public <A extends AmplifierGroup> List<A> getAmplifierThreeGroups() {
        return symbolSetInfo.getAmplifiersThree();
    }

    public Dimension getDimension() {
        return dimension;
    }

    public <E extends Entity> List<E> getEntities() {
        return symbolSetInfo.getEntities();
    }

    public <A extends AmplifierGroup> List<A> getFrameAmplifierGroups() {
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