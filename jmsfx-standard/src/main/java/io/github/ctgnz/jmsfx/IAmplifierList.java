package io.github.ctgnz.jmsfx;

import io.github.ctgnz.jmsfx.icon.SymbolSet;

public interface IAmplifierList extends ICodeElement {

    IAmplifier getAmplifier();

    SymbolSet[] getSymbolSets();

    <A extends IAmplifierListItem> Class<A> getValueClass();

    boolean isCompatibleWith(SymbolSet symbolSet);

}