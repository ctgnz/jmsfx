package nz.co.ctg.jmsfx.model.atmospheric;

import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.IconType;

public enum AtmosphericEntitySubType implements EntitySubType {
    CYCLONE_CENTER("01", "Cyclone Center", AtmosphericEntityType.LOW_PRESSURE_CENTER, IconType.MAIN),
    TROPOPAUSE_LOW("02", "Tropopause Low", AtmosphericEntityType.LOW_PRESSURE_CENTER, IconType.MAIN),
    ANTICYCLONE_CENTER("01", "Anticyclone Center", AtmosphericEntityType.HIGH_PRESSURE_CENTER, IconType.MAIN),
    TROPOPAUSE_HIGH("02", "Tropopause High", AtmosphericEntityType.HIGH_PRESSURE_CENTER, IconType.MAIN),
    COLD_FRONT("01", "Cold Front", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    UPPER_COLD_FRONT("02", "Upper Cold Front", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    COLD_FRONTOGENESIS("03", "Cold Frontogenesis", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    COLD_FRONTOLYSIS("04", "Cold Frontolysis", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    WARM_FRONT("05", "Warm Front", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    UPPER_WARM_FRONT("06", "Upper Warm Front", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    WARM_FRONTOGENESIS("07", "Warm Frontogenesis", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    WARM_FRONTOLYSIS("08", "Warm Frontolysis", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    OCCLUDED_FRONT("09", "Occluded Front", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    UPPER_OCCLUDED_FRONT("10", "Upper Occluded Front", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    OCCLUDED_FRONTOLYSIS("11", "Occluded Frontolysis", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    STATIONARY_FRONT("12", "Stationary Front", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    UPPER_STATIONARY_FRONT("13", "Upper Stationary Front", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    STATIONARY_FRONTOGENESIS("14", "Stationary Frontogenesis", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    STATIONARY_FRONTOLYSIS("15", "Stationary Frontolysis", AtmosphericEntityType.FRONTAL_SYSTEMS, IconType.MAIN),
    TROUGH_AXIS("01", "Trough Axis", AtmosphericEntityType.LINES, IconType.MAIN),
    UPPER_TROUGH_AXIS("02", "Upper Trough Axis", AtmosphericEntityType.LINES, IconType.MAIN),
    RIDGE_AXIS("03", "Ridge Axis", AtmosphericEntityType.LINES, IconType.MAIN),
    SEVERE_SQUALL_LINE("04", "Severe Squall Line", AtmosphericEntityType.LINES, IconType.MAIN),
    INSTABILITY_LINE("05", "Instability Line", AtmosphericEntityType.LINES, IconType.MAIN),
    SHEAR_LINE("06", "Shear Line", AtmosphericEntityType.LINES, IconType.MAIN),
    INTER_TROPICAL_CONVERGENCE_ZONE("07", "Inter-Tropical Convergence Zone", AtmosphericEntityType.LINES, IconType.MAIN),
    CONVERGENCE_LINE("08", "Convergence Line", AtmosphericEntityType.LINES, IconType.MAIN),
    INTER_TROPICAL_DISCONTINUITY("09", "Inter-Tropical Discontinuity", AtmosphericEntityType.LINES, IconType.MAIN),
    RISE_THEN_FALL_HIGHER("01", "Rise Then Fall Higher", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    RISE_THEN_STEADY("02", "Rise Then Steady", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    RISE("03", "Rise", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    RISE_THEN_RISE_HIGHER("04", "Rise Then Rise Higher", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    STEADY("05", "Steady", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    FALL_THEN_RISE_LOWER("06", "Fall Then Rise Lower", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    FALL_THEN_STEADY("07", "Fall Then Steady", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    FALL("08", "Fall", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    RISE_THEN_FALL_LOWER("09", "Rise Then Fall Lower", AtmosphericEntityType.PRESSURE_TENDENCY, IconType.MAIN),
    CLEAR_ICING_LIGHT("01", "Light", AtmosphericEntityType.CLEAR_ICING, IconType.MAIN),
    CLEAR_ICING_MODERATE("02", "Moderate", AtmosphericEntityType.CLEAR_ICING, IconType.MAIN),
    CLEAR_ICING_SEVERE("03", "Severe", AtmosphericEntityType.CLEAR_ICING, IconType.MAIN),
    RIME_ICING_LIGHT("01", "Light", AtmosphericEntityType.RIME_ICING, IconType.MAIN),
    RIME_ICING_MODERATE("02", "Moderate", AtmosphericEntityType.RIME_ICING, IconType.MAIN),
    RIME_ICING_SEVERE("03", "Severe", AtmosphericEntityType.RIME_ICING, IconType.MAIN),
    MIXED_ICING_LIGHT("01", "Light", AtmosphericEntityType.MIXED_ICING, IconType.MAIN),
    MIXED_ICING_MODERATE("02", "Moderate", AtmosphericEntityType.MIXED_ICING, IconType.MAIN),
    MIXED_ICING_SEVERE("03", "Severe", AtmosphericEntityType.MIXED_ICING, IconType.MAIN),
    CLEAR_SKY("01", "Clear Sky", AtmosphericEntityType.CLOUD_COVERAGE_SYMBOLS, IconType.MAIN),
    FEW_COVERAGE("02", "Few Coverage", AtmosphericEntityType.CLOUD_COVERAGE_SYMBOLS, IconType.MAIN),
    SCATTERED_COVERAGE("03", "Scattered Coverage", AtmosphericEntityType.CLOUD_COVERAGE_SYMBOLS, IconType.MAIN),
    BROKEN_COVERAGE("04", "Broken Coverage", AtmosphericEntityType.CLOUD_COVERAGE_SYMBOLS, IconType.MAIN),
    OVERCAST_COVERAGE("05", "Overcast Coverage", AtmosphericEntityType.CLOUD_COVERAGE_SYMBOLS, IconType.MAIN),
    SKY_TOTALLY_OR_PARTIALLY_OBSCURED("06", "Sky Totally or Partially Obscured", AtmosphericEntityType.CLOUD_COVERAGE_SYMBOLS, IconType.MAIN),
    RAIN_INTERMITTENT_LIGHT("01", "Intermittent Light", AtmosphericEntityType.RAIN, IconType.MAIN),
    RAIN_CONTINUOUS_LIGHT("02", "Continuous Light", AtmosphericEntityType.RAIN, IconType.MAIN),
    RAIN_INTERMITTENT_MODERATE("03", "Intermittent Moderate", AtmosphericEntityType.RAIN, IconType.MAIN),
    RAIN_INTERMITTENT_CONTINUOUS_MODERATE("04", "Intermittent Moderate/Continuous Moderate", AtmosphericEntityType.RAIN, IconType.MAIN),
    RAIN_INTERMITTENT_HEAVY("05", "Intermittent Heavy", AtmosphericEntityType.RAIN, IconType.MAIN),
    RAIN_INTERMITTENT_CONTINUOUS_HEAVY("06", "Intermittent Heavy/Continuous Heavy", AtmosphericEntityType.RAIN, IconType.MAIN),
    FREEZING_RAIN_LIGHT("01", "Light", AtmosphericEntityType.FREEZING_RAIN, IconType.MAIN),
    FREEZING_RAIN_MODERATE_HEAVY("02", "Moderate/Heavy", AtmosphericEntityType.FREEZING_RAIN, IconType.MAIN),
    RAIN_SHOWERS_LIGHT("01", "Light", AtmosphericEntityType.RAIN_SHOWERS, IconType.MAIN),
    RAIN_SHOWERS_MODERATE_HEAVY("02", "Moderate/Heavy", AtmosphericEntityType.RAIN_SHOWERS, IconType.MAIN),
    RAIN_SHOWERS_TORRENTIAL("03", "Torrential", AtmosphericEntityType.RAIN_SHOWERS, IconType.MAIN),
    DRIZZLE_INTERMITTENT_LIGHT("01", "Intermittent Light", AtmosphericEntityType.DRIZZLE, IconType.MAIN),
    DRIZZLE_INTERMITTENT_CONTINUOUS_LIGHT("02", "Intermittent Light/Continuous Light", AtmosphericEntityType.DRIZZLE, IconType.MAIN),
    DRIZZLE_INTERMITTENT_MODERATE("03", "Intermittent Moderate", AtmosphericEntityType.DRIZZLE, IconType.MAIN),
    DRIZZLE_INTERMITTENT_CONTINUOUS_MODERATE("04", "Intermittent Moderate/Continuous Moderate", AtmosphericEntityType.DRIZZLE, IconType.MAIN),
    DRIZZLE_INTERMITTENT_HEAVY("05", "Intermittent Heavy", AtmosphericEntityType.DRIZZLE, IconType.MAIN),
    DRIZZLE_INTERMITTENT_CONTINUOUS_HEAVY("06", "Intermittent Heavy/Continuous Heavy", AtmosphericEntityType.DRIZZLE, IconType.MAIN),
    FREEZING_DRIZZLE_LIGHT("01", "Light", AtmosphericEntityType.FREEZING_DRIZZLE, IconType.MAIN),
    FREEZING_DRIZZLE_MODERATE_HEAVY("02", "Moderate/Heavy", AtmosphericEntityType.FREEZING_DRIZZLE, IconType.MAIN),
    RAIN_DRIZZLE_SNOW_LIGHT("01", "Rain or Drizzle and Snow - Light", AtmosphericEntityType.RAIN_SNOW_MIXED, IconType.MAIN),
    RAIN_DRIZZLE_SNOW_MODERATE_HEAVY("02", "Rain or Drizzle and Snow - Moderate/Heavy", AtmosphericEntityType.RAIN_SNOW_MIXED, IconType.MAIN),
    RAIN_SNOW_SHOWERS_LIGHT("03", "Rain and Snow Showers - Light", AtmosphericEntityType.RAIN_SNOW_MIXED, IconType.MAIN),
    RAIN_SNOW_SHOWERS_MODERATE_HEAVY("04", "Rain and Snow Showers - Moderate/Heavy", AtmosphericEntityType.RAIN_SNOW_MIXED, IconType.MAIN),
    SNOW_INTERMITTENT_LIGHT("01", "Intermittent Light", AtmosphericEntityType.SNOW, IconType.MAIN),
    SNOW_INTERMITTENT_CONTINUOUS_LIGHT("02", "Intermittent Light/Continuous Light", AtmosphericEntityType.SNOW, IconType.MAIN),
    SNOW_INTERMITTENT_MODERATE("03", "Intermittent Moderate", AtmosphericEntityType.SNOW, IconType.MAIN),
    SNOW_INTERMITTENT_CONTINUOUS_MODERATE("04", "Intermittent Moderate/Continuous Moderate", AtmosphericEntityType.SNOW, IconType.MAIN),
    SNOW_INTERMITTENT_HEAVY("05", "Intermittent Heavy", AtmosphericEntityType.SNOW, IconType.MAIN),
    SNOW_INTERMITTENT_CONTINUOUS_HEAVY("06", "Intermittent Heavy/Continuous Heavy", AtmosphericEntityType.SNOW, IconType.MAIN),
    BLOWING_SNOW_LIGHT_MODERATE("07", "Blowing Snow - Light/Moderate", AtmosphericEntityType.SNOW, IconType.MAIN),
    BLOWING_SNOW_HEAVY("08", "Blowing Snow - Heavy", AtmosphericEntityType.SNOW, IconType.MAIN),
    SNOW_SHOWERS_LIGHT("01", "Light", AtmosphericEntityType.SNOW_SHOWERS, IconType.MAIN),
    SNOW_SHOWERS_MODERATE_HEAVY("02", "Moderate/Heavy", AtmosphericEntityType.SNOW_SHOWERS, IconType.MAIN),
    HAIL_LIGHT_NOT_THUNDER("01", "Light not Associated with Thunder", AtmosphericEntityType.HAIL, IconType.MAIN),
    HAIL_MODERATE_HEAVY_NOT_THUNDER("02", "Moderate/Heavy not Associated with Thunder", AtmosphericEntityType.HAIL, IconType.MAIN),
    SLEET_LIGHT("01", "Light", AtmosphericEntityType.ICE_PELLETS_SLEET, IconType.MAIN),
    SLEET_MODERATE("02", "Moderate", AtmosphericEntityType.ICE_PELLETS_SLEET, IconType.MAIN),
    SLEET_HEAVY("03", "Heavy", AtmosphericEntityType.ICE_PELLETS_SLEET, IconType.MAIN),
    THUNDERSTORM_NO_PRECIPITATION("01", "Thunderstorm - No Precipitation", AtmosphericEntityType.STORMS, IconType.MAIN),
    THUNDERSTORM_LIGHT_MODERATE_RAIN_SNOW_NO_HAIL("02", "Thunderstorm Light to Moderate with Rain/Snow - No Hail", AtmosphericEntityType.STORMS, IconType.MAIN),
    THUNDERSTORM_HEAVY_RAIN_SNOW_NO_HAIL("03", "Thunderstorm Heavy with Rain/Snow - No Hail", AtmosphericEntityType.STORMS, IconType.MAIN),
    THUNDERSTORM_LIGHT_MODERATE_WITH_HAIL("04", "Thunderstorm Light to Moderate - With Hail", AtmosphericEntityType.STORMS, IconType.MAIN),
    THUNDERSTORM_HEAVY_WITH_HAIL("05", "Thunderstorm Heavy - With Hail", AtmosphericEntityType.STORMS, IconType.MAIN),
    FUNNEL_CLOUD_TORNADO_WATERSPOUT("06", "Funnel Cloud (Tornado/Waterspout)", AtmosphericEntityType.STORMS, IconType.MAIN),
    SQUALL("07", "Squall", AtmosphericEntityType.STORMS, IconType.MAIN),
    LIGHTNING("08", "Lightning", AtmosphericEntityType.STORMS, IconType.MAIN),
    FOG_SHALLOW_PATCHES("01", "Shallow Patches", AtmosphericEntityType.FOG, IconType.MAIN),
    FOG_SHALLOW_CONTINUOUS("02", "Shallow Continuous", AtmosphericEntityType.FOG, IconType.MAIN),
    FOG_PATCHY("03", "Patchy", AtmosphericEntityType.FOG, IconType.MAIN),
    FOG_SKY_VISIBLE("04", "Sky Visible", AtmosphericEntityType.FOG, IconType.MAIN),
    FOG_SKY_OBSCURED("05", "Sky Obscured", AtmosphericEntityType.FOG, IconType.MAIN),
    FOG_FREEZING_SKY_VISIBLE("06", "Freezing-Sky Visible", AtmosphericEntityType.FOG, IconType.MAIN),
    FOG_FREEZING_SKY_OBSCURED("07", "Freezing-Sky Obscured", AtmosphericEntityType.FOG, IconType.MAIN),
    DUST_SAND_LIGHT_TO_MODERATE("01", "Light to Moderate", AtmosphericEntityType.DUST_SAND, IconType.MAIN),
    DUST_SAND_SEVERE("02", "Severe", AtmosphericEntityType.DUST_SAND, IconType.MAIN),
    DUST_DEVIL("03", "Dust Devil", AtmosphericEntityType.DUST_SAND, IconType.MAIN),
    BLOWING_DUST_SAND("04", "Blowing Dust or Sand", AtmosphericEntityType.DUST_SAND, IconType.MAIN),
    TROPICAL_DEPRESSION("01", "Tropical Depression", AtmosphericEntityType.TROPICAL_STORM_SYSTEMS, IconType.MAIN),
    TROPICAL_STORM("02", "Tropical Storm", AtmosphericEntityType.TROPICAL_STORM_SYSTEMS, IconType.MAIN),
    HURRICANE_TYPHOON("03", "Hurricane/Typhoon", AtmosphericEntityType.TROPICAL_STORM_SYSTEMS, IconType.MAIN),
    TROPICAL_STORM_WIND_AREAS_DATE_TIME_LABELS("04", "Tropical Storm Wind Areas and Date/Time Labels", AtmosphericEntityType.TROPICAL_STORM_SYSTEMS, IconType.MAIN),
    VOLCANIC_ASH("01", "Volcanic Ash", AtmosphericEntityType.VOLCANIC_ERUPTION, IconType.MAIN),
    LIQUID_PRECIPITATION_CONVECTIVE("01", "Liquid Precipitation - Convective", AtmosphericEntityType.LIQUID_PRECIPITATION_NON_CONVECTIVE, IconType.MAIN),
    SURFACE_DRY("01", "Surface Dry Without Cracks or Appreciable Dust or Loose Sand", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    SURFACE_MOIST("02", "Surface Moist", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    SURFACE_WET("03", "Surface Wet-Standing Water in Small or Large Pools", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    SURFACE_FLOODED("04", "Surface Flooded", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    SURFACE_FROZEN("05", "Surface Frozen", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    GLAZE_THIN_ICE_ON_GROUND("06", "Glaze (Thin Ice) on Ground", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    LOOSE_DUST_SAND_NOT_COVERING("07", "Loose Dry Dust or Sand not Covering Ground Completely", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    THIN_LOOSE_DUST_SAND_COVERING("08", "Thin Loose Dry Dust or Sand Covering Ground Completely", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    MODERATE_THICK_LOOSE_DUST_SAND_COVERING("09", "Moderate/Thick Loose Dry Dust or Sand Covering Ground Completely", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    EXTREMELY_DRY_CRACKS("10", "Extremely Dry with Cracks", AtmosphericEntityType.WITHOUT_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    PREDOMINATELY_ICE_COVERED("01", "Predominately Ice Covered", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    COMPACT_WET_SNOW_COVERING_LESS_THAN_HALF("02", "Compact or Wet Snow (with or without Ice) Covering Less Than One-Half of Ground", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    COMPACT_WET_SNOW_COVERING_HALF("03", "Compact or Wet Snow (with or without Ice) Covering at Least One-Half of Ground-but Ground not Completely Covered", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    EVEN_COMPACT_WET_SNOW_COVERING("04", "Even Layer of Compact or Wet Snow Covering Ground Completely", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    UNEVEN_COMPACT_WET_SNOW_COVERING("05", "Uneven Layer of Compact or Wet Snow Covering Ground Completely", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    LOOSE_DRY_SNOW_COVERING_LESS_THAN_HALF("06", "Loose Dry Snow Covering Less Than One-Half of Ground", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    LOOSE_DRY_SNOW_COVERING_HALF("07", "Loose Dry Snow Covering at Least One-Half of Ground-but Ground not Completely Covered", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    EVEN_LOOSE_DRY_SNOW_COVERING("08", "Even Layer of Loose Dry Snow Covering Ground Completely", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    UNEVEN_LOOSE_DRY_SNOW_COVERING("09", "Uneven Layer of Loose Dry Snow Covering Ground Completely", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN),
    SNOW_DEEP_DRIFTS("10", "Snow Covering Ground Completely-Deep Drifts", AtmosphericEntityType.WITH_SNOW_MEASURABLE_ICE_COVER, IconType.MAIN);

    private final String id;
    private final String label;
    private final AtmosphericEntityType entityType;
    private final IconType iconType;
    
    private AtmosphericEntitySubType(String id, String label, AtmosphericEntityType entityType, IconType iconType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
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
    public EntityType getEntityType() {
        return entityType;
    }
    
}