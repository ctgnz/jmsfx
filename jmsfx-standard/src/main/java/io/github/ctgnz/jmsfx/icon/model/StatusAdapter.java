package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IStatus;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.Library;
import io.github.ctgnz.jmsfx.icon.Status;

public class StatusAdapter implements IStatus {

    private final Status model;

    public StatusAdapter(Status status) {
        this.model = status;
    }

    @Override
    public String[] getDimensionIds() {
        return model.getDimensionIds();
    }

    public String getFrameId(StandardIdentityAdapter identity) {
        return Library.getKnownIdentities().contains(identity.getModel()) ? model.getId() : Status.PRESENT.getId();
    }

    public String getGraphicLocation(StandardIdentityAdapter identity, SymbolSetAdapter symbolSet) {
        return String.format("/svg/OCA/0%s%s%s2.svg", identity.getGroup().getId(), symbolSet.getFrameId(), getModel().getId());
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public Status getModel() {
        return model;
    }

    public boolean isFrameStatus() {
        return !model.isOperationalCondition();
    }

    @Override
    public boolean isOperationalCondition() {
        return model.isOperationalCondition();
    }

    public boolean isPresent() {
        return model == Status.PRESENT;
    }

    @Override
    public boolean isSupported(ISymbolSet symbolSet) {
        return model.isSupported(symbolSet);
    }

    public boolean isSupported(SymbolSetAdapter symbolSet) {
        return model.isSupported(symbolSet.getModel());
    }

}
