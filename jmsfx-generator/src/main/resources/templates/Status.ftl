package ${iconPackage};

import java.util.Arrays;
import java.util.List;

import ${basePackage}.IStatus;

public enum Status implements IStatus {
<#list statuses as status>
    ${status.id}("${status.code}", "${status.label}", <#if status?index gt 1>true<#else>false</#if><#list status.dimensions>, <#items as dim>"${dim}"<#sep>, </#items></#list>)<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final boolean operationalCondition;
    private final String[] dimensionIds;

    Status(String id, String label, boolean operationalCondition, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.operationalCondition = operationalCondition;
        this.dimensionIds = dimensionIds;
    }

    @Override
    public List<String> getDimensionIds() {
        return Arrays.asList(dimensionIds);
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
    public boolean isOperationalCondition() {
        return operationalCondition;
    }

    @Override
    public boolean isPresent() {
        return this == PRESENT;
    }

}