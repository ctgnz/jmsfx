package io.github.ctgnz.jmsfx.icon.editor;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.Version;
import io.github.ctgnz.jmsfx.icon.VersionEnum;

public class VersionImpl extends CodeElementImpl implements Version {

    public VersionImpl() {
    }

    public VersionImpl(VersionEnum version) {
        super(version);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VersionImpl rhs) {
            return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(8353, 3539).append(getId()).toHashCode();
    }

}
