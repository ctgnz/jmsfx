package io.github.ctgnz.jmsfx.icon.model;

import java.util.List;
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
import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.MainElement;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.Version;
import io.github.ctgnz.jmsfx.icon.AmplifierEnum;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;
import io.github.ctgnz.jmsfx.icon.ContextEnum;
import io.github.ctgnz.jmsfx.icon.DimensionEnum;
import io.github.ctgnz.jmsfx.icon.HqtfDummyEnum;
import io.github.ctgnz.jmsfx.icon.StandardIdentityGroupEnum;
import io.github.ctgnz.jmsfx.icon.StatusEnum;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.VersionEnum;
import io.github.ctgnz.jmsfx.icon.amplifier.NatoCountryCode;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DynamicIconLibrary implements IconLibrary {
    private final ObservableList<Version> version = FXCollections.observableArrayList();
    private final ObservableList<Context> context = FXCollections.observableArrayList();
    private final ObservableList<StandardIdentityGroupAdapter> standardIdentityGroup = FXCollections.observableArrayList();
    private final ObservableList<Dimension> dimension = FXCollections.observableArrayList();
    private final ObservableList<Status> status = FXCollections.observableArrayList();
    private final ObservableList<HqtfDummy> hqtfDummy = FXCollections.observableArrayList();
    private final ObservableList<Amplifier> amplifiers = FXCollections.observableArrayList();
    private final ObservableList<AmplifierList> listAmplifiers = FXCollections.observableArrayList();
    private final ObservableList<SymbolSet> symbolSets = FXCollections.observableArrayList();
    private final ObservableList<SectorOneModifier> commonSectorOne = FXCollections.observableArrayList();
    private final ObservableList<SectorTwoModifier> commonSectorTwo = FXCollections.observableArrayList();
    private CountryCode countryCode = NatoCountryCode.UNDEFINED;
    private final FoxgloveParser parser;

    public DynamicIconLibrary() {
        this.parser = new FoxgloveParser();
        this.version.setAll(Lists.transform(Lists.newArrayList(VersionEnum.values()), VersionImpl::new));
        this.context.setAll(Lists.transform(Lists.newArrayList(ContextEnum.values()), ContextImpl::new));
        this.standardIdentityGroup.setAll(Lists.transform(Lists.newArrayList(StandardIdentityGroupEnum.values()), StandardIdentityGroupAdapter::new));
        this.dimension.setAll(Lists.transform(Lists.newArrayList(DimensionEnum.values()), DimensionImpl::new));
        this.status.setAll(Lists.transform(Lists.newArrayList(StatusEnum.values()), StatusImpl::new));
        this.hqtfDummy.setAll(Lists.transform(Lists.newArrayList(HqtfDummyEnum.values()), HqtfDummyImpl::new));
        this.amplifiers.setAll(Lists.transform(Lists.newArrayList(AmplifierEnum.values()), AmplifierImpl::new));
        this.listAmplifiers.setAll(Lists.transform(Lists.newArrayList(AmplifierListEnum.values()), AmplifierListImpl::new));
        this.symbolSets.setAll(dimension.stream().map(DimensionImpl.class::cast).flatMap(DimensionImpl::streamSymbolSets).toList());
        getSymbolSet(SymbolSetEnum.COMMON.getId()).ifPresent(symSet -> {
           this.commonSectorOne.setAll(symSet.getSectorOneModifiers());
           this.commonSectorTwo.setAll(symSet.getSectorTwoModifiers());
        });
    }

    public Optional<Amplifier> getAmplifier(String amplifierId) {
        return amplifiers.stream().filter(amp -> StringUtils.equals(amplifierId, amp.getId())).map(Amplifier.class::cast).findFirst();
    }

    public ObservableList<Amplifier> getAmplifiers() {
        return amplifiers;
    }

    @Override
    public List<SectorOneModifier> getCommonSectorOneModifiers() {
        return commonSectorOne;
    }

    @Override
    public List<SectorTwoModifier> getCommonSectorTwoModifiers() {
        return commonSectorTwo;
    }

    public ObservableList<Context> getContext() {
        return context;
    }

    @Override
    public StandardAmplifierItem getDefaultAmplifier() {
        return null;
    }

    @Override
    public Context getDefaultContext() {
        return context.getFirst();
    }

    @Override
    public HqtfDummy getDefaultHqtfDummy() {
        return hqtfDummy.getFirst();
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
        return getStandardIdentity().getFirst();
    }

    @Override
    public Status getDefaultStatus() {
        return status.getFirst();
    }

    @Override
    public SymbolSet getDefaultSymbolSet() {
        return symbolSets.getFirst();
    }

    @Override
    public Version getDefaultVersion() {
        return version.getFirst();
    }

    public ObservableList<Dimension> getDimension() {
        return dimension;
    }

    @Override
    public CountryCode getExtensionCountryCode() {
        return countryCode;
    }

    public ObservableList<HqtfDummy> getHqtfDummy() {
        return hqtfDummy;
    }

    public ObservableList<AmplifierList> getListAmplifiers() {
        return listAmplifiers;
    }

    public ObservableList<StandardIdentity> getStandardIdentity() {
        return FXCollections.observableArrayList(standardIdentityGroup.stream().flatMap(StandardIdentityGroupAdapter::streamIdentities).toList());
    }

    public ObservableList<StandardIdentityGroupAdapter> getStandardIdentityGroup() {
        return standardIdentityGroup;
    }

    public ObservableList<Status> getStatus() {
        return status;
    }

    public Optional<SymbolSet> getSymbolSet(String symbolSetId) {
        return symbolSets.stream().filter(sym -> StringUtils.equals(symbolSetId, sym.getId())).map(SymbolSet.class::cast).findFirst();
    }

    public ObservableList<SymbolSet> getSymbolSets() {
        return symbolSets;
    }

    public ObservableList<Version> getVersion() {
        return version;
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
