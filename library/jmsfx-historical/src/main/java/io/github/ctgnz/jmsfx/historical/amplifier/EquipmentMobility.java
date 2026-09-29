package io.github.ctgnz.jmsfx.historical.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.historical.AmplifierListEnum;

public enum EquipmentMobility implements StandardAmplifierItem {
        WHEEL_LIMIT_COUNTRY("31", "Wheeled limited cross country") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(113.89, 563.75, 382.22, 55.07);
                    case "3" -> new Rectangle2D(156.89, 540.75, 296.22, 55.07);
                    case "4" -> new Rectangle2D(168.89, 525.5, 271.22, 55.07);
                    case "6" -> new Rectangle2D(130.5, 569.75, 351, 55.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"116.393\" x2=\"493.607\" y1=\"566.25\" y2=\"566.25\"/>\n    <circle cx=\"141.429\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"468.571\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"161\" x2=\"449\" y1=\"543.25\" y2=\"543.25\"/>\n    <circle cx=\"184.429\" cy=\"568.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"425.571\" cy=\"568.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"173\" x2=\"437\" y1=\"528\" y2=\"528\"/>\n    <circle cx=\"196.429\" cy=\"553.037\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"412.571\" cy=\"553.037\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"133.001\" x2=\"479\" y1=\"572.25\" y2=\"572.25\"/>\n    <circle cx=\"158.037\" cy=\"597.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"453.963\" cy=\"597.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        WHEEL_COUNTRY("32", "Wheeled cross country") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(113.89, 563.75, 382.22, 55.07);
                    case "3" -> new Rectangle2D(157.89, 539.75, 296.22, 55.07);
                    case "4" -> new Rectangle2D(169.89, 528.75, 271.22, 55.07);
                    case "6" -> new Rectangle2D(130.5, 570.75, 351, 55.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"116.393\" x2=\"493.607\" y1=\"566.25\" y2=\"566.25\"/>\n    <circle cx=\"141.429\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"305.429\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"468.571\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"162\" x2=\"450\" y1=\"542.25\" y2=\"542.25\"/>\n    <circle cx=\"185.429\" cy=\"567.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"305.429\" cy=\"567.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"426.571\" cy=\"567.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"173\" x2=\"437\" y1=\"531.25\" y2=\"531.25\"/>\n    <circle cx=\"197.429\" cy=\"556.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"305.429\" cy=\"556.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"413.571\" cy=\"556.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"133.001\" x2=\"479\" y1=\"573.25\" y2=\"573.25\"/>\n    <circle cx=\"158.037\" cy=\"598.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"306\" cy=\"598.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"453.963\" cy=\"598.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        TRACKED("33", "Tracked") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(114.39, 564.25, 383.21, 56.07);
                    case "3" -> new Rectangle2D(158, 540.25, 294.26, 56.07);
                    case "4" -> new Rectangle2D(170, 530.25, 270, 56.07);
                    case "6" -> new Rectangle2D(130, 570.25, 352, 56.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <path d=\"M469.55,617.323c0.007,0,0.015,0,0.021,0c13.827,0,25.036-11.209,25.036-25.036s-11.209-25.037-25.036-25.037H142.429h0.02 c-0.007,0-0.013,0-0.02,0c-13.828,0-25.037,11.21-25.037,25.037s11.21,25.036,25.037,25.036h327.142\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <path d=\"M430.109,593.323c0.005,0,0.012,0,0.018,0c10.565,0,19.131-11.209,19.131-25.036s-8.565-25.037-19.131-25.037H180.133h0.015 c-0.006,0-0.01,0-0.015,0c-10.567,0-19.133,11.21-19.133,25.037s8.566,25.036,19.133,25.036h249.994\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <path d=\"M419.463,583.323c0.005,0,0.011,0,0.017,0c9.676,0,17.521-11.209,17.521-25.036s-7.844-25.037-17.521-25.037H190.523h0.014 c-0.005,0-0.009,0-0.014,0c-9.678,0-17.523,11.21-17.523,25.037s7.845,25.036,17.523,25.036h228.957\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <path d=\"M456.016,623.323c0.007,0,0.015,0,0.02,0c12.684,0,22.965-11.209,22.965-25.036s-10.281-25.037-22.965-25.037h-300.07h0.018 c-0.006,0-0.012,0-0.018,0c-12.684,0-22.965,11.21-22.965,25.037s10.282,25.036,22.965,25.036h300.07\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        WHEEL_TRACK("34", "Wheeled and tracked combination") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(114.89, 564.16, 382.71, 56.07);
                    case "3" -> new Rectangle2D(140.89, 541.16, 311.11, 56.07);
                    case "4" -> new Rectangle2D(104.89, 531.16, 335.2, 56.07);
                    case "6" -> new Rectangle2D(130.5, 570.16, 351.5, 56.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <circle cx=\"142.429\" cy=\"592.2\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <path d=\"M469.55,617.236c0.007,0,0.015,0,0.021,0c13.827,0,25.036-11.209,25.036-25.036s-11.209-25.037-25.036-25.037H205.854h0.021 c-0.007,0-0.014,0-0.021,0c-13.827,0-25.036,11.21-25.036,25.037s11.209,25.036,25.036,25.036h263.717\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <circle cx=\"168.429\" cy=\"569.2\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <path d=\"M429.66,594.236c0.006,0,0.013,0,0.017,0c10.672,0,19.323-11.209,19.323-25.036s-8.651-25.037-19.323-25.037H226.141h0.016 c-0.005,0-0.011,0-0.016,0c-10.672,0-19.323,11.21-19.323,25.037s8.651,25.036,19.323,25.036h203.536\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <circle cx=\"132.429\" cy=\"559.2\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <path d=\"M415.832,584.236c0.006,0,0.014,0,0.018,0c11.734,0,21.246-11.209,21.246-25.036s-9.512-25.037-21.246-25.037H192.063h0.018 c-0.006,0-0.013,0-0.018,0c-11.733,0-21.246,11.21-21.246,25.037s9.512,25.036,21.246,25.036H415.85\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <circle cx=\"158.037\" cy=\"598.199\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <path d=\"M456.436,623.235c0.006,0,0.015,0,0.02,0c12.451,0,22.545-11.209,22.545-25.036s-10.094-25.037-22.545-25.037H218.971h0.019 c-0.006,0-0.013,0-0.019,0c-12.452,0-22.545,11.21-22.545,25.037s10.094,25.036,22.545,25.036h237.484\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        TOWED("35", "Towed") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(114.89, 538.71, 382.22, 55.07);
                    case "3" -> new Rectangle2D(133.46, 516.5, 343.07, 55.07);
                    case "4" -> new Rectangle2D(168.46, 534.5, 274.07, 55.07);
                    case "6" -> new Rectangle2D(130.5, 544.46, 351, 55.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <path d=\"M167.465,566.287h277.069H167.465z\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"142.429\" cy=\"566.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"469.571\" cy=\"566.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <path d=\"M186.037,544H424.5H186.037z\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"161\" cy=\"544.038\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"449\" cy=\"544.038\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <path d=\"M221.037,562h168.926H221.037z\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"196\" cy=\"562.038\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"415\" cy=\"562.038\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <path d=\"M183.073,572.037h245.853H183.073z\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"158.037\" cy=\"572\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"453.963\" cy=\"572\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        RAIL("36", "Rail") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(114.89, 563.75, 382.22, 55.07);
                    case "3" -> new Rectangle2D(158.5, 538.71, 293, 55.07);
                    case "4" -> new Rectangle2D(170.5, 525.71, 269, 55.07);
                    case "6" -> new Rectangle2D(129.5, 569.5, 351, 55.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"117.393\" x2=\"494.607\" y1=\"566.25\" y2=\"566.25\"/>\n    <circle cx=\"142.429\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"194.727\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"417.272\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"469.571\" cy=\"591.287\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"161\" x2=\"449\" y1=\"541.213\" y2=\"541.213\"/>\n    <circle cx=\"186.037\" cy=\"566.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"238.335\" cy=\"566.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"371.664\" cy=\"566.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"423.963\" cy=\"566.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"173\" x2=\"437\" y1=\"528.213\" y2=\"528.213\"/>\n    <circle cx=\"198.037\" cy=\"553.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"250.335\" cy=\"553.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"359.664\" cy=\"553.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"411.963\" cy=\"553.25\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" x1=\"132\" x2=\"478\" y1=\"572\" y2=\"572\"/>\n    <circle cx=\"157.037\" cy=\"597.037\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"209.334\" cy=\"597.037\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"400.664\" cy=\"597.037\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n    <circle cx=\"452.963\" cy=\"597.037\" fill=\"none\" r=\"25.037\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        PACK_ANIMALS("37", "Pack animals") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(252.93, 563.25, 106.15, 56.07);
                    case "3" -> new Rectangle2D(252.93, 538.25, 106.15, 56.07);
                    case "4" -> new Rectangle2D(252.93, 532.25, 106.15, 56.07);
                    case "6" -> new Rectangle2D(252.93, 554.25, 106.15, 56.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,616.323 280.965,566.25 306.001,616.323 331.037,566.25 356.073,616.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,591.323 280.965,541.25 306.001,591.323 331.037,541.25 356.073,591.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,585.323 280.965,535.25 306.001,585.323 331.037,535.25 356.073,585.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,607.323 280.965,557.25 306.001,607.323 331.037,557.25 356.073,607.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        MOUNTED("38", "Mounted") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(252.93, 563.25, 106.15, 56.07);
                    case "3" -> new Rectangle2D(252.93, 538.25, 106.15, 56.07);
                    case "4" -> new Rectangle2D(252.93, 532.25, 106.15, 56.07);
                    case "6" -> new Rectangle2D(252.93, 554.25, 106.15, 56.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,616.323 280.965,566.25 306.001,616.323 331.037,566.25 356.073,616.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,591.323 280.965,541.25 306.001,591.323 331.037,541.25 356.073,591.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,585.323 280.965,535.25 306.001,585.323 331.037,535.25 356.073,585.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,607.323 280.965,557.25 306.001,607.323 331.037,557.25 356.073,607.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        ANIMAL_DRAWN("39", "Animal-drawn vehicle") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(252.93, 563.25, 106.15, 56.07);
                    case "3" -> new Rectangle2D(252.93, 538.25, 106.15, 56.07);
                    case "4" -> new Rectangle2D(252.93, 532.25, 106.15, 56.07);
                    case "6" -> new Rectangle2D(252.93, 554.25, 106.15, 56.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,616.323 280.965,566.25 306.001,616.323 331.037,566.25 356.073,616.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,591.323 280.965,541.25 306.001,591.323 331.037,541.25 356.073,591.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,585.323 280.965,535.25 306.001,585.323 331.037,535.25 356.073,585.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"255.928,607.323 280.965,557.25 306.001,607.323 331.037,557.25 356.073,607.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        CYCLE("3A", "Bicycle/Motorcycle") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(252.96, 567.19, 106.09, 47.7);
                    case "3" -> new Rectangle2D(252.96, 542.19, 106.09, 47.7);
                    case "4" -> new Rectangle2D(252.96, 536.19, 106.09, 47.7);
                    case "6" -> new Rectangle2D(252.96, 558.19, 106.09, 47.7);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\" transform=\"translate(-4.6166,59.39864)\">\n    <circle cx=\"281.17471\" cy=\"613.34528\" r=\"21.10037\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-dasharray:none\" transform=\"translate(0,-81.45725)\"/>\n    <circle cx=\"340.05948\" cy=\"613.34528\" r=\"21.10037\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-dasharray:none\" transform=\"translate(0,-81.45725)\"/>\n    <polyline fill=\"none\" points=\"255.928,591.323 356.073,591.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" transform=\"matrix(0.6007,0,0,1,127.54494,-80.53537)\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\" transform=\"translate(-4.6166,34.39864)\">\n    <circle cx=\"281.17471\" cy=\"613.34528\" r=\"21.10037\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-dasharray:none\" transform=\"translate(0,-81.45725)\"/>\n    <circle cx=\"340.05948\" cy=\"613.34528\" r=\"21.10037\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-dasharray:none\" transform=\"translate(0,-81.45725)\"/>\n    <polyline fill=\"none\" points=\"255.928,591.323 356.073,591.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" transform=\"matrix(0.6007,0,0,1,127.54494,-80.53537)\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\" transform=\"translate(-4.6166,28.39864)\">\n    <circle cx=\"281.17471\" cy=\"613.34528\" r=\"21.10037\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-dasharray:none\" transform=\"translate(0,-81.45725)\"/>\n    <circle cx=\"340.05948\" cy=\"613.34528\" r=\"21.10037\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-dasharray:none\" transform=\"translate(0,-81.45725)\"/>\n    <polyline fill=\"none\" points=\"255.928,591.323 356.073,591.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" transform=\"matrix(0.6007,0,0,1,127.54494,-80.53537)\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\" transform=\"translate(-4.6166,50.39864)\">\n    <circle cx=\"281.17471\" cy=\"613.34528\" r=\"21.10037\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-dasharray:none\" transform=\"translate(0,-81.45725)\"/>\n    <circle cx=\"340.05948\" cy=\"613.34528\" r=\"21.10037\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-dasharray:none\" transform=\"translate(0,-81.45725)\"/>\n    <polyline fill=\"none\" points=\"255.928,591.323 356.073,591.323\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\" transform=\"matrix(0.6007,0,0,1,127.54494,-80.53537)\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        OVER_SNOW("41", "Over snow (prime mover)") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(113.84, 513.18, 384.33, 56.07);
                    case "3" -> new Rectangle2D(159.34, 488.14, 293.33, 56.07);
                    case "4" -> new Rectangle2D(170.34, 534.14, 268.83, 56.07);
                    case "6" -> new Rectangle2D(130, 523.18, 350.83, 56.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"116.836,516.177 166.909,566.25 495.164,566.25\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"162.336,491.14 200.365,541.213 449.664,541.213\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"173.336,537.14 208.123,587.213 436.164,587.213\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <polyline fill=\"none\" points=\"133,526.177 178.639,576.25 477.828,576.25\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        SLED("42", "Sled") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(109.39, 517.43, 383.22, 56.07);
                    case "3" -> new Rectangle2D(158, 494.43, 294, 56.07);
                    case "4" -> new Rectangle2D(158, 535.43, 294, 56.07);
                    case "6" -> new Rectangle2D(130, 522.43, 352, 56.07);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <path d=\"M464.571,520.428c13.827,0,25.036,11.209,25.036,25.036S478.398,570.5,464.571,570.5c-0.007,0-0.015,0-0.021,0h0.021H137.429 c-13.827,0-25.037-11.209-25.037-25.036s11.209-25.036,25.037-25.036c0.007,0,0.013,0,0.02,0\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <path d=\"M429.886,497.428c10.557,0,19.114,11.209,19.114,25.036s-8.558,25.036-19.114,25.036c-0.006,0-0.012,0-0.018,0h0.018h-249.77 c-10.557,0-19.116-11.209-19.116-25.036s8.558-25.036,19.116-25.036c0.005,0,0.009,0,0.015,0\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <path d=\"M429.886,538.428c10.558,0,19.114,11.209,19.114,25.036s-8.558,25.036-19.114,25.036c-0.006,0-0.012,0-0.018,0h0.018h-249.77 c-10.557,0-19.116-11.209-19.116-25.036s8.558-25.036,19.116-25.036c0.005,0,0.009,0,0.015,0\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <path d=\"M456.036,525.428c12.682,0,22.964,11.209,22.964,25.036S468.718,575.5,456.036,575.5c-0.007,0-0.016,0-0.02,0h0.02H155.965 c-12.683,0-22.965-11.209-22.965-25.036s10.281-25.036,22.965-25.036c0.007,0,0.012,0,0.019,0\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        BARGE("51", "Barge") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(114.95, 563.25, 383.21, 56.27);
                    case "3" -> new Rectangle2D(158.45, 540.25, 292.21, 41.25);
                    case "4" -> new Rectangle2D(170.95, 535.25, 268.21, 41.25);
                    case "6" -> new Rectangle2D(133.45, 569.25, 349.21, 43.25);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <path d=\"M495.119,566.25c-55.511,31.977-119.899,50.268-188.563,50.268s-133.052-18.291-188.563-50.268l-0.044,0.193h377.214\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <path d=\"M447.63,543.25c-42.12,22.424-90.975,35.25-143.074,35.25c-52.099,0-100.954-12.826-143.073-35.25l-0.034,0.136h286.214\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <path d=\"M436.133,538.25c-38.589,22.424-83.347,35.25-131.077,35.25c-47.73,0-92.489-12.826-131.076-35.25l-0.031,0.136h262.214\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <path d=\"M479.623,572.25c-50.507,23.695-109.092,37.25-171.567,37.25c-62.475,0-121.059-13.555-171.566-37.25l-0.041,0.144h343.214\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        },
        AMPHIB("52", "Amphibious") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(108.83, 559, 395.45, 61.64);
                    case "3" -> new Rectangle2D(163, 537, 284.18, 61.63);
                    case "4" -> new Rectangle2D(163, 533, 284.18, 61.63);
                    case "6" -> new Rectangle2D(130, 536, 352, 61.63);
                    default -> Rectangle2D.EMPTY;
                };
            }

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> "<g id=\"amplifier\">\n    <path d=\"M501.283,589.795c-0.012-15.354-12.462-27.796-27.817-27.796c-15.363,0-27.818,12.455-27.818,27.818 c0,15.362-12.454,27.817-27.817,27.817s-27.818-12.455-27.818-27.817c0-0.008,0-0.016,0-0.022h-0.002 c-0.011-15.354-12.462-27.796-27.817-27.796c-15.363,0-27.817,12.455-27.817,27.818c0,15.362-12.455,27.817-27.818,27.817 c-15.364,0-27.818-12.455-27.818-27.817c0-0.008,0-0.016-0.001-0.022c-0.012-15.354-12.462-27.796-27.818-27.796 c-15.363,0-27.818,12.455-27.818,27.818c0,15.362-12.455,27.817-27.818,27.817c-15.363,0-27.818-12.455-27.818-27.817 c0-0.008,0-0.016,0-0.022c-0.012-15.354-12.462-27.796-27.818-27.796c-15.363,0-27.818,12.455-27.818,27.818\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "3" -> "<g id=\"amplifier\">\n    <path d=\"M444.181,567.795h-0.002c-0.011-15.354-12.462-27.796-27.816-27.796c-15.363,0-27.817,12.455-27.817,27.818 c0,15.361-12.455,27.816-27.818,27.816s-27.817-12.455-27.817-27.816c0-0.009,0-0.017-0.001-0.022 c-0.012-15.354-12.463-27.796-27.818-27.796c-15.363,0-27.818,12.455-27.818,27.818c0,15.361-12.455,27.816-27.818,27.816 c-15.363,0-27.818-12.455-27.818-27.816c0-0.009,0-0.017,0-0.022c-0.012-15.354-12.462-27.796-27.818-27.796 c-15.363,0-27.818,12.455-27.818,27.818\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "4" -> "<g id=\"amplifier\">\n    <path d=\"M444.181,563.795h-0.002c-0.011-15.354-12.462-27.796-27.815-27.796c-15.363,0-27.817,12.455-27.817,27.818 c0,15.36-12.455,27.815-27.818,27.815c-15.362,0-27.816-12.455-27.816-27.815c0-0.01,0-0.018-0.001-0.022 c-0.012-15.354-12.463-27.796-27.818-27.796c-15.363,0-27.818,12.455-27.818,27.818c0,15.36-12.455,27.815-27.818,27.815 c-15.363,0-27.818-12.455-27.818-27.815c0-0.01,0-0.018,0-0.022c-0.012-15.354-12.462-27.796-27.818-27.796 c-15.363,0-27.818,12.455-27.818,27.818\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    case "6" -> "<g id=\"amplifier\">\n    <path d=\"M479,566.795c-0.01-15.354-11.071-27.796-24.714-27.796c-13.649,0-24.714,12.455-24.714,27.818 c0,15.361-11.064,27.816-24.714,27.816c-13.648,0-24.715-12.455-24.715-27.816c0-0.009,0-0.017,0-0.022h-0.002 c-0.009-15.354-11.07-27.796-24.713-27.796c-13.649,0-24.713,12.455-24.713,27.818c0,15.361-11.065,27.816-24.715,27.816 c-13.65,0-24.714-12.455-24.714-27.816c0-0.009,0-0.017-0.001-0.022c-0.011-15.354-11.072-27.796-24.715-27.796 c-13.648,0-24.714,12.455-24.714,27.818c0,15.361-11.065,27.816-24.714,27.816c-13.649,0-24.714-12.455-24.714-27.816 c0-0.009,0-0.017,0-0.022c-0.011-15.354-11.072-27.796-24.715-27.796c-13.648,0-24.714,12.455-24.714,27.818\" fill=\"none\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-miterlimit=\"10\" stroke-width=\"5\"/>\n  </g>";
                    default -> null;
                };
            }
        };

    private final String id;
    private final String label;

    EquipmentMobility(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.EQUIPMENT_MOBILITY;
    }

    @Override
    public String getGraphicLocation() {
        return "Amplifier";
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

    /** A frame amplifier recolours the frame rather than drawing, and a list with no graphic location has no drawings to reach. */
    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}