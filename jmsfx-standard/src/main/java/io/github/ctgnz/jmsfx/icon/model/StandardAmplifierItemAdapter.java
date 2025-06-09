package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StandardAmplifierItemAdapter<A extends IStandardAmplifierItem> extends CodeElementAdapter implements IAmplifierListItem {
    private final ObjectProperty<IAmplifierList> amplifierList = new SimpleObjectProperty<>();
    private final StringProperty fullId = new SimpleStringProperty();
    private final StringProperty graphicLocation = new SimpleStringProperty();
    private final BooleanProperty graphicalIcon = new SimpleBooleanProperty();

    public StandardAmplifierItemAdapter() {
    }

    public StandardAmplifierItemAdapter(A amplifierItem) {
        super(amplifierItem);
        this.amplifierList.set(amplifierItem.getAmplifierList());
        this.fullId.set(amplifierItem.getFullId());
        this.graphicLocation.set(amplifierItem.getGraphicLocation());
        this.graphicalIcon.set(amplifierItem.isGraphicalIcon());
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

    protected void setAmplifierList(StandardAmplifierAdapter<A> amplifierList) {
        this.amplifierList.set(amplifierList);
    }

}
