package io.github.ctgnz.jmsfx.icon.editor;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StandardAmplifierImpl<A extends StandardAmplifierItem> extends CodeElementImpl implements AmplifierList {
    private final ObjectProperty<Amplifier> amplifier = new SimpleObjectProperty<>();
    private final ObjectProperty<Class<A>> valueClass = new SimpleObjectProperty<>();
    private ObservableList<SymbolSet> symbolSets = FXCollections.observableArrayList();
    private ObservableList<StandardAmplifierItemImpl<A>> values = FXCollections.observableArrayList();

    public StandardAmplifierImpl() {
    }

    public StandardAmplifierImpl(AmplifierListEnum amplifierList) {
        super(amplifierList);
        this.amplifier.set(amplifierList.getAmplifier());
        this.valueClass.set(amplifierList.getValueClass());
        this.values.setAll(loadValues());
        values.forEach(val -> val.setAmplifierList(this));
    }

    public ObjectProperty<Amplifier> amplifierProperty() {
        return amplifier;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StandardAmplifierImpl<?> rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public Amplifier getAmplifier() {
        return amplifier.get();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<A> getItems() {
        return (List<A>) values;
    }

    @Override
    public List<SymbolSet> getSymbolSets() {
        return symbolSets;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<A> getValueClass() {
        return valueClass.get();
    }

    public ObservableList<StandardAmplifierItemImpl<A>> getValues() {
        return values;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(6599, 9967).append(getId()).toHashCode();
    }

    @Override
    public boolean isUnknown() {
        return values.isEmpty() ? false : values.getFirst().isUnknown();
    }

    @Override
    public String toString() {
        return getLabel();
    }

    public ObjectProperty<Class<A>> valueClassProperty() {
        return valueClass;
    }

    @SuppressWarnings("unchecked")
    protected List<StandardAmplifierItemImpl<A>> loadValues() {
        try {
            Class<A> amplifierClass = getValueClass();
            A[] vals = (A[]) amplifierClass.getMethod("values").invoke(amplifierClass);
            return Arrays.stream(vals).map(StandardAmplifierItemImpl::new).toList();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            return Collections.emptyList();
        }
    }

}
