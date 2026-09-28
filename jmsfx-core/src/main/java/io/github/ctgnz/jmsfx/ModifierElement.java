package io.github.ctgnz.jmsfx;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.types.ModifierCategory;

public interface ModifierElement extends CodeElement {

    default SymbolSet getBaseSymbolSet() {
        return getSymbolSet();
    }

    ModifierCategory getCategory();

    /**
     * The markup this modifier draws, ready to parse, or null when it carries none.
     * <p>
     * Overridden per modifier by a generated library, so the drawing sits on the modifier rather than in a table keyed by a filename - see {@link MainElement#getGraphicMarkup}. A
     * modifier that draws nothing has no markup and none is expected: an "unspecified" modifier is the absence of one.
     */
    default String getGraphicMarkup() {
        return null;
    }

    String getGraphicIdentifier();

    default String getGroupId() {
        return "0";
    }

    SymbolSet getSymbolSet();

    @Override
    default boolean isUnknown() {
        return "00".equals(getId());
    }

    /**
     * Where this modifier draws. APP-6E places sector modifiers within the bounding octagon, so {@link IconGeometry#OCTAGON} is the answer for all but a handful of fragments - the
     * Land Units supply bar and headquarters rule, for instance, are full-width horizontal rules that legitimately extend past it. Those carry generated overrides measured from
     * the fragment; everything else takes the rule.
     */
    default Rectangle2D getModifierBounds() {
        return IconGeometry.OCTAGON;
    }
}
