package io.github.ctgnz.jmsfx.icon.landunits;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum LandUnitsEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
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
    public ISymbolSet getSymbolSet() {
        return SymbolSet.LAND_UNIT;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return LandUnitsSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}