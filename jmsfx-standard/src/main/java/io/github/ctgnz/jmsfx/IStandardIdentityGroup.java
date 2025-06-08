package io.github.ctgnz.jmsfx;

import java.util.List;

public interface IStandardIdentityGroup extends ICodeElement {

    List<IStandardIdentity> getIdentities();

    String getGraphicSuffix();

    boolean owns(IStandardIdentity id);

}