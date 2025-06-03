package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.Context;
import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;

public class ContextDto implements SymbolIdentificationCodeElement {

    private final Context context;

    public ContextDto(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public String getId() {
        return context.getId();
    }

    @Override
    public String getLabel() {
        return context.getLabel();
    }

    public boolean isReality() {
        return context == Context.REALITY;
    }

    public String getOverlayGraphicLocation() {
        return String.format("/svg/Frames/Overlay/%s.svg", context.getId());
    }

}
