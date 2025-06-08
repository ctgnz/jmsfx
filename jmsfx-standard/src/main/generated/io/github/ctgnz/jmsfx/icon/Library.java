package io.github.ctgnz.jmsfx.icon;

import java.util.EnumSet;

import io.github.ctgnz.jmsfx.IContext;
import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStatus;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.IVersion;
import io.github.ctgnz.jmsfx.icon.amplifier.CountryCode;
import io.github.ctgnz.jmsfx.icon.amplifier.UnknownAmplifier;

public class Library {
    private static final EnumSet<Status> ICON_STATUS = EnumSet.of(Status.FULLY_CAPABLE, Status.DAMAGED, Status.DESTROYED, Status.FULL);
    private static final EnumSet<StandardIdentity> KNOWN_IDENTITIES = EnumSet.of(StandardIdentity.SI_UNKNOWN, StandardIdentity.SI_FRIEND, StandardIdentity.SI_NEUTRAL, StandardIdentity.SI_HOSTILE_FAKER);
    private static final EnumSet<StandardIdentity> UNKNOWN_IDENTITIES = EnumSet.complementOf(KNOWN_IDENTITIES);
    private static final EnumSet<StandardIdentity> HOSTILE_IDENTITIES = EnumSet.of(StandardIdentity.SI_SUSPECT_JOKER, StandardIdentity.SI_HOSTILE_FAKER);
    private static final IVersion DEFAULT_VERSION = Version.CURRENT;
    private static final IContext DEFAULT_CONTEXT = Context.REALITY;
    private static final IStandardIdentity DEFAULT_STANDARD_ID = StandardIdentity.SI_FRIEND;
    private static final ISymbolSet DEFAULT_SYMBOL_SET = SymbolSet.UNKNOWN;
    private static final IStatus DEFAULT_STATUS = Status.PRESENT;
    private static final IHqtfDummy DEFAULT_HQTF_DUMMY = HqtfDummy.NA;
    private static final IStandardAmplifierItem DEFAULT_AMPLIFIER = UnknownAmplifier.NA;
    private static CountryCode extensionCountryCode = CountryCode.UNDEFINED;

    public static IStandardAmplifierItem getDefaultAmplifier() {
        return DEFAULT_AMPLIFIER;
    }

    public static IContext getDefaultContext() {
        return DEFAULT_CONTEXT;
    }

    public static IHqtfDummy getDefaultHqtfDummy() {
        return DEFAULT_HQTF_DUMMY;
    }

    public static IStandardIdentity getDefaultStandardIdentity() {
        return DEFAULT_STANDARD_ID;
    }

    public static IStatus getDefaultStatus() {
        return DEFAULT_STATUS;
    }

    public static ISymbolSet getDefaultSymbolSet() {
        return DEFAULT_SYMBOL_SET;
    }

    public static IVersion getDefaultVersion() {
        return DEFAULT_VERSION;
    }

    public static CountryCode getExtensionCountryCode() {
        return extensionCountryCode;
    }

    public static EnumSet<StandardIdentity> getHostileIdentities() {
        return HOSTILE_IDENTITIES;
    }

    public static EnumSet<Status> getIconStatusValues() {
        return ICON_STATUS;
    }

    public static EnumSet<StandardIdentity> getKnownIdentities() {
        return KNOWN_IDENTITIES;
    }

    public static EnumSet<StandardIdentity> getUnknownIdentities() {
        return UNKNOWN_IDENTITIES;
    }

    public static void setExtensionCountryCode(CountryCode countryCode) {
        extensionCountryCode = countryCode;
    }

}