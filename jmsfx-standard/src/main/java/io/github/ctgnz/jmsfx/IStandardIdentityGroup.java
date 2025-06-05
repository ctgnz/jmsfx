package io.github.ctgnz.jmsfx;

public interface IStandardIdentityGroup extends ICodeElement {

    IStandardIdentity[] getIdentities();

    String getGraphicSuffix();

    boolean owns(IStandardIdentity id);

}