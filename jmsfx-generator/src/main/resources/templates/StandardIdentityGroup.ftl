package ${iconPackage};

import java.util.Arrays;

import ${basePackage}.IStandardIdentity;
import ${basePackage}.IStandardIdentityGroup;

public enum StandardIdentityGroup implements IStandardIdentityGroup {
<#list identityGroups as ident>
    ${ident.id}("${ident.code}", "${ident.label}", "${ident.graphicSuffix}")<#sep>,
</#list>;

    private final String id;
    private final String label;
    private final String graphicSuffix;

    StandardIdentityGroup(String id, String label, String graphicSuffix) {
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
    public StandardIdentity[] getIdentities() {
        return Arrays.stream(StandardIdentity.values()).filter(this::owns).toArray(size -> new StandardIdentity[size]);
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public boolean owns(IStandardIdentity id) {
        return id.getGroup() == this;
    }

}