package io.github.ctgnz.jmsfx.icon;

import static io.github.ctgnz.jmsfx.icon.TestFixtures.entity;
import static io.github.ctgnz.jmsfx.icon.TestFixtures.newLibrary;
import static io.github.ctgnz.jmsfx.icon.TestFixtures.svgGraphicWithFilledRectangle;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.types.IconScale;

/**
 * The default {@link TestFixtures.FakeIconLibrary} produces a symbol set that is framed, whose default status is an operational-condition/reality combination that always shows the
 * status graphic, and whose default entity has a graphical main icon - so a freshly constructed icon always starts out rendering exactly frame + status + main icon (in that
 * order), with nothing else selected.
 */
class IdentificationSymbolIconTest {

    private TestFixtures.FakeIconLibrary library;
    private IdentificationSymbol symbol;
    private IdentificationSymbolIcon candidate;

    @BeforeEach
    void setUp() {
        library = newLibrary();
        symbol = new IdentificationSymbol(library);
        candidate = symbol.createIcon();
    }

    private Group renderedContainer() {
        return (Group) candidate.getChildren()
            .get(0);
    }

    @Test
    void testConstructionRendersFrameStatusAndMainIconByDefault() {
        assertThat(renderedContainer().getChildren()
            .size(), is(3));
    }

    @Test
    void testFillBackgroundRefreshesTheIconWhenToggled() {
        assertThat(renderedContainer().getChildren()
            .size(), is(3));

        candidate.setFillBackground(true);

        var children = renderedContainer().getChildren();
        assertThat(children.size(), is(4));
        assertThat(children.get(0), instanceOf(Rectangle.class));
        assertThat(((Rectangle) children.get(0)).getFill(), is(Color.WHITE));
    }

    @Test
    void testFrameAmplifierReplacesTheFrameShapesFill() {
        library.withFrameGraphic(svgGraphicWithFilledRectangle(Color.RED));
        var frameAmplifier = new TestFixtures.FakeAmplifierListItem("5", "Blue Fill", false) {
            @Override
            public String getBackgroundFill() {
                return "#0000FF";
            }
        };

        symbol.setFrameAmplifier(frameAmplifier);

        Group frame = (Group) renderedContainer().getChildren()
            .get(0);
        Rectangle rectangle = (Rectangle) frame.getChildren()
            .get(0);
        assertThat(rectangle.getFill(), is(Color.web("#0000FF")));
    }

    @Test
    void testSettingNonGraphicalEntityRemovesTheMainIconGroup() {
        symbol.setEntity(entity("20", "Non-graphical").withGraphicType(GraphicType.NA)
            .withSymbolSet(symbol.getSymbolSet()));

        assertThat(renderedContainer().getChildren()
            .size(), is(2));
    }

    @Test
    void testUpdateScaleAppliesATransformMatchingTheScaleFactor() {
        symbol.setScale(IconScale.Large);

        assertThat(renderedContainer().getTransforms()
            .size(), is(1));
        Scale transform = (Scale) renderedContainer().getTransforms()
            .get(0);
        assertThat(transform.getX(), is(IconScale.Large.getFactor()));
        assertThat(transform.getY(), is(IconScale.Large.getFactor()));
    }
}
