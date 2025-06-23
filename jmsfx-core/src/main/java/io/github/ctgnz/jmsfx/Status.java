package io.github.ctgnz.jmsfx;

import java.util.List;

public interface Status extends CodeElement {

    List<String> getDimensionIds();

    default String getGraphicLocation(StandardIdentity identity, SymbolSet symbolSet) {
        return String.format("/svg/OCA/0%s%s%s2.svg", identity.getGroupId(), symbolSet.getFrameId(), getId());
    }

    default boolean isFrameStatus() {
        return !isOperationalCondition();
    }

    boolean isOperationalCondition();

    boolean isPlanned();

    boolean isPresent();

    default String getFrameId(StandardIdentity identity) {
        return identity.isConfirmed() ? getId() : "0";
    }

    default boolean isSupported(SymbolSet symbolSet) {
        return getDimensionIds().isEmpty() || getDimensionIds().contains(symbolSet.getDimension().getName());
    }

}