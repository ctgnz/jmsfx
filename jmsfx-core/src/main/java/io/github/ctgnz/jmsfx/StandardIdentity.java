package io.github.ctgnz.jmsfx;

public interface StandardIdentity extends CodeElement {

    StandardIdentityGroup getGroup();

    String getGroupId();

    boolean isConfirmed();

    boolean isHostile();

}