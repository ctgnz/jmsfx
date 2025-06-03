package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.HqtfDummy;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;

public class HqtfDummyDto implements SymbolIdentificationCodeElement {

    private final HqtfDummy hqtfDummy;

    public HqtfDummyDto(HqtfDummy hqtfDummy) {
        this.hqtfDummy = hqtfDummy;
    }

    public String getGraphicLocation(StandardIdentityDto identity, SymbolSetDto symbolSet) {
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
    public boolean isUnknown() {
        return hqtfDummy == HqtfDummy.NA;
    }

    public boolean isSupported(SymbolSetDto symbolSet) {
        return hqtfDummy.isSupported(symbolSet.getSymbolSet());
    }

}
