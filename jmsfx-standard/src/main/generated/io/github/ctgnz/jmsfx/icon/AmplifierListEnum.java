package io.github.ctgnz.jmsfx.icon;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.amplifier.*;

public enum AmplifierListEnum implements AmplifierList {
    UNKNOWN("0", "Unspecified", null, UnknownAmplifier.class),
    UNIT_ECHELON("1", "Unit Echelon", AmplifierEnum.B_Echelon, UnitEchelon.class, SymbolSetEnum.LAND_UNIT, SymbolSetEnum.CONTROL_MEASURE, SymbolSetEnum.CYBERSPACE),
    EQUIPMENT_MOBILITY("3", "Equipment Mobility", AmplifierEnum.R_MobilityIndicator, EquipmentMobility.class, SymbolSetEnum.LAND_UNIT, SymbolSetEnum.LAND_EQUIPMENT, SymbolSetEnum.LAND_INSTALLATION),
    TOWED_ARRAYS("6", "Naval towed array", AmplifierEnum.AG_AuxiliaryEquipmentIndicator, TowedArrayType.class, SymbolSetEnum.SEA_SURFACE),
    LEADERSHIP_ROLE("7", "Leadership role", AmplifierEnum.AV_LeadershipIdentifier, LeadershipRole.class, SymbolSetEnum.DISMOUNTED),
    REINFORCED("A1", "Reinforced or Reduced", AmplifierEnum.F_ReinforcedOrReduced, ReinforcedReduced.class),
    RELIABILITY_RATING("A2", "Reliability Rating", AmplifierEnum.J_EvaluationRating, ReliabilityRating.class),
    CREDIBILITY_RATING("A3", "Credibility Rating", AmplifierEnum.J_EvaluationRating, CredibilityRating.class),
    COMBAT_EFFECTIVENESS("A4", "Combat Effectiveness Values", AmplifierEnum.K_CombatEffectiveness, CombatEffectiveness.class),
    SPEED_UNIT("A5", "Speed Units", AmplifierEnum.Z_Speed, SpeedUnit.class),
    PLATFORM_TYPE("AD", "Platform Type", AmplifierEnum.AD_PlatformType, PlatformType.class),
    ENGAGEMENT_TYPE("A6", "Type of Engagement", AmplifierEnum.AO_EngagementBar, EngagementType.class),
    ENGAGEMENT_STAGE("A7", "Engagement Stage Code", AmplifierEnum.AO_EngagementBar, EngagementStage.class),
    ENGAGEMENT_WEAPON("A8", "Engagement Weapon", AmplifierEnum.AO_EngagementBar, EngagementWeapon.class),
    TARGET_DESIGNATION("A9", "Target Designation", AmplifierEnum.AO1_TargetDesignation, TargetDesignation.class),
    GUARDED_UNIT("AC", "Guarded Unit", AmplifierEnum.AQ_GuardedUnit, GuardedUnit.class),
    SPECIAL_DESIGNATOR("AE", "Special Designator", AmplifierEnum.AR_SpecialDesignator, SpecialDesignator.class),
    COUNTRY_CODE("AA", "Country Codes", AmplifierEnum.AS_Country, NatoCountryCode.class),
    INSTALLATION_COMPOSITION("AB", "Installation Composition", AmplifierEnum.AX_InstallationComposition, InstallationComposition.class);

    @SuppressWarnings("unchecked")
    public static <A extends AmplifierListItem> Class<A> getAmplifierListValueClass(SymbolSet symbolSet) {
        return (Class<A>) Arrays.stream(values())
            .filter(type -> type.isCompatibleWith(symbolSet))
            .findFirst()
            .map(AmplifierListEnum::getValueClass)
            .orElse(null);
    }

    private final String id;
    private final String label;
    private final Amplifier amplifier;
    private final Class<? extends AmplifierListItem> valueClass;
    private final SymbolSetEnum[] symbolSets;

    AmplifierListEnum(String id, String label, Amplifier amplifier, Class<? extends AmplifierListItem> valueClass, SymbolSetEnum... symbolSets) {
        this.id = id;
        this.label = label;
        this.amplifier = amplifier;
        this.valueClass = valueClass;
        this.symbolSets = symbolSets;
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    @Override
    public String getId() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends AmplifierListItem> List<A> getItems() {
        try {
            Class<A> amplifierClass = getValueClass();
            A[] vals = (A[]) amplifierClass.getMethod("values").invoke(amplifierClass);
            return Arrays.asList(vals);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            return Collections.emptyList();
        }
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public List<SymbolSet> getSymbolSets() {
        return Arrays.asList(symbolSets);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <A extends AmplifierListItem> Class<A> getValueClass() {
        return (Class<A>) valueClass;
    }

    @Override
    public boolean isUnknown() {
        return this == UNKNOWN;
    }

}