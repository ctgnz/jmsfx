package io.github.ctgnz.jmsfx.icon;

import io.github.ctgnz.jmsfx.Context;
import io.github.ctgnz.jmsfx.CountryCode;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.Version;

public final class IdentificationSymbolBuilder {
    private IconLibrary library;
    private Version version;
    private Context context;
    private StandardIdentity standardId;
    private SymbolSet symbolSet;
    private Status status;
    private HqtfDummy hqtfDummy;
    private StandardAmplifierItem amplifier;
    private StandardAmplifierItem amplifier2;
    private StandardAmplifierItem amplifier3;
    private StandardAmplifierItem frameAmplifier;
    private CountryCode countryCode;
    private Entity entity;
    private EntityType entityType;
    private EntitySubType entitySubType;
    private SectorOneModifier sectorOneModifier;
    private SectorTwoModifier sectorTwoModifier;

    public IdentificationSymbolBuilder(IconLibrary library, SymbolSet symbolSet) {
        this.library = library;
        this.symbolSet = symbolSet;
        initDefaults();
    }

    public IdentificationSymbolBuilder amplifier(StandardAmplifierItem amplifier) {
        this.amplifier = amplifier;
        return this;
    }

    public IdentificationSymbolBuilder amplifier2(StandardAmplifierItem amplifier2) {
        this.amplifier2 = amplifier2;
        return this;
    }

    public IdentificationSymbolBuilder amplifier3(StandardAmplifierItem amplifier3) {
        this.amplifier3 = amplifier3;
        return this;
    }

    public IdentificationSymbol build() {
        IdentificationSymbol code = new IdentificationSymbol(library);
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

    public IdentificationSymbolBuilder entity(Entity entity) {
        this.entity = entity;
        return this;
    }

    public IdentificationSymbolBuilder entitySubType(EntitySubType entitySubType) {
        this.entitySubType = entitySubType;
        return this;
    }

    public IdentificationSymbolBuilder entityType(EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    public IdentificationSymbolBuilder frameAmplifier(StandardAmplifierItem frameAmplifier) {
        this.frameAmplifier = frameAmplifier;
        return this;
    }

    public IdentificationSymbolBuilder sectorOneModifier(SectorOneModifier sectorOneModifier) {
        this.sectorOneModifier = sectorOneModifier;
        return this;
    }

    public IdentificationSymbolBuilder sectorTwoModifier(SectorTwoModifier sectorTwoModifier) {
        this.sectorTwoModifier = sectorTwoModifier;
        return this;
    }

    public IdentificationSymbolBuilder with(Context context) {
        this.context = context;
        return this;
    }

    public IdentificationSymbolBuilder with(CountryCode countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public IdentificationSymbolBuilder with(HqtfDummy hqtfDummy) {
        this.hqtfDummy = hqtfDummy;
        return this;
    }

    public IdentificationSymbolBuilder with(StandardIdentity standardId) {
        this.standardId = standardId;
        return this;
    }

    public IdentificationSymbolBuilder with(Status status) {
        this.status = status;
        return this;
    }

    public IdentificationSymbolBuilder with(Version version) {
        this.version = version;
        return this;
    }

    protected void initDefaults() {
        this.version = library.getDefaultVersion();
        this.context = library.getDefaultContext();
        this.standardId = library.getDefaultStandardIdentity();
        this.status = library.getDefaultStatus();
        this.hqtfDummy = library.getDefaultHqtfDummy();
        this.amplifier = library.getDefaultAmplifier();
        this.amplifier2 = library.getDefaultAmplifier();
        this.amplifier3 = library.getDefaultAmplifier();
        this.frameAmplifier = library.getDefaultAmplifier();
        this.countryCode = library.getExtensionCountryCode();
        this.entity = symbolSet.getEntities().get(0);
        this.sectorOneModifier = library.getDefaultSectorOneModifier();
        this.sectorTwoModifier = library.getDefaultSectorTwoModifier();
    }

}