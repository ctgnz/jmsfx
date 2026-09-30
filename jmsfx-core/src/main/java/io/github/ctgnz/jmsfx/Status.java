package io.github.ctgnz.jmsfx;

import java.util.List;

import javafx.geometry.Rectangle2D;

public interface Status extends CodeElement {

    List<String> getDimensionIds();

    /**
     * APP-6E offers two renderings of the operational condition codes, and the trailing {@code 2} selects the <em>alternate</em> one - the form in Table 1-7. That is the only
     * variant implemented here, and the only one the shipped fragments cover: every file under {@code /svg/OCA} that this can name ends in {@code 2}.
     * <p>
     * Implementing only the alternate form is a deliberate choice rather than an omission, and it is what leaves room for a library to define further status values. The digit is a
     * literal here, so the status id beside it is free; were both renderings implemented, that position would have to carry which one was meant. jmsfx-historical uses the room: it
     * adds {@code 6}, Present/Extinct, beyond the six APP-6E defines.
     */
    default String getGraphicKey(StandardIdentity identity, SymbolSet symbolSet) {
        return String.format("/svg/Status/%s/%s/%s.svg", symbolSet.getDimension()
            .getName(),
            identity.getGroup()
                .getName(),
            getName());
    }

    default boolean isFrameStatus() {
        return !isOperationalCondition();
    }

    boolean isOperationalCondition();

    boolean isPlanned();

    boolean isPresent();

    default String getFrameId(StandardIdentity identity) {
        return identity.isConfirmed() ? getId() : "0";
    }

    /**
     * The name of the status a frame is drawn for: this one when the identity is confirmed, and Present otherwise - the same collapse {@link #getFrameId(StandardIdentity)} does.
     */
    default String getFrameName(StandardIdentity identity) {
        return identity.isConfirmed() ? getName() : "PRESENT";
    }

    default boolean isSupported(SymbolSet symbolSet) {
        return getDimensionIds().isEmpty() || getDimensionIds().contains(symbolSet.getDimension()
            .getName());
    }

    /**
     * Where this status's operational-condition graphic draws, or {@link Rectangle2D#EMPTY} when it has none - {@code Present} and {@code Planned} are frame statuses and draw no
     * bar of their own. Keyed by the same things that pick the fragment in {@link #getGraphicKey(StandardIdentity, SymbolSet)}: the identity's group and the symbol set's frame id.
     * Generated from measurements rather than computed, so no JavaFX toolkit is needed.
     */
    default Rectangle2D getStatusBounds(StandardIdentity identity, SymbolSet symbolSet) {
        return Rectangle2D.EMPTY;
    }

    /**
     * The markup this status's operational-condition bar draws, or null when it has none - a frame status draws no bar, and so carries no drawing either.
     * <p>
     * Keyed the same way as {@link #getStatusBounds(StandardIdentity, SymbolSet)} and {@link #getGraphicKey(StandardIdentity, SymbolSet)}: identity group by frame id. See
     * jmsfx#123.
     */
    default String getStatusMarkup(StandardIdentity identity, SymbolSet symbolSet) {
        return null;
    }
}