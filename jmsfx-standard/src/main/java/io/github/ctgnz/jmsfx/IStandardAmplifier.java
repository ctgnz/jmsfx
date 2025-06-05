package io.github.ctgnz.jmsfx;

public interface IStandardAmplifier extends IListAmplifier {

    @Override
    default String getFullId() {
        return String.format("%s%s", getType().getId(), getId());
    }

}
