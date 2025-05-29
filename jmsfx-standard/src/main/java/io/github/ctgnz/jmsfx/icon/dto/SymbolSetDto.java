package io.github.ctgnz.jmsfx.icon.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetInfo;

public class SymbolSetDto {

    private final SymbolSet symbolSet;
    private final List<Entity> entities = new ArrayList<>();
    private final List<SectorOneModifier> sectorOne = new ArrayList<>();
    private final List<SectorTwoModifier> sectorTwo = new ArrayList<>();

    public @JsonCreator SymbolSetDto(@JsonProperty("symbolSet") SymbolSet symbolSet) {
        this.symbolSet = symbolSet;
        SymbolSetInfo symbolSetInfo = symbolSet.getSymbolSetInfo();
        this.entities.addAll(symbolSetInfo.getEntities().stream().map(EntityDto::new).toList());
        this.sectorOne.addAll(symbolSetInfo.getSectorOneModifiers().stream().map(SectorOneModifierDto::new).toList());
        this.sectorTwo.addAll(symbolSetInfo.getSectorTwoModifiers().stream().map(SectorTwoModifierDto::new).toList());
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public String getId() {
        return symbolSet.name();
    }

    public String getLabel() {
        return symbolSet.getLabel();
    }

    public String getPath() {
        return getLabel().replaceAll("\\s", "").replaceAll("-", "");
    }

    public List<SectorOneModifier> getSectorOneModifiers() {
        return sectorOne;
    }

    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return sectorTwo;
    }

    public SymbolSet getSymbolSet() {
        return symbolSet;
    }

}
