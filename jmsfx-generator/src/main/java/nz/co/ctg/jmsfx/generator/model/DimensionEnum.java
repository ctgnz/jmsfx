package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.Library.Dimensions.Dimension;

public class DimensionEnum extends StandardEnum {

    private final String geometry;

    public DimensionEnum(Dimension dimension) {
        super(dimension.getID(), dimension.getLabel(), dimension.getDimensionCode().getCodeString());
        this.geometry = dimension.getGeometry().name() + "_GEOMETRY";
    }

    public String getGeometry() {
        return geometry;
    }

}
