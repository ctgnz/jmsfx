package nz.co.ctg.jmsfx.model;

import java.util.Comparator;

public interface SectorTwoModifier extends IconModifier {

    Comparator<SectorTwoModifier> VIEW_ORDER = Comparator.comparing(SectorTwoModifier::getCategory).thenComparing(SectorTwoModifier::getLabel);
    
    String getCategory();

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s2", getSymbolSet().getId(), getId());
    }

    default String getGraphicLocation() {
        return getSymbolSet().getGraphicLocation();
    }

}
