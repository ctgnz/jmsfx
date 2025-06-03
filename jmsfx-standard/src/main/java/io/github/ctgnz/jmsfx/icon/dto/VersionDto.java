package io.github.ctgnz.jmsfx.icon.dto;

import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;
import io.github.ctgnz.jmsfx.icon.Version;

public class VersionDto implements SymbolIdentificationCodeElement {

    private final Version version;

    public VersionDto(Version version) {
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
