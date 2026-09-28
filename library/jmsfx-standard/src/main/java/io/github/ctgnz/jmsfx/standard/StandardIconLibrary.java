package io.github.ctgnz.jmsfx.standard;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.stream.Stream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
import io.github.ctgnz.jmsfx.FragmentMarkup;
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
import io.github.ctgnz.jmsfx.standard.amplifier.NatoCountryCode;
import io.github.ctgnz.jmsfx.standard.amplifier.UnknownAmplifier;
import io.github.ctgnz.jmsfx.standard.common.CommonEntity;
import io.github.ctgnz.jmsfx.standard.common.CommonEntitySubType;
import io.github.ctgnz.jmsfx.standard.common.CommonEntityType;
import io.github.ctgnz.jmsfx.standard.common.CommonSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.common.CommonSectorTwoModifier;

public class StandardIconLibrary implements IconLibrary {

    /**
     * The one instance, which {@link java.util.ServiceLoader} built.
     * <p>
     * Prefer {@link IconLibrary#discover()} over naming this class. An application depends on exactly one symbology library and there is no choice to make at this point, so
     * compiling in which one it is only prevents the same application running against another.
     * <p>
     * This deliberately does not hold a singleton of its own. The library carries mutable state - the extension country code - so a second instance beside the discovered one would
     * be a library that silently disagreed with itself about its own configuration.
     */
    public static StandardIconLibrary instance() {
        return (StandardIconLibrary) IconLibrary.discover();
    }

    private int fellBackToClasspath;
    private final FoxgloveParser parser = new FoxgloveParser();
    private CountryCode extensionCountryCode = CountryCode.UNDEFINED;

    /**
     * For {@link java.util.ServiceLoader}, which requires a public no-arg constructor of a provider declared in {@code META-INF/services} - its static {@code provider()}
     * convention applies only to providers in named modules, and these libraries are used on the classpath.
     * <p>
     * Not for calling. Use {@link IconLibrary#discover()}, or {@link #instance()}, both of which return the single instance the service loader created.
     */
    public StandardIconLibrary() {
    }

    /** The library prefix this was generated with, which is what names the class too. */
    @Override
    public String getName() {
        return "Standard";
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
        return FXCollections.observableArrayList(Stream.concat(Stream.of(CountryCode.UNDEFINED), Stream.of(NatoCountryCode.values()))
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
     * Cached by the graphic location, which is a sound key for it: the location is unique to one element, and unique per identity group for a {@code FULL_FRAME} element, because
     * the group suffix is part of it. Reorganising the fragment tree (jmsfx#124) keeps that property - every fragment stays identifiable to one element - so the key survives the
     * move, and {@code getGraphicLocation} may well be renamed {@code getGraphicKey} then to say what it now is.
     * <p>
     * Sharing a parsed graphic is safe for these categories and not in general. Nothing mutates a main icon or a modifier; the frame is mutated, by {@code replaceFill} when a
     * frame amplifier recolours it, and that is precisely how one symbol's colour leaks onto the next (jmsfx#121). The frame is not injected here - jmsfx#123 is where it is dealt
     * with.
     */
    private SvgGraphic parseInjected(String graphicLocation, String markup) {
        String document = FragmentMarkup.document(markup);
        if (document == null) {
            fellBackToClasspath++;
            return null;
        }
        return parser.parseResource(graphicLocation, new ByteArrayInputStream(document.getBytes(StandardCharsets.UTF_8)));
    }

    /**
     * How many times a caller asked for something this library was supposed to carry and did not.
     * <p>
     * Not a statistic for its own sake. The markup is generated from the model, so a mismatch between what is injected and what is asked for would otherwise be invisible:
     * rendering would fall back to the file and look perfectly correct, while injection quietly did nothing.
     */
    public int getClasspathFallbacks() {
        return fellBackToClasspath;
    }

    @Override
    public SvgGraphic loadMainIconGraphic(MainElement mainIconElement, StandardIdentity identity) {
        if (!mainIconElement.isGraphicalIcon()) {
            return null;
        }
        String location = mainIconElement.getGraphicLocation(identity);
        SvgGraphic injected = parseInjected(location, mainIconElement.getGraphicMarkup(identity));
        return injected != null ? injected : parser.parseFile(location);
    }

    @Override
    public SvgGraphic loadSectorOneModifierGraphic(SectorOneModifier sectorOneModifier) {
        if (sectorOneModifier.isUnknown()) {
            return null;
        }
        String location = sectorOneModifier.getFullGraphicLocation();
        SvgGraphic injected = parseInjected(location, sectorOneModifier.getGraphicMarkup());
        return injected != null ? injected : parser.parseFile(location);
    }

    @Override
    public SvgGraphic loadSectorTwoModifierGraphic(SectorTwoModifier sectorTwoModifier) {
        if (sectorTwoModifier.isUnknown()) {
            return null;
        }
        String location = sectorTwoModifier.getFullGraphicLocation();
        SvgGraphic injected = parseInjected(location, sectorTwoModifier.getGraphicMarkup());
        return injected != null ? injected : parser.parseFile(location);
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