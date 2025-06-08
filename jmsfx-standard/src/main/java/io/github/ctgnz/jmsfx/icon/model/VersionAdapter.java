package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.IVersion;
import io.github.ctgnz.jmsfx.icon.Version;

public class VersionAdapter extends CodeElementAdapter implements IVersion {

    public VersionAdapter() {
    }

    public VersionAdapter(Version version) {
    }

    @Override
    public String toString() {
        return getLabel();
    }

}
