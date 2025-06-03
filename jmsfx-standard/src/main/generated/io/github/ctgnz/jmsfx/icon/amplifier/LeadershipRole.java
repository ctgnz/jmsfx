package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.icon.StandardAmplifier;
import io.github.ctgnz.jmsfx.icon.ListAmplifierType;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum LeadershipRole implements StandardAmplifier {
    LEADER_INDIVIDUAL("1", "Leader"),
    DEPUTY_LEADER_INDIVIDUAL("2", "Deputy Leader");

    private static final ListAmplifierType TYPE = ListAmplifierType.LEADERSHIP_ROLE;

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
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public ListAmplifierType getType() {
        return TYPE;
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