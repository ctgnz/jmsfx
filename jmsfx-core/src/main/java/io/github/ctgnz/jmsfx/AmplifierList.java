package io.github.ctgnz.jmsfx;

import java.util.List;
import java.util.Objects;

public interface AmplifierList extends CodeElement {

    Amplifier getAmplifier();

    <A extends AmplifierListItem> List<A> getItems();

    List<SymbolSet> getSymbolSets();

    <A extends AmplifierListItem> Class<A> getValueClass();

    default boolean isCompatibleWith(SymbolSet symbolSet) {
        return getSymbolSets().isEmpty() || getSymbolSets().stream().anyMatch(sym -> Objects.equals(sym, symbolSet));
    }

    default boolean isStandardAmplifier() {
        return StandardAmplifierItem.class.isAssignableFrom(getValueClass());
    }

}