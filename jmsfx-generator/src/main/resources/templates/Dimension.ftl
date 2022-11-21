package ${basePackage};

import java.util.Arrays;

public enum Dimension implements SymbolIdentificationCodeElement {
<#list dimensions as dim>
    ${dim.id}("${dim.code}", "${dim.label}", Geometry.${dim.geometry}, "${dimensionGraphics[dim.id]}")<#if dim?is_last>;<#else>,</#if>
</#list>    

    private final String id;
    private final String label;
    private final String graphicLocation;
    private final Geometry geometry;
    
    private Dimension(String id, String label, Geometry geometry, String graphicLocation) {
        this.id = id;
        this.label = label;
        this.geometry = geometry;
        this.graphicLocation = graphicLocation; 
    }
    
    public SymbolSet getDefaultSymbolSet() {
        return Arrays.stream(SymbolSet.values()).filter(sym -> sym.getDimension() == this).findFirst().orElse(SymbolSet.SS_UNKNOWN);
    }

    public String getFrameId() {
        return getDefaultSymbolSet().getId();
    }

    public Geometry getGeometry() {
        return geometry;
    }
    
    public String getGraphicLocation() {
        return graphicLocation;
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