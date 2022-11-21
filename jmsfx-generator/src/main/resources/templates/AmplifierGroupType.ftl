package ${basePackage};

import java.util.Arrays;

public enum AmplifierGroupType implements SymbolIdentificationCodeElement {
<#list amplifierGroups as grp>
    ${grp.enumId}("${grp.code}", "${grp.enumDesc}", ${grp.typeName}.class<#list grp.symbolSets as sym>, SymbolSet.${sym}</#list>)<#if grp?is_last>;<#else>,</#if>
</#list>    

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