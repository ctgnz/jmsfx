package ${iconPackage};

import java.util.Arrays;

import ${basePackage}.IAmplifier;
import ${basePackage}.IAmplifierList;
import ${basePackage}.IAmplifierListItem;
import ${amplifierPackage}.*;

public enum AmplifierList implements IAmplifierList {
<#list amplifierGroups as grp>
    ${grp.enumId}("${grp.code}", "${grp.enumDesc}", <#if grp.amplifierId??>Amplifier.${grp.amplifierId}<#else>null</#if>, ${grp.typeName}.class<#list grp.symbolSets as sym>, SymbolSet.${sym}</#list>)<#sep>,
</#list>;

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

    @Override
    public String getLabel() {
        return label;
    }

    public SymbolSet[] getSymbolSets() {
        return symbolSets;
    }

    @SuppressWarnings("unchecked")
    public <A extends IAmplifierListItem> Class<A> getValueClass() {
        return (Class<A>) valueClass;
    }

    public boolean isCompatibleWith(SymbolSet symbolSet) {
        return Arrays.stream(symbolSets).anyMatch(sym -> sym == symbolSet);
    }

}