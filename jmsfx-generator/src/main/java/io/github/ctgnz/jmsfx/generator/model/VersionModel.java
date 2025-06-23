package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.Versions.Version;

public class VersionModel extends StandardEnumModel {

    public VersionModel(Version version) {
        super(version.getName(), version.getDescription(), version.getVersionCode().getCodeString(), null);
    }

}
