package io.github.ctgnz.jmsfx.icon;

import java.util.stream.Stream;

import org.apache.commons.lang3.ObjectUtils;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.SvgGraphic;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.Context;
import io.github.ctgnz.jmsfx.CountryCode;
import io.github.ctgnz.jmsfx.Dimension;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.MainElement;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.Version;
import io.github.ctgnz.jmsfx.icon.amplifier.NatoCountryCode;
import io.github.ctgnz.jmsfx.icon.amplifier.UnknownAmplifier;
import io.github.ctgnz.jmsfx.icon.common.CommonEntity;
import io.github.ctgnz.jmsfx.icon.common.CommonEntitySubType;
import io.github.ctgnz.jmsfx.icon.common.CommonEntityType;
import io.github.ctgnz.jmsfx.icon.common.CommonSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.common.CommonSectorTwoModifier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StandardIconLibrary implements IconLibrary {
    private static final StandardIconLibrary INSTANCE = new StandardIconLibrary();

    public static StandardIconLibrary instance() {
        return INSTANCE;
    }

    private final FoxgloveParser parser = new FoxgloveParser();
    private CountryCode extensionCountryCode = CountryCode.UNDEFINED;

    public StandardIconLibrary() {
    }

    @Override
    public ObservableList<Amplifier> getAmplifiers() {
        return FXCollections.observableArrayList(AmplifierEnum.values());
    }

    @Override
    public ObservableList<SectorOneModifier> getCommonSectorOneModifiers() {
        return FXCollections.observableArrayList(CommonSectorOneModifier.values());
    }

    @Override
    public ObservableList<SectorTwoModifier> getCommonSectorTwoModifiers() {
        return FXCollections.observableArrayList(CommonSectorTwoModifier.values());
    }

    @Override
    public ObservableList<Context> getContexts() {
        return FXCollections.observableArrayList(ContextEnum.values());
    }

    @Override
    public ObservableList<CountryCode> getCountryCodes() {
        return FXCollections.observableArrayList(Stream.concat(Stream.of(CountryCode.UNDEFINED), Stream.of(NatoCountryCode.values())).toList());
    }

    @Override
    public StandardAmplifierItem getDefaultAmplifier() {
        return UnknownAmplifier.NA;
    }

    @Override
    public Context getDefaultContext() {
        return ContextEnum.REALITY;
    }

    @Override
    public Entity getDefaultEntity() {
        return CommonEntity.UNSPECIFIED;
    }

    @Override
    public EntitySubType getDefaultEntitySubType() {
        return CommonEntitySubType.UNSPECIFIED_SUB_TYPE;
    }

    @Override
    public EntityType getDefaultEntityType() {
        return CommonEntityType.UNSPECIFIED_TYPE;
    }

    @Override
    public HqtfDummy getDefaultHqtfDummy() {
        return HqtfDummyEnum.NA;
    }

    @Override
    public SectorOneModifier getDefaultSectorOneModifier() {
        return CommonSectorOneModifier.UNSPECIFIED_MOD;
    }

    @Override
    public SectorTwoModifier getDefaultSectorTwoModifier() {
        return CommonSectorTwoModifier.UNSPECIFIED_2_MOD;
    }

    @Override
    public StandardIdentity getDefaultStandardIdentity() {
        return StandardIdentityEnum.SI_FRIEND;
    }

    @Override
    public Status getDefaultStatus() {
        return StatusEnum.PRESENT;
    }

    @Override
    public SymbolSet getDefaultSymbolSet() {
        return SymbolSetEnum.COMMON;
    }

    @Override
    public Version getDefaultVersion() {
        return VersionEnum.CURRENT;
    }

    @Override
    public ObservableList<Dimension> getDimensions() {
        return FXCollections.observableArrayList(DimensionEnum.values());
    }

    @Override
    public CountryCode getExtensionCountryCode() {
        return extensionCountryCode;
    }

    @Override
    public ObservableList<HqtfDummy> getHqtfDummys() {
        return FXCollections.observableArrayList(HqtfDummyEnum.values());
    }

    @Override
    public ObservableList<AmplifierList> getListAmplifiers() {
        return FXCollections.observableArrayList(AmplifierListEnum.values());
    }

    @Override
    public ObservableList<StandardIdentity> getStandardIdentities() {
        return FXCollections.observableArrayList(StandardIdentityEnum.values());
    }

    @Override
    public ObservableList<StandardIdentityGroup> getStandardIdentityGroups() {
        return FXCollections.observableArrayList(StandardIdentityGroupEnum.values());
    }

    @Override
    public ObservableList<Status> getStatuses() {
        return FXCollections.observableArrayList(StatusEnum.values());
    }

    @Override
    public ObservableList<SymbolSet> getSymbolSets() {
        return FXCollections.observableArrayList(SymbolSetEnum.values());
    }

    @Override
    public ObservableList<Version> getVersions() {
        return FXCollections.observableArrayList(VersionEnum.values());
    }

    @Override
    public SvgGraphic loadAmplifierGraphic(AmplifierListItem amplifierItem, StandardIdentity identity) {
        if (!amplifierItem.isUnknown() && amplifierItem.isGraphicalIcon()) {
            return parser.parseFile(amplifierItem.getGraphicLocation(identity));
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadFrameGraphic(SymbolSet symbolSet, StandardIdentity identity, Status status, boolean civilianEntity) {
        if (symbolSet != null && symbolSet.isPointGeometry()) {
            String filePath = symbolSet.getFrameLocation(identity, status, civilianEntity);
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadFrameOverlayGraphic(Context context) {
        if (!context.isReality()) {
            return parser.parseFile(context.getOverlayGraphicLocation());
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadHqtfDummyGraphic(HqtfDummy hqtfDummy, StandardIdentity identity, SymbolSet symbolSet) {
        if (!hqtfDummy.isUnknown()) {
            return parser.parseFile(hqtfDummy.getGraphicLocation(identity, symbolSet));
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadMainIconGraphic(MainElement mainIconElement, StandardIdentity identity) {
        if (mainIconElement.isGraphicalIcon()) {
            String filePath = mainIconElement.getGraphicLocation(identity);
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadSectorOneModifierGraphic(SectorOneModifier sectorOneModifier) {
        if (!sectorOneModifier.isUnknown()) {
            return parser.parseFile(sectorOneModifier.getFullGraphicLocation());
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadSectorTwoModifierGraphic(SectorTwoModifier sectorTwoModifier) {
        if (!sectorTwoModifier.isUnknown()) {
            return parser.parseFile(sectorTwoModifier.getFullGraphicLocation());
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadStatusGraphic(Status status, boolean isStatusIconUsed, StandardIdentity identity, SymbolSet symbolSet) {
        if (isStatusIconUsed) {
            return parser.parseFile(status.getGraphicLocation(identity, symbolSet));
        } else {
            return null;
        }
    }

    @Override
    public void setExtensionCountryCode(CountryCode countryCode) {
        this.extensionCountryCode = ObjectUtils.defaultIfNull(countryCode, CountryCode.UNDEFINED);
    }

}