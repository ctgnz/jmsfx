package io.github.ctgnz.jmsfx.icon;

import java.util.Arrays;

import io.github.ctgnz.jmsfx.ICodeElement;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.icon.amplifier.*;

public enum ListAmplifierType implements ICodeElement {
    UNKNOWN("0", "Unspecified", UnknownAmplifier.class),
    UNIT_ECHELON("1", "Unit Echelon", UnitEchelon.class, SymbolSet.LAND_UNIT, SymbolSet.CONTROL_MEASURE, SymbolSet.CYBERSPACE),
    EQUIPMENT_MOBILITY("3", "Equipment Mobility", EquipmentMobility.class, SymbolSet.LAND_UNIT, SymbolSet.LAND_EQUIPMENT, SymbolSet.LAND_INSTALLATION),
    TOWED_ARRAYS("6", "Naval towed array", TowedArrayType.class, SymbolSet.SEA_SURFACE),
    LEADERSHIP_ROLE("7", "Leadership role", LeadershipRole.class, SymbolSet.DISMOUNTED),
    REINFORCED("A1", "Reinforced or Reduced", ReinforcedReduced.class),
    RELIABILITY_RATING("A2", "Reliability Rating", ReliabilityRating.class),
    CREDIBILITY_RATING("A3", "Credibility Rating", CredibilityRating.class),
    COMBAT_EFFECTIVENESS("A4", "Combat Effectiveness Values", CombatEffectiveness.class),
    SPEED_UNIT("A5", "Speed Units", SpeedUnit.class),
    PLATFORM_TYPE("AD", "Platform Type", PlatformType.class),
    ENGAGEMENT_TYPE("A6", "Type of Engagement", EngagementType.class),
    ENGAGEMENT_STAGE("A7", "Engagement Stage Code", EngagementStage.class),
    ENGAGEMENT_WEAPON("A8", "Engagement Weapon", EngagementWeapon.class),
    TARGET_DESIGNATION("A9", "Target Designation", TargetDesignation.class),
    GUARDED_UNIT("AC", "Guarded Unit", GuardedUnit.class),
    SPECIAL_DESIGNATOR("AE", "Special Designator", SpecialDesignator.class),
    COUNTRY_CODE("AA", "Country Codes", CountryCode.class),
    INSTALLATION_COMPOSITION("AB", "Installation Composition", InstallationComposition.class);

    @SuppressWarnings("unchecked")
    public static <A extends IListAmplifier> Class<A> getListAmplifier(SymbolSet symbolSet) {
        return (Class<A>) Arrays.stream(values())
                        .filter(type -> type.isCompatibleWith(symbolSet))
                        .findFirst()
                        .map(ListAmplifierType::getAmplifierEnumClass)
                        .orElse(null);
    }

    private final String id;
    private final String label;
    private final Class<? extends IListAmplifier> amplifierEnumClass;
    private final SymbolSet[] symbolSets;

    ListAmplifierType(String id, String label, Class<? extends IListAmplifier> amplifierEnumClass, SymbolSet... symbolSets) {
        this.id = id;
        this.label = label;
        this.amplifierEnumClass = amplifierEnumClass;
        this.symbolSets = symbolSets;
    }

    @SuppressWarnings("unchecked")
    public <A extends IListAmplifier> Class<A> getAmplifierEnumClass() {
        return (Class<A>) amplifierEnumClass;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public SymbolSet[] getSymbolSets() {
        return symbolSets;
    }

    public boolean isCompatibleWith(SymbolSet symbolSet) {
        return Arrays.stream(symbolSets).anyMatch(sym -> sym == symbolSet);
    }

}