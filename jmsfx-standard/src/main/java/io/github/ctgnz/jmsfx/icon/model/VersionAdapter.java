package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IVersion;
import io.github.ctgnz.jmsfx.icon.Version;

public class VersionAdapter implements IVersion {

    private final Version version;

    public VersionAdapter(Version version) {
        this.version = version;
    }

    @Override
    public String getId() {
        return version.getId();
    }

    @Override
    public String getLabel() {
        return version.getLabel();
    }

    public Version getVersion() {
        return version;
    }

}
