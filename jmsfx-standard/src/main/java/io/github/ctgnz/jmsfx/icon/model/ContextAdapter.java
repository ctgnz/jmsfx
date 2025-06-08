package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IContext;
import io.github.ctgnz.jmsfx.icon.Context;

public class ContextAdapter implements IContext {

    private final Context model;

    public ContextAdapter(Context context) {
        this.model = context;
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public Context getModel() {
        return model;
    }

    public String getOverlayGraphicLocation() {
        return String.format("/svg/Frames/Overlay/%s.svg", model.getId());
    }

    public boolean isReality() {
        return model == Context.REALITY;
    }

}
