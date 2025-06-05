package io.github.ctgnz.jmsfx.icon.model;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.ctgnz.jmsfx.ICodeElement;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.IStandardAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;

public class ListAmplifierAdapter implements ICodeElement {

    private final ListAmplifierType amplifierType;
    private List<ListAmplifierValueAdapter<IListAmplifier>> values;

    public ListAmplifierAdapter(ListAmplifierType amplifierType) {
        this.amplifierType = amplifierType;
        this.values = loadValues();
    }

    public <A extends IListAmplifier> Class<A> getAmplifierClass() {
        return amplifierType.getAmplifierEnumClass();
    }

    public ListAmplifierType getAmplifierType() {
        return amplifierType;
    }

    @Override
    public String getId() {
        return amplifierType.getId();
    }

    @Override
    public String getLabel() {
        return amplifierType.getLabel();
    }

    public List<ListAmplifierValueAdapter<IListAmplifier>> getValues() {
        return values;
    }

    public boolean isStandardAmplifier() {
        return IStandardAmplifier.class.isAssignableFrom(amplifierType.getAmplifierEnumClass());
    }

    @Override
    public boolean isUnknown() {
        return values.get(0).getAmplifier().isUnknown();
    }

    @SuppressWarnings("unchecked")
    protected <A extends IListAmplifier> List<ListAmplifierValueAdapter<A>> loadValues() {
        try {
            Class<A> amplifierClass = getAmplifierClass();
            A[] vals = (A[]) amplifierClass.getMethod("values").invoke(getAmplifierClass());
            return Arrays.stream(vals).map(ListAmplifierValueAdapter::new).toList();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
