package ${basePackage};

public interface StandardAmplifier extends ListAmplifier {

    @Override
    default String getFullId() {
        return String.format("%s%s", getType().getId(), getId());
    }

}
