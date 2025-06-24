package io.github.ctgnz.jmsfx.icon.editor;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.Dimension;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.SymbolSetInfo;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SymbolSetImpl extends CodeElementImpl implements SymbolSet {
    private final ObservableList<Entity> entities = FXCollections.observableArrayList();
    private final ObservableList<SectorOneModifier> sectorOne = FXCollections.observableArrayList();
    private final ObservableList<SectorTwoModifier> sectorTwo = FXCollections.observableArrayList();
    private final ObservableList<StandardAmplifierItem> amplifier1 = FXCollections.observableArrayList();
    private final ObservableList<StandardAmplifierItem> amplifier2 = FXCollections.observableArrayList();
    private final ObservableList<StandardAmplifierItem> amplifier3 = FXCollections.observableArrayList();
    private final ObservableList<StandardAmplifierItem> frameAmplifiers = FXCollections.observableArrayList();
    private final ObservableList<AmplifierGuide> amplifierGuides = FXCollections.observableArrayList();
    private final ObjectProperty<SymbolSetInfo> symbolSetInfo = new SimpleObjectProperty<>();
    private final ObjectProperty<Dimension> dimension = new SimpleObjectProperty<>();
    private final StringProperty frameId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final BooleanProperty framedIcon = new SimpleBooleanProperty();

    public SymbolSetImpl() {
    }

    public SymbolSetImpl(SymbolSet symbolSet) {
        super(symbolSet);
        this.dimension.set(symbolSet.getDimension());
        this.frameId.set(symbolSet.getFrameId());
        this.graphicLocation.set(symbolSet.getGraphicLocation());
        SymbolSetInfo info = symbolSet.getSymbolSetInfo();
        this.symbolSetInfo.set(info);
        this.framedIcon.set(info.isFramedIcon());
        info.getEntities().stream().map(EntityImpl::new).forEach(this::addEntity);
        info.getSectorOneModifiers().stream().map(SectorOneModifierImpl::new).forEach(this::addSectorOneModifier);
        info.getSectorTwoModifiers().stream().map(SectorTwoModifierImpl::new).forEach(this::addSectorTwoModifier);
        this.amplifier1.setAll(info.getAmplifiers());
        this.amplifier2.setAll(info.getAmplifiersTwo());
        this.amplifier3.setAll(info.getAmplifiersThree());
        this.frameAmplifiers.setAll(info.getFrameAmplifiers());
        info.getAmplifierGuides().stream().map(AmplifierGuideImpl::new).forEach(this::addAmplifierGuide);
    }

    public void addAmplifierGuide(AmplifierGuideImpl adapter) {
        adapter.setSymbolSet(this);
        this.amplifierGuides.add(adapter);
    }

    public void addEntity(EntityImpl adapter) {
        adapter.setSymbolSet(this);
        this.entities.add(adapter);
    }

    public void addSectorOneModifier(SectorOneModifierImpl modifier) {
        modifier.setSymbolSet(this);
        this.sectorOne.add(modifier);
    }

    public void addSectorTwoModifier(SectorTwoModifierImpl modifier) {
        modifier.setSymbolSet(this);
        this.sectorTwo.add(modifier);
    }

    public ObjectProperty<Dimension> dimensionProperty() {
        return dimension;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SymbolSetImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    public BooleanProperty framedIconProperty() {
        return framedIcon;
    }

    public StringProperty frameIdProperty() {
        return frameId;
    }

    public ObservableList<StandardAmplifierItem> getAmplifier1() {
        return amplifier1;
    }

    public ObservableList<StandardAmplifierItem> getAmplifier2() {
        return amplifier2;
    }

    public ObservableList<StandardAmplifierItem> getAmplifier3() {
        return amplifier3;
    }

    @Override
    public AmplifierGuide getAmplifierGuide(Amplifier amplifier) {
        return amplifierGuides.stream().filter(guide -> guide.getAmplifier() == amplifier).findFirst().orElse(null);
    }

    @Override
    public ObservableList<AmplifierGuide> getAmplifierGuides() {
        return amplifierGuides;
    }

    public String getAmplifierGuideTemplateLocation() {
        return String.format("/svg/Amplifier/%s.svg", getDimension().getName());
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends StandardAmplifierItem> List<A> getAmplifierList() {
        return (List<A>) amplifier1;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends StandardAmplifierItem> List<A> getAmplifierListThree() {
        return (List<A>) amplifier3;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends StandardAmplifierItem> List<A> getAmplifierListTwo() {
        return (List<A>) amplifier2;
    }

    @Override
    public Dimension getDimension() {
        return dimension.get();
    }

    @Override
    public ObservableList<Entity> getEntities() {
        return entities;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends StandardAmplifierItem> ObservableList<A> getFrameAmplifierList() {
        return (ObservableList<A>) frameAmplifiers;
    }

    public ObservableList<StandardAmplifierItem> getFrameAmplifiers() {
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
    public ObservableList<SectorOneModifier> getSectorOneModifiers() {
        return sectorOne;
    }

    @Override
    public ObservableList<SectorTwoModifier> getSectorTwoModifiers() {
        return sectorTwo;
    }

    @Override
    public SymbolSetInfo getSymbolSetInfo() {
        return symbolSetInfo.get();
    }

    public StringProperty graphicLocationProperty() {
        return graphicLocation;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(9643, 3491).append(getId()).toHashCode();
    }

    public boolean isAmplifierGuidesPresent() {
        return !amplifierGuides.isEmpty();
    }

    public boolean isFramedIcon() {
        return framedIcon.get();
    }

    public ObjectProperty<SymbolSetInfo> symbolSetInfoProperty() {
        return symbolSetInfo;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected void setDimension(DimensionImpl dimension) {
        this.dimension.set(dimension);
    }

}
