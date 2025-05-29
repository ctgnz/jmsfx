package io.github.ctgnz.jmsfx.icon.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifier;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSetInfo;

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
