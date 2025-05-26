package nz.co.ctg.jmsfx.model;

import java.util.Arrays;
import nz.co.ctg.jmsfx.model.amplifier.*;

public enum EnumeratedAmplifierType implements SymbolIdentificationCodeElement {
    UNKNOWN("0", "Unspecified", UnknownAmplifier.class),
    UNIT_ECHELON("1", "Unit Echelon", UnitEchelon.class, SymbolSet.LAND_UNIT),
    EQUIPMENT_MOBILITY("3", "Equipment Mobility", EquipmentMobility.class, SymbolSet.LAND_EQUIPMENT),
    TOWED_ARRAYS("6", "Naval towed array", TowedArrayType.class, SymbolSet.SEA_SURFACE),
    LEADERSHIP_ROLE("7", "Leadership role", LeadershipRole.class, SymbolSet.DISMOUNTED),
    REINFORCED("A1", "Reinforced or Reduced", ReinforcedReduced.class),
    RELIABILITY_RATING("A2", "Reliability Rating", ReliabilityRating.class),
    CREDIBILITY_RATING("A3", "Credibility Rating", CredibilityRating.class),
    COMBAT_EFFECTIVENESS("A4", "Combat Effectiveness Values", CombatEffectiveness.class),
    SIGINT_MOBILITY("A5", "SIGINT Mobility Indicator Values", SigintMobility.class),
    SPEED_UNIT("A6", "Speed Units", SpeedUnit.class),
    ENGAGEMENT_TYPE("A7", "Type of Engagement", EngagementType.class),
    ENGAGEMENT_STAGE("A8", "Engagement Stage Code", EngagementStage.class),
    ENGAGEMENT_WEAPON("A9", "Engagement Weapon", EngagementWeapon.class),
    TARGET_DESIGNATION("AA", "Target Designation", TargetDesignation.class),
    COUNTRY_CODE("AB", "Country Codes", CountryCode.class),
    INSTALLATION_COMPOSITION("AC", "Installation Composition", InstallationComposition.class);

    private final String id;
    private final String label;
    private final Class<? extends EnumeratedAmplifier> amplifierEnumClass;
    private final SymbolSet[] symbolSets;
    
    private EnumeratedAmplifierType(String id, String label, Class<? extends EnumeratedAmplifier> amplifierEnumClass, SymbolSet... symbolSets) {
        this.id = id;
        this.label = label;
        this.amplifierEnumClass = amplifierEnumClass;
        this.symbolSets = symbolSets;
    }
    
    @SuppressWarnings("unchecked")
    public <A extends EnumeratedAmplifier> Class<A> getAmplifierEnumClass() {
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

    @SuppressWarnings("unchecked")
    public static <A extends EnumeratedAmplifier> Class<A> getEnumeratedAmplifier(SymbolSet symbolSet) {
        return (Class<A>) Arrays.stream(values())
                        .filter(type -> type.isCompatibleWith(symbolSet))
                        .findFirst()
                        .map(EnumeratedAmplifierType::getAmplifierEnumClass)
                        .orElse(null);
    }

}