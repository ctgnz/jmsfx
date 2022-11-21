package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.Library.Geometries.Geometry;

public class GeometryEnum extends StandardEnum {

    public GeometryEnum(Geometry geometry) {
        super(geometry.getID(), geometry.getLabel(), geometry.getID());
    }

}
