package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.AmplifierGroupType;

public enum InstallationComposition implements AmplifierGroup {
    DEVELOPMENT("DEVELOP", "Development"),
    RESEARCH("RSRCH", "Research"),
    PRODUCTION("PROD", "Production"),
    SERVICE("SVC", "Service"),
    STORAGE("STORE", "Storage"),
    UTILITY("UTIL", "Utility");

    private static final AmplifierGroupType TYPE = AmplifierGroupType.INSTALLATION_COMPOSITION;

    private final String id;
    private final String label;
    
    private InstallationComposition(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicLocation() {
        return "NA";
    }
    
    @Override
    public String getFullId() {
        return String.format("%s%s", TYPE.getId(), id);
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }

}