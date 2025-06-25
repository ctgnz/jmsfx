package io.github.ctgnz.jmsfx.icon.editor;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.Context;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ContextImpl extends CodeElementImpl implements Context {

    private final StringProperty overlayGraphicLocation = new SimpleStringProperty();
    private final BooleanProperty reality = new SimpleBooleanProperty();

    public ContextImpl() {
    }

    public ContextImpl(Context context) {
        super(context);
        this.overlayGraphicLocation.set(context.getOverlayGraphicLocation());
        this.reality.set(context.isReality());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public String getOverlayGraphicLocation() {
        return overlayGraphicLocation.get();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(6619, 9173).append(getId()).toHashCode();
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
