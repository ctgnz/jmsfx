package io.github.ctgnz.jmsfx.standard;

import java.util.Arrays;
import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;

public enum StatusEnum implements Status {
        PRESENT("0", "Present", false),
        PLANNED("1", "Planned/Anticipated/Suspect", false),
        FULLY_CAPABLE("2", "Present/Fully Capable", true, "ACTIVITY", "AIR", "COMMON", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE",
                      "SPACE") {
            @Override
            public Rectangle2D getStatusBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getFrameId()) {
                    case "100" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "101" -> new Rectangle2D(132.72, 522, 347.01, 58);
                    case "105" -> new Rectangle2D(132.72, 522, 347.01, 58);
                    case "110" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "115" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "120" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "127" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "130" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "135" -> new Rectangle2D(132.72, 596, 347.01, 58);
                    case "140" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "160" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "300" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "301" -> new Rectangle2D(174.06, 525, 265.79, 58);
                    case "305" -> new Rectangle2D(174.06, 525, 265.79, 58);
                    case "310" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "315" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "320" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "327" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "330" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "335" -> new Rectangle2D(174.06, 600, 265.79, 58);
                    case "340" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "360" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "400" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "401" -> new Rectangle2D(171.5, 550, 269, 58);
                    case "405" -> new Rectangle2D(171.5, 521, 269, 58);
                    case "410" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "415" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "420" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "427" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "430" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "435" -> new Rectangle2D(171.5, 550, 269, 58);
                    case "440" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "460" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "600" -> new Rectangle2D(132.72, 580, 348.78, 58);
                    case "601" -> new Rectangle2D(170.75, 523, 269, 58);
                    case "605" -> new Rectangle2D(171.75, 523, 269, 58);
                    case "610" -> new Rectangle2D(130.5, 580, 351, 58);
                    case "615" -> new Rectangle2D(130.5, 581, 351, 58);
                    case "620" -> new Rectangle2D(130.5, 577, 351, 58);
                    case "627" -> new Rectangle2D(130.5, 581, 351, 58);
                    case "630" -> new Rectangle2D(132.72, 580, 347.01, 58);
                    case "635" -> new Rectangle2D(171.25, 596, 269, 58);
                    case "640" -> new Rectangle2D(132.72, 580, 347.01, 58);
                    case "660" -> new Rectangle2D(130.5, 580, 351, 58);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        DAMAGED("3", "Present/Damaged", true, "ACTIVITY", "AIR", "COMMON", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE") {
            @Override
            public Rectangle2D getStatusBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getFrameId()) {
                    case "100" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "101" -> new Rectangle2D(132.72, 522, 347.01, 58);
                    case "105" -> new Rectangle2D(132.72, 522, 347.01, 58);
                    case "110" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "115" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "120" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "127" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "130" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "135" -> new Rectangle2D(132.72, 596, 347.01, 58);
                    case "140" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "160" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "300" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "301" -> new Rectangle2D(174.06, 525, 265.79, 58);
                    case "305" -> new Rectangle2D(174.06, 525, 265.79, 58);
                    case "310" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "315" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "320" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "327" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "330" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "335" -> new Rectangle2D(174.06, 600, 265.79, 58);
                    case "340" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "360" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "400" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "401" -> new Rectangle2D(171.5, 550, 269, 58);
                    case "405" -> new Rectangle2D(171.5, 521, 269, 58);
                    case "410" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "415" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "420" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "427" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "430" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "435" -> new Rectangle2D(171.5, 550, 269, 58);
                    case "440" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "460" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "600" -> new Rectangle2D(132.72, 580, 348.78, 58);
                    case "601" -> new Rectangle2D(170.75, 523, 269, 58);
                    case "605" -> new Rectangle2D(171.75, 523, 269, 58);
                    case "610" -> new Rectangle2D(130.5, 580, 351, 58);
                    case "615" -> new Rectangle2D(130.5, 581, 351, 58);
                    case "620" -> new Rectangle2D(130.5, 577, 351, 58);
                    case "627" -> new Rectangle2D(130.5, 581, 351, 58);
                    case "630" -> new Rectangle2D(132.72, 580, 347.01, 58);
                    case "635" -> new Rectangle2D(171.25, 596, 269, 58);
                    case "640" -> new Rectangle2D(132.72, 580, 347.01, 58);
                    case "660" -> new Rectangle2D(130.5, 580, 351, 58);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        DESTROYED("4", "Present/Destroyed", true, "ACTIVITY", "AIR", "COMMON", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE",
                  "SPACE") {
            @Override
            public Rectangle2D getStatusBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getFrameId()) {
                    case "100" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "101" -> new Rectangle2D(132.72, 522, 347.01, 58);
                    case "105" -> new Rectangle2D(132.72, 522, 347.01, 58);
                    case "110" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "115" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "120" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "127" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "130" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "135" -> new Rectangle2D(132.72, 596, 347.01, 58);
                    case "140" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "160" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "300" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "301" -> new Rectangle2D(174.06, 525, 265.79, 58);
                    case "305" -> new Rectangle2D(174.06, 525, 265.79, 58);
                    case "310" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "315" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "320" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "327" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "330" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "335" -> new Rectangle2D(174.06, 600, 265.79, 58);
                    case "340" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "360" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "400" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "401" -> new Rectangle2D(171.5, 550, 269, 58);
                    case "405" -> new Rectangle2D(171.5, 521, 269, 58);
                    case "410" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "415" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "420" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "427" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "430" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "435" -> new Rectangle2D(171.5, 550, 269, 58);
                    case "440" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "460" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "600" -> new Rectangle2D(132.72, 580, 348.78, 58);
                    case "601" -> new Rectangle2D(170.75, 523, 269, 58);
                    case "605" -> new Rectangle2D(171.75, 523, 269, 58);
                    case "610" -> new Rectangle2D(130.5, 580, 351, 58);
                    case "615" -> new Rectangle2D(130.5, 581, 351, 58);
                    case "620" -> new Rectangle2D(130.5, 577, 351, 58);
                    case "627" -> new Rectangle2D(130.5, 581, 351, 58);
                    case "630" -> new Rectangle2D(132.72, 580, 347.01, 58);
                    case "635" -> new Rectangle2D(171.25, 596, 269, 58);
                    case "640" -> new Rectangle2D(132.72, 580, 347.01, 58);
                    case "660" -> new Rectangle2D(130.5, 580, 351, 58);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        FULL("5", "Present/Full to Capacity", true, "ACTIVITY", "AIR", "COMMON", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE",
             "SPACE") {
            @Override
            public Rectangle2D getStatusBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getFrameId()) {
                    case "100" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "101" -> new Rectangle2D(132.72, 522, 347.01, 58);
                    case "105" -> new Rectangle2D(132.72, 522, 347.01, 58);
                    case "110" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "115" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "120" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "127" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "130" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "135" -> new Rectangle2D(132.72, 596, 347.01, 58);
                    case "140" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "160" -> new Rectangle2D(132.72, 574, 347.01, 58);
                    case "300" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "301" -> new Rectangle2D(174.06, 525, 265.79, 58);
                    case "305" -> new Rectangle2D(174.06, 525, 265.79, 58);
                    case "310" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "315" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "320" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "327" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "330" -> new Rectangle2D(159.5, 551, 293, 58);
                    case "335" -> new Rectangle2D(174.06, 600, 265.79, 58);
                    case "340" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "360" -> new Rectangle2D(123.58, 524, 365, 58);
                    case "400" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "401" -> new Rectangle2D(171.5, 550, 269, 58);
                    case "405" -> new Rectangle2D(171.5, 521, 269, 58);
                    case "410" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "415" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "420" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "427" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "430" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "435" -> new Rectangle2D(171.5, 550, 269, 58);
                    case "440" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "460" -> new Rectangle2D(171.5, 540, 269, 58);
                    case "600" -> new Rectangle2D(132.72, 580, 348.78, 58);
                    case "601" -> new Rectangle2D(170.75, 523, 269, 58);
                    case "605" -> new Rectangle2D(171.75, 523, 269, 58);
                    case "610" -> new Rectangle2D(130.5, 580, 351, 58);
                    case "615" -> new Rectangle2D(130.5, 581, 351, 58);
                    case "620" -> new Rectangle2D(130.5, 577, 351, 58);
                    case "627" -> new Rectangle2D(130.5, 581, 351, 58);
                    case "630" -> new Rectangle2D(132.72, 580, 347.01, 58);
                    case "635" -> new Rectangle2D(171.25, 596, 269, 58);
                    case "640" -> new Rectangle2D(132.72, 580, 347.01, 58);
                    case "660" -> new Rectangle2D(130.5, 580, 351, 58);
                    default -> Rectangle2D.EMPTY;
                };
            }
        };

    private final String id;
    private final String label;
    private final boolean operationalCondition;
    private final String[] dimensionIds;

    StatusEnum(String id, String label, boolean operationalCondition, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.operationalCondition = operationalCondition;
        this.dimensionIds = dimensionIds;
    }

    @Override
    public List<String> getDimensionIds() {
        return Arrays.asList(dimensionIds);
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
    public boolean isOperationalCondition() {
        return operationalCondition;
    }

    @Override
    public boolean isPlanned() {
        return this == PLANNED;
    }

    @Override
    public boolean isPresent() {
        return this == PRESENT;
    }

}