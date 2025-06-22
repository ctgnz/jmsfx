package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum InstallationComposition implements AmplifierListItem {
    DEVELOPMENT("DEVELOP", "Development"),
    RESEARCH("RSRCH", "Research"),
    PRODUCTION("PROD", "Production"),
    SERVICE("SVC", "Service"),
    STORAGE("STORE", "Storage"),
    UTILITY("UTIL", "Utility");

    private final String id;
    private final String label;

    InstallationComposition(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.INSTALLATION_COMPOSITION;
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
            return InstallationComposition.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return InstallationComposition.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}