package io.github.ctgnz.jmsfx.icon.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.ISymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.Dimension;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public class SymbolSetAdapter implements ISymbolSet {

    private final SymbolSet symbolSet;
    private final List<IEntity> entities = new ArrayList<>();
    private final List<ISectorOneModifier> sectorOne = new ArrayList<>();
    private final List<ISectorTwoModifier> sectorTwo = new ArrayList<>();
    private final List<ListAmplifierValueAdapter<?>> amplifier1 = new ArrayList<>();
    private final List<ListAmplifierValueAdapter<?>> amplifier2 = new ArrayList<>();
    private final List<ListAmplifierValueAdapter<?>> amplifier3 = new ArrayList<>();

    public @JsonCreator SymbolSetAdapter(@JsonProperty("symbolSet") SymbolSet symbolSet) {
        this.symbolSet = symbolSet;
        ISymbolSetInfo symbolSetInfo = symbolSet.getSymbolSetInfo();
        this.entities.addAll(symbolSetInfo.getEntities().stream().map(EntityAdapter::new).toList());
        this.sectorOne.addAll(symbolSetInfo.getSectorOneModifiers().stream().map(SectorOneModifierAdapter::new).toList());
        this.sectorTwo.addAll(symbolSetInfo.getSectorTwoModifiers().stream().map(SectorTwoModifierAdapter::new).toList());
        this.amplifier1.addAll(symbolSetInfo.getAmplifiers());
        this.amplifier2.addAll(symbolSetInfo.getAmplifiersTwo());
        this.amplifier3.addAll(symbolSetInfo.getAmplifiersThree());
    }

    public List<ListAmplifierValueAdapter<?>> getAmplifier1() {
        return amplifier1;
    }

    public List<ListAmplifierValueAdapter<?>> getAmplifier2() {
        return amplifier2;
    }

    public List<ListAmplifierValueAdapter<?>> getAmplifier3() {
        return amplifier3;
    }

    @Override
    public AmplifierGuide getAmplifierGuide(IAmplifier amplifier) {
        return symbolSet.getAmplifierGuide(amplifier);
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return symbolSet.getAmplifierGuides();
    }

    public String getAmplifierGuideTemplateLocation() {
        return String.format("/svg/Amplifier/%s.svg", symbolSet.getDimension().getName());
    }

    @Override
    public <A extends IListAmplifier> List<A> getAmplifierThreeGroups() {
        return symbolSet.getAmplifierThreeGroups();
    }

    @Override
    public <A extends IListAmplifier> List<A> getAmplifierTwoGroups() {
        return symbolSet.getAmplifierTwoGroups();
    }

    @Override
    public Dimension getDimension() {
        return symbolSet.getDimension();
    }

    public String getDimensionId() {
        return symbolSet.getDimension().getId();
    }

    @Override
    public List<IEntity> getEntities() {
        return entities;
    }

    @Override
    public String getFrameId() {
        return symbolSet.getFrameId();
    }

    @Override
    public <A extends IListAmplifier> List<A> getFrameListAmplifiers() {
        return symbolSet.getFrameListAmplifiers();
    }

    public String getFrameLocation(StandardIdentityAdapter identity, StatusAdapter status, boolean civilianEntity) {
        return String.format("/svg/Frames/0_%s%s_%s%s.svg", identity.getId(), symbolSet.getFrameId(), status.getFrameId(identity), civilianEntity ? "c" : "");
    }

    @Override
    public String getGraphicLocation() {
        return symbolSet.getGraphicLocation();
    }

    @Override
    public String getId() {
        return symbolSet.name();
    }

    @Override
    public String getLabel() {
        return symbolSet.getLabel();
    }

    @Override
    public <A extends IListAmplifier> List<A> getListAmplifiers() {
        return symbolSet.getListAmplifiers();
    }

    public String getPath() {
        return getLabel().replaceAll("\\s", "").replaceAll("-", "");
    }

    @Override
    public List<ISectorOneModifier> getSectorOneModifiers() {
        return sectorOne;
    }

    @Override
    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return sectorTwo;
    }

    public SymbolSet getSymbolSet() {
        return symbolSet;
    }

    @Override
    public ISymbolSetInfo getSymbolSetInfo() {
        return symbolSet.getSymbolSetInfo();
    }

    public boolean isAmplifierGuidesPresent() {
        return !symbolSet.getSymbolSetInfo().getAmplifierGuides().isEmpty();
    }

    public boolean isFramedIcon() {
        return symbolSet.getSymbolSetInfo().isFramedIcon();
    }

}
