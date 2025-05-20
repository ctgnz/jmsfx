package ${basePackage};

public interface SectorOneModifier extends IconModifier {

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s1", getSymbolSet().getId(), getId());
    }

    default String getGraphicLocation() {
        return getSymbolSet().getGraphicLocation();
    }

}
