package ${iconPackage};

import java.util.Objects;
import java.util.stream.Stream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.SvgGraphic;

import ${basePackage}.Amplifier;
import ${basePackage}.AmplifierList;
import ${basePackage}.AmplifierListItem;
import ${basePackage}.Context;
import ${basePackage}.CountryCode;
import ${basePackage}.Dimension;
import ${basePackage}.Entity;
import ${basePackage}.EntitySubType;
import ${basePackage}.EntityType;
import ${basePackage}.HqtfDummy;
import ${basePackage}.IconLibrary;
import ${basePackage}.MainElement;
import ${basePackage}.SectorOneModifier;
import ${basePackage}.SectorTwoModifier;
import ${basePackage}.StandardAmplifierItem;
import ${basePackage}.StandardIdentity;
import ${basePackage}.StandardIdentityGroup;
import ${basePackage}.Status;
import ${basePackage}.SymbolSet;
import ${basePackage}.Version;
import ${amplifierPackage}.${countryCodeClass};
import ${amplifierPackage}.UnknownAmplifier;
import ${commonPackage}.CommonEntity;
import ${commonPackage}.CommonEntitySubType;
import ${commonPackage}.CommonEntityType;
import ${commonPackage}.CommonSectorOneModifier;
import ${commonPackage}.CommonSectorTwoModifier;

public class ${libraryPrefix}IconLibrary implements IconLibrary {

    /**
     * The one instance, which {@link java.util.ServiceLoader} built.
     * <p>
     * Prefer {@link IconLibrary#discover()} over naming this class. An application depends on
     * exactly one symbology library and there is no choice to make at this point, so compiling in
     * which one it is only prevents the same application running against another.
     * <p>
     * This deliberately does not hold a singleton of its own. The library carries mutable state -
     * the extension country code - so a second instance beside the discovered one would be a
     * library that silently disagreed with itself about its own configuration.
     */
    public static ${libraryPrefix}IconLibrary instance() {
        return (${libraryPrefix}IconLibrary) IconLibrary.discover();
    }

    private final FoxgloveParser parser = new FoxgloveParser();
    private CountryCode extensionCountryCode = CountryCode.UNDEFINED;

    /**
     * For {@link java.util.ServiceLoader}, which requires a public no-arg constructor of a provider
     * declared in {@code META-INF/services} - its static {@code provider()} convention applies only
     * to providers in named modules, and these libraries are used on the classpath.
     * <p>
     * Not for calling. Use {@link IconLibrary#discover()}, or {@link #instance()}, both of which
     * return the single instance the service loader created.
     */
    public ${libraryPrefix}IconLibrary() {
    }

    /** The library prefix this was generated with, which is what names the class too. */
    @Override
    public String getName() {
        return "${libraryPrefix}";
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
        return FXCollections.observableArrayList(Stream.concat(Stream.of(CountryCode.UNDEFINED), Stream.of(${countryCodeClass}.values()))
            .toList());
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
        return CommonSectorOneModifier.UNSPECIFIED;
    }

    @Override
    public SectorTwoModifier getDefaultSectorTwoModifier() {
        return CommonSectorTwoModifier.UNSPECIFIED;
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
        this.extensionCountryCode = Objects.requireNonNullElse(countryCode, CountryCode.UNDEFINED);
    }

}