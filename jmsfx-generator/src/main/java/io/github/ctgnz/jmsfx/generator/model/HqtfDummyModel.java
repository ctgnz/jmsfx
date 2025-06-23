package io.github.ctgnz.jmsfx.generator.model;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import static java.util.stream.Collectors.toSet;

import io.github.ctgnz.jmsfx.generator.schema.Library.Dimensions.Dimension.SymbolSets.SymbolSetRef;
import io.github.ctgnz.jmsfx.generator.schema.Library.HQTFDummies.HQTFDummy;
import io.github.ctgnz.jmsfx.generator.schema.Library.HQTFDummies.HQTFDummy.Graphics.Graphic;

public class HqtfDummyModel extends StandardEnumModel {

    private final Set<String> dimensions;

    public HqtfDummyModel(HQTFDummy dummy) {
        super(dummy.getName(), dummy.getLabel(), Integer.toString(dummy.getHQTFDummyCode()), null);
        if (dummy.getGraphics() != null) {
            this.dimensions = dummy.getGraphics().getGraphic().stream().map(Graphic::getDimensionID).map(SymbolSetRef.class::cast).map(SymbolSetRef::getID).collect(toSet());
        } else {
            this.dimensions = Collections.emptySortedSet();
        }
    }

    public Set<String> getDimensions() {
        return new TreeSet<>(dimensions);
    }

}
