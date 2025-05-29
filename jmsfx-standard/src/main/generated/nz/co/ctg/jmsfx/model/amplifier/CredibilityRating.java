package nz.co.ctg.jmsfx.model.amplifier;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.EnumeratedAmplifierType;
import nz.co.ctg.jmsfx.model.Extension;

public enum CredibilityRating implements EnumeratedAmplifier {
    CONFIRMED("1", "Confirmed by Other Sources"),
    PROBABLY("2", "Probably True"),
    POSSIBLY("3", "Possibly True"),
    DOUBTFULLY("4", "Doubtfully True"),
    IMPROBABLE("5", "Improbable"),
    CRED_CANNOT_BE_JUDGED("6", "Truth Cannot Be Judged");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.CREDIBILITY_RATING;

    private final String id;
    private final String label;
    
    private CredibilityRating(String id, String label) {
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
            return CredibilityRating.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return CredibilityRating.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

   @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}