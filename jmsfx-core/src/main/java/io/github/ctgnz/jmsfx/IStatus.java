package io.github.ctgnz.jmsfx;

import java.util.List;

public interface IStatus extends ICodeElement {

    List<String> getDimensionIds();

    default String getGraphicLocation(IStandardIdentity identity, ISymbolSet symbolSet) {
        return String.format("/svg/OCA/0%s%s%s2.svg", identity.getGroupId(), symbolSet.getFrameId(), getId());
    }

    default boolean isFrameStatus() {
        return !isOperationalCondition();
    }

    boolean isOperationalCondition();

    boolean isPresent();

    default String getFrameId(IStandardIdentity identity) {
        return identity.isConfirmed() ? getId() : "0";
    }

    default boolean isSupported(ISymbolSet symbolSet) {
        return getDimensionIds().isEmpty() || getDimensionIds().contains(symbolSet.getDimension().getName());
    }

}