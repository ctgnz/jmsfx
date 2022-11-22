package nz.co.ctg.jmsfx.model;

public enum Amplifier  {
    SpecialC2Headquarters("AA", "Special C2 Headquarters", "A text modifier for units; indicator is contained inside the frame; contains the name of the special C2 Headquarters."),
    FeintDummyIndicator("AB", "Feint/Dummy Indicator", "A graphic amplifier for units, equipment and installations that identifies an offensive or defensive unit intended to draw the enemy's attention away from the area of the main attack."),
    Installation("AC", "Installation", "A graphic amplifier for units, equipment and installations used to show a particular symbol denotes an installation."),
    PlatformType("AD", "Platform Type", "Electronic Intelligence Notation (ELNOT) or Communications Intelligence Notation (CENOT)"),
    EquipmentTeardownTime("AE", "Equipment Teardown Time", "Equipment teardown time in minutes"),
    CommonIdentifier("AF", "Common Identifier", "Example: 'Hawk' for Hawk SAM system"),
    AuxiliaryEquipmentIndicator("AG", "Auxiliary Equipment Indicator", "A graphic modifier for equipment that indicates the presence of a towed sonar array."),
    AreaofUncertainty("AH", "Area of Uncertainty", "A graphic modifier for units, equipment and installations that indicates the area where an object is most likely to be, based on the object's last report and the reporting accuracty of the sensor that detected the object."),
    HeadquartersElement("AH2", "Headquarters Element", "A text modifier for units, equipment and installations that indicates what type of element of a headquarters is being represented, such as TOC, MAIN."),
    DeadReckoningTrailer("AI", "Dead Reckoning Trailer", "A graphic amplifier for units and equipment that identifies where an object should be located at present, given its last reported course and speed."),
    SpeedLeader("AJ", "Speed Leader", "A graphic amplifier for units, equipment and installations that depicts the speed and direction of movement of an object."),
    PairingLine("AK", "Pairing Line", "A graphic amplifier for units, equipment and installations that connects two objects and is updated dynamically as the positions of the objects change."),
    OperationalCondition("AL", "Operational Condition", "A graphic amplifier for equipment or installations that indicates operational condition or capacity."),
    Distance("AM", "Distance", "A numeric amplifier that displays a minimum, maximum, or a specific distance (range, radius, width, length, etc.), in meters."),
    Azimuth("AN", "Azimuth", "A numeric amplifier that displays an angle measured from true north to any other line in degrees."),
    EngagementBar("AO", "Engagement Bar", "A graphic amplifier for equipment or installations that indicates operational condition or capacity."),
    TargetDesignator("AP", "Target Designator", "A six character text modifier used in Fire Support operations to uniquely designate targets in accordance with STANAG 2147, where characters 1 and 2 are alphabetic, and characters 3-6 are numeric: AANNNN"),
    GuardedUnit("AQ", "Guarded Unit", "During ballistic missile defense, some tracks are designated as guarded by a particular unit."),
    SpecialDesignator("AR", "Special Designator", "Special track designators such as Non-Real Time (NRT) and Tactically Significant (SIG) tracks are denoted here."),
    Country("AS", "Country", "Identifies the country of the organization being shown."),
    SymbolIcon("A", "Symbol Icon", "The innermost part of a symbol that represents a joint military object."),
    Echelon("B", "Echelon", "A graphic amplifier in a unit symbol that identifies command level."),
    Quantity("C", "Quantity", "A text amplifier in an equipment symbol that identifies the number of items present."),
    TaskForceIndicator("D", "Task Force Indicator", "A graphic amplifier that identifies a unit or stability operations symbol as a task force."),
    LeadershipIdentifier("D2", "Leadership Identifier", "A graphic amplifier that identifies the leadership role for a dismounted individual."),
    FrameShapeModifier("E", "Frame Shape Modifier", "A graphic modifier that displays affiliation, battle dimension, or exercise amplifying descriptors of an object."),
    ReinforcedorReduced("F", "Reinforced or Reduced", "A text amplifier in a unit symbol that dispays (+) for reinforced, (-) for reduced, (±) for reinforced and reduced."),
    StaffComments("G", "Staff Comments", "A text amplifier for units, equipment, and installations."),
    AdditionalInformation("H", "Additional Information", "A text amplifier for units, equipment, and installations."),
    EvaluationRating("J", "Evaluation Rating", "A text amplifier for units, equipment and installations that consists of a one-letter reliability rating and a one-number credibility rating."),
    CombatEffectiveness("K", "Combat Effectiveness", "A text amplifier for units and installations that indicates unit effectiveness or installation capability."),
    SignatureEquipment("L", "Signature Equipment", "A text amplifier for hostile equipment, '!' indicates detectable electronic signatures."),
    HigherFormation("M", "Higher Formation", "A text amplifier for units that indicates number or title of higher echelon command (corps are designated by Roman numerals)."),
    HostileEnemy("N", "Hostile (Enemy)", "A text amplifier for equipment, letters 'ENY' denote hostile symbols."),
    IFFSIFAIS("P", "IFF/SIF/AIS", "A text amplifier displaying IFF/SIF/AIS identification modes and codes."),
    DirectionofMovementIndicator("Q", "Direction of Movement Indicator", "A graphic amplifier for units and equipment that identifies the direction of movement or intended movement of an object."),
    MobilityIndicator("R", "Mobility Indicator", "A graphic amplifier for units and equipment that identifies the direction of movement or intended movement of an object."),
    SIGINTMobilityIndicator("R2", "SIGINT Mobility Indicator", "M=Mobile, S=Static, or U=Uncertain"),
    HeadquartersStaffIndicatorOffsetLocationIndicator("S", "Headquarters Staff Indicator/Offset Location Indicator", "Headquarters staff indicator: A graphic amplifier for units, equipment and installations that identifies a unit as a headquarters."),
    UniqueDesignation("T", "Unique Designation", "A text amplifier for units, equipment and installations that uniquely identifies a particular symbol or track number."),
    Type("V", "Type", "A text amplifier for equipment that indicates types of equipment."),
    DateTimeGroupDTG("W", "Date/Time Group (DTG)", "An alphanumeric designator for displaying a date-time group (DDHHMMSSZMONYYYY) or O/O for on order."),
    AltitudeDepth("X", "Altitude/Depth", "A text amplifier for units, equipment, and installations that displays either altitude, flight level, depth for submerged objects."),
    Location("Y", "Location", "A text amplifier for units, equipment, and installations that displays a symbol's location in degrees, minutes, and decimal minutes."),
    Speed("Z", "Speed", "A text amplifier for units and equipment that displays velocity as set forth in MIL-STD 6040.");

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