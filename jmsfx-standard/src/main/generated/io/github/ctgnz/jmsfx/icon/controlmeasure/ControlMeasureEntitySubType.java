package io.github.ctgnz.jmsfx.icon.controlmeasure;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum ControlMeasureEntitySubType implements IEntitySubType {
    FLY_TO_POINT_SONOBUOY("01", "Fly-To-Point (Sonobuoy)", ControlMeasureEntityType.FLY_TO_POINT, GraphicType.MAIN),
    FLY_TO_POINT_WEAPON("02", "Fly-To-Point (Weapon)", ControlMeasureEntityType.FLY_TO_POINT, GraphicType.MAIN),
    FLY_TO_POINT_NORMAL("03", "Fly-To-Point (Normal)", ControlMeasureEntityType.FLY_TO_POINT, GraphicType.MAIN),
    POI_LAUNCH_EVENT("01", "Launch Event (Point of Interest)", ControlMeasureEntityType.POINT_OF_INTEREST, GraphicType.MAIN),
    FRIENDLY_AVIATION("01", "Friendly Aviation", ControlMeasureEntityType.DIRECTION_OF_ATTACK, GraphicType.MAIN),
    FRIENDLY_MAIN_ATTACK_DECISIVE("02", "Friendly Direction of Main Attack", ControlMeasureEntityType.DIRECTION_OF_ATTACK, GraphicType.MAIN),
    FRIENDLY_SUPPORTING_ATTACK("03", "Friendly Direction of Supporting Attack", ControlMeasureEntityType.DIRECTION_OF_ATTACK, GraphicType.MAIN),
    FEINT("05", "Feint", ControlMeasureEntityType.DIRECTION_OF_ATTACK, GraphicType.MAIN),
    JTAA("01", "Joint Tactical Action Area (JTAA)", ControlMeasureEntityType.ACTION_AREA, GraphicType.MAIN),
    SAA("02", "Submarine Action Area (SAA)", ControlMeasureEntityType.ACTION_AREA, GraphicType.MAIN),
    SGAA("03", "Submarine-Generated Action Area (SGAA)", ControlMeasureEntityType.ACTION_AREA, GraphicType.MAIN),
    PREPARED_BUT_NOT_OCCUPIED("02", "Battle Position - Prepared (P) but not Occupied", ControlMeasureEntityType.BATTLE_POSITION, GraphicType.MAIN),
    STRONG_POINT("03", "Strong Point", ControlMeasureEntityType.BATTLE_POSITION, GraphicType.MAIN),
    CONTAIN("04", "Contain", ControlMeasureEntityType.BATTLE_POSITION, GraphicType.MAIN),
    RETAIN("05", "Retain", ControlMeasureEntityType.BATTLE_POSITION, GraphicType.MAIN),
    AXIS_ADVANCE_FRIENDLY_AIRBORNE_AVIATION("01", "Friendly Airborne/Aviation", ControlMeasureEntityType.AXIS_ADVANCE, GraphicType.MAIN),
    AXIS_ADVANCE_ATTACK_HELICOPTER("02", "Attack Helicopter", ControlMeasureEntityType.AXIS_ADVANCE, GraphicType.MAIN),
    AXIS_ADVANCE_MAIN_ATTACK("03", "Main Attack", ControlMeasureEntityType.AXIS_ADVANCE, GraphicType.MAIN),
    AXIS_ADVANCE_SUPPORTING_ATTACK("04", "Supporting Attack", ControlMeasureEntityType.AXIS_ADVANCE, GraphicType.MAIN),
    AXIS_ADVANCE_FEINT("06", "Feint", ControlMeasureEntityType.AXIS_ADVANCE, GraphicType.MAIN),
    RECONNAISSANCE_OUTPOST("01", "Reconnaissance Outpost", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, GraphicType.MAIN),
    FORWARD_OBSERVER_OUTPOST("02", "Forward Observer Outpost", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, GraphicType.MAIN),
    CBRN_OBSERVATION_OUTPOST("03", "CBRN Observation Outpost", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, GraphicType.MAIN),
    SENSOR_OUTPOST_LISTENING_POST("04", "Sensor Outpost/Listening Post", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, GraphicType.MAIN),
    COMBAT_OUTPOST("05", "Combat Outpost", ControlMeasureEntityType.OBSERVATION_POST_OUTPOST_SPECIFIED, GraphicType.MAIN),
    LAUNCH_ELLIPSE_CIRCLE("01", "Ellipse/Circle", ControlMeasureEntityType.LAUNCH_AREA, GraphicType.MAIN),
    DEFEND_ELLIPSE_CIRCLE("01", "Ellipse/Circle", ControlMeasureEntityType.DEFENDED_AREA, GraphicType.MAIN),
    DEFEND_RECTANGLE("02", "Rectangle", ControlMeasureEntityType.DEFENDED_AREA, GraphicType.MAIN),
    SHIP_AOI_ELLIPSE_CIRCLE("01", "Ellipse/Circle", ControlMeasureEntityType.SHIP_AREA_OF_INTEREST, GraphicType.MAIN),
    SHIP_AOI_RECTANGLE("02", "Rectangle", ControlMeasureEntityType.SHIP_AREA_OF_INTEREST, GraphicType.MAIN),
    A("01", "A", ControlMeasureEntityType.HARBOR_ENTRANCE_POINT, GraphicType.MAIN),
    Q("02", "Q", ControlMeasureEntityType.HARBOR_ENTRANCE_POINT, GraphicType.MAIN),
    X("03", "X", ControlMeasureEntityType.HARBOR_ENTRANCE_POINT, GraphicType.MAIN),
    Y("04", "Y", ControlMeasureEntityType.HARBOR_ENTRANCE_POINT, GraphicType.MAIN),
    AMBIENT_NOISE("01", "Ambient Noise", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    AIR_TRANSPORTABLE_COMMUNICATION("02", "Air Transportable Communication", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    BARRA("03", "Barra", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    BATHYTHERMOGRAPH_TRANSMITTING("04", "Bathythermograph Transmitting", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    CAMBS("05", "Command Active Multi-Beam (CAMBS)", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    CASS("06", "Command Active Sonobuoy Directional Command Active Sonobuoy System (CASS)", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    DIFAR("07", "Digital Frequency Analysis and Recording (DIFAR)", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    DICASS("08", "Directional Command Active Sonobuoy System (DICASS)", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    ERAPS("09", "Expendable Reliable Acoustic Path Sonobuoy (ERAPS)", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    EXPIRED("10", "Expired", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    KINGPIN("11", "Kingpin", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    LOFAR("12", "Low Frequency Analysis and Recording (LOFAR)", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    PATTERN_CENTER("13", "Pattern Center", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    RANGE_ONLY("14", "Range Only", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    VERTICAL_LINE_ARRAY_DIRECTIONAL_FREQUENCY_ANALYSIS_RECORDING_DIFAR("15", "Vertical Line Array Directional Frequency Analysis and Recording (DIFAR)", ControlMeasureEntityType.SONOBUOY, GraphicType.MAIN),
    ELECTRONIC("01", "Electronic", ControlMeasureEntityType.BEARING_LINE, GraphicType.MAIN),
    ELECTRONIC_WARFARE_EW("02", "Electronic Warfare (EW)", ControlMeasureEntityType.BEARING_LINE, GraphicType.MAIN),
    ACOUSTIC("03", "Acoustic", ControlMeasureEntityType.BEARING_LINE, GraphicType.MAIN),
    ACOUSTIC_AMBIGUOUS("04", "Acoustic (Ambiguous)", ControlMeasureEntityType.BEARING_LINE, GraphicType.MAIN),
    TORPEDO("05", "Torpedo", ControlMeasureEntityType.BEARING_LINE, GraphicType.MAIN),
    ELECTRO_OPTICAL_INTERCEPT("06", "Electro-Optical Intercept", ControlMeasureEntityType.BEARING_LINE, GraphicType.MAIN),
    JAMMER("07", "Jammer", ControlMeasureEntityType.BEARING_LINE, GraphicType.MAIN),
    RADIO_DIRECTION_FINDER_RDF("08", "Radio Direction Finder (RDF)", ControlMeasureEntityType.BEARING_LINE, GraphicType.MAIN),
    ACA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.AIRSPACE_COORDINATION_AREA, GraphicType.MAIN),
    ACA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.AIRSPACE_COORDINATION_AREA, GraphicType.MAIN),
    ACA_CIRCULAR("03", "Circular", ControlMeasureEntityType.AIRSPACE_COORDINATION_AREA, GraphicType.MAIN),
    FFA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.FREE_FIRE_AREA, GraphicType.MAIN),
    FFA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.FREE_FIRE_AREA, GraphicType.MAIN),
    FFA_CIRCULAR("03", "Circular", ControlMeasureEntityType.FREE_FIRE_AREA, GraphicType.MAIN),
    NFA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.NO_FIRE_AREA, GraphicType.MAIN),
    NFA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.NO_FIRE_AREA, GraphicType.MAIN),
    NFA_CIRCULAR("03", "Circular", ControlMeasureEntityType.NO_FIRE_AREA, GraphicType.MAIN),
    RFA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.RESTRICTED_FIRE_AREA, GraphicType.MAIN),
    RFA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.RESTRICTED_FIRE_AREA, GraphicType.MAIN),
    RFA_CIRCULAR("03", "Circular", ControlMeasureEntityType.RESTRICTED_FIRE_AREA, GraphicType.MAIN),
    PAA_RECTANGULAR("01", "Rectangular", ControlMeasureEntityType.POSITION_AREA_FOR_ARTILLERY_PAA, GraphicType.MAIN),
    PAA_CIRCULAR("02", "Circular", ControlMeasureEntityType.POSITION_AREA_FOR_ARTILLERY_PAA, GraphicType.MAIN),
    PAA_IRREGULAR("03", "Irregular", ControlMeasureEntityType.POSITION_AREA_FOR_ARTILLERY_PAA, GraphicType.MAIN),
    POINT_SINGLE_TARGET("01", "Point or Single Target", ControlMeasureEntityType.POINT_TARGETS, GraphicType.MAIN),
    NUCLEAR_TARGET("02", "Nuclear Target", ControlMeasureEntityType.POINT_TARGETS, GraphicType.MAIN),
    TARGET_RECORDED("03", "Target-Recorded", ControlMeasureEntityType.POINT_TARGETS, GraphicType.MAIN),
    LINEAR_TARGET("01", "Linear Target", ControlMeasureEntityType.LINEAR_TARGETS, GraphicType.MAIN),
    LINEAR_SMOKE_TARGET("02", "Linear Smoke Target", ControlMeasureEntityType.LINEAR_TARGETS, GraphicType.MAIN),
    FINAL_PROTECTIVE_FIRE_FPF("03", "Final Protective Fire (FPF)", ControlMeasureEntityType.LINEAR_TARGETS, GraphicType.MAIN),
    AREA_TARGET("01", "Area Target", ControlMeasureEntityType.AREA_TARGETS, GraphicType.MAIN),
    RECTANGULAR_TARGET("02", "Rectangular Target", ControlMeasureEntityType.AREA_TARGETS, GraphicType.MAIN),
    CIRCULAR_TARGET("03", "Circular Target", ControlMeasureEntityType.AREA_TARGETS, GraphicType.MAIN),
    RECTANGULAR_TARGET_SINGLE_TARGET("04", "Rectangular Target - Single Target", ControlMeasureEntityType.AREA_TARGETS, GraphicType.MAIN),
    SERIES_GROUP_TARGETS("05", "Series of Targets", ControlMeasureEntityType.AREA_TARGETS, GraphicType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25240805.a";
        }
    },
    SMOKE_TARGET("06", "Smoke Target", ControlMeasureEntityType.AREA_TARGETS, GraphicType.MAIN),
    BOMB_AREA("08", "Bomb Area", ControlMeasureEntityType.AREA_TARGETS, GraphicType.MAIN),
    FSA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.FIRE_SUPPORT_AREA, GraphicType.MAIN),
    FSA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.FIRE_SUPPORT_AREA, GraphicType.MAIN),
    FSA_CIRCULAR("03", "Circular", ControlMeasureEntityType.FIRE_SUPPORT_AREA, GraphicType.MAIN),
    ATI_IRREGULAR("01", "Irregular", ControlMeasureEntityType.ARTILLERY_TARGET_INTELLIGENCE_ZONE, GraphicType.MAIN),
    ATI_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.ARTILLERY_TARGET_INTELLIGENCE_ZONE, GraphicType.MAIN),
    ATI_CIRCULAR("03", "Circular", ControlMeasureEntityType.ARTILLERY_TARGET_INTELLIGENCE_ZONE, GraphicType.MAIN),
    CFFZ_IRREGULAR("01", "Irregular", ControlMeasureEntityType.CALL_FOR_FIRE_AREA, GraphicType.MAIN),
    CFFZ_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.CALL_FOR_FIRE_AREA, GraphicType.MAIN),
    CFFZ_CIRCULAR("03", "Circular", ControlMeasureEntityType.CALL_FOR_FIRE_AREA, GraphicType.MAIN),
    CENSOR_IRREGULAR("01", "Irregular", ControlMeasureEntityType.CENSOR_ZONE, GraphicType.MAIN),
    CENSOR_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.CENSOR_ZONE, GraphicType.MAIN),
    CENSOR_CIRCULAR("03", "Circular", ControlMeasureEntityType.CENSOR_ZONE, GraphicType.MAIN),
    CFZ_IRREGULAR("01", "Irregular", ControlMeasureEntityType.CRITICAL_FRIENDLY_ZONE, GraphicType.MAIN),
    CFZ_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.CRITICAL_FRIENDLY_ZONE, GraphicType.MAIN),
    CFZ_CIRCULAR("03", "Circular", ControlMeasureEntityType.CRITICAL_FRIENDLY_ZONE, GraphicType.MAIN),
    DA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.DEAD_SPACE_AREA, GraphicType.MAIN),
    DA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.DEAD_SPACE_AREA, GraphicType.MAIN),
    DA_CIRCULAR("03", "Circular", ControlMeasureEntityType.DEAD_SPACE_AREA, GraphicType.MAIN),
    TBA_IRREGULAR("01", "Irregular", ControlMeasureEntityType.TARGET_BUILD_UP_AREA, GraphicType.MAIN),
    TBA_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.TARGET_BUILD_UP_AREA, GraphicType.MAIN),
    TBA_CIRCULAR("03", "Circular", ControlMeasureEntityType.TARGET_BUILD_UP_AREA, GraphicType.MAIN),
    TVAR_IRREGULAR("01", "Irregular", ControlMeasureEntityType.TARGET_VALUE_AREA, GraphicType.MAIN),
    TVAR_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.TARGET_VALUE_AREA, GraphicType.MAIN),
    TVAR_CIRCULAR("03", "Circular", ControlMeasureEntityType.TARGET_VALUE_AREA, GraphicType.MAIN),
    ZOR_IRREGULAR("01", "Irregular", ControlMeasureEntityType.ZONE_OF_RESPONSIBILITY, GraphicType.MAIN),
    ZOR_RECTANGULAR("02", "Rectangular", ControlMeasureEntityType.ZONE_OF_RESPONSIBILITY, GraphicType.MAIN),
    ZOR_CIRCULAR("03", "Circular", ControlMeasureEntityType.ZONE_OF_RESPONSIBILITY, GraphicType.MAIN),
    BKB_IRREGULAR_BLUE("01", "Irregular-Blue", ControlMeasureEntityType.KILL_BOX, GraphicType.MAIN),
    BKB_RECTANGULAR_BLUE("02", "Rectangular-Blue", ControlMeasureEntityType.KILL_BOX, GraphicType.MAIN),
    BKB_CIRCULAR_BLUE("03", "Circular-Blue", ControlMeasureEntityType.KILL_BOX, GraphicType.MAIN),
    PKB_IRREGULAR_PURPLE("04", "Irregular-Purple", ControlMeasureEntityType.KILL_BOX, GraphicType.MAIN),
    PKB_RECTANGULAR_PURPLE("05", "Rectangular-Purple", ControlMeasureEntityType.KILL_BOX, GraphicType.MAIN),
    PKB_CIRCULAR_PURPLE("06", "Circular-Purple", ControlMeasureEntityType.KILL_BOX, GraphicType.MAIN),
    BLOCK("01", "Block", ControlMeasureEntityType.OBSTACLE_EFFECTS, GraphicType.MAIN),
    DISRUPT("02", "Disrupt", ControlMeasureEntityType.OBSTACLE_EFFECTS, GraphicType.MAIN),
    FIX("03", "Fix", ControlMeasureEntityType.OBSTACLE_EFFECTS, GraphicType.MAIN),
    TURN("04", "Turn", ControlMeasureEntityType.OBSTACLE_EFFECTS, GraphicType.MAIN),
    OBSTACLE_BYPASS_EASY("01", "Easy", ControlMeasureEntityType.OBSTACLE_BYPASS, GraphicType.MAIN),
    OBSTACLE_BYPASS_DIFFICULT("02", "Difficult", ControlMeasureEntityType.OBSTACLE_BYPASS, GraphicType.MAIN),
    OBSTACLE_BYPASS_IMPOSSIBLE("03", "Impossible", ControlMeasureEntityType.OBSTACLE_BYPASS, GraphicType.MAIN),
    MINEFIELD_COMPLETED("01", "Completed", ControlMeasureEntityType.MINEFIELD, GraphicType.MAIN),
    MINEFIELD_DYNAMIC_DEPICTION("07", "Dynamic Depiction", ControlMeasureEntityType.MINEFIELD, GraphicType.MAIN),
    MINED_AREA_FENCED("01", "Mined Area, Fenced", ControlMeasureEntityType.MINED_AREA, GraphicType.MAIN),
    PLANNED("01", "Planned", ControlMeasureEntityType.ROADBLOCKS_CRATERS_BLOWN_BRIDGES, GraphicType.MAIN),
    EXPLOSIVES_STATE_OF_READINESS_1("02", "Explosives-State of Readiness 1 (Safe)", ControlMeasureEntityType.ROADBLOCKS_CRATERS_BLOWN_BRIDGES, GraphicType.MAIN),
    EXPLOSIVES_STATE_OF_READINESS_2("03", "Explosives-State of Readiness 2 (armed but passable)", ControlMeasureEntityType.ROADBLOCKS_CRATERS_BLOWN_BRIDGES, GraphicType.MAIN),
    ROADBLOCK_COMPLETE_EXECUTED("04", "Roadblock Complete (Executed)", ControlMeasureEntityType.ROADBLOCKS_CRATERS_BLOWN_BRIDGES, GraphicType.MAIN),
    BIO_TOXIC_INDUSTRIAL_MATERIAL("01", "Toxic Industrial Material", ControlMeasureEntityType.BIOLOGICAL_CONTAMINATED_AREA, GraphicType.MAIN),
    CHEM_TOXIC_INDUSTRIAL_MATERIAL("01", "Toxic Industrial Material", ControlMeasureEntityType.CHEMICAL_CONTAMINATED_AREA, GraphicType.MAIN),
    RAD_TOXIC_INDUSTRIAL_MATERIAL("01", "Toxic Industrial Material", ControlMeasureEntityType.RADIOLOGICAL_CONTAMINATED_AREA, GraphicType.MAIN),
    MULTIPLE_STRIKE("01", "Multiple Strike", ControlMeasureEntityType.MINIMUM_SAFE_DISTANCE_ZONE, GraphicType.MAIN),
    ANTIPERSONNEL_MINE_WITH_DIRECTIONAL_EFFECTS("01", "Antipersonnel Mine with Directional Effects", ControlMeasureEntityType.ANTIPERSONNEL_MINE, GraphicType.MAIN),
    CHEM_TOXIC_INDUSTRIAL_MATERIAL_POINT("01", "Toxic Industrial Material", ControlMeasureEntityType.CHEMICAL_EVENT, GraphicType.MAIN),
    BIO_TOXIC_INDUSTRIAL_MATERIAL_POINT("01", "Toxic Industrial Material", ControlMeasureEntityType.BIOLOGICAL_EVENT, GraphicType.MAIN),
    RAD_TOXIC_INDUSTRIAL_MATERIAL_POINT("01", "Toxic Industrial Material", ControlMeasureEntityType.RADIOLOGICAL, GraphicType.MAIN),
    DECON_ALTERNATE("01", "Alternate", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    DECON_EQUIPMENT("02", "Equipment", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    DECON_TROOP("03", "Troop", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    DECON_EQUIPMENT_TROOP("04", "Equipment/Troop", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    DECON_OPERATIONAL("05", "Operational", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    DECON_THOROUGH("06", "Thorough", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    DECON_MAIN_EQUIPMENT("07", "Main Equipment", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    DECON_FORWARD_TROOP("08", "Forward Troop", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    DECON_WOUNDED_PERSONNEL("09", "Wounded Personnel", ControlMeasureEntityType.GENERAL_DECONTAMINATION_POINT_SITE, GraphicType.MAIN),
    FIXED_PREFABRICATED("01", "Fixed and Prefabricated", ControlMeasureEntityType.OTHER_SIMILAR_OBSTACLES, GraphicType.MAIN),
    MOVABLE("02", "Movable", ControlMeasureEntityType.OTHER_SIMILAR_OBSTACLES, GraphicType.MAIN),
    MOVABLE_PREFABRICATED("03", "Movable and Prefabricated", ControlMeasureEntityType.OTHER_SIMILAR_OBSTACLES, GraphicType.MAIN),
    TOWER_LOW("01", "Tower-Low", ControlMeasureEntityType.VERTICAL_OBSTRUCTIONS, GraphicType.MAIN),
    TOWER_HIGH("02", "Tower-High", ControlMeasureEntityType.VERTICAL_OBSTRUCTIONS, GraphicType.MAIN),
    OVERHEAD_WIRE("03", "Overhead Wire", ControlMeasureEntityType.VERTICAL_OBSTRUCTIONS, GraphicType.MAIN),
    MINE_LINE("01", "Mineline", ControlMeasureEntityType.OBSTACLE_LINE, GraphicType.MAIN),
    AT_UNDER_CONSTRUCTION("01", "Under Construction", ControlMeasureEntityType.ANTITANK_OBSTACLES, GraphicType.MAIN),
    AT_COMPLETED("02", "Completed", ControlMeasureEntityType.ANTITANK_OBSTACLES, GraphicType.MAIN),
    AT_REINFORCED_WITH_MINES("03", "Reinforced-with Antitank Mines", ControlMeasureEntityType.ANTITANK_OBSTACLES, GraphicType.MAIN),
    AT_ANTITANK_WALL("04", "Antitank Wall", ControlMeasureEntityType.ANTITANK_OBSTACLES, GraphicType.MAIN),
    UNSPECIFIED_WIRE("01", "Unspecified Wire", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    SINGLE_FENCE_WIRE("02", "Single Fence Wire", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    DOUBLE_FENCE_WIRE("03", "Double Fence Wire", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    DOUBLE_APRON_FENCE("04", "Double Apron Fence", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    LOW_WIRE_FENCE("05", "Low Wire Fence", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    HIGH_WIRE_FENCE("06", "High Wire Fence", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    SINGLE_CONCERTINA("07", "Single Concertina", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    DOUBLE_STRAND_CONCERTINA("08", "Double Strand Concertina", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    TRIPLE_STRAND_CONCERTINA("09", "Triple Strand Concertina", ControlMeasureEntityType.WIRE_OBSTACLES, GraphicType.MAIN),
    AMBULANCE_EXCHANGE_POINT("01", "Ambulance Exchange Point", ControlMeasureEntityType.AMBULANCE_POINTS, GraphicType.MAIN),
    AMBULANCE_CONTROL_POINT("02", "Ambulance Control Point", ControlMeasureEntityType.AMBULANCE_POINTS, GraphicType.MAIN),
    AMBULANCE_LOAD_POINT("03", "Ambulance Load Point", ControlMeasureEntityType.AMBULANCE_POINTS, GraphicType.MAIN),
    AMBULANCE_RELAY_POINT("04", "Ambulance Relay Point", ControlMeasureEntityType.AMBULANCE_POINTS, GraphicType.MAIN),
    NATO_CLASS_1_SUPPLY_POINT("01", "NATO Class I Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    NATO_CLASS_2_SUPPLY_POINT("02", "NATO Class II Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    NATO_CLASS_3_SUPPLY_POINT("03", "NATO Class III Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    NATO_CLASS_4_SUPPLY_POINT("04", "NATO Class IV Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    NATO_CLASS_5_SUPPLY_POINT("05", "NATO Class V Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    NATO_MULTIPLE_CLASS_SUPPLY_POINT("06", "NATO Multiple Class Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_01_SUPPLY_POINT("07", "US Class I Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_02_SUPPLY_POINT("08", "US Class II Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_03_SUPPLY_POINT("09", "US Class III Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_04_SUPPLY_POINT("10", "US Class IV Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_05_SUPPLY_POINT("11", "US Class V Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_06_SUPPLY_POINT("12", "US Class VI Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_07_SUPPLY_POINT("13", "US Class VII Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_08_SUPPLY_POINT("14", "US Class VIII Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_09_SUPPLY_POINT("15", "US Class IX Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    US_CLASS_10_SUPPLY_POINT("16", "US Class X Supply Point", ControlMeasureEntityType.GENERAL_SUPPLY_POINT, GraphicType.MAIN),
    MSR_ONE_WAY_TRAFFIC("01", "One Way Traffic", ControlMeasureEntityType.MAIN_SUPPLY_ROUTE, GraphicType.MAIN),
    MSR_TWO_WAY_TRAFFIC("02", "Two Way Traffic", ControlMeasureEntityType.MAIN_SUPPLY_ROUTE, GraphicType.MAIN),
    MSR_ALTERNATING_TRAFFIC("03", "Alternating Traffic", ControlMeasureEntityType.MAIN_SUPPLY_ROUTE, GraphicType.MAIN),
    ASR_ONE_WAY_TRAFFIC("01", "One Way Traffic", ControlMeasureEntityType.ALTERNATE_SUPPLY_ROUTE, GraphicType.MAIN),
    ASR_TWO_WAY_TRAFFIC("02", "Two Way Traffic", ControlMeasureEntityType.ALTERNATE_SUPPLY_ROUTE, GraphicType.MAIN),
    ASR_ALTERNATING_TRAFFIC("03", "Alternating Traffic", ControlMeasureEntityType.ALTERNATE_SUPPLY_ROUTE, GraphicType.MAIN),
    ROUTE_ONE_WAY_TRAFFIC("01", "One Way Traffic", ControlMeasureEntityType.ROUTE, GraphicType.MAIN),
    ROUTE_ALTERNATING_TRAFFIC("02", "Alternating Traffic", ControlMeasureEntityType.ROUTE, GraphicType.MAIN),
    TMT_COVER("01", "Cover", ControlMeasureEntityType.SECURITY, GraphicType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25342201.b";
        }
    },
    TMT_GUARD("02", "Guard", ControlMeasureEntityType.SECURITY, GraphicType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25342202.b";
        }
    },
    TMT_SCREEN("03", "Screen", ControlMeasureEntityType.SECURITY, GraphicType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "25342203.b";
        }
    },
    HMSD_SMALL("01", "Human Made Space Debris, Small", ControlMeasureEntityType.HUMAN_MADE_SPACE_DEBRIS, GraphicType.MAIN),
    HMSD_MEDIUM("02", "Human Made Space Debris, Medium", ControlMeasureEntityType.HUMAN_MADE_SPACE_DEBRIS, GraphicType.MAIN),
    HMSD_BIG("03", "Human Made Space Debris, Big", ControlMeasureEntityType.HUMAN_MADE_SPACE_DEBRIS, GraphicType.MAIN),
    NSD_SMALL("01", "Natural Space Debris, Small", ControlMeasureEntityType.NATURAL_SPACE_DEBRIS, GraphicType.MAIN),
    NSD_MEDIUM("02", "Natural Space Debris, Medium", ControlMeasureEntityType.NATURAL_SPACE_DEBRIS, GraphicType.MAIN),
    NSD_BIG("03", "Natural Space Debris, Big", ControlMeasureEntityType.NATURAL_SPACE_DEBRIS, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final ControlMeasureEntityType entityType;
    private final GraphicType graphicType;

    ControlMeasureEntitySubType(String id, String label, ControlMeasureEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public IEntityType getEntityType() {
        return entityType;
    }

}