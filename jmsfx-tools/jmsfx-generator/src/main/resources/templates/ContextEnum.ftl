package ${iconPackage};

import ${basePackage}.Context;

public enum ContextEnum implements Context {
<#list contexts as ctx>
        ${ctx.id}("${ctx.code}", "${ctx.label}")<#if ctx.graphicMarkup??> {

            @Override
            public String getOverlayGraphicMarkup() {
                return "${ctx.graphicMarkup?j_string}";
            }
        }</#if><#sep>,
</#list>;

    private final String id;
    private final String label;

    ContextEnum(String id, String label) {
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
    public String getName() {
        return name();
    }


    @Override
    public boolean isReality() {
        return ordinal() == 0;
    }

}