package ${basePackage};

public enum Geometry implements SymbolIdentificationCodeElement {
<#list geometries as geom>
    ${geom.id}("${geom.label}"),
</#list>    
    MIXED_GEOMETRY("Mixed Geometry");
    private final String label;
    
    private Geometry(String label) {
        this.label = label;
    }
    
    @Override
    public String getId() {
        return name();
    }
    
    @Override
    public String getLabel() {
        return label;
    }

}