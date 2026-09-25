package io.github.ctgnz.jmsfx.hallux;

import java.util.Arrays;
import java.util.List;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;

public enum HqtfDummyEnum implements HqtfDummy {
        NA("0", "Not Applicable"),
        FEINT_DUMMY("1", "Feint/Dummy", "AIR", "CYBERSPACE", "DISMOUNTED", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE") {
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
                    case "101" -> new Rectangle2D(125.75, 131.48, 360.5, 144.18);
                    case "105" -> new Rectangle2D(125.75, 131.48, 360.5, 144.18);
                    case "110" -> new Rectangle2D(132.75, 90.43, 347, 144.23);
                    case "115" -> new Rectangle2D(132.75, 90.43, 347, 144.23);
                    case "120" -> new Rectangle2D(132.75, 90.43, 347, 144.23);
                    case "127" -> new Rectangle2D(133.28, 162, 345.45, 127.26);
                    case "130" -> new Rectangle2D(132.75, 90.43, 347, 144.23);
                    case "135" -> new Rectangle2D(123.75, 116.86, 363.5, 144.08);
                    case "160" -> new Rectangle2D(132.75, 90.43, 347, 144.23);
                    case "301" -> new Rectangle2D(173.06, 72.62, 265.79, 125.38);
                    case "305" -> new Rectangle2D(173.06, 72.62, 265.79, 125.38);
                    case "310" -> new Rectangle2D(122.58, 128.81, 366, 149.69);
                    case "315" -> new Rectangle2D(158.59, 105.12, 293.82, 177.95);
                    case "320" -> new Rectangle2D(122.58, 128.81, 366, 149.69);
                    case "327" -> new Rectangle2D(170.79, 206.5, 268.41, 82);
                    case "330" -> new Rectangle2D(158.59, 105.12, 293.82, 177.95);
                    case "335" -> new Rectangle2D(174.06, 118.28, 265.79, 159.03);
                    case "360" -> new Rectangle2D(122.58, 128.81, 366, 149.69);
                    case "401" -> new Rectangle2D(170.5, 92.12, 269, 163.38);
                    case "405" -> new Rectangle2D(170.5, 92.12, 269, 163.38);
                    case "410" -> new Rectangle2D(170.5, 112.12, 269, 163.38);
                    case "415" -> new Rectangle2D(170.5, 112.12, 269, 163.38);
                    case "420" -> new Rectangle2D(170.5, 112.12, 269, 163.38);
                    case "427" -> new Rectangle2D(168.5, 173.63, 274, 60);
                    case "430" -> new Rectangle2D(170.5, 112.12, 269, 163.38);
                    case "435" -> new Rectangle2D(170.5, 91.12, 269, 163.38);
                    case "460" -> new Rectangle2D(170.5, 112.12, 269, 163.38);
                    case "601" -> new Rectangle2D(170.75, 103.08, 266.56, 128.83);
                    case "605" -> new Rectangle2D(170.75, 103.08, 266.56, 128.83);
                    case "610" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    case "615" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    case "620" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    case "627" -> new Rectangle2D(113.98, 149.87, 382.04, 195.25);
                    case "630" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    case "635" -> new Rectangle2D(170.26, 122.25, 270.99, 155.33);
                    case "660" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        HQ("2", "Headquarters", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE") {
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
                    case "101" -> new Rectangle2D(124.75, 403.95, 5, 356.18);
                    case "105" -> new Rectangle2D(124.75, 403.95, 5, 356.18);
                    case "110" -> new Rectangle2D(132.75, 386, 5, 408.5);
                    case "115" -> new Rectangle2D(132.75, 386, 5, 408.5);
                    case "120" -> new Rectangle2D(132.75, 386, 5, 408.5);
                    case "130" -> new Rectangle2D(132.75, 386, 5, 408.5);
                    case "135" -> new Rectangle2D(124.75, 377.38, 5, 417.13);
                    case "160" -> new Rectangle2D(132.75, 386, 5, 408.5);
                    case "301" -> new Rectangle2D(173.06, 481.24, 5, 280.92);
                    case "305" -> new Rectangle2D(173.06, 481.24, 5, 280.92);
                    case "310" -> new Rectangle2D(123.58, 512.25, 5, 249.91);
                    case "315" -> new Rectangle2D(159.5, 391.7, 5, 370.46);
                    case "320" -> new Rectangle2D(123.58, 512.25, 5, 249.91);
                    case "330" -> new Rectangle2D(159.5, 391.7, 5, 370.46);
                    case "335" -> new Rectangle2D(177.06, 341.31, 5, 420.85);
                    case "360" -> new Rectangle2D(123.58, 512.25, 5, 249.91);
                    case "401" -> new Rectangle2D(171.5, 532.74, 5, 229.75);
                    case "405" -> new Rectangle2D(171.5, 532.74, 5, 229.75);
                    case "410" -> new Rectangle2D(171.5, 524.5, 5, 237.99);
                    case "415" -> new Rectangle2D(171.5, 524.5, 5, 237.99);
                    case "420" -> new Rectangle2D(171.5, 524.5, 5, 237.99);
                    case "430" -> new Rectangle2D(171.5, 524.5, 5, 237.99);
                    case "435" -> new Rectangle2D(171.5, 524.5, 5, 237.99);
                    case "460" -> new Rectangle2D(171.5, 524.5, 5, 237.99);
                    case "601" -> new Rectangle2D(170.75, 513.67, 5, 247.99);
                    case "605" -> new Rectangle2D(170.75, 513.67, 5, 247.99);
                    case "610" -> new Rectangle2D(129.5, 393.67, 5, 369.49);
                    case "615" -> new Rectangle2D(129.5, 393.67, 5, 369.49);
                    case "620" -> new Rectangle2D(129.5, 393.67, 5, 369.49);
                    case "630" -> new Rectangle2D(129.5, 393.67, 5, 369.49);
                    case "635" -> new Rectangle2D(171.5, 424.01, 5, 369.49);
                    case "660" -> new Rectangle2D(129.5, 393.67, 5, 369.49);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        FEINT_DUMMY_HQ("3", "Feint/Dummy Headquarters", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE") {
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
                    case "101" -> new Rectangle2D(124.75, 131.48, 361.5, 628.64);
                    case "105" -> new Rectangle2D(124.75, 131.48, 361.5, 628.64);
                    case "110" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "115" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "120" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "130" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "135" -> new Rectangle2D(123.75, 116.86, 363.5, 677.64);
                    case "160" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "301" -> new Rectangle2D(173.06, 72.62, 265.79, 689.54);
                    case "305" -> new Rectangle2D(173.06, 72.62, 265.79, 689.54);
                    case "310" -> new Rectangle2D(122.58, 128.81, 366, 633.35);
                    case "315" -> new Rectangle2D(158.59, 105.12, 293.82, 657.04);
                    case "320" -> new Rectangle2D(122.58, 128.81, 366, 633.35);
                    case "330" -> new Rectangle2D(158.59, 105.12, 293.82, 657.04);
                    case "335" -> new Rectangle2D(174.06, 118.28, 265.79, 643.88);
                    case "360" -> new Rectangle2D(122.58, 128.81, 366, 633.35);
                    case "401" -> new Rectangle2D(170.5, 92.12, 269, 670.37);
                    case "405" -> new Rectangle2D(170.5, 92.12, 269, 670.37);
                    case "410" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "415" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "420" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "430" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "435" -> new Rectangle2D(170.5, 91.12, 269, 671.37);
                    case "460" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "601" -> new Rectangle2D(170.75, 103.08, 268.56, 658.58);
                    case "605" -> new Rectangle2D(170.75, 103.08, 268.56, 658.58);
                    case "610" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    case "615" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    case "620" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    case "630" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    case "635" -> new Rectangle2D(170.26, 122.25, 270.99, 671.25);
                    case "660" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        TF("4", "Task Force", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE") {
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
                    case "101" -> new Rectangle2D(233.5, 215.16, 144, 86);
                    case "105" -> new Rectangle2D(233.5, 215.16, 144, 86);
                    case "110" -> new Rectangle2D(234.5, 178.5, 144, 81.66);
                    case "115" -> new Rectangle2D(234.5, 178.5, 144, 81.66);
                    case "120" -> new Rectangle2D(234.5, 178.5, 144, 81.66);
                    case "130" -> new Rectangle2D(234.5, 178.5, 144, 81.66);
                    case "135" -> new Rectangle2D(216.5, 206.5, 179, 76.23);
                    case "160" -> new Rectangle2D(234.5, 178.5, 144, 81.66);
                    case "301" -> new Rectangle2D(239.5, 172.04, 131, 70.24);
                    case "305" -> new Rectangle2D(239.5, 172.04, 131, 70.24);
                    case "310" -> new Rectangle2D(247.5, 220.5, 112, 54.78);
                    case "315" -> new Rectangle2D(240.5, 209.4, 128, 56.65);
                    case "320" -> new Rectangle2D(247.5, 220.5, 112, 54.78);
                    case "330" -> new Rectangle2D(240.5, 209.4, 128, 56.65);
                    case "335" -> new Rectangle2D(241.5, 216.5, 135, 60.78);
                    case "360" -> new Rectangle2D(247.5, 220.5, 112, 54.78);
                    case "401" -> new Rectangle2D(243, 190.5, 124, 65.25);
                    case "405" -> new Rectangle2D(243, 190.5, 124, 65.25);
                    case "410" -> new Rectangle2D(243, 210.5, 124, 65.25);
                    case "415" -> new Rectangle2D(243, 210.5, 124, 65.25);
                    case "420" -> new Rectangle2D(243, 210.5, 124, 65.25);
                    case "430" -> new Rectangle2D(243, 210.5, 124, 65.25);
                    case "435" -> new Rectangle2D(243, 189.5, 124, 65.25);
                    case "460" -> new Rectangle2D(243, 210.5, 124, 65.25);
                    case "601" -> new Rectangle2D(246.5, 171.5, 119, 87.46);
                    case "605" -> new Rectangle2D(246.5, 171.5, 119, 87.46);
                    case "610" -> new Rectangle2D(246.5, 193.5, 119, 87.46);
                    case "615" -> new Rectangle2D(246.5, 193.5, 119, 87.46);
                    case "620" -> new Rectangle2D(246.5, 193.5, 119, 87.46);
                    case "630" -> new Rectangle2D(246.5, 193.5, 119, 87.46);
                    case "635" -> new Rectangle2D(244.5, 214.5, 124.25, 60.5);
                    case "660" -> new Rectangle2D(246.5, 193.5, 119, 87.46);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        FEINT_DUMMY_TF("5", "Feint/Dummy Task Force", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE") {
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
                    case "101" -> new Rectangle2D(125.75, 131.48, 360.5, 169.68);
                    case "105" -> new Rectangle2D(125.75, 131.48, 360.5, 169.68);
                    case "110" -> new Rectangle2D(132.75, 90.43, 347, 169.73);
                    case "115" -> new Rectangle2D(132.75, 90.43, 347, 169.73);
                    case "120" -> new Rectangle2D(132.75, 90.43, 347, 169.73);
                    case "130" -> new Rectangle2D(132.75, 90.43, 347, 169.73);
                    case "135" -> new Rectangle2D(123.75, 116.86, 363.5, 165.87);
                    case "160" -> new Rectangle2D(132.75, 90.43, 347, 169.73);
                    case "301" -> new Rectangle2D(173.06, 72.62, 265.79, 169.66);
                    case "305" -> new Rectangle2D(173.06, 72.62, 265.79, 169.66);
                    case "310" -> new Rectangle2D(122.58, 128.81, 366, 149.69);
                    case "315" -> new Rectangle2D(158.59, 105.12, 293.82, 177.95);
                    case "320" -> new Rectangle2D(122.58, 128.81, 366, 149.69);
                    case "330" -> new Rectangle2D(158.59, 105.12, 293.82, 177.95);
                    case "335" -> new Rectangle2D(174.06, 118.28, 265.79, 159.03);
                    case "360" -> new Rectangle2D(122.58, 128.81, 366, 149.69);
                    case "401" -> new Rectangle2D(170.5, 92.12, 269, 163.63);
                    case "405" -> new Rectangle2D(170.5, 92.12, 269, 163.63);
                    case "410" -> new Rectangle2D(170.5, 112.12, 269, 163.63);
                    case "415" -> new Rectangle2D(170.5, 112.12, 269, 163.63);
                    case "420" -> new Rectangle2D(170.5, 112.12, 269, 163.63);
                    case "430" -> new Rectangle2D(170.5, 112.12, 269, 163.63);
                    case "435" -> new Rectangle2D(170.5, 91.12, 269, 163.63);
                    case "460" -> new Rectangle2D(170.5, 112.12, 269, 163.63);
                    case "601" -> new Rectangle2D(170.75, 103.08, 266.56, 155.88);
                    case "605" -> new Rectangle2D(170.75, 103.08, 266.56, 155.88);
                    case "610" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    case "615" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    case "620" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    case "630" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    case "635" -> new Rectangle2D(170.26, 122.25, 270.99, 155.33);
                    case "660" -> new Rectangle2D(129.49, 113.38, 352.02, 188.97);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        TF_HQ("6", "Task Force Headquarters", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE") {
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
                    case "101" -> new Rectangle2D(124.75, 215.16, 252.75, 544.96);
                    case "105" -> new Rectangle2D(124.75, 215.16, 252.75, 544.96);
                    case "110" -> new Rectangle2D(132.75, 178.5, 245.75, 616);
                    case "115" -> new Rectangle2D(132.75, 178.5, 245.75, 616);
                    case "120" -> new Rectangle2D(132.75, 178.5, 245.75, 616);
                    case "130" -> new Rectangle2D(132.75, 178.5, 245.75, 616);
                    case "135" -> new Rectangle2D(124.75, 206.5, 270.75, 588);
                    case "160" -> new Rectangle2D(132.75, 178.5, 245.75, 616);
                    case "301" -> new Rectangle2D(173.06, 172.04, 197.44, 590.12);
                    case "305" -> new Rectangle2D(173.06, 172.04, 197.44, 590.12);
                    case "310" -> new Rectangle2D(123.58, 220.5, 235.92, 541.66);
                    case "315" -> new Rectangle2D(159.5, 209.4, 209, 552.76);
                    case "320" -> new Rectangle2D(123.58, 220.5, 235.92, 541.66);
                    case "330" -> new Rectangle2D(159.5, 209.4, 209, 552.76);
                    case "335" -> new Rectangle2D(177.06, 216.5, 199.44, 545.66);
                    case "360" -> new Rectangle2D(123.58, 220.5, 235.92, 541.66);
                    case "401" -> new Rectangle2D(171.5, 190.5, 195.5, 571.99);
                    case "405" -> new Rectangle2D(171.5, 190.5, 195.5, 571.99);
                    case "410" -> new Rectangle2D(171.5, 210.5, 195.5, 551.99);
                    case "415" -> new Rectangle2D(171.5, 210.5, 195.5, 551.99);
                    case "420" -> new Rectangle2D(171.5, 210.5, 195.5, 551.99);
                    case "430" -> new Rectangle2D(171.5, 210.5, 195.5, 551.99);
                    case "435" -> new Rectangle2D(171.5, 189.5, 195.5, 572.99);
                    case "460" -> new Rectangle2D(171.5, 210.5, 195.5, 551.99);
                    case "601" -> new Rectangle2D(170.75, 171.5, 194.75, 590.16);
                    case "605" -> new Rectangle2D(170.75, 171.5, 194.75, 590.16);
                    case "610" -> new Rectangle2D(129.5, 193.5, 236, 569.66);
                    case "615" -> new Rectangle2D(129.5, 193.5, 236, 569.66);
                    case "620" -> new Rectangle2D(129.5, 193.5, 236, 569.66);
                    case "630" -> new Rectangle2D(129.5, 193.5, 236, 569.66);
                    case "635" -> new Rectangle2D(171.5, 214.5, 197.25, 579);
                    case "660" -> new Rectangle2D(129.5, 193.5, 236, 569.66);
                    default -> Rectangle2D.EMPTY;
                };
            }
        },
        FEINT_DUMMY_TF_HQ("7", "Feint/Dummy Task Force Headquarters", "AIR", "CYBERSPACE", "LAND_EQUIPMENT", "LAND_INSTALLATION", "LAND_UNIT", "SEA_SUBSURFACE", "SEA_SURFACE", "SPACE") {
            @Override
            public Rectangle2D getHqtfDummyBounds(StandardIdentity identity, SymbolSet symbolSet) {
                return switch (identity.getGroupId() + symbolSet.getDimensionId()) {
                    case "101" -> new Rectangle2D(124.75, 131.48, 361.5, 628.64);
                    case "105" -> new Rectangle2D(124.75, 131.48, 361.5, 628.64);
                    case "110" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "115" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "120" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "130" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "135" -> new Rectangle2D(123.75, 116.86, 363.5, 677.64);
                    case "160" -> new Rectangle2D(132.75, 90.43, 347, 704.07);
                    case "301" -> new Rectangle2D(173.06, 72.62, 265.79, 689.54);
                    case "305" -> new Rectangle2D(173.06, 72.62, 265.79, 689.54);
                    case "310" -> new Rectangle2D(122.58, 128.81, 366, 633.35);
                    case "315" -> new Rectangle2D(158.59, 105.12, 293.82, 657.04);
                    case "320" -> new Rectangle2D(122.58, 128.81, 366, 633.35);
                    case "330" -> new Rectangle2D(158.59, 105.12, 293.82, 657.04);
                    case "335" -> new Rectangle2D(174.06, 118.28, 265.79, 643.88);
                    case "360" -> new Rectangle2D(122.58, 128.81, 366, 633.35);
                    case "401" -> new Rectangle2D(170.5, 92.12, 269, 670.37);
                    case "405" -> new Rectangle2D(170.5, 92.12, 269, 670.37);
                    case "410" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "415" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "420" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "430" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "435" -> new Rectangle2D(170.5, 91.12, 269, 671.37);
                    case "460" -> new Rectangle2D(170.5, 112.12, 269, 650.37);
                    case "601" -> new Rectangle2D(170.75, 103.08, 266.56, 658.58);
                    case "605" -> new Rectangle2D(170.75, 103.08, 266.56, 658.58);
                    case "610" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    case "615" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    case "620" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    case "630" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    case "635" -> new Rectangle2D(170.26, 122.25, 270.99, 671.25);
                    case "660" -> new Rectangle2D(129.49, 113.38, 352.02, 649.78);
                    default -> Rectangle2D.EMPTY;
                };
            }
        };

    private final String id;
    private final String label;
    private final List<String> dimensionIds;

    HqtfDummyEnum(String id, String label, String... dimensionIds) {
        this.id = id;
        this.label = label;
        this.dimensionIds = Arrays.asList(dimensionIds);
    }

    @Override
    public List<String> getDimensionIds() {
        return dimensionIds;
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
    public boolean isUnknown() {
        return this == NA;
    }

}