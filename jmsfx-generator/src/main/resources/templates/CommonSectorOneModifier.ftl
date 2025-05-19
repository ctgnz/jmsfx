package ${basePackage};

public enum CommonSectorOneModifier implements SectorOneModifier {
<#list sectorOneMods as mod>
    ${mod.id}("${mod.code}", "${mod.label}")<#if mod?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    
    private CommonSectorOneModifier(String id, String label) {
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