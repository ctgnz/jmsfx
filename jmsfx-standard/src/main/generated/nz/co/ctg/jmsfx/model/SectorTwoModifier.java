package nz.co.ctg.jmsfx.model;

public interface SectorTwoModifier extends IconModifier {

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s2", getSymbolSet().getId(), getId());
    }

    default String getGraphicLocation() {
        return getSymbolSet().getGraphicLocation();
    }

}
