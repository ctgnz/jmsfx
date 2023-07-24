package nz.co.ctg.jmsfx.model.controlmeasure;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum ControlMeasureEntitySubType implements EntitySubType {
    FLY_TO_POINT_SONOBUOY("01", "Fly-To-Point (Sonobuoy)", ControlMeasureEntityType.FLY_TO_POINT, IconType.MAIN),
    FLY_TO_POINT_WEAPON("02", "Fly-To-Point (Weapon)", ControlMeasureEntityType.FLY_TO_POINT, IconType.MAIN),
    FLY_TO_POINT_NORMAL("03", "Fly-To-Point (Normal)", ControlMeasureEntityType.FLY_TO_POINT, IconType.MAIN),
    POI_LAUNCH_EVENT("01", "Launch Event (Point of Interest)", ControlMeasureEntityType.POINT_OF_INTEREST, IconType.MAIN),
    FLOT_FRIENDLY_PRESENT("01", "Friendly Present", ControlMeasureEntityType.FORWARD_LINE_OF_TROOPS, IconType.MAIN),
    FLOT_FRIENDLY_PLANNED_ON_ORDER("02", "Friendly Planned or on Order", ControlMeasureEntityType.FORWARD_LINE_OF_TROOPS, IconType.MAIN),
    FLOT_ENEMY_KNOWN("03", "Enemy Known", ControlMeasureEntityType.FORWARD_LINE_OF_TROOPS, IconType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25140103.a";
        }
    },
    FLOT_ENEMY_SUSPECTED_TEMPLATED("04", "Enemy Suspected or Templated", ControlMeasureEntityType.FORWARD_LINE_OF_TROOPS, IconType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25140104.a";
        }
    },
    FEBA_PROPOSED_ON_ORDER("01", "Proposed or On Order", ControlMeasureEntityType.FORWARD_EDGE_BATTLE_AREA, IconType.MAIN),
    FRIENDLY_AVIATION("01", "Friendly Aviation", ControlMeasureEntityType.DIRECTION_OF_ATTACK, IconType.MAIN),
    FRIENDLY_MAIN_ATTACK_DECISIVE("02", "Friendly Direction of Main Attack", ControlMeasureEntityType.DIRECTION_OF_ATTACK, IconType.MAIN),
    FRIENDLY_SUPPORTING_ATTACK("03", "Friendly Direction of Supporting Attack", ControlMeasureEntityType.DIRECTION_OF_ATTACK, IconType.MAIN),
    FRIENDLY_PLANNED_ON_ORDER("04", "Friendly Planned or On Order", ControlMeasureEntityType.DIRECTION_OF_ATTACK, IconType.MAIN),
    FEINT("05", "Feint", ControlMeasureEntityType.DIRECTION_OF_ATTACK, IconType.MAIN),
    ENEMY_CONFIRMED("06", "Enemy Confirmed", ControlMeasureEntityType.DIRECTION_OF_ATTACK, IconType.MAIN),
    ENEMY_TEMPLATED_OR_SUSPECTED("07", "Enemy Templated or Suspected", ControlMeasureEntityType.DIRECTION_OF_ATTACK, IconType.MAIN),
    AREA_FRIENDLY("01", "Friendly", ControlMeasureEntityType.AREA, IconType.MAIN),
    AREA_FRIENDLY_PLANNED_OR_ON_ORDER("02", "Friendly Planned or On Order", ControlMeasureEntityType.AREA, IconType.MAIN),
    AREA_ENEMY_KNOWN_OR_CONFIRMED("03", "Enemy Known or Confirmed", ControlMeasureEntityType.AREA, IconType.MAIN),
    AREA_ENEMY_SUSPECTED("04", "Enemy Suspected", ControlMeasureEntityType.AREA, IconType.MAIN),
    OCCUPIED_AA_OFFSET_UNIT("01", "Occupied Assembly Area w/ Offset Unit", ControlMeasureEntityType.OCCUPIED_ASSEMBLY_AREA, IconType.NA),
    OCCUPIED_AA_OFFSET_UNITS("02", "Occupied Assembly Area w/ Offset Units", ControlMeasureEntityType.OCCUPIED_ASSEMBLY_AREA, IconType.NA),
    JTAA("01", "Joint Tactical Action Area (JTAA)", ControlMeasureEntityType.ACTION_AREA, IconType.MAIN),
    SAA("02", "Submarine Action Area (SAA)", ControlMeasureEntityType.ACTION_AREA, IconType.MAIN),
    SGAA("03", "Submarine-Generated Action Area (SGAA)", ControlMeasureEntityType.ACTION_AREA, IconType.MAIN),
    BP_PLANNED("01", "Battle Position - Planned", ControlMeasureEntityType.BATTLE_POSITION, IconType.MAIN),
    PREPARED_BUT_NOT_OCCUPIED("02", "Battle Position - Prepared (P) but not Occupied", ControlMeasureEntityType.BATTLE_POSITION, IconType.MAIN),
    STRONG_POINT("03", "Strong Point", ControlMeasureEntityType.BATTLE_POSITION, IconType.MAIN),
    CONTAIN("04", "Contain", ControlMeasureEntityType.BATTLE_POSITION, IconType.MAIN),
    RETAIN("05", "Retain", ControlMeasureEntityType.BATTLE_POSITION, IconType.MAIN),
    AXIS_ADVANCE_FRIENDLY_AIRBORNE_AVIATION("01", "Friendly Airborne/Aviation", ControlMeasureEntityType.AXIS_ADVANCE, IconType.MAIN),
    AXIS_ADVANCE_ATTACK_HELICOPTER("02", "Attack Helicopter", ControlMeasureEntityType.AXIS_ADVANCE, IconType.MAIN),
    AXIS_ADVANCE_MAIN_ATTACK("03", "Main Attack", ControlMeasureEntityType.AXIS_ADVANCE, IconType.MAIN),
    AXIS_ADVANCE_SUPPORTING_ATTACK("04", "Supporting Attack", ControlMeasureEntityType.AXIS_ADVANCE, IconType.MAIN),
    AXIS_ADVANCE_SUPPORTING_ATTACK_PLANNED_ON_ORDER("05", "Supporting Attack Planned or On Order", ControlMeasureEntityType.AXIS_ADVANCE, IconType.MAIN),
    AXIS_ADVANCE_FEINT("06", "Feint", ControlMeasureEntityType.AXIS_ADVANCE, IconType.MAIN),
    AXIS_ADVANCE_ENEMY_CONFIRMED("07", "Enemy Confirmed", ControlMeasureEntityType.AXIS_ADVANCE, IconType.MAIN),
    AXIS_ADVANCE_ENEMY_TEMPLATED_SUSPECTED("08", "Enemy Templated or Suspected", ControlMeasureEntityType.AXIS_ADVANCE, IconType.MAIN),
    FRIENDLY("01", "Friendly", ControlMeasureEntityType.ENCIRCLEMENT, IconType.MAIN),
    ENEMY("02", "Enemy", ControlMeasureEntityType.ENCIRCLEMENT, IconType.MAIN),
    RECONNAISSANCE_OUTPOST("01", "Reconnaissance Outpost", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, IconType.MAIN),
    FORWARD_OBSERVER_OUTPOST("02", "Forward Observer Outpost", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, IconType.MAIN),
    CBRN_OBSERVATION_OUTPOST("03", "CBRN Observation Outpost", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, IconType.MAIN),
    SENSOR_OUTPOST_LISTENING_POST("04", "Sensor Outpost/Listening Post", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, IconType.MAIN),
    COMBAT_OUTPOST("05", "Combat Outpost", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, IconType.MAIN),
    LAUNCH_ELLIPSE_CIRCLE("01", "Ellipse/Circle", ControlMeasureEntityType.LAUNCH_AREA, IconType.MAIN),
    DEFEND_ELLIPSE_CIRCLE("01", "Ellipse/Circle", ControlMeasureEntityType.DEFENDED_AREA, IconType.MAIN),
    DEFEND_RECTANGLE("02", "Rectangle", ControlMeasureEntityType.DEFENDED_AREA, IconType.MAIN),
    SHIP_AOI_ELLIPSE_CIRCLE("01", "Ellipse/Circle", ControlMeasureEntityType.SHIP_AREA_OF_INTEREST, IconType.MAIN),
    SHIP_AOI_RECTANGLE("02", "Rectangle", ControlMeasureEntityType.SHIP_AREA_OF_INTEREST, IconType.MAIN),
    A("01", "A", ControlMeasureEntityType.HARBOR_ENTRANCE_POINT, IconType.MAIN),
    Q("02", "Q", ControlMeasureEntityType.HARBOR_ENTRANCE_POINT, IconType.MAIN),
    X("03", "X", ControlMeasureEntityType.HARBOR_ENTRANCE_POINT, IconType.MAIN),
    Y("04", "Y", ControlMeasureEntityType.HARBOR_ENTRANCE_POINT, IconType.MAIN),
    AMBIENT_NOISE("01", "Ambient Noise", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    AIR_TRANSPORTABLE_COMMUNICATION("02", "Air Transportable Communication", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    BARRA("03", "Barra", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    BATHYTHERMOGRAPH_TRANSMITTING("04", "Bathythermograph Transmitting", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    CAMBS("05", "Command Active Multi-Beam (CAMBS)", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    CASS("06", "Command Active Sonobuoy Directional Command Active Sonobuoy System (CASS)", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    DIFAR("07", "Digital Frequency Analysis and Recording (DIFAR)", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    DICASS("08", "Directional Command Active Sonobuoy System (DICASS)", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    ERAPS("09", "Expendable Reliable Acoustic Path Sonobuoy (ERAPS)", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    EXPIRED("10", "Expired", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    KINGPIN("11", "Kingpin", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    LOFAR("12", "Low Frequency Analysis and Recording (LOFAR)", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    PATTERN_CENTER("13", "Pattern Center", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    RANGE_ONLY("14", "Range Only", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    VERTICAL_LINE_ARRAY_DIRECTIONAL_FREQUENCY_ANALYSIS_RECORDING_DIFAR("15", "Vertical Line Array Directional Frequency Analysis and Recording (DIFAR)", ControlMeasureEntityType.SONOBUOY, IconType.MAIN),
    ELECTRONIC("01", "Electronic", ControlMeasureEntityType.BEARING_LINE, IconType.MAIN),
    ELECTRONIC_WARFARE_EW("02", "Electronic Warfare (EW)", ControlMeasureEntityType.BEARING_LINE, IconType.MAIN),
    ACOUSTIC("03", "Acoustic", ControlMeasureEntityType.BEARING_LINE, IconType.MAIN),
    ACOUSTIC_AMBIGUOUS("04", "Acoustic (Ambiguous)", ControlMeasureEntityType.BEARING_LINE, IconType.MAIN),
    TORPEDO("05", "Torpedo", ControlMeasureEntityType.BEARING_LINE, IconType.MAIN),
    ELECTRO_OPTICAL_INTERCEPT("06", "Electro-Optical Intercept", ControlMeasureEntityType.BEARING_LINE, IconType.MAIN),
    JAMMER("07", "Jammer", ControlMeasureEntityType.BEARING_LINE, IconType.MAIN),
    RADIO_DIRECTION_FINDER_RDF("08", "Radio Direction Finder (RDF)", ControlMeasureEntityType.BEARING_LINE, IconType.MAIN),
    ACA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.AIRSPACE_COORDINATION_AREA, IconType.MAIN),
    ACA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.AIRSPACE_COORDINATION_AREA, IconType.MAIN),
    ACA_CIRCULAR("03", "Circular", ControlMeasureEntityType.AIRSPACE_COORDINATION_AREA, IconType.MAIN),
    FFA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.FREE_FIRE_AREA, IconType.MAIN),
    FFA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.FREE_FIRE_AREA, IconType.MAIN),
    FFA_CIRCULAR("03", "Circular", ControlMeasureEntityType.FREE_FIRE_AREA, IconType.MAIN),
    NFA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.NO_FIRE_AREA, IconType.MAIN),
    NFA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.NO_FIRE_AREA, IconType.MAIN),
    NFA_CIRCULAR("03", "Circular", ControlMeasureEntityType.NO_FIRE_AREA, IconType.MAIN),
    RFA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.RESTRICTED_FIRE_AREA, IconType.MAIN),
    RFA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.RESTRICTED_FIRE_AREA, IconType.MAIN),
    RFA_CIRCULAR("03", "Circular", ControlMeasureEntityType.RESTRICTED_FIRE_AREA, IconType.MAIN),
    PAA_RECTANGULAR("01", "Rectangular", ControlMeasureEntityType.POSITION_AREA_FOR_ARTILLERY_PAA, IconType.MAIN),
    PAA_CIRCULAR("02", "Circular", ControlMeasureEntityType.POSITION_AREA_FOR_ARTILLERY_PAA, IconType.MAIN),
    POINT_SINGLE_TARGET("01", "Point or Single Target", ControlMeasureEntityType.POINT_TARGETS, IconType.MAIN),
    NUCLEAR_TARGET("02", "Nuclear Target", ControlMeasureEntityType.POINT_TARGETS, IconType.MAIN),
    TARGET_RECORDED("03", "Target-Recorded", ControlMeasureEntityType.POINT_TARGETS, IconType.MAIN),
    LINEAR_TARGET("01", "Linear Target", ControlMeasureEntityType.LINEAR_TARGETS, IconType.MAIN),
    LINEAR_SMOKE_TARGET("02", "Linear Smoke Target", ControlMeasureEntityType.LINEAR_TARGETS, IconType.MAIN),
    FINAL_PROTECTIVE_FIRE_FPF("03", "Final Protective Fire (FPF)", ControlMeasureEntityType.LINEAR_TARGETS, IconType.MAIN),
    AREA_TARGET("01", "Area Target", ControlMeasureEntityType.AREA_TARGETS, IconType.MAIN),
    RECTANGULAR_TARGET("02", "Rectangular Target", ControlMeasureEntityType.AREA_TARGETS, IconType.MAIN),
    CIRCULAR_TARGET("03", "Circular Target", ControlMeasureEntityType.AREA_TARGETS, IconType.MAIN),
    RECTANGULAR_TARGET_SINGLE_TARGET("04", "Rectangular Target - Single Target", ControlMeasureEntityType.AREA_TARGETS, IconType.MAIN),
    SERIES_GROUP_TARGETS("05", "Series of Targets", ControlMeasureEntityType.AREA_TARGETS, IconType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25240805.a";
        }
    },
    SMOKE_TARGET("06", "Smoke Target", ControlMeasureEntityType.AREA_TARGETS, IconType.MAIN),
    SMOKE_PLANNED_ON_ORDER("07", "Smoke Planned or On Order", ControlMeasureEntityType.AREA_TARGETS, IconType.MAIN),
    BOMB_AREA("08", "Bomb Area", ControlMeasureEntityType.AREA_TARGETS, IconType.MAIN),
    FSA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.FIRE_SUPPORT_AREA, IconType.MAIN),
    FSA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.FIRE_SUPPORT_AREA, IconType.MAIN),
    FSA_CIRCULAR("03", "Circular", ControlMeasureEntityType.FIRE_SUPPORT_AREA, IconType.MAIN),
    ATI_IRREGULAR("01", "Irregular", ControlMeasureEntityType.ARTILLERY_TARGET_INTELLIGENCE_ZONE, IconType.MAIN),
    ATI_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.ARTILLERY_TARGET_INTELLIGENCE_ZONE, IconType.MAIN),
    ATI_CIRCULAR("03", "Circular", ControlMeasureEntityType.ARTILLERY_TARGET_INTELLIGENCE_ZONE, IconType.MAIN),
    CFFZ_IRREGULAR("01", "Irregular", ControlMeasureEntityType.CALL_FOR_FIRE_AREA, IconType.MAIN),
    CFFZ_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.CALL_FOR_FIRE_AREA, IconType.MAIN),
    CFFZ_CIRCULAR("03", "Circular", ControlMeasureEntityType.CALL_FOR_FIRE_AREA, IconType.MAIN),
    CENSOR_IRREGULAR("01", "Irregular", ControlMeasureEntityType.CENSOR_ZONE, IconType.MAIN),
    CENSOR_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.CENSOR_ZONE, IconType.MAIN),
    CENSOR_CIRCULAR("03", "Circular", ControlMeasureEntityType.CENSOR_ZONE, IconType.MAIN),
    CFZ_IRREGULAR("01", "Irregular", ControlMeasureEntityType.CRITICAL_FRIENDLY_ZONE, IconType.MAIN),
    CFZ_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.CRITICAL_FRIENDLY_ZONE, IconType.MAIN),
    CFZ_CIRCULAR("03", "Circular", ControlMeasureEntityType.CRITICAL_FRIENDLY_ZONE, IconType.MAIN),
    DA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.DEAD_SPACE_AREA, IconType.MAIN),
    DA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.DEAD_SPACE_AREA, IconType.MAIN),
    DA_CIRCULAR("03", "Circular", ControlMeasureEntityType.DEAD_SPACE_AREA, IconType.MAIN),
    SENSOR_ZONE_IRREGULAR("01", "Irregular", ControlMeasureEntityType.SENSOR_ZONE, IconType.MAIN),
    SENSOR_ZONE_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.SENSOR_ZONE, IconType.MAIN),
    SENSOR_ZONE_CIRCULAR("03", "Circular", ControlMeasureEntityType.SENSOR_ZONE, IconType.MAIN),
    TBA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.TARGET_BUILD_UP_AREA, IconType.MAIN),
    TBA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.TARGET_BUILD_UP_AREA, IconType.MAIN),
    TBA_CIRCULAR("03", "Circular", ControlMeasureEntityType.TARGET_BUILD_UP_AREA, IconType.MAIN),
    TVAR_IRREGULAR("01", "Irregular", ControlMeasureEntityType.TARGET_VALUE_AREA, IconType.MAIN),
    TVAR_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.TARGET_VALUE_AREA, IconType.MAIN),
    TVAR_CIRCULAR("03", "Circular", ControlMeasureEntityType.TARGET_VALUE_AREA, IconType.MAIN),
    ZOR_IRREGULAR("01", "Irregular", ControlMeasureEntityType.ZONE_OF_RESPONSIBILITY, IconType.MAIN),
    ZOR_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.ZONE_OF_RESPONSIBILITY, IconType.MAIN),
    ZOR_CIRCULAR("03", "Circular", ControlMeasureEntityType.ZONE_OF_RESPONSIBILITY, IconType.MAIN),
    BKB_IRREGULAR_BLUE("01", "Irregular-Blue", ControlMeasureEntityType.KILL_BOX, IconType.MAIN),
    BKB_RECTANGULAR_BLUE("02", "Rectangular-Blue", ControlMeasureEntityType.KILL_BOX, IconType.MAIN),
    BKB_CIRCULAR_BLUE("03", "Circular-Blue", ControlMeasureEntityType.KILL_BOX, IconType.MAIN),
    PKB_IRREGULAR_PURPLE("04", "Irregular-Purple", ControlMeasureEntityType.KILL_BOX, IconType.MAIN),
    PKB_RECTANGULAR_PURPLE("05", "Rectangular-Purple", ControlMeasureEntityType.KILL_BOX, IconType.MAIN),
    PKB_CIRCULAR_PURPLE("06", "Circular-Purple", ControlMeasureEntityType.KILL_BOX, IconType.MAIN),
    BLOCK("01", "Block", ControlMeasureEntityType.OBSTACLE_EFFECTS, IconType.MAIN),
    DISRUPT("02", "Disrupt", ControlMeasureEntityType.OBSTACLE_EFFECTS, IconType.MAIN),
    FIX("03", "Fix", ControlMeasureEntityType.OBSTACLE_EFFECTS, IconType.MAIN),
    TURN("04", "Turn", ControlMeasureEntityType.OBSTACLE_EFFECTS, IconType.MAIN),
    OBSTACLE_BYPASS_EASY("01", "Easy", ControlMeasureEntityType.OBSTACLE_BYPASS, IconType.MAIN),
    OBSTACLE_BYPASS_DIFFICULT("02", "Difficult", ControlMeasureEntityType.OBSTACLE_BYPASS, IconType.MAIN),
    OBSTACLE_BYPASS_IMPOSSIBLE("03", "Impossible", ControlMeasureEntityType.OBSTACLE_BYPASS, IconType.MAIN),
    MINEFIELD_COMPLETED("01", "Completed", ControlMeasureEntityType.MINEFIELD, IconType.MAIN),
    MINEFIELD_PLANNED("02", "Planned", ControlMeasureEntityType.MINEFIELD, IconType.MAIN),
    MINEFIELD_KNOWN_ENEMY("03", "Known Enemy", ControlMeasureEntityType.MINEFIELD, IconType.MAIN),
    MINEFIELD_SUSPECTED_OR_TEMPLATED_ENEMY("04", "Suspected or Templated Enemy", ControlMeasureEntityType.MINEFIELD, IconType.MAIN),
    MINEFIELD_DUMMY("05", "Dummy", ControlMeasureEntityType.MINEFIELD, IconType.MAIN),
    MINEFIELD_DUMMY_DYMANIC("06", "Dummy Minefield, Dymanic", ControlMeasureEntityType.MINEFIELD, IconType.MAIN),
    MINEFIELD_DYNAMIC_DEPICTION("07", "Dynamic Depiction", ControlMeasureEntityType.MINEFIELD, IconType.MAIN),
    FENCED("01", "Fenced", ControlMeasureEntityType.DECOY_MINED_AREA, IconType.MAIN),
    PLANNED("01", "Planned", ControlMeasureEntityType.ROADBLOCKS_CRATERS_BLOWN_BRIDGES, IconType.MAIN),
    EXPLOSIVES_STATE_OF_READINESS_1("02", "Explosives-State of Readiness 1 (Safe)", ControlMeasureEntityType.ROADBLOCKS_CRATERS_BLOWN_BRIDGES, IconType.MAIN),
    EXPLOSIVES_STATE_OF_READINESS_2("03", "Explosives-State of Readiness 2 (armed but passable)", ControlMeasureEntityType.ROADBLOCKS_CRATERS_BLOWN_BRIDGES, IconType.MAIN),
    ROADBLOCK_COMPLETE_EXECUTED("04", "Roadblock Complete (Executed)", ControlMeasureEntityType.ROADBLOCKS_CRATERS_BLOWN_BRIDGES, IconType.MAIN),
    BIO_TOXIC_INDUSTRIAL_MATERIAL("01", "Toxic Industrial Material", ControlMeasureEntityType.BIOLOGICAL_CONTAMINATED_AREA, IconType.MAIN),
    CHEM_TOXIC_INDUSTRIAL_MATERIAL("01", "Toxic Industrial Material", ControlMeasureEntityType.CHEMICAL_CONTAMINATED_AREA, IconType.MAIN),
    RAD_TOXIC_INDUSTRIAL_MATERIAL("01", "Toxic Industrial Material", ControlMeasureEntityType.RADIOLOGICAL_CONTAMINATED_AREA, IconType.MAIN),
    ANTIPERSONNEL_MINE_WITH_DIRECTIONAL_EFFECTS("01", "Antipersonnel Mine with Directional Effects", ControlMeasureEntityType.ANTIPERSONNEL_MINE, IconType.MAIN),
    CHEM_TOXIC_INDUSTRIAL_MATERIAL_POINT("01", "Toxic Industrial Material", ControlMeasureEntityType.CHEMICAL_EVENT, IconType.MAIN),
    BIO_TOXIC_INDUSTRIAL_MATERIAL_POINT("01", "Toxic Industrial Material", ControlMeasureEntityType.BIOLOGICAL_EVENT, IconType.MAIN),
    RAD_TOXIC_INDUSTRIAL_MATERIAL_POINT("01", "Toxic Industrial Material", ControlMeasureEntityType.RADIOLOGICAL, IconType.MAIN),
    DECON_ALTERNATE("01", "Alternate", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    DECON_EQUIPMENT("02", "Equipment", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    DECON_TROOP("03", "Troop", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    DECON_EQUIPMENT_TROOP("04", "Equipment/Troop", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    DECON_OPERATIONAL("05", "Operational", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    DECON_THOROUGH("06", "Thorough", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    DECON_MAIN_EQUIPMENT("07", "Main Equipment", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    DECON_FORWARD_TROOP("08", "Forward Troop", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    DECON_WOUNDED_PERSONNEL("09", "Wounded Personnel", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, IconType.MAIN),
    FIXED_PREFABRICATED("01", "Fixed and Prefabricated", ControlMeasureEntityType.OTHER_SIMILAR_OBSTACLES, IconType.MAIN),
    MOVABLE("02", "Movable", ControlMeasureEntityType.OTHER_SIMILAR_OBSTACLES, IconType.MAIN),
    MOVABLE_PREFABRICATED("03", "Movable and Prefabricated", ControlMeasureEntityType.OTHER_SIMILAR_OBSTACLES, IconType.MAIN),
    TOWER_LOW("01", "Tower-Low", ControlMeasureEntityType.VERTICAL_OBSTRUCTIONS, IconType.MAIN),
    TOWER_HIGH("02", "Tower-High", ControlMeasureEntityType.VERTICAL_OBSTRUCTIONS, IconType.MAIN),
    OVERHEAD_WIRE("03", "Overhead Wire", ControlMeasureEntityType.VERTICAL_OBSTRUCTIONS, IconType.MAIN),
    AT_UNDER_CONSTRUCTION("01", "Under Construction", ControlMeasureEntityType.ANTITANK_OBSTACLES, IconType.MAIN),
    AT_COMPLETED("02", "Completed", ControlMeasureEntityType.ANTITANK_OBSTACLES, IconType.MAIN),
    AT_REINFORCED_WITH_MINES("03", "Reinforced-with Antitank Mines", ControlMeasureEntityType.ANTITANK_OBSTACLES, IconType.MAIN),
    AT_ANTITANK_WALL("04", "Antitank Wall", ControlMeasureEntityType.ANTITANK_OBSTACLES, IconType.MAIN),
    UNSPECIFIED_WIRE("01", "Unspecified Wire", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    SINGLE_FENCE_WIRE("02", "Single Fence Wire", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    DOUBLE_FENCE_WIRE("03", "Double Fence Wire", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    DOUBLE_APRON_FENCE("04", "Double Apron Fence", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    LOW_WIRE_FENCE("05", "Low Wire Fence", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    HIGH_WIRE_FENCE("06", "High Wire Fence", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    SINGLE_CONCERTINA("07", "Single Concertina", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    DOUBLE_STRAND_CONCERTINA("08", "Double Strand Concertina", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    TRIPLE_STRAND_CONCERTINA("09", "Triple Strand Concertina", ControlMeasureEntityType.WIRE_OBSTACLES, IconType.MAIN),
    NATO_CLASS_1_SUPPLY_POINT("01", "NATO Class I Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    NATO_CLASS_2_SUPPLY_POINT("02", "NATO Class II Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    NATO_CLASS_3_SUPPLY_POINT("03", "NATO Class III Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    NATO_CLASS_4_SUPPLY_POINT("04", "NATO Class IV Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    NATO_CLASS_5_SUPPLY_POINT("05", "NATO Class V Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    NATO_MULTIPLE_CLASS_SUPPLY_POINT("06", "NATO Multiple Class Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_01_SUPPLY_POINT("07", "US Class I Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_02_SUPPLY_POINT("08", "US Class II Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_03_SUPPLY_POINT("09", "US Class III Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_04_SUPPLY_POINT("10", "US Class IV Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_05_SUPPLY_POINT("11", "US Class V Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_06_SUPPLY_POINT("12", "US Class VI Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_07_SUPPLY_POINT("13", "US Class VII Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_08_SUPPLY_POINT("14", "US Class VIII Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_09_SUPPLY_POINT("15", "US Class IX Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    US_CLASS_10_SUPPLY_POINT("16", "US Class X Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, IconType.MAIN),
    MSR_ONE_WAY_TRAFFIC("01", "One Way Traffic", ControlMeasureEntityType.MAIN_SUPPLY_ROUTE, IconType.MAIN),
    MSR_TWO_WAY_TRAFFIC("02", "Two Way Traffic", ControlMeasureEntityType.MAIN_SUPPLY_ROUTE, IconType.MAIN),
    MSR_ALTERNATING_TRAFFIC("03", "Alternating Traffic", ControlMeasureEntityType.MAIN_SUPPLY_ROUTE, IconType.MAIN),
    ASR_ONE_WAY_TRAFFIC("01", "One Way Traffic", ControlMeasureEntityType.ALTERNATE_SUPPLY_ROUTE, IconType.MAIN),
    ASR_TWO_WAY_TRAFFIC("02", "Two Way Traffic", ControlMeasureEntityType.ALTERNATE_SUPPLY_ROUTE, IconType.MAIN),
    ASR_ALTERNATING_TRAFFIC("03", "Alternating Traffic", ControlMeasureEntityType.ALTERNATE_SUPPLY_ROUTE, IconType.MAIN),
    TMT_COVER("01", "Cover", ControlMeasureEntityType.SECURITY, IconType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25342201.b";
        }
    },
    TMT_GUARD("02", "Guard", ControlMeasureEntityType.SECURITY, IconType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25342202.b";
        }
    },
    TMT_SCREEN("03", "Screen", ControlMeasureEntityType.SECURITY, IconType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25342203.b";
        }
    };

    private final String id;
    private final String label;
    private final ControlMeasureEntityType entityType;
    private final IconType iconType;
    
    private ControlMeasureEntitySubType(String id, String label, ControlMeasureEntityType entityType, IconType iconType) {
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