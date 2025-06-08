package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IVersion;
import io.github.ctgnz.jmsfx.icon.Version;

public class VersionAdapter implements IVersion {

    private final Version model;

    public VersionAdapter(Version version) {
        this.model = version;
    }

    @Override
    public String getId() {
        return model.getId();
    }

    @Override
    public String getLabel() {
        return model.getLabel();
    }

    public Version getModel() {
        return model;
    }

}
