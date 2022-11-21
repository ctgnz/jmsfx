package nz.co.ctg.jmsfx.model;

public enum StandardServiceTier implements FrameAmplifierGroup {
    REGULARS("01", "Regulars", "#80E0FF"),
    CONSCRIPTS("02", "Conscripts", "#FF8080"),
    RESERVE_L1("03", "Reserve Level 1 (Regulars)", "#AAFFAA"),
    RESERVE_L2("04", "Reserve Level 2 (Volunteers)", "#FFFF80"),
    RESERVE_L3("05", "Reserve Level 3 (Militia)", "#E68646"),
    CONTRACTORS("06", "Civilian Contractors", "#FFA1FF");

    private final String id;
    private final String label;
    private final String backgroundFill;
    
    private StandardServiceTier(String id, String label, String backgroundFill) {
        this.id = id;
        this.label = label;
        this.backgroundFill = backgroundFill;
    }
    
    @Override
    public String getGraphicLocation() {
        return "Extension";
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