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
    private final List<ListAmplifierValue<?>> amplifier1 = new ArrayList<>();
    private final List<ListAmplifierValue<?>> amplifier2 = new ArrayList<>();
    private final List<ListAmplifierValue<?>> amplifier3 = new ArrayList<>();

    public @JsonCreator SymbolSetDto(@JsonProperty("symbolSet") SymbolSet symbolSet) {
        this.symbolSet = symbolSet;
        SymbolSetInfo symbolSetInfo = symbolSet.getSymbolSetInfo();
        this.entities.addAll(symbolSetInfo.getEntities().stream().map(EntityDto::new).toList());
        this.sectorOne.addAll(symbolSetInfo.getSectorOneModifiers().stream().map(SectorOneModifierDto::new).toList());
        this.sectorTwo.addAll(symbolSetInfo.getSectorTwoModifiers().stream().map(SectorTwoModifierDto::new).toList());
        this.amplifier1.addAll(symbolSetInfo.getAmplifiers());
        this.amplifier2.addAll(symbolSetInfo.getAmplifiersTwo());
        this.amplifier3.addAll(symbolSetInfo.getAmplifiersThree());
    }

    public List<ListAmplifierValue<?>> getAmplifier1() {
        return amplifier1;
    }

    public List<ListAmplifierValue<?>> getAmplifier2() {
        return amplifier2;
    }

    public List<ListAmplifierValue<?>> getAmplifier3() {
        return amplifier3;
    }

    public String getAmplifierGuideTemplateLocation() {
        return String.format("/svg/Amplifier/%s.svg", symbolSet.getDimension().name());
    }

    public String getDimensionId() {
        return symbolSet.getDimension().getId();
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public String getFrameId() {
        return symbolSet.getFrameId();
    }

    public String getFrameLocation(StandardIdentityDto identity, StatusDto status, boolean civilianEntity) {
        return String.format("/svg/Frames/0_%s%s_%s%s.svg", identity.getId(), symbolSet.getFrameId(), status.getFrameId(identity), civilianEntity ? "c" : "");
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

    public boolean isAmplifierGuidesPresent() {
        return !symbolSet.getSymbolSetInfo().getAmplifierGuides().isEmpty();
    }

    public boolean isFramedIcon() {
        return symbolSet.getSymbolSetInfo().isFramedIcon();
    }

}
