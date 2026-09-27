package ${iconPackage};

import java.util.Objects;
import java.util.stream.Stream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

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
import ${basePackage}.FragmentMarkup;
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

    private int fellBackToClasspath;
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

    /**
     * The element's own markup as a graphic, or null when it carries none and the fragment has to be read from the classpath instead.
     * <p>
     * Parsed fresh each time rather than cached. {@code FoxgloveParser} caches by path and hands the same object back, which is what lets one symbol's recolouring leak onto the next
     * (jmsfx#121); injected markup has no path to key on and no reason to be shared. Whether the parse cost matters is a question for measurement, not assumption.
     */
    private SvgGraphic parseInjected(String markup) {
        String document = FragmentMarkup.document(markup);
        if (document == null) {
            fellBackToClasspath++;
            return null;
        }
        try {
            return parser.parse(new ByteArrayInputStream(document.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new IllegalStateException("injected markup would not parse: " + markup, e);
        }
    }

    /**
     * How many times a caller asked for something this library was supposed to carry and did not.
     * <p>
     * Not a statistic for its own sake. The markup is generated from the model, so a mismatch between what is injected and what is asked for would otherwise be invisible: rendering
     * would fall back to the file and look perfectly correct, while injection quietly did nothing.
     */
    public int getClasspathFallbacks() {
        return fellBackToClasspath;
    }

    @Override
    public SvgGraphic loadMainIconGraphic(MainElement mainIconElement, StandardIdentity identity) {
        if (!mainIconElement.isGraphicalIcon()) {
            return null;
        }
        SvgGraphic injected = parseInjected(mainIconElement.getGraphicMarkup(identity));
        return injected != null ? injected : parser.parseFile(mainIconElement.getGraphicLocation(identity));
    }

    @Override
    public SvgGraphic loadSectorOneModifierGraphic(SectorOneModifier sectorOneModifier) {
        if (sectorOneModifier.isUnknown()) {
            return null;
        }
        SvgGraphic injected = parseInjected(sectorOneModifier.getGraphicMarkup());
        return injected != null ? injected : parser.parseFile(sectorOneModifier.getFullGraphicLocation());
    }

    @Override
    public SvgGraphic loadSectorTwoModifierGraphic(SectorTwoModifier sectorTwoModifier) {
        if (sectorTwoModifier.isUnknown()) {
            return null;
        }
        SvgGraphic injected = parseInjected(sectorTwoModifier.getGraphicMarkup());
        return injected != null ? injected : parser.parseFile(sectorTwoModifier.getFullGraphicLocation());
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