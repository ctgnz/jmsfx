package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.Version;
import io.github.ctgnz.jmsfx.icon.VersionEnum;

public class VersionImpl extends CodeElementImpl implements Version {

    public VersionImpl() {
    }

    public VersionImpl(VersionEnum version) {
        super(version);
    }

}
