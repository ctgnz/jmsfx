package io.github.ctgnz.jmsfx.standard.landequipment;

import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.standard.IconBounds;
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
        LOCOMOTIVE("01", "Locomotive", LandEquipmentEntity.TRAIN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"231,322 231,467 379,467 379,392 311,392 311,324 231,324\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
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
    public Rectangle2D getIconBounds() {
        return IconBounds.lookup(getGraphicIdentifier(), getGraphicType());
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
        return LandEquipmentSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}