package nz.co.ctg.jmsfx.model;

public enum UnknownAmplifier implements FrameAmplifierGroup {
    NA("00", "Unknown", "");

    private final String id;
    private final String label;
    private final String backgroundFill;
    
    private UnknownAmplifier(String id, String label, String backgroundFill) {
        this.id = id;
        this.label = label;
        this.backgroundFill = backgroundFill;
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
    public String getBackgroundFill() {
        return backgroundFill;
    }
}