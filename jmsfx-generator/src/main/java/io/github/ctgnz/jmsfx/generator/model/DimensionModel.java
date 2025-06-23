package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.Dimensions.Dimension;

public class DimensionModel extends StandardEnumModel {

    private final String geometry;

    public DimensionModel(Dimension dimension) {
        super(dimension.getID(), dimension.getLabel(), dimension.getDimensionCode().getCodeString(), null);
        this.geometry = dimension.getGeometry().name() + "_GEOMETRY";
    }

    public String getGeometry() {
        return geometry;
    }

}
