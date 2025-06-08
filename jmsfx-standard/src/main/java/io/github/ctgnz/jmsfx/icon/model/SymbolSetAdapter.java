package io.github.ctgnz.jmsfx.icon.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.ISymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.Dimension;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public class SymbolSetAdapter implements ISymbolSet {

    private final SymbolSet model;
    private final List<IEntity> entities = new ArrayList<>();
    private final List<ISectorOneModifier> sectorOne = new ArrayList<>();
    private final List<ISectorTwoModifier> sectorTwo = new ArrayList<>();
    private final List<AmplifierListItemAdapter<?>> amplifier1 = new ArrayList<>();
    private final List<AmplifierListItemAdapter<?>> amplifier2 = new ArrayList<>();
    private final List<AmplifierListItemAdapter<?>> amplifier3 = new ArrayList<>();

    public @JsonCreator SymbolSetAdapter(@JsonProperty("symbolSet") SymbolSet symbolSet) {
        this.model = symbolSet;
        ISymbolSetInfo symbolSetInfo = symbolSet.getSymbolSetInfo();
        this.entities.addAll(symbolSetInfo.getEntities().stream().map(EntityAdapter::new).toList());
        this.sectorOne.addAll(symbolSetInfo.getSectorOneModifiers().stream().map(SectorOneModifierAdapter::new).toList());
        this.sectorTwo.addAll(symbolSetInfo.getSectorTwoModifiers().stream().map(SectorTwoModifierAdapter::new).toList());
        this.amplifier1.addAll(symbolSetInfo.getAmplifiers());
        this.amplifier2.addAll(symbolSetInfo.getAmplifiersTwo());
        this.amplifier3.addAll(symbolSetInfo.getAmplifiersThree());
    }

    public List<AmplifierListItemAdapter<?>> getAmplifier1() {
        return amplifier1;
    }

    public List<AmplifierListItemAdapter<?>> getAmplifier2() {
        return amplifier2;
    }

    public List<AmplifierListItemAdapter<?>> getAmplifier3() {
        return amplifier3;
    }

    @Override
    public AmplifierGuide getAmplifierGuide(IAmplifier amplifier) {
        return model.getAmplifierGuide(amplifier);
    }

    @Override
    public List<AmplifierGuide> getAmplifierGuides() {
        return model.getAmplifierGuides();
    }

    public String getAmplifierGuideTemplateLocation() {
        return String.format("/svg/Amplifier/%s.svg", model.getDimension().getName());
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierList() {
        return model.getAmplifierList();
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListThree() {
        return model.getAmplifierListThree();
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListTwo() {
        return model.getAmplifierListTwo();
    }

    @Override
    public Dimension getDimension() {
        return model.getDimension();
    }

    public String getDimensionId() {
        return model.getDimension().getId();
    }

    @Override
    public List<IEntity> getEntities() {
        return entities;
    }

    @Override
    public <A extends IStandardAmplifierItem> List<A> getFrameAmplifierList() {
        return model.getFrameAmplifierList();
    }

    @Override
    public String getFrameId() {
        return model.getFrameId();
    }

    public String getFrameLocation(StandardIdentityAdapter identity, StatusAdapter status, boolean civilianEntity) {
        return String.format("/svg/Frames/0_%s%s_%s%s.svg", identity.getId(), model.getFrameId(), status.getFrameId(identity), civilianEntity ? "c" : "");
    }

    @Override
    public String getGraphicLocation() {
        return model.getGraphicLocation();
    }

    @Override
    public String getId() {
        return model.name();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public SymbolSet getModel() {
        return model;
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

    @Override
    public ISymbolSetInfo getSymbolSetInfo() {
        return model.getSymbolSetInfo();
    }

    public boolean isAmplifierGuidesPresent() {
        return !model.getSymbolSetInfo().getAmplifierGuides().isEmpty();
    }

    public boolean isFramedIcon() {
        return model.getSymbolSetInfo().isFramedIcon();
    }

}
