package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifierType;

public enum SigintMobility implements EnumeratedAmplifier {
    MOBILE_INDICATOR("M", "Mobile"),
    STATIC_INDICATOR("S", "Static"),
    UNCERTAIN_INDICATOR("U", "Uncertain");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.SIGINT_MOBILITY;

    private final String id;
    private final String label;
    
    private SigintMobility(String id, String label) {
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
    
    @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}