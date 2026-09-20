package io.github.ctgnz.jmsfx;

import java.util.List;

import javafx.geometry.Rectangle2D;

public interface Status extends CodeElement {

    List<String> getDimensionIds();

    default String getGraphicLocation(StandardIdentity identity, SymbolSet symbolSet) {
        return String.format("/svg/OCA/0%s%s%s2.svg", identity.getGroupId(), symbolSet.getFrameId(), getId());
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

    default boolean isSupported(SymbolSet symbolSet) {
        return getDimensionIds().isEmpty() || getDimensionIds().contains(symbolSet.getDimension()
            .getName());
    }

    /**
     * Where this status's operational-condition graphic draws, or {@link Rectangle2D#EMPTY} when it has none - {@code Present} and {@code Planned} are frame statuses and draw no
     * bar of their own. Keyed by the same things that pick the fragment in {@link #getGraphicLocation(StandardIdentity, SymbolSet)}: the identity's group and the symbol set's
     * frame id. Generated from measurements rather than computed, so no JavaFX toolkit is needed.
     */
    default Rectangle2D getStatusBounds(StandardIdentity identity, SymbolSet symbolSet) {
        return Rectangle2D.EMPTY;
    }
}