package io.github.ctgnz.jmsfx.battleorder.landequipment;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandEquipmentEntity implements Entity {
        WEAPON_SYSTEM("11", "Weapon/Weapon System", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"282.5\" y2=\"501.25\"/>\n    </g>\n  </g>";
            }
        },
        VEHICLE("12", "Vehicle", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256,327c-58,0-58,93,0,93h100c58,0,58-93,0-93H256z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"226\" cy=\"437\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"386\" cy=\"437\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"404\" y1=\"420\" y2=\"420\"/>\n  </g>";
            }
        },
        ENGINEER_VEHICLES_EQUIPMENT("13", "Engineer Vehicles and Equipment", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256,327c-58,0-58,93,0,93h100c58,0,58-93,0-93H256z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"226\" cy=\"437\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"386\" cy=\"437\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"404\" y1=\"420\" y2=\"420\"/>\n    <polyline fill=\"none\" points=\"246.325,406.25 246.325,344.25 305.175,344.25 305.176,406.25 305.175,344.25 364.024,344.25 364.024,406.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        UTILITY_VEHICLES("14", "Utility Vehicles", GraphicType.NA),
        TRAIN("15", "Train", GraphicType.NA),
        CIVILIAN_VEHICLE("16", "Civilian Vehicle", GraphicType.NA),
        LAW_ENFORCEMENT("17", "Law Enforcement", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"304.5,297 333.355,346.522 390.67,346.75 362.21,396.5 390.67,446.25 333.355,446.479 304.5,496 275.645,446.479 218.33,446.25 246.79,396.5 218.33,346.75 275.645,346.522\" stroke=\"#000000\"/>\n    <ellipse cx=\"304\" cy=\"296\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"304\" cy=\"496\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"220\" cy=\"347\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"390\" cy=\"346\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"390\" cy=\"447\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"220\" cy=\"447\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        PACK_ANIMALS("18", "Pack Animals", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M206,438l50-100l50,100l50-100l50,100\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MISSILE_SUPPORT("19", "Missile Support", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256,334c-58,0-58,93,0,93h100c58,0,58-93,0-93H256z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"226\" cy=\"444\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"386\" cy=\"444\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"404\" y1=\"427\" y2=\"427\"/>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"48\" transform=\"matrix(1 0 0 1 255.3398 377)\">MSL</text>\n      <text font-family=\"sans-serif\" font-size=\"48\" transform=\"matrix(1 0 0 1 259.3242 417)\">SPT</text>\n    </g>\n  </g>";
            }
        },
        OTHER_EQUIPMENT("20", "Other Equipment", GraphicType.NA),
        LAND_MINES("21", "Land Mines", GraphicType.NA),
        SENSORS("22", "Sensors", GraphicType.NA),
        EMERGENCY_OPERATION("23", "Emergency Operation", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"396\" rx=\"80\" ry=\"80\" stroke=\"#000000\"/>\n    <polygon fill=\"#FFFFFF\" points=\"306,316 375,436 237,436\" stroke=\"#000000\" stroke-linejoin=\"bevel\"/>\n  </g>";
            }
        },
        MANUAL_TRACK("24", "Manual Track", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" id=\"MAN\" transform=\"matrix(1 0 0 1 192 433.25)\">MAN</text>\n  </g>";
            }
        },
        ROTARY_WING("25", "Rotary Wing", GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"387.838,443.678 305.082,396.307 387.486,348.322\" stroke=\"#000000\"/>\n    <polygon points=\"223.609,443.481 223.915,348.518 306,396.264\" stroke=\"#000000\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    LandEquipmentEntity(String id, String label, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
        return SymbolSetEnum.LAND_EQUIPMENT;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return LandEquipmentSymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}