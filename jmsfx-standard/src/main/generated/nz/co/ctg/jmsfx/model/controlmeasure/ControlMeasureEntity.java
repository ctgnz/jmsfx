package nz.co.ctg.jmsfx.model.controlmeasure;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.IconType;

public enum ControlMeasureEntity implements Entity {
    UNSPECIFIED("00", "Unspecified", IconType.NA),
    COMMAND_CONTROL_LINES("11", "Command and Control Lines", IconType.NA),
    COMMAND_CONTROL_AREAS("12", "Command and Control Areas", IconType.NA),
    COMMAND_CONTROL_POINTS("13", "Command and Control Points", IconType.NA),
    MANEUVER_LINES("14", "Maneuver Lines", IconType.NA),
    MANEUVER_AREAS("15", "Maneuver Areas", IconType.NA),
    MANEUVER_POINTS("16", "Maneuver Points", IconType.NA),
    AIRSPACE_CONTROL_CORRIDORS_AREAS("17", "Airspace Control (Corridors) Areas", IconType.NA),
    AIRSPACE_CONTROL_POINTS("18", "Airspace Control Points", IconType.MAIN),
    AIRSPACE_CONTROL_LINES("19", "Airspace Control Lines", IconType.NA),
    MARITIME_CONTROL_AREAS("20", "Maritime Control Areas", IconType.NA),
    MARITIME_CONTROL_POINTS("21", "Maritime Control Points", IconType.NA),
    MARITIME_CONTROL_LINES("22", "Maritime Control Lines", IconType.NA),
    DECEPTION("23", "Deception", IconType.NA),
    FIRES_AREAS("24", "Fires Areas", IconType.NA),
    FIRES_POINTS("25", "Fires Points", IconType.NA),
    FIRE_LINES("26", "Fire Lines", IconType.NA),
    PROTECTION_AREAS("27", "Protection Areas", IconType.NA),
    PROTECTION_POINTS("28", "Protection Points", IconType.NA),
    PROTECTION_LINES("29", "Protection Lines", IconType.NA),
    INTELLIGENCE_LINES("30", "Intelligence Lines", IconType.NA),
    SUSTAINMENT_AREAS("31", "Sustainment Areas", IconType.NA),
    SUSTAINMENT_POINTS("32", "Sustainment Points", IconType.NA),
    SUSTAINMENT_LINES("33", "Sustainment Lines", IconType.NA),
    MISSION_TASKS("34", "Mission Tasks", IconType.NA);

    private final String id;
    private final String label;
    private final IconType iconType;
    
    private ControlMeasureEntity(String id, String label, IconType iconType) {
        this.id = id;
        this.label = label;
        this.iconType = iconType;
    }
    
    @Override
    public IconType getIconType() {
        return iconType;
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
    public SymbolSet getSymbolSet() {
        return SymbolSet.SS_CONTROL_MEASURE;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return ControlMeasureSymbolSetInfo.INSTANCE.getEntityTypes(this);
    }    
    
    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }
    
}