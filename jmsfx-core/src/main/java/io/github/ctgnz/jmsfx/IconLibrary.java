package io.github.ctgnz.jmsfx;

import javafx.collections.ObservableList;

import nz.co.ctg.foxglove.SvgGraphic;

import io.github.ctgnz.jmsfx.icon.IdentificationSymbolBuilder;

public interface IconLibrary {

    /** Names an implementation explicitly, for the case where the classpath offers more than one, or a test wants to pin its choice. */
    String LIBRARY_PROPERTY = "jmsfx.iconLibrary";

    /**
     * The symbology library on the classpath.
     * <p>
     * An application depends on exactly one - whichever generated library it was built against, holding whatever model that was generated from. Finding it here rather than naming
     * a concrete class means the same application runs against any of them: the standard model, or one extended for a particular consumer.
     * <p>
     * Implementations are found through {@link java.util.ServiceLoader}, so a library declares itself in {@code META-INF/services/io.github.ctgnz.jmsfx.IconLibrary}. The generated
     * libraries are singletons with a private constructor, so they publish a {@code static provider()} method rather than a public no-arg constructor.
     * <p>
     * Throws if the classpath offers none, or more than one and {@link #LIBRARY_PROPERTY} has not chosen between them. Both are worth failing on: the first is a missing
     * dependency, and the second a packaging mistake that would otherwise be settled arbitrarily by classpath order.
     */
    static IconLibrary discover() {
        return IconLibraries.discover();
    }

    /**
     * Which library this is - {@code Standard}, {@code Historical}, {@code BattleOrder}.
     * <p>
     * An application built against jmsfx-core names no library and discovers whichever one is on its classpath, so without this it cannot report what it is running, and a
     * deployment cannot be checked from outside beyond inferring it from which symbol sets appear. That is answerable while there is one library and awkward once there are three,
     * each deployed to its own subdomain. See jmsfx#111.
     * <p>
     * Deliberately not {@code getVersion()}: {@link #getVersions()} already means something else here - an APP-6 edition, SIDC positions 1-2 - and two methods a character apart
     * meaning different things is a trap. The library's own artifact version is a separate question, and one the generated source cannot answer, since it has no idea what version
     * it will be published as.
     */
    String getName();

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
