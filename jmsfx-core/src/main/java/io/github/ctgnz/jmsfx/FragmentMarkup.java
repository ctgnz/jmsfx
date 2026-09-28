package io.github.ctgnz.jmsfx;

import java.util.regex.Pattern;

import javafx.scene.paint.Color;

import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;

/**
 * Turns an element's injected markup into a document a parser will accept.
 * <p>
 * A generated library carries the <em>content root</em> of each fragment - the group that draws - and not the file it came from. That is most of the saving: a fragment file is
 * largely reference scaffolding, the {@code octagon} and {@code outFrame} groups that exist so it can be edited against a visible frame and never render. Dropping them takes a
 * library's fragments to roughly a quarter of the file bytes. See jmsfx#122.
 * <p>
 * What the content root is missing is an {@code svg} element to sit in, and that is supplied here rather than repeated in every generated constant - once in this file against some
 * fifteen hundred times in each library.
 */
public final class FragmentMarkup {

    /**
     * The envelope an injected fragment is parsed inside.
     * <p>
     * Deliberately minimal. No {@code xmlns:xlink}, because no fragment in any library contains a {@code use} element or an {@code xlink:href} that would need one - which is also
     * why none of them needs a base URI to resolve against, and why injecting them is sound at all.
     * <p>
     * {@code xml:space="preserve"} is not optional. Around eight hundred fragments draw with {@code text}, and without it their whitespace is normalised and they render
     * differently. That was verified by parsing every main icon and modifier fragment both ways and comparing: 1,613 of 1,613 identical, including all 790 containing {@code text}.
     */
    private static final String ENVELOPE = "<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 612 792\" width=\"612px\" height=\"792px\" xml:space=\"preserve\">%s</svg>";

    /** A hex fill attribute, the only thing that separates a civilian frame from the military one it is derived from. */
    private static final Pattern HEX_FILL = Pattern.compile("fill=\"#[0-9A-Fa-f]{6}\"");

    /** The markup as a standalone document, or null when there is none - which means the caller should fall back to reading the fragment from the classpath. */
    public static String document(String markup) {
        return markup == null ? null : String.format(ENVELOPE, markup);
    }

    /**
     * {@code markup} with every hex fill replaced by {@code fill}.
     * <p>
     * A frame carries exactly one hex fill - the identity colour on the frame shape - which holds for all 123 frames in jmsfx-standard. Everything else it draws is
     * {@code fill="none"}, the dashed pending and anticipated outlines, and the outline colour is a {@code stroke}, a different attribute. So substituting on the fill attribute
     * recolours the frame and touches nothing else.
     * <p>
     * This is how a civilian frame is produced. A civilian entity does not get a frame of its own shape, it gets the ordinary frame for its identity and status recoloured to
     * {@link IdentificationSymbol#CIVILIAN_PURPLE}, which is why the {@code c} frames are no longer carried as files: each was its military counterpart with that one substitution
     * applied, verified by deriving all ninety and comparing them to the committed files. See jmsfx#123.
     */
    public static String replaceFill(String markup, Color fill) {
        if (markup == null) {
            return null;
        }
        return HEX_FILL.matcher(markup)
            .replaceAll(String.format("fill=\"#%02X%02X%02X\"", channel(fill.getRed()), channel(fill.getGreen()), channel(fill.getBlue())));
    }

    private static int channel(double value) {
        return (int) Math.round(value * 255);
    }

    private FragmentMarkup() {
    }

}
