package io.github.ctgnz.jmsfx.icon.editor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;

import com.google.common.collect.Lists;

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
import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;

public class DynamicIconLibrary implements IconLibrary {
    private final ObservableList<Version> versions = FXCollections.observableArrayList();
    private final ObservableList<Context> contexts = FXCollections.observableArrayList();
    private final ObservableList<StandardIdentityGroup> standardIdentityGroups = FXCollections.observableArrayList();
    private final ObservableList<Dimension> dimensions = FXCollections.observableArrayList();
    private final ObservableList<Status> statuses = FXCollections.observableArrayList();
    private final ObservableList<HqtfDummy> hqtfDummys = FXCollections.observableArrayList();
    private final ObservableList<Amplifier> amplifiers = FXCollections.observableArrayList();
    private final ObservableList<AmplifierList> listAmplifiers = FXCollections.observableArrayList();
    private final ObservableList<SymbolSet> symbolSets = FXCollections.observableArrayList();
    private final ObservableList<SectorOneModifier> commonSectorOneModifiers = FXCollections.observableArrayList();
    private final ObservableList<SectorTwoModifier> commonSectorTwoModifiers = FXCollections.observableArrayList();
    private CountryCode countryCode = CountryCode.UNDEFINED;
    private final FoxgloveParser parser = new FoxgloveParser();

    /**
     * Where this library reads fragments from: a library's {@code src/main/model} directory.
     * <p>
     * A path rather than the classpath, since jmsfx#124 moved the fragment tree out of the published jar. The editor renders a model that is being edited, so it needs the files
     * themselves - the generated libraries carry their drawings as constants, but a model with no generated library yet has only the tree.
     */
    private final Path fragmentRoot;

    public DynamicIconLibrary(Path fragmentRoot) {
        this.fragmentRoot = fragmentRoot;
    }

    /**
     * Not a generated library, so it has no prefix of its own. It is whatever model the editor currently holds, which is the honest answer and stops it being mistaken for one of
     * the published libraries if it ever reaches something that reports a name.
     */
    @Override
    public String getName() {
        return "Dynamic";
    }

