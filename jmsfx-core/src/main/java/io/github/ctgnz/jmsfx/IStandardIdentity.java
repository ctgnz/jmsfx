package io.github.ctgnz.jmsfx;

public interface IStandardIdentity extends ICodeElement {

    IStandardIdentityGroup getGroup();

    String getGroupId();

    boolean isConfirmed();

    boolean isHostile();

}