package ${basePackage};

public enum CommonSectorTwoModifier implements SectorTwoModifier {
<#list sectorTwoMods as mod>
    ${mod.id}("${mod.code}", "${mod.label}")<#if mod?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    
    private CommonSectorTwoModifier(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public SymbolSet getSymbolSet() {
        return SymbolSet.COMMON;
    }
    
}