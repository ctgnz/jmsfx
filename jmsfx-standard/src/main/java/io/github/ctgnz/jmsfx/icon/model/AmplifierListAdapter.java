package io.github.ctgnz.jmsfx.icon.model;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.icon.AmplifierList;
import io.github.ctgnz.jmsfx.icon.SymbolSet;

public class AmplifierListAdapter<A extends IAmplifierListItem> implements IAmplifierList {

    private final AmplifierList model;
    private List<AmplifierListItemAdapter<A>> values;

    public AmplifierListAdapter(AmplifierList amplifierType) {
        this.model = amplifierType;
        this.values = loadValues();
    }

    @Override
    public IAmplifier getAmplifier() {
        return model.getAmplifier();
    }

    public Class<A> getAmplifierClass() {
        return model.getValueClass();
    }

    public AmplifierList getModel() {
        return model;
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    @Override
    public SymbolSet[] getSymbolSets() {
        return model.getSymbolSets();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<A> getValueClass() {
        return model.getValueClass();
    }

    public List<AmplifierListItemAdapter<A>> getValues() {
        return values;
    }

    @Override
    public boolean isCompatibleWith(SymbolSet symbolSet) {
        return model.isCompatibleWith(symbolSet);
    }

    public boolean isStandardAmplifier() {
        return IStandardAmplifierItem.class.isAssignableFrom(model.getValueClass());
    }

    @Override
    public boolean isUnknown() {
        return values.get(0).getModel().isUnknown();
    }

    @SuppressWarnings("unchecked")
    protected List<AmplifierListItemAdapter<A>> loadValues() {
        try {
            Class<A> amplifierClass = getAmplifierClass();
            A[] vals = (A[]) amplifierClass.getMethod("values").invoke(getAmplifierClass());
            return Arrays.stream(vals).map(AmplifierListItemAdapter::new).toList();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
