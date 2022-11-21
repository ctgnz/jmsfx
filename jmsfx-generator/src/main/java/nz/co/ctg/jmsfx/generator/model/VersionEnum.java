package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.Library.Versions.Version;

public class VersionEnum extends StandardEnum {

    public VersionEnum(Version version) {
        super(version.getName(), version.getDescription(), version.getVersionCode().getCodeString());
    }

}
