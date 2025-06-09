package io.github.ctgnz.jmsfx.icon;

import java.util.EnumSet;
import java.util.List;

import io.github.ctgnz.jmsfx.IContext;
import io.github.ctgnz.jmsfx.ICountryCode;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStatus;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.IVersion;
import io.github.ctgnz.jmsfx.icon.amplifier.CountryCode;
import io.github.ctgnz.jmsfx.icon.amplifier.UnknownAmplifier;
import io.github.ctgnz.jmsfx.icon.common.CommonSymbolSet;

public class Library {
    public static final class CodeBuilder {
        private IVersion version = getDefaultVersion();
        private IContext context = getDefaultContext();
        private IStandardIdentity standardId = getDefaultStandardIdentity();
        private ISymbolSet symbolSet = getDefaultSymbolSet();
        private IStatus status = getDefaultStatus();
        private IHqtfDummy hqtfDummy = getDefaultHqtfDummy();
        private IStandardAmplifierItem amplifier = getDefaultAmplifier();
        private IStandardAmplifierItem amplifier2 = getDefaultAmplifier();
        private IStandardAmplifierItem amplifier3 = getDefaultAmplifier();
        private IStandardAmplifierItem frameAmplifier = getDefaultAmplifier();
        private ICountryCode countryCode = getExtensionCountryCode();
        private IEntity entity;
        private IEntityType entityType;
        private IEntitySubType entitySubType;
        private ISectorOneModifier sectorOneModifier;
        private ISectorTwoModifier sectorTwoModifier;

        public CodeBuilder(ISymbolSet symbolSet) {
            this.symbolSet = symbolSet;
            this.entity = symbolSet.getEntities().get(0);
        }

        public CodeBuilder amplifier(IStandardAmplifierItem amplifier) {
            this.amplifier = amplifier;
            return this;
        }

        public CodeBuilder amplifier2(IStandardAmplifierItem amplifier2) {
            this.amplifier2 = amplifier2;
            return this;
        }

        public CodeBuilder amplifier3(IStandardAmplifierItem amplifier3) {
            this.amplifier3 = amplifier3;
            return this;
        }

        public SymbolIdentificationCode build() {
            SymbolIdentificationCode code = new SymbolIdentificationCode();
            code.setVersion(version);
            code.setContext(context);
            code.setStandardIdentity(standardId);
            code.setSymbolSet(symbolSet);
            code.setStatus(status);
            code.setHqtfDummy(hqtfDummy);
            code.setAmplifier(amplifier);
            code.setAmplifierTwo(amplifier2);
            code.setAmplifierThree(amplifier3);
            code.setFrameAmplifier(frameAmplifier);
            code.setCountryCode(countryCode);
            code.setEntity(entity);
            code.setEntityType(entityType);
            code.setEntitySubType(entitySubType);
            code.setSectorOneModifier(sectorOneModifier);
            code.setSectorTwoModifier(sectorTwoModifier);
            return code;
        }

        public CodeBuilder entity(IEntity entity) {
            this.entity = entity;
            return this;
        }

        public CodeBuilder entitySubType(IEntitySubType entitySubType) {
            this.entitySubType = entitySubType;
            return this;
        }

        public CodeBuilder entityType(IEntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        public CodeBuilder frameAmplifier(IStandardAmplifierItem frameAmplifier) {
            this.frameAmplifier = frameAmplifier;
            return this;
        }

        public CodeBuilder sectorOneModifier(ISectorOneModifier sectorOneModifier) {
            this.sectorOneModifier = sectorOneModifier;
            return this;
        }

        public CodeBuilder sectorTwoModifier(ISectorTwoModifier sectorTwoModifier) {
            this.sectorTwoModifier = sectorTwoModifier;
            return this;
        }

        public CodeBuilder with(IContext context) {
            this.context = context;
            return this;
        }

        public CodeBuilder with(ICountryCode countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public CodeBuilder with(IHqtfDummy hqtfDummy) {
            this.hqtfDummy = hqtfDummy;
            return this;
        }

        public CodeBuilder with(IStandardIdentity standardId) {
            this.standardId = standardId;
            return this;
        }

        public CodeBuilder with(IStatus status) {
            this.status = status;
            return this;
        }

        public CodeBuilder with(IVersion version) {
            this.version = version;
            return this;
        }

    }

    private static final EnumSet<StandardIdentity> KNOWN_IDENTITIES = EnumSet.of(StandardIdentity.SI_UNKNOWN, StandardIdentity.SI_FRIEND, StandardIdentity.SI_NEUTRAL, StandardIdentity.SI_HOSTILE_FAKER);
    private static final EnumSet<StandardIdentity> HOSTILE_IDENTITIES = EnumSet.of(StandardIdentity.SI_SUSPECT_JOKER, StandardIdentity.SI_HOSTILE_FAKER);
    private static ICountryCode extensionCountryCode = CountryCode.UNDEFINED;

    public static CodeBuilder code() {
        return new CodeBuilder(getDefaultSymbolSet());
    }

    public static CodeBuilder code(ISymbolSet symbolSet) {
        return new CodeBuilder(symbolSet);
    }

    public static List<ISectorOneModifier> getCommonSectorOneModifiers() {
        return CommonSymbolSet.INSTANCE.getSectorOneModifiers();
    }

    public static List<ISectorTwoModifier> getCommonSectorTwoModifiers() {
        return CommonSymbolSet.INSTANCE.getSectorTwoModifiers();
    }

    public static IStandardAmplifierItem getDefaultAmplifier() {
        return UnknownAmplifier.NA;
    }

    public static IContext getDefaultContext() {
        return Context.REALITY;
    }

    public static IHqtfDummy getDefaultHqtfDummy() {
        return HqtfDummy.NA;
    }

    public static IStandardIdentity getDefaultStandardIdentity() {
        return StandardIdentity.SI_FRIEND;
    }

    public static IStatus getDefaultStatus() {
        return Status.PRESENT;
    }

    public static ISymbolSet getDefaultSymbolSet() {
        return SymbolSet.UNKNOWN;
    }

    public static IVersion getDefaultVersion() {
        return Version.CURRENT;
    }

    public static ICountryCode getExtensionCountryCode() {
        return extensionCountryCode;
    }

    public static EnumSet<StandardIdentity> getHostileIdentities() {
        return HOSTILE_IDENTITIES;
    }

    public static EnumSet<StandardIdentity> getKnownIdentities() {
        return KNOWN_IDENTITIES;
    }

    public static void setExtensionCountryCode(ICountryCode countryCode) {
        extensionCountryCode = countryCode;
    }

}