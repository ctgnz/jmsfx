package io.github.ctgnz.jmsfx;

import java.util.List;

public interface IHqtfDummy extends ICodeElement {

    List<String> getDimensionIds();

    default String getGraphicLocation(IStandardIdentity identity, ISymbolSet symbolSet) {
        return String.format("/svg/HQTFFD/%s%s%s.svg", identity.getGroupId(), symbolSet.getDimensionId(), getId());
    }

    boolean isSupported(ISymbolSet symbolSet);

}