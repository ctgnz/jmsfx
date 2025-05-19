package nz.co.ctg.jmsfx.model;

public enum Amplifier  {
    SymbolIcon("A", "Symbol Icon", "The innermost part of a symbol that represents a joint military object."),
    Echelon("B", "Echelon", "A graphic amplifier in a unit symbol that identifies command level."),
    Quantity("C", "Quantity", "A text amplifier in an equipment symbol that identifies the number of items present."),
    TaskForceIndicator("D", "Task Force Indicator", "A graphic amplifier that identifies a unit or stability operations symbol as a task force."),
    ReinforcedorReduced("F", "Reinforced or Reduced", "A text amplifier in a unit symbol that dispays (+) for reinforced, (-) for reduced, (±) for reinforced and reduced."),
    StaffComments("G", "Staff Comments", "A text amplifier for units, equipment, and installations."),
    AdditionalInformation("H", "Additional Information", "A text amplifier for units, equipment, and installations."),
    UnlistedPointInformation("H1", "Unlisted Point Information", "A text amplifier used to provide an up to a three-character letter field acronym to describe a point that is not already listed."),
    EvaluationRating("J", "Evaluation Rating", "A text amplifier for units, equipment and installations that consists of a one-letter reliability rating and a one-number credibility rating."),
    CombatEffectiveness("K", "Combat Effectiveness", "A text amplifier for units and installations that indicates unit effectiveness or installation capability."),
    SignatureEquipment("L", "Signature Equipment", "A text amplifier for hostile equipment, '!' indicates detectable electronic signatures."),
    HigherFormation("M", "Higher Formation", "A text amplifier for units that indicates number or title of higher echelon command (corps are designated by Roman numerals)."),
    HostileEnemy("N", "Hostile (Enemy)", "A text amplifier for equipment, letters 'ENY' denote hostile symbols."),
    IFFSIFAIS("P", "IFF/SIF/AIS", "A text amplifier displaying IFF/SIF/AIS identification modes and codes."),
    DirectionofMovementIndicator("Q", "Direction of Movement Indicator", "A graphic amplifier for units and equipment that identifies the direction of movement or intended movement of an object."),
    MobilityIndicator("R", "Mobility Indicator", "A graphic amplifier for units and equipment that identifies the direction of movement or intended movement of an object."),
    SIGINTMobilityIndicator("R2", "SIGINT Mobility Indicator", "M=Mobile, S=Static, or U=Uncertain"),
    HeadquartersStaffIndicator("S", "Headquarters Staff Indicator", "A graphic amplifier for units, equipment and installations that identifies a unit as a headquarters."),
    OffsetLocationIndicator("S2", "Offset Location Indicator", "A graphic amplifier for units, equipment and installations used when placing an object away from its actual location."),
    UniqueDesignation("T", "Unique Designation", "A text amplifier for units, equipment and installations that uniquely identifies a particular symbol or track number."),
    UniqueIdentifierPrimaryPurpose("T1", "Unique Identifier/Primary Purpose", "A text amplifier for units, equipment and installations that uniquely identifies a particular symbol or track number."),
    ControllingHeadquarters("T2", "Controlling Headquarters", "An amplifier used to provide the designation of the Establishing Headquarters for Fire Support Control Measures only."),
    TypeofEquipment("V", "Type of Equipment", "A text amplifier for equipment that indicates types of equipment."),
    DateTimeGroupDTG("W", "Date/Time Group (DTG)", "An alphanumeric designator for displaying a date-time group (DDHHMMSSZMONYYYY) or O/O for on order."),
    DateTimeGroupDTGPeriod("W1", "Date/Time Group (DTG) (Period)", "An alphanumeric designator for displaying a date-time group (DDHHMMSSZMONYYYY) or O/O for on order."),
    AltitudeDepth("X", "Altitude/Depth", "A text amplifier for units, equipment, and installations that displays either altitude, flight level, depth for submerged objects."),
    Location("Y", "Location", "A text amplifier for units, equipment, and installations that displays a symbol's location in degrees, minutes, and decimal minutes."),
    SymbolReferencesPoints("YP", "Symbol References Points", "An exchange only amplifier that is repeated as YP, YP1, YP2 to represent the reference points of symbols. Note that these reference points are indicated as centre point, PT 1, PT 2, etc. in the symbol diagram templates and not as YP."),
    Speed("Z", "Speed", "A text amplifier for units and equipment that displays velocity as set forth in MIL-STD 6040."),
    NamedC2Headquarters("AA", "Named C2 Headquarters", "A text modifier for units; indicator is contained inside the frame; contains the name of the special C2 Headquarters."),
    FeintDummyIndicator("AB", "Feint/Dummy Indicator", "A graphic amplifier for units, equipment and installations that identifies an offensive or defensive unit intended to draw the enemy's attention away from the area of the main attack."),
    PlatformType("AD", "Platform Type", "Electronic Intelligence Notation (ELNOT) or Communications Intelligence Notation (CENOT)"),
    EquipmentTeardownTime("AE", "Equipment Teardown Time", "Equipment teardown time in minutes"),
    CommonIdentifier("AF", "Common Identifier", "Example: 'Hawk' for Hawk SAM system"),
    AuxiliaryEquipmentIndicator("AG", "Auxiliary Equipment Indicator", "A graphic modifier for equipment that indicates the presence of a towed sonar array."),
    AreaofUncertaintyIndicator("AH", "Area of Uncertainty Indicator", "A graphic modifier for units, equipment and installations that indicates the area where an object is most likely to be, based on the object's last report and the reporting accuracty of the sensor that detected the object."),
    AreaofUncertaintyIndicatorLongitude("AH1", "Area of Uncertainty Indicator Longitude", "If AH1 is defined, the value of AH is the latitude radius of uncertainty and AH1 is the longitude radius of uncertainty in metres."),
    DeadReckoningTrailer("AI", "Dead Reckoning Trailer", "A graphic amplifier for units and equipment that identifies where an object should be located at present, given its last reported course and speed."),
    SpeedLeader("AJ", "Speed Leader", "A graphic amplifier for units, equipment and installations that depicts the speed and direction of movement of an object."),
    PairingLine("AK", "Pairing Line", "A graphic amplifier for units, equipment and installations that connects two objects and is updated dynamically as the positions of the objects change."),
    OperationalCondition("AL", "Operational Condition", "A graphic amplifier for equipment or installations that indicates operational condition or capacity."),
    Distance("AM", "Distance", "A numeric amplifier that displays a minimum, maximum, or a specific distance (range, radius, width, length, etc.), in meters."),
    Azimuth("AN", "Azimuth", "A numeric amplifier that displays an angle measured from true north to any other line in degrees."),
    EngagementBar("AO", "Engagement Bar", "An amplifier placed immediately atop the symbol. May denote, 1) local/remote status; 2) engagement status; and 3) weapon type."),
    TargetDesignationusingtheEngagementBar("AO1", "Target Designation using the Engagement Bar", "An amplifier placed immediately atop the symbol. Indicates if the symbol is: Hostile Target/Hostile Non-Target/Expired"),
    TargetNumber("AP", "Target Number", "A six character text modifier used in Fire Support operations to uniquely designate targets in accordance with STANAG 2484, where characters 1 and 2 are alphabetic, and characters 3-6 are numeric: AANNNN"),
    TargetNumberExtension("AP1", "Target Number Extension", "A 2-3 character amplifier. A target number extension is a sequentially assigned number identifying the individual elements in a target, where character 1 is a dash and characters 2-3 are numeric, from 1 through 15. It is applicable only to the Point or Single Target symbol and is conditional upon the presence of the Target Number amplifier and is visually displayed appended to the Target Number amplifier."),
    GuardedUnit("AQ", "Guarded Unit", "During ballistic missile defense, some tracks are designated as guarded by a particular unit."),
    SpecialDesignator("AR", "Special Designator", "Special track designators such as Non-Real Time (NRT) and Tactically Significant (SIG) tracks are denoted here."),
    Country("AS", "Country", "Identifies the country of the organization being shown."),
    CapacityofInstallation("AT", "Capacity of Installation", "Capacity of Installation displayed."),
    LeadershipIdentifier("AV", "Leadership Identifier", "A graphic amplifier that identifies the leadership role for a dismounted individual."),
    HeadquartersElement("AW", "Headquarters Element", "A text modifier for units, equipment and installations that indicates what type of element of a headquarters is being represented, such as TOC, MAIN."),
    InstallationComposition("AX", "Installation Composition", "Indicates the component type of the installation: Development/Research/Production/Service/Storage/Utility."),
    NetworkIdentifier("AY", "Network Identifier", "Indicates the network the entity has privileges within.");

    private final String id;
    private final String label;
    private final String description;
    
    private Amplifier(String id, String label, String description) {
        this.id = id;
        this.label = label;
        this.description = description;
    }
    
    public String getId() {
        return id;
    }
    
    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

}