package ${basePackage};

import java.util.List;

public interface SymbolSetInfo {

    List<AmplifierGuide> getAmplifierGuides();

    <A extends AmplifierGroup> List<A> getAmplifiers();

    <A extends AmplifierGroup> List<A> getAmplifiersTwo();

    <A extends AmplifierGroup> List<A> getAmplifiersThree();

    <A extends AmplifierGroup> List<A> getFrameAmplifiers();

    <E extends Entity> List<E> getEntities();

    <E extends EntitySubType> List<E> getEntitySubTypes(EntityType entityType);

    <E extends EntityType> List<E> getEntityTypes(Entity entity);

    <M extends SectorOneModifier>List<M> getSectorOneModifiers();

    <M extends SectorTwoModifier>List<M> getSectorTwoModifiers();

    <E extends EntitySubType> List<E> getSpecialEntitySubTypes();

    boolean isAmplifierPresent();

    boolean isAmplifierTwoPresent();

    boolean isAmplifierThreePresent();

    boolean isFrameAmplifierPresent();

    boolean isEntitySubTypePresent();

    boolean isEntityTypePresent();

    boolean isSectorOneModifierPresent();

    boolean isSectorTwoModifierPresent();

    boolean isSpecialEntitySubTypePresent();

}