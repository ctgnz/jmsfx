package nz.co.ctg.jmsfx.model;

import java.util.List;

import nz.co.ctg.jmsfx.model.unknown.UnknownSymbolSetInfo;
import nz.co.ctg.jmsfx.model.air.AirSymbolSetInfo;
import nz.co.ctg.jmsfx.model.airmissile.AirMissileSymbolSetInfo;
import nz.co.ctg.jmsfx.model.space.SpaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.spacemissile.SpaceMissileSymbolSetInfo;
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
import nz.co.ctg.jmsfx.model.atmospheric.AtmosphericSymbolSetInfo;
import nz.co.ctg.jmsfx.model.oceanographic.OceanographicSymbolSetInfo;
import nz.co.ctg.jmsfx.model.meteorologicalspace.MeteorologicalSpaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.signalsintelligencespace.SignalsIntelligenceSpaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.signalsintelligenceair.SignalsIntelligenceAirSymbolSetInfo;
import nz.co.ctg.jmsfx.model.signalsintelligenceland.SignalsIntelligenceLandSymbolSetInfo;
import nz.co.ctg.jmsfx.model.signalsintelligencesurface.SignalsIntelligenceSurfaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.signalsintelligencesubsurface.SignalsIntelligenceSubsurfaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.cyberspace.CyberspaceSymbolSetInfo;
import nz.co.ctg.jmsfx.model.internal.InternalSymbolSetInfo;

import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

public enum SymbolSet implements SymbolIdentificationCodeElement {
    SS_UNKNOWN("00", "Unknown", Dimension.UNKNOWN, null, UnknownSymbolSetInfo.INSTANCE),
    SS_AIR("01", "Air", Dimension.AIR, null, AirSymbolSetInfo.INSTANCE),
    SS_AIR_MISSILE("02", "Air Missile", Dimension.AIR, null, AirMissileSymbolSetInfo.INSTANCE),
    SS_SPACE("05", "Space", Dimension.SPACE, null, SpaceSymbolSetInfo.INSTANCE),
    SS_SPACE_MISSILE("06", "Space Missile", Dimension.SPACE, null, SpaceMissileSymbolSetInfo.INSTANCE),
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
    SS_ATMOSPHERIC("45", "Atmospheric", Dimension.METOC, "METOC/Atmospheric", AtmosphericSymbolSetInfo.INSTANCE),
    SS_OCEANIC("46", "Oceanographic", Dimension.METOC, "METOC/Oceanographic", OceanographicSymbolSetInfo.INSTANCE),
    SS_MET_SPACE("47", "Meteorological Space", Dimension.METOC, null, MeteorologicalSpaceSymbolSetInfo.INSTANCE),
    SS_SIGINT_SPACE("50", "Signals Intelligence - Space", Dimension.SPACE, "SigInt", SignalsIntelligenceSpaceSymbolSetInfo.INSTANCE),
    SS_SIGINT_AIR("51", "Signals Intelligence - Air", Dimension.AIR, "SigInt", SignalsIntelligenceAirSymbolSetInfo.INSTANCE),
    SS_SIGINT_LAND("52", "Signals Intelligence - Land", Dimension.LAND_EQUIPMENT, "SigInt", SignalsIntelligenceLandSymbolSetInfo.INSTANCE),
    SS_SIGINT_SURFACE("53", "Signals Intelligence - Surface", Dimension.SEA_SURFACE, "SigInt", SignalsIntelligenceSurfaceSymbolSetInfo.INSTANCE),
    SS_SIGINT_SUBSURFACE("54", "Signals Intelligence - Subsurface", Dimension.SEA_SUBSURFACE, "SigInt", SignalsIntelligenceSubsurfaceSymbolSetInfo.INSTANCE),
    SS_CYBERSPACE("60", "Cyberspace", Dimension.AIR, "Cyberspace", CyberspaceSymbolSetInfo.INSTANCE),
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