package ${basePackage}.common;

import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum CommonSectorOneModifier implements SectorOneModifier {
<#list sectorOneMods as mod>
    ${mod.id}("1", "${mod.code}", "${mod.label}", "${mod.category}")<#if mod?is_last>;<#else>,</#if>
</#list>    

    private final String groupId;
    private final String id;
    private final String label;
    private final String category;
    
    private CommonSectorOneModifier(String groupId, String id, String label, String category) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
        this.category = category;
    }
    
    @Override
    public String getCategory() {
        return category;
    }
    
    @Override
    public String getGraphicIdentifier() {
        return String.format("C1%s%s", getGroupId(), getId());
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