package ${basePackage};

public enum CommonSectorTwoModifier implements SectorTwoModifier {
<#list sectorTwoMods as mod>
    ${mod.id}("1", "${mod.code}", "${mod.label}")<#if mod?is_last>;<#else>,</#if>
</#list>    

    private final String groupId;
    private final String id;
    private final String label;
    
    private CommonSectorTwoModifier(String groupId, String id, String label) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicIdentifier() {
        return String.format("%s%s%s2", getSymbolSet().getId(), getGroupId(), getId());
    }

    public String getGroupId() {
        return groupId;
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
    
    @Override
    public boolean isUnknown() {
        return false;
    }
    
}