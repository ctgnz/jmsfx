package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AmplifierListItemImpl<A extends AmplifierListItem> extends CodeElementImpl implements AmplifierListItem {
    private final ObjectProperty<AmplifierList> amplifierList = new SimpleObjectProperty<>();
    private final StringProperty fullId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final BooleanProperty graphicalIcon = new SimpleBooleanProperty();

    public AmplifierListItemImpl() {
    }

    public AmplifierListItemImpl(A amplifierList) {
        super(amplifierList);
        this.amplifierList.set(amplifierList.getAmplifierList());
        this.fullId.set(amplifierList.getFullId());
        this.graphicLocation.set(amplifierList.getGraphicLocation());
        this.graphicalIcon.set(amplifierList.isGraphicalIcon());
    }

    public ObjectProperty<AmplifierList> amplifierListProperty() {
        return amplifierList;
    }

    public StringProperty fullIdProperty() {
        return fullId;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return amplifierList.get();
    }

    @Override
    public String getFullId() {
        return fullId.get();
    }

    @Override
    public String getGraphicLocation() {
        return graphicLocation.get();
    }

    public BooleanProperty graphicalIconProperty() {
        return graphicalIcon;
    }

    public StringProperty graphicLocationProperty() {
        return graphicLocation;
    }

    @Override
    public boolean isGraphicalIcon() {
        return graphicalIcon.get();
    }

    @Override
    public String toString() {
        return getLabel();
    }

    protected void setAmplifierList(AmplifierListImpl<A> amplifierList) {
        this.amplifierList.set(amplifierList);
    }

}
