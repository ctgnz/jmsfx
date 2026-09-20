package io.github.ctgnz.jmsfx;

import java.util.List;
import java.util.Objects;

import javafx.geometry.Rectangle2D;

public interface HqtfDummy extends CodeElement {

    List<String> getDimensionIds();

    default String getGraphicLocation(StandardIdentity identity, SymbolSet symbolSet) {
        return String.format("/svg/HQTFFD/%s%s%s.svg", identity.getGroupId(), symbolSet.getDimensionId(), getId());
    }

    default boolean isSupported(SymbolSet symbolSet) {
        return getDimensionIds().isEmpty() || getDimensionIds().stream()
            .anyMatch(dim -> Objects.equals(dim, symbolSet.getDimension()
                .getName()));
    }

    /**
     * Where this headquarters/task force/dummy graphic draws, or {@link Rectangle2D#EMPTY} when it has none - {@code Not Applicable} draws nothing. Keyed by the identity's group
     * and the symbol set's dimension, matching {@link #getGraphicLocation(StandardIdentity, SymbolSet)}. Generated from measurements, so no JavaFX toolkit is needed.
     */
    default Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
        return Rectangle2D.EMPTY;
    }
}