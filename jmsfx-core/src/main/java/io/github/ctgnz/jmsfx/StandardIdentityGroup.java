package io.github.ctgnz.jmsfx;

import java.util.List;

public interface StandardIdentityGroup extends CodeElement {

    List<StandardIdentity> getIdentities();

    boolean owns(StandardIdentity id);

}