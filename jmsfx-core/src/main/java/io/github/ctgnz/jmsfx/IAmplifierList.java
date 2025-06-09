package io.github.ctgnz.jmsfx;

import java.util.List;
import java.util.Objects;

public interface IAmplifierList extends ICodeElement {

    IAmplifier getAmplifier();

    <A extends IAmplifierListItem> List<A> getItems();

    List<ISymbolSet> getSymbolSets();

    <A extends IAmplifierListItem> Class<A> getValueClass();

    default boolean isCompatibleWith(ISymbolSet symbolSet) {
        return getSymbolSets().isEmpty() || getSymbolSets().stream().anyMatch(sym -> Objects.equals(sym, symbolSet));
    }

    default boolean isStandardAmplifier() {
        return IStandardAmplifierItem.class.isAssignableFrom(getValueClass());
    }

}