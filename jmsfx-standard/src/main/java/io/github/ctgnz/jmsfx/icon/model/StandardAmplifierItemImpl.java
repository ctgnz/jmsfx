package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StandardAmplifierItemImpl<A extends StandardAmplifierItem> extends CodeElementImpl implements AmplifierListItem {
    private final ObjectProperty<AmplifierList> amplifierList = new SimpleObjectProperty<>();
    private final StringProperty fullId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final BooleanProperty graphicalIcon = new SimpleBooleanProperty();

    public StandardAmplifierItemImpl() {
    }

    public StandardAmplifierItemImpl(A amplifierItem) {
        super(amplifierItem);
        this.amplifierList.set(amplifierItem.getAmplifierList());
        this.fullId.set(amplifierItem.getFullId());
        this.graphicLocation.set(amplifierItem.getGraphicLocation());
        this.graphicalIcon.set(amplifierItem.isGraphicalIcon());
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

    protected void setAmplifierList(StandardAmplifierImpl<A> amplifierList) {
        this.amplifierList.set(amplifierList);
    }

}
