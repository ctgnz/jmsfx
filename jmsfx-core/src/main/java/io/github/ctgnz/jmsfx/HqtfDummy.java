package io.github.ctgnz.jmsfx;

import java.util.List;
import java.util.Objects;

public interface HqtfDummy extends CodeElement {

    List<String> getDimensionIds();

    default String getGraphicLocation(StandardIdentity identity, SymbolSet symbolSet) {
        return String.format("/svg/HQTFFD/%s%s%s.svg", identity.getGroupId(), symbolSet.getDimensionId(), getId());
    }

    default boolean isSupported(SymbolSet symbolSet) {
        return getDimensionIds().isEmpty() || getDimensionIds().stream().anyMatch(dim -> Objects.equals(dim, symbolSet.getDimension().getName()));
    }

}