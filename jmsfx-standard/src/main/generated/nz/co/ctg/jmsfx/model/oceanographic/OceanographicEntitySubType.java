package nz.co.ctg.jmsfx.model.oceanographic;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum OceanographicEntitySubType implements EntitySubType {
    MANY_ICEBERGS("01", "Many Icebergs", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    ICEBERGS_BELTS_STRIPS("02", "Belts and Strips", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    ICEBERGS_GENERAL("03", "General", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    MANY_ICEBERGS_GENERAL("04", "Many Icebergs - General", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    BERGY_BIT("05", "Bergy Bit", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    MANY_BERGY_BITS("06", "Many Bergy Bits", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    GROWLER("07", "Growler", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    MANY_GROWLERS("08", "Many Growlers", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    FLOEBERG("09", "Floeberg", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    ICE_ISLAND("10", "Ice Island", OceanographicEntityType.ICEBERGS, IconType.MAIN),
    BERGY_WATER("01", "Bergy Water", OceanographicEntityType.ICE_CONCENTRATION, IconType.MAIN),
    WATER_WITH_RADAR_TARGETS("02", "Water with Radar Targets", OceanographicEntityType.ICE_CONCENTRATION, IconType.MAIN),
    ICE_FREE("03", "Ice Free", OceanographicEntityType.ICE_CONCENTRATION, IconType.MAIN),
    CONVERGENCE("01", "Convergence", OceanographicEntityType.DYNAMIC_PROCESSES, IconType.MAIN),
    DIVERGENCE("02", "Divergence", OceanographicEntityType.DYNAMIC_PROCESSES, IconType.MAIN),
    SHEARING_SHEAR_ZONE("03", "Shearing or Shear Zone", OceanographicEntityType.DYNAMIC_PROCESSES, IconType.MAIN),
    ICE_DRIFT_DIRECTION("04", "Ice Drift (Direction)", OceanographicEntityType.DYNAMIC_PROCESSES, IconType.MAIN),
    ICE_THICKNESS_OBSERVED("01", "Ice Thickness (Observed)", OceanographicEntityType.SEA_ICE, IconType.MAIN),
    ICE_THICKNESS_ESTIMATED("02", "Ice Thickness (Estimated)", OceanographicEntityType.SEA_ICE, IconType.MAIN),
    MELT_PUDDLES_FLOODED_ICE("03", "Melt Puddles or Flooded Ice", OceanographicEntityType.SEA_ICE, IconType.MAIN),
    LIMITS_VISUAL_OBSERVATION("01", "Limits of Visual Observation", OceanographicEntityType.ICE_LIMITS, IconType.MAIN),
    LIMITS_UNDER_CAST("02", "Limits of Under Cast", OceanographicEntityType.ICE_LIMITS, IconType.MAIN),
    LIMITS_RADAR_OBSERVATION("03", "Limits of Radar Observation", OceanographicEntityType.ICE_LIMITS, IconType.MAIN),
    OBSERVED_ICE_EDGE_BOUNDARY("04", "Observed Ice Edge or Boundary", OceanographicEntityType.ICE_LIMITS, IconType.MAIN),
    ESTIMATED_ICE_EDGE_BOUNDARY("05", "Estimated Ice Edge or Boundary", OceanographicEntityType.ICE_LIMITS, IconType.MAIN),
    ICE_EDGE_BOUNDARY_FROM_RADAR("06", "Ice Edge or Boundary From Radar", OceanographicEntityType.ICE_LIMITS, IconType.MAIN),
    CRACKS("01", "Cracks", OceanographicEntityType.OPENINGS_IN_THE_ICE, IconType.MAIN),
    CRACKS_SPECIFIC_LOCATION("02", "Cracks at a Specific Location", OceanographicEntityType.OPENINGS_IN_THE_ICE, IconType.MAIN),
    LEAD("03", "Lead", OceanographicEntityType.OPENINGS_IN_THE_ICE, IconType.MAIN),
    FROZEN_LEAD("04", "Frozen Lead", OceanographicEntityType.OPENINGS_IN_THE_ICE, IconType.MAIN),
    SASTRUGI_WITH_ORIENTATION("01", "Sastrugi (with Orientation)", OceanographicEntityType.SNOW_COVER, IconType.MAIN),
    RIDGES_HUMMOCKS("01", "Ridges or Hummocks", OceanographicEntityType.TOPOGRAPHICAL_FEATURES, IconType.MAIN),
    RAFTING("02", "Rafting", OceanographicEntityType.TOPOGRAPHICAL_FEATURES, IconType.MAIN),
    JAMMED_BRASH_BARRIER("03", "Jammed Brash Barrier", OceanographicEntityType.TOPOGRAPHICAL_FEATURES, IconType.MAIN),
    SOUNDINGS("01", "Soundings", OceanographicEntityType.DEPTH, IconType.MAIN),
    DEPTH_CURVE("02", "Depth Curve", OceanographicEntityType.DEPTH, IconType.MAIN),
    DEPTH_CONTOUR("03", "Depth Contour", OceanographicEntityType.DEPTH, IconType.MAIN),
    DEPTH_AREA("04", "Depth Area", OceanographicEntityType.DEPTH, IconType.MAIN),
    COASTLINE("01", "Coastline", OceanographicEntityType.COASTAL_HYDROGRAPHY, IconType.MAIN),
    ISLAND("02", "Island", OceanographicEntityType.COASTAL_HYDROGRAPHY, IconType.MAIN),
    BEACH("03", "Beach", OceanographicEntityType.COASTAL_HYDROGRAPHY, IconType.MAIN),
    WATER("04", "Water", OceanographicEntityType.COASTAL_HYDROGRAPHY, IconType.MAIN),
    FORESHORE_LINE("05", "Foreshore - Line", OceanographicEntityType.COASTAL_HYDROGRAPHY, IconType.MAIN),
    FORESHORE_AREA("06", "Foreshore - Area", OceanographicEntityType.COASTAL_HYDROGRAPHY, IconType.MAIN),
    PORTS("01", "Ports", OceanographicEntityType.PORTS_HARBORS, IconType.NA),
    BERTHS_ONSHORE("02", "Berths (Onshore)", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    BERTHS_ANCHOR("03", "Berths (Anchor)", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    ANCHORAGE_POINT("04", "Anchorage - Point", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    ANCHORAGE_LINE("05", "Anchorage - Line", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    ANCHORAGE_AREA("06", "Anchorage - Area", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    CALL_IN_POINT("07", "Call in Point", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    PIER_WHARF_QUAY("08", "Pier/Wharf/Quay", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    FISHING_HARBOR_POINT("09", "Fishing Harbor - Point", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    FISH_WEIRS_POINT("10", "Fish Weirs - Point", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    FISH_STAKES_POINT("11", "Fish Stakes - Point", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    FISH_TRAPS_AREA("12", "Fish Traps - Area", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    FACILITIES("13", "Facilities", OceanographicEntityType.PORTS_HARBORS, IconType.NA),
    DRYDOCK("14", "Drydock", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    LANDING_PLACE("15", "Landing Place", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    OFFSHORE_LOADING_FACILITY_POINT("16", "Offshore Loading Facility - Point", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    OFFSHORE_LOADING_FACILITY_LINE("17", "Offshore Loading Facility - Line", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    OFFSHORE_LOADING_FACILITY_AREA("18", "Offshore Loading Facility - Area", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    RAMP_ABOVE_WATER("19", "Ramp - Above Water", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    RAMP_BELOW_WATER("20", "Ramp - Below Water", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    LANDING_RING("21", "Landing Ring", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    FERRY_CROSSING("22", "Ferry Crossing", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    CABLE_FERRY_CROSSING("23", "Cable Ferry Crossing", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    DOLPHIN("24", "Dolphin", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    SHORELINE_PROTECTION("25", "Shoreline Protection", OceanographicEntityType.PORTS_HARBORS, IconType.NA),
    BREAKWATER_GROIN_JETTY_ABOVE_WATER("26", "Breakwater/Groin/Jetty - Above Water", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    BREAKWATER_GROIN_JETTY_BELOW_WATER("27", "Breakwater/Groin/Jetty - Below Water", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    SEAWALL("28", "Seawall", OceanographicEntityType.PORTS_HARBORS, IconType.MAIN),
    BEACON("01", "Beacon", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    BUOY_DEFAULT("02", "Buoy Default", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    MARKER("03", "Marker", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    PERCHES_STAKES_POINT("04", "Perches/Stakes - Point", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    PERCHES_STAKES_AREA("05", "Perches/Stakes - Area", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    LIGHT("06", "Light", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    LEADING_LINE("07", "Leading Line", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    LIGHT_VESSEL_LIGHT_SHIP("08", "Light Vessel/Light Ship", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    LIGHTHOUSE("09", "Lighthouse", OceanographicEntityType.AIDS_NAVIGATION, IconType.MAIN),
    ROCK_SUBMERGED("01", "Rock Submerged", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    ROCK_AWASHED("02", "Rock Awashed", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    UNDERWATER_DANGER_HAZARD("03", "Underwater Danger/Hazard", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    FOUL_GROUND_POINT("04", "Foul Ground - Point", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    FOUL_GROUND_AREA("05", "Foul Ground - Area", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    KELP_SEAWEED_POINT("06", "Kelp/Seaweed - Point", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    KELP_SEAWEED_AREA("07", "Kelp/Seaweed - Area", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    SNAGS_STUMPS("08", "Snags/Stumps", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    WRECK_UNCOVERS("09", "Wreck (Uncovers)", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    WRECK_SUBMERGED("10", "Wreck (Submerged)", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    BREAKERS("11", "Breakers", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    REEF("12", "Reef", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    EDDIES_OVERFALLS_TIDE_RIPS("13", "Eddies/Overfalls/Tide Rips", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    DISCOLORED_WATER("14", "Discolored Water", OceanographicEntityType.DANGERS_HAZARDS, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_SAND("01", "Bottom Characteristics - Sand", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_MUD("02", "Bottom Characteristics - Mud", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_CLAY("03", "Bottom Characteristics - Clay", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_SILT("04", "Bottom Characteristics - Silt", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_STONES("05", "Bottom Characteristics - Stones", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_GRAVEL("06", "Bottom Characteristics - Gravel", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_PEBBLES("07", "Bottom Characteristics - Pebbles", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_COBBLES("08", "Bottom Characteristics - Cobbles", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_ROCK("09", "Bottom Characteristics - Rock", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_CORAL("10", "Bottom Characteristics - Coral", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    BOTTOM_CHARACTERISTICS_SHELL("11", "Bottom Characteristics - Shell", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    QUALIFYING_TERMS_FINE("12", "Qualifying Terms - Fine", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    QUALIFYING_TERMS_MEDIUM("13", "Qualifying Terms - Medium", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    QUALIFYING_TERMS_COARSE("14", "Qualifying Terms - Coarse", OceanographicEntityType.BOTTOM_FEATURES, IconType.MAIN),
    WATER_TURBULENCE("01", "Water Turbulence", OceanographicEntityType.TIDE_AND_CURRENT, IconType.MAIN),
    CURRENT_FLOW_EBB("02", "Current Flow - Ebb", OceanographicEntityType.TIDE_AND_CURRENT, IconType.MAIN),
    CURRENT_FLOW_FLOOD("03", "Current Flow - Flood", OceanographicEntityType.TIDE_AND_CURRENT, IconType.MAIN),
    TIDE_DATA_POINT("04", "Tide Data Point", OceanographicEntityType.TIDE_AND_CURRENT, IconType.MAIN),
    TIDE_GAUGE("05", "Tide Gauge", OceanographicEntityType.TIDE_AND_CURRENT, IconType.MAIN),
    VDR_LEVEL_1_2("01", "Visual Detection Ratio (VDR) Level 1-2", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    VDR_LEVEL_2_3("02", "VDR Level 2-3", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    VDR_LEVEL_3_4("03", "VDR Level 3-4", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    VDR_LEVEL_4_5("04", "VDR Level 4-5", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    VDR_LEVEL_5_6("05", "VDR Level 5-6", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    VDR_LEVEL_6_7("06", "VDR Level 6-7", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    VDR_LEVEL_7_8("07", "VDR Level 7-8", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    VDR_LEVEL_8_9("08", "VDR Level 8-9", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    VDR_LEVEL_9_10("09", "VDR Level 9-10", OceanographicEntityType.BIOLUMINESCENCE, IconType.MAIN),
    BEACH_SLOPE_FLAT("01", "Flat", OceanographicEntityType.BEACH_SLOPE, IconType.MAIN),
    BEACH_SLOPE_GENTLE("02", "Gentle", OceanographicEntityType.BEACH_SLOPE, IconType.MAIN),
    BEACH_SLOPE_MODERATE("03", "Moderate", OceanographicEntityType.BEACH_SLOPE, IconType.MAIN),
    BEACH_SLOPE_STEEP("04", "Steep", OceanographicEntityType.BEACH_SLOPE, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_SOLID_ROCK("01", "MIW Bottom Sediments - Solid Rock", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_CLAY("02", "MIW Bottom Sediments - Clay", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_VERY_COARSE_SAND("03", "MIW Bottom Sediments - Very Coarse Sand", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_COARSE_SAND("04", "MIW Bottom Sediments - Coarse Sand", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_MEDIUM_SAND("05", "MIW Bottom Sediments - Medium Sand", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_FINE_SAND("06", "MIW Bottom Sediments - Fine Sand", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_VERY_FINE_SAND("07", "MIW Bottom Sediments - Very Fine Sand", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_VERY_FINE_SILT("08", "MIW Bottom Sediments - Very Fine Silt", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_FINE_SILT("09", "MIW Bottom Sediments - Fine Silt", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_MEDIUM_SILT("10", "MIW Bottom Sediments - Medium Silt", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_COARSE_SILT("11", "MIW Bottom Sediments - Coarse Silt", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_BOULDERS("12", "MIW Bottom Sediments - Boulders", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_COBBLES_OYSTER_SHELLS("13", "MIW Bottom Sediments - Cobbles-Oyster Shells", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_PEBBLES_SHELLS("14", "MIW Bottom Sediments - Pebbles-Shells", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENTS_SAND_AND_SHELLS("15", "MIW Bottom Sediments - Sand and Shells", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENT_LAND("16", "MIW Bottom Sediment - Land", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_SEDIMENT_NO_DATA("17", "MIW Bottom Sediment - No Data", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    BOTTOM_ROUGHNESS_SMOOTH("18", "Bottom Roughness - Smooth", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    BOTTOM_ROUGHNESS_MODERATE("19", "Bottom Roughness - Moderate", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    BOTTOM_ROUGHNESS_ROUGH("20", "Bottom Roughness - Rough", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    CLUTTER_BOTTOM_LOW("21", "Clutter (Bottom) - Low", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    CLUTTER_BOTTOM_MEDIUM("22", "Clutter (Bottom) - Medium", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    CLUTTER_BOTTOM_HIGH("23", "Clutter (Bottom) - High", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    IMPACT_BURIAL_0("24", "Impact Burial - 0%", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    IMPACT_BURIAL_0_10("25", "Impact Burial - 0-10%", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    IMPACT_BURIAL_10_20("26", "Impact Burial - 10-20%", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    IMPACT_BURIAL_20_75("27", "Impact Burial - 20-75%", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    IMPACT_BURIAL_75("28", "Impact Burial - >75%", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_CATEGORY_A("29", "MIW Bottom Category A", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_CATEGORY_B("30", "MIW Bottom Category B", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_CATEGORY_C("31", "MIW Bottom Category C", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_A1("32", "MIW Bottom Type A1", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_A2("33", "MIW Bottom Type A2", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_A3("34", "MIW Bottom Type A3", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_B1("35", "MIW Bottom Type B1", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_B2("36", "MIW Bottom Type B2", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_B3("37", "MIW Bottom Type B3", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_C1("38", "MIW Bottom Type C1", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_C2("39", "MIW Bottom Type C2", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN),
    MIW_BOTTOM_TYPE_C3("40", "MIW Bottom Type C3", OceanographicEntityType.MINE_WARFARE_MIW_BOTTOM_DESCRIPTORS, IconType.MAIN);

    private final String id;
    private final String label;
    private final OceanographicEntityType entityType;
    private final IconType iconType;
    
    private OceanographicEntitySubType(String id, String label, OceanographicEntityType entityType, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.iconType = iconType;
    }
    

    @Override
    public IconType getIconType() {
        return iconType;
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
    public EntityType getEntityType() {
        return entityType;
    }
    
}