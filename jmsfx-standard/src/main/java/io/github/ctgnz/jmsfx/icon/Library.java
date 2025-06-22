package io.github.ctgnz.jmsfx.icon;

import java.util.EnumSet;
import java.util.List;

import io.github.ctgnz.jmsfx.Context;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.CountryCode;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.Version;
import io.github.ctgnz.jmsfx.icon.amplifier.NatoCountryCode;
import io.github.ctgnz.jmsfx.icon.amplifier.UnknownAmplifier;
import io.github.ctgnz.jmsfx.icon.common.CommonSymbolSet;

public class Library {
    public static final class CodeBuilder {
        private Version version = getDefaultVersion();
        private Context context = getDefaultContext();
        private StandardIdentity standardId = getDefaultStandardIdentity();
        private SymbolSet symbolSet = getDefaultSymbolSet();
        private Status status = getDefaultStatus();
        private HqtfDummy hqtfDummy = getDefaultHqtfDummy();
        private StandardAmplifierItem amplifier = getDefaultAmplifier();
        private StandardAmplifierItem amplifier2 = getDefaultAmplifier();
        private StandardAmplifierItem amplifier3 = getDefaultAmplifier();
        private StandardAmplifierItem frameAmplifier = getDefaultAmplifier();
        private CountryCode countryCode = getExtensionCountryCode();
        private Entity entity;
        private EntityType entityType;
        private EntitySubType entitySubType;
        private SectorOneModifier sectorOneModifier;
        private SectorTwoModifier sectorTwoModifier;

        public CodeBuilder(SymbolSet symbolSet) {
            this.symbolSet = symbolSet;
            this.entity = symbolSet.getEntities().get(0);
        }

        public CodeBuilder amplifier(StandardAmplifierItem amplifier) {
            this.amplifier = amplifier;
            return this;
        }

        public CodeBuilder amplifier2(StandardAmplifierItem amplifier2) {
            this.amplifier2 = amplifier2;
            return this;
        }

        public CodeBuilder amplifier3(StandardAmplifierItem amplifier3) {
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

        public CodeBuilder entity(Entity entity) {
            this.entity = entity;
            return this;
        }

        public CodeBuilder entitySubType(EntitySubType entitySubType) {
            this.entitySubType = entitySubType;
            return this;
        }

        public CodeBuilder entityType(EntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        public CodeBuilder frameAmplifier(StandardAmplifierItem frameAmplifier) {
            this.frameAmplifier = frameAmplifier;
            return this;
        }

        public CodeBuilder sectorOneModifier(SectorOneModifier sectorOneModifier) {
            this.sectorOneModifier = sectorOneModifier;
            return this;
        }

        public CodeBuilder sectorTwoModifier(SectorTwoModifier sectorTwoModifier) {
            this.sectorTwoModifier = sectorTwoModifier;
            return this;
        }

        public CodeBuilder with(Context context) {
            this.context = context;
            return this;
        }

        public CodeBuilder with(CountryCode countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public CodeBuilder with(HqtfDummy hqtfDummy) {
            this.hqtfDummy = hqtfDummy;
            return this;
        }

        public CodeBuilder with(StandardIdentity standardId) {
            this.standardId = standardId;
            return this;
        }

        public CodeBuilder with(Status status) {
            this.status = status;
            return this;
        }

        public CodeBuilder with(Version version) {
            this.version = version;
            return this;
        }

    }

    private static final EnumSet<StandardIdentityEnum> KNOWN_IDENTITIES = EnumSet.of(StandardIdentityEnum.SI_UNKNOWN, StandardIdentityEnum.SI_FRIEND, StandardIdentityEnum.SI_NEUTRAL, StandardIdentityEnum.SI_HOSTILE_FAKER);
    private static final EnumSet<StandardIdentityEnum> HOSTILE_IDENTITIES = EnumSet.of(StandardIdentityEnum.SI_SUSPECT_JOKER, StandardIdentityEnum.SI_HOSTILE_FAKER);
    private static CountryCode extensionCountryCode = NatoCountryCode.UNDEFINED;

    public static CodeBuilder code() {
        return new CodeBuilder(getDefaultSymbolSet());
    }

    public static CodeBuilder code(SymbolSet symbolSet) {
        return new CodeBuilder(symbolSet);
    }

    public static List<SectorOneModifier> getCommonSectorOneModifiers() {
        return CommonSymbolSet.INSTANCE.getSectorOneModifiers();
    }

    public static List<SectorTwoModifier> getCommonSectorTwoModifiers() {
        return CommonSymbolSet.INSTANCE.getSectorTwoModifiers();
    }

    public static StandardAmplifierItem getDefaultAmplifier() {
        return UnknownAmplifier.NA;
    }

    public static Context getDefaultContext() {
        return ContextEnum.REALITY;
    }

    public static HqtfDummy getDefaultHqtfDummy() {
        return HqtfDummyEnum.NA;
    }

    public static StandardIdentity getDefaultStandardIdentity() {
        return StandardIdentityEnum.SI_FRIEND;
    }

    public static Status getDefaultStatus() {
        return StatusEnum.PRESENT;
    }

    public static SymbolSet getDefaultSymbolSet() {
        return SymbolSetEnum.UNKNOWN;
    }

    public static Version getDefaultVersion() {
        return VersionEnum.CURRENT;
    }

    public static CountryCode getExtensionCountryCode() {
        return extensionCountryCode;
    }

    public static EnumSet<StandardIdentityEnum> getHostileIdentities() {
        return HOSTILE_IDENTITIES;
    }

    public static EnumSet<StandardIdentityEnum> getKnownIdentities() {
        return KNOWN_IDENTITIES;
    }

    public static void setExtensionCountryCode(CountryCode countryCode) {
        extensionCountryCode = countryCode;
    }

}