package io.github.ctgnz.jmsfx.hallux.amplifier;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.hallux.AmplifierListEnum;

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
        },
        CYCLE("3A", "Bicycle/Motorcycle") {
            @Override
            public Rectangle2D getAmplifierBounds(StandardIdentity identity) {
                return switch (identity.getGroupId()) {
                    case "1" -> new Rectangle2D(238.89, 563.75, 134.22, 55.07);
                    case "3" -> new Rectangle2D(228.89, 540.75, 152.22, 55.07);
                    case "4" -> new Rectangle2D(229.39, 525.5, 151.22, 55.07);
                    case "6" -> new Rectangle2D(240.5, 569.75, 131, 55.07);
                    default -> Rectangle2D.EMPTY;
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

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}