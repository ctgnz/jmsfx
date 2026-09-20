package io.github.ctgnz.jmsfx.icon;

import static io.github.ctgnz.jmsfx.icon.TestFixtures.amplifier;
import static io.github.ctgnz.jmsfx.icon.TestFixtures.entity;
import static io.github.ctgnz.jmsfx.icon.TestFixtures.newLibrary;
import static io.github.ctgnz.jmsfx.icon.TestFixtures.status;
import static io.github.ctgnz.jmsfx.icon.TestFixtures.symbolSet;
import static io.github.ctgnz.jmsfx.icon.TestFixtures.unknownAmplifier;
import static io.github.ctgnz.jmsfx.icon.TestFixtures.unknownSectorOneModifier;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.endsWith;

import javafx.geometry.Pos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nz.co.ctg.foxglove.SvgGraphic;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.MainElement;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.types.GeometryType;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.types.ScaleDirection;

class IdentificationSymbolTest {

    private TestFixtures.FakeIconLibrary library;
    private IdentificationSymbol candidate;

    @BeforeEach
    void setUp() {
        library = newLibrary();
        candidate = new IdentificationSymbol(library);
    }

    @Test
    void testAddGraphicAmplifierReusesExistingEntryForSameAmplifier() {
        Amplifier amplifier = amplifier("G", "Staff Comments");
        candidate.addGraphicAmplifier(amplifier, new SvgGraphic(), ScaleDirection.Original, Pos.TOP_LEFT);
        var second = candidate.addOverlayAmplifier(amplifier, new SvgGraphic());

        assertThat(candidate.getGraphicAmplifiers()
            .size(), is(1));
        assertThat(candidate.getGraphicAmplifier(amplifier), sameInstance(second));
    }

    @Test
    void testAddTextAmplifierUpdatesTextOnRepeatCalls() {
        Amplifier amplifier = amplifier("G", "Staff Comments");
        candidate.addTextAmplifier(amplifier, Pos.TOP_LEFT, "first");
        var value = candidate.addTextAmplifier(amplifier, Pos.TOP_LEFT, "second");

        assertThat(candidate.getTextAmplifiers()
            .size(), is(1));
        assertThat(value.getText(), is("second"));
    }

    @Test
    void testConstructorInitializesDefaultsFromLibrary() {
        assertThat(candidate.getVersion(), sameInstance(library.getDefaultVersion()));
        assertThat(candidate.getContext(), sameInstance(library.getDefaultContext()));
        assertThat(candidate.getStandardIdentity(), sameInstance(library.getDefaultStandardIdentity()));
        assertThat(candidate.getStatus(), sameInstance(library.getDefaultStatus()));
        assertThat(candidate.getHqtfDummy(), sameInstance(library.getDefaultHqtfDummy()));
        assertThat(candidate.getCountryCode(), sameInstance(library.getExtensionCountryCode()));
        assertThat(candidate.getSymbolSet(), sameInstance(library.getDefaultSymbolSet()));
    }

    @Test
    void testGetAmplifierFallsBackToLibraryDefaultWhenUnset() {
        assertThat(candidate.getAmplifier(), sameInstance(library.getDefaultAmplifier()));
    }

    @Test
    void testGetAmplifierReturnsExplicitlySetValue() {
        StandardAmplifierItem explicit = new TestFixtures.FakeAmplifierListItem("5", "Reinforced", false);
        candidate.setAmplifier(explicit);

        assertThat(candidate.getAmplifier(), sameInstance(explicit));
    }

    @Test
    void testGetDescriptionBuildsFromEntityTypeSubTypeAndModifiers() {
        var entity = entity("10", "Infantry").withSymbolSet(candidate.getSymbolSet());
        var entityType = new TestFixtures.FakeEntityType("1", "Rifle Squad", entity);
        var subType = new TestFixtures.FakeEntitySubType("1", "Mechanized", entityType);
        var sectorOne = new TestFixtures.FakeSectorOneModifier("1", "Left Flank", candidate.getSymbolSet());
        var amplifier = new TestFixtures.FakeAmplifierListItem("1", "Reinforced", false);

        candidate.setEntity(entity);
        candidate.setEntityType(entityType);
        candidate.setEntitySubType(subType);
        candidate.setSectorOneModifier(sectorOne);
        candidate.setAmplifier(amplifier);

        assertThat(candidate.getDescription(), is("Rifle Squad (Mechanized) Left Flank Reinforced"));
    }

