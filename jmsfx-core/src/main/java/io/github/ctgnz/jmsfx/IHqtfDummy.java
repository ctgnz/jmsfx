package io.github.ctgnz.jmsfx;

import java.util.List;
import java.util.Objects;

public interface IHqtfDummy extends ICodeElement {

    List<String> getDimensionIds();

    default String getGraphicLocation(IStandardIdentity identity, ISymbolSet symbolSet) {
        return String.format("/svg/HQTFFD/%s%s%s.svg", identity.getGroupId(), symbolSet.getDimensionId(), getId());
    }

    default boolean isSupported(ISymbolSet symbolSet) {
        return getDimensionIds().isEmpty() || getDimensionIds().stream().anyMatch(dim -> Objects.equals(dim, symbolSet.getDimension().getName()));
    }

}