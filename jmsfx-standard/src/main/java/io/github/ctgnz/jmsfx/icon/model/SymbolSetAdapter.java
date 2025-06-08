package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.ISymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.Dimension;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
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
    private final ObservableList<AmplifierGuide> amplifierGuides = FXCollections.observableArrayList();
    private final ObjectProperty<ISymbolSetInfo> symbolSetInfo = new SimpleObjectProperty<>();
    private final ObjectProperty<Dimension> dimension = new SimpleObjectProperty<>();
    private final StringProperty frameId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final BooleanProperty framedIcon = new SimpleBooleanProperty();

    public SymbolSetAdapter() {
    }

    public @JsonCreator SymbolSetAdapter(@JsonProperty("symbolSet") SymbolSet symbolSet) {
        super(symbolSet);
        this.dimension.set(symbolSet.getDimension());
        this.frameId.set(symbolSet.getFrameId());
        this.graphicLocation.set(symbolSet.getGraphicLocation());
        ISymbolSetInfo info = symbolSet.getSymbolSetInfo();
        this.symbolSetInfo.set(info);
        this.framedIcon.set(info.isFramedIcon());
        this.entities.setAll(info.getEntities().stream().map(this::adaptEntity).toList());
        this.sectorOne.setAll(info.getSectorOneModifiers().stream().map(SectorOneModifierAdapter::new).toList());
        this.sectorTwo.setAll(info.getSectorTwoModifiers().stream().map(SectorTwoModifierAdapter::new).toList());
        this.amplifier1.setAll(info.getAmplifiers());
        this.amplifier2.setAll(info.getAmplifiersTwo());
        this.amplifier3.setAll(info.getAmplifiersThree());
        this.frameAmplifiers.setAll(info.getFrameAmplifiers());
        this.amplifierGuides.setAll(info.getAmplifierGuides());
    }

    public ObjectProperty<Dimension> dimensionProperty() {
        return dimension;
    }

    public BooleanProperty framedIconProperty() {
        return framedIcon;
    }

    public StringProperty frameIdProperty() {
        return frameId;
    }

    @JsonIgnore
    public ObservableList<IStandardAmplifierItem> getAmplifier1() {
        return amplifier1;
    }

    @JsonIgnore
    public ObservableList<IStandardAmplifierItem> getAmplifier2() {
        return amplifier2;
    }

    @JsonIgnore
    public ObservableList<IStandardAmplifierItem> getAmplifier3() {
        return amplifier3;
    }

    @Override
    @JsonIgnore
    public AmplifierGuide getAmplifierGuide(IAmplifier amplifier) {
        return amplifierGuides.stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    @JsonIgnore
    public ObservableList<AmplifierGuide> getAmplifierGuides() {
        return amplifierGuides;
    }

    @JsonIgnore
    public String getAmplifierGuideTemplateLocation() {
        return String.format("/svg/Amplifier/%s.svg", getDimension().getName());
    }

    @SuppressWarnings("unchecked")
    @Override
    @JsonIgnore
    public <A extends IStandardAmplifierItem> List<A> getAmplifierList() {
        return (List<A>) amplifier1;
    }

    @SuppressWarnings("unchecked")
    @Override
    @JsonIgnore
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListThree() {
        return (List<A>) amplifier3;
    }

    @SuppressWarnings("unchecked")
    @Override
    @JsonIgnore
    public <A extends IStandardAmplifierItem> List<A> getAmplifierListTwo() {
        return (List<A>) amplifier2;
    }

    @Override
    public Dimension getDimension() {
        return dimension.get();
    }

    @Override
    @JsonIgnore
    public ObservableList<IEntity> getEntities() {
        return entities;
    }

    @SuppressWarnings("unchecked")
    @Override
    @JsonIgnore
    public <A extends IStandardAmplifierItem> ObservableList<A> getFrameAmplifierList() {
        return (ObservableList<A>) frameAmplifiers;
    }

    @JsonIgnore
    public ObservableList<IStandardAmplifierItem> getFrameAmplifiers() {
        return frameAmplifiers;
    }

    @Override
    public String getFrameId() {
        return frameId.get();
    }

    @JsonIgnore
    public String getFrameLocation(IStandardIdentity identity, StatusAdapter status, boolean civilianEntity) {
        return String.format("/svg/Frames/0_%s%s_%s%s.svg", identity.getId(), getFrameId(), status.getFrameId(identity), civilianEntity ? "c" : "");
    }

    @Override
    public String getGraphicLocation() {
        return graphicLocation.get();
    }

    public String getPath() {
        return getLabel().replaceAll("\\s", "").replaceAll("-", "");
    }

    @Override
    @JsonIgnore
    public ObservableList<ISectorOneModifier> getSectorOneModifiers() {
        return sectorOne;
    }

    @Override
    @JsonIgnore
    public ObservableList<ISectorTwoModifier> getSectorTwoModifiers() {
        return sectorTwo;
    }

    @Override
    @JsonIgnore
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

    protected EntityAdapter adaptEntity(IEntity entity) {
        EntityAdapter adapter = new EntityAdapter(entity);
        adapter.setSymbolSet(this);
        return adapter;
    }

}
