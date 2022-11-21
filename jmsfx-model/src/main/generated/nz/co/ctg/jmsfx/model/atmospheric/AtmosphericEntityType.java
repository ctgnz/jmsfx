package nz.co.ctg.jmsfx.model.atmospheric;

import java.util.List;

import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.IconType;

public enum AtmosphericEntityType implements EntityType {
    LOW_PRESSURE_CENTER("01", "Low Pressure Center", AtmosphericEntity.PRESSURE_SYSTEMS, IconType.MAIN),
    HIGH_PRESSURE_CENTER("02", "High Pressure Center", AtmosphericEntity.PRESSURE_SYSTEMS, IconType.MAIN),
    FRONTAL_SYSTEMS("03", "Frontal Systems", AtmosphericEntity.PRESSURE_SYSTEMS, IconType.NA),
    LINES("04", "Lines", AtmosphericEntity.PRESSURE_SYSTEMS, IconType.NA),
    PRESSURE_TENDENCY("05", "Pressure Tendency", AtmosphericEntity.PRESSURE_SYSTEMS, IconType.NA),
    LIGHT("01", "Light", AtmosphericEntity.TURBULENCE, IconType.MAIN),
    MODERATE("02", "Moderate", AtmosphericEntity.TURBULENCE, IconType.MAIN),
    SEVERE("03", "Severe", AtmosphericEntity.TURBULENCE, IconType.MAIN),
    EXTREME("04", "Extreme", AtmosphericEntity.TURBULENCE, IconType.MAIN),
    MOUNTAIN_WAVES("05", "Mountain Waves", AtmosphericEntity.TURBULENCE, IconType.MAIN),
    CLEAR_ICING("01", "Clear Icing", AtmosphericEntity.ICING, IconType.NA),
    RIME_ICING("02", "Rime Icing", AtmosphericEntity.ICING, IconType.NA),
    MIXED_ICING("03", "Mixed Icing", AtmosphericEntity.ICING, IconType.NA),
    CALM_WINDS("01", "Calm Winds", AtmosphericEntity.WINDS, IconType.MAIN),
    WIND_PLOT("02", "Wind Plot", AtmosphericEntity.WINDS, IconType.MAIN) {
        @Override
        public String getGraphicIdentifier() {
            return "45140200.3";
        }
    },
    JET_STREAM("03", "Jet Stream", AtmosphericEntity.WINDS, IconType.MAIN),
    STREAM_LINE("04", "Stream Line", AtmosphericEntity.WINDS, IconType.MAIN),
    CLOUD_COVERAGE_SYMBOLS("01", "Cloud Coverage Symbols", AtmosphericEntity.CLOUD_COVER, IconType.NA),
    RAIN("01", "Rain", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    FREEZING_RAIN("02", "Freezing Rain", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    RAIN_SHOWERS("03", "Rain Showers", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    DRIZZLE("04", "Drizzle", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    FREEZING_DRIZZLE("05", "Freezing Drizzle", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    RAIN_SNOW_MIXED("06", "Rain and Snow Mixed", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    SNOW("07", "Snow", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    SNOW_GRAINS("08", "Snow Grains", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    SNOW_SHOWERS("09", "Snow Showers", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    HAIL("10", "Hail", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    ICE_CRYSTALS_DIAMOND_DUST("11", "Ice Crystals (Diamond Dust)", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    ICE_PELLETS_SLEET("12", "Ice Pellets (Sleet)", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    INVERSION("13", "Inversion", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    STORMS("14", "Storms", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    FOG("15", "Fog", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    MIST("16", "Mist", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    SMOKE("17", "Smoke", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    HAZE("18", "Haze", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    DUST_SAND("19", "Dust or Sand", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    TROPICAL_STORM_SYSTEMS("20", "Tropical Storm Systems", AtmosphericEntity.WEATHER_SYMBOLS, IconType.NA),
    VOLCANIC_ERUPTION("21", "Volcanic Eruption", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    TROPOPAUSE_LEVEL("22", "Tropopause Level", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    FREEZING_LEVEL("23", "Freezing Level", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    PRECIPITATION_UNKNOWN_TYPE_INTENSITY("24", "Precipitation of Unknown Type and Intensity", AtmosphericEntity.WEATHER_SYMBOLS, IconType.MAIN),
    INSTRUMENT_FLIGHT_RULE_IFR("01", "Instrument Flight Rule (IFR)", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    MARGINAL_VISUAL_FLIGHT_RULE_MVFR("02", "Marginal Visual Flight Rule (MVFR)", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    TURBULENCE_BOUNDED("03", "Turbulence", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    ICING_BOUNDED("04", "Icing", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    LIQUID_PRECIPITATION_NON_CONVECTIVE("05", "Liquid Precipitation - Non-Convective Continuous or Intermittent", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    FREEZING_PRECIPITATION("06", "Freezing /Frozen Precipitation", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    THUNDERSTORM_BOUNDED("07", "Thunderstorm", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    FOG_BOUNDED("08", "Fog", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    DUST_SAND_BOUNDED("09", "Dust or Sand", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    OPERATOR_DEFINED_FREEFORM_BOUNDED("10", "Operator-Defined Freeform", AtmosphericEntity.BOUNDED_AREAS_WEATHER, IconType.MAIN),
    ISOBAR_SURFACE("01", "Isobar - Surface", AtmosphericEntity.ISOPLETHS, IconType.MAIN),
    CONTOUR_UPPER_AIR("02", "Contour - Upper Air", AtmosphericEntity.ISOPLETHS, IconType.MAIN),
    ISOTHERM("03", "Isotherm", AtmosphericEntity.ISOPLETHS, IconType.MAIN),
    ISOTACH("04", "Isotach", AtmosphericEntity.ISOPLETHS, IconType.MAIN),
    ISODROSOTHERM("05", "Isodrosotherm", AtmosphericEntity.ISOPLETHS, IconType.MAIN),
    THICKNESS("06", "Thickness", AtmosphericEntity.ISOPLETHS, IconType.MAIN),
    OPERATOR_DEFINED_FREEFORM("07", "Operator-Defined Freeform", AtmosphericEntity.ISOPLETHS, IconType.MAIN),
    WITHOUT_SNOW_MEASURABLE_ICE_COVER("01", "Without Snow or Measurable Ice Cover", AtmosphericEntity.STATE_GROUND, IconType.NA),
    WITH_SNOW_MEASURABLE_ICE_COVER("02", "With Snow or Measurable Ice Cover", AtmosphericEntity.STATE_GROUND, IconType.NA);

    private final String id;
    private final String label;
    private final AtmosphericEntity entity;
    private final IconType iconType;
    
    private AtmosphericEntityType(String id, String label, AtmosphericEntity entity, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }
    
   @Override
    public List<EntitySubType> getEntitySubTypes() {
        return AtmosphericSymbolSetInfo.INSTANCE.getEntitySubTypes(this);
    }    

}