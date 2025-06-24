package io.github.ctgnz.jmsfx.icon.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.icon.AmplifierEnum;
import io.github.ctgnz.jmsfx.types.AmplifierType;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AmplifierImpl extends CodeElementImpl implements Amplifier {
    private final StringProperty description = new SimpleStringProperty();
    private final IntegerProperty min = new SimpleIntegerProperty();
    private final IntegerProperty max = new SimpleIntegerProperty();
    private final ObjectProperty<AmplifierType> type = new SimpleObjectProperty<>();

    public AmplifierImpl() {
    }

    public AmplifierImpl(AmplifierEnum amplifier) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AmplifierImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder(5261, 1627).append(getId()).toHashCode();
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
