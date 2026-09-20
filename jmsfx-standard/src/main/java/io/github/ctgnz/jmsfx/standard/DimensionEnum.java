package io.github.ctgnz.jmsfx.standard;

import java.util.Arrays;
import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Dimension;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.types.GeometryType;

public enum DimensionEnum implements Dimension {
        COMMON("00", "Common", GeometryType.POINT_GEOMETRY, "Common") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(132.22, 220.92, 348.01, 348.01);
                    case "00c" -> new Rectangle2D(132.22, 220.92, 348.01, 348.01);
                    case "10" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "20" -> new Rectangle2D(159.5, 241.6, 293, 321.75);
                    case "20c" -> new Rectangle2D(159.5, 241.6, 293, 321.75);
                    case "30" -> new Rectangle2D(159.5, 240.78, 293, 321.75);
                    case "30c" -> new Rectangle2D(159.5, 240.78, 293, 321.75);
                    case "31" -> new Rectangle2D(159.5, 240.78, 293, 321.75);
                    case "31c" -> new Rectangle2D(159.5, 240.78, 293, 321.75);
                    case "40" -> new Rectangle2D(171.5, 237.78, 269, 321.75);
                    case "40c" -> new Rectangle2D(171.5, 237.78, 269, 321.75);
                    case "41" -> new Rectangle2D(171, 237.78, 270, 321.75);
                    case "41c" -> new Rectangle2D(171, 237.78, 270, 321.75);
                    case "50" -> new Rectangle2D(128.96, 217.96, 354.07, 352.3);
                    case "60" -> new Rectangle2D(128.96, 217.96, 354.07, 354.07);
                    case "61" -> new Rectangle2D(128.96, 217.96, 354.07, 352.54);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        AIR("01", "Air", GeometryType.POINT_GEOMETRY, "Air") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(124.25, 202.38, 363.5, 315.25);
                    case "00c" -> new Rectangle2D(124.25, 202.38, 363.5, 315.25);
                    case "10" -> new Rectangle2D(124.25, 201.38, 363.5, 315.25);
                    case "10c" -> new Rectangle2D(124.25, 201.38, 363.5, 315.25);
                    case "11" -> new Rectangle2D(124.25, 201.38, 363.5, 315.25);
                    case "11c" -> new Rectangle2D(124.25, 201.38, 363.5, 315.25);
                    case "20" -> new Rectangle2D(172.56, 197.82, 266.78, 319.34);
                    case "20c" -> new Rectangle2D(172.56, 197.82, 266.78, 319.34);
                    case "30" -> new Rectangle2D(172.56, 197.82, 266.78, 319.34);
                    case "30c" -> new Rectangle2D(172.56, 197.82, 266.78, 319.34);
                    case "31" -> new Rectangle2D(172.56, 197.82, 266.79, 319.34);
                    case "31c" -> new Rectangle2D(172.56, 197.82, 266.79, 319.34);
                    case "40" -> new Rectangle2D(171, 249, 270, 291.5);
                    case "40c" -> new Rectangle2D(171, 249, 270, 291.5);
                    case "41" -> new Rectangle2D(171, 249, 270, 291);
                    case "41c" -> new Rectangle2D(171, 249, 270, 291);
                    case "50" -> new Rectangle2D(171, 201.1, 270, 316.4);
                    case "60" -> new Rectangle2D(170.25, 201.1, 270, 316.4);
                    case "61" -> new Rectangle2D(170.25, 201.1, 270, 315.9);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        SPACE("05", "Space", GeometryType.POINT_GEOMETRY, "Space") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(124.25, 200.88, 363.5, 315.75);
                    case "00c" -> new Rectangle2D(124.25, 200.88, 363.5, 315.75);
                    case "10" -> new Rectangle2D(124.25, 201.38, 363.5, 315.25);
                    case "10c" -> new Rectangle2D(124.25, 201.38, 363.5, 315.25);
                    case "11" -> new Rectangle2D(124.25, 201.38, 363.5, 315.25);
                    case "11c" -> new Rectangle2D(124.25, 201.38, 363.5, 315.25);
                    case "20" -> new Rectangle2D(173.56, 198.82, 266.78, 319.34);
                    case "20c" -> new Rectangle2D(173.56, 198.82, 266.78, 319.34);
                    case "30" -> new Rectangle2D(172.56, 197.82, 266.78, 319.34);
                    case "30c" -> new Rectangle2D(172.56, 197.82, 266.78, 319.34);
                    case "31" -> new Rectangle2D(172.56, 197.82, 266.79, 319.34);
                    case "31c" -> new Rectangle2D(172.56, 197.82, 266.79, 319.34);
                    case "40" -> new Rectangle2D(171.5, 224, 270, 291.5);
                    case "40c" -> new Rectangle2D(171.5, 224, 270, 291.5);
                    case "41" -> new Rectangle2D(171.5, 224, 270, 291);
                    case "41c" -> new Rectangle2D(171.5, 224, 270, 291);
                    case "50" -> new Rectangle2D(171, 200.1, 270, 316.4);
                    case "60" -> new Rectangle2D(171.25, 200.1, 270, 316.4);
                    case "61" -> new Rectangle2D(171.25, 200.1, 270, 315.9);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        LAND_UNIT("10", "Land Unit", GeometryType.POINT_GEOMETRY, "Land") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "00c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "20" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "20c" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "30" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "30c" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "31" -> new Rectangle2D(123.08, 273, 366, 246);
                    case "31c" -> new Rectangle2D(123.08, 273, 366, 246);
                    case "40" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "40c" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "41" -> new Rectangle2D(171, 260, 270, 270);
                    case "41c" -> new Rectangle2D(171, 260, 270, 270);
                    case "50" -> new Rectangle2D(128.96, 217.96, 354.07, 352.3);
                    case "60" -> new Rectangle2D(128.96, 217.96, 354.07, 354.07);
                    case "61" -> new Rectangle2D(128.96, 217.96, 354.07, 352.54);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        LAND_EQUIPMENT("15", "Land Equipment", GeometryType.POINT_GEOMETRY, "Land") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "00c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "20" -> new Rectangle2D(159.5, 252.5, 293, 293);
                    case "20c" -> new Rectangle2D(159.5, 252.5, 293, 293);
                    case "30" -> new Rectangle2D(159.5, 249.5, 293, 293);
                    case "30c" -> new Rectangle2D(159.5, 249.5, 293, 293);
                    case "31" -> new Rectangle2D(159.5, 249.5, 293, 293);
                    case "31c" -> new Rectangle2D(159.5, 249.5, 293, 293);
                    case "40" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "40c" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "41" -> new Rectangle2D(171, 260, 270, 270);
                    case "41c" -> new Rectangle2D(171, 260, 270, 270);
                    case "50" -> new Rectangle2D(128.96, 217.96, 354.07, 352.3);
                    case "60" -> new Rectangle2D(128.96, 217.96, 354.07, 354.07);
                    case "61" -> new Rectangle2D(128.96, 217.96, 354.07, 352.54);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        LAND_INSTALLATION("20", "Land Installations", GeometryType.POINT_GEOMETRY, "Land") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(131.75, 205.09, 348.5, 364.16);
                    case "00c" -> new Rectangle2D(131.75, 205.09, 348.5, 364.16);
                    case "10" -> new Rectangle2D(131.75, 204.03, 348.5, 365.22);
                    case "10c" -> new Rectangle2D(131.75, 204.03, 348.5, 365.22);
                    case "11" -> new Rectangle2D(131.75, 204.03, 348.5, 365.22);
                    case "11c" -> new Rectangle2D(131.75, 204.03, 348.5, 365.22);
                    case "20" -> new Rectangle2D(123.58, 251.39, 365, 266.11);
                    case "20c" -> new Rectangle2D(123.58, 251.39, 365, 266.11);
                    case "30" -> new Rectangle2D(123.58, 252.39, 365, 265.11);
                    case "30c" -> new Rectangle2D(123.58, 252.39, 365, 265.11);
                    case "31" -> new Rectangle2D(123.08, 252.39, 366, 265.61);
                    case "31c" -> new Rectangle2D(123.08, 252.39, 366, 265.61);
                    case "40" -> new Rectangle2D(171.5, 239.03, 269, 290.47);
                    case "40c" -> new Rectangle2D(171.5, 239.03, 269, 290.47);
                    case "41" -> new Rectangle2D(171, 239.03, 270, 290.97);
                    case "41c" -> new Rectangle2D(171, 239.03, 270, 290.97);
                    case "50" -> new Rectangle2D(128.96, 217.96, 354.07, 352.3);
                    case "60" -> new Rectangle2D(128.96, 214.5, 354.07, 357.54);
                    case "61" -> new Rectangle2D(128.96, 214.5, 354.07, 356);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        CONTROL_MEASURE("25", "Control Measure", GeometryType.MIXED_GEOMETRY, "ControlMeasures"),
        DISMOUNTED("27", "Dismounted Individual", GeometryType.POINT_GEOMETRY, "Dismounted") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "00c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "20" -> new Rectangle2D(176.56, 247.11, 258.88, 298.77);
                    case "20c" -> new Rectangle2D(176.56, 247.11, 258.88, 298.77);
                    case "30" -> new Rectangle2D(176.56, 247.11, 258.88, 298.77);
                    case "30c" -> new Rectangle2D(176.56, 247.11, 258.88, 298.77);
                    case "31" -> new Rectangle2D(176.56, 247.11, 258.88, 298.77);
                    case "31c" -> new Rectangle2D(176.56, 247.11, 258.88, 298.77);
                    case "40" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "40c" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "41" -> new Rectangle2D(171, 260, 270, 270);
                    case "41c" -> new Rectangle2D(171, 260, 270, 270);
                    case "50" -> new Rectangle2D(128.96, 217.96, 354.07, 352.3);
                    case "60" -> new Rectangle2D(128.96, 217.96, 354.07, 354.07);
                    case "61" -> new Rectangle2D(128.96, 217.96, 354.07, 352.54);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        SEA_SURFACE("30", "Sea Surface", GeometryType.POINT_GEOMETRY, "SeaSurface") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "00c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "20" -> new Rectangle2D(159.5, 252.5, 293, 293);
                    case "20c" -> new Rectangle2D(159.5, 252.5, 293, 293);
                    case "30" -> new Rectangle2D(159.5, 249.5, 293, 293);
                    case "30c" -> new Rectangle2D(159.5, 249.5, 293, 293);
                    case "31" -> new Rectangle2D(159.5, 249.5, 293, 293);
                    case "31c" -> new Rectangle2D(159.5, 249.5, 293, 293);
                    case "40" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "40c" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "41" -> new Rectangle2D(171, 260, 270, 270);
                    case "41c" -> new Rectangle2D(171, 260, 270, 270);
                    case "50" -> new Rectangle2D(128.96, 217.96, 354.07, 352.3);
                    case "60" -> new Rectangle2D(128.96, 217.96, 354.07, 354.07);
                    case "61" -> new Rectangle2D(128.96, 217.96, 354.07, 352.54);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        SEA_SUBSURFACE("35", "Sea Subsurface", GeometryType.POINT_GEOMETRY, "SeaSubsurface") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(124.25, 274.38, 363.5, 315.25);
                    case "00c" -> new Rectangle2D(124.25, 274.38, 363.5, 315.25);
                    case "10" -> new Rectangle2D(124.25, 274.38, 363.5, 315.25);
                    case "10c" -> new Rectangle2D(124.25, 274.38, 363.5, 315.25);
                    case "11" -> new Rectangle2D(124.25, 274.38, 363.5, 315.25);
                    case "11c" -> new Rectangle2D(124.25, 274.38, 363.5, 315.25);
                    case "20" -> new Rectangle2D(173.56, 273.32, 266.79, 319.34);
                    case "20c" -> new Rectangle2D(173.56, 273.32, 266.79, 319.34);
                    case "30" -> new Rectangle2D(173.56, 274.32, 266.79, 319.34);
                    case "30c" -> new Rectangle2D(173.56, 274.32, 266.79, 319.34);
                    case "31" -> new Rectangle2D(173.56, 274.31, 266.79, 319.34);
                    case "31c" -> new Rectangle2D(173.56, 274.31, 266.79, 319.34);
                    case "40" -> new Rectangle2D(171, 251.5, 270, 291.5);
                    case "40c" -> new Rectangle2D(171, 251.5, 270, 291.5);
                    case "41" -> new Rectangle2D(171, 252, 270, 291);
                    case "41c" -> new Rectangle2D(171, 252, 270, 291);
                    case "50" -> new Rectangle2D(171, 249.5, 270, 316.4);
                    case "60" -> new Rectangle2D(170.75, 272.5, 270, 316.4);
                    case "61" -> new Rectangle2D(170.75, 273, 270, 315.9);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        ACTIVITY("40", "Activities", GeometryType.POINT_GEOMETRY, "Activities") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "00c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "20" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "20c" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "30" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "30c" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "31" -> new Rectangle2D(123, 273, 366.08, 246);
                    case "31c" -> new Rectangle2D(123, 273, 366.08, 246);
                    case "40" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "40c" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "41" -> new Rectangle2D(171, 260, 270, 270);
                    case "41c" -> new Rectangle2D(171, 260, 270, 270);
                    case "50" -> new Rectangle2D(128.96, 217.96, 354.07, 352.3);
                    case "60" -> new Rectangle2D(128.96, 217.96, 354.07, 354.07);
                    case "61" -> new Rectangle2D(128.96, 217.96, 354.07, 353.25);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        CYBERSPACE("60", "Cyberspace", GeometryType.POINT_GEOMETRY, "Cyberspace") {
            @Override
            public Rectangle2D getFrameBounds(StandardIdentity identity, Status status, boolean civilianEntity) {
                return switch (identity.getId() + status.getFrameId(identity) + (civilianEntity ? "c" : "")) {
                    case "00" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "00c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "10c" -> new Rectangle2D(131.75, 220.75, 348.5, 348.5);
                    case "11" -> new Rectangle2D(131.75, 204.03, 348.5, 365.22);
                    case "11c" -> new Rectangle2D(131.75, 204.03, 348.5, 365.22);
                    case "20" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "20c" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "30" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "30c" -> new Rectangle2D(123.58, 273.5, 365, 245);
                    case "31" -> new Rectangle2D(123.08, 273, 366, 246);
                    case "31c" -> new Rectangle2D(123.08, 273, 366, 246);
                    case "40" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "40c" -> new Rectangle2D(171.5, 260.5, 269, 269);
                    case "41" -> new Rectangle2D(171, 260, 270, 270);
                    case "41c" -> new Rectangle2D(171, 260, 270, 270);
                    case "50" -> new Rectangle2D(128.96, 217.96, 354.07, 352.3);
                    case "60" -> new Rectangle2D(128.96, 217.96, 354.07, 354.07);
                    case "61" -> new Rectangle2D(128.96, 217.96, 354.07, 352.54);
                    default -> Rectangle2D.EMPTY;
                };
            }
        };

    private final String id;
    private final String label;
    private final String graphicLocation;
    private final GeometryType geometryType;

    DimensionEnum(String id, String label, GeometryType geometryType, String graphicLocation) {
        this.id = id;
        this.label = label;
        this.geometryType = geometryType;
        this.graphicLocation = graphicLocation;
    }

    @Override
    public SymbolSet getDefaultSymbolSet() {
        return Arrays.stream(SymbolSetEnum.values())
            .filter(sym -> sym.getDimension() == this)
            .findFirst()
            .orElse(SymbolSetEnum.COMMON);
    }

    @Override
    public String getFrameId() {
        return getDefaultSymbolSet().getId();
    }

    @Override
    public GeometryType getGeometryType() {
        return geometryType;
    }

    @Override
    public String getGraphicLocation() {
        return graphicLocation;
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
    public String getName() {
        return name();
    }

    @Override
    public List<SymbolSet> getSymbolSets() {
        return Arrays.stream(SymbolSetEnum.values())
            .filter(sym -> sym.getDimension() == this)
            .map(SymbolSet.class::cast)
            .toList();
    }

}