    @Test
    void testGetDescriptionFallsBackToEntityLabelWhenNoEntityTypeSet() {
        var entity = entity("10", "Infantry").withSymbolSet(candidate.getSymbolSet());
        candidate.setEntity(entity);

        assertThat(candidate.getDescription(), is("Infantry"));
    }

    @Test
    void testGetDescriptionOmitsUnknownModifiersAndAmplifier() {
        var entity = entity("10", "Infantry").withSymbolSet(candidate.getSymbolSet());
        candidate.setEntity(entity);
        candidate.setSectorOneModifier(unknownSectorOneModifier(candidate.getSymbolSet()));
        candidate.setAmplifier(unknownAmplifier());

        assertThat(candidate.getDescription(), is("Infantry"));
    }

    @Test
    void testGetMainIconElementFallsBackToEntityWhenTypeAndSubTypeUnset() {
        var entity = entity("10", "Infantry").withSymbolSet(candidate.getSymbolSet());
        candidate.setEntity(entity);

        assertThat(candidate.getMainIconElement(), sameInstance((MainElement) entity));
    }

    @Test
    void testGetMainIconElementPrefersEntitySubTypeOverEntityType() {
        var entity = entity("10", "Infantry").withSymbolSet(candidate.getSymbolSet());
        var entityType = new TestFixtures.FakeEntityType("1", "Rifle Squad", entity);
        var subType = new TestFixtures.FakeEntitySubType("1", "Mechanized", entityType);
        candidate.setEntity(entity);
        candidate.setEntityType(entityType);
        candidate.setEntitySubType(subType);

        assertThat(candidate.getMainIconElement(), sameInstance((MainElement) subType));
    }

    @Test
    void testGetMainIconElementSkipsUnknownEntitySubType() {
        var entity = entity("10", "Infantry").withSymbolSet(candidate.getSymbolSet());
        var entityType = new TestFixtures.FakeEntityType("1", "Rifle Squad", entity);
        var unknownSubType = new TestFixtures.FakeEntitySubType("00", "Unspecified", entityType);
        candidate.setEntity(entity);
        candidate.setEntityType(entityType);
        candidate.setEntitySubType(unknownSubType);

        assertThat(candidate.getMainIconElement(), sameInstance((MainElement) entityType));
    }

    @Test
    void testIsAmplifierUsedReflectsWhetherAmplifierIsUnknown() {
        assertThat(candidate.isAmplifierUsed(), is(false));

        candidate.setAmplifier(new TestFixtures.FakeAmplifierListItem("5", "Reinforced", false));

        assertThat(candidate.isAmplifierUsed(), is(true));
    }

    @Test
    void testIsCivilianEntityReflectsEntityFlag() {
        candidate.setEntity(entity("10", "Infantry").withCivilian(true)
            .withSymbolSet(candidate.getSymbolSet()));

        assertThat(candidate.isCivilianEntity(), is(true));
    }

    @Test
    void testIsFrameOverlayUsedReflectsContextReality() {
        assertThat(candidate.isFrameOverlayUsed(), is(false));

        candidate.setContext(new TestFixtures.FakeContext("2", "Simulation", false));

        assertThat(candidate.isFrameOverlayUsed(), is(true));
    }

    @Test
    void testIsFrameUsedReflectsSymbolSetGeometry() {
        assertThat(candidate.isFrameUsed(), is(true));

        candidate.setSymbolSet(symbolSet("30", "Control Measure", GeometryType.LINE_GEOMETRY));

        assertThat(candidate.isFrameUsed(), is(false));
    }

    @Test
    void testIsMainIconUsedReflectsGraphicType() {
        candidate.setEntity(entity("10", "Infantry").withGraphicType(GraphicType.NA)
            .withSymbolSet(candidate.getSymbolSet()));

        assertThat(candidate.isMainIconUsed(), is(false));
    }

