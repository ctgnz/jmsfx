package ${iconPackage};

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ${basePackage}.IAmplifier;
import ${basePackage}.IAmplifierList;
import ${basePackage}.IAmplifierListItem;
import ${basePackage}.ISymbolSet;
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

}