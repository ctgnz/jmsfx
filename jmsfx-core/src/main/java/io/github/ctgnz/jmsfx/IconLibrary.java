package io.github.ctgnz.jmsfx;

import java.util.List;

import nz.co.ctg.foxglove.SvgGraphic;

public interface IconLibrary {

    List<SectorOneModifier> getCommonSectorOneModifiers();

    List<SectorTwoModifier> getCommonSectorTwoModifiers();

    StandardAmplifierItem getDefaultAmplifier();

    Context getDefaultContext();

    HqtfDummy getDefaultHqtfDummy();

    StandardIdentity getDefaultStandardIdentity();

    Status getDefaultStatus();

    SymbolSet getDefaultSymbolSet();

    Version getDefaultVersion();

    CountryCode getExtensionCountryCode();

    void setExtensionCountryCode(CountryCode countryCode);

    SvgGraphic loadStatusGraphic(Status status, boolean isStatusIconUsed, StandardIdentity identity, SymbolSet symbolSet);

    SvgGraphic loadSectorTwoModifierGraphic(SectorTwoModifier sectorTwoModifier);

    SvgGraphic loadSectorOneModifierGraphic(SectorOneModifier sectorOneModifier);

    SvgGraphic loadMainIconGraphic(MainElement mainIconElement, StandardIdentity identity);

    SvgGraphic loadHqtfDummyGraphic(HqtfDummy hqtfDummy, StandardIdentity identity, SymbolSet symbolSet);

    SvgGraphic loadFrameOverlayGraphic(Context context);

    SvgGraphic loadFrameGraphic(SymbolSet symbolSet, StandardIdentity identity, Status status, boolean civilianEntity);

    SvgGraphic loadAmplifierGraphic(AmplifierListItem amplifierItem, StandardIdentity identity);

    SectorOneModifier getDefaultSectorOneModifier();

    SectorTwoModifier getDefaultSectorTwoModifier();
}
