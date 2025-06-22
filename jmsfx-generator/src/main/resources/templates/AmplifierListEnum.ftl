package ${iconPackage};

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ${basePackage}.Amplifier;
import ${basePackage}.AmplifierList;
import ${basePackage}.AmplifierListItem;
import ${basePackage}.SymbolSet;
import ${amplifierPackage}.*;

public enum AmplifierListEnum implements AmplifierList {
<#list amplifierGroups as grp>
    ${grp.enumId}("${grp.code}", "${grp.enumDesc}", <#if grp.amplifierId??>AmplifierEnum.${grp.amplifierId}<#else>null</#if>, ${grp.typeName}.class<#list grp.symbolSets as sym>, SymbolSetEnum.${sym}</#list>)<#sep>,
</#list>;

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