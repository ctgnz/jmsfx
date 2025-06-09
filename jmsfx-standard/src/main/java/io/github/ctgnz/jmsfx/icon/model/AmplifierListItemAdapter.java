package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AmplifierListItemAdapter<A extends IAmplifierListItem> extends CodeElementAdapter implements IAmplifierListItem {
    private final ObjectProperty<IAmplifierList> amplifierList = new SimpleObjectProperty<>();
    private final StringProperty fullId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final BooleanProperty graphicalIcon = new SimpleBooleanProperty();

    public AmplifierListItemAdapter() {
    }

    public AmplifierListItemAdapter(A amplifierList) {
        super(amplifierList);
        this.amplifierList.set(amplifierList.getAmplifierList());
        this.fullId.set(amplifierList.getFullId());
        this.graphicLocation.set(amplifierList.getGraphicLocation());
        this.graphicalIcon.set(amplifierList.isGraphicalIcon());
    }

    public ObjectProperty<IAmplifierList> amplifierListProperty() {
        return amplifierList;
    }

    public StringProperty fullIdProperty() {
        return fullId;
    }

    @Override
    public IAmplifierList getAmplifierList() {
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

    protected void setAmplifierList(AmplifierListAdapter<A> amplifierList) {
        this.amplifierList.set(amplifierList);
    }

}
