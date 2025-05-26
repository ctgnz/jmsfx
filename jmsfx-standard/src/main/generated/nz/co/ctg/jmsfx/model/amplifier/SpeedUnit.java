package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifierType;

public enum SpeedUnit implements EnumeratedAmplifier {
    KPH("KPH", "Kilometers Per Hour"),
    MPS("MPS", "Meters Per Second"),
    KTS("KTS", "Nautical Miles Per Hour (Knots)"),
    MPH("MPH", "Statute Miles Per Hour");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.SPEED_UNIT;

    private final String id;
    private final String label;
    
    private SpeedUnit(String id, String label) {
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