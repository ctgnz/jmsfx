package io.github.ctgnz.jmsfx.standard.landinstallation;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public enum LandInstallationEntity implements Entity {
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
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.LAND_INSTALLATION;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandInstallationSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}