package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.HqtfDummy;

public class HqtfDummyAdapter implements IHqtfDummy {

    private final HqtfDummy model;

    public HqtfDummyAdapter(HqtfDummy hqtfDummy) {
        this.model = hqtfDummy;
    }

    @Override
    public String[] getDimensionIds() {
        return model.getDimensionIds();
    }

    public String getGraphicLocation(StandardIdentityAdapter identity, SymbolSetAdapter symbolSet) {
        return String.format("/svg/HQTFFD/%s%s%s.svg", identity.getGroup().getId(), symbolSet.getDimensionId(), getModel().getId());
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public HqtfDummy getModel() {
        return model;
    }

    @Override
    public boolean isSupported(ISymbolSet symbolSet) {
        return model.isSupported(symbolSet);
    }

    public boolean isSupported(SymbolSetAdapter symbolSet) {
        return model.isSupported(symbolSet.getModel());
    }

    @Override
    public boolean isUnknown() {
        return model == HqtfDummy.NA;
    }

}
