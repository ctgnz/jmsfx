package io.github.ctgnz.jmsfx.icon.seasubsurface;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;

public enum SeaSubsurfaceEntity implements Entity {
    MILITARY("11", "Military", GraphicType.MAIN),
    CIVILIAN("12", "Civilian", GraphicType.MAIN),
    WEAPON("13", "Weapon", GraphicType.MAIN),
    ECHO_TRACKER_CLASSIFIER_ETC_POSSIBLE_CONTACT_POSCON("14", "Echo Tracker Classifier (ETC) / Possible Contact (POSCON)", GraphicType.FULL_OCTAGON),
    FUSED_TRACK("15", "Fused Track", GraphicType.FULL_OCTAGON),
    MANUAL_TRACK("16", "Manual Track", GraphicType.FULL_OCTAGON),
    SEABED_INSTALLATION_MIL("20", "Seabed Installation, Human-Made, Military", GraphicType.MAIN),
    SEABED_INSTALLATION_NON_MIL("21", "Seabed Installation, Human-Made, Non-Military", GraphicType.MAIN);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    SeaSubsurfaceEntity(String id, String label, GraphicType graphicType) {
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
        return SymbolSetEnum.SEA_SUBSURFACE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return SeaSubsurfaceSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}