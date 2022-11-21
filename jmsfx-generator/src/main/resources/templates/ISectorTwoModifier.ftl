package ${basePackage};

public interface SectorTwoModifier extends IconModifier {

    @Override
    default String getGraphicIdentifier() {
        return String.format("%s%s2", getSymbolSet().getId(), getId());
    }

}
