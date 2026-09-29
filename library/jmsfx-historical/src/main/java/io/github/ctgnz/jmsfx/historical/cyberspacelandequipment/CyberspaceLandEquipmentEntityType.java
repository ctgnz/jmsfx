package io.github.ctgnz.jmsfx.historical.cyberspacelandequipment;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceLandEquipmentEntityType implements EntityType {
        COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-0.88137,-3.66477)\">\n    <text font-family=\"sans-serif\" font-size=\"102px\" transform=\"translate(193,435.25)\">CMT</text>\n  </g>";
            }
        },
        NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-4.23342)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(194,431.25)\">NMT</text>\n  </g>";
            }
        },
        CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceLandEquipmentEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(12.31932,-0.39182)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(194,431.25)\">CPT</text>\n  </g>";
            }
        },
        DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(1.4,0,0,1.4,-137.54103,-56.6236)\">\n    <path d=\"M 240,345 265.84615,300 290,345 Z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 291.11538,345 25.84616,-45 24.15384,45 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 342.23077,345 25.84615,-45 24.15385,45 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(1.42815,0,0,1.61418,-143.6139,-123.54278)\">\n    <path d=\"m 249.91602,315.93555 v 10 h 102.48437 v -10 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n    <path d=\"m 342.39027,298.40584 v 45.05942 l 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n  </g>";
            }
        },
        INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(13.80371,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">ISP</text>\n  </g>";
            }
        },
        SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-8.73047,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">SOC</text>\n  </g>";
            }
        },
        ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-5.26367,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">ACO</text>\n  </g>";
            }
        },
        ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceLandEquipmentEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 203.9658 430.25)\">APT</text>\n  </g>";
            }
        },
        NATION_STATE("01", "Nation State", CyberspaceLandEquipmentEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(12.85545,-1.39182)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" style=\"display:inline\" transform=\"translate(193,432.25)\">CTA</text>\n  </g>";
            }
        },
        NON_NATION_STATE("02", "Non Nation State", CyberspaceLandEquipmentEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\" transform=\"translate(12.64135,-1.39182)\">\n    <g aria-label=\"CTA\" style=\"font-size:100px;display:inline;fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\" transform=\"translate(193,432.25)\">\n      <path d=\"m 65.91797,-5.27344 q -2.68555,1.17188 -4.88281,2.19727 -2.14844,1.0254 -5.66406,2.14844 Q 52.39258,0 48.87695,0.63477 45.41016,1.31836 41.21094,1.31836 q -7.91016,0 -14.4043,-2.19727 Q 20.36133,-3.125 15.57617,-7.86133 10.88867,-12.5 8.25195,-19.6289 5.61523,-26.80664 5.61523,-36.2793 q 0,-8.98438 2.53906,-16.06445 2.53906,-7.08008 7.32422,-11.9629 4.63867,-4.73633 11.18164,-7.22656 6.5918,-2.49023 14.5996,-2.49023 5.85938,0 11.66992,1.41602 5.85938,1.41602 12.98828,4.98047 v 11.4746 h -0.73242 q -6.00586,-5.0293 -11.91406,-7.32422 -5.9082,-2.29492 -12.64648,-2.29492 -5.51758,0 -9.96094,1.80664 -4.39453,1.75781 -7.86133,5.51758 -3.36914,3.66211 -5.27344,9.27734 -1.85547,5.5664 -1.85547,12.89063 0,7.66602 2.05078,13.1836 2.09961,5.51758 5.3711,8.98438 3.41797,3.61328 7.95898,5.3711 4.58984,1.70898 9.66797,1.70898 6.98242,0 13.08594,-2.39258 6.10352,-2.39258 11.42578,-7.17773 h 0.6836 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"M 131.44531,-64.11133 H 105.46875 V 0 H 95.80078 V -64.11133 H 69.82422 v -8.59375 h 61.6211 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 192.67578,0 h -10.30273 l -7.12891,-20.26367 H 143.79883 L 136.66992,0 h -9.81445 l 26.46484,-72.70508 h 12.89063 z m -20.41016,-28.56445 -12.74414,-35.69336 -12.79296,35.69336 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        CRIMINAL("03", "Unknown", CyberspaceLandEquipmentEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-2.66506,-1.5842)\">\n    <path d=\"m 307.66602,353.43359 c -16.84854,0 -31.14844,11.54997 -31.14844,28.23633 v 51.63867 h -10.6543 v 9.4375 h 10.6543 62.29687 10.6543 v -9.4375 h -10.6543 v -51.63867 c -0.6356,-17.3221 -14.46207,-28.23633 -31.14843,-28.23633 z m -12.24805,23.34766 c 4.96605,4.9e-4 8.9917,4.02614 8.9922,8.9922 5.9e-4,4.9668 -4.02538,8.99365 -8.9922,8.99414 -4.96757,5.9e-4 -8.99473,-4.02657 -8.99414,-8.99414 4.9e-4,-4.9668 4.02733,-8.99278 8.99414,-8.9922 z m 24.4961,0 c 4.9668,-5.9e-4 8.99365,4.02538 8.99414,8.9922 5.9e-4,4.96757 -4.02657,8.99473 -8.99414,8.99414 -4.9668,-5e-4 -8.99277,-4.02734 -8.99218,-8.99414 4.9e-4,-4.96604 4.02614,-8.9917 8.99218,-8.9922 z m -33.74804,35.81295 h 43 v 6.814 h -43 z\" style=\"fill:#000000;fill-opacity:1;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        INSIDER("04", "Insider", CyberspaceLandEquipmentEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.9\" transform=\"translate(-11.39895,-1.75657)\">\n    <text font-family=\"sans-serif\" font-size=\"110px\" transform=\"translate(214,436.25)\">INS</text>\n  </g>";
            }
        },
        SERVER("01", "Server", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.93\" style=\"stroke:#000000;stroke-opacity:1;fill:none;stroke-width:6;stroke-dasharray:none\" transform=\"translate(1.12847e-5,-0.79288)\">\n    <g>\n      <rect height=\"24\" style=\"fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-opacity:1;stroke-dasharray:none\" width=\"90\" x=\"260.00095\" y=\"353.29852\"/>\n      <circle cx=\"333.07153\" cy=\"365.29852\" r=\"4\" style=\"fill:#ffffff;fill-rule:evenodd;stroke:#000000;stroke-width:5;stroke-dasharray:none;stroke-opacity:1;fill-opacity:1\"/>\n    </g>\n    <g>\n      <rect height=\"24\" style=\"fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-opacity:1;stroke-dasharray:none\" width=\"90\" x=\"260.00095\" y=\"385.29852\"/>\n      <circle cx=\"333.07153\" cy=\"397.29852\" r=\"4\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:5;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <g>\n      <rect height=\"24\" style=\"fill:none;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-opacity:1;stroke-dasharray:none\" width=\"90\" x=\"260.00095\" y=\"417.29852\"/>\n      <circle cx=\"333.07153\" cy=\"429.29852\" r=\"4\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:5;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        MOBILE_SMARTPHONE("02", "Mobile/Smartphone", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-2.23818)\">\n    <rect height=\"90\" rx=\"5\" ry=\"5\" style=\"fill:#000000;fill-rule:evenodd;stroke:#000000;stroke-width:6\" width=\"50\" x=\"282.23914\" y=\"350.8919\"/>\n    <rect height=\"77.45022\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:7.74823\" width=\"50\" x=\"282.23914\" y=\"354.91586\"/>\n    <rect height=\"2\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:6\" width=\"35\" x=\"289.73914\" y=\"350.25623\"/>\n    <circle cx=\"307.23914\" cy=\"437.97922\" r=\"4.5\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:6\"/>\n  </g>";
            }
        },
        TABLET_MOBILE_PERSONAL_DEVICE("03", "Tablet/Mobile Personal Device", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0,-1.60588,1.49791,0,-288.01064,889.8963)\">\n    <rect height=\"90\" rx=\"5\" ry=\"5\" style=\"fill:#000000;fill-rule:evenodd;stroke:#000000;stroke-width:6\" width=\"50\" x=\"282.23914\" y=\"350.8919\"/>\n    <rect height=\"77.45022\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:7.74823\" width=\"50\" x=\"282.23914\" y=\"354.91586\"/>\n    <circle cx=\"307.23914\" cy=\"437.97922\" r=\"3\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:6\"/>\n  </g>";
            }
        },
        WORKSTATION("04", "Workstation", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"70\" style=\"fill:#fffffe;fill-rule:evenodd;stroke:#000000;stroke-width:6;fill-opacity:1\" width=\"120\" x=\"253.51192\" y=\"351.50058\"/>\n    <rect height=\"10\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:6.97896\" width=\"80\" x=\"273.5119\" y=\"432.8127\"/>\n    <rect height=\"10\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:6\" width=\"6\" x=\"310.5119\" y=\"423.41885\"/>\n  </g>";
            }
        },
        LAPTOP("05", "Laptop", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-6.0613,-0.10614)\">\n    <rect height=\"74.80269\" rx=\"5.99013\" ry=\"6.41166\" style=\"fill:#fffffe;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:6.1973\" width=\"119.80269\" x=\"253.61058\" y=\"351.59924\"/>\n    <path d=\"m 240.51192,431.52313 h 146 c 0,0 0.0119,9.13947 -9.99997,12 h -126 c -9.85294,-3.17837 -10.00003,-12 -10.00003,-12 z\" style=\"fill-rule:evenodd;stroke-width:0.5\"/>\n    <rect height=\"4\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:0.52946;stroke-dasharray:none;stroke-opacity:1\" width=\"20\" x=\"303.51193\" y=\"435.52313\"/>\n  </g>";
            }
        },
        INTERNET_OF_THINGS_DEVICE("06", "Internet of Things Device", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g aria-label=\"IOT\" id=\"main\" style=\"font-size:80px;line-height:1.25\">\n    <path d=\"m 244.70786,424.79518 c -1.0573,0.0324 -4.80613,0.004 -4.8,-7.125 v -55.54689 c -2.2e-4,-7.14718 3.87776,-7.07607 4.8,-7.125 0.92225,-0.049 4.82778,0.0904 4.80015,7.125 v 55.54689 c -0.0323,7.05026 -3.74284,7.09256 -4.80015,7.125 z\" style=\"stroke-width:1.2\"/>\n    <path d=\"m 381.44551,363.25194 h -24.9375 v 61.54689 c -1.7481,3.49621 -6.73857,3.49621 -9.28126,0 v -61.54689 h -24.9375 c -2.70161,-1.43027 -2.54269,-6.5019 0,-8.25 h 59.15626 c 3.17837,2.70161 2.86053,6.34298 0,8.25 z\" style=\"stroke-width:1.2\"/>\n    <g>\n      <path d=\"m 271.17188,372.10352 c -2.63546,2.68229 -4.6406,5.91146 -6.01563,9.6875 -1.37502,3.74999 -2.0625,7.9948 -2.0625,12.73437 0,4.8177 0.68748,9.10157 2.0625,12.85156 1.40367,3.75 3.3945,6.91407 5.97266,9.4922 2.57816,2.57812 5.70047,4.54427 9.36718,5.89844 3.69537,1.35416 7.79161,2.03125 12.28907,2.03125 4.61204,0 8.70828,-0.66407 12.28906,-1.99219 3.60942,-1.32812 6.73174,-3.3073 9.3672,-5.9375 2.54952,-2.52604 4.52602,-5.67709 5.92968,-9.45312 1.43231,-3.80208 2.14844,-8.09897 2.14844,-12.89063 0,-4.79166 -0.7018,-9.07552 -2.10547,-12.85156 -1.37502,-3.77604 -3.36584,-6.96615 -5.97265,-9.5703 -2.32818,-2.30674 -5.123,-4.12362 -8.38282,-5.45313 -4.41569,0.49013 -5.6256,3.34935 -2.98437,6.5293 1.87719,0.98053 3.5485,2.2724 5.00781,3.88476 3.724,4.08854 5.58594,9.90886 5.58594,17.46094 0,7.6302 -1.89057,13.47657 -5.67188,17.53906 -3.75265,4.03646 -8.8085,6.05469 -15.16797,6.05469 -6.35946,0 -11.42963,-2.01823 -15.21093,-6.05469 -3.78131,-4.0625 -5.67188,-9.90886 -5.67188,-17.53906 0,-7.55208 1.84761,-13.3724 5.54297,-17.46094 1.75019,-1.93374 3.81186,-3.4067 6.17578,-4.43164 3.0512,-3.55413 1.38275,-5.93571 -2.50781,-6.29883 -3.69552,0.75994 -7.66918,3.46764 -9.98437,5.76954 z\" style=\"stroke-width:1.04882\"/>\n      <path d=\"m 292.80652,391.89966 c -0.8811,0.0183 -4.00511,0.002 -4,-4.03353 v -31.4456 c -1.9e-4,-4.0461 3.23146,-4.00583 4,-4.03353 0.76854,-0.0277 4.02315,0.0512 4.00012,4.03353 v 31.4456 c -0.0269,3.99122 -3.11903,4.01517 -4.00012,4.03353 z\" style=\"stroke-width:0.82422\"/>\n    </g>\n  </g>";
            }
        },
        PRINTER("07", "Printer", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.93\">\n    <rect height=\"41.8025\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:5;stroke-dasharray:none\" width=\"114.61975\" x=\"251.71396\" y=\"388.46991\"/>\n    <rect height=\"31.01476\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:5;stroke-dasharray:none\" width=\"75.5142\" x=\"271.26672\" y=\"410.5857\"/>\n    <rect height=\"38.31076\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:3.52629;stroke-dasharray:none\" width=\"94.472\" x=\"261.78784\" y=\"349.4382\"/>\n    <path d=\"m 338.17843,396.34258 19.38805,0\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n    <path d=\"m 278.82933,421.54467 h 60.389\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 278.82933,431.54467 h 60.389\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        ROUTER("08", "Router", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.78,0,0,0.78,67.04581,94.94447)\">\n    <g transform=\"matrix(0,0.38135,-0.71757,0,535.04682,293.73975)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke-width:1.03595;-inkscape-stroke:none\"/>\n      <path d=\"m 342.39027,298.40584 -10.4181,6.8355 26.15192,15.69422 -26.15192,16.35862 10.4181,6.1711 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n    </g>\n    <g transform=\"matrix(0,-0.38135,-0.71757,0,535.04682,478.48273)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke-width:1.03595;-inkscape-stroke:none\"/>\n      <path d=\"m 342.39027,298.40584 -10.4181,6.8355 26.15192,15.69422 -26.15192,16.35862 10.4181,6.1711 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n    </g>\n    <g transform=\"matrix(0.38135,0,0,-0.71757,156.80086,616.85386)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke-width:1.03595;-inkscape-stroke:none\"/>\n      <path d=\"m 342.39027,298.40584 -10.4181,6.8355 26.15192,15.69422 -26.15192,16.35862 10.4181,6.1711 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n    </g>\n    <g transform=\"matrix(-0.38135,0,0,-0.71757,452.70753,616.40437)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke-width:1.03595;-inkscape-stroke:none\"/>\n      <path d=\"m 342.39027,298.40584 -10.4181,6.8355 26.15192,15.69422 -26.15192,16.35862 10.4181,6.1711 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n    </g>\n    <circle cx=\"304.7537\" cy=\"386.11124\" r=\"60\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        SWITCH("09", "Switch", CyberspaceLandEquipmentEntity.END_POINT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.78,0,0,0.78,67.04116,93.5004)\">\n    <circle cx=\"304.7537\" cy=\"386.11124\" r=\"24\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:11.5385;stroke-dasharray:none;stroke-opacity:1\"/>\n    <g style=\"stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\" transform=\"matrix(0,0.38135,-0.71757,0,560.33225,290.50518)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 342.39027,298.40584 v 45.05942 l 35.93945,-22.5297 c -0.01,-0.006 -35.93945,-22.52972 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <g style=\"stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\" transform=\"matrix(0,-0.38135,-0.71757,0,509.6897,481.2892)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 342.39027,298.40584 v 45.05942 l 35.93945,-22.5297 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <g style=\"stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\" transform=\"matrix(0.38135,0,0,-0.71757,210.2436,591.0785)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 342.39027,298.40584 v 45.05942 l 35.93945,-22.5297 c -0.22434,-0.41463 -35.93945,-22.52972 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <g style=\"stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\" transform=\"matrix(-0.38135,0,0,-0.71757,400.1698,641.73619)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 342.39027,298.40584 v 45.05942 l 35.93945,-22.5297 c -11.9782,-7.51297 -35.29286,-22.24806 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke:#000000;stroke-width:2.45083;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        HEALTH_MONITOR("01", "Health Monitor", CyberspaceLandEquipmentEntity.WEARABLE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.93\">\n    <path d=\"m 273.61534,411.97542 32.22865,29.74953 47.84717,-46.6076 c 5.9499,-16.11433 6.56978,-26.15471 -5.45408,-37.68274 -12.02387,-11.52803 -33.2203,-11.8998 -43.88056,8.42904 -10.16443,-18.34555 -29.49406,-19.5916 -41.89726,-8.92486 -12.4032,10.66675 -12.64355,30.74104 -5.702,39.17007 h 30.74118 l 7.6853,-13.88297 9.9165,26.27875 10.16443,-15.3707 h 22.31215\" style=\"fill:none;stroke:#020000;stroke-width:6.24;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        SMARTVEST("02", "Smartvest", CyberspaceLandEquipmentEntity.WEARABLE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(0.76,0,0,0.76,94.0576,130.77302)\">\n    <path d=\"M 223.916,406.19637 V 352.164 l 12.472,-4.115 -9.13464,-55.003 23.04318,-5.404 c 1.7481,11.44213 11.4391,24.0765 26.06262,24.15597 14.6235,0.0795 26.53938,-12.396 28.12856,-24.15597 l 22.88426,5.404 -8.06398,55.003 11.5602,4.115 0.31783,54.03152 c -21.13615,8.26376 -85.97495,8.10569 -107.27002,8.5e-4 z\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <rect height=\"26.96935\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4;stroke-dasharray:none;stroke-opacity:1\" width=\"49.21907\" x=\"252.83769\" y=\"330.82407\"/>\n    <rect height=\"9.43927\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:4.28782;stroke-dasharray:none;stroke-opacity:1\" width=\"23.26107\" x=\"226.43019\" y=\"364.19864\"/>\n    <rect height=\"9.43927\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:4.28782;stroke-dasharray:none;stroke-opacity:1\" width=\"23.26107\" x=\"226.43019\" y=\"386.19864\"/>\n    <rect height=\"9.43927\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:4.28782;stroke-dasharray:none;stroke-opacity:1\" width=\"23.26107\" x=\"304.92999\" y=\"386.19864\"/>\n    <rect height=\"9.43927\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:4.28782;stroke-dasharray:none;stroke-opacity:1\" width=\"23.26107\" x=\"304.92999\" y=\"364.19864\"/>\n    <rect height=\"7\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:2.02558;stroke-dasharray:none;stroke-opacity:1\" width=\"7\" x=\"260.6553\" y=\"343.72192\"/>\n    <rect height=\"7\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:2.02558;stroke-dasharray:none;stroke-opacity:1\" width=\"7\" x=\"273.95514\" y=\"343.72192\"/>\n    <rect height=\"7\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:2.02558;stroke-dasharray:none;stroke-opacity:1\" width=\"7\" x=\"287.255\" y=\"343.72192\"/>\n  </g>";
            }
        },
        SMARTWATCH("03", "Smartwatch", CyberspaceLandEquipmentEntity.WEARABLE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-19.66527,105.22792)\">\n    <rect height=\"55.32046\" rx=\"9.5351\" ry=\"9.5351\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4;stroke-dasharray:none;stroke-opacity:1\" width=\"55.32046\" x=\"293.19623\" y=\"263.63739\"/>\n    <path d=\"m 303.163,263.069 c 0,0 -0.85884,-19.00923 7.68146,-18.335 h 20.97724 c 8.42792,-0.33712 6.8633,18.335 6.8633,18.335\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 303.163,319.086 c 0,0 -0.85884,19.00923 7.68146,18.335 h 20.97724 c 8.42792,0.33712 6.8633,-18.335 6.8633,-18.335\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 355.9773,285.89427 0.15892,12.0778\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:round;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final CyberspaceLandEquipmentEntity entity;
    private final GraphicType graphicType;

    CyberspaceLandEquipmentEntityType(String id, String label, CyberspaceLandEquipmentEntity entity, GraphicType graphicType) {
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

}