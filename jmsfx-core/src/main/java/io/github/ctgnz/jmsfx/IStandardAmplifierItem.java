package io.github.ctgnz.jmsfx;

public interface IStandardAmplifierItem extends IAmplifierListItem {

    @Override
    default String getFullId() {
        return String.format("%s%s", getAmplifierList().getId(), getId());
    }

}
