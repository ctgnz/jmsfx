package io.github.ctgnz.jmsfx;

import java.util.List;

public interface StandardIdentityGroup extends CodeElement {

    List<StandardIdentity> getIdentities();

    String getGraphicSuffix();

    boolean owns(StandardIdentity id);

}