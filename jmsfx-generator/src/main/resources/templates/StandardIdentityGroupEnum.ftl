package ${iconPackage};

import java.util.Arrays;
import java.util.List;

import ${basePackage}.StandardIdentity;
import ${basePackage}.StandardIdentityGroup;

public enum StandardIdentityGroupEnum implements StandardIdentityGroup {
<#list identityGroups as ident>
    ${ident.id}("${ident.code}", "${ident.label}", "${ident.graphicSuffix}")<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final String graphicSuffix;

    StandardIdentityGroupEnum(String id, String label, String graphicSuffix) {
        this.id = id;
        this.label = label;
        this.graphicSuffix = graphicSuffix;
    }

    @Override
    public String getGraphicSuffix() {
        return graphicSuffix;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public List<StandardIdentity> getIdentities() {
        return Arrays.stream(StandardIdentityEnum.values()).filter(this::owns).map(StandardIdentity.class::cast).toList();
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public boolean owns(StandardIdentity id) {
        return id.getGroup() == this;
    }

}