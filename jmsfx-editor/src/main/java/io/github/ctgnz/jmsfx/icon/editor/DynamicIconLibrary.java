package io.github.ctgnz.jmsfx.icon.editor;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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

    public DynamicIconLibrary() {
    }

    public DynamicIconLibrary(IconLibrary staticLibrary) {
        this.versions.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getVersions()), VersionImpl::new));
        this.contexts.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getContexts()), ContextImpl::new));
        this.standardIdentityGroups.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getStandardIdentityGroups()), StandardIdentityGroupImpl::new));
        this.dimensions.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getDimensions()), DimensionImpl::new));
        this.statuses.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getStatuses()), StatusImpl::new));
        this.hqtfDummys.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getHqtfDummys()), HqtfDummyImpl::new));
        this.amplifiers.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getAmplifiers()), AmplifierImpl::new));
        this.listAmplifiers.setAll(Lists.transform(Lists.newArrayList(staticLibrary.getListAmplifiers()), AmplifierListImpl::new));
        this.symbolSets.setAll(dimensions.stream().map(DimensionImpl.class::cast).flatMap(DimensionImpl::streamSymbolSets).toList());
        SymbolSet symSet = getDefaultSymbolSet();
        this.commonSectorOneModifiers.setAll(symSet.getSectorOneModifiers());
        this.commonSectorTwoModifiers.setAll(symSet.getSectorTwoModifiers());
    }

    public Optional<Amplifier> getAmplifier(String amplifierId) {
        return amplifiers.stream().filter(amp -> StringUtils.equals(amplifierId, amp.getId())).map(Amplifier.class::cast).findFirst();
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
        return getDefaultSymbolSet().getEntities().getFirst();
    }

    @Override
    public EntitySubType getDefaultEntitySubType() {
        return getDefaultEntityType().getEntitySubTypes().getFirst();
    }

    @Override
    public EntityType getDefaultEntityType() {
        return getDefaultEntity().getEntityTypes().getFirst();
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
        return FXCollections.observableArrayList(standardIdentityGroups.stream().map(StandardIdentityGroupImpl.class::cast).flatMap(StandardIdentityGroupImpl::streamIdentities).toList());
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
        return symbolSets.stream().filter(sym -> StringUtils.equals(symbolSetId, sym.getId())).map(SymbolSet.class::cast).findFirst();
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
            return parser.parseFile(amplifierItem.getGraphicLocation(identity));
        } else {
            return null;
        }
    }

    @Override
    public SvgGraphic loadFrameGraphic(SymbolSet symbolSet, StandardIdentity identity, Status status, boolean civilianEntity) {
        if (symbolSet.isPointGeometry()) {
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
        this.countryCode = countryCode;
    }

}
