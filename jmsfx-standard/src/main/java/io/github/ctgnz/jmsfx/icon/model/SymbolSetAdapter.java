package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IAmplifierGuide;
import io.github.ctgnz.jmsfx.IDimension;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.ISymbolSetInfo;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SymbolSetAdapter extends CodeElementAdapter implements ISymbolSet {
    private final ObservableList<IEntity> entities = FXCollections.observableArrayList();
    private final ObservableList<ISectorOneModifier> sectorOne = FXCollections.observableArrayList();
    private final ObservableList<ISectorTwoModifier> sectorTwo = FXCollections.observableArrayList();
    private final ObservableList<IStandardAmplifierItem> amplifier1 = FXCollections.observableArrayList();
    private final ObservableList<IStandardAmplifierItem> amplifier2 = FXCollections.observableArrayList();
    private final ObservableList<IStandardAmplifierItem> amplifier3 = FXCollections.observableArrayList();
    private final ObservableList<IStandardAmplifierItem> frameAmplifiers = FXCollections.observableArrayList();
    private final ObservableList<IAmplifierGuide> amplifierGuides = FXCollections.observableArrayList();
    private final ObjectProperty<ISymbolSetInfo> symbolSetInfo = new SimpleObjectProperty<>();
    private final ObjectProperty<IDimension> dimension = new SimpleObjectProperty<>();
    private final StringProperty frameId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final BooleanProperty framedIcon = new SimpleBooleanProperty();

    public SymbolSetAdapter() {
    }

    public SymbolSetAdapter(ISymbolSet symbolSet) {
        super(symbolSet);
        this.dimension.set(symbolSet.getDimension());
        this.frameId.set(symbolSet.getFrameId());
        this.graphicLocation.set(symbolSet.getGraphicLocation());
        ISymbolSetInfo info = symbolSet.getSymbolSetInfo();
        this.symbolSetInfo.set(info);
        this.framedIcon.set(info.isFramedIcon());
        info.getEntities().stream().map(EntityAdapter::new).forEach(this::addEntity);
        info.getSectorOneModifiers().stream().map(SectorOneModifierAdapter::new).forEach(this::addSectorOneModifier);
        info.getSectorTwoModifiers().stream().map(SectorTwoModifierAdapter::new).forEach(this::addSectorTwoModifier);
        this.amplifier1.setAll(info.getAmplifiers());
        this.amplifier2.setAll(info.getAmplifiersTwo());
        this.amplifier3.setAll(info.getAmplifiersThree());
        this.frameAmplifiers.setAll(info.getFrameAmplifiers());
        info.getAmplifierGuides().stream().map(AmplifierGuideAdapter::new).forEach(this::addAmplifierGuide);
    }

    public void addAmplifierGuide(AmplifierGuideAdapter adapter) {
        adapter.setSymbolSet(this);
        this.amplifierGuides.add(adapter);
    }

    public void addEntity(EntityAdapter adapter) {
        adapter.setSymbolSet(this);
        this.entities.add(adapter);
    }

    public void addSectorOneModifier(SectorOneModifierAdapter modifier) {
        modifier.setSymbolSet(this);
        this.sectorOne.add(modifier);
    }

    public void addSectorTwoModifier(SectorTwoModifierAdapter modifier) {
        modifier.setSymbolSet(this);
        this.sectorTwo.add(modifier);
    }

    public ObjectProperty<IDimension> dimensionProperty() {
        return dimension;
    }

    public BooleanProperty framedIconProperty() {
        return framedIcon;
    }

    public StringProperty frameIdProperty() {
        return frameId;
    }

    public ObservableList<IStandardAmplifierItem> getAmplifier1() {
        return amplifier1;
    }

    public ObservableList<IStandardAmplifierItem> getAmplifier2() {
        return amplifier2;
    }

    public ObservableList<IStandardAmplifierItem> getAmplifier3() {
        return amplifier3;
    }

    @Override
    public IAmplifierGuide getAmplifierGuide(IAmplifier amplifier) {
        return amplifierGuides.stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    public ObservableList<IAmplifierGuide> getAmplifierGuides() {
        return amplifierGuides;
    }

    public String getAmplifierGuideTemplateLocation() {
        return String.format("/svg/Amplifier/%s.svg", getDimension().getName());
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierList() {
        return (List<A>) amplifier1;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListThree() {
        return (List<A>) amplifier3;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListTwo() {
        return (List<A>) amplifier2;
    }

    @Override
    public IDimension getDimension() {
        return dimension.get();
    }

    @Override
    public ObservableList<IEntity> getEntities() {
        return entities;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends IStandardAmplifierItem> ObservableList<A> getFrameAmplifierList() {
        return (ObservableList<A>) frameAmplifiers;
    }

    public ObservableList<IStandardAmplifierItem> getFrameAmplifiers() {
        return frameAmplifiers;
    }

    @Override
    public String getFrameId() {
        return frameId.get();
    }

    @Override
    public String getGraphicLocation() {
        return graphicLocation.get();
    }

    public String getPath() {
        return getLabel().replaceAll("\\s", "").replaceAll("-", "");
    }

    @Override
    public ObservableList<ISectorOneModifier> getSectorOneModifiers() {
        return sectorOne;
    }

    @Override
    public ObservableList<ISectorTwoModifier> getSectorTwoModifiers() {
        return sectorTwo;
    }

    @Override
    public ISymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo.get();
    }

    public StringProperty graphicLocationProperty() {
        return graphicLocation;
    }

    public boolean isAmplifierGuidesPresent() {
        return !amplifierGuides.isEmpty();
    }

    public boolean isFramedIcon() {
        return framedIcon.get();
    }

    public ObjectProperty<ISymbolSetInfo> symbolSetInfoProperty() {
        return symbolSetInfo;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected void setDimension(DimensionAdapter dimension) {
        this.dimension.set(dimension);
    }

}
