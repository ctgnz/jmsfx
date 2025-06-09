package io.github.ctgnz.jmsfx.icon.model;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.AmplifierList;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StandardAmplifierAdapter<A extends IStandardAmplifierItem> extends CodeElementAdapter implements IAmplifierList {
    private final ObjectProperty<IAmplifier> amplifier = new SimpleObjectProperty<>();
    private final ObjectProperty<Class<A>> valueClass = new SimpleObjectProperty<>();
    private ObservableList<ISymbolSet> symbolSets = FXCollections.observableArrayList();
    private ObservableList<StandardAmplifierItemAdapter<A>> values = FXCollections.observableArrayList();

    public StandardAmplifierAdapter() {
    }

    public StandardAmplifierAdapter(AmplifierList amplifierList) {
        super(amplifierList);
        this.amplifier.set(amplifierList.getAmplifier());
        this.valueClass.set(amplifierList.getValueClass());
        this.values.setAll(loadValues());
        values.forEach(val -> val.setAmplifierList(this));
    }

    public ObjectProperty<IAmplifier> amplifierProperty() {
        return amplifier;
    }

    @Override
    public IAmplifier getAmplifier() {
        return amplifier.get();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<A> getItems() {
        return (List<A>) values;
    }

    @Override
    public List<ISymbolSet> getSymbolSets() {
        return symbolSets;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<A> getValueClass() {
        return valueClass.get();
    }

    public ObservableList<StandardAmplifierItemAdapter<A>> getValues() {
        return values;
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
    protected List<StandardAmplifierItemAdapter<A>> loadValues() {
        try {
            Class<A> amplifierClass = getValueClass();
            A[] vals = (A[]) amplifierClass.getMethod("values").invoke(amplifierClass);
            return Arrays.stream(vals).map(StandardAmplifierItemAdapter::new).toList();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            return Collections.emptyList();
        }
    }

}
