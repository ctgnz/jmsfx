package io.github.ctgnz.jmsfx.icon.dto;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.github.ctgnz.jmsfx.icon.ListAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.StandardAmplifier;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;

public class ListAmplifierDto implements SymbolIdentificationCodeElement {

    private final ListAmplifierType amplifierType;
    private List<ListAmplifierValue<ListAmplifier>> values;

    public ListAmplifierDto(ListAmplifierType amplifierType) {
        this.amplifierType = amplifierType;
        this.values = loadValues();
    }

    public <A extends ListAmplifier> Class<A> getAmplifierClass() {
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

    public List<ListAmplifierValue<ListAmplifier>> getValues() {
        return values;
    }

    public boolean isStandardAmplifier() {
        return StandardAmplifier.class.isAssignableFrom(amplifierType.getAmplifierEnumClass());
    }

    @Override
    public boolean isUnknown() {
        return values.get(0).getAmplifier().isUnknown();
    }

    @SuppressWarnings("unchecked")
    protected <A extends ListAmplifier> List<ListAmplifierValue<A>> loadValues() {
        try {
            Class<A> amplifierClass = getAmplifierClass();
            A[] vals = (A[]) amplifierClass.getMethod("values").invoke(getAmplifierClass());
            return Arrays.stream(vals).map(ListAmplifierValue::new).toList();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
