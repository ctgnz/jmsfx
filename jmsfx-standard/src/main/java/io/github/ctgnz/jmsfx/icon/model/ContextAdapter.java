package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IContext;
import io.github.ctgnz.jmsfx.icon.Context;

public class ContextAdapter implements IContext {

    private final Context context;

    public ContextAdapter(Context context) {
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
