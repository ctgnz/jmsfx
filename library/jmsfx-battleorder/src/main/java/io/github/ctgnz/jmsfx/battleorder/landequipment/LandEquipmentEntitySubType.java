package io.github.ctgnz.jmsfx.battleorder.landequipment;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum LandEquipmentEntitySubType implements EntitySubType {
        SINGLE_SHOT_RIFLE("01", "Single Shot Rifle", LandEquipmentEntityType.RIFLE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"398\" y2=\"398\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"282.5\" y2=\"508.5\"/>\n      <polyline fill=\"none\" points=\"252.625,316.563 305.816,280.875 359.82,316.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        SEMIAUTOMATIC_RIFLE("02", "Semiautomatic Rifle", LandEquipmentEntityType.RIFLE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"423.577\" y2=\"423.577\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"399\" y2=\"399\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"283.5\" y2=\"502.25\"/>\n      <polyline fill=\"none\" points=\"252.625,316.563 305.816,280.875 359.82,316.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        AUTOMATIC_RIFLE("03", "Automatic Rifle", LandEquipmentEntityType.RIFLE, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"423.577\" y2=\"423.577\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"399\" y2=\"399\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"374.422\" y2=\"374.422\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"283.5\" y2=\"508.5\"/>\n      <polyline fill=\"none\" points=\"252.625,316.563 305.816,280.875 359.82,316.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MG_LIGHT("01", "Light", LandEquipmentEntityType.MACHINE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"488.5\" y2=\"488.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"280.5\" y2=\"488.5\"/>\n      <polyline fill=\"none\" points=\"252.625,313.563 305.816,277.875 359.82,313.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MG_MEDIUM("02", "Medium", LandEquipmentEntityType.MACHINE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"488.5\" y2=\"488.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"420.577\" y2=\"420.577\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"280.5\" y2=\"488.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"308.57\" x2=\"251.69\" y1=\"278.843\" y2=\"313.563\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"359.82\" x2=\"302.94\" y1=\"313.713\" y2=\"278.843\"/>\n    </g>\n  </g>";
            }
        },
        MG_HEAVY("03", "Heavy", LandEquipmentEntityType.MACHINE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"488.5\" y2=\"488.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"420.577\" y2=\"420.577\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"371.422\" y2=\"371.422\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"280.5\" y2=\"488.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"308.57\" x2=\"251.69\" y1=\"278.843\" y2=\"313.563\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"359.82\" x2=\"302.94\" y1=\"313.713\" y2=\"278.843\"/>\n    </g>\n  </g>";
            }
        },
        GRENADE_LAUNCHER_LIGHT("01", "Light", LandEquipmentEntityType.GRENADE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"280.5\" y2=\"505.5\"/>\n      <circle cx=\"306\" cy=\"338.561\" fill=\"none\" r=\"24.848\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"none\" points=\"252.625,313.563 305.816,277.875 359.82,313.563\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        GRENADE_LAUNCHER_MEDIUM("02", "Medium", LandEquipmentEntityType.GRENADE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"371.422\" y2=\"371.422\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"280.5\" y2=\"505.5\"/>\n      <circle cx=\"306\" cy=\"338.561\" fill=\"none\" r=\"24.848\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"308.57\" x2=\"251.69\" y1=\"278.843\" y2=\"313.563\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"359.82\" x2=\"302.94\" y1=\"313.713\" y2=\"278.843\"/>\n    </g>\n  </g>";
            }
        },
        GRENADE_LAUNCHER_HEAVY("03", "Heavy", LandEquipmentEntityType.GRENADE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Arrow\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"420.577\" y2=\"420.577\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"251.816\" x2=\"359.816\" y1=\"371.422\" y2=\"371.422\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.816\" x2=\"305.816\" y1=\"280.5\" y2=\"505.5\"/>\n      <circle cx=\"306\" cy=\"338.561\" fill=\"none\" r=\"24.848\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"308.57\" x2=\"251.69\" y1=\"278.843\" y2=\"313.563\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"359.82\" x2=\"302.94\" y1=\"313.713\" y2=\"278.843\"/>\n    </g>\n  </g>";
            }
        },
        AIR_DEFENSE_GUN_LIGHT("01", "Light", LandEquipmentEntityType.AIR_DEFENSE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M359.35,486.502c0-10.745-6.273-19.263-18.81-25.535 c-9.867-5.076-20.911-7.621-33.149-7.621c-11.958,0-22.859,2.54-32.701,7.621c-12.251,6.272-18.374,14.79-18.374,25.535H359.35z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,426.746 366.346,414.867 248.316,415.263 248.316,426.746\"/>\n    <path d=\"M312.212,290v162.359h-10.687V290C304.683,289.742,308.246,289.742,312.212,290z\"/>\n  </g>";
            }
        },
        AIR_DEFENSE_GUN_MEDIUM("02", "Medium", LandEquipmentEntityType.AIR_DEFENSE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M359.35,486.502c0-10.745-6.272-19.263-18.81-25.535 c-9.867-5.076-20.911-7.621-33.149-7.621c-11.958,0-22.858,2.54-32.701,7.621c-12.251,6.272-18.374,14.79-18.374,25.535H359.35z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <path d=\"M312.212,290v162.359h-10.687V290C304.683,289.742,308.246,289.742,312.212,290z\"/>\n  </g>";
            }
        },
        AIR_DEFENSE_GUN_HEAVY("03", "Heavy", LandEquipmentEntityType.AIR_DEFENSE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M359.35,486.502c0-10.745-6.272-19.263-18.81-25.535 c-9.867-5.076-20.911-7.621-33.149-7.621c-11.958,0-22.858,2.54-32.701,7.621c-12.251,6.272-18.374,14.79-18.374,25.535H359.35z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <polygon points=\"365.015,389.746 365.015,377.867 246.985,378.263 246.985,389.746\"/>\n    <path d=\"M312.212,290v162.359h-10.687V290C304.683,289.742,308.246,289.742,312.212,290z\"/>\n  </g>";
            }
        },
        ANTITANK_GUN_LIGHT("01", "Light", LandEquipmentEntityType.ANTITANK_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"266.686,491.506 306.168,452.359 345.314,491.843\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,426.746 366.346,414.867 248.316,415.263 248.316,426.746\"/>\n    <path d=\"M312.212,290v162.359h-10.687V290C304.683,289.742,308.246,289.742,312.212,290z\"/>\n  </g>";
            }
        },
        ANTITANK_GUN_MEDIUM("02", "Medium", LandEquipmentEntityType.ANTITANK_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"266.609,491.506 306.092,452.359 345.238,491.842\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <path d=\"M312.212,290v162.359h-10.687V290C304.683,289.742,308.246,289.742,312.212,290z\"/>\n  </g>";
            }
        },
        ANTITANK_GUN_HEAVY("03", "Heavy", LandEquipmentEntityType.ANTITANK_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"266.609,490.506 306.092,451.359 345.238,490.843\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <polygon points=\"365.015,389.746 365.015,377.867 246.985,378.263 246.985,389.746\"/>\n    <path d=\"M312.212,290v162.359h-10.687V290C304.683,289.742,308.246,289.742,312.212,290z\"/>\n  </g>";
            }
        },
        DIRECT_FIRE_GUN_LIGHT("01", "Light", LandEquipmentEntityType.DIRECT_FIRE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,426.746 366.346,414.867 248.316,415.263 248.316,426.746\"/>\n    <path d=\"M312.212,290.056V499.25h-10.687V290.056C304.683,289.724,308.246,289.724,312.212,290.056z\"/>\n  </g>";
            }
        },
        DIRECT_FIRE_GUN_MEDIUM("02", "Medium", LandEquipmentEntityType.DIRECT_FIRE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <path d=\"M312.212,290.056V499.25h-10.687V290.056C304.683,289.724,308.246,289.724,312.212,290.056z\"/>\n  </g>";
            }
        },
        DIRECT_FIRE_GUN_HEAVY("03", "Heavy", LandEquipmentEntityType.DIRECT_FIRE_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <polygon points=\"365.015,389.746 365.015,377.867 246.985,378.263 246.985,389.746\"/>\n    <path d=\"M312.212,290.061V503.5h-10.687V290.061C304.683,289.722,308.246,289.722,312.212,290.061z\"/>\n  </g>";
            }
        },
        RECOILLESS_GUN_LIGHT("01", "Light", LandEquipmentEntityType.RECOILLESS_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,426.746 366.346,414.867 248.316,415.263 248.316,426.746\"/>\n    <path d=\"M312.212,290.056V499.25h-10.687V290.056C304.683,289.724,308.246,289.724,312.212,290.056z\"/>\n    <polyline fill=\"none\" points=\"253.776,323.548 307.748,289.807 359.961,323.548\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        RECOILLESS_GUN_MEDIUM("02", "Medium", LandEquipmentEntityType.RECOILLESS_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <path d=\"M312.212,290.056V499.25h-10.687V290.056C304.683,289.724,308.246,289.724,312.212,290.056z\"/>\n    <polyline fill=\"none\" points=\"253.239,319.396 307.21,285.654 359.423,319.396\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        RECOILLESS_GUN_HEAVY("03", "Heavy", LandEquipmentEntityType.RECOILLESS_GUN, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <polygon points=\"365.015,389.746 365.015,377.867 246.985,378.263 246.985,389.746\"/>\n    <path d=\"M312.212,290.061V503.5h-10.687V290.061C304.683,289.722,308.246,289.722,312.212,290.061z\"/>\n    <polyline fill=\"none\" points=\"252.908,319.026 306.879,285.285 359.092,319.026\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        HOWITZER_LIGHT("01", "Light", LandEquipmentEntityType.HOWITZER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.868\" cy=\"477.5\" fill=\"none\" r=\"28\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,426.746 366.346,414.867 248.316,415.263 248.316,426.746\"/>\n    <path d=\"M312.212,289.997V449.5h-10.687V289.997C304.683,289.743,308.246,289.743,312.212,289.997z\"/>\n  </g>";
            }
        },
        HOWITZER_MEDIUM("02", "Medium", LandEquipmentEntityType.HOWITZER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"305.868\" cy=\"477.5\" fill=\"none\" r=\"28\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <path d=\"M311.212,289.997V449.5h-10.687V289.997C303.683,289.743,307.246,289.743,311.212,289.997z\"/>\n  </g>";
            }
        },
        HOWITZER_HEAVY("03", "Heavy", LandEquipmentEntityType.HOWITZER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"306\" cy=\"479.598\" fill=\"none\" r=\"28\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect height=\"120.77\" width=\"9.499\" x=\"243.567\" y=\"335.615\"/>\n    <rect height=\"117.859\" width=\"10.29\" x=\"361.2\" y=\"338.525\"/>\n    <polygon points=\"366.346,415.986 366.346,404.106 248.316,404.502 248.316,415.986\"/>\n    <polygon points=\"366.346,439.746 366.346,427.867 248.316,428.263 248.316,439.746\"/>\n    <polygon points=\"365.015,389.746 365.015,377.867 246.985,378.263 246.985,389.746\"/>\n    <path d=\"M312.212,289.999v161.599h-10.687V289.999C304.683,289.742,308.246,289.742,312.212,289.999z\"/>\n  </g>";
            }
        },
        MISSILE_LAUNCHER_LIGHT("01", "Light", LandEquipmentEntityType.MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256.881,488.616c0-66.283-0.381-112.866,2.119-157.366 c1.706-30.358,28.083-40,48.75-40c19.7,0,49.099,14.562,50.25,44.5c2,52,1.401,84.277,1.401,152.866\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"291.25\" y2=\"488.616\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256.861\" x2=\"359.453\" y1=\"445\" y2=\"445\"/>\n  </g>";
            }
        },
        MISSILE_LAUNCHER_MEDIUM("02", "Medium", LandEquipmentEntityType.MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256.881,488.616c0-66.283-0.381-112.866,2.119-157.366 c1.706-30.358,28.083-40,48.75-40c19.7,0,49.099,14.562,50.25,44.5c2,52,1.401,84.277,1.401,152.866\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"291.25\" y2=\"488.616\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256.861\" x2=\"359.453\" y1=\"445\" y2=\"445\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"255.861\" x2=\"358.453\" y1=\"420.5\" y2=\"420.5\"/>\n  </g>";
            }
        },
        MISSILE_LAUNCHER_HEAVY("03", "Heavy", LandEquipmentEntityType.MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M256.881,488.616c0-66.283-0.381-112.866,2.119-157.366 c1.706-30.358,28.083-40,48.75-40c19.7,0,49.099,14.562,50.25,44.5c2,52,1.401,84.277,1.401,152.866\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"291.25\" y2=\"488.616\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256.861\" x2=\"359.453\" y1=\"445\" y2=\"445\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"255.861\" x2=\"358.453\" y1=\"420.5\" y2=\"420.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"255.861\" x2=\"358.453\" y1=\"396.5\" y2=\"396.5\"/>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_LIGHT("01", "Light", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"470.241\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"443.25\" y2=\"443.25\"/>\n    <path d=\"M268,495.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_LIGHT_TLAR("02", "Light Transporter-Launcher and Radar (TLAR)", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"470.241\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"443.25\" y2=\"443.25\"/>\n    <path d=\"M268,495.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 350.25 408.6396)\">R</text>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_LIGHT_TELAR("03", "Light Transporter-Erector-Launcher and Radar (TELAR)", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"471.241\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"443.25\" y2=\"443.25\"/>\n    <path d=\"M268,495.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 350.25 408.6396)\">R</text>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 219.25 408.6396)\">E</text>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_MEDIUM("04", "Medium", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"470.241\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"443.25\" y2=\"443.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"423.5\" y2=\"423.5\"/>\n    <path d=\"M268,495.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_MEDIUM_TLAR("05", "Medium TLAR", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"470.241\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"443.25\" y2=\"443.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"423.5\" y2=\"423.5\"/>\n    <path d=\"M268,495.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 351.25 408.75)\">R</text>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_MEDIUM_TELAR("06", "Medium TELAR", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"471.241\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"443.25\" y2=\"443.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"423.5\" y2=\"423.5\"/>\n    <path d=\"M268,495.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 351.25 411.75)\">R</text>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 220.25 411.75)\">E</text>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_HEAVY("07", "Heavy", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"471.241\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"442.25\" y2=\"442.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"423.625\" y2=\"423.625\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"460\" y2=\"460\"/>\n    <path d=\"M268,495.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_HEAVY_TLAR("08", "Heavy TLAR", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.02\" y2=\"469.241\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"442.25\" y2=\"442.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"423.625\" y2=\"423.625\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"460\" y2=\"460\"/>\n    <path d=\"M268,494.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 350.25 409.75)\">R</text>\n  </g>";
            }
        },
        AIR_DEFENSE_MISSILE_HEAVY_TELAR("09", "Heavy TELAR", LandEquipmentEntityType.AIR_DEFENSE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M267,497.25V307.219c7.8-29.326,70.2-29.326,78,0V497.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"286.669\" y2=\"471.891\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"442.25\" y2=\"442.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"423.625\" y2=\"423.625\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"268\" x2=\"344\" y1=\"460\" y2=\"460\"/>\n    <path d=\"M268,495.744c3-31.804,73-31.804,76,0H268z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 350.25 408.75)\">R</text>\n    <text font-family=\"sans-serif\" font-size=\"60.2861\" transform=\"matrix(0.9853 0 0 1 220.25 409.6396)\">E</text>\n  </g>";
            }
        },
        ANTITANK_MISSILE_LAUNCHER_LIGHT("01", "Light", LandEquipmentEntityType.ANTITANK_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"266.414,497.005 306,457.419 345.586,497.005\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"283.25\" y2=\"461.148\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"257\" x2=\"354\" y1=\"411.5\" y2=\"411.5\"/>\n    <path d=\"M257,432.922v-111.25c0-20.849,21.714-37.75,48.5-37.75 c26.785,0,48.5,16.901,48.5,37.75v111.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ANTITANK_MISSILE_LAUNCHER_MEDIUM("02", "Medium", LandEquipmentEntityType.ANTITANK_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"266.414,497.005 306,457.419 345.586,497.005\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"283.25\" y2=\"461.148\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"257\" x2=\"354\" y1=\"401.5\" y2=\"401.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"257\" x2=\"354\" y1=\"419.5\" y2=\"419.5\"/>\n    <path d=\"M257,432.922v-111.25c0-20.849,21.714-37.75,48.5-37.75 c26.785,0,48.5,16.901,48.5,37.75v111.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ANTITANK_MISSILE_LAUNCHER_HEAVY("03", "Heavy", LandEquipmentEntityType.ANTITANK_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"266.414,497.005 306,457.419 345.586,497.005\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"283.25\" y2=\"461.148\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"257\" x2=\"354\" y1=\"408.5\" y2=\"408.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"257\" x2=\"354\" y1=\"390\" y2=\"390\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"257\" x2=\"354\" y1=\"426.5\" y2=\"426.5\"/>\n    <path d=\"M257,432.922v-111.25c0-20.849,21.714-37.75,48.5-37.75 c26.785,0,48.5,16.901,48.5,37.75v111.25\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SURFACE_TO_SURFACE_MISSILE_LIGHT("01", "Light", LandEquipmentEntityType.SURFACE_TO_SURFACE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M253.5,488V313.859c17.618-32.779,85.382-32.779,103,0V488H253.5z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"253.5\" x2=\"356.5\" y1=\"416\" y2=\"416\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"288.25\" y2=\"488\"/>\n  </g>";
            }
        },
        SURFACE_TO_SURFACE_MISSILE_MEDIUM("02", "Medium", LandEquipmentEntityType.SURFACE_TO_SURFACE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M253.5,488V313.859c17.618-32.779,85.382-32.779,103,0V488H253.5z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"288.25\" y2=\"488\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"253.5\" x2=\"356.5\" y1=\"419\" y2=\"419\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256\" x2=\"359\" y1=\"399\" y2=\"399\"/>\n  </g>";
            }
        },
        SURFACE_TO_SURFACE_MISSILE_HEAVY("03", "Heavy", LandEquipmentEntityType.SURFACE_TO_SURFACE_MISSILE_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M253.5,488V313.859c17.618-32.779,85.382-32.779,103,0V488H253.5z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"288.25\" y2=\"488\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"253.5\" x2=\"356.5\" y1=\"425\" y2=\"425\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"253.5\" x2=\"356.5\" y1=\"389.5\" y2=\"389.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"254.5\" x2=\"357.5\" y1=\"407.25\" y2=\"407.25\"/>\n  </g>";
            }
        },
        MORTAR_LIGHT("01", "Light", LandEquipmentEntityType.MORTAR, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"276.173,313.874 306.933,283.114 337.692,313.874\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"306.067\" cy=\"479.5\" fill=\"none\" r=\"27.332\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.933\" x2=\"306.933\" y1=\"283.114\" y2=\"452.168\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256.433\" x2=\"357.433\" y1=\"410\" y2=\"410\"/>\n  </g>";
            }
        },
        MORTAR_MEDIUM("02", "Medium", LandEquipmentEntityType.MORTAR, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"276.173,313.874 306.933,283.114 337.692,313.874\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"306.067\" cy=\"479.5\" fill=\"none\" r=\"27.332\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.933\" x2=\"306.933\" y1=\"283.114\" y2=\"452.168\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"257.933\" x2=\"358.933\" y1=\"426\" y2=\"426\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"257.933\" x2=\"358.933\" y1=\"405\" y2=\"405\"/>\n  </g>";
            }
        },
        MORTAR_HEAVY("03", "Heavy", LandEquipmentEntityType.MORTAR, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"276.173,313.874 306.933,283.114 337.692,313.874\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"306.067\" cy=\"479.5\" fill=\"none\" r=\"27.332\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.933\" x2=\"306.933\" y1=\"283.114\" y2=\"452.168\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256.933\" x2=\"357.933\" y1=\"438.5\" y2=\"438.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256.933\" x2=\"357.933\" y1=\"420\" y2=\"420\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"256.933\" x2=\"357.933\" y1=\"401\" y2=\"401\"/>\n  </g>";
            }
        },
        SINGLE_ROCKET_LIGHT("01", "Light", LandEquipmentEntityType.SINGLE_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.933\" x2=\"306.933\" y1=\"306.114\" y2=\"508\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.173\" x2=\"336.76\" y1=\"419.5\" y2=\"419.5\"/>\n    <polyline fill=\"none\" points=\"276.173,336.874 306.933,306.114 337.692,336.874\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"275.241,313.114 306,282.355 336.76,313.114\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SINGLE_ROCKET_MEDIUM("02", "Medium", LandEquipmentEntityType.SINGLE_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.933\" x2=\"306.933\" y1=\"306.114\" y2=\"508\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.173\" x2=\"336.76\" y1=\"406.5\" y2=\"406.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.173\" x2=\"336.76\" y1=\"424\" y2=\"424\"/>\n    <polyline fill=\"none\" points=\"276.173,336.874 306.933,306.114 337.692,336.874\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"275.241,313.114 306,282.355 336.76,313.114\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SINGLE_ROCKET_HEAVY("03", "Heavy", LandEquipmentEntityType.SINGLE_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.934\" x2=\"306.933\" y1=\"308.5\" y2=\"508\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.173\" x2=\"336.76\" y1=\"424\" y2=\"424\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.173\" x2=\"336.76\" y1=\"407.5\" y2=\"407.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.64\" x2=\"337.227\" y1=\"390.5\" y2=\"390.5\"/>\n    <polyline fill=\"none\" points=\"276.173,336.874 306.933,306.114 337.692,336.874\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"275.241,313.114 306,282.355 336.76,313.114\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MULTIPLE_ROCKET_LIGHT("01", "Light", LandEquipmentEntityType.MULTIPLE_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"322.935\" y2=\"502.5\"/>\n    <polyline fill=\"none\" points=\"271.527,354.5 306.093,319.935 340.657,354.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,322.935 306.093,288.371 340.657,322.935\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"344\" y1=\"427.5\" y2=\"427.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"266\" y1=\"371.5\" y2=\"478.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"344\" x2=\"344\" y1=\"371.5\" y2=\"478.5\"/>\n  </g>";
            }
        },
        MULTIPLE_ROCKET_MEDIUM("02", "Medium", LandEquipmentEntityType.MULTIPLE_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"322.935\" y2=\"506.5\"/>\n    <polyline fill=\"none\" points=\"271.527,354.5 306.093,319.935 340.657,354.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,322.935 306.093,288.371 340.657,322.935\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"344\" y1=\"438\" y2=\"438\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"344\" y1=\"422.5\" y2=\"422.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"266\" y1=\"367.5\" y2=\"482.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"344\" x2=\"344\" y1=\"367.5\" y2=\"482.5\"/>\n  </g>";
            }
        },
        MULTIPLE_ROCKET_HEAVY("03", "Heavy", LandEquipmentEntityType.MULTIPLE_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"322.935\" y2=\"505.5\"/>\n    <polyline fill=\"none\" points=\"271.527,354.5 306.093,319.935 340.657,354.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,322.935 306.093,288.371 340.657,322.935\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"344\" y1=\"444\" y2=\"444\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"344\" y1=\"428.5\" y2=\"428.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"344\" y1=\"413\" y2=\"413\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"266\" x2=\"266\" y1=\"371.5\" y2=\"482.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"344\" x2=\"344\" y1=\"371.5\" y2=\"482.5\"/>\n  </g>";
            }
        },
        ANTITANK_ROCKET_LIGHT("01", "Light", LandEquipmentEntityType.ANTITANK_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"271.527,495.564 306.093,461 340.657,495.564\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"319.935\" y2=\"462\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"271.527\" x2=\"340.657\" y1=\"413\" y2=\"413\"/>\n    <polyline fill=\"none\" points=\"271.527,354.5 306.093,319.935 340.657,354.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,322.935 306.093,288.371 340.657,322.935\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ANTITANK_ROCKET_MEDIUM("02", "Medium", LandEquipmentEntityType.ANTITANK_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"271.527,495.564 306.093,461 340.657,495.564\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"322.935\" y2=\"462\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"271.527\" x2=\"340.657\" y1=\"410\" y2=\"410\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"271.527\" x2=\"340.657\" y1=\"426.5\" y2=\"426.5\"/>\n    <polyline fill=\"none\" points=\"271.527,354.5 306.093,319.935 340.657,354.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,322.935 306.093,288.371 340.657,322.935\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ANTITANK_ROCKET_HEAVY("03", "Heavy", LandEquipmentEntityType.ANTITANK_ROCKET_LAUNCHER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"271.527,495.564 306.093,461 340.657,495.564\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.093\" x2=\"306.093\" y1=\"322.935\" y2=\"462\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"271.527\" x2=\"340.657\" y1=\"435.5\" y2=\"435.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"271.528\" x2=\"340.658\" y1=\"451.5\" y2=\"451.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"271.527\" x2=\"340.657\" y1=\"419\" y2=\"419\"/>\n    <polyline fill=\"none\" points=\"271.527,354.5 306.093,319.935 340.657,354.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"271.527,322.935 306.093,288.371 340.657,322.935\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        ARMOURED_FIGHTING_VEHICLE("01", "Armoured Fighting Vehicle", LandEquipmentEntityType.VEHICLE_ARMOURED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"none\" height=\"102.967\" stroke=\"#000000\" stroke-width=\"5\" transform=\"matrix(0.7071 -0.7071 0.7071 0.7071 -191.5013 332.8161)\" width=\"102.091\" x=\"254.952\" y=\"346.089\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"231\" x2=\"231\" y1=\"312\" y2=\"482.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"380.5\" x2=\"380.5\" y1=\"310.75\" y2=\"481.25\"/>\n  </g>";
            }
        },
        ARMOURED_FIGHTING_VEHICLE_C2("02", "Armoured Fighting Vehicle Command and Control", LandEquipmentEntityType.VEHICLE_ARMOURED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"none\" height=\"102.969\" stroke=\"#000000\" stroke-width=\"5\" transform=\"matrix(-0.7071 0.7071 -0.7071 -0.7071 803.4874 462.3282)\" width=\"102.092\" x=\"254.946\" y=\"346.087\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"231\" x2=\"231\" y1=\"312\" y2=\"482.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"380.5\" x2=\"380.5\" y1=\"310.75\" y2=\"481.25\"/>\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 257 422)\">C2</text>\n  </g>";
            }
        },
        ARMOURED_PERSONNEL_CARRIER("03", "Armoured Personnel Carrier", LandEquipmentEntityType.VEHICLE_ARMOURED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"229.441\" y1=\"320.5\" y2=\"472.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"381\" x2=\"381\" y1=\"320.5\" y2=\"472.635\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"470.913\" y2=\"470.913\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"307.386\" y1=\"352.977\" y2=\"320.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"381\" x2=\"303.055\" y1=\"352.977\" y2=\"320.5\"/>\n  </g>";
            }
        },
        ARMOURED_PERSONNEL_CARRIER_AMBULANCE("04", "Armoured Personnel Carrier Ambulance", LandEquipmentEntityType.VEHICLE_ARMOURED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"236\" y1=\"328\" y2=\"468\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"376\" y1=\"328\" y2=\"468\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"376\" y1=\"466\" y2=\"466\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"308\" y1=\"358\" y2=\"328\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"304\" y1=\"358\" y2=\"328\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"20\" x1=\"266\" x2=\"346\" y1=\"406\" y2=\"406\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"20\" x1=\"306\" x2=\"306\" y1=\"446\" y2=\"366\"/>\n  </g>";
            }
        },
        ARMOURED_PROTECTED_VEHICLE("05", "Armoured Protected Vehicle", LandEquipmentEntityType.VEHICLE_ARMOURED, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M250.552,441c-22.895,0-41.457-19.98-41.457-44.626 c0-24.646,18.562-44.624,41.457-44.624\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M361.448,351.75c22.896,0,41.457,19.979,41.457,44.624 c0,24.645-18.561,44.626-41.457,44.626\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"351.75\" y2=\"351.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"441\" y2=\"441\"/>\n  </g>";
            }
        },
        ARMOURED_PERSONNEL_CARRIER_RECOVERY("08", "Armoured Personnel Carrier-Recovery", LandEquipmentEntityType.VEHICLE_ARMOURED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"236\" y1=\"328\" y2=\"468\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"376\" y1=\"328\" y2=\"468\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"376\" y1=\"466\" y2=\"466\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"308\" y1=\"358\" y2=\"328\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"304\" y1=\"358\" y2=\"328\"/>\n    </g>\n    <g transform=\"translate(-40 -73) scale(1.2 1)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"254.583\" x2=\"321.667\" y1=\"480.997\" y2=\"481\"/>\n      <path d=\"M243.333,468c15,0,15,26,0,26\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"M333.333,468c-15,0-15,26,0,26\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        COMBAT_SERVICE_SUPPORT_VEHICLE("09", "Combat Service Support Vehicle", LandEquipmentEntityType.VEHICLE_ARMOURED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"236\" y1=\"328\" y2=\"468\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"376\" y1=\"328\" y2=\"468\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"376\" y1=\"466\" y2=\"466\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"308\" y1=\"358\" y2=\"328\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"304\" y1=\"358\" y2=\"328\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"376\" y1=\"438\" y2=\"438\"/>\n  </g>";
            }
        },
        LIGHT_ARMOURED_RECONNAISSANCE("11", "Light Armoured Reconnaissance", LandEquipmentEntityType.VEHICLE_ARMOURED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"236\" y1=\"323\" y2=\"433\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"376\" y1=\"323\" y2=\"433\"/>\n    <ellipse cx=\"236\" cy=\"452\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"306\" cy=\"452\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"376\" cy=\"452\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"218\" x2=\"394\" y1=\"435\" y2=\"435\"/>\n    <polygon fill=\"none\" points=\"373.75,377.156 306,327.137 237.75,377.156 305.75,429.834\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M 424.0505,312.91697 185.45688,479.982\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        TANK_LIGHT("01", "Light", LandEquipmentEntityType.TANK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"229.441\" y1=\"320.5\" y2=\"472.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"381\" x2=\"381\" y1=\"320.5\" y2=\"472.635\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"336\" y2=\"456.913\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"456.913\" y2=\"456.913\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"336\" y2=\"336\"/>\n  </g>";
            }
        },
        TANK_MEDIUM("02", "Medium", LandEquipmentEntityType.TANK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"229.441\" y1=\"320.5\" y2=\"472.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"381\" x2=\"381\" y1=\"320.5\" y2=\"472.635\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"297\" x2=\"297\" y1=\"336\" y2=\"456.913\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"316.5\" x2=\"316.5\" y1=\"335.543\" y2=\"456.457\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"456.913\" y2=\"456.913\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"336\" y2=\"336\"/>\n  </g>";
            }
        },
        TANK_HEAVY("03", "Heavy", LandEquipmentEntityType.TANK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"229.441\" y1=\"320.5\" y2=\"472.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"381\" x2=\"381\" y1=\"320.5\" y2=\"472.635\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"288\" x2=\"288\" y1=\"336\" y2=\"456.913\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"307.5\" x2=\"307.5\" y1=\"335.543\" y2=\"456.457\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"327\" x2=\"327\" y1=\"335.543\" y2=\"456.457\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"456.913\" y2=\"456.913\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"229.441\" x2=\"381\" y1=\"336\" y2=\"336\"/>\n  </g>";
            }
        },
        DRILL_MOUNTED_ON_UTILITY_VEHICLE("01", "Drill Mounted on Utility Vehicle", LandEquipmentEntityType.DRILL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M218.355,328.208c43.852,17.025,129.293,17.024,173.145-0.001l0,0v130.082 l0,0H218.355l0,0V328.208L218.355,328.208z\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"335.351,441.294 280.438,441.294 258.806,359.5 356.15,359.5\"/>\n  </g>";
            }
        },
        EARTHMOVER_DIGGER("01", "Multifunctional Earthmover/Digger", LandEquipmentEntityType.EARTHMOVER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"242,315 260,302 350,302 368,315\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305\" x2=\"305\" y1=\"302\" y2=\"355\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245\" x2=\"245\" y1=\"330\" y2=\"485\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"365\" x2=\"365\" y1=\"330\" y2=\"485\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245\" x2=\"365\" y1=\"355\" y2=\"355\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245\" x2=\"365\" y1=\"460\" y2=\"460\"/>\n    <text font-family=\"sans-serif\" font-size=\"78\" transform=\"matrix(1 0 0 1 248.5 436.5)\">MF</text>\n  </g>";
            }
        },
        MINE_CLEARING_EQUIPMENT_TANK_CHASSIS("02", "Mine Clearing Equipment on Tank Chassis", LandEquipmentEntityType.MINE_CLEARING_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"305,381 245,456 365,456 305,381 305,336\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"240\" y1=\"311\" y2=\"481\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"370\" x2=\"370\" y1=\"311\" y2=\"481\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"370\" y1=\"336\" y2=\"336\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"370\" y1=\"456\" y2=\"456\"/>\n  </g>";
            }
        },
        ASSAULT_BREACHER_VEHICLE("03", "Assault Breacher Vehicle (ABV) with Combat Dozer Blade", LandEquipmentEntityType.MINE_CLEARING_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"305,381 245,456 365,456 305,381 305,336\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"240\" y1=\"311\" y2=\"481\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"370\" x2=\"370\" y1=\"311\" y2=\"481\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"370\" y1=\"336\" y2=\"336\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"240\" x2=\"370\" y1=\"456\" y2=\"456\"/>\n    <path d=\"m 304.91615,294.86493 h 38.65607 m -38.65609,41.353 v -41.353 h -38.48836\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        MINE_LAYING_EQUIPMENT_UTILITY_VEHICLE("01", "Mine Laying Equipment on Utility Vehicle", LandEquipmentEntityType.MINE_LAYING_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <ellipse cx=\"305.249\" cy=\"413.552\" rx=\"25.711\" ry=\"25.711\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.249\" x2=\"305.249\" y1=\"372.605\" y2=\"454.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.395\" x2=\"328.104\" y1=\"379.271\" y2=\"447.834\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.395\" x2=\"328.104\" y1=\"447.834\" y2=\"379.271\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"271.359\" x2=\"339.141\" y1=\"361.884\" y2=\"361.884\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"221\" x2=\"221\" y1=\"321\" y2=\"468.438\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"389.5\" x2=\"389.5\" y1=\"321\" y2=\"468.438\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"221\" x2=\"389.5\" y1=\"466.172\" y2=\"466.172\"/>\n      <path d=\"M221,323.212c73.717,27.38,94.782,27.38,168.5,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        ARMOURED_CARRIER_VOLCANO("02", "Armoured Carrier with Volcano", LandEquipmentEntityType.MINE_LAYING_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"236\" y1=\"326\" y2=\"466\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"376\" y1=\"326\" y2=\"466\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"376\" y1=\"463\" y2=\"463\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"306\" y1=\"356\" y2=\"326\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"304\" y1=\"356\" y2=\"326\"/>\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 275.9854 436)\">V</text>\n  </g>";
            }
        },
        TRUCK_VOLCANO("03", "Truck Mounted with Volcano", LandEquipmentEntityType.MINE_LAYING_EQUIPMENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0 29) scale(1 0.8)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"227\" x2=\"227\" y1=\"370\" y2=\"510\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"387\" x2=\"387\" y1=\"370\" y2=\"510\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"227\" x2=\"387\" y1=\"507.5\" y2=\"507.5\"/>\n    <path d=\"M227,372.75c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <ellipse cx=\"237\" cy=\"530\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"377\" cy=\"530\" fill=\"none\" rx=\"13\" ry=\"16.25\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1.25 275.999 491.25)\">V</text>\n  </g>";
            }
        },
        DOZER_ARMOURED("01", "Dozer-Armoured", LandEquipmentEntityType.DOZER, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"236\" y1=\"336.892\" y2=\"476.892\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"376\" y1=\"336.892\" y2=\"476.892\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"376\" y1=\"474.892\" y2=\"474.892\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236\" x2=\"308\" y1=\"366.892\" y2=\"336.892\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"376\" x2=\"304\" y1=\"366.892\" y2=\"336.892\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"306.892\" y2=\"336.892\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276\" x2=\"336\" y1=\"306.892\" y2=\"306.892\"/>\n    </g>\n  </g>";
            }
        },
        SEMI_LIGHT("01", "Light", LandEquipmentEntityType.SEMI_TRAILER_AND_TRUCK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(10 29) scale(0.9 0.8)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236.667\" x2=\"236.667\" y1=\"376.25\" y2=\"516.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"396.667\" x2=\"396.667\" y1=\"376.25\" y2=\"516.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236.667\" x2=\"396.667\" y1=\"513.75\" y2=\"513.75\"/>\n      <path d=\"M236.667,379c70,26,90,26,159.998,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <ellipse cx=\"235\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"265\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"356\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"365\" x2=\"400\" y1=\"383\" y2=\"383\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"400\" x2=\"400\" y1=\"358\" y2=\"408\"/>\n    </g>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"298\" x2=\"298\" y1=\"347.8\" y2=\"440\"/>\n    </g>\n  </g>";
            }
        },
        SEMI_MEDIUM("02", "Medium", LandEquipmentEntityType.SEMI_TRAILER_AND_TRUCK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(10 29) scale(0.9 0.8)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236.667\" x2=\"236.667\" y1=\"376.25\" y2=\"516.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"396.667\" x2=\"396.667\" y1=\"376.25\" y2=\"516.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236.667\" x2=\"396.667\" y1=\"513.75\" y2=\"513.75\"/>\n      <path d=\"M236.667,379c70,26,90,26,159.998,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <ellipse cx=\"235\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"265\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"356\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"365\" x2=\"400\" y1=\"383\" y2=\"383\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"400\" x2=\"400\" y1=\"358\" y2=\"408\"/>\n    </g>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"314\" x2=\"314\" y1=\"347\" y2=\"440\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"284\" x2=\"284\" y1=\"347\" y2=\"440\"/>\n    </g>\n  </g>";
            }
        },
        SEMI_HEAVY("03", "Heavy", LandEquipmentEntityType.SEMI_TRAILER_AND_TRUCK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"translate(10 29) scale(0.9 0.8)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236.667\" x2=\"236.667\" y1=\"376.25\" y2=\"516.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"396.667\" x2=\"396.667\" y1=\"376.25\" y2=\"516.25\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236.667\" x2=\"396.667\" y1=\"513.75\" y2=\"513.75\"/>\n      <path d=\"M236.667,379c70,26,90,26,159.998,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g>\n      <ellipse cx=\"235\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"265\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"356\" cy=\"458\" fill=\"none\" rx=\"13\" ry=\"13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"365\" x2=\"405\" y1=\"383\" y2=\"383\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"400\" x2=\"400\" y1=\"358\" y2=\"408\"/>\n    </g>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"297\" x2=\"297\" y1=\"348.8\" y2=\"438.8\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"267\" x2=\"267\" y1=\"346.75\" y2=\"438.8\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"327\" x2=\"327\" y1=\"343.85\" y2=\"438.8\"/>\n    </g>\n  </g>";
            }
        },
        TOW_TRUCK_LIGHT("01", "Light", LandEquipmentEntityType.TOW_TRUCK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"226.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386.5\" x2=\"386.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"386.5\" y1=\"464\" y2=\"464\"/>\n    <path d=\"M226.5,329c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M386.5,462.5l-110-95.5v45c0,15-20,15-20,0\" fill=\"none\" stroke=\"#000000\" stroke-linejoin=\"round\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"318.999\" x2=\"357.999\" y1=\"442\" y2=\"397\"/>\n  </g>";
            }
        },
        TOW_TRUCK_HEAVY("02", "Heavy", LandEquipmentEntityType.TOW_TRUCK, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"226.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"386.5\" x2=\"386.5\" y1=\"327\" y2=\"467\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"226.5\" x2=\"386.5\" y1=\"465\" y2=\"465\"/>\n    <path d=\"M226.5,329c70,26,90,26,160,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M384.833,463.167L276.5,367v45c0,15-20,15-20,0\" fill=\"none\" stroke=\"#000000\" stroke-linejoin=\"round\" stroke-width=\"5\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"309.614\" x2=\"347.614\" y1=\"431\" y2=\"387\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"290.614\" x2=\"328.614\" y1=\"415\" y2=\"371\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"328.614\" x2=\"366.614\" y1=\"447\" y2=\"402\"/>\n    </g>\n  </g>";
            }
        },
        TENT_CIVILIAN("01", "Tent - Civilian", LandEquipmentEntityType.TENT, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"305,333.5 360,358.5 390,458.5 220,458.5 250,358.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        TENT_MILITARY("02", "Tent - Military", LandEquipmentEntityType.TENT, GraphicType.MAIN_1) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"305,333.5 360,358.5 390,458.5 220,458.5 250,358.5\" stroke=\"#000000\" stroke-width=\"5\" style=\"fill:#000000;fill-opacity:1\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final LandEquipmentEntityType entityType;
    private final GraphicType graphicType;

    LandEquipmentEntitySubType(String id, String label, LandEquipmentEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
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
    public EntityType getEntityType() {
        return entityType;
    }

}