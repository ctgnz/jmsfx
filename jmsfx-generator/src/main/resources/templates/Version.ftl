package ${iconPackage};

import ${basePackage}.IVersion;

public enum Version implements IVersion {
<#list versions as version>
    ${version.id}("${version.code}", "${version.label}")<#sep>,
</#list>;

    private final String id;
    private final String label;

    Version(String id, String label) {
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

}