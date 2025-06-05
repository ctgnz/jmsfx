package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IStatus;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.Library;
import io.github.ctgnz.jmsfx.icon.Status;

public class StatusAdapter implements IStatus {

    private final Status status;

    public StatusAdapter(Status status) {
        this.status = status;
    }

    public String getFrameId(StandardIdentityAdapter identity) {
        return Library.getKnownIdentities().contains(identity.getIdentity()) ? status.getId() : Status.PRESENT.getId();
    }

    public String getGraphicLocation(StandardIdentityAdapter identity, SymbolSetAdapter symbolSet) {
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

    @Override
    public boolean isOperationalCondition() {
        return status.isOperationalCondition();
    }

    public boolean isPresent() {
        return status == Status.PRESENT;
    }

    public boolean isSupported(SymbolSetAdapter symbolSet) {
        return status.isSupported(symbolSet.getSymbolSet());
    }

    @Override
    public String[] getDimensionIds() {
        return status.getDimensionIds();
    }

    @Override
    public boolean isSupported(ISymbolSet symbolSet) {
        return status.isSupported(symbolSet);
    }

}
