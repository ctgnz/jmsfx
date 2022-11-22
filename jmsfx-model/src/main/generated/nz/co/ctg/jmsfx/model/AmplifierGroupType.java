package nz.co.ctg.jmsfx.model;

import java.util.Arrays;

public enum AmplifierGroupType implements SymbolIdentificationCodeElement {
    UNKNOWN("0", "Unspecified", UnknownAmplifier.class),
    SERVICE_TIER("0", "Nato standard service tiers", StandardServiceTier.class, SymbolSet.SS_LAND_UNIT, SymbolSet.SS_LAND_EQUIPMENT, SymbolSet.SS_DISMOUNTED),
    UNIT_ECHELON("1", "Unit Echelon", UnitEchelon.class, SymbolSet.SS_LAND_UNIT, SymbolSet.SS_DISMOUNTED),
    EQUIPMENT_MOBILITY("3", "Equipment Mobility", EquipmentMobility.class, SymbolSet.SS_LAND_EQUIPMENT),
    TOWED_ARRAYS("4", "Naval towed array", TowedArrayType.class, SymbolSet.SS_SEA_SURFACE),
    LEADERSHIP_INDICATOR("5", "Role for dismounted individuals", LeadershipRole.class, SymbolSet.SS_DISMOUNTED),
    RANK("7", "NATO standard rank scales", StandardRank.class, SymbolSet.SS_DISMOUNTED);

    private final String id;
    private final String label;
    private final Class<? extends AmplifierGroup> amplifierEnumClass;
    private final SymbolSet[] symbolSets;
    
    private AmplifierGroupType(String id, String label, Class<? extends AmplifierGroup> amplifierEnumClass, SymbolSet... symbolSets) {
        this.id = id;
        this.label = label;
        this.amplifierEnumClass = amplifierEnumClass;
        this.symbolSets = symbolSets;
    }
    
    @SuppressWarnings("unchecked")
    public <A extends AmplifierGroup> Class<A> getAmplifierEnumClass() {
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
    public static <A extends AmplifierGroup> Class<A> getAmplifierGroup(SymbolSet symbolSet) {
        return (Class<A>) Arrays.stream(values())
                        .filter(type -> type.isCompatibleWith(symbolSet))
                        .findFirst()
                        .map(AmplifierGroupType::getAmplifierEnumClass)
                        .orElse(null);
    }

}