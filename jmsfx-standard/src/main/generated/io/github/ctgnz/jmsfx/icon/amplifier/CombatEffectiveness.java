package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.IAmplifierList;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierList;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum CombatEffectiveness implements IAmplifierListItem {
    FULLY_OPERATIONAL("FO", "Fully Operational"),
    SUBSTANTIALLY_OPERATIONAL("SO", "Substantially Operational"),
    MARGINALLY_OPERATIONAL("MO", "Marginally Operational"),
    NOT_OPERATIONAL("NO", "Not Operational"),
    UNKNOWN_EFFECTIVENESS("UNK", "Unknown");

    private final String id;
    private final String label;

    CombatEffectiveness(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public IAmplifierList getAmplifierList() {
        return AmplifierList.COMBAT_EFFECTIVENESS;
    }

    @Override
    public String getGraphicLocation() {
        return "NA";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public boolean isDeprecated() {
        try {
            return CombatEffectiveness.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return CombatEffectiveness.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}