package io.github.ctgnz.jmsfx;

public interface StandardAmplifierItem extends AmplifierListItem {

    @Override
    default String getFullId() {
        return String.format("%s%s", getAmplifierList().getId(), getId());
    }

}
