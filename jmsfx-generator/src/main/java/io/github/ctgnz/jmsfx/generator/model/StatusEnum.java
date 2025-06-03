package io.github.ctgnz.jmsfx.generator.model;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import io.github.ctgnz.jmsfx.generator.schema.Library.Dimensions.Dimension.SymbolSets.SymbolSetRef;
import io.github.ctgnz.jmsfx.generator.schema.Library.Statuses.Status;
import io.github.ctgnz.jmsfx.generator.schema.Library.Statuses.Status.Graphics.Graphic;

public class StatusEnum extends StandardEnum {

    private final Set<String> dimensions;

    public StatusEnum(Status status) {
        super(status.getName(), status.getLabel(), Integer.toString(status.getStatusCode()), null);
        if (status.getGraphics() != null) {
            this.dimensions = status.getGraphics().getGraphic().stream().map(Graphic::getDimensionID).map(SymbolSetRef.class::cast).map(SymbolSetRef::getID).collect(Collectors.toSet());
        } else {
            this.dimensions = Collections.emptySet();
        }
    }

    public Set<String> getDimensions() {
        return new TreeSet<>(dimensions);
    }

}
