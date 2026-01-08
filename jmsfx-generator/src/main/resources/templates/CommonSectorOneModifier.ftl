package ${commonPackage};

import org.apache.commons.lang3.StringUtils;

import ${basePackage}.SectorOneModifier;
import ${basePackage}.SymbolSet;
import ${typePackage}.ModifierCategory;
import ${iconPackage}.SymbolSetEnum;

public enum CommonSectorOneModifier implements SectorOneModifier {
<#list sectorOneMods as mod>
    ${mod.id}("${mod.groupId}", "${mod.code}", "${mod.label}", ModifierCategory.${mod.category})<#sep>,
</#list>;

    private final String groupId;
    private final String id;
    private final String label;
    private final ModifierCategory category;

    CommonSectorOneModifier(String groupId, String id, String label, ModifierCategory category) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
        return category;
    }

    @Override
    public String getGraphicIdentifier() {
        return String.format("C1%s%s", getGroupId(), getId());
    }

    @Override
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
        return SymbolSetEnum.COMMON;
    }

    @Override
    public boolean isUnknown() {
        return StringUtils.equals("0", groupId) && StringUtils.equals("00", id);
    }

}