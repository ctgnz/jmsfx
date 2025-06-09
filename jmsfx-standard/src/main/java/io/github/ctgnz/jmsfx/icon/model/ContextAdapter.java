package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IContext;
import io.github.ctgnz.jmsfx.icon.Context;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ContextAdapter extends CodeElementAdapter implements IContext {

    private final StringProperty overlayGraphicLocation = new SimpleStringProperty();
    private final BooleanProperty reality = new SimpleBooleanProperty();

    public ContextAdapter() {
    }

    public ContextAdapter(Context context) {
        super(context);
        this.overlayGraphicLocation.set(context.getOverlayGraphicLocation());
        this.reality.set(context.isReality());
    }

    @Override
    public String getOverlayGraphicLocation() {
        return overlayGraphicLocation.get();
    }

    @Override
    public boolean isReality() {
        return reality.get();
    }

    public StringProperty overlayGraphicLocationProperty() {
        return overlayGraphicLocation;
    }

    public BooleanProperty realityProperty() {
        return reality;
    }

}
