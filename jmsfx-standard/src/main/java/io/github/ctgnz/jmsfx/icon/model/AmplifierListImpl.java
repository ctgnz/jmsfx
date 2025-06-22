package io.github.ctgnz.jmsfx.icon.model;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AmplifierListImpl<A extends AmplifierListItem> extends CodeElementImpl implements AmplifierList {
    private final ObjectProperty<Amplifier> amplifier = new SimpleObjectProperty<>();
    private final ObjectProperty<Class<A>> valueClass = new SimpleObjectProperty<>();
    private final BooleanProperty unknown = new SimpleBooleanProperty();
    private ObservableList<SymbolSet> symbolSets = FXCollections.observableArrayList();
    private ObservableList<AmplifierListItemImpl<A>> values = FXCollections.observableArrayList();

    public AmplifierListImpl() {
    }

    public AmplifierListImpl(AmplifierListEnum amplifierList) {
        super(amplifierList);
        this.amplifier.set(amplifierList.getAmplifier());
        this.valueClass.set(amplifierList.getValueClass());
        this.unknown.set(amplifierList.isUnknown());
        this.values.setAll(loadValues());
        values.forEach(val -> val.setAmplifierList(this));
    }

    public ObjectProperty<Amplifier> amplifierProperty() {
        return amplifier;
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

    public ObservableList<AmplifierListItemImpl<A>> getValues() {
        return values;
    }

    @Override
    public boolean isUnknown() {
        return unknown.get();
    }

    @Override
    public String toString() {
        return getLabel();
    }

    public ObjectProperty<Class<A>> valueClassProperty() {
        return valueClass;
    }

    @SuppressWarnings("unchecked")
    protected List<AmplifierListItemImpl<A>> loadValues() {
        try {
            Class<A> amplifierClass = getValueClass();
            A[] vals = (A[]) amplifierClass.getMethod("values").invoke(amplifierClass);
            return Arrays.stream(vals).map(AmplifierListItemImpl::new).toList();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            return Collections.emptyList();
        }
    }

}
