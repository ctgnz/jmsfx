package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifierType;
import nz.co.ctg.jmsfx.model.Extension;

public enum ReliabilityRating implements EnumeratedAmplifier {
    COMPLETELY("A", "Completely Reliable"),
    USUALLY("B", "Usually Reliable"),
    FAIRLY("C", "Fairly Reliable"),
    NOT_USUALLY("D", "Not Usually Reliable"),
    UNRELIABLE("E", "Unreliable"),
    REL_CANNOT_BE_JUDGED("F", "Reliability Cannot Be Judged");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.RELIABILITY_RATING;

    private final String id;
    private final String label;
    
    private ReliabilityRating(String id, String label) {
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
    
    public boolean isDeprecated() {
        try {
            return ReliabilityRating.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return ReliabilityRating.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

   @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}