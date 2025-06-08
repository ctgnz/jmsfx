package ${iconPackage};

import ${basePackage}.IContext;

public enum Context implements IContext {
<#list contexts as ctx>
    ${ctx.id}("${ctx.code}", "${ctx.label}")<#sep>,
</#list>;

    private final String id;
    private final String label;

    Context(String id, String label) {
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
    public String getOverlayGraphicLocation() {
        return String.format("/svg/Frames/Overlay/%s.svg", id);
    }

    @Override
    public boolean isReality() {
        return ordinal() == 0;
    }

}