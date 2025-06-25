package io.github.ctgnz.jmsfx;

import nz.co.ctg.foxglove.SvgGraphic;

import io.github.ctgnz.jmsfx.icon.IdentificationSymbolBuilder;
import javafx.collections.ObservableList;

public interface IconLibrary {

    ObservableList<Amplifier> getAmplifiers();

    ObservableList<SectorOneModifier> getCommonSectorOneModifiers();

    ObservableList<SectorTwoModifier> getCommonSectorTwoModifiers();

    ObservableList<Context> getContexts();

    ObservableList<CountryCode> getCountryCodes();

    StandardAmplifierItem getDefaultAmplifier();

    Context getDefaultContext();

    Entity getDefaultEntity();

    EntitySubType getDefaultEntitySubType();

    EntityType getDefaultEntityType();

    HqtfDummy getDefaultHqtfDummy();

    SectorOneModifier getDefaultSectorOneModifier();

    SectorTwoModifier getDefaultSectorTwoModifier();

    StandardIdentity getDefaultStandardIdentity();

    Status getDefaultStatus();

    SymbolSet getDefaultSymbolSet();

    Version getDefaultVersion();

    ObservableList<Dimension> getDimensions();

    CountryCode getExtensionCountryCode();

    ObservableList<HqtfDummy> getHqtfDummys();

    ObservableList<AmplifierList> getListAmplifiers();

    ObservableList<StandardIdentity> getStandardIdentities();

    ObservableList<StandardIdentityGroup> getStandardIdentityGroups();

    ObservableList<Status> getStatuses();

    ObservableList<SymbolSet> getSymbolSets();

    ObservableList<Version> getVersions();

    SvgGraphic loadAmplifierGraphic(AmplifierListItem amplifierItem, StandardIdentity identity);

    SvgGraphic loadFrameGraphic(SymbolSet symbolSet, StandardIdentity identity, Status status, boolean civilianEntity);

    SvgGraphic loadFrameOverlayGraphic(Context context);

    SvgGraphic loadHqtfDummyGraphic(HqtfDummy hqtfDummy, StandardIdentity identity, SymbolSet symbolSet);

    SvgGraphic loadMainIconGraphic(MainElement mainIconElement, StandardIdentity identity);

    SvgGraphic loadSectorOneModifierGraphic(SectorOneModifier sectorOneModifier);

    SvgGraphic loadSectorTwoModifierGraphic(SectorTwoModifier sectorTwoModifier);

    SvgGraphic loadStatusGraphic(Status status, boolean isStatusIconUsed, StandardIdentity identity, SymbolSet symbolSet);

    void setExtensionCountryCode(CountryCode countryCode);

    default IdentificationSymbolBuilder symbol() {
        return symbol(getDefaultSymbolSet());
    }

    default IdentificationSymbolBuilder symbol(SymbolSet symbolSet) {
        return new IdentificationSymbolBuilder(this, symbolSet);
    }

}
