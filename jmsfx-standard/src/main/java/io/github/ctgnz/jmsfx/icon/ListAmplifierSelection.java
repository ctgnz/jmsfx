package io.github.ctgnz.jmsfx.icon;

import io.github.ctgnz.jmsfx.IListAmplifier;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Pos;

public class ListAmplifierSelection<A extends IListAmplifier> extends TextAmplifierValue {
    private final ObjectProperty<A> value = new SimpleObjectProperty<>();

    public ListAmplifierSelection(AmplifierGuide guide, Pos initialAttachment, A initialSelection) {
        super(guide, initialAttachment, initialSelection.getLabel());
        this.value.set(initialSelection);
    }

    public A getValue() {
        return value.get();
    }

    public void setValue(A value) {
        this.value.setValue(value);
    }

    public ObjectProperty<A> valueProperty() {
        return value;
    }

}
