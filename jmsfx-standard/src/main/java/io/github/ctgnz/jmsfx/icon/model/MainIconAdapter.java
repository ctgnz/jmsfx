package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IMainElement;
import io.github.ctgnz.jmsfx.types.GraphicType;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

public class MainIconAdapter extends CodeElementAdapter {
    protected final ObjectProperty<GraphicType> graphicType = new SimpleObjectProperty<>();
    protected final BooleanProperty unknown = new SimpleBooleanProperty();

    public MainIconAdapter() {
    }

    public MainIconAdapter(IMainElement element) {
        super(element);
        this.graphicType.set(element.getGraphicType());
        this.unknown.set(element.isUnknown());
    }

    public GraphicType getGraphicType() {
        return graphicType.get();
    }

    public ObjectProperty<GraphicType> graphicTypeProperty() {
        return graphicType;
    }

    public boolean isUnknown() {
        return unknown.get();
    }

    public BooleanProperty unknownProperty() {
        return unknown;
    }

}