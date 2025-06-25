package io.github.ctgnz.jmsfx.standard.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.AmplifierListEnum;

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

    @Override
    public String getName() {
        return name();
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}