    @Test
    void testIsStatusIconUsedRequiresOperationalStatusRealityAndFrame() {
        candidate.setStatus(status("2", "Damaged", true, false));

        assertThat(candidate.isStatusIconUsed(), is(true));

        candidate.setContext(new TestFixtures.FakeContext("2", "Simulation", false));

        assertThat(candidate.isStatusIconUsed(), is(false));
    }

    @Test
    void testRemoveTextAmplifierClearsEntry() {
        Amplifier amplifier = amplifier("G", "Staff Comments");
        candidate.addTextAmplifier(amplifier, Pos.TOP_LEFT, "text");
        candidate.removeTextAmplifier(amplifier);

        assertThat(candidate.getTextAmplifier(amplifier), nullValue());
        assertThat(candidate.getTextAmplifiers()
            .entrySet(), empty());
    }

    @Test
    void testSettingSymbolSetClearsAmplifierAttachmentsAndResetsChildSelections() {
        var oldSymbolSet = candidate.getSymbolSet();
        Amplifier amplifier = amplifier("G", "Staff Comments");
        candidate.addTextAmplifier(amplifier, Pos.TOP_LEFT, "text");
        candidate.setAmplifier(new TestFixtures.FakeAmplifierListItem("5", "Reinforced", false));
        candidate.setEntity(entity("10", "Infantry").withSymbolSet(oldSymbolSet));

        var newDefaultAmplifier = new TestFixtures.FakeAmplifierListItem("00", "Unspecified", false);
        var newDefaultEntity = entity("20", "Aircraft");
        library.withDefaultAmplifier(newDefaultAmplifier)
            .withDefaultEntity(newDefaultEntity);
        candidate.setSymbolSet(symbolSet("20", "Air", GeometryType.POINT_GEOMETRY));

        assertThat(candidate.getAmplifier(), sameInstance((StandardAmplifierItem) newDefaultAmplifier));
        assertThat(candidate.getEntity(), sameInstance(newDefaultEntity));
        assertThat(candidate.getTextAmplifiers()
            .entrySet(), empty());
    }

    @Test
    void testToStringConcatenatesTheThreeDigitGroups() {
        assertThat(candidate.toString(),
            is(candidate.getFirstTenDigits() + " " + candidate.getSecondTenDigits() + " " + candidate.getThirdTenDigits()));
    }

    /**
     * APP-6E puts the amplifier at SIDC positions 9 and 10, and a standard amplifier's id is the complete two-digit code from Table A-8 - so the amplifier contributes
     * {@code getFullId()}. Using {@code getId()} would be the same thing today, but the two differ for amplifiers that are not SIDC values, and the first set of ten used to come
     * out one character short because of it.
     */
    @Test
    void testFirstTenDigitsEndWithTheAmplifiersCode() {
        candidate.setAmplifier(new TestFixtures.FakeAmplifierListItem("24", "Army Group/Front", true));

        assertThat(candidate.getFirstTenDigits(), endsWith("24"));
    }

    /** The amplifier occupies two positions, so swapping it for another must not change the length. */
    @Test
    void testTheAmplifierAlwaysOccupiesTwoPositions() {
        candidate.setAmplifier(new TestFixtures.FakeAmplifierListItem("24", "Army Group/Front", true));
        int withOne = candidate.getFirstTenDigits()
            .length();

        candidate.setAmplifier(new TestFixtures.FakeAmplifierListItem("11", "Team/Crew", true));

        assertThat(candidate.getFirstTenDigits()
            .length(), is(withOne));
        assertThat(candidate.getFirstTenDigits(), endsWith("11"));
    }

    /**
     * An unspecified amplifier fills both of its positions rather than echoing its placeholder id, which is a single digit because that same value doubles as the frame amplifier
     * at position 27 - a one-digit position. Reporting the id directly left the set a character short.
     */
    @Test
    void testAnUnspecifiedAmplifierFillsBothOfItsPositions() {
        candidate.setAmplifier(new TestFixtures.FakeAmplifierListItem("0", "Unspecified", false, true));
        int unspecified = candidate.getFirstTenDigits()
            .length();

        candidate.setAmplifier(new TestFixtures.FakeAmplifierListItem("24", "Army Group/Front", true));

        assertThat(candidate.getFirstTenDigits()
            .length(), is(unspecified));
        assertThat(unspecified, is(candidate.getFirstTenDigits()
            .length()));
    }
}
