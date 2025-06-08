package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.icon.Amplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierType;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AmplifierAdapter extends CodeElementAdapter implements IAmplifier {
    private final StringProperty description = new SimpleStringProperty();
    private final IntegerProperty min = new SimpleIntegerProperty();
    private final IntegerProperty max = new SimpleIntegerProperty();
    private final ObjectProperty<AmplifierType> type = new SimpleObjectProperty<>();

    public AmplifierAdapter() {
    }

    public AmplifierAdapter(Amplifier amplifier) {
        super(amplifier);
        this.type.set(amplifier.getType());
        this.description.set(amplifier.getDescription());
        this.min.set(amplifier.getMin());
        this.max.set(amplifier.getMax());
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    @Override
    public String getDescription() {
        return description.get();
    }

    @Override
    public int getMax() {
        return max.get();
    }

    @Override
    public int getMin() {
        return min.get();
    }

    @Override
    public AmplifierType getType() {
        return type.get();
    }

    public IntegerProperty maxProperty() {
        return max;
    }

    public IntegerProperty minProperty() {
        return min;
    }

    @Override
    public String toString() {
        return getLabel();
    }

    public ObjectProperty<AmplifierType> typeProperty() {
        return type;
    }

}
