package io.github.ctgnz.jmsfx.icon;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.amplifier.*;

public enum AmplifierList implements IAmplifierList {
    UNKNOWN("0", "Unspecified", null, UnknownAmplifier.class),
    UNIT_ECHELON("1", "Unit Echelon", Amplifier.B_Echelon, UnitEchelon.class, SymbolSet.LAND_UNIT, SymbolSet.CONTROL_MEASURE, SymbolSet.CYBERSPACE),
    EQUIPMENT_MOBILITY("3", "Equipment Mobility", Amplifier.R_MobilityIndicator, EquipmentMobility.class, SymbolSet.LAND_UNIT, SymbolSet.LAND_EQUIPMENT, SymbolSet.LAND_INSTALLATION),
    TOWED_ARRAYS("6", "Naval towed array", Amplifier.AG_AuxiliaryEquipmentIndicator, TowedArrayType.class, SymbolSet.SEA_SURFACE),
    LEADERSHIP_ROLE("7", "Leadership role", Amplifier.AV_LeadershipIdentifier, LeadershipRole.class, SymbolSet.DISMOUNTED),
    REINFORCED("A1", "Reinforced or Reduced", Amplifier.F_ReinforcedOrReduced, ReinforcedReduced.class),
    RELIABILITY_RATING("A2", "Reliability Rating", Amplifier.J_EvaluationRating, ReliabilityRating.class),
    CREDIBILITY_RATING("A3", "Credibility Rating", Amplifier.J_EvaluationRating, CredibilityRating.class),
    COMBAT_EFFECTIVENESS("A4", "Combat Effectiveness Values", Amplifier.K_CombatEffectiveness, CombatEffectiveness.class),
    SPEED_UNIT("A5", "Speed Units", Amplifier.Z_Speed, SpeedUnit.class),
    PLATFORM_TYPE("AD", "Platform Type", Amplifier.AD_PlatformType, PlatformType.class),
    ENGAGEMENT_TYPE("A6", "Type of Engagement", Amplifier.AO_EngagementBar, EngagementType.class),
    ENGAGEMENT_STAGE("A7", "Engagement Stage Code", Amplifier.AO_EngagementBar, EngagementStage.class),
    ENGAGEMENT_WEAPON("A8", "Engagement Weapon", Amplifier.AO_EngagementBar, EngagementWeapon.class),
    TARGET_DESIGNATION("A9", "Target Designation", Amplifier.AO1_TargetDesignation, TargetDesignation.class),
    GUARDED_UNIT("AC", "Guarded Unit", Amplifier.AQ_GuardedUnit, GuardedUnit.class),
    SPECIAL_DESIGNATOR("AE", "Special Designator", Amplifier.AR_SpecialDesignator, SpecialDesignator.class),
    COUNTRY_CODE("AA", "Country Codes", Amplifier.AS_Country, CountryCode.class),
    INSTALLATION_COMPOSITION("AB", "Installation Composition", Amplifier.AX_InstallationComposition, InstallationComposition.class);

    @SuppressWarnings("unchecked")
    public static <A extends IAmplifierListItem> Class<A> getAmplifierListValueClass(SymbolSet symbolSet) {
        return (Class<A>) Arrays.stream(values())
            .filter(type -> type.isCompatibleWith(symbolSet))
            .findFirst()
            .map(AmplifierList::getValueClass)
            .orElse(null);
    }

    private final String id;
    private final String label;
    private final IAmplifier amplifier;
    private final Class<? extends IAmplifierListItem> valueClass;
    private final SymbolSet[] symbolSets;

    AmplifierList(String id, String label, IAmplifier amplifier, Class<? extends IAmplifierListItem> valueClass, SymbolSet... symbolSets) {
        this.id = id;
        this.label = label;
        this.amplifier = amplifier;
        this.valueClass = valueClass;
        this.symbolSets = symbolSets;
    }

    public IAmplifier getAmplifier() {
        return amplifier;
    }

    @Override
    public String getId() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends IAmplifierListItem> List<A> getItems() {
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
    public List<ISymbolSet> getSymbolSets() {
        return Arrays.asList(symbolSets);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <A extends IAmplifierListItem> Class<A> getValueClass() {
        return (Class<A>) valueClass;
    }

    @Override
    public boolean isUnknown() {
        return this == UNKNOWN;
    }

}