    @SuppressWarnings("this-escape")
    public DynamicIconLibrary(IconLibrary staticLibrary, Path fragmentRoot) {
        this.fragmentRoot = fragmentRoot;
        this.versions.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getVersions()), VersionImpl::new));
        this.contexts.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getContexts()), ContextImpl::new));
        this.standardIdentityGroups.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getStandardIdentityGroups()), StandardIdentityGroupImpl::new));
        this.dimensions.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getDimensions()), DimensionImpl::new));
        this.statuses.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getStatuses()), StatusImpl::new));
        this.hqtfDummys.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getHqtfDummys()), HqtfDummyImpl::new));
        this.amplifiers.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getAmplifiers()), AmplifierImpl::new));
        this.listAmplifiers.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getListAmplifiers()), AmplifierListImpl::new));
        this.symbolSets.setAll(dimensions.stream()
            .map(DimensionImpl.class::cast)
            .flatMap(DimensionImpl::streamSymbolSets)
            .toList());
        SymbolSet symSet = getDefaultSymbolSet();
        this.commonSectorOneModifiers.setAll(symSet.getSectorOneModifiers());
        this.commonSectorTwoModifiers.setAll(symSet.getSectorTwoModifiers());
    }

    public Optional<Amplifier> getAmplifier(String amplifierId) {
        return amplifiers.stream()
            .filter(amp -> Objects.equals(amplifierId, amp.getId()))
            .map(Amplifier.class::cast)
            .findFirst();
    }

    @Override
    public ObservableList<Amplifier> getAmplifiers() {
        return amplifiers;
    }

    @Override
    public ObservableList<SectorOneModifier> getCommonSectorOneModifiers() {
        return commonSectorOneModifiers;
    }

    @Override
    public ObservableList<SectorTwoModifier> getCommonSectorTwoModifiers() {
        return commonSectorTwoModifiers;
    }

    @Override
    public ObservableList<Context> getContexts() {
        return contexts;
    }

    @Override
    public ObservableList<CountryCode> getCountryCodes() {
        return FXCollections.observableArrayList(CountryCode.UNDEFINED); // TODO: add full list
    }

    @Override
    public StandardAmplifierItem getDefaultAmplifier() {
        return null;
    }

    @Override
    public Context getDefaultContext() {
        return contexts.getFirst();
    }

    @Override
    public Entity getDefaultEntity() {
        return getDefaultSymbolSet().getEntities()
            .getFirst();
    }

    @Override
    public EntitySubType getDefaultEntitySubType() {
        return getDefaultEntityType().getEntitySubTypes()
            .getFirst();
    }

    @Override
    public EntityType getDefaultEntityType() {
        return getDefaultEntity().getEntityTypes()
            .getFirst();
    }

    @Override
    public HqtfDummy getDefaultHqtfDummy() {
        return hqtfDummys.getFirst();
    }

    @Override
    public SectorOneModifier getDefaultSectorOneModifier() {
        return getCommonSectorOneModifiers().getFirst();
    }

    @Override
    public SectorTwoModifier getDefaultSectorTwoModifier() {
        return getCommonSectorTwoModifiers().getFirst();
    }

    @Override
    public StandardIdentity getDefaultStandardIdentity() {
        return getStandardIdentities().getFirst();
    }

    @Override
    public Status getDefaultStatus() {
        return statuses.getFirst();
    }

    @Override
    public SymbolSet getDefaultSymbolSet() {
        return symbolSets.getFirst();
    }

    @Override
    public Version getDefaultVersion() {
        return versions.getFirst();
    }

    @Override
    public ObservableList<Dimension> getDimensions() {
        return dimensions;
    }

    @Override
    public CountryCode getExtensionCountryCode() {
        return countryCode;
    }

    @Override
    public ObservableList<HqtfDummy> getHqtfDummys() {
        return hqtfDummys;
    }

    @Override
    public ObservableList<AmplifierList> getListAmplifiers() {
        return listAmplifiers;
    }

    @Override
    public ObservableList<StandardIdentity> getStandardIdentities() {
        return FXCollections.observableArrayList(standardIdentityGroups.stream()
            .map(StandardIdentityGroupImpl.class::cast)
            .flatMap(StandardIdentityGroupImpl::streamIdentities)
            .toList());
    }

    @Override
    public ObservableList<StandardIdentityGroup> getStandardIdentityGroups() {
        return standardIdentityGroups;
    }

    @Override
    public ObservableList<Status> getStatuses() {
        return statuses;
    }

    public Optional<SymbolSet> getSymbolSet(String symbolSetId) {
        return symbolSets.stream()
            .filter(sym -> Objects.equals(symbolSetId, sym.getId()))
            .map(SymbolSet.class::cast)
            .findFirst();
    }

    @Override
    public ObservableList<SymbolSet> getSymbolSets() {
        return symbolSets;
    }

    @Override
    public ObservableList<Version> getVersions() {
        return versions;
    }

    @Override
    public SvgGraphic loadAmplifierGraphic(AmplifierListItem amplifierItem, StandardIdentity identity) {
        if (!amplifierItem.isUnknown() && amplifierItem.isGraphicalIcon()) {
            return parse(amplifierItem.getGraphicLocation(identity));
        } else {
            return null;
        }
    }

    /**
     * The frame for this symbol set, identity and status, in the colour this symbol draws it.
     * <p>
     * The editor renders from the fragment tree rather than from injected markup, but the recolouring works the same way and for the same reason: the fill goes into the markup
     * before it is parsed and the frame amplifier goes into the cache key, so no caller has to mutate a graphic the parser is sharing (jmsfx#121). Civilian wins over the frame
     * amplifier, and since jmsfx#123 the tree no longer holds the {@code c} frames - a civilian frame is derived here as a generated library derives it.
     */
    @Override
    public SvgGraphic loadFrameGraphic(SymbolSet symbolSet, StandardIdentity identity, Status status, boolean civilianEntity, AmplifierListItem frameAmplifier) {
        if (!symbolSet.isPointGeometry()) {
            return null;
        }
        boolean civilian = civilianEntity && !identity.isHostile();
        String location = symbolSet.getFrameLocation(identity, status, civilian);
        if (civilian) {
            return recoloured(location, location, IdentificationSymbol.CIVILIAN_PURPLE);
        }
        if (frameAmplifier != null && !frameAmplifier.isUnknown() && !frameAmplifier.getBackgroundFill()
            .isBlank()) {
            return recoloured(location, location + frameAmplifier.getFullId(), Color.web(frameAmplifier.getBackgroundFill()));
        }
        return parse(location);
    }

    /** A fragment location as a file under {@link #fragmentRoot}. jmsfx-core still names fragments with classpath-style paths, which is what they were until jmsfx#124. */
    private Path fileFor(String location) {
        return fragmentRoot.resolve(location.startsWith("/") ? location.substring(1) : location);
    }

    private SvgGraphic parse(String location) {
        return parser.parseFile(fileFor(location).toFile());
    }

    /** The frame at {@code location} with its fill replaced, cached under {@code key}, falling back to the frame as drawn if the file cannot be read. */
    private SvgGraphic recoloured(String location, String key, Color fill) {
        Path file = fileFor(location);
        if (!Files.exists(file)) {
            return parse(location);
        }
        try {
            String markup = FragmentMarkup.replaceFill(Files.readString(file, StandardCharsets.UTF_8), fill);
            return parser.parseResource(key, new ByteArrayInputStream(markup.getBytes(StandardCharsets.UTF_8)));
        } catch (IOException e) {
            return parse(location);
        }
    }

    @Override
    public SvgGraphic loadFrameOverlayGraphic(Context context) {
        if (!context.isReality()) {
            return parse(context.getOverlayGraphicLocation());
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadHqtfDummyGraphic(HqtfDummy hqtfDummy, StandardIdentity identity, SymbolSet symbolSet) {
        if (!hqtfDummy.isUnknown()) {
            return parse(hqtfDummy.getGraphicLocation(identity, symbolSet));
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadMainIconGraphic(MainElement mainIconElement, StandardIdentity identity) {
        if (mainIconElement.isGraphicalIcon()) {
            String filePath = mainIconElement.getGraphicLocation(identity);
            return parse(filePath);
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadSectorOneModifierGraphic(SectorOneModifier sectorOneModifier) {
        if (!sectorOneModifier.isUnknown()) {
            return parse(sectorOneModifier.getFullGraphicLocation());
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadSectorTwoModifierGraphic(SectorTwoModifier sectorTwoModifier) {
        if (!sectorTwoModifier.isUnknown()) {
            return parse(sectorTwoModifier.getFullGraphicLocation());
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadStatusGraphic(Status status, boolean isStatusIconUsed, StandardIdentity identity, SymbolSet symbolSet) {
        if (isStatusIconUsed) {
            return parse(status.getGraphicLocation(identity, symbolSet));
        } else {
            return null;
        }
    }

    @Override
    public void setExtensionCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

}
