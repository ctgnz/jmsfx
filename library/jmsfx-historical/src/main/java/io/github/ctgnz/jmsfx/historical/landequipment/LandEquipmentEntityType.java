package io.github.ctgnz.jmsfx.historical.landequipment;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandEquipmentEntityType implements EntityType {
        RIFLE("01", "Rifle", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"282.5\" y2=\"504.5\"/>\n      <polyline fill=\"none\" points=\"252.625,315.563 305.816,279.875 359.82,315.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MACHINE_GUN("02", "Machine Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"488.5\" y2=\"488.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"280.5\" y2=\"488.5\"/>\n      <polyline fill=\"none\" points=\"252.625,313.563 305.816,277.875 359.82,313.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        GRENADE_LAUNCHER("03", "Grenade Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"278.843\" y2=\"506.5\"/>\n      <circle cx=\"306\" cy=\"338.561\" fill=\"none\" r=\"24.848\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"251.69\" y1=\"280.719\" y2=\"313.563\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"359.82\" x2=\"306\" y1=\"313.713\" y2=\"280.719\"/>\n    </g>\n  </g>";
            }
        },
        FLAME_THROWER("04", "Flame Thrower", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(166 105) scale(5 5)\">\n      <path d=\"M36.622,44.146l-2.604,0.023c0-2.246-0.223-3.735-0.671-4.465c-0.673-1.517-2.268-2.276-4.787-2.276 c-2.353,0-3.92,0.757-4.705,2.27c-0.449,0.897-0.672,2.494-0.672,4.792V79.05h-2.629V44.475c0-3.309,0.505-5.691,1.515-7.151 c1.178-1.681,3.336-2.523,6.476-2.523c3.194,0,5.382,0.787,6.56,2.358C36.115,38.506,36.622,40.836,36.622,44.146z\"/>\n    </g>\n  </g>";
            }
        },
        AIR_DEFENSE_GUN("05", "Air Defense Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M359.35,486.502c0-10.745-6.272-19.263-18.81-25.535 c-9.867-5.076-20.911-7.621-33.149-7.621c-11.958,0-22.858,2.54-32.701,7.621c-12.251,6.272-18.374,14.79-18.374,25.535H359.35z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <path d=\"M312.212,290v162.359h-10.687V290C304.683,289.742,308.246,289.742,312.212,290z\"/>\n  </g>";
            }
        },
        ANTITANK_GUN("06", "Antitank Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"267.609,491.506 307.092,452.359 346.238,491.843\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <path d=\"M312.212,290v162.359h-10.687V290C304.683,289.742,308.246,289.742,312.212,290z\"/>\n  </g>";
            }
        },
        DIRECT_FIRE_GUN("07", "Direct Fire Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <path d=\"M312.212,290.056V499.25h-10.687V290.056C304.683,289.724,308.246,289.724,312.212,290.056z\"/>\n  </g>";
            }
        },
        RECOILLESS_GUN("08", "Recoilless Gun", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <path d=\"M312.212,290.056V499.25h-10.687V290.056C304.683,289.724,308.246,289.724,312.212,290.056z\"/>\n    <polyline fill=\"none\" points=\"253.066,323.5 307.037,289.758 359.25,323.5\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        HOWITZER("09", "Howitzer", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.868\" cy=\"479.385\" fill=\"none\" r=\"28\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <path d=\"M312.212,289.999v161.386h-10.687V289.999C304.683,289.743,308.246,289.743,312.212,289.999z\"/>\n  </g>";
            }
        },
        MISSILE_LAUNCHER("10", "Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256.881,488.616c0-66.283-0.381-112.866,2.119-157.366 c1.706-30.358,28.083-40,48.75-40c19.7,0,49.099,14.562,50.25,44.5c2,52,1.401,84.277,1.401,152.866\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"291.25\" y2=\"488.616\"/>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_LAUNCHER("11", "Air Defense Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"469.241\"/>\n    <path d=\"M268,494.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ANTITANK_MISSILE_LAUNCHER("12", "Antitank Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"266.414,497.005 306,457.419 345.586,497.005\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"283.25\" y2=\"461.148\"/>\n    <path d=\"M257,432.922v-111.25c0-20.849,21.714-37.75,48.5-37.75 c26.785,0,48.5,16.901,48.5,37.75v111.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SURFACE_TO_SURFACE_MISSILE_LAUNCHER("13", "Surface-to-Surface Missile Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M253.5,488V313.859c17.618-32.779,85.382-32.779,103,0V488H253.5z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"288.25\" y2=\"488\"/>\n  </g>";
            }
        },
        MORTAR("14", "Mortar", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"276.106,313.874 306.865,283.114 337.625,313.874\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"306\" cy=\"479.5\" fill=\"none\" r=\"27.332\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.865\" x2=\"306.865\" y1=\"283.114\" y2=\"452.168\"/>\n  </g>";
            }
        },
        SINGLE_ROCKET_LAUNCHER("15", "Single Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.933\" x2=\"306.933\" y1=\"306.114\" y2=\"508\"/>\n    <polyline fill=\"none\" points=\"276.173,336.874 306.933,306.114 337.692,336.874\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"275.241,313.114 306,282.355 336.76,313.114\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MULTIPLE_ROCKET_LAUNCHER("16", "Multiple Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306.093\" y1=\"322.935\" y2=\"507.5\"/>\n    <polyline fill=\"none\" points=\"271.527,354.5 306.093,319.935 340.657,354.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,322.935 306.093,288.371 340.657,322.935\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"266\" y1=\"370.5\" y2=\"482.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"344\" x2=\"344\" y1=\"370.5\" y2=\"482.5\"/>\n  </g>";
            }
        },
        ANTITANK_ROCKET_LAUNCHER("17", "Antitank Rocket Launcher", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"271.527,495.564 306.093,461 340.657,495.564\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,354.5 306.093,319.935 340.657,354.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,322.935 306.093,288.371 340.657,322.935\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306.093\" y1=\"322.935\" y2=\"462\"/>\n  </g>";
            }
        },
        NONLETHAL_WEAPON("18", "Nonlethal Weapon", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"304\" y2=\"507\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.343\" x2=\"361.843\" y1=\"304\" y2=\"304\"/>\n  </g>";
            }
        },
        TASER("19", "Taser", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"304\" y2=\"507\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.343\" x2=\"361.843\" y1=\"304\" y2=\"304\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 256 457)\">Z</text>\n  </g>";
            }
        },
        WATER_CANNON("20", "Water Cannon", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"304\" y2=\"507\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.343\" x2=\"361.843\" y1=\"304\" y2=\"304\"/>\n    <text font-family=\"sans-serif\" font-size=\"160\" transform=\"matrix(1 0 0 1 229.5 458.5)\">W</text>\n  </g>";
            }
        },
        DIRECTED_ENERGY("A1", "Directed Energy Weapon", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(170 108) scale(5 5)\">\n      <path d=\"M28.924,69.115c-0.766-0.161-1.533-0.294-2.299-0.403v-8.624c-0.578-0.108-2.141-0.349-4.688-0.725l-0.506-1.129 l7.055-1.614l-6.848-1.449l0.01-1.267l7.271-1.777c-0.67-0.108-1.436-0.214-2.295-0.322v-13.25 c-0.96,0.646-2.235,1.534-3.821,2.665L21,40.731l6.191-4.081l6.049,4.081l-1.744,0.572L27.5,38.475v12.007l5.125,0.966 l-0.006,1.21l-7.318,1.646l7.324,1.703v1.205l-6.873,1.365c0.484,0.055,1.068,0.136,1.748,0.241v8.599l5.137,1.026l-0.012,1.295 l-7.012,1.519l7.008,1.495l0.004,1.188l-7.16,1.696l6.84,1.433l-0.072,0.956l-10.585-1.822l-0.004-1.238l7.264-1.578l-7.26-1.547 l0.01-1.152L28.924,69.115z\"/>\n    </g>\n  </g>";
            }
        },
        SWORD("A2", "Sword", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"282.5\" y2=\"504.5\"/>\n      <path d=\"m 350.81601,465.30724 h -90\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        BAYONET("A3", "Bayonet", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"282.5\" y2=\"504.5\"/>\n      <path d=\"m 295.06556,420.30724 v 90\" style=\"fill:none;stroke:#000000;stroke-width:10;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        KNIFE("A4", "Knife", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"282.5\" y2=\"504.5\"/>\n      <path d=\"m 305.53671,404.12455 v 102.375\" style=\"fill:none;stroke:#000000;stroke-width:14;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        SPEAR("A5", "Spear", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"282.5\" y2=\"504.5\"/>\n      <path d=\"m 305.30844,275.87958 -17,45 h 35 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        BOW("A6", "Bow", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"stroke-width:5;stroke-dasharray:none\">\n    <g id=\"Arrow\" style=\"stroke-width:5;stroke-dasharray:none\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:2.01442;stroke-dasharray:none\" x1=\"305.81601\" x2=\"305.81601\" y1=\"280.47717\" y2=\"505.6899\"/>\n      <path d=\"m 305.56731,282.72115 c 56.8779,16.15467 73.5769,86.5606 73.4086,112.98022 0.33656,29.6169 -15.29998,90.7016 -73.18755,107.52938\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n    </g>\n  </g>";
            }
        },
        CROSSBOW("A7", "Crossbow", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"stroke-width:5;stroke-dasharray:none\">\n    <g id=\"Arrow\" style=\"stroke-width:5;stroke-dasharray:none\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:5;stroke-dasharray:none\" x1=\"305.81601\" x2=\"305.81601\" y1=\"280.47717\" y2=\"505.6899\"/>\n      <path d=\"m 195.56334,373.51944 c 16.15467,-56.8779 86.56061,-73.5769 112.98022,-73.4086 29.6169,-0.33656 90.7016,15.29998 107.52938,73.18755\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:2.01442;stroke-dasharray:none\" x1=\"418.42236\" x2=\"193.20966\" y1=\"372.61722\" y2=\"372.61722\"/>\n    </g>\n  </g>";
            }
        },
        TREBUCHET("A8", "Trebuchet", LandEquipmentEntity.WEAPON_SYSTEM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"stroke-width:9.19044;stroke-dasharray:none\" transform=\"matrix(0.76183,0.43068,-0.43984,0.74596,265.5937,-6.75054)\">\n    <g id=\"Arrow\" style=\"stroke-width:9.19044;stroke-dasharray:none\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:9.19044;stroke-dasharray:none\" x1=\"157.39127\" x2=\"382.60397\" y1=\"358.08176\" y2=\"358.08176\"/>\n    </g>\n  </g>";
            }
        },
        VEHICLE_ARMOURED("01", "Armoured Vehicle", LandEquipmentEntity.VEHICLE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256,327c-58,0-58,93,0,93h100c58,0,58-93,0-93H256z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"226\" cy=\"437\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"386\" cy=\"437\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"404\" y1=\"420\" y2=\"420\"/>\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 271.5 408.5)\">A</text>\n  </g>";
            }
        },
        TANK("02", "Tank", LandEquipmentEntity.VEHICLE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"229.441\" y1=\"320.5\" y2=\"472.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"381\" x2=\"381\" y1=\"320.5\" y2=\"472.635\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"456.913\" y2=\"456.913\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"336\" y2=\"336\"/>\n  </g>";
            }
        },
        BRIDGE("01", "Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"211,441 236,416 376,416 401,441\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"211,351 236,376 376,376 401,351\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        FIXED_BRIDGE("03", "Fixed Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"211,441 236,416 376,416 401,441\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"331.5\" y2=\"460.5\"/>\n    <polyline fill=\"none\" points=\"211,351 236,376 376,376 401,351\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        FLOATING_BRIDGE("04", "Floating Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"211,441 236,416 376,416 401,441\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"211,351 236,376 376,376 401,351\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <path d=\"M221.25,453.5c56.5,52.005,113,52.005,169.5,0H221.25z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        FOLDING_GIRDER_BRIDGE("05", "Folding Girder Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"211,441 236,416 376,416 401,441\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"211,351 236,376 376,376 401,351\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"332,441 280,441 280,351 332,351\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        HOLLOW_DECK_BRIDGE("06", "Hollow Deck Bridge", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"211,441 236,416 376,416 401,441\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"211,351 236,376 376,376 401,351\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect fill=\"none\" height=\"90\" stroke=\"#000000\" stroke-width=\"5\" width=\"52\" x=\"280\" y=\"351\"/>\n  </g>";
            }
        },
        DRILL("07", "Drill", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"351.558,462.544 265.25,462.544 231.25,333.985 384.25,333.985\"/>\n  </g>";
            }
        },
        EARTHMOVER("08", "Earthmover", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"242,315 260,302 350,302 368,315\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"302\" y2=\"355\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245\" x2=\"245\" y1=\"330\" y2=\"485\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"365\" x2=\"365\" y1=\"330\" y2=\"485\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245\" x2=\"365\" y1=\"355\" y2=\"355\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245\" x2=\"365\" y1=\"460\" y2=\"460\"/>\n  </g>";
            }
        },
        MINE_CLEARING_EQUIPMENT("09", "Mine Clearing Equipment", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"305,358 225,458 385,458 305,358 305,283\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MINE_LAYING_EQUIPMENT("10", "Mine Laying Equipment", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <ellipse cx=\"305.625\" cy=\"396\" rx=\"32.337\" ry=\"32.337\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.625\" x2=\"305.625\" y1=\"344.5\" y2=\"447.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.88\" x2=\"334.369\" y1=\"352.884\" y2=\"439.116\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.88\" x2=\"334.369\" y1=\"439.116\" y2=\"352.884\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"263\" x2=\"348.25\" y1=\"328.5\" y2=\"328.5\"/>\n  </g>";
            }
        },
        DOZER("11", "Dozer", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"240\" y1=\"313\" y2=\"483\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"370\" x2=\"370\" y1=\"313\" y2=\"483\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"370\" y1=\"338\" y2=\"338\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"370\" y1=\"458\" y2=\"458\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"284\" x2=\"326\" y1=\"297\" y2=\"297\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"298\" y2=\"338\"/>\n  </g>";
            }
        },
        ARMOURED_ASSAULT("12", "Armoured Assault", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"236\" y1=\"328\" y2=\"468\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"376\" y1=\"328\" y2=\"468\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"376\" y1=\"465\" y2=\"465\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"306\" y1=\"358\" y2=\"328\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"304\" y1=\"358\" y2=\"328\"/>\n    <g transform=\"translate(20 0) scale(0.9 0.9)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.555\" x2=\"317.555\" y1=\"413.889\" y2=\"481.667\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256.555\" x2=\"256.555\" y1=\"413.889\" y2=\"481.667\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"378.556\" x2=\"378.556\" y1=\"413.889\" y2=\"481.667\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"254.444\" x2=\"380.556\" y1=\"416.717\" y2=\"416.717\"/>\n    </g>\n  </g>";
            }
        },
        ARMOURED_ENGINEER_RECON_VEHICLE_AERV("13", "Armoured Engineer Recon Vehicle (AERV)", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"239.034\" x2=\"239.034\" y1=\"326\" y2=\"466.001\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"379.033\" x2=\"379.033\" y1=\"326\" y2=\"466.001\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"239.034\" x2=\"379.033\" y1=\"463.001\" y2=\"463.001\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"239.034\" x2=\"311.033\" y1=\"356\" y2=\"326\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"379.033\" x2=\"309.034\" y1=\"356\" y2=\"326\"/>\n    <g>\n      <path d=\"M259.034,426.001V376h100v50.001 M309.033,376v35.001\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"239.033\" x2=\"379.033\" y1=\"461\" y2=\"356\"/>\n  </g>";
            }
        },
        BACKHOE("14", "Backhoe", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"226\" y1=\"323.5\" y2=\"438.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386\" x2=\"386\" y1=\"323.5\" y2=\"438.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"436.5\" y2=\"436.5\"/>\n    <path d=\"M226,325.5c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <ellipse cx=\"236\" cy=\"454.5\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"376\" cy=\"454.5\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <path d=\"M354.667,436.867L305,363.201l-48.667,37\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polygon points=\"256.205,399.348 259.818,420.434 279.699,407.783\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        CONSTRUCTION_VEHICLE("15", "Construction Vehicle", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"226\" y1=\"376.25\" y2=\"516.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386\" x2=\"386\" y1=\"376.25\" y2=\"516.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"513.75\" y2=\"513.75\"/>\n    <path d=\"M226,379c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <ellipse cx=\"236\" cy=\"536.25\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"376\" cy=\"536.25\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g transform=\"translate(0 15)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"407.5\" y2=\"457.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"243\" x2=\"243\" y1=\"405\" y2=\"480\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"369\" x2=\"369\" y1=\"405\" y2=\"480\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"241\" x2=\"371\" y1=\"407.5\" y2=\"407.5\"/>\n    </g>\n  </g>";
            }
        },
        FERRY_TRANSPORTER("16", "Ferry Transporter", LandEquipmentEntity.ENGINEER_VEHICLES_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"227\" x2=\"227\" y1=\"328.5\" y2=\"443.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"387\" x2=\"387\" y1=\"328.5\" y2=\"443.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"227\" x2=\"387\" y1=\"440.5\" y2=\"440.5\"/>\n    <path d=\"M227,330.5c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <ellipse cx=\"237\" cy=\"459.5\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"307\" cy=\"459.5\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"377\" cy=\"459.5\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <path d=\"M247,385.5c40,40,80,40,120,0H247z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        UTILITY_VEHICLE("01", "Utility Vehicle", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"216\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"393.75\" x2=\"393.75\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"393.75\" y1=\"538.905\" y2=\"538.905\"/>\n    <path d=\"M216,376.676c77.766,31.206,99.984,31.206,177.75,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        UTILITY_VEHICLE_MEDICAL("02", "Medical", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"216\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"393.75\" x2=\"393.75\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"393.75\" y1=\"538.905\" y2=\"538.905\"/>\n    <path d=\"M216,376.676c77.766,31.206,99.984,31.206,177.75,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"400.081\" y2=\"538.905\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"393.75\" y1=\"461.25\" y2=\"461.25\"/>\n  </g>";
            }
        },
        UTILITY_VEHICLE_MOBILE_EMERGENCY_PHYSICIAN("04", "Mobile Emergency Physician", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"216\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"393.75\" x2=\"393.75\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"393.75\" y1=\"540.155\" y2=\"540.155\"/>\n    <path d=\"M216,376.676c77.766,31.206,99.984,31.206,177.75,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"400.081\" y2=\"540.155\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"263\" x2=\"348.25\" y1=\"431.875\" y2=\"431.875\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"393.75\" y1=\"458.75\" y2=\"458.75\"/>\n  </g>";
            }
        },
        BUS("05", "Bus", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"216\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"393.75\" x2=\"393.75\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"393.75\" y1=\"538.905\" y2=\"538.905\"/>\n    <path d=\"M216,376.676c77.766,31.206,99.984,31.206,177.75,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1.25 272.5 512.8125)\">B</text>\n  </g>";
            }
        },
        SEMI_TRAILER_AND_TRUCK("06", "Semi-Trailer and Truck", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(10 29) scale(0.9 0.8)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"235.556\" x2=\"235.556\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"395.556\" x2=\"395.556\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"235.556\" x2=\"395.556\" y1=\"505\" y2=\"505\"/>\n      <path d=\"M235.556,370.25c70,26,90,26,159.998,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <ellipse cx=\"234\" cy=\"451\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"264\" cy=\"451\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"355\" cy=\"451\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"364\" x2=\"399\" y1=\"376\" y2=\"376\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"399\" x2=\"399\" y1=\"351\" y2=\"401\"/>\n    </g>\n  </g>";
            }
        },
        LIMITED_CROSS_COUNTRY_TRUCK("07", "Limited Cross Country Truck", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"226\" y1=\"367.5\" y2=\"507.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386\" x2=\"386\" y1=\"367.5\" y2=\"507.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"505\" y2=\"505\"/>\n    <path d=\"M226,370.25c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <ellipse cx=\"236\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"376\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        CROSS_COUNTRY_TRUCK("08", "Cross Country Truck", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"226\" y1=\"367.5\" y2=\"507.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386\" x2=\"386\" y1=\"367.5\" y2=\"507.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"505\" y2=\"505\"/>\n    <path d=\"M226,370.25c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <ellipse cx=\"236\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"376\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"306\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        POL_VEHICLE("09", "Petroleum-Oil and Lubricant", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"216\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"393.75\" x2=\"393.75\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"393.75\" y1=\"540.155\" y2=\"540.155\"/>\n    <path d=\"M216,376.676c77.765,31.206,99.985,31.206,177.75,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"309.956,478.488 349.914,416.052 269.998,416.052 309.956,478.488 309.956,525.313\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        WATER_VEHICLE("10", "Water", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"216\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"393.75\" x2=\"393.75\" y1=\"374.375\" y2=\"542.406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"216\" x2=\"393.75\" y1=\"540.155\" y2=\"540.155\"/>\n    <path d=\"M216,376.676c77.766,31.206,99.984,31.206,177.75,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"294.903\" x2=\"335.48\" y1=\"421.057\" y2=\"421.057\"/>\n      <path d=\"M234.037,446.417h97.385c32.464,0,38.956,45.648,40.578,76.083\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"315.191\" x2=\"315.191\" y1=\"446.417\" y2=\"421.057\"/>\n    </g>\n  </g>";
            }
        },
        AMPHIBIOUS_UTILITY_WHEELED_VEHICLE("11", "Amphibious Utility Wheeled Vehicle", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"226\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386\" x2=\"386\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"505\" y2=\"505\"/>\n      <path d=\"M226,370.25c69.999,25.999,90.002,25.999,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <ellipse cx=\"236\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"376\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <path d=\"M226.001,459.387c3.465-1.425,6.499-5.098,6.499-13.137 c0-18.75,21-18.75,21,0s21,18.75,21,0s21-18.75,21,0s21,18.75,21,0s21-18.75,21,0s21,18.75,21,0s21-18.75,21,0 c0,7.031,2.32,10.723,5.221,12.491\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        TOW_TRUCK("12", "Tow Truck", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"226.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386.5\" x2=\"386.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"386.5\" y1=\"464\" y2=\"464\"/>\n    <path d=\"M226.5,329c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M386.5,464l-110-97v45c0,15-20,15-20,0\" fill=\"none\" stroke=\"#000000\" stroke-linejoin=\"round\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        BICYCLE("A1", "Bicycle", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <ellipse cx=\"259.22116\" cy=\"483.47357\" fill=\"none\" rx=\"26\" ry=\"32.5\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <ellipse cx=\"344.97116\" cy=\"483.47357\" fill=\"none\" rx=\"26\" ry=\"32.5\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"m 336.33568,408.9844 16.84478,0.0231 -50.46896,72.35067 -43.78846,-52.35577 h 80.91346\" style=\"fill:none;stroke:#000000;stroke-width:8.94427;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        MOTORBIKE("A2", "Motorbike", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <ellipse cx=\"259.22116\" cy=\"483.47357\" fill=\"none\" rx=\"26\" ry=\"32.5\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <ellipse cx=\"344.97116\" cy=\"483.47357\" fill=\"none\" rx=\"26\" ry=\"32.5\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"m 330.62414,407.19953 26.364,75.582 -102.82473,-0.23347 14.27885,-52.35577 h 69.49038\" style=\"fill:#000000;stroke:#000000;stroke-width:8.94427;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1;fill-opacity:1\"/>\n  </g>";
            }
        },
        CRANE("A3", "Crane", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"226.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386.5\" x2=\"386.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"386.5\" y1=\"464\" y2=\"464\"/>\n    <path d=\"M226.5,329c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M 385.82689,367 276.5,367 v 45 c 0,15 -20,15 -20,0\" fill=\"none\" stroke=\"#000000\" stroke-linejoin=\"round\" stroke-width=\"5\"/>\n    <path d=\"m 270,367 117,0\" style=\"fill:none;stroke:#000000;stroke-width:10px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        FORKLIFT("A4", "Forklift", LandEquipmentEntity.UTILITY_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"226.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386.5\" x2=\"386.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"386.5\" y1=\"464\" y2=\"464\"/>\n    <path d=\"M226.5,329c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 360.11453,363.48008 -39.04046,88.17758\" style=\"fill:none;stroke:#000000;stroke-width:5px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"M 326.45896,438.19543 275.97562,421.36765\" style=\"fill:none;stroke:#000000;stroke-width:5px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        LOCOMOTIVE("01", "Locomotive", LandEquipmentEntity.TRAIN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"231,322 231,467 379,467 379,392 311,392 311,324 231,324\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RAILCAR("02", "Railcar", LandEquipmentEntity.TRAIN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"224.364\" x2=\"224.364\" y1=\"373.114\" y2=\"525.557\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"385.623\" x2=\"385.623\" y1=\"373.114\" y2=\"525.557\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"224.364\" x2=\"385.623\" y1=\"522.612\" y2=\"522.612\"/>\n    <path d=\"M224.364,374.969c70.552,28.311,90.708,28.311,161.259,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g transform=\"translate(40 -30) scale(0.8 0.7)\">\n      <ellipse cx=\"239.29\" cy=\"819.699\" fill=\"none\" rx=\"14.373\" ry=\"17.965\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"279.091\" cy=\"819.699\" fill=\"none\" rx=\"14.373\" ry=\"17.965\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"424.126\" cy=\"818.078\" fill=\"none\" rx=\"14.373\" ry=\"17.966\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"384.32\" cy=\"818.078\" fill=\"none\" rx=\"14.375\" ry=\"17.966\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        AUTO_UTILITY_VEHICLE("04", "Utility Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"224.364\" x2=\"224.364\" y1=\"373.114\" y2=\"525.557\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"385.623\" x2=\"385.623\" y1=\"373.114\" y2=\"525.557\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"224.364\" x2=\"385.623\" y1=\"522.612\" y2=\"522.612\"/>\n    <path d=\"M224.364,374.969c70.552,28.311,90.708,28.311,161.259,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        KNOWN_INSURGENT_VEHICLE("08", "Known Insurgent Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"385.545\" cy=\"408.442\" fill=\"none\" rx=\"23.529\" ry=\"20.583\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"225.493\" cy=\"408.442\" fill=\"none\" rx=\"23.529\" ry=\"20.583\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"193.5\" x2=\"416.5\" y1=\"382.892\" y2=\"382.892\"/>\n  </g>";
            }
        },
        DRUG_VEHICLE("09", "Drug Vehicle", LandEquipmentEntity.CIVILIAN_VEHICLE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"221.692\" cy=\"425.556\" fill=\"none\" rx=\"14.644\" ry=\"12.811\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"389.593\" cy=\"425.556\" fill=\"none\" rx=\"14.645\" ry=\"12.811\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"197.974\" x2=\"413.5\" y1=\"408.193\" y2=\"408.193\"/>\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1 0 0 1 203.9658 398.6055)\">DRUG</text>\n  </g>";
            }
        },
        BUREAU_ALCOHOL_TOBACCO_FIREARMS_EXPLOSIVES_ATF("01", "Bureau of Alcohol-Tobacco-Firearms and Explosives (ATF) (Department of Justice)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 203 435.25)\">ATF</text>\n  </g>";
            }
        },
        DRUG_ENFORCEMENT_ADMINISTRATION_DEA("04", "Drug Enforcement Administration (DEA)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"102\" transform=\"matrix(1 0 0 1 194 435.25)\">DEA</text>\n  </g>";
            }
        },
        FEDERAL_BUREAU_INVESTIGATION_FBI("06", "Federal Bureau of Investigation (FBI)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 207 438.25)\">FBI</text>\n  </g>";
            }
        },
        POLICE("07", "Police", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M264.659,353.621c0,71.906,16.594,77.438,45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M353.159,353.621c0,71.906-16.594,77.438-45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M263,353.621c23.785,13.828,23.785,13.828,45.91,0 c22.125,13.828,22.125,13.828,45.909,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        UNITED_STATES_SECRET_SERVICE_USSS("08", "United States Secret Service (USSS)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"84\" id=\"USSS\" transform=\"matrix(1 0 0 1 191.5 426.5)\">USSS</text>\n  </g>";
            }
        },
        TRANSPORTATION_SECURITY_ADMINISTRATION_TSA("09", "Transportation Security Administration (TSA)", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"106\" transform=\"matrix(1 0 0 1 196 437.25)\">TSA</text>\n  </g>";
            }
        },
        COAST_GUARD("10", "Coast Guard", LandEquipmentEntity.LAW_ENFORCEMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"240.001,468.194 199.786,387.765 250.055,387.765 250.055,322.416 360.646,322.416 360.646,387.765 410.914,387.765 370.698,468.194\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"385.78,387.765 345.566,468.194 320.432,468.194 360.646,387.765\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        HORSE("01", "Horse", LandEquipmentEntity.PACK_ANIMALS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.6,0,0,0.6,122.18872,160.81905)\">\n    <path d=\"m 422.36483,454.28218 c -0.96904,2.42261 -1.87751,4.78464 -2.96768,6.96498 -5.08746,9.5087 -15.14125,13.92995 -25.19504,15.80745 v -17.26102 h 7.32837 c 1.39299,-3.57332 4.23954,-6.23818 7.934,-7.38892 1.15073,-0.60565 1.87751,-1.57469 2.11977,-2.84655 0.12114,0 0.12114,0 0.12114,0 0.96903,-7.93402 2.30147,-16.29199 3.93672,-24.77108 0.78734,-2.11978 0.0605,-4.05786 -2.24091,-4.78464 -4.96633,-0.60564 -9.75096,-1.57469 -14.53559,-2.84655 -10.29605,-0.48452 -20.65267,-2.78599 -29.55572,-8.17628 -7.934,4.30012 -10.84114,12.6581 -15.14125,19.98645 v -0.12113 c -10.17491,15.86803 -18.41175,32.82622 -24.77107,50.39006 -0.42395,1.09018 -0.60565,2.24091 -0.60565,3.39165 0,1.81695 0.54508,3.51277 1.39299,4.96633 4.8452,4.96633 7.99458,11.08338 10.47774,17.44272 l -19.13853,0.18168 c -0.12113,-4.60293 -0.54508,-9.02418 -3.2705,-12.90034 -2.4226,-2.11977 -4.30011,-3.93672 -4.6635,-7.32835 0.54508,-4.30012 3.2705,-8.1157 5.08746,-11.99187 v 0 c 2.2409,-4.78464 3.57333,-9.8721 4.23954,-15.02011 0.72678,-4.42125 1.93808,-8.78193 3.14938,-13.1426 3.57334,-11.9313 5.32972,-24.28656 7.75232,-36.5207 -21.56113,3.4522 -43.4251,1.81696 -64.6834,-2.54372 -2.36203,12.53694 -5.93536,24.64994 -10.47773,36.52068 -1.69582,6.17762 3.08881,12.4764 6.11705,17.44271 6.72272,9.93266 14.29335,19.13854 20.7738,29.2529 3.93673,4.8452 7.20723,10.29605 9.75096,16.1103 l -20.2287,0.30282 -0.60565,-7.38892 c -0.0605,-1.09017 -0.0605,-2.18034 -1.0296,-2.72542 -2.90711,-0.9085 -4.36067,-3.45222 -5.39027,-6.11707 -2.24091,-5.3903 -5.08746,-10.59887 -8.4791,-15.5652 -6.2382,-8.60023 -13.74825,-16.1103 -22.34848,-22.34848 0,0 0,0 -0.12113,-0.12114 -2.2409,-1.45355 -2.66486,-3.81559 -2.66486,-6.23818 0.84791,-4.54238 1.75638,-9.08475 2.54374,-13.6877 0.72677,-8.90304 -3.27052,-17.44272 -10.59888,-22.6513 -3.93672,5.99594 -8.96362,11.02283 -14.5356,15.5652 -6.72271,4.72407 -13.08204,9.99323 -18.95685,15.7469 v 0 c -1.45355,1.45356 -2.84654,2.84656 -4.1184,4.23954 -3.08881,3.9973 -5.2086,8.6608 -6.96497,13.32431 -3.51277,8.9636 -6.0565,17.6244 -7.81288,25.9218 -0.60566,2.72543 0.0606,5.45085 1.39299,7.81288 v 0 c 3.14938,4.11843 5.6931,8.6608 7.51006,13.6877 l -18.8357,0.1817 -0.12113,-8.4791 c 0.12113,-0.78734 -0.1817,-1.21129 -0.60565,-1.81694 h -0.12113 c -3.27052,-1.63525 -4.48181,-4.54238 -3.99729,-8.05514 5.81424,-14.05108 7.99458,-25.92182 11.44678,-38.51934 v 0 c 1.393,-4.42124 1.69582,-9.20587 1.15074,-13.86938 -0.36339,-2.2409 0.36339,-4.30011 1.69581,-6.11706 2.24091,-2.72542 4.5424,-5.69312 6.90441,-8.6608 4.90577,-6.11707 7.14667,-13.74825 8.60023,-21.25832 2.4226,-11.5679 0.24226,-23.74147 1.45356,-35.7939 1.75638,-9.62984 7.20723,-18.10893 13.3243,-25.49786 -27.6782,3.51277 -24.83164,46.08995 -25.0739,67.77222 0,1.39299 0,2.72542 0,4.23954 l -25.19503,-0.30281 c 1.09017,-38.45877 6.11707,-83.39799 55.1747,-77.64432 11.7496,-3.87616 23.43864,-7.934 35.91503,-8.23684 29.0712,0.24227 51.48024,8.4791 80.36973,5.5114 40.39685,-5.20858 44.93923,-53.90283 88.96997,-54.75074 5.5114,0 11.14395,0.84791 16.4131,2.4226 8.35797,-1.87752 16.9582,-2.36204 25.49786,-1.69582 -4.54236,3.57333 -8.78192,7.0861 -13.02147,10.72 -1.75638,11.20453 -0.42395,22.5302 -0.8479,33.79527 0.12113,3.63389 -0.84792,20.47096 -1.69582,27.98102 0.48451,6.54102 -6.60159,9.8721 -13.3243,9.20588 -3.39164,-0.36339 -3.63391,-2.78599 -8.41854,-3.39165 -3.08881,-1.93808 -1.93807,-5.6931 -2.2409,-8.7819 -0.54508,-7.51007 -4.17898,-14.29334 -5.81424,-21.6217 -2.66486,-1.0296 -5.08746,-2.24091 -7.38892,-3.51277 -5.2086,8.17627 -7.93403,17.56385 -8.05515,27.1331 -0.18169,8.47909 -0.30283,16.9582 -0.30283,25.4373 0,-0.60564 0,-0.18169 -0.12113,0.12114 -0.42395,6.48045 -2.24089,12.71864 -5.26915,18.29062 11.14396,1.87751 21.8034,5.26915 31.9783,10.17491 4.11842,2.30148 9.26644,4.36068 11.99188,8.4791 0.12113,0 0.12113,0 0.12113,0.12113 1.45355,2.30147 1.57468,4.96633 1.0296,7.51005 -3.08882,14.23278 -6.90441,27.25426 -12.113,38.33764 z\" style=\"stroke-width:0.81552\"/>\n  </g>";
            }
        },
        MULE("02", "Mule", LandEquipmentEntity.PACK_ANIMALS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.6,0,0,0.6,122.18872,160.81905)\">\n    <path d=\"m 313.9026,509.33279 c -2.26693,-1.318 -2.77606,-2.89607 -1.97021,-6.10682 0.83365,-3.32153 0.21825,-4.9846 -2.64319,-7.14298 l -3.72983,-2.81342 2.73568,-13.11242 c 1.50464,-7.2118 2.68669,-16.1124 2.62682,-19.77906 -0.0598,-3.66667 0.43685,-14.35417 1.10387,-23.75 1.08798,-15.3261 0.92665,-17.08334 -1.5684,-17.08334 -2.44617,0 -2.72394,-2.04521 -2.30617,-16.98078 l 0.47497,-16.98077 5.13556,-1.32736 c 9.80394,-2.534 11.4511,-6.27334 12.1258,-27.52756 0.85362,-26.89015 -2.29931,-28.42536 -3.85965,-1.87935 -1.25401,21.3344 -3.03868,26.3625 -9.35705,26.3625 -7.808,0 -8.21133,1.03207 -8.21133,21.01165 0,17.87723 -0.19505,18.98835 -3.33333,18.98835 -3.14011,0 -3.33334,-1.11112 -3.33334,-19.16667 v -19.16666 h -21.66667 -21.66666 v 18.33333 c 0,10.08333 -0.5625,18.32185 -1.25,18.3078 -4.28642,-0.0875 -5.32145,-3.64993 -5.7711,-19.86318 l -0.47891,-17.26895 -7.58179,-2.20729 c -4.16998,-1.21401 -9.41998,-4.16206 -11.66666,-6.55121 -3.71704,-3.95277 -4.13474,-5.9456 -4.63844,-22.13056 -0.7521,-24.16645 -3.6131,-26.17225 -3.6131,-2.5331 0,22.66699 2.52663,27.8014 16.27856,33.07982 l 8.68437,3.33334 0.0185,15.3754 0.0185,15.37542 -4.27517,-1.62542 c -6.22683,-2.36745 -6.5093,-2.2215 -8.95065,4.6246 -1.22581,3.4375 -4.93265,10.35055 -8.23738,15.36235 -5.27312,7.9969 -6.0849,10.62293 -6.63178,21.453 -0.8924,17.67185 3.34365,32.34338 11.70455,40.53875 3.51475,3.44515 6.39043,7.83468 6.39043,9.75455 0,3.12446 -0.83048,3.43736 -7.91667,2.98266 -7.44845,-0.47795 -7.94576,-0.80446 -8.40881,-5.52085 -0.34502,-3.51435 -1.96425,-5.85773 -5.41665,-7.83915 -4.26332,-2.44681 -4.92452,-3.79666 -4.92452,-10.05363 0,-7.68082 -3.79773,-24.2337 -6.88227,-29.99722 -1.80475,-3.3722 -1.90228,-3.37958 -3.70065,-0.28031 -1.01588,1.75075 -1.8628,10.72288 -1.88206,19.93808 -0.0332,15.86882 0.20738,17.04347 4.5483,22.21122 2.52084,3.00096 4.58334,6.94188 4.58334,8.75758 0,2.85315 -0.96154,3.23172 -7.08334,2.7888 -6.5076,-0.47085 -7.1256,-0.91888 -7.60368,-5.5125 -0.2862,-2.75 -1.76425,-5.95373 -3.28453,-7.1194 -2.3699,-1.81708 -2.78277,-6.09607 -2.89459,-30 l -0.13033,-27.8806 5.0816,-7.22077 c 4.51908,-6.42143 5.05747,-8.45095 4.86342,-18.33333 -0.13,-6.6187 -1.65635,-15.12228 -3.77447,-21.02792 -1.95595,-5.45345 -4.04955,-14.07845 -4.65247,-19.16666 -2.00575,-16.92712 -3.92333,-1.73965 -3.5667,28.24868 0.33915,28.51963 -1.67113,41.3347 -7.71268,49.16667 -2.40193,3.11373 -2.5077,2.83925 -1.60545,-4.16667 0.716,-5.55965 0.50647,-6.85322 -0.80988,-5 -2.86107,4.02792 -2.26007,-14.35655 0.84666,-25.89983 1.47042,-5.46344 3.20935,-20.13544 3.8643,-32.60447 1.07937,-20.54887 1.61839,-23.40053 5.75854,-30.46517 5.56356,-9.4935 18.293,-18.33955 31.037,-21.56852 8.7622,-2.2201 9.18894,-2.58121 9.67155,-8.18466 0.3087,-3.58415 2.08974,-7.35095 4.58334,-9.6936 2.24313,-2.10731 4.07843,-5.20075 4.07843,-6.8743 0,-1.67353 1.5,-4.5428 3.33333,-6.37613 4.09587,-4.09587 18.9944,-4.54608 29.16667,-0.8814 3.66667,1.32097 9.42163,2.43467 12.7888,2.4749 3.8949,0.0465 7.83605,1.4974 10.83333,3.98805 3.3504,2.7841 7.74217,4.22325 15.2047,4.98248 13.92546,1.41675 16.67556,3.1508 19.0446,12.0084 1.77387,6.6323 2.50507,7.42757 6.82924,7.42757 3.15871,0 11.65993,-4.31893 24.44753,-12.42025 10.78268,-6.83113 24.25012,-14.78078 29.92763,-17.6659 5.67752,-2.8851 10.70915,-6.48348 11.18142,-7.99642 3.13067,-10.02925 11.51025,-23.5841 14.57962,-23.5841 0.45656,0 1.05503,4.21772 1.32995,9.37274 l 0.49983,9.37273 5.52023,-7.70607 c 3.03612,-4.23835 6.3281,-7.70606 7.31549,-7.70606 3.27423,0 0.0423,16.7648 -4.57784,23.74628 l -4.33685,6.55343 4.56674,6.58979 c 2.5117,3.6244 5.19196,6.9762 5.95615,7.4485 0.76418,0.47229 1.38941,3.04899 1.38941,5.726 0,2.67702 3.1405,12.57025 6.97887,21.98497 7.69953,18.88532 8.64372,26.70894 4.0664,33.6948 -2.82252,4.30772 -3.66907,4.58835 -11.55542,3.83057 -7.41485,-0.71248 -8.89533,-0.32753 -11.5063,2.99178 -7.15326,9.0939 -26.7201,13.70965 -43.42196,10.24307 -6.6688,-1.38415 -6.64245,-1.40762 -8.64552,7.70597 -0.56597,2.575 -4.0338,7.94166 -7.70633,11.92586 -5.93792,6.4419 -6.94125,8.784 -9.0611,21.1515 -5.5745,32.52289 -6.21675,38.063 -5.52355,47.6465 0.60742,8.39747 1.6206,11.10074 6.05224,16.1481 7.4844,8.52428 7.02098,10.94621 -2.09452,10.94621 -7.8922,0 -11.16797,-2.8437 -9.70782,-8.42736 0.4714,-1.80259 -0.5232,-3.64734 -2.55181,-4.733 -3.10455,-1.66152 -3.30225,-3.32342 -2.991,-25.1427 0.1833,-12.85 -0.079,-23.35984 -0.5828,-23.35524 -2.0384,0.0187 -8.45773,28.12794 -8.4376,36.9471 0.017,7.4219 0.85665,10.46868 3.90456,14.16666 5.8974,7.15525 6.48115,10.05657 2.25165,11.1909 -5.19141,1.39232 -8.20043,1.17142 -11.69153,-0.85831 z m 81.84944,-118.99802 c 11.85488,-3.52052 12.00666,-5.28748 0.38196,-4.44662 -6.348,0.45917 -12.5656,-0.23491 -17.66293,-1.97175 -5.85678,-1.9956 -8.43847,-2.20558 -10.10567,-0.82193 -8.8981,7.38478 10.04035,12.3916 27.38664,7.2403 z m 13.29076,-10.74513 c 3.89584,-1.76839 7.08334,-3.97582 7.08334,-4.9054 0,-3.20114 -9.99502,-13.06617 -15.409,-15.2086 -2.98339,-1.1806 -6.55745,-3.10192 -7.94237,-4.26961 -2.14347,-1.80725 -3.817,-0.38148 -11.25,9.5845 -4.80258,6.43918 -8.73197,12.33058 -8.73197,13.092 0,5.28274 25.7058,6.49327 36.25,1.70709 z m -132.91667,44.072 c -1.375,-0.31445 -6.0625,-1.04034 -10.41666,-1.61309 l -7.91667,-1.04138 V 403.84314 386.6791 l 18.38512,0.0657 18.3851,0.0657 -0.46845,18.45056 -0.46845,18.45057 -7.5,0.26097 c -4.125,0.1435 -8.625,0.003 -10,-0.31075 z\" style=\"fill:#000000;stroke-width:1.66667\"/>\n  </g>";
            }
        },
        CAMEL("03", "Camel", LandEquipmentEntity.PACK_ANIMALS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.96,0,0,0.96,12.38837,18.79702)\">\n    <path d=\"m 212.0312,425.74447 c 5.1927,11.8223 6.87736,21.07263 9.07074,33.39793 0.54361,3.09651 -0.0438,2.69614 3.56914,3.24219 9.2706,1.38107 11.9076,-2.67224 4.77845,-4.9357 -7.2645,-2.3181 -9.73633,-25.63302 -5.07197,-39.53835 4.3568,-12.85966 4.2379,-8.50284 7.1047,-12.87278 1.88063,-2.8429 3.06441,-8.43616 3.06441,-8.43616 0.46708,0.0681 4.05156,5.73126 0.35088,22.46574 -0.88284,3.99624 -1.72333,7.06503 -1.61602,6.68133 22.8037,29.0366 9.89912,37.17728 24.4359,34.26424 0.2494,-0.0496 2.02645,-0.37963 2.13473,-0.5957 0.20483,-0.41017 0.1424,-1.58958 -0.46061,-2.1915 -1.58054,-1.57461 -2.38283,-0.51469 -3.47063,-2.66723 -5.2647,-10.3936 -14.00672,-23.58388 -10.57977,-35.3617 5.11135,-17.44728 3.56026,-9.21901 8.02247,-16.44367 5.23228,-8.38957 1.96936,-9.4162 5.9969,-7.71154 9.79814,3.96725 31.5491,7.88503 34.43542,7.92795 0.9166,0.0268 1.74122,24.337 -0.97432,27.01322 -1.3062,1.29285 1.52017,1.60347 -10.91988,11.61328 -3.41852,2.75575 -4.18125,4.42466 -8.34635,2.94659 -5.4032,-1.89995 -6.85261,23.07972 1.48726,8.13394 0.42922,-0.76492 2.67914,-1.6176 4.12227,-2.1764 4.61666,-1.81579 1.1539,-1.39853 5.4402,-5.16606 1.05,-0.92088 3.99648,-3.11955 6.7901,-5.07084 6.4499,-4.4717 5.71672,-3.54732 5.87088,-2.54363 0.82687,5.94649 1.06081,8.21896 2.30013,19.57988 -1.3924,2.85087 -2.85444,3.39479 3.68515,4.56676 7.82725,1.56802 9.34822,1.07223 8.61929,-2.38809 -0.5463,-2.54924 -9.80173,3.11058 -8.95003,-26.4905 0.36093,-12.38298 2.56475,-26.05172 4.27987,-32.83406 12.77934,-8.85924 10.5548,-7.64622 16.34902,-6.54855 3.98312,0.66632 12.30604,2.31126 15.80112,0.28388 4.43243,-2.50857 8.90565,0.4222 35.34688,-22.24085 14.4078,-2.80015 17.18106,-2.2849 21.13165,-0.8384 1.32297,-1.35981 0.97467,-1.00171 2.14152,-2.20102 -0.64734,-9.0134 -0.71936,-10.5125 -16.291,-12.887 -0.28715,-0.18476 -6.97549,-4.4133 -7.3156,-4.5384 -1.03644,-0.36391 -2.72055,1.70698 -8.14006,-1.36889 -2.66376,5.07226 -2.41888,4.8613 -4.15784,6.3477 -8.65868,7.44132 -14.27038,13.5334 -17.09294,14.82082 -3.86533,1.71317 -10.45993,1.20548 -14.99294,-1.02409 -7.05036,-3.36707 -5.303,-11.34788 -13.91858,-18.6047 -4.26752,-3.53981 -12.08322,-7.5339 -19.34786,-8.07983 -9.43168,-7.78251 -6.76925,-3.19566 -9.03716,-7.31262 -2.65174,-4.78466 -4.69585,-6.73672 -13.27248,-8.88774 -2.62009,-0.79783 -21.23346,-1.87786 -18.41134,1.91988 2.20534,2.99009 -3.44723,12.2923 -25.77529,19.68008 -7.17286,7.9061 -5.1626,4.59523 -12.2673,18.78176 -0.76343,44.61668 0.009,43.17305 -5.91913,58.28882 z\" style=\"stroke-width:0.37598\"/>\n  </g>";
            }
        },
        OXEN("04", "Oxen", LandEquipmentEntity.PACK_ANIMALS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.96,0,0,0.96,12.3884,18.79703)\">\n    <path d=\"m 402.24679,403.28319 c -0.1372,-0.6858 -0.1372,-1.44017 -0.0685,-2.12597 v -2.60603 c -0.0686,-0.82296 0,-1.6459 0.1372,-2.46886 0.41146,-2.19455 0.68582,-4.25196 0.82301,-6.37793 0.13707,-1.50875 0.20572,-3.01749 0.27427,-4.52623 l 0.13716,-2.3317 0.41146,-3.22333 0.41146,-4.11482 c 0.0686,-0.27432 0.0686,-0.54864 0.0686,-0.75436 0,-0.27432 0,-0.54865 -0.0686,-0.75438 l -0.41146,-3.97769 c 0.41146,1.85166 0.82301,3.70343 1.02873,5.55485 l 1.02863,6.7209 0.0685,0.89153 0.20572,1.92022 0.1372,1.44018 v 2.19453 l -0.0686,1.92023 0.20574,3.29174 0.20572,4.11483 0.20584,3.0862 -0.0685,5.21217 -0.1372,1.85165 -0.1372,1.6459 -0.34291,2.05738 c 0,0.41148 0.0685,0.89154 0.0685,1.30302 0,0.54864 -0.0685,1.16585 -0.0685,1.78305 v 0.20574 c 0,0.41148 0.0685,0.82298 0.1372,1.16586 0.27436,0.75437 0.41146,1.50874 0.4801,2.33171 0.13707,0.82296 0.20571,1.6459 0.41146,2.46886 0.20571,0.82296 0.34291,1.6459 0.34291,2.53746 l 0.0685,1.7145 c 0,0.34289 0.20575,0.6858 0.48002,0.82297 0.41146,0.27431 0.96017,0.48004 1.5087,0.48004 0.0685,0 0.1372,0.0685 0.20575,0.0685 0.41155,0 0.75437,-0.13716 1.09728,-0.27432 0.68581,-0.20574 1.02872,-0.82295 1.02872,-1.50873 v -3.42888 c 0,-1.50873 -0.1372,-3.01748 -0.41146,-4.5262 -0.20571,-1.23442 -0.20571,-2.53744 -0.0686,-3.84057 0.0686,-0.34288 0.1372,-0.75436 0.27427,-1.16584 0.0686,-0.4115 0.0686,-0.82297 0.0686,-1.30302 0,-0.34288 -0.0686,-0.6858 -0.27427,-0.89153 -0.41155,-0.54865 -0.68582,-1.0287 -0.89153,-1.6459 -0.34291,-0.75437 -0.61721,-1.50874 -0.82301,-2.33171 -0.20575,-0.61721 -0.34282,-1.30301 -0.27427,-1.98881 0.0685,-1.0973 0.0685,-2.19454 0.0685,-3.29174 v -0.0686 c 0,-1.44017 0.1372,-2.88035 0.34282,-4.32037 0.20583,-1.23445 0.3429,-2.53746 0.3429,-3.84056 v -8.641 l 0.1372,-10.97286 -0.1372,-4.8692 c -0.0685,-0.82296 -0.0685,-1.6459 -0.13707,-2.46886 -0.0685,-2.67462 -0.54874,-5.21217 -1.44018,-7.68082 -0.89153,-2.4003 -2.12601,-4.52623 -3.84055,-6.44635 -1.57738,-1.7145 -3.29183,-3.29175 -5.21222,-4.66335 -1.23444,-0.89154 -2.53743,-1.6459 -3.90897,-2.19455 -1.98885,-0.82296 -4.11485,-1.57733 -6.24086,-2.12597 -1.44015,-0.41148 -2.88034,-0.61721 -4.38907,-0.68581 -1.02864,-0.0686 -2.33163,-0.0686 -3.56598,-0.13716 h -1.44018 c -2.05736,0 -4.04608,0.13716 -6.03492,0.48005 -0.96018,0.20574 -1.85161,0.34289 -2.81182,0.48005 -1.37154,0.20574 -2.67454,0.34288 -3.97762,0.48005 -3.22329,0.34289 -6.51512,0.61721 -9.80683,0.82296 -5.76074,0.27432 -12.06989,0.82297 -18.4478,1.44017 -2.67463,0.3429 -4.86918,0.54865 -7.06365,0.68581 -0.54862,0.0685 -1.5087,0.13716 -2.40027,0.20574 -1.02872,0.0685 -1.7831,0.0685 -2.53743,-0.0685 -0.6172,-0.0685 -1.23447,-0.13717 -1.9203,-0.20573 -2.33162,-0.3429 -4.59492,-0.48006 -6.858,-0.48006 -6.035,0 -12.13867,-0.41148 -18.17356,-1.30301 -6.65227,-0.96013 -13.16726,-1.50874 -19.81945,-1.50874 h -0.6173 c -1.71445,0 -3.42877,0 -5.07499,0.13716 -1.7831,0.13715 -3.7034,0.34289 -5.62355,0.54864 -1.71445,0.20574 -3.566,0.34289 -5.48648,0.48005 -2.40027,0.20574 -4.59492,0.27432 -6.78926,0.20574 -1.57735,-0.0685 -3.15464,-0.20574 -4.80054,-0.34289 -1.783,-0.13716 -3.56597,-0.48005 -5.34928,-0.96012 -2.1261,-0.54865 -4.2521,-1.23445 -6.30937,-2.12599 -0.82301,-0.27431 -1.57735,-0.6858 -2.33172,-1.09728 l -1.23447,-0.75437 0.54865,-1.30301 c 0.2058,-0.20574 0.27436,-0.48004 0.27436,-0.82297 v -0.20573 c -0.1372,-0.54865 -0.41146,-0.96013 -0.96008,-1.16586 -0.6173,-0.20573 -1.30312,-0.48004 -2.05746,-0.6858 -0.48001,-0.20574 -1.02863,-0.41148 -1.50873,-0.6172 -0.68582,-0.3429 -1.4402,-0.61721 -2.19456,-0.75438 -0.75437,-0.13716 -1.4402,-0.54864 -1.92016,-1.16585 l -2.74318,-3.36046 c -0.1372,-0.13715 -0.2744,-0.20573 -0.41146,-0.27432 h -0.20584 c -0.20572,0 -0.34279,0.13716 -0.47998,0.3429 -0.0685,0.20573 -0.0685,0.41148 -0.0685,0.6172 0,0.20573 0,0.4115 0.0685,0.54864 l 0.34291,0.82297 0.68572,1.85165 0.82302,2.19455 h -0.0686 c -1.16593,0.0685 -2.19456,0.34289 -3.15464,0.82296 -0.4801,0.27432 -1.23448,0.6858 -1.9203,1.09728 -0.9601,0.48006 -1.50871,0.96013 -1.98872,1.57734 -0.2058,0.20574 -0.41155,0.4115 -0.68582,0.54865 -0.34291,0.20574 -0.75437,0.27432 -1.16592,0.13715 -0.61717,-0.13715 -1.23435,-0.54864 -1.6459,-1.09728 l -3.01744,-3.90898 c -0.20572,-0.20573 -0.41146,-0.34289 -0.68582,-0.34289 -0.0685,-0.0685 -0.1371,-0.0685 -0.1371,-0.0685 -0.27436,0 -0.48007,0.13716 -0.61727,0.34289 -0.13707,0.27432 -0.20571,0.54865 -0.20571,0.82297 0,0.13715 0,0.34289 0.0685,0.54864 l 0.48001,1.0973 0.89153,2.19454 0.68582,1.3716 0.75436,1.0287 0.54866,0.82296 1.1658,1.98882 c 0.0685,0.13716 0.1372,0.27432 0.1372,0.41148 0,0.20574 -0.0685,0.34289 -0.20575,0.48006 -0.48007,0.6172 -1.02872,1.23441 -1.6459,1.85165 -0.4801,0.48004 -1.09727,0.82297 -1.71454,0.96012 -0.75437,0.20574 -1.37154,0.82296 -1.57726,1.57734 -0.20574,0.6858 -0.41146,1.44017 -0.4801,2.12597 -0.1371,1.16585 -0.68582,2.19455 -1.4402,3.01748 -0.61717,0.54865 -1.09728,1.16586 -1.50874,1.85166 -0.68581,1.0287 -1.37154,2.05738 -2.19452,3.01748 -0.61717,0.75437 -1.09728,1.6459 -1.50874,2.46886 -0.41146,1.0287 -0.96008,1.98882 -1.71445,2.74319 l -4.32043,4.66334 c -0.0685,0.34289 -0.1371,0.68581 -0.1371,1.0287 0,0.27432 0,0.48006 0.0685,0.68581 0.1372,0.96012 0.41146,1.92022 0.68582,2.81176 0.27426,0.75436 0.68581,1.3716 1.16582,1.98881 0.48008,0.54865 0.96018,1.0973 1.57735,1.57733 0.61718,0.48005 1.37164,0.89153 2.12601,1.16586 0.34281,0.0685 0.68582,0.13715 1.02863,0.13715 0.54863,0 1.09728,-0.13715 1.57738,-0.41148 0.48008,-0.27432 0.9601,-0.41148 1.50871,-0.54863 0.75437,-0.20575 1.57738,-0.20575 2.40027,-0.0686 1.16592,0.20574 2.19455,0.41148 3.15464,0.61721 -0.34291,-0.0685 0.20574,-0.0685 0.75437,-0.0685 0.54862,0 1.16592,-0.0685 1.7831,-0.13715 1.02863,-0.27433 2.05736,-0.48006 3.01744,-0.61721 0.54866,-0.13717 1.4402,-0.4115 2.2632,-0.75438 0.61718,-0.27431 1.303,-0.27431 1.98881,-0.0685 0.75437,0.27432 1.50874,0.61721 2.26311,1.0287 1.71454,0.96013 3.56597,1.57734 5.48645,1.92023 0.68582,0.13715 1.37154,0.27432 1.98881,0.4115 0.89156,0.13715 1.98884,0.27431 3.01748,0.27431 0.75433,0.0685 1.5087,0.20574 2.26316,0.54864 1.37155,0.68581 2.60602,1.7145 3.49755,3.01748 1.16583,1.7145 2.19456,3.49758 3.08618,5.41772 0.68585,1.44017 1.50874,2.94891 2.33175,4.38908 0.61717,1.0287 1.1658,2.26314 1.6459,3.4976 0.68572,1.7145 1.37154,3.22332 2.12591,4.80048 0.4801,1.09728 0.96018,2.19454 1.37164,3.36045 0.1372,0.34289 0.34291,0.68581 0.54862,0.96013 1.9202,2.60603 4.52618,4.52622 7.54375,5.48644 l 1.85161,0.61721 -1.92016,1.7145 -3.90901,3.49758 -2.05745,1.98882 -1.64581,1.78306 c -0.4801,0.75437 -0.96018,1.57733 -1.57738,2.33171 -0.48008,0.75437 -0.89153,1.37161 -1.1658,2.05738 -0.27436,0.61721 -0.41155,1.23444 -0.41155,1.92021 0,0.27432 0.0686,0.54865 0.0686,0.82298 0.20571,1.02868 0.61717,1.98881 1.09724,2.88034 l 1.02864,1.7145 1.23447,1.6459 3.70348,3.49758 1.64581,1.6459 1.50883,1.57734 0.8229,1.0287 2.46891,3.08618 4.32034,4.59494 2.26311,2.12598 1.7831,1.37161 1.4402,0.96011 1.02873,0.48005 0.54862,0.0685 c 0.61717,1.57734 1.6459,3.01747 2.88037,4.11482 0.47998,0.48005 1.09728,0.82297 1.78301,0.96013 0.61717,0.13716 1.1659,0.27432 1.7831,0.41148 h 0.41143 c 0.2744,0 0.4801,0 0.75437,-0.0685 l 0.41155,-0.13715 -3.22338,-11.0413 c -0.1372,-0.41147 -0.41146,-0.75436 -0.89153,-0.82296 l -2.94892,-0.68581 c -0.27427,-0.13716 -0.41146,-0.41148 -0.34291,-0.61721 l 0.61727,-1.85164 c 0.0685,-0.13716 0.1371,-0.4115 0.1371,-0.61722 0,-0.61721 -0.34282,-1.16584 -0.89144,-1.44017 -0.4801,-0.27431 -1.02873,-0.48005 -1.57738,-0.6858 -0.75437,-0.13717 -1.4402,-0.54864 -2.05736,-0.96013 -0.82302,-0.61721 -1.6459,-1.23444 -2.46892,-1.92022 -1.09728,-0.89154 -2.05736,-2.05738 -2.74317,-3.29175 -0.61718,-1.16584 -1.23435,-2.3317 -1.92017,-3.42887 -0.6173,-1.09727 -0.89156,-2.05738 -1.02876,-3.08618 -0.13716,-1.0973 0.1372,-2.19455 0.82301,-3.15462 0.68582,-0.96007 1.64591,-1.78305 2.67466,-2.26313 l 3.90888,-1.85166 c 1.16593,-0.54865 2.33172,-1.09728 3.5661,-1.57734 1.1658,-0.41148 2.19452,-1.0287 3.22328,-1.7145 0.68582,-0.54865 1.37151,-0.96013 2.12598,-1.37161 1.50873,-0.96012 2.67466,-2.19453 3.566,-3.77184 l 0.41146,-0.75438 1.71455,3.4976 0.68581,1.50875 0.54863,1.16584 1.09727,1.57733 1.37155,1.98882 2.05745,2.94891 1.71445,2.7432 1.85165,3.01746 0.89156,1.44018 2.60598,4.59493 1.02873,1.98882 1.303,2.60603 0.68585,1.57732 0.47998,1.4402 c 0.34291,0.75437 0.54875,1.50873 0.68582,2.3317 0.0685,0.6172 0.20572,1.23441 0.34291,1.92022 0,0.27431 0.0686,0.54864 0.0686,0.82296 0,0.96013 -0.34291,1.85167 -1.02873,2.53747 l -2.19455,2.46886 -0.34282,0.54864 c -2.126,0.54865 -3.70348,2.33171 -4.04617,4.52622 l -0.0685,0.48005 h 11.7273 c 0.96008,-1.0287 1.5087,-2.33171 1.5087,-3.70343 0,-0.82296 -0.20571,-1.64591 -0.54862,-2.4003 l -0.34291,-0.61722 c -0.0686,-0.27432 0.0686,-0.48004 0.27436,-0.48004 h 1.37154 c 0.89156,-0.13715 1.4402,-0.89153 1.4402,-1.7145 0,-0.13716 0,-0.20574 -0.0686,-0.34289 l -0.54863,-2.74318 -0.96008,-3.36046 -1.09737,-4.0461 -1.09728,-3.77185 -0.68573,-2.74318 -0.61726,-2.53747 -0.41146,-1.6459 -0.41146,-1.6459 -0.27436,-1.50873 -0.34291,-1.57734 -0.27426,-1.16585 -0.75437,-2.88035 c -0.41156,-1.30301 -0.89156,-2.67462 -1.23447,-3.97769 -0.54863,-1.98882 -1.303,-3.97769 -2.26308,-5.7607 l -0.61727,-1.16585 5.34939,-0.13715 h 1.1658 c 1.50874,0 3.15464,0 4.73212,-0.13717 2.53734,-0.13715 5.21209,0.0685 7.81788,0.68581 3.70348,0.75436 7.40656,1.16585 11.17846,1.23445 0.41146,0.0685 0.75437,0.0685 1.1658,0.0685 4.11485,0 8.16092,-0.41148 12.13867,-1.23441 2.81173,-0.54864 4.86918,-0.96012 6.92644,-1.37161 l 0.41143,-0.0685 c 1.50884,1.23445 3.15555,2.3317 4.93764,3.15461 l 0.20572,0.13716 -0.9601,5.4177 c 0.0686,1.0973 0.9601,1.98882 2.05736,1.98882 0.89157,0 1.71455,-0.48004 1.98884,-1.30301 l 1.71455,-4.5262 2.53747,0.54863 -0.61731,4.45781 v 0.41148 c 0,0.41148 0.0686,0.82297 0.27436,1.16585 0.34295,0.54864 0.82292,0.82296 1.4402,0.89153 h 0.27427 c 0.41145,0 0.82301,-0.0685 1.23447,-0.13716 0.54862,-0.13715 1.02863,-0.54865 1.09728,-1.16586 l 0.96008,-5.00632 2.33172,0.13716 c 0.1372,0.89153 0.20574,1.85166 0.20574,2.81175 v 0.41148 c 0,1.3716 -0.1372,2.67462 -0.27426,4.0461 -0.1372,1.16585 -0.41156,2.26314 -0.82301,3.29174 -0.9601,2.19454 -2.05737,4.45781 -3.29171,6.58377 l -0.82302,1.4402 -1.50873,2.67461 c -0.61717,1.44018 -1.50871,2.74319 -2.53747,3.90898 l -0.82288,0.96013 -0.96018,0.96012 -2.46882,2.05739 -1.9203,1.6459 -2.40027,1.98881 c -0.27426,0.20574 -0.54862,0.48005 -0.8229,0.68581 -1.57738,1.44016 -2.81185,3.22333 -3.63474,5.14345 l -0.20572,0.6172 c -1.02875,0.4115 -1.98884,0.96013 -2.81182,1.57735 -1.02863,0.89153 -1.85164,1.92022 -2.4003,3.15461 l -0.27426,0.6172 h 11.65847 l 0.27435,-0.0685 3.36045,-6.24079 c 0.0686,-0.20575 0.2743,-0.34289 0.48001,-0.34289 0.1372,0 0.27436,0.0686 0.34291,0.13715 l 0.89153,0.75437 c 0.1372,0.13717 0.34294,0.27432 0.48001,0.27432 0.1372,0 0.20572,-0.0685 0.27436,-0.0685 0.34291,-0.20574 0.68582,-0.4115 0.96008,-0.6858 l 0.34294,-0.41148 1.303,-1.50874 1.02872,-1.37161 3.70336,-6.2408 c 0.54865,-0.82296 1.02876,-1.50874 1.50874,-2.19455 0.4801,-0.68581 1.23447,-1.50873 2.126,-2.19454 l 1.9203,-1.44017 7.26936,-5.41772 c 0.27436,-0.3429 0.54862,-0.75437 0.61727,-1.23445 l 2.05736,-8.9153 0.41146,-1.57734 0.96017,-2.3317 1.02864,-1.78306 0.82301,-0.82297 c 1.09728,2.12599 2.53746,4.11483 4.11482,5.82941 0.96008,1.0287 1.85164,1.92023 2.74317,2.81175 1.09728,1.16585 2.05736,2.40031 2.81173,3.84056 1.50874,2.88035 2.60602,6.10367 3.22338,9.3267 0.34281,1.78307 0.61717,3.566 0.96008,5.3493 0.0686,0.6858 0.1372,1.50874 0.1372,2.3317 0,0.82297 -0.0685,1.6459 -0.20583,2.46888 -0.0685,0.54863 -0.27427,1.02868 -0.61718,1.44016 -0.34291,0.4115 -0.68581,0.89154 -0.96008,1.37161 -0.20571,0.34289 -0.27436,0.75437 -0.34291,1.23445 l -0.0686,1.30301 -1.303,1.37161 -1.37154,1.23442 c -0.4801,0.6858 -0.75437,1.3716 -0.89154,2.12598 l -0.2744,1.57733 h 11.65857 l 1.09728,-1.85165 c 0.27435,-0.4115 0.3429,-0.89154 0.3429,-1.37161 0,-0.20574 0,-0.48005 -0.0685,-0.68581 -0.0686,-0.4115 -0.27426,-0.89153 -0.54862,-1.30301 -0.1372,-0.27432 -0.2744,-0.61721 -0.41146,-0.96013 -0.1372,-0.41148 -0.20575,-0.82295 -0.27436,-1.23441 0,-0.27432 0.0685,-0.54864 0.20572,-0.75437 0.20571,-0.27432 0.4801,-0.4115 0.75437,-0.48005 l 1.30308,-0.27432 c 0.20575,0 0.34281,-0.13716 0.48001,-0.27432 0.27436,-0.34289 0.41143,-0.75437 0.41143,-1.16585 0,-0.27431 -0.0685,-0.54865 -0.13707,-0.75437 -0.1372,-0.27431 -0.20571,-0.54865 -0.27436,-0.82296 -0.34291,-2.53747 -0.82292,-5.2806 -1.37154,-7.9554 l -0.41155,-2.26314 -0.75437,-5.62356 c -0.1372,-0.75437 -0.34291,-1.6459 -0.41146,-2.53747 -0.1372,-0.96013 -0.1372,-1.85165 0.0685,-2.74318 0.34281,-1.6459 0.61717,-3.36045 0.8229,-5.07503 0.20574,-1.57734 0.41155,-3.0862 0.6173,-4.59493 0.0685,-0.41148 0.0685,-0.82297 0.0685,-1.30302 v -1.09728 c -0.13716,-1.16586 -0.54871,-2.26314 -1.1659,-3.15461 -0.27426,-0.48005 -0.54865,-0.96013 -0.75437,-1.50874 l -0.75436,-2.19455 c -0.0686,-0.27431 -0.20572,-0.48004 -0.27427,-0.6858 -0.4801,-1.57733 -0.82301,-3.1546 -0.89153,-4.73206 z\" style=\"stroke-width:0.2949\"/>\n  </g>";
            }
        },
        ELEPHANT("05", "Elephant", LandEquipmentEntity.PACK_ANIMALS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(1.08,0,0,1.08,-24.21172,-28.54365)\">\n    <path d=\"m 226.56215,433.71697 c 0.2875,-3.41454 1.38942,-5.20648 1.40163,-13.60382 0.0348,-16.28148 -2.3109,-33.25523 1.33406,-23.2693 1.49755,4.1263 2.59524,3.8032 2.62995,9.2656 0.0786,10.01489 1.567,20.0803 -7.00613,48.26375 -0.1025,1.15522 9.82365,1.11464 12.9634,-0.0982 0.56853,-0.53704 0.62657,-0.8412 0.36984,-1.80503 -1.41988,-5.36109 -0.7675,-4.89802 1.33444,-15.62841 2.42086,-12.2291 1.85197,-8.29683 6.50737,3.385 1.14766,2.87838 2.5134,6.08506 2.70557,11.59754 0.031,0.8778 -0.22429,1.4972 0.7188,1.61585 5.7317,0.72001 18.5754,1.28077 15.2165,-3.47338 -1.27628,-1.80253 -7.44079,-5.24511 -9.90892,-22.7298 -2.30044,-16.26087 2.32044,-13.50393 4.40239,-15.11393 1.39972,-1.08072 1.52763,-4.4461 3.97461,-5.39112 3.39209,-1.23872 6.10604,1.31656 15.25136,-2.47571 3.47908,-1.35666 7.84345,-3.37137 14.5986,-5.83675 7.66428,-0.44506 6.68549,-1.22945 6.21374,2.69356 -2.30537,19.74027 2.31437,9.2583 -0.68253,31.6694 -2.12702,16.45302 -2.4817,13.79849 -4.8064,18.87918 -0.2464,0.54594 7.01994,3.10628 14.69998,1.45804 2.48449,-0.51942 3.38959,-0.33607 -0.55675,-5.54526 -2.6083,-3.42835 -2.46874,-1.0409 5.88984,-24.48175 0.95527,-2.68213 0.68572,-3.51828 3.55853,1.07286 10.34553,16.9044 9.25445,29.75383 9.0182,29.04758 0.23648,0.68665 9.71836,4.2574 16.37732,-2.03517 1.06245,-1.0161 0.9537,-0.6614 0.17854,-1.82639 -6.4477,-9.78067 -6.61732,-5.50978 -6.79157,-12.2237 -0.2766,-10.72592 -6.19772,-18.1361 -8.32988,-27.2447 -3.39835,-14.25952 -3.82108,-13.48433 -3.29849,-19.2354 0.54324,-6.32591 1.6114,-7.43775 10.14938,-6.09367 4.5307,0.82928 9.51928,-0.0805 9.92044,-0.46657 0.2891,-0.2813 0.28103,-4.77772 0.28621,-5.19451 3.94042,0.16794 5.46303,2.34724 11.18674,4.6086 3.56033,1.40786 7.79388,2.41556 11.1834,21.409 3.0224,16.90496 5.42836,40.26166 3.59387,48.40327 -0.57683,2.5699 -0.64799,2.8289 -0.031,2.9443 0.3504,0.0662 4.22612,-0.41385 4.16024,-0.80814 -0.20522,-1.16407 -0.094,-2.91232 0.58347,-9.85028 5.45227,-55.79834 -4.7869,-53.85342 4.50084,-54.20871 2.84644,-0.10953 3.85629,-0.3184 4.76034,-0.98477 1.86983,-1.37593 0.51243,-1.37717 -2.3742,-2.13601 -7.36628,-1.9594 -6.91183,-2.09854 -8.14139,-7.02252 -12.11633,-47.96367 -27.58718,-37.82235 -39.9031,-44.2328 -15.09119,-7.69283 -19.97134,-3.37271 -32.26246,0.43536 -23.36633,7.35156 -30.9487,-0.143 -48.57594,2.33062 -42.97124,6.1086 -25.17565,60.00942 -27.55167,82.86514 -0.75648,7.36187 0.25935,14.67208 0.5507,11.0711 z\" style=\"stroke-width:0.33647\"/>\n  </g>";
            }
        },
        MISSILE_TRANSLOADER("01", "Transloader", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256,336c-58,0-58,93,0,93h100c58,0,58-93,0-93H256z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"226\" cy=\"446\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"386\" cy=\"446\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"404\" y1=\"429\" y2=\"429\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256\" x2=\"356\" y1=\"311\" y2=\"311\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"311\" y2=\"336\"/>\n      <text font-family=\"sans-serif\" font-size=\"64\" transform=\"matrix(1 0 0 1 238.4531 406)\">MSL</text>\n    </g>\n  </g>";
            }
        },
        MISSILE_TRANSPORTER("02", "Transporter", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256,334c-58,0-58,93,0,93h100c58,0,58-93,0-93H256z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"226\" cy=\"444\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"386\" cy=\"444\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"404\" y1=\"427\" y2=\"427\"/>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"64\" transform=\"matrix(1 0 0 1 238.4531 404)\">MSL</text>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"206\" x2=\"406\" y1=\"349\" y2=\"349\"/>\n    </g>\n  </g>";
            }
        },
        MISSILE_CRANE_LOADING_DEVICE("03", "Crane/Loading Device", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M255,336c-58,0-58,93,0,93h100c58,0,58-93,0-93H255z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"225\" cy=\"446\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"385\" cy=\"446\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"207\" x2=\"403\" y1=\"429\" y2=\"429\"/>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"64\" transform=\"matrix(1 0 0 1 237.4531 406)\">MSL</text>\n      <path d=\"M261.627,336.48L305,284.672v33.133h13.855v-12.048\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MISSILE_PROPELLANT_TRANSPORTER("04", "Propellant Transporter", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256,334c-58,0-58,93,0,93h100c58,0,58-93,0-93H256z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"226\" cy=\"444\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"386\" cy=\"444\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"208\" x2=\"404\" y1=\"427\" y2=\"427\"/>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"50\" transform=\"matrix(1 0 0 1 228.229 399)\">MSL</text>\n      <polygon fill=\"none\" points=\"336,359 376,359 356,384\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"356\" x2=\"356\" y1=\"384\" y2=\"404\"/>\n    </g>\n  </g>";
            }
        },
        MISSILE_WARHEAD_TRANSPORTER("05", "Warhead Transporter", LandEquipmentEntity.MISSILE_SUPPORT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M254,334c-58,0-58,93,0,93h100c58,0,58-93,0-93H254z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"224\" cy=\"444\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"384\" cy=\"444\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"206\" x2=\"402\" y1=\"427\" y2=\"427\"/>\n    <g>\n      <text font-family=\"sans-serif\" font-size=\"48\" transform=\"matrix(1 0 0 1 253.3398 377)\">MSL</text>\n      <text font-family=\"sans-serif\" font-size=\"48\" transform=\"matrix(1 0 0 1 246.6836 417)\">WHD</text>\n    </g>\n  </g>";
            }
        },
        DOG("01", "Dog", LandEquipmentEntity.WORKING_ANIMALS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.12,0,0,0.12,254.21489,337.09745)\">\n    <g fill=\"#000000\" stroke=\"none\" transform=\"matrix(0.13333,0,0,-0.13333,-546.50648,1019.8769)\">\n      <path d=\"m 10985,9233 c -56,-115 -145,-307 -192,-413 -15,-32 -192,-240 -341,-400 -137,-146 -313,-313 -429,-405 -74,-59 -88,-77 -154,-187 -40,-68 -98,-162 -130,-210 -80,-119 -284,-361 -365,-432 -85,-76 -150,-164 -170,-231 -8,-29 -21,-59 -29,-65 -8,-7 -36,-42 -62,-79 -120,-172 -162,-212 -233,-226 -49,-10 -127,-50 -177,-92 -24,-19 -43,-32 -43,-28 0,3 -13,-1 -29,-10 -64,-33 -213,-66 -424,-95 -224,-30 -339,-54 -393,-82 -16,-8 -67,-36 -114,-61 -145,-78 -289,-117 -595,-162 -344,-50 -526,-94 -733,-176 -42,-17 -151,-53 -242,-79 -193,-57 -311,-99 -470,-168 -170,-74 -270,-107 -499,-163 -214,-53 -260,-72 -473,-190 -48,-27 -143,-77 -210,-111 -68,-34 -154,-81 -192,-105 -83,-53 -243,-207 -339,-325 -39,-49 -74,-88 -79,-88 -19,0 -192,-210 -220,-268 -49,-99 -123,-158 -583,-463 -115,-77 -267,-179 -337,-227 C 2470,3515 2141,3346 1735,3182 1510,3092 937,2882 635,2780 525,2743 389,2692 333,2667 221,2618 84,2531 32,2477 l -34,-35 59,-17 c 32,-9 176,-55 321,-101 425,-136 498,-152 805,-175 816,-60 1528,198 2337,846 184,147 204,167 288,278 64,83 232,270 238,264 2,-2 45,-138 95,-303 153,-507 182,-643 161,-756 -15,-84 -74,-200 -166,-328 -42,-58 -97,-145 -123,-195 -47,-88 -48,-92 -48,-180 0,-83 3,-96 36,-166 20,-42 68,-123 107,-180 79,-119 90,-139 206,-382 56,-117 100,-194 129,-228 24,-27 83,-115 132,-196 48,-80 110,-172 137,-204 41,-50 56,-60 105,-74 81,-23 134,-65 253,-200 56,-64 114,-121 129,-127 61,-23 163,-21 311,6 80,15 177,31 217,35 87,10 122,33 155,99 32,65 38,229 11,317 -18,58 -20,60 -68,77 -28,9 -95,21 -150,27 -199,23 -200,23 -392,160 -146,105 -209,167 -224,224 -16,61 -53,130 -125,233 -76,110 -103,168 -111,245 l -6,59 44,44 c 49,49 82,61 211,77 114,13 182,34 220,67 18,16 80,62 138,104 112,80 317,264 436,389 155,165 331,409 410,569 214,436 216,440 243,448 14,4 71,7 126,6 104,-1 139,-8 345,-70 106,-33 195,-54 372,-89 215,-43 633,-78 954,-78 l 261,-1 13,-280 c 8,-155 15,-365 16,-469 2,-103 7,-219 13,-257 6,-38 11,-120 11,-184 0,-116 16,-226 44,-304 12,-34 16,-82 15,-210 -2,-163 -1,-169 29,-250 17,-48 65,-139 111,-211 98,-155 125,-214 145,-311 29,-138 87,-220 155,-220 13,0 49,-12 79,-26 85,-40 218,-64 357,-65 179,0 294,29 371,95 21,18 51,36 66,40 38,9 68,44 68,78 0,31 -30,97 -52,115 -21,17 -314,162 -373,184 -85,32 -135,99 -150,203 -5,28 -21,70 -37,95 -49,78 -70,161 -75,306 -6,153 8,264 72,597 25,124 51,284 59,355 8,71 33,199 56,288 23,88 56,221 75,295 37,146 67,238 110,340 24,58 50,88 224,265 108,110 237,247 286,305 49,58 175,193 280,300 251,258 267,290 326,627 17,101 39,194 54,226 13,30 52,142 86,248 79,248 126,362 194,474 61,102 66,113 99,233 50,179 59,253 52,442 l -6,175 28,60 c 16,33 50,93 75,133 l 47,72 h 74 c 41,0 101,6 133,14 32,8 135,17 228,21 232,9 293,19 378,60 40,19 79,38 87,43 8,5 54,28 102,52 101,50 121,69 218,209 83,120 93,155 61,218 -24,48 -74,90 -156,131 -33,16 -96,50 -140,76 -96,56 -209,100 -308,122 -148,33 -191,57 -249,142 -17,25 -44,77 -58,115 -38,97 -75,144 -182,232 -51,43 -126,113 -167,157 -80,86 -164,150 -253,194 l -56,27 -11,76 c -6,42 -18,150 -26,241 -16,194 -50,421 -66,453 -15,28 -40,57 -49,57 -5,0 -38,-62 -75,-137 z\"/>\n    </g>\n  </g>";
            }
        },
        PIGEON("02", "Pigeon", LandEquipmentEntity.WORKING_ANIMALS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 299.13818,457.74748 c -0.558,-0.032 -1.54641,-0.1034 -2.19647,-0.15875 -0.65005,-0.0552 -1.22386,-0.10055 -1.27512,-0.10055 -0.0513,0 0.20077,-0.29776 0.56008,-0.66168 l 0.65332,-0.66168 -1.30908,0.0422 c -0.72001,0.0231 -2.58889,0.0844 -4.15308,0.13593 -1.5642,0.0516 -2.85636,0.0814 -2.87148,0.0663 -0.0639,-0.0641 0.91761,-1.2367 1.62205,-1.93777 0.98734,-0.98259 1.24989,-1.1179 2.5225,-1.2998 1.62514,-0.2323 3.07102,-0.27982 7.10182,-0.23344 3.95982,0.0456 4.20379,0.0332 4.7759,-0.24181 1.4441,-0.69418 2.27092,-3.30108 2.04434,-6.44572 -0.1249,-1.73271 -0.4661,-3.35691 -0.89135,-4.24237 -1.09335,-2.27656 -7.57997,-7.32981 -12.71689,-9.9068 -1.57247,-0.78885 -3.15762,-1.38735 -4.4047,-1.66311 -0.8433,-0.18646 -2.44686,-0.19916 -3.07638,-0.0243 -1.29888,0.36068 -2.06036,1.06815 -3.532,3.28153 -1.23909,1.86363 -1.6889,2.43204 -2.67352,3.37846 -1.81671,1.74623 -3.52539,2.63081 -5.85918,3.03333 -1.18756,0.20482 -2.90874,0.25719 -5.76803,0.17547 -1.47799,-0.0422 -3.40154,-0.0763 -4.27454,-0.0756 -1.814,0.001 -1.7207,-0.0384 -1.38575,0.59001 0.39766,0.74608 1.46856,1.96375 4.05852,4.61476 2.53797,2.59778 2.57054,2.63779 2.3185,2.84697 -0.0538,0.0446 -0.3136,0.11225 -0.57733,0.15027 l -0.4795,0.0691 -0.154,0.77412 c -0.0848,0.42575 -0.17099,0.77278 -0.19177,0.77116 -0.0208,-10e-4 -0.31196,-0.351 -0.64708,-0.77636 l -0.60932,-0.77342 -0.515,-0.0352 c -0.31001,-0.0212 -0.58854,-0.0793 -0.69977,-0.14594 -0.10348,-0.0619 -0.48072,-0.55305 -0.8574,-1.11614 -0.94508,-1.41275 -1.699,-2.36766 -2.53464,-3.21035 -1.0721,-1.08116 -1.02356,-1.06107 -2.7791,-1.14965 -1.65746,-0.0837 -4.07813,-0.0122 -7.03908,0.2067 -4.41971,0.32725 -5.44277,0.39748 -6.54546,0.44939 -0.648,0.0305 -1.24325,0.0314 -1.32278,10e-4 -0.1582,-0.0585 -0.34934,-0.38959 -0.48272,-0.836 l -0.0855,-0.28629 -0.7563,0.0425 c -0.41596,0.0234 -1.07367,0.0607 -1.46157,0.083 l -0.70528,0.0405 0.45882,-0.81123 c 0.25235,-0.44618 0.45925,-0.85542 0.45977,-0.90942 0.001,-0.15965 -0.36158,-0.87327 -0.51284,-1.00785 -0.1888,-0.16799 -1.04005,-0.40675 -2.04823,-0.57447 l -0.832,-0.13842 0.17523,-0.22442 c 0.27457,-0.3516 1.11551,-1.0021 1.57271,-1.21655 0.40926,-0.19195 0.4279,-0.19435 1.2109,-0.15635 0.50314,0.0244 1.08378,0.10436 1.58072,0.21755 0.5336,0.1215 0.94286,0.17547 1.27636,0.16808 0.27,-0.005 1.0892,0.0342 1.82045,0.089 0.73125,0.055 1.5118,0.0807 1.73455,0.0573 0.22275,-0.0234 0.90573,-0.17093 1.51773,-0.32775 2.62768,-0.67338 6.8902,-1.31377 11.71636,-1.76024 1.56586,-0.14485 4.27044,-0.35221 5.25284,-0.40272 0.6165,-0.0317 0.88925,-0.0709 0.94294,-0.13565 0.12885,-0.15518 0.0849,-2.74777 -0.0684,-4.04572 -0.3827,-3.23912 -1.3314,-6.47337 -2.78395,-9.49092 -0.65066,-1.3517 -1.22108,-2.34271 -2.1663,-3.76363 -1.71837,-2.58319 -3.50991,-4.58054 -6.35238,-7.08212 -2.25914,-1.98821 -4.1585,-4.5077 -6.04288,-8.0158 -3.76382,-7.00701 -6.928,-18.01093 -8.71133,-30.29482 -0.14633,-1.008 -0.36035,-2.39236 -0.4756,-3.07636 -0.18785,-1.11493 -0.20941,-1.37913 -0.20832,-2.55273 0.001,-1.45189 0.0361,-1.70645 0.51908,-3.79636 0.48731,-2.10887 0.63699,-3.61209 0.49675,-4.98892 -0.23463,-2.30344 -1.11572,-3.80593 -2.66323,-4.54148 -0.69219,-0.329 -1.20158,-0.44795 -2.123,-0.4957 -1.71245,-0.0887 -3.08095,0.25189 -6.21608,1.54732 -1.0511,0.4343 -1.38702,0.51045 -1.60934,0.36479 -0.70685,-0.46315 -0.50152,-1.48248 0.63336,-3.1442 0.94476,-1.38335 2.94634,-3.58085 4.87037,-5.34708 l 0.91636,-0.84123 0.009,-1.38947 c 0.0126,-2.0191 0.26452,-3.55059 0.81044,-4.92736 0.96397,-2.4311 2.81166,-4.12861 5.26814,-4.83994 1.20753,-0.34965 1.96431,-0.44366 3.6,-0.44716 2.06795,-0.004 3.55043,0.20195 6.02182,0.83826 2.16091,0.5564 4.93207,1.50651 5.7916,1.98571 2.19987,1.22648 4.4175,3.98344 7.89193,9.81122 3.51096,5.88907 4.26853,7.09562 5.45733,8.6916 1.63165,2.19053 2.4157,2.9128 5.0446,4.6471 5.47699,3.61321 12.28468,7.1364 24.1495,12.49814 1.94118,0.87722 3.80376,1.75651 4.13905,1.95397 1.59975,0.94209 2.98008,2.06161 7.31872,5.93588 2.69887,2.41 3.91608,3.47247 5.33454,4.65634 1.09357,0.91268 0.94114,0.8162 7.2982,4.61887 8.91154,5.33069 13.09327,7.93248 16.92475,10.5302 1.90403,1.29091 2.18667,1.42698 3.87086,1.86335 1.98616,0.51461 2.1076,0.5741 4.13924,2.0274 2.51684,1.80037 3.4721,2.35909 5.79607,3.39007 4.9739,2.20657 12.00494,5.56505 16.26544,7.76945 3.90271,2.01926 5.39336,2.87967 6.30693,3.64031 1.2058,1.00398 3.41019,3.39762 4.43865,4.8197 0.29245,0.4044 0.38522,0.58496 0.3697,0.71958 -0.0231,0.20088 -0.14334,0.25392 -1.2971,0.5725 -0.34199,0.0944 -0.64674,0.19648 -0.6772,0.22674 -0.0672,0.0667 0.36502,0.16374 1.4954,0.33586 1.09059,0.16605 1.37888,0.30414 2.0064,0.96105 0.55809,0.5842 1.027,1.26875 1.69181,2.46986 0.25904,0.46798 0.5432,0.96296 0.63148,1.0999 0.19373,0.30055 0.15935,0.4579 -0.1264,0.57849 -0.34869,0.14717 -3.76363,0.1011 -7.77054,-0.10463 -2.45616,-0.12613 -3.89272,-0.17076 -4.81092,-0.14933 -0.91293,0.0213 -1.49634,0.004 -1.92783,-0.0592 -0.78103,-0.1132 -2.37879,-0.52686 -4.51943,-1.17002 -2.87118,-0.86264 -3.51029,-1.00612 -4.9729,-1.11638 -2.39237,-0.18038 -11.40237,-1.17393 -18.5737,-2.04817 l -0.93902,-0.11443 -1.12947,0.8546 c -3.676,2.78143 -6.58554,4.40135 -8.42183,4.68895 -0.6608,0.10354 -2.12883,0.0389 -3.0758,-0.13538 -1.43931,-0.26484 -2.14908,-0.46492 -5.495,-1.54898 -3.58113,-1.1603 -4.49942,-1.36178 -5.5285,-1.21299 -1.54708,0.22368 -3.47002,1.30224 -5.40068,3.02917 l -0.40941,0.3662 -0.13511,7.83497 c -0.0804,4.66315 -0.11116,7.85618 -0.0759,7.88735 0.0325,0.0288 1.56832,0.59447 3.41281,1.257 l 3.35364,1.20462 10e-4,1.32932 c 3.6e-4,0.73112 -0.0212,1.31618 -0.0482,1.30012 -0.0271,-0.0161 -0.32561,-0.19635 -0.66356,-0.40066 -0.33797,-0.20432 -0.63596,-0.34755 -0.66223,-0.3183 -0.0263,0.0293 -0.0997,0.38453 -0.16344,0.78953 -0.0637,0.405 -0.13375,0.73582 -0.15596,0.73515 -0.0222,-7.2e-4 -0.36426,-0.19434 -0.76026,-0.43039 -1.39098,-0.82913 -2.83764,-1.46657 -3.32835,-1.46657 -0.20996,0 -0.22782,0.0175 -0.29719,0.29305 -0.11756,0.46703 -0.2014,1.73393 -0.2025,3.06149 -7.2e-4,0.86952 -0.0226,1.22727 -0.0751,1.22727 -0.0407,0 -0.71912,-0.17673 -1.50747,-0.39273 -0.78835,-0.216 -1.47484,-0.39272 -1.52555,-0.39272 -0.0508,0 -0.31775,0.16183 -0.59344,0.35963 -0.57783,0.41458 -1.98345,1.11931 -2.74669,1.37709 -0.28801,0.0973 -0.75927,0.2177 -1.04728,0.26764 -0.66197,0.1147 -3.57058,0.16632 -4.94182,0.0876 z M 240.89022,345.03393 c 0.48142,-0.24559 0.77979,-0.7522 0.77742,-1.31999 -0.004,-0.9998 -0.94957,-1.70178 -1.906,-1.41523 -0.33878,0.1015 -0.7661,0.47719 -0.91456,0.80402 -0.14277,0.31434 -0.15954,0.87082 -0.0352,1.16757 0.34281,0.81807 1.28968,1.16597 2.07833,0.76363 z m -1.14522,-0.26097 c -0.41705,-0.12477 -0.76053,-0.61921 -0.75848,-1.09174 0.003,-0.55108 0.54096,-1.06574 1.11523,-1.06574 0.36806,0 0.78235,0.25351 0.95842,0.58647 0.47142,0.89146 -0.34142,1.8624 -1.31517,1.57101 z\" style=\"fill:#000000;stroke-width:1.36063\"/>\n  </g>";
            }
        },
        ANTENNAE("01", "Antennae", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"285.5\" y2=\"502.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"352.75\" x2=\"306\" y1=\"296.836\" y2=\"325.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"259.25\" y1=\"325.5\" y2=\"296.836\"/>\n    </g>\n  </g>";
            }
        },
        BOMB("02", "Bomb", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.98\">\n    <text font-family=\"sans-serif\" font-size=\"76\" transform=\"matrix(1 0 0 1 189.9658 424.6055)\">BOMB</text>\n  </g>";
            }
        },
        BOOBY_TRAP("03", "Booby Trap", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"447\" fill=\"none\" rx=\"90\" ry=\"45\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"216,442 306,302 396,442\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CBRN_EQUIPMENT("04", "CBRN Equipment", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"219.487\" cy=\"372.174\" rx=\"20.074\" ry=\"20.074\"/>\n    <ellipse cx=\"390.676\" cy=\"371.059\" rx=\"20.074\" ry=\"20.074\"/>\n    <path d=\"M228.409,359.645c75.835,23.585,88.476,37.062,120.074,97.708\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M380.081,359.645c-75.836,23.585-88.475,37.062-120.074,97.708\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        COMPUTER_SYSTEM("05", "Computer System", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"none\" height=\"123.75\" stroke=\"#000000\" stroke-width=\"5\" width=\"151\" x=\"229.5\" y=\"315.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"437.25\" y2=\"479.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"248.5\" x2=\"363.5\" y1=\"479.5\" y2=\"479.5\"/>\n  </g>";
            }
        },
        COMMAND_LAUNCH_EQUIPMENT_CLE("06", "Command Launch Equipment (CLE)", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 203 429.6719)\">CLE</text>\n  </g>";
            }
        },
        GENERATOR_SET("07", "Generator Set", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"128\" transform=\"matrix(1 0 0 1 255 439.25)\">G</text>\n  </g>";
            }
        },
        GMD_GFC_CENTER("08", "Ground-based Midcourse Defense (GMD) Fire Control (GFC) Center", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"96\" transform=\"matrix(1 0 0 1 203 429.6719)\">GFC</text>\n  </g>";
            }
        },
        IFICS_IDT("09", "In-Flight Interceptor Communications System (IFICS) Data Terminal (IDT)", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M262.333,356.305c0,39.509,1.315,80.195,80.333,80.195\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"279.401,419.52 279.401,443.225 291.255,443.225 291.255,427.422\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"261.228\" x2=\"328.393\" y1=\"380.011\" y2=\"354.725\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"328.393\" x2=\"327.207\" y1=\"433.742\" y2=\"354.725\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"259.647\" x2=\"350.518\" y1=\"356.305\" y2=\"350.774\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"348.5\" x2=\"341.036\" y1=\"350.774\" y2=\"438.484\"/>\n  </g>";
            }
        },
        LASER("10", "Laser", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(170 108) scale(5 5)\">\n      <path d=\"M28.924,69.115c-0.766-0.161-1.533-0.294-2.299-0.403v-8.624c-0.578-0.108-2.141-0.349-4.688-0.725l-0.506-1.129 l7.055-1.614l-6.848-1.449l0.01-1.267l7.271-1.777c-0.67-0.108-1.436-0.214-2.295-0.322v-13.25 c-0.96,0.646-2.235,1.534-3.821,2.665L21,40.731l6.191-4.081l6.049,4.081l-1.744,0.572L27.5,38.475v12.007l5.125,0.966 l-0.006,1.21l-7.318,1.646l7.324,1.703v1.205l-6.873,1.365c0.484,0.055,1.068,0.136,1.748,0.241v8.599l5.137,1.026l-0.012,1.295 l-7.012,1.519l7.008,1.495l0.004,1.188l-7.16,1.696l6.84,1.433l-0.072,0.956l-10.585-1.822l-0.004-1.238l7.264-1.578l-7.26-1.547 l0.01-1.152L28.924,69.115z\"/>\n    </g>\n  </g>";
            }
        },
        PSYCHOLOGICAL_OPERATIONS("11", "Psychological Operations (PSYOPS)", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"345.907,446 317.047,428.334 250.5,428.334 250.016,366.666 319.84,366.666 345.907,346\" stroke=\"#000000\" stroke-width=\"5\" style=\"fill:#000000;fill-opacity:1\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"379.5\" x2=\"346.296\" y1=\"366.666\" y2=\"366.666\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"379.5\" x2=\"346.296\" y1=\"428.334\" y2=\"428.334\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"379.5\" x2=\"346.296\" y1=\"387.222\" y2=\"387.222\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"379.5\" x2=\"346.296\" y1=\"407.777\" y2=\"407.777\"/>\n  </g>";
            }
        },
        SUSTAINMENT_SHIPMENTS("12", "Sustainment Shipments", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 197 423.6367)\">SUST</text>\n  </g>";
            }
        },
        TENT("13", "Tent", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.NA),
        UNIT_DEPLOYMENT_SHIPMENTS("14", "Unit Deployment Shipments", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 197 423.6367)\">DPLY</text>\n  </g>";
            }
        },
        EMERGENCY_MEDICAL_OPERATION("15", "Emergency Medical Operation", LandEquipmentEntity.OTHER_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(76.8932,74.97087)\">\n    <polygon points=\"144.8,339.8 167.5,379.4 206.1,357.2 206.2,401.4 251.8,401.4 251.8,357.4 290.4,379.5 313.5,340.2 275.3,317.4 313.7,295 290.5,255.4 251.9,277.6 251.8,232.9 206.2,232.9 206.2,277.4 167.6,255.4 144.9,295 183,317.3\"/>\n  </g>";
            }
        },
        LAND_MINE("01", "Land Mine", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"306\" cy=\"396\" fill=\"none\" r=\"84.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ANTIPERSONNEL_LAND_MINE_APL("02", "Antipersonnel Land Mine (APL)", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"306\" cy=\"396\" r=\"84.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"220\" x2=\"246.676\" y1=\"309.5\" y2=\"336.176\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"390.5\" x2=\"364.57\" y1=\"309.5\" y2=\"335.429\"/>\n  </g>";
            }
        },
        ANTITANK_MINE("03", "Antitank Mine", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"306\" cy=\"396\" r=\"84.25\"/>\n  </g>";
            }
        },
        IMPROVISED_EXPLOSIVES_DEVICE_IED("04", "Improvised Explosives Device (IED)", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"128\" transform=\"matrix(1 0 0 1 204 444.25)\">IED</text>\n  </g>";
            }
        },
        LESS_THAN_LETHAL("05", "Less than lethal", LandEquipmentEntity.LAND_MINES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"306\" cy=\"404\" fill=\"none\" r=\"84.25\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"220\" x2=\"246.676\" y1=\"317.5\" y2=\"344.176\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"390.5\" x2=\"364.57\" y1=\"317.5\" y2=\"343.429\"/>\n  </g>";
            }
        },
        SENSOR("01", "Sensor", LandEquipmentEntity.SENSORS, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(110 111) scale(5 5)\">\n      <path d=\"M48.879,57.116c-0.129-0.025-0.659,0.182-1.589,0.619c-0.595,0.258-1.28,0.658-2.054,1.2 c-2.843,1.883-4.845,4.424-6.008,7.621c-0.053,0-0.129-0.064-0.233-0.193c-0.439-1.392-1.228-2.786-2.365-4.179 c-1.189-1.495-2.558-2.734-4.108-3.713c-0.725-0.464-1.719-0.928-2.985-1.392c-0.021-0.052-0.021-0.091,0-0.117 c0.335-0.154,0.788-0.348,1.357-0.58c1.472-0.49,3.042-1.612,4.709-3.366c1.667-1.754,2.758-3.403,3.275-4.951 c0.078-0.206,0.193-0.413,0.349-0.62c0.49,1.522,1.421,3.108,2.791,4.759c1.447,1.779,2.932,3.043,4.457,3.79 c0.336,0.156,0.879,0.401,1.629,0.735C48.335,56.755,48.593,56.884,48.879,57.116z\"/>\n    </g>\n  </g>";
            }
        },
        SENSOR_EMPLACED("02", "Sensor Emplaced", LandEquipmentEntity.SENSORS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(110 111) scale(5 5)\">\n      <path d=\"M48.879,57.116c-0.129-0.025-0.659,0.182-1.589,0.619c-0.595,0.258-1.28,0.658-2.054,1.2 c-2.843,1.883-4.845,4.424-6.008,7.621c-0.053,0-0.129-0.064-0.233-0.193c-0.439-1.392-1.228-2.786-2.365-4.179 c-1.189-1.495-2.558-2.734-4.108-3.713c-0.725-0.464-1.719-0.928-2.985-1.392c-0.021-0.052-0.021-0.091,0-0.117 c0.335-0.154,0.788-0.348,1.357-0.58c1.472-0.49,3.042-1.612,4.709-3.366c1.667-1.754,2.758-3.403,3.275-4.951 c0.078-0.206,0.193-0.413,0.349-0.62c0.49,1.522,1.421,3.108,2.791,4.759c1.447,1.779,2.932,3.043,4.457,3.79 c0.336,0.156,0.879,0.401,1.629,0.735C48.335,56.755,48.593,56.884,48.879,57.116z\"/>\n    </g>\n    <polyline fill=\"none\" points=\"233.75,332.5 257.606,310.75 282.5,332.5 306.125,310.75 330.75,332.5 355.75,310.75 378.5,332.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RADAR("03", "Radar", LandEquipmentEntity.SENSORS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M323.053,441.079c-44.975,0-92.593-36.461-92.593-81.434\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"234.778,385.878 313.982,352.038 313.988,404.285 391.5,364.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        FIRE_FIGHTING_FIRE_PROTECTION("02", "Fire Fighting/Fire Protection", LandEquipmentEntity.EMERGENCY_OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"396\" rx=\"40.021\" ry=\"40.021\" stroke=\"#000000\"/>\n    <polyline points=\"275.214,346.743 336.785,346.743 306,396 336.785,445.258 275.214,445.258 306,396\" stroke=\"#000000\"/>\n    <polyline points=\"256.743,365.214 256.743,426.785 306,396 355.258,426.785 355.258,365.214 306,396\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        HORSE_DRAWN_VEHICLE("01", "Horse-Drawn Vehicle", LandEquipmentEntity.HARNESS_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <g transform=\"matrix(0.6,0,0,0.6,78.4,190.25)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"226\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386\" x2=\"386\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"505\" y2=\"505\"/>\n      <path d=\"m 226,370.25 c 70,26 90,26 160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <g>\n        <ellipse cx=\"236\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <ellipse cx=\"376\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      </g>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"309.75481\" x2=\"373.05769\" y1=\"464.82573\" y2=\"464.82573\"/>\n    <g id=\"main-3\" transform=\"matrix(0.3,0,0,0.375,275.84388,328.17064)\">\n      <path d=\"m 422.36483,454.28218 c -0.96904,2.42261 -1.87751,4.78464 -2.96768,6.96498 -5.08746,9.5087 -15.14125,13.92995 -25.19504,15.80745 v -17.26102 h 7.32837 c 1.39299,-3.57332 4.23954,-6.23818 7.934,-7.38892 1.15073,-0.60565 1.87751,-1.57469 2.11977,-2.84655 0.12114,0 0.12114,0 0.12114,0 0.96903,-7.93402 2.30147,-16.29199 3.93672,-24.77108 0.78734,-2.11978 0.0605,-4.05786 -2.24091,-4.78464 -4.96633,-0.60564 -9.75096,-1.57469 -14.53559,-2.84655 -10.29605,-0.48452 -20.65267,-2.78599 -29.55572,-8.17628 -7.934,4.30012 -10.84114,12.6581 -15.14125,19.98645 v -0.12113 c -10.17491,15.86803 -18.41175,32.82622 -24.77107,50.39006 -0.42395,1.09018 -0.60565,2.24091 -0.60565,3.39165 0,1.81695 0.54508,3.51277 1.39299,4.96633 4.8452,4.96633 7.99458,11.08338 10.47774,17.44272 l -19.13853,0.18168 c -0.12113,-4.60293 -0.54508,-9.02418 -3.2705,-12.90034 -2.4226,-2.11977 -4.30011,-3.93672 -4.6635,-7.32835 0.54508,-4.30012 3.2705,-8.1157 5.08746,-11.99187 v 0 c 2.2409,-4.78464 3.57333,-9.8721 4.23954,-15.02011 0.72678,-4.42125 1.93808,-8.78193 3.14938,-13.1426 3.57334,-11.9313 5.32972,-24.28656 7.75232,-36.5207 -21.56113,3.4522 -43.4251,1.81696 -64.6834,-2.54372 -2.36203,12.53694 -5.93536,24.64994 -10.47773,36.52068 -1.69582,6.17762 3.08881,12.4764 6.11705,17.44271 6.72272,9.93266 14.29335,19.13854 20.7738,29.2529 3.93673,4.8452 7.20723,10.29605 9.75096,16.1103 l -20.2287,0.30282 -0.60565,-7.38892 c -0.0605,-1.09017 -0.0605,-2.18034 -1.0296,-2.72542 -2.90711,-0.9085 -4.36067,-3.45222 -5.39027,-6.11707 -2.24091,-5.3903 -5.08746,-10.59887 -8.4791,-15.5652 -6.2382,-8.60023 -13.74825,-16.1103 -22.34848,-22.34848 0,0 0,0 -0.12113,-0.12114 -2.2409,-1.45355 -2.66486,-3.81559 -2.66486,-6.23818 0.84791,-4.54238 1.75638,-9.08475 2.54374,-13.6877 0.72677,-8.90304 -3.27052,-17.44272 -10.59888,-22.6513 -3.93672,5.99594 -8.96362,11.02283 -14.5356,15.5652 -6.72271,4.72407 -13.08204,9.99323 -18.95685,15.7469 v 0 c -1.45355,1.45356 -2.84654,2.84656 -4.1184,4.23954 -3.08881,3.9973 -5.2086,8.6608 -6.96497,13.32431 -3.51277,8.9636 -6.0565,17.6244 -7.81288,25.9218 -0.60566,2.72543 0.0606,5.45085 1.39299,7.81288 v 0 c 3.14938,4.11843 5.6931,8.6608 7.51006,13.6877 l -18.8357,0.1817 -0.12113,-8.4791 c 0.12113,-0.78734 -0.1817,-1.21129 -0.60565,-1.81694 h -0.12113 c -3.27052,-1.63525 -4.48181,-4.54238 -3.99729,-8.05514 5.81424,-14.05108 7.99458,-25.92182 11.44678,-38.51934 v 0 c 1.393,-4.42124 1.69582,-9.20587 1.15074,-13.86938 -0.36339,-2.2409 0.36339,-4.30011 1.69581,-6.11706 2.24091,-2.72542 4.5424,-5.69312 6.90441,-8.6608 4.90577,-6.11707 7.14667,-13.74825 8.60023,-21.25832 2.4226,-11.5679 0.24226,-23.74147 1.45356,-35.7939 1.75638,-9.62984 7.20723,-18.10893 13.3243,-25.49786 -27.6782,3.51277 -24.83164,46.08995 -25.0739,67.77222 0,1.39299 0,2.72542 0,4.23954 l -25.19503,-0.30281 c 1.09017,-38.45877 6.11707,-83.39799 55.1747,-77.64432 11.7496,-3.87616 23.43864,-7.934 35.91503,-8.23684 29.0712,0.24227 51.48024,8.4791 80.36973,5.5114 40.39685,-5.20858 44.93923,-53.90283 88.96997,-54.75074 5.5114,0 11.14395,0.84791 16.4131,2.4226 8.35797,-1.87752 16.9582,-2.36204 25.49786,-1.69582 -4.54236,3.57333 -8.78192,7.0861 -13.02147,10.72 -1.75638,11.20453 -0.42395,22.5302 -0.8479,33.79527 0.12113,3.63389 -0.84792,20.47096 -1.69582,27.98102 0.48451,6.54102 -6.60159,9.8721 -13.3243,9.20588 -3.39164,-0.36339 -3.63391,-2.78599 -8.41854,-3.39165 -3.08881,-1.93808 -1.93807,-5.6931 -2.2409,-8.7819 -0.54508,-7.51007 -4.17898,-14.29334 -5.81424,-21.6217 -2.66486,-1.0296 -5.08746,-2.24091 -7.38892,-3.51277 -5.2086,8.17627 -7.93403,17.56385 -8.05515,27.1331 -0.18169,8.47909 -0.30283,16.9582 -0.30283,25.4373 0,-0.60564 0,-0.18169 -0.12113,0.12114 -0.42395,6.48045 -2.24089,12.71864 -5.26915,18.29062 11.14396,1.87751 21.8034,5.26915 31.9783,10.17491 4.11842,2.30148 9.26644,4.36068 11.99188,8.4791 0.12113,0 0.12113,0 0.12113,0.12113 1.45355,2.30147 1.57468,4.96633 1.0296,7.51005 -3.08882,14.23278 -6.90441,27.25426 -12.113,38.33764 z\" style=\"stroke-width:0.81552\"/>\n    </g>\n  </g>";
            }
        },
        OX_DRAWN_VEHICLE("02", "Ox-Drawn Vehicle", LandEquipmentEntity.HARNESS_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <g transform=\"matrix(0.6,0,0,0.6,78.4,190.25)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"226\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386\" x2=\"386\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"505\" y2=\"505\"/>\n      <path d=\"m 226,370.25 c 70,26 90,26 160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <g>\n        <ellipse cx=\"236\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <ellipse cx=\"376\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      </g>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"309.75481\" x2=\"373.05769\" y1=\"464.82573\" y2=\"464.82573\"/>\n    <g id=\"main-8\" transform=\"matrix(-0.48,0,0,0.6,522.01585,237.7698)\">\n      <path d=\"m 402.24679,403.28319 c -0.1372,-0.6858 -0.1372,-1.44017 -0.0685,-2.12597 v -2.60603 c -0.0686,-0.82296 0,-1.6459 0.1372,-2.46886 0.41146,-2.19455 0.68582,-4.25196 0.82301,-6.37793 0.13707,-1.50875 0.20572,-3.01749 0.27427,-4.52623 l 0.13716,-2.3317 0.41146,-3.22333 0.41146,-4.11482 c 0.0686,-0.27432 0.0686,-0.54864 0.0686,-0.75436 0,-0.27432 0,-0.54865 -0.0686,-0.75438 l -0.41146,-3.97769 c 0.41146,1.85166 0.82301,3.70343 1.02873,5.55485 l 1.02863,6.7209 0.0685,0.89153 0.20572,1.92022 0.1372,1.44018 v 2.19453 l -0.0686,1.92023 0.20574,3.29174 0.20572,4.11483 0.20584,3.0862 -0.0685,5.21217 -0.1372,1.85165 -0.1372,1.6459 -0.34291,2.05738 c 0,0.41148 0.0685,0.89154 0.0685,1.30302 0,0.54864 -0.0685,1.16585 -0.0685,1.78305 v 0.20574 c 0,0.41148 0.0685,0.82298 0.1372,1.16586 0.27436,0.75437 0.41146,1.50874 0.4801,2.33171 0.13707,0.82296 0.20571,1.6459 0.41146,2.46886 0.20571,0.82296 0.34291,1.6459 0.34291,2.53746 l 0.0685,1.7145 c 0,0.34289 0.20575,0.6858 0.48002,0.82297 0.41146,0.27431 0.96017,0.48004 1.5087,0.48004 0.0685,0 0.1372,0.0685 0.20575,0.0685 0.41155,0 0.75437,-0.13716 1.09728,-0.27432 0.68581,-0.20574 1.02872,-0.82295 1.02872,-1.50873 v -3.42888 c 0,-1.50873 -0.1372,-3.01748 -0.41146,-4.5262 -0.20571,-1.23442 -0.20571,-2.53744 -0.0686,-3.84057 0.0686,-0.34288 0.1372,-0.75436 0.27427,-1.16584 0.0686,-0.4115 0.0686,-0.82297 0.0686,-1.30302 0,-0.34288 -0.0686,-0.6858 -0.27427,-0.89153 -0.41155,-0.54865 -0.68582,-1.0287 -0.89153,-1.6459 -0.34291,-0.75437 -0.61721,-1.50874 -0.82301,-2.33171 -0.20575,-0.61721 -0.34282,-1.30301 -0.27427,-1.98881 0.0685,-1.0973 0.0685,-2.19454 0.0685,-3.29174 v -0.0686 c 0,-1.44017 0.1372,-2.88035 0.34282,-4.32037 0.20583,-1.23445 0.3429,-2.53746 0.3429,-3.84056 v -8.641 l 0.1372,-10.97286 -0.1372,-4.8692 c -0.0685,-0.82296 -0.0685,-1.6459 -0.13707,-2.46886 -0.0685,-2.67462 -0.54874,-5.21217 -1.44018,-7.68082 -0.89153,-2.4003 -2.12601,-4.52623 -3.84055,-6.44635 -1.57738,-1.7145 -3.29183,-3.29175 -5.21222,-4.66335 -1.23444,-0.89154 -2.53743,-1.6459 -3.90897,-2.19455 -1.98885,-0.82296 -4.11485,-1.57733 -6.24086,-2.12597 -1.44015,-0.41148 -2.88034,-0.61721 -4.38907,-0.68581 -1.02864,-0.0686 -2.33163,-0.0686 -3.56598,-0.13716 h -1.44018 c -2.05736,0 -4.04608,0.13716 -6.03492,0.48005 -0.96018,0.20574 -1.85161,0.34289 -2.81182,0.48005 -1.37154,0.20574 -2.67454,0.34288 -3.97762,0.48005 -3.22329,0.34289 -6.51512,0.61721 -9.80683,0.82296 -5.76074,0.27432 -12.06989,0.82297 -18.4478,1.44017 -2.67463,0.3429 -4.86918,0.54865 -7.06365,0.68581 -0.54862,0.0685 -1.5087,0.13716 -2.40027,0.20574 -1.02872,0.0685 -1.7831,0.0685 -2.53743,-0.0685 -0.6172,-0.0685 -1.23447,-0.13717 -1.9203,-0.20573 -2.33162,-0.3429 -4.59492,-0.48006 -6.858,-0.48006 -6.035,0 -12.13867,-0.41148 -18.17356,-1.30301 -6.65227,-0.96013 -13.16726,-1.50874 -19.81945,-1.50874 h -0.6173 c -1.71445,0 -3.42877,0 -5.07499,0.13716 -1.7831,0.13715 -3.7034,0.34289 -5.62355,0.54864 -1.71445,0.20574 -3.566,0.34289 -5.48648,0.48005 -2.40027,0.20574 -4.59492,0.27432 -6.78926,0.20574 -1.57735,-0.0685 -3.15464,-0.20574 -4.80054,-0.34289 -1.783,-0.13716 -3.56597,-0.48005 -5.34928,-0.96012 -2.1261,-0.54865 -4.2521,-1.23445 -6.30937,-2.12599 -0.82301,-0.27431 -1.57735,-0.6858 -2.33172,-1.09728 l -1.23447,-0.75437 0.54865,-1.30301 c 0.2058,-0.20574 0.27436,-0.48004 0.27436,-0.82297 v -0.20573 c -0.1372,-0.54865 -0.41146,-0.96013 -0.96008,-1.16586 -0.6173,-0.20573 -1.30312,-0.48004 -2.05746,-0.6858 -0.48001,-0.20574 -1.02863,-0.41148 -1.50873,-0.6172 -0.68582,-0.3429 -1.4402,-0.61721 -2.19456,-0.75438 -0.75437,-0.13716 -1.4402,-0.54864 -1.92016,-1.16585 l -2.74318,-3.36046 c -0.1372,-0.13715 -0.2744,-0.20573 -0.41146,-0.27432 h -0.20584 c -0.20572,0 -0.34279,0.13716 -0.47998,0.3429 -0.0685,0.20573 -0.0685,0.41148 -0.0685,0.6172 0,0.20573 0,0.4115 0.0685,0.54864 l 0.34291,0.82297 0.68572,1.85165 0.82302,2.19455 h -0.0686 c -1.16593,0.0685 -2.19456,0.34289 -3.15464,0.82296 -0.4801,0.27432 -1.23448,0.6858 -1.9203,1.09728 -0.9601,0.48006 -1.50871,0.96013 -1.98872,1.57734 -0.2058,0.20574 -0.41155,0.4115 -0.68582,0.54865 -0.34291,0.20574 -0.75437,0.27432 -1.16592,0.13715 -0.61717,-0.13715 -1.23435,-0.54864 -1.6459,-1.09728 l -3.01744,-3.90898 c -0.20572,-0.20573 -0.41146,-0.34289 -0.68582,-0.34289 -0.0685,-0.0685 -0.1371,-0.0685 -0.1371,-0.0685 -0.27436,0 -0.48007,0.13716 -0.61727,0.34289 -0.13707,0.27432 -0.20571,0.54865 -0.20571,0.82297 0,0.13715 0,0.34289 0.0685,0.54864 l 0.48001,1.0973 0.89153,2.19454 0.68582,1.3716 0.75436,1.0287 0.54866,0.82296 1.1658,1.98882 c 0.0685,0.13716 0.1372,0.27432 0.1372,0.41148 0,0.20574 -0.0685,0.34289 -0.20575,0.48006 -0.48007,0.6172 -1.02872,1.23441 -1.6459,1.85165 -0.4801,0.48004 -1.09727,0.82297 -1.71454,0.96012 -0.75437,0.20574 -1.37154,0.82296 -1.57726,1.57734 -0.20574,0.6858 -0.41146,1.44017 -0.4801,2.12597 -0.1371,1.16585 -0.68582,2.19455 -1.4402,3.01748 -0.61717,0.54865 -1.09728,1.16586 -1.50874,1.85166 -0.68581,1.0287 -1.37154,2.05738 -2.19452,3.01748 -0.61717,0.75437 -1.09728,1.6459 -1.50874,2.46886 -0.41146,1.0287 -0.96008,1.98882 -1.71445,2.74319 l -4.32043,4.66334 c -0.0685,0.34289 -0.1371,0.68581 -0.1371,1.0287 0,0.27432 0,0.48006 0.0685,0.68581 0.1372,0.96012 0.41146,1.92022 0.68582,2.81176 0.27426,0.75436 0.68581,1.3716 1.16582,1.98881 0.48008,0.54865 0.96018,1.0973 1.57735,1.57733 0.61718,0.48005 1.37164,0.89153 2.12601,1.16586 0.34281,0.0685 0.68582,0.13715 1.02863,0.13715 0.54863,0 1.09728,-0.13715 1.57738,-0.41148 0.48008,-0.27432 0.9601,-0.41148 1.50871,-0.54863 0.75437,-0.20575 1.57738,-0.20575 2.40027,-0.0686 1.16592,0.20574 2.19455,0.41148 3.15464,0.61721 -0.34291,-0.0685 0.20574,-0.0685 0.75437,-0.0685 0.54862,0 1.16592,-0.0685 1.7831,-0.13715 1.02863,-0.27433 2.05736,-0.48006 3.01744,-0.61721 0.54866,-0.13717 1.4402,-0.4115 2.2632,-0.75438 0.61718,-0.27431 1.303,-0.27431 1.98881,-0.0685 0.75437,0.27432 1.50874,0.61721 2.26311,1.0287 1.71454,0.96013 3.56597,1.57734 5.48645,1.92023 0.68582,0.13715 1.37154,0.27432 1.98881,0.4115 0.89156,0.13715 1.98884,0.27431 3.01748,0.27431 0.75433,0.0685 1.5087,0.20574 2.26316,0.54864 1.37155,0.68581 2.60602,1.7145 3.49755,3.01748 1.16583,1.7145 2.19456,3.49758 3.08618,5.41772 0.68585,1.44017 1.50874,2.94891 2.33175,4.38908 0.61717,1.0287 1.1658,2.26314 1.6459,3.4976 0.68572,1.7145 1.37154,3.22332 2.12591,4.80048 0.4801,1.09728 0.96018,2.19454 1.37164,3.36045 0.1372,0.34289 0.34291,0.68581 0.54862,0.96013 1.9202,2.60603 4.52618,4.52622 7.54375,5.48644 l 1.85161,0.61721 -1.92016,1.7145 -3.90901,3.49758 -2.05745,1.98882 -1.64581,1.78306 c -0.4801,0.75437 -0.96018,1.57733 -1.57738,2.33171 -0.48008,0.75437 -0.89153,1.37161 -1.1658,2.05738 -0.27436,0.61721 -0.41155,1.23444 -0.41155,1.92021 0,0.27432 0.0686,0.54865 0.0686,0.82298 0.20571,1.02868 0.61717,1.98881 1.09724,2.88034 l 1.02864,1.7145 1.23447,1.6459 3.70348,3.49758 1.64581,1.6459 1.50883,1.57734 0.8229,1.0287 2.46891,3.08618 4.32034,4.59494 2.26311,2.12598 1.7831,1.37161 1.4402,0.96011 1.02873,0.48005 0.54862,0.0685 c 0.61717,1.57734 1.6459,3.01747 2.88037,4.11482 0.47998,0.48005 1.09728,0.82297 1.78301,0.96013 0.61717,0.13716 1.1659,0.27432 1.7831,0.41148 h 0.41143 c 0.2744,0 0.4801,0 0.75437,-0.0685 l 0.41155,-0.13715 -3.22338,-11.0413 c -0.1372,-0.41147 -0.41146,-0.75436 -0.89153,-0.82296 l -2.94892,-0.68581 c -0.27427,-0.13716 -0.41146,-0.41148 -0.34291,-0.61721 l 0.61727,-1.85164 c 0.0685,-0.13716 0.1371,-0.4115 0.1371,-0.61722 0,-0.61721 -0.34282,-1.16584 -0.89144,-1.44017 -0.4801,-0.27431 -1.02873,-0.48005 -1.57738,-0.6858 -0.75437,-0.13717 -1.4402,-0.54864 -2.05736,-0.96013 -0.82302,-0.61721 -1.6459,-1.23444 -2.46892,-1.92022 -1.09728,-0.89154 -2.05736,-2.05738 -2.74317,-3.29175 -0.61718,-1.16584 -1.23435,-2.3317 -1.92017,-3.42887 -0.6173,-1.09727 -0.89156,-2.05738 -1.02876,-3.08618 -0.13716,-1.0973 0.1372,-2.19455 0.82301,-3.15462 0.68582,-0.96007 1.64591,-1.78305 2.67466,-2.26313 l 3.90888,-1.85166 c 1.16593,-0.54865 2.33172,-1.09728 3.5661,-1.57734 1.1658,-0.41148 2.19452,-1.0287 3.22328,-1.7145 0.68582,-0.54865 1.37151,-0.96013 2.12598,-1.37161 1.50873,-0.96012 2.67466,-2.19453 3.566,-3.77184 l 0.41146,-0.75438 1.71455,3.4976 0.68581,1.50875 0.54863,1.16584 1.09727,1.57733 1.37155,1.98882 2.05745,2.94891 1.71445,2.7432 1.85165,3.01746 0.89156,1.44018 2.60598,4.59493 1.02873,1.98882 1.303,2.60603 0.68585,1.57732 0.47998,1.4402 c 0.34291,0.75437 0.54875,1.50873 0.68582,2.3317 0.0685,0.6172 0.20572,1.23441 0.34291,1.92022 0,0.27431 0.0686,0.54864 0.0686,0.82296 0,0.96013 -0.34291,1.85167 -1.02873,2.53747 l -2.19455,2.46886 -0.34282,0.54864 c -2.126,0.54865 -3.70348,2.33171 -4.04617,4.52622 l -0.0685,0.48005 h 11.7273 c 0.96008,-1.0287 1.5087,-2.33171 1.5087,-3.70343 0,-0.82296 -0.20571,-1.64591 -0.54862,-2.4003 l -0.34291,-0.61722 c -0.0686,-0.27432 0.0686,-0.48004 0.27436,-0.48004 h 1.37154 c 0.89156,-0.13715 1.4402,-0.89153 1.4402,-1.7145 0,-0.13716 0,-0.20574 -0.0686,-0.34289 l -0.54863,-2.74318 -0.96008,-3.36046 -1.09737,-4.0461 -1.09728,-3.77185 -0.68573,-2.74318 -0.61726,-2.53747 -0.41146,-1.6459 -0.41146,-1.6459 -0.27436,-1.50873 -0.34291,-1.57734 -0.27426,-1.16585 -0.75437,-2.88035 c -0.41156,-1.30301 -0.89156,-2.67462 -1.23447,-3.97769 -0.54863,-1.98882 -1.303,-3.97769 -2.26308,-5.7607 l -0.61727,-1.16585 5.34939,-0.13715 h 1.1658 c 1.50874,0 3.15464,0 4.73212,-0.13717 2.53734,-0.13715 5.21209,0.0685 7.81788,0.68581 3.70348,0.75436 7.40656,1.16585 11.17846,1.23445 0.41146,0.0685 0.75437,0.0685 1.1658,0.0685 4.11485,0 8.16092,-0.41148 12.13867,-1.23441 2.81173,-0.54864 4.86918,-0.96012 6.92644,-1.37161 l 0.41143,-0.0685 c 1.50884,1.23445 3.15555,2.3317 4.93764,3.15461 l 0.20572,0.13716 -0.9601,5.4177 c 0.0686,1.0973 0.9601,1.98882 2.05736,1.98882 0.89157,0 1.71455,-0.48004 1.98884,-1.30301 l 1.71455,-4.5262 2.53747,0.54863 -0.61731,4.45781 v 0.41148 c 0,0.41148 0.0686,0.82297 0.27436,1.16585 0.34295,0.54864 0.82292,0.82296 1.4402,0.89153 h 0.27427 c 0.41145,0 0.82301,-0.0685 1.23447,-0.13716 0.54862,-0.13715 1.02863,-0.54865 1.09728,-1.16586 l 0.96008,-5.00632 2.33172,0.13716 c 0.1372,0.89153 0.20574,1.85166 0.20574,2.81175 v 0.41148 c 0,1.3716 -0.1372,2.67462 -0.27426,4.0461 -0.1372,1.16585 -0.41156,2.26314 -0.82301,3.29174 -0.9601,2.19454 -2.05737,4.45781 -3.29171,6.58377 l -0.82302,1.4402 -1.50873,2.67461 c -0.61717,1.44018 -1.50871,2.74319 -2.53747,3.90898 l -0.82288,0.96013 -0.96018,0.96012 -2.46882,2.05739 -1.9203,1.6459 -2.40027,1.98881 c -0.27426,0.20574 -0.54862,0.48005 -0.8229,0.68581 -1.57738,1.44016 -2.81185,3.22333 -3.63474,5.14345 l -0.20572,0.6172 c -1.02875,0.4115 -1.98884,0.96013 -2.81182,1.57735 -1.02863,0.89153 -1.85164,1.92022 -2.4003,3.15461 l -0.27426,0.6172 h 11.65847 l 0.27435,-0.0685 3.36045,-6.24079 c 0.0686,-0.20575 0.2743,-0.34289 0.48001,-0.34289 0.1372,0 0.27436,0.0686 0.34291,0.13715 l 0.89153,0.75437 c 0.1372,0.13717 0.34294,0.27432 0.48001,0.27432 0.1372,0 0.20572,-0.0685 0.27436,-0.0685 0.34291,-0.20574 0.68582,-0.4115 0.96008,-0.6858 l 0.34294,-0.41148 1.303,-1.50874 1.02872,-1.37161 3.70336,-6.2408 c 0.54865,-0.82296 1.02876,-1.50874 1.50874,-2.19455 0.4801,-0.68581 1.23447,-1.50873 2.126,-2.19454 l 1.9203,-1.44017 7.26936,-5.41772 c 0.27436,-0.3429 0.54862,-0.75437 0.61727,-1.23445 l 2.05736,-8.9153 0.41146,-1.57734 0.96017,-2.3317 1.02864,-1.78306 0.82301,-0.82297 c 1.09728,2.12599 2.53746,4.11483 4.11482,5.82941 0.96008,1.0287 1.85164,1.92023 2.74317,2.81175 1.09728,1.16585 2.05736,2.40031 2.81173,3.84056 1.50874,2.88035 2.60602,6.10367 3.22338,9.3267 0.34281,1.78307 0.61717,3.566 0.96008,5.3493 0.0686,0.6858 0.1372,1.50874 0.1372,2.3317 0,0.82297 -0.0685,1.6459 -0.20583,2.46888 -0.0685,0.54863 -0.27427,1.02868 -0.61718,1.44016 -0.34291,0.4115 -0.68581,0.89154 -0.96008,1.37161 -0.20571,0.34289 -0.27436,0.75437 -0.34291,1.23445 l -0.0686,1.30301 -1.303,1.37161 -1.37154,1.23442 c -0.4801,0.6858 -0.75437,1.3716 -0.89154,2.12598 l -0.2744,1.57733 h 11.65857 l 1.09728,-1.85165 c 0.27435,-0.4115 0.3429,-0.89154 0.3429,-1.37161 0,-0.20574 0,-0.48005 -0.0685,-0.68581 -0.0686,-0.4115 -0.27426,-0.89153 -0.54862,-1.30301 -0.1372,-0.27432 -0.2744,-0.61721 -0.41146,-0.96013 -0.1372,-0.41148 -0.20575,-0.82295 -0.27436,-1.23441 0,-0.27432 0.0685,-0.54864 0.20572,-0.75437 0.20571,-0.27432 0.4801,-0.4115 0.75437,-0.48005 l 1.30308,-0.27432 c 0.20575,0 0.34281,-0.13716 0.48001,-0.27432 0.27436,-0.34289 0.41143,-0.75437 0.41143,-1.16585 0,-0.27431 -0.0685,-0.54865 -0.13707,-0.75437 -0.1372,-0.27431 -0.20571,-0.54865 -0.27436,-0.82296 -0.34291,-2.53747 -0.82292,-5.2806 -1.37154,-7.9554 l -0.41155,-2.26314 -0.75437,-5.62356 c -0.1372,-0.75437 -0.34291,-1.6459 -0.41146,-2.53747 -0.1372,-0.96013 -0.1372,-1.85165 0.0685,-2.74318 0.34281,-1.6459 0.61717,-3.36045 0.8229,-5.07503 0.20574,-1.57734 0.41155,-3.0862 0.6173,-4.59493 0.0685,-0.41148 0.0685,-0.82297 0.0685,-1.30302 v -1.09728 c -0.13716,-1.16586 -0.54871,-2.26314 -1.1659,-3.15461 -0.27426,-0.48005 -0.54865,-0.96013 -0.75437,-1.50874 l -0.75436,-2.19455 c -0.0686,-0.27431 -0.20572,-0.48004 -0.27427,-0.6858 -0.4801,-1.57733 -0.82301,-3.1546 -0.89153,-4.73206 z\" style=\"stroke-width:0.2949\"/>\n    </g>\n  </g>";
            }
        },
        DOG_DRAWN_VEHICLE("03", "Dog-Drawn Vehicle", LandEquipmentEntity.HARNESS_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <g transform=\"matrix(0.6,0,0,0.6,78.4,190.25)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4.08877\" x1=\"226\" x2=\"226\" y1=\"413.8791\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"4.0883\" x1=\"386\" x2=\"386\" y1=\"413.90036\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"505\" y2=\"505\"/>\n      <path d=\"m 226,416.08337 c 70,26 90,26 160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <g>\n        <ellipse cx=\"236\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <ellipse cx=\"376\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      </g>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"309.75481\" x2=\"373.05769\" y1=\"464.82573\" y2=\"464.82573\"/>\n    <g id=\"main-7\" transform=\"matrix(0.06,0,0,0.075,349.79883,442.31888)\">\n      <g fill=\"#000000\" stroke=\"none\" transform=\"matrix(0.13333,0,0,-0.13333,-546.50648,1019.8769)\">\n        <path d=\"m 10985,9233 c -56,-115 -145,-307 -192,-413 -15,-32 -192,-240 -341,-400 -137,-146 -313,-313 -429,-405 -74,-59 -88,-77 -154,-187 -40,-68 -98,-162 -130,-210 -80,-119 -284,-361 -365,-432 -85,-76 -150,-164 -170,-231 -8,-29 -21,-59 -29,-65 -8,-7 -36,-42 -62,-79 -120,-172 -162,-212 -233,-226 -49,-10 -127,-50 -177,-92 -24,-19 -43,-32 -43,-28 0,3 -13,-1 -29,-10 -64,-33 -213,-66 -424,-95 -224,-30 -339,-54 -393,-82 -16,-8 -67,-36 -114,-61 -145,-78 -289,-117 -595,-162 -344,-50 -526,-94 -733,-176 -42,-17 -151,-53 -242,-79 -193,-57 -311,-99 -470,-168 -170,-74 -270,-107 -499,-163 -214,-53 -260,-72 -473,-190 -48,-27 -143,-77 -210,-111 -68,-34 -154,-81 -192,-105 -83,-53 -243,-207 -339,-325 -39,-49 -74,-88 -79,-88 -19,0 -192,-210 -220,-268 -49,-99 -123,-158 -583,-463 -115,-77 -267,-179 -337,-227 C 2470,3515 2141,3346 1735,3182 1510,3092 937,2882 635,2780 525,2743 389,2692 333,2667 221,2618 84,2531 32,2477 l -34,-35 59,-17 c 32,-9 176,-55 321,-101 425,-136 498,-152 805,-175 816,-60 1528,198 2337,846 184,147 204,167 288,278 64,83 232,270 238,264 2,-2 45,-138 95,-303 153,-507 182,-643 161,-756 -15,-84 -74,-200 -166,-328 -42,-58 -97,-145 -123,-195 -47,-88 -48,-92 -48,-180 0,-83 3,-96 36,-166 20,-42 68,-123 107,-180 79,-119 90,-139 206,-382 56,-117 100,-194 129,-228 24,-27 83,-115 132,-196 48,-80 110,-172 137,-204 41,-50 56,-60 105,-74 81,-23 134,-65 253,-200 56,-64 114,-121 129,-127 61,-23 163,-21 311,6 80,15 177,31 217,35 87,10 122,33 155,99 32,65 38,229 11,317 -18,58 -20,60 -68,77 -28,9 -95,21 -150,27 -199,23 -200,23 -392,160 -146,105 -209,167 -224,224 -16,61 -53,130 -125,233 -76,110 -103,168 -111,245 l -6,59 44,44 c 49,49 82,61 211,77 114,13 182,34 220,67 18,16 80,62 138,104 112,80 317,264 436,389 155,165 331,409 410,569 214,436 216,440 243,448 14,4 71,7 126,6 104,-1 139,-8 345,-70 106,-33 195,-54 372,-89 215,-43 633,-78 954,-78 l 261,-1 13,-280 c 8,-155 15,-365 16,-469 2,-103 7,-219 13,-257 6,-38 11,-120 11,-184 0,-116 16,-226 44,-304 12,-34 16,-82 15,-210 -2,-163 -1,-169 29,-250 17,-48 65,-139 111,-211 98,-155 125,-214 145,-311 29,-138 87,-220 155,-220 13,0 49,-12 79,-26 85,-40 218,-64 357,-65 179,0 294,29 371,95 21,18 51,36 66,40 38,9 68,44 68,78 0,31 -30,97 -52,115 -21,17 -314,162 -373,184 -85,32 -135,99 -150,203 -5,28 -21,70 -37,95 -49,78 -70,161 -75,306 -6,153 8,264 72,597 25,124 51,284 59,355 8,71 33,199 56,288 23,88 56,221 75,295 37,146 67,238 110,340 24,58 50,88 224,265 108,110 237,247 286,305 49,58 175,193 280,300 251,258 267,290 326,627 17,101 39,194 54,226 13,30 52,142 86,248 79,248 126,362 194,474 61,102 66,113 99,233 50,179 59,253 52,442 l -6,175 28,60 c 16,33 50,93 75,133 l 47,72 h 74 c 41,0 101,6 133,14 32,8 135,17 228,21 232,9 293,19 378,60 40,19 79,38 87,43 8,5 54,28 102,52 101,50 121,69 218,209 83,120 93,155 61,218 -24,48 -74,90 -156,131 -33,16 -96,50 -140,76 -96,56 -209,100 -308,122 -148,33 -191,57 -249,142 -17,25 -44,77 -58,115 -38,97 -75,144 -182,232 -51,43 -126,113 -167,157 -80,86 -164,150 -253,194 l -56,27 -11,76 c -6,42 -18,150 -26,241 -16,194 -50,421 -66,453 -15,28 -40,57 -49,57 -5,0 -38,-62 -75,-137 z\"/>\n      </g>\n    </g>\n  </g>";
            }
        },
        ANIMAL_DRAWN_VEHICLE("04", "Animal-Drawn Vehicle", LandEquipmentEntity.HARNESS_VEHICLES, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <g transform=\"matrix(0.6,0,0,0.6,78.4,190.25)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"226\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386\" x2=\"386\" y1=\"367.5\" y2=\"507.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226\" x2=\"386\" y1=\"505\" y2=\"505\"/>\n      <path d=\"m 226,370.25 c 70,26 90,26 160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <g>\n        <ellipse cx=\"236\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n        <ellipse cx=\"376\" cy=\"527.5\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      </g>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"309.75481\" x2=\"373.05769\" y1=\"464.82573\" y2=\"464.82573\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final LandEquipmentEntity entity;
    private final GraphicType graphicType;

    LandEquipmentEntityType(String id, String label, LandEquipmentEntity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public String getName() {
        return name();
    }

    @Override
    public Entity getEntity() {
        return entity;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return LandEquipmentSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}