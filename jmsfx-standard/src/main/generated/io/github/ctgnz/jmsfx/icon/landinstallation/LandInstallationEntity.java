package io.github.ctgnz.jmsfx.icon.landinstallation;

import java.util.List;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public enum LandInstallationEntity implements IEntity {
    UNSPECIFIED("00", "Unspecified", GraphicType.NA),
    INSTALLATION("11", "Installation", GraphicType.MAIN),
    INFRASTRUCTURE("12", "Infrastructure", GraphicType.NA);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    LandInstallationEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSet.LAND_INSTALLATION;
    }

    @Override
    public List<IEntityType> getEntityTypes() {
        return LandInstallationSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}