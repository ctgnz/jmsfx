package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.Status;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCode;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;

public class StatusDto implements SymbolIdentificationCodeElement {

    private final Status status;

    public StatusDto(Status status) {
        this.status = status;
    }

    public String getFrameId(StandardIdentityDto identity) {
        return SymbolIdentificationCode.KNOWN_IDENTITIES.contains(identity.getIdentity()) ? status.getId() : Status.PRESENT.getId();
    }

    public String getGraphicLocation(StandardIdentityDto identity, SymbolSetDto symbolSet) {
        return String.format("/svg/OCA/0%s%s%s2.svg", identity.getGroup().getId(), symbolSet.getFrameId(), getStatus().getId());
    }

    @Override
    public String getId() {
        return status.getId();
    }

    @Override
    public String getLabel() {
        return status.getLabel();
    }

    public Status getStatus() {
        return status;
    }

    public boolean isFrameStatus() {
        return !status.isOperationalCondition();
    }

    public boolean isOperationalCondition() {
        return status.isOperationalCondition();
    }

    public boolean isPresent() {
        return status == Status.PRESENT;
    }

    public boolean isSupported(SymbolSetDto symbolSet) {
        return status.isSupported(symbolSet.getSymbolSet());
    }

}
