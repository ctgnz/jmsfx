package io.github.ctgnz.jmsfx;

public interface IStatus extends ICodeElement {

    String[] getDimensionIds();

    boolean isOperationalCondition();

    boolean isSupported(ISymbolSet symbolSet);

}