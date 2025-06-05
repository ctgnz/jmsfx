package io.github.ctgnz.jmsfx.icon;

import io.github.ctgnz.jmsfx.IAmplifier;

public enum Amplifier implements IAmplifier {
    A_SymbolIcon("A", "Symbol Icon", AmplifierType.GRAPHIC, "The innermost part of a symbol that represents a joint military object."),
    B_Echelon("B", "Echelon", AmplifierType.GRAPHIC, "A graphic amplifier in a unit symbol that identifies command level."),
    C_Quantity("C", "Quantity", AmplifierType.ALPHANUMERIC, 1, 19, "A text amplifier in an equipment symbol that identifies the number of items present."),
    D_TaskForceIndicator("D", "Task Force Indicator", AmplifierType.GRAPHIC, "A graphic amplifier that identifies a unit or stability operations symbol as a task force."),
    F_ReinforcedOrReduced("F", "Reinforced or Reduced", AmplifierType.LIST, 1, 1, "A text amplifier in a unit symbol that dispays (+) for reinforced, (-) for reduced, (±) for reinforced and reduced."),
    G_StaffComments("G", "Staff Comments", AmplifierType.ALPHANUMERIC, 1, 20, "A text amplifier for units, equipment, and installations."),
    H_AdditionalInformation("H", "Additional Information", AmplifierType.ALPHANUMERIC, 1, 20, "A text amplifier for units, equipment, and installations."),
    H1_UnlistedPointInformation("H1", "Unlisted Point Information", AmplifierType.ALPHANUMERIC, 1, 3, "A text amplifier used to provide an up to a three-character letter field acronym to describe a point that is not already listed."),
    J_EvaluationRating("J", "Evaluation Rating", AmplifierType.LIST, 2, 2, "A text amplifier for units, equipment and installations that consists of a one-letter reliability rating and a one-number credibility rating."),
    K_CombatEffectiveness("K", "Combat Effectiveness", AmplifierType.LIST, 2, 3, "A text amplifier for units and installations that indicates unit effectiveness or installation capability."),
    L_SignatureEquipment("L", "Signature Equipment", AmplifierType.ALPHANUMERIC, 1, 1, "A text amplifier for hostile equipment, '!' indicates detectable electronic signatures."),
    M_HigherFormation("M", "Higher Formation", AmplifierType.ALPHANUMERIC, 1, 21, "A text amplifier for units that indicates number or title of higher echelon command (corps are designated by Roman numerals)."),
    N_HostileEnemy("N", "Hostile (Enemy)", AmplifierType.GRAPHIC, "A text amplifier for equipment, letters 'ENY' denote hostile symbols."),
    P_IffSifAis("P", "IFF/SIF/AIS", AmplifierType.ALPHANUMERIC, 8, 17, "A text amplifier displaying IFF/SIF/AIS identification modes and codes."),
    Q_DirectionOfMovementIndicator("Q", "Direction of Movement Indicator", AmplifierType.GRAPHIC, "A graphic amplifier for units and equipment that identifies the direction of movement or intended movement of an object."),
    R_MobilityIndicator("R", "Mobility Indicator", AmplifierType.GRAPHIC, "A graphic amplifier for units and equipment that identifies the direction of movement or intended movement of an object."),
    R2_SigintMobilityIndicator("R2", "SIGINT Mobility Indicator", AmplifierType.LIST, 1, 1, "M=Mobile, S=Static, or U=Uncertain"),
    S_HeadquartersStaffIndicator("S", "Headquarters Staff Indicator", AmplifierType.GRAPHIC, "A graphic amplifier for units, equipment and installations that identifies a unit as a headquarters."),
    S2_OffsetLocationIndicator("S2", "Offset Location Indicator", AmplifierType.GRAPHIC, "A graphic amplifier for units, equipment and installations used when placing an object away from its actual location."),
    T_UniqueDesignation("T", "Unique Designation", AmplifierType.ALPHANUMERIC, 1, 30, "A text amplifier for units, equipment and installations that uniquely identifies a particular symbol or track number."),
    T1_UniqueIdentifierPrimaryPurpose("T1", "Unique Identifier/Primary Purpose", AmplifierType.ALPHANUMERIC, 1, 30, "A text amplifier for units, equipment and installations that uniquely identifies a particular symbol or track number."),
    T2_ControllingHeadquarters("T2", "Controlling Headquarters", AmplifierType.ALPHANUMERIC, 1, 7, "An amplifier used to provide the designation of the Establishing Headquarters for Fire Support Control Measures only."),
    V_TypeOfEquipment("V", "Type of Equipment", AmplifierType.ALPHANUMERIC, 1, 24, "A text amplifier for equipment that indicates types of equipment."),
    W_DateTimeGroupDtg("W", "Date/Time Group (DTG)", AmplifierType.ALPHANUMERIC, 3, 16, "An alphanumeric designator for displaying a date-time group (DDHHMMSSZMONYYYY) or O/O for on order."),
    W1_DateTimeGroupDtgPeriod("W1", "Date/Time Group (DTG) (Period)", AmplifierType.ALPHANUMERIC, 3, 16, "An alphanumeric designator for displaying a date-time group (DDHHMMSSZMONYYYY) or O/O for on order."),
    X_AltitudeDepth("X", "Altitude/Depth", AmplifierType.ALPHANUMERIC, 2, 14, "A text amplifier for units, equipment, and installations that displays either altitude, flight level, depth for submerged objects."),
    Y_Location("Y", "Location", AmplifierType.ALPHANUMERIC, 12, 22, "A text amplifier for units, equipment, and installations that displays a symbol's location in degrees, minutes, and decimal minutes."),
    YP_SymbolReferencesPoints("YP", "Symbol References Points", AmplifierType.ALPHANUMERIC, 22, 22, "An exchange only amplifier that is repeated as YP, YP1, YP2 to represent the reference points of symbols. Note that these reference points are indicated as centre point, PT 1, PT 2, etc. in the symbol diagram templates and not as YP."),
    Z_Speed("Z", "Speed", AmplifierType.LIST, 5, 9, "A text amplifier for units and equipment that displays velocity as set forth in MIL-STD 6040."),
    AA_NamedC2Headquarters("AA", "Named C2 Headquarters", AmplifierType.ALPHANUMERIC, 1, 9, "A text modifier for units; indicator is contained inside the frame; contains the name of the special C2 Headquarters."),
    AB_FeintDummyIndicator("AB", "Feint/Dummy Indicator", AmplifierType.GRAPHIC, "A graphic amplifier for units, equipment and installations that identifies an offensive or defensive unit intended to draw the enemy's attention away from the area of the main attack."),
    AD_PlatformType("AD", "Platform Type", AmplifierType.LIST, 5, 5, "Electronic Intelligence Notation (ELNOT) or Communications Intelligence Notation (CENOT)"),
    AE_EquipmentTeardownTime("AE", "Equipment Teardown Time", AmplifierType.NUMERIC, 1, 3, "Equipment teardown time in minutes"),
    AF_CommonIdentifier("AF", "Common Identifier", AmplifierType.ALPHANUMERIC, 1, 12, "Example: 'Hawk' for Hawk SAM system"),
    AG_AuxiliaryEquipmentIndicator("AG", "Auxiliary Equipment Indicator", AmplifierType.GRAPHIC, "A graphic modifier for equipment that indicates the presence of a towed sonar array."),
    AH_AreaOfUncertaintyIndicator("AH", "Area of Uncertainty Indicator", AmplifierType.GRAPHIC, 1, 6, "A graphic modifier for units, equipment and installations that indicates the area where an object is most likely to be, based on the object's last report and the reporting accuracty of the sensor that detected the object."),
    AH1_AreaOfUncertaintyIndicatorLongitude("AH1", "Area of Uncertainty Indicator Longitude", AmplifierType.GRAPHIC, 1, 6, "If AH1 is defined, the value of AH is the latitude radius of uncertainty and AH1 is the longitude radius of uncertainty in metres."),
    AI_DeadReckoningTrailer("AI", "Dead Reckoning Trailer", AmplifierType.GRAPHIC, "A graphic amplifier for units and equipment that identifies where an object should be located at present, given its last reported course and speed."),
    AJ_SpeedLeader("AJ", "Speed Leader", AmplifierType.GRAPHIC, "A graphic amplifier for units, equipment and installations that depicts the speed and direction of movement of an object."),
    AK_PairingLine("AK", "Pairing Line", AmplifierType.GRAPHIC, "A graphic amplifier for units, equipment and installations that connects two objects and is updated dynamically as the positions of the objects change."),
    AL_OperationalCondition("AL", "Operational Condition", AmplifierType.GRAPHIC, "A graphic amplifier for equipment or installations that indicates operational condition or capacity."),
    AM_Distance("AM", "Distance", AmplifierType.ALPHANUMERIC, 3, 9, "A numeric amplifier that displays a minimum, maximum, or a specific distance (range, radius, width, length, etc.), in meters."),
    AN_Azimuth("AN", "Azimuth", AmplifierType.ALPHANUMERIC, 7, 8, "A numeric amplifier that displays an angle measured from true north to any other line in degrees."),
    AO_EngagementBar("AO", "Engagement Bar", AmplifierType.LIST, 6, 10, "An amplifier placed immediately atop the symbol. May denote, 1) local/remote status; 2) engagement status; and 3) weapon type. Format A:BBB-CC"),
    AO1_TargetDesignation("AO1", "Target Designation", AmplifierType.LIST, "An amplifier placed immediately atop the symbol. Indicates if the symbol is: Hostile Target/Hostile Non-Target/Expired"),
    AP_TargetNumber("AP", "Target Number", AmplifierType.ALPHANUMERIC, 6, 6, "A six character text modifier used in Fire Support operations to uniquely designate targets in accordance with STANAG 2484, where characters 1 and 2 are alphabetic, and characters 3-6 are numeric: AANNNN"),
    AP1_TargetNumberExtension("AP1", "Target Number Extension", AmplifierType.NUMERIC, 2, 3, "A 2-3 character amplifier. A target number extension is a sequentially assigned number identifying the individual elements in a target, where character 1 is a dash and characters 2-3 are numeric, from 1 through 15. It is applicable only to the Point or Single Target symbol and is conditional upon the presence of the Target Number amplifier and is visually displayed appended to the Target Number amplifier."),
    AQ_GuardedUnit("AQ", "Guarded Unit", AmplifierType.ALPHANUMERIC, 2, 2, "During ballistic missile defense, some tracks are designated as guarded by a particular unit."),
    AR_SpecialDesignator("AR", "Special Designator", AmplifierType.ALPHANUMERIC, 3, 3, "Special track designators such as Non-Real Time (NRT) and Tactically Significant (SIG) tracks are denoted here."),
    AS_Country("AS", "Country", AmplifierType.LIST, 3, 3, "Identifies the country of the organization being shown."),
    AT_CapacityOfInstallation("AT", "Capacity of Installation", AmplifierType.ALPHANUMERIC, 2, 19, "Capacity of Installation displayed."),
    AV_LeadershipIdentifier("AV", "Leadership Identifier", AmplifierType.GRAPHIC, "A graphic amplifier that identifies the leadership role for a dismounted individual."),
    AW_HeadquartersElement("AW", "Headquarters Element", AmplifierType.ALPHANUMERIC, 1, 8, "A text modifier for units, equipment and installations that indicates what type of element of a headquarters is being represented, such as TOC, MAIN."),
    AX_InstallationComposition("AX", "Installation Composition", AmplifierType.LIST, 3, 7, "Indicates the component type of the installation: Development/Research/Production/Service/Storage/Utility."),
    AY_NetworkIdentifier("AY", "Network Identifier", AmplifierType.ALPHANUMERIC, 1, 40, "Indicates the network the entity has privileges within.");

    private final String id;
    private final String label;
    private final AmplifierType type;
    private final String description;
    private final int min;
    private final int max;

    Amplifier(String id, String label, AmplifierType type, int min, int max, String description) {
        this.id = id;
        this.label = label;
        this.type = type;
        this.min = min;
        this.max = max;
        this.description = description;
    }

    Amplifier(String id, String label, AmplifierType type, String description) {
        this(id, label, type, 0, 0, description);
    }

    @Override
    public String getDescription() {
        return description;
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
    public int getMax() {
        return max;
    }

    @Override
    public int getMin() {
        return min;
    }

    @Override
    public AmplifierType getType() {
        return type;
    }

}