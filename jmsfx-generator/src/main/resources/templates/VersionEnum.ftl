package ${iconPackage};

import ${basePackage}.Version;

public enum VersionEnum implements Version {
<#list versions as version>
    ${version.id}("${version.code}", "${version.label}")<#sep>,
</#list>;

    private final String id;
    private final String label;

    VersionEnum(String id, String label) {
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