package ${basePackage};

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonSymbolSetInfo implements SymbolSetInfo {
    public static final SymbolSetInfo INSTANCE = new CommonSymbolSetInfo();

    private CommonSymbolSetInfo() {
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return Collections.emptyList();        
    }

    @Override
    public List<EnumeratedAmplifier> getAmplifiers() {
        return Collections.emptyList();        
    }

    @Override
    public List<EnumeratedAmplifier> getAmplifiersTwo() {
        return Collections.emptyList();        
    }

    @Override
    public List<EnumeratedAmplifier> getAmplifiersThree() {
        return Collections.emptyList();        
    }

    @Override
    public List<Entity> getEntities() {
        return Collections.emptyList();        
    }

    @Override
    public List<EntitySubType> getEntitySubTypes(EntityType entityType) {
        return Collections.emptyList();        
    }

    @Override
    public List<EntityType> getEntityTypes(Entity entity) {
        return Collections.emptyList();        
    }

    @Override
    public List<EnumeratedAmplifier> getFrameAmplifiers() {
        return Collections.emptyList();        
    }

    @Override
    public List<SectorOneModifier> getSectorOneModifiers() {
        return Arrays.asList(CommonSectorOneModifier.values());
    }

    @Override
    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return Arrays.asList(CommonSectorTwoModifier.values());
    }

    @Override
    public boolean isAmplifierPresent() {
        return false;
    }

    @Override
    public boolean isAmplifierTwoPresent() {
        return false;
    }

    @Override
    public boolean isAmplifierThreePresent() {
        return false;
    }

    @Override
    public boolean isEntitySubTypePresent() {
        return false;
    }

    @Override
    public boolean isEntityTypePresent() {
        return false;
    }

    @Override
    public boolean isFrameAmplifierPresent() {
        return false;
    }

    @Override
    public boolean isSectorOneModifierPresent() {
        return true;
    }

    @Override
    public boolean isSectorTwoModifierPresent() {
        return true;
    }

}
