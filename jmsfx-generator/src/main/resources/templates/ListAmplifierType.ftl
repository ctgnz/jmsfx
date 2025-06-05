package ${iconPackage};

import java.util.Arrays;

import ${basePackage}.ICodeElement;
import ${basePackage}.IListAmplifier;
import ${amplifierPackage}.*;

public enum ListAmplifierType implements ICodeElement {
<#list enumAmplifierTypes as grp>
    ${grp.enumId}("${grp.code}", "${grp.enumDesc}", ${grp.typeName}.class<#list grp.symbolSets as sym>, SymbolSet.${sym}</#list>)<#sep>,
</#list>;

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