package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.Versions.Version;

public class VersionEnum extends StandardEnum {

    public VersionEnum(Version version) {
        super(version.getName(), version.getDescription(), version.getVersionCode().getCodeString(), null);
    }

}
