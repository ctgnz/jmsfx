package io.github.ctgnz.jmsfx.standard.landunits;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandUnitsEntity implements Entity {
    COMMAND_AND_CONTROL("11", "Command and Control", GraphicType.MAIN),
    MOVEMENT_AND_MANEUVER("12", "Movement and Maneuver", GraphicType.NA),
    FIRES("13", "Fires", GraphicType.NA),
    PROTECTION("14", "Protection", GraphicType.NA),
    INTELLIGENCE("15", "Intelligence", GraphicType.NA),
    SUSTAINMENT("16", "Sustainment", GraphicType.MAIN),
    NAVAL("17", "Naval", GraphicType.NA),
    NAMED_HEADQUARTERS("18", "Named Headquarters", GraphicType.NA),
    EMERGENCY_OPERATION("19", "Emergency Operation", GraphicType.FULL_OCTAGON),
    LAW_ENFORCEMENT("20", "Law Enforcement", GraphicType.FULL_OCTAGON),
    CYBERSPACE_OPERATION("21", "Cyberspace Operation", GraphicType.MAIN);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    LandUnitsEntity(String id, String label, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.LAND_UNIT;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandUnitsSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}