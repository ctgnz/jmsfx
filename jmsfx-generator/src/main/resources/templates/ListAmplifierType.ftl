package ${basePackage};

import java.util.Arrays;
import ${basePackage}.amplifier.*;

public enum ListAmplifierType implements SymbolIdentificationCodeElement {
<#list enumAmplifierTypes as grp>
    ${grp.enumId}("${grp.code}", "${grp.enumDesc}", ${grp.typeName}.class<#list grp.symbolSets as sym>, SymbolSet.${sym}</#list>)<#if grp?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final Class<? extends ListAmplifier> amplifierEnumClass;
    private final SymbolSet[] symbolSets;
    
    private ListAmplifierType(String id, String label, Class<? extends ListAmplifier> amplifierEnumClass, SymbolSet... symbolSets) {
        this.id = id;
        this.label = label;
        this.amplifierEnumClass = amplifierEnumClass;
        this.symbolSets = symbolSets;
    }
    
    @SuppressWarnings("unchecked")
    public <A extends ListAmplifier> Class<A> getAmplifierEnumClass() {
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
    public static <A extends ListAmplifier> Class<A> getListAmplifier(SymbolSet symbolSet) {
        return (Class<A>) Arrays.stream(values())
                        .filter(type -> type.isCompatibleWith(symbolSet))
                        .findFirst()
                        .map(ListAmplifierType::getAmplifierEnumClass)
                        .orElse(null);
    }

}