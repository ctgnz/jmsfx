package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.icon.StandardEnumeratedAmplifier;
import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum LeadershipRole implements StandardEnumeratedAmplifier {
    LEADER_INDIVIDUAL("1", "Leader"),
    DEPUTY_LEADER_INDIVIDUAL("2", "Deputy Leader");

    private static final EnumeratedAmplifierType TYPE = EnumeratedAmplifierType.LEADERSHIP_ROLE;

    private final String id;
    private final String label;
    
    private LeadershipRole(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getGraphicLocation() {
        return "Amplifier";
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
            return LeadershipRole.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return LeadershipRole.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

   @Override
    public boolean isGraphicalIcon() {
        return true;
    }


}