package io.github.ctgnz.jmsfx.standard.seasubsurface;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SeaSubsurfaceEntityType implements EntityType {
    SUBMARINE("01", "Submarine", SeaSubsurfaceEntity.MILITARY, GraphicType.MAIN),
    OTHER_SUBMERSIBLE("02", "Other Submersible", SeaSubsurfaceEntity.MILITARY, GraphicType.MAIN),
    NONSUBMARINE("03", "Nonsubmarine", SeaSubsurfaceEntity.MILITARY, GraphicType.FULL_OCTAGON),
    AUV_UUV("04", "Autonomous Underwater Vehicle (AUV)/Unmanned Underwater Vehicle (UUV)", SeaSubsurfaceEntity.MILITARY, GraphicType.MAIN),
    DIVER("05", "Diver", SeaSubsurfaceEntity.MILITARY, GraphicType.MAIN),
    SUBMERSIBLE_CIV("01", "Submersible", SeaSubsurfaceEntity.CIVILIAN, GraphicType.MAIN),
    AUV_UUV_CIV("02", "Autonomous Underwater Vehicle (AUV)/ Underwater Vehicle (UUV)", SeaSubsurfaceEntity.CIVILIAN, GraphicType.FULL_OCTAGON),
    DIVER_CIV("03", "Diver", SeaSubsurfaceEntity.CIVILIAN, GraphicType.MAIN),
    TORPEDO("01", "Torpedo", SeaSubsurfaceEntity.WEAPON, GraphicType.MAIN),
    IMPROVISED_EXPLOSIVE_DEVICE_IED("02", "Improvised Explosive Device (IED)", SeaSubsurfaceEntity.WEAPON, GraphicType.MAIN),
    DECOY("03", "Decoy", SeaSubsurfaceEntity.WEAPON, GraphicType.MAIN);

    private final String id;
    private final String label;
    private final SeaSubsurfaceEntity entity;
    private final GraphicType graphicType;

    SeaSubsurfaceEntityType(String id, String label, SeaSubsurfaceEntity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return SeaSubsurfaceSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}