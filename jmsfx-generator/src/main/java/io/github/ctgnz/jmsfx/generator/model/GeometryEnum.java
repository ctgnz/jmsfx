package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.Geometries.Geometry;

public class GeometryEnum extends StandardEnum {

    public GeometryEnum(Geometry geometry) {
        super(geometry.getID(), geometry.getLabel(), geometry.getID(), null);
    }

}
