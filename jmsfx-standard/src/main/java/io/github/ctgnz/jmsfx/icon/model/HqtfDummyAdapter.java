package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.HqtfDummy;

public class HqtfDummyAdapter implements IHqtfDummy {

    private final HqtfDummy hqtfDummy;

    public HqtfDummyAdapter(HqtfDummy hqtfDummy) {
        this.hqtfDummy = hqtfDummy;
    }

    @Override
    public String[] getDimensionIds() {
        return hqtfDummy.getDimensionIds();
    }

    public String getGraphicLocation(StandardIdentityAdapter identity, SymbolSetAdapter symbolSet) {
        return String.format("/svg/HQTFFD/%s%s%s.svg", identity.getGroup().getId(), symbolSet.getDimensionId(), getHqtfDummy().getId());
    }

    public HqtfDummy getHqtfDummy() {
        return hqtfDummy;
    }

    @Override
    public String getId() {
        return hqtfDummy.getId();
    }

    @Override
    public String getLabel() {
        return hqtfDummy.getLabel();
    }

    @Override
    public boolean isSupported(ISymbolSet symbolSet) {
        return hqtfDummy.isSupported(symbolSet);
    }

    public boolean isSupported(SymbolSetAdapter symbolSet) {
        return hqtfDummy.isSupported(symbolSet.getSymbolSet());
    }

    @Override
    public boolean isUnknown() {
        return hqtfDummy == HqtfDummy.NA;
    }

}
