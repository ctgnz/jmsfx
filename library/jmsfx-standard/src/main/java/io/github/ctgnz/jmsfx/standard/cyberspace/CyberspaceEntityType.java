package io.github.ctgnz.jmsfx.standard.cyberspace;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum CyberspaceEntityType implements EntityType {
        COMBAT_MISSION_TEAM("01", "Combat Mission Team", CyberspaceEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-0.88137,-3.66477)\">\n    <text font-family=\"sans-serif\" font-size=\"102px\" transform=\"translate(193,435.25)\">CMT</text>\n  </g>";
            }
        },
        NATIONAL_MISSION_TEAM("02", "National Mission Team", CyberspaceEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-4.23342)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(194,431.25)\">NMT</text>\n  </g>";
            }
        },
        CYBER_PROTECTION_TEAM("03", "Cyber Protection Team", CyberspaceEntity.MISSION_FORCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(12.31932,-0.39182)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(194,431.25)\">CPT</text>\n  </g>";
            }
        },
        DEFENSIVE_CYBERSPACE_OPERATION("01", "Defensive Cyberspace Operation", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(1.4,0,0,1.4,-137.54103,-56.6236)\">\n    <path d=\"M 240,345 265.84615,300 290,345 Z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 291.11538,345 25.84616,-45 24.15384,45 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 342.23077,345 25.84615,-45 24.15385,45 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        OFFENSIVE_CYBERSPACE_OPERATION("02", "Cyberspace Operation", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"matrix(1.42815,0,0,1.61418,-143.6139,-123.54278)\">\n    <path d=\"m 249.91602,315.93555 v 10 h 102.48437 v -10 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n    <path d=\"m 342.39027,298.40584 v 45.05942 l 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n  </g>";
            }
        },
        INTERNET_SERVICE_PROVIDER("03", "Internet Service Provider", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(13.80371,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">ISP</text>\n  </g>";
            }
        },
        SECURITY_OPERATIONS_CENTRE("04", "Security Operations Centre", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-8.73047,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">SOC</text>\n  </g>";
            }
        },
        ACTIVE_CYBER_OPERATIONS("05", "Active Cyber Operations", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-5.26367,0.60818)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" transform=\"translate(203.9658,430.25)\">ACO</text>\n  </g>";
            }
        },
        ADVANCED_PERSISTANT_THREAT("06", "Advanced Persistant Threat", CyberspaceEntity.CYBERSPACE_UNIT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"100\" transform=\"matrix(1 0 0 1 203.9658 430.25)\">APT</text>\n  </g>";
            }
        },
        NATION_STATE("01", "Nation State", CyberspaceEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(12.85545,-1.39182)\">\n    <text font-family=\"sans-serif\" font-size=\"100px\" style=\"display:inline\" transform=\"translate(193,432.25)\">CTA</text>\n  </g>";
            }
        },
        NON_NATION_STATE("02", "Non Nation State", CyberspaceEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\" transform=\"translate(12.64135,-1.39182)\">\n    <g aria-label=\"CTA\" style=\"font-size:100px;display:inline;fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\" transform=\"translate(193,432.25)\">\n      <path d=\"m 65.91797,-5.27344 q -2.68555,1.17188 -4.88281,2.19727 -2.14844,1.0254 -5.66406,2.14844 Q 52.39258,0 48.87695,0.63477 45.41016,1.31836 41.21094,1.31836 q -7.91016,0 -14.4043,-2.19727 Q 20.36133,-3.125 15.57617,-7.86133 10.88867,-12.5 8.25195,-19.6289 5.61523,-26.80664 5.61523,-36.2793 q 0,-8.98438 2.53906,-16.06445 2.53906,-7.08008 7.32422,-11.9629 4.63867,-4.73633 11.18164,-7.22656 6.5918,-2.49023 14.5996,-2.49023 5.85938,0 11.66992,1.41602 5.85938,1.41602 12.98828,4.98047 v 11.4746 h -0.73242 q -6.00586,-5.0293 -11.91406,-7.32422 -5.9082,-2.29492 -12.64648,-2.29492 -5.51758,0 -9.96094,1.80664 -4.39453,1.75781 -7.86133,5.51758 -3.36914,3.66211 -5.27344,9.27734 -1.85547,5.5664 -1.85547,12.89063 0,7.66602 2.05078,13.1836 2.09961,5.51758 5.3711,8.98438 3.41797,3.61328 7.95898,5.3711 4.58984,1.70898 9.66797,1.70898 6.98242,0 13.08594,-2.39258 6.10352,-2.39258 11.42578,-7.17773 h 0.6836 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"M 131.44531,-64.11133 H 105.46875 V 0 H 95.80078 V -64.11133 H 69.82422 v -8.59375 h 61.6211 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 192.67578,0 h -10.30273 l -7.12891,-20.26367 H 143.79883 L 136.66992,0 h -9.81445 l 26.46484,-72.70508 h 12.89063 z m -20.41016,-28.56445 -12.74414,-35.69336 -12.79296,35.69336 z\" style=\"fill:none;stroke:#000000;stroke-width:2;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        CRIMINAL("03", "Unknown", CyberspaceEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-2.66506,-1.5842)\">\n    <path d=\"m 307.66602,353.43359 c -16.84854,0 -31.14844,11.54997 -31.14844,28.23633 v 51.63867 h -10.6543 v 9.4375 h 10.6543 62.29687 10.6543 v -9.4375 h -10.6543 v -51.63867 c -0.6356,-17.3221 -14.46207,-28.23633 -31.14843,-28.23633 z m -12.24805,23.34766 c 4.96605,4.9e-4 8.9917,4.02614 8.9922,8.9922 5.9e-4,4.9668 -4.02538,8.99365 -8.9922,8.99414 -4.96757,5.9e-4 -8.99473,-4.02657 -8.99414,-8.99414 4.9e-4,-4.9668 4.02733,-8.99278 8.99414,-8.9922 z m 24.4961,0 c 4.9668,-5.9e-4 8.99365,4.02538 8.99414,8.9922 5.9e-4,4.96757 -4.02657,8.99473 -8.99414,8.99414 -4.9668,-5e-4 -8.99277,-4.02734 -8.99218,-8.99414 4.9e-4,-4.96604 4.02614,-8.9917 8.99218,-8.9922 z m -33.74804,35.81295 h 43 v 6.814 h -43 z\" style=\"fill:#000000;fill-opacity:1;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        INSIDER("04", "Insider", CyberspaceEntity.THREAT_ACTOR, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.9\" transform=\"translate(-11.39895,-1.75657)\">\n    <text font-family=\"sans-serif\" font-size=\"110px\" transform=\"translate(214,436.25)\">INS</text>\n  </g>";
            }
        },
        FIREWALL("01", "Firewall", CyberspaceEntity.AGENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 200.49631,434.95964 15.73212,2.4e-4 v -80.90824 l 35.50965,-2.4e-4 -0.44949,80.90824 h 35.95802 v -80.908 h 35.509 v 80.908 h 35.509 v -80.908 h 35.509 v 80.908 h 15.732\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        FIRMWARE("02", "Firmware", CyberspaceEntity.AGENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.9\" transform=\"translate(8.0283,4.87869)\">\n    <text font-family=\"sans-serif\" font-size=\"120px\" transform=\"translate(200,433.25)\">FW</text>\n  </g>";
            }
        },
        BANKING("01", "Banking", CyberspaceEntity.APPLICATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 279.48666,425.25716 q -4.19094,2.25353 -7.7998,3.09308 -3.57006,0.83956 -8.4595,0.83956 -9.42962,0 -16.84137,-6.67224 -7.37295,-6.67224 -9.2744,-18.16088 h -5.19987 l 1.70742,-5.21407 h 2.91038 q -0.0777,-0.92792 -0.11642,-1.94422 -0.0388,-1.06049 -0.0388,-2.03261 0,-1.14886 0.0388,-2.29772 0.0388,-1.14887 0.11642,-2.20936 h -4.6178 l 1.70742,-5.21406 h 3.60886 q 2.25069,-11.35607 9.46843,-17.89576 7.21773,-6.53968 16.64734,-6.53968 5.47151,0 9.158,0.92793 3.72528,0.88374 6.9849,2.87216 v 9.2351 h -0.62088 q -3.1044,-2.87216 -6.94609,-4.19777 -3.8417,-1.3698 -8.65352,-1.3698 -6.09238,0 -11.05942,4.59544 -4.96704,4.55127 -6.82968,12.37238 h 18.43237 l -1.70742,5.21406 h -17.53986 q -0.0776,1.06049 -0.15522,2.20936 -0.0388,1.14886 -0.0388,2.29772 0,1.01631 0.0388,2.03261 0.0388,1.0163 0.11642,1.94422 h 14.7459 l -1.70742,5.21407 h -12.2624 q 1.90145,8.04205 7.02371,12.68168 5.12227,4.59546 10.943,4.59546 6.0924,0 9.54603,-1.3698 3.45365,-1.41398 6.0924,-4.1094 h 0.58207 z\" style=\"font-size:100px;opacity:0.93;stroke-width:0.84805\"/>\n    <path d=\"m 326.44072,405.15205 c 0,4.566 -1.56513,8.36608 -4.6954,11.40026 -3.13027,3.00472 -7.23067,4.78693 -12.3012,5.34663 v 8.79606 h -4.579 v -8.57512 c -3.41484,-0.0294 -6.62272,-0.39767 -9.62364,-1.10468 -3.00092,-0.73644 -5.60085,-1.6791 -7.7998,-2.82797 v -8.74903 h 0.62088 c 0.49153,0.41241 1.37111,1.01629 2.63874,1.81166 1.26763,0.7659 2.49646,1.39926 3.68648,1.90005 1.34524,0.5597 2.91037,1.08995 4.6954,1.59074 1.8109,0.47132 3.73821,0.75118 5.78194,0.83955 v -19.133 c -1.0348,-0.23566 -1.99199,-0.45659 -2.87157,-0.66281 -0.87958,-0.23566 -1.6945,-0.47133 -2.44472,-0.707 -4.2168,-1.20777 -7.2436,-3.01945 -9.08037,-5.435 -1.83677,-2.44502 -2.75516,-5.44973 -2.75516,-9.01416 0,-4.3598 1.50046,-8.04204 4.50139,-11.04676 3.02679,-3.00472 7.2436,-4.75747 12.65043,-5.25826 V 356.704 h 4.579 v 7.53086 c 2.61287,0.0589 5.29042,0.41244 8.03264,1.06048 2.74222,0.64808 5.04464,1.39927 6.90728,2.25355 v 8.66066 h -0.54326 c -1.94026,-1.35507 -3.97105,-2.54812 -6.0924,-3.57916 -2.09546,-1.06048 -4.86356,-1.72328 -8.30427,-1.98841 v 19.0446 c 0.7761,0.1473 1.61688,0.3535 2.52232,0.61862 0.90546,0.23567 1.6945,0.42715 2.3671,0.57443 3.85463,0.94266 6.82968,2.56285 8.92515,4.86058 2.12134,2.29773 3.18201,5.435 3.18201,9.41183 z m -21.57558,-16.21664 v -18.24925 c -2.76809,0.23567 -5.0964,1.10468 -6.9849,2.60704 -1.8885,1.4729 -2.83277,3.53496 -2.83277,6.18619 0,2.68068 0.6985,4.69855 2.09547,6.05362 1.39698,1.35507 3.97105,2.48921 7.7222,3.4024 z m 14.24144,17.3655 c 0,-2.76905 -0.76317,-4.78693 -2.2895,-6.05363 -1.50046,-1.29615 -3.95811,-2.31245 -7.37295,-3.0489 v 18.29343 c 3.1044,-0.3535 5.48444,-1.25196 7.14012,-2.6954 1.68156,-1.44345 2.52233,-3.60861 2.52233,-6.4955 z\" style=\"font-size:100px;opacity:0.93;stroke-width:0.84805\"/>\n    <path d=\"m 378.0902,428.63746 h -39.81394 v -9.14672 q 4.579,-1.41398 6.55804,-5.56757 2.01787,-4.19777 2.01787,-12.37237 h -6.82968 v -6.0978 h 6.82968 v -13.69798 q 0,-8.8374 4.88942,-14.49335 4.92824,-5.70012 12.88327,-5.70012 4.07452,0 7.0237,0.75117 2.9492,0.75118 5.43271,1.50236 v 9.10253 h -0.38806 q -2.40591,-1.85586 -5.35509,-2.91634 -2.94917,-1.06049 -6.2864,-1.06049 -5.4327,0 -8.14905,3.66753 -2.67754,3.62333 -2.67754,9.98626 V 395.453 h 16.10407 v 6.0978 h -16.10407 v 2.69541 q 0,5.56757 -2.40591,9.72115 -2.40592,4.1094 -6.2088,6.62806 v 0.48605 h 32.4798 z\" style=\"font-size:100px;opacity:0.93;stroke-width:0.84805\"/>\n    <path d=\"m 226.11596,364.94 v -13.035 h 157.77 v 13.035\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 226.11596,421.905 v 13.035 h 157.77 v -13.035\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        CLOUD("02", "Cloud", CyberspaceEntity.APPLICATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-1.4415)\">\n    <path d=\"m 262.0522,439.6 c -19.77753,0 -30.55155,-11.50708 -30.34052,-26.06992 0.21104,-14.56285 14.15891,-23.82293 21.80023,-23.59818 2.0227,-17.97957 23.14869,-17.0806 31.01475,-14.6084 2.0227,-13.25993 17.12856,-20.30706 37.7571,-20.6765 20.62854,-0.36945 33.63678,11.76164 33.71169,26.07038 16.40636,3.37117 25.5088,19.9985 25.1714,33.71169 -0.3374,13.71318 -16.40636,25.39568 -40.90352,25.17094 z\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <g transform=\"matrix(0,0.38135,-0.71757,0,544.95163,287.04086)\">\n      <path d=\"m 249.91602,315.93555 v 10 h 109.98546 v -10 z\" style=\"color:#000000;fill:#000000;stroke-width:1.03595;-inkscape-stroke:none\"/>\n      <path d=\"m 342.39027,298.40584 -10.4181,6.8355 26.15192,15.69422 -26.15192,16.35862 10.4181,6.1711 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n    </g>\n  </g>";
            }
        },
        FILESERVER("03", "Fileserver", CyberspaceEntity.APPLICATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.93\">\n    <rect height=\"20\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:3.87851\" width=\"90\" x=\"260.00095\" y=\"353.29852\"/>\n    <rect height=\"20\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:3.87851\" width=\"90\" x=\"260.00095\" y=\"385.29852\"/>\n    <rect height=\"20\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:3.87851\" width=\"90\" x=\"260.00095\" y=\"417.29852\"/>\n  </g>";
            }
        },
        SEARCH_ENGINE("04", "Search Engine", CyberspaceEntity.APPLICATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 394.063,368.00822 v 31.17176 l 21.9976,-15.58587 c -7.33143,-5.19742 -14.66502,-10.39093 -21.9976,-15.58589 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:0.67763;-inkscape-stroke:none\"/>\n    <path d=\"m 216.26,368.00822 v 31.17176 l -21.997,-15.58587 c 7.33143,-5.19742 14.66442,-10.39093 21.997,-15.58589 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:0.67763;-inkscape-stroke:none\"/>\n    <path d=\"m 216.16,383.494 h 24.90644 L 216.26,436.679 H 394.063 L 370.13427,383.494 H 394.163\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        SOCIAL_MEDIA("05", "Social Media", CyberspaceEntity.APPLICATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0,1.229)\">\n    <g>\n      <g style=\"stroke-width:6.25;stroke-dasharray:none\" transform=\"matrix(0.96,0,0,0.96,11.16713,92.14577)\">\n        <path d=\"M 306.0769,352.8784 V 307.98393\" style=\"fill:none;stroke:#000000;stroke-width:6.25;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n        <path d=\"m 288.55698,316.64664 h 35.03985\" style=\"fill:none;stroke:#000000;stroke-width:6.25;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n        <circle cx=\"306.0769\" cy=\"294.03799\" r=\"14\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6.25;stroke-dasharray:none;stroke-opacity:1\"/>\n      </g>\n      <path d=\"m 285.61296,361.698 v -11.442 h 38.776 v 11.442\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 285.61296,428.256 v 11.442 h 38.776 v -11.442\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <g>\n      <g style=\"stroke-width:6.25;stroke-dasharray:none\" transform=\"matrix(0.96,0,0,0.96,91.9512,90.77273)\">\n        <path d=\"M 269.8435,354.30865 V 308.6196\" style=\"fill:none;stroke:#000000;stroke-width:6.25;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n        <path d=\"m 252.32358,317.2823 h 35.03985\" style=\"fill:none;stroke:#000000;stroke-width:6.25;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n        <circle cx=\"269.8435\" cy=\"298.67368\" r=\"11.2\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6.25;stroke-dasharray:none;stroke-opacity:1\"/>\n      </g>\n      <path d=\"m 331.61296,361.698 v -11.442 h 38.776 v 11.442\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 331.61296,428.256 v 11.442 h 38.776 v -11.442\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <g>\n      <g style=\"stroke-width:6.25;stroke-dasharray:none\" transform=\"matrix(0.96,0,0,0.96,-0.0488,90.77273)\">\n        <path d=\"M 269.8435,354.30865 V 308.6196\" style=\"fill:none;stroke:#000000;stroke-width:6.25;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n        <path d=\"m 252.32358,317.2823 h 35.03985\" style=\"fill:none;stroke:#000000;stroke-width:6.25;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n        <circle cx=\"269.8435\" cy=\"298.67368\" r=\"11.2\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6.25;stroke-dasharray:none;stroke-opacity:1\"/>\n      </g>\n      <path d=\"m 239.61296,361.698 v -11.442 h 38.776 v 11.442\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 239.61296,428.256 v 11.442 h 38.776 v -11.442\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        MALWARE("01", "Malware", CyberspaceEntity.THREAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"stroke-width:6;stroke-dasharray:none\" transform=\"translate(-3.5769,-0.00121)\">\n    <path d=\"m 293.47825,354.29062 c -4.29947,4.10712 -6.74028,9.78849 -6.75976,15.73437 -3.6e-4,12.07275 9.78662,21.85974 21.85937,21.85938 12.07275,3.6e-4 21.85974,-9.78663 21.85938,-21.85938 -0.0198,-5.9304 -2.44836,-11.59822 -6.72852,-15.70312\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-dasharray:none\"/>\n    <path d=\"m 278.09757,433.14411 c 5.70661,1.6699 11.84722,0.94301 17.00624,-2.01306 10.45549,-6.03606 14.03778,-19.40533 8.0011,-29.86046 -6.03607,-10.45548 -19.40534,-14.03777 -29.86047,-8.0011 -5.12598,2.98235 -8.82017,7.91946 -10.23504,13.67863\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-dasharray:none\"/>\n    <path d=\"m 354.14514,406.99114 c -1.40714,-5.777 -5.10695,-10.7315 -10.2465,-13.72131 -10.45513,-6.03668 -23.8244,-2.4544 -29.86046,8.00108 -6.0367,10.45513 -2.4544,23.8244 8.0011,29.86047 5.14577,2.94806 11.26853,3.67877 16.96356,2.02449\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-dasharray:none\"/>\n    <circle cx=\"308.57785\" cy=\"397.10648\" r=\"14.53846\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        PHISHING("02", "Phishing", CyberspaceEntity.THREAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g transform=\"matrix(0.64,0,0,0.64,106.60096,159.70564)\">\n      <path d=\"m 302.34381,355 h 67.65571 l 9.6e-4,80 H 250 v -80 h 38.5938\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:7.42225\"/>\n      <path d=\"M 250,355 310,400.0454 370,355\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"M 298.10742,391.11719 253.5,435 h 113 L 321.89258,391.11719 310,400.04492 Z\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <path d=\"m 315.96297,390.43083 c 0.0386,2.64049 -4.17398,5.23234 -8.8531,5.1966 -7.14467,-0.0546 -12.4751,-8.97888 -12.4751,-8.97888 0,0 -0.7946,-8.42268 -2.54269,-11.2832 3.65512,2.06594 4.76755,2.22485 6.8335,4.76755 -3.17837,-0.7946 -4.76755,2.5427 -4.76755,2.5427\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 305,352.095 v 11.431 c -0.15892,7.787 11.08844,13.34632 11.2477,19.78527\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        SPEARPHISHING("03", "Spearphishing", CyberspaceEntity.THREAT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 250,355 h 119.99952 l 9.6e-4,80 H 250 Z\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:7.42225\"/>\n    <path d=\"M 250,355 310,400.0454 370,355\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n    <path d=\"M 298.10742,391.11719 253.5,435 h 113 L 321.89258,391.11719 310,400.04492 Z\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 283.08963,371.86914 101.67537,-1.4e-4 -9e-5,6.039 -94.07491,4e-5 z\" style=\"fill-rule:evenodd;stroke-width:0.96293\"/>\n    <rect height=\"6.0389\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:0.64488;stroke-dasharray:none;stroke-opacity:1\" width=\"45.6015\" x=\"199.28372\" y=\"371.86914\"/>\n    <path d=\"m 384.765,371.869 c 0,0 2.80415,-6.37256 11.38575,-6.84932 7.787,0.31784 11.05515,7.54766 16.1462,10.02783 -4.48264,3.06366 -6.27962,7.82225 -15.65581,7.98117 -6.4362,0.0795 -11.87614,-5.12068 -11.87614,-5.12068 z\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        DIGITAL_CURRENCY("01", "Digital Currency", CyberspaceEntity.DATA, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"m 291.45641,424.478 v 20.49362\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"M 291.45641,347.3957 V 364.89\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"M 277 361.71875 C 268.85627 361.71875 262.21484 368.36213 262.21484 376.50586 L 262.21484 412.50586 C 262.21484 420.64959 268.85627 427.29297 277 427.29297 L 333 427.29297 C 341.14373 427.29297 347.7871 420.64959 347.7871 412.50586 L 347.7871 405.56055 L 342.21484 405.56055 L 342.21484 412.50586 C 342.21484 417.6581 338.15223 421.71875 333 421.71875 L 277 421.71875 C 271.84777 421.71875 267.7871 417.6581 267.7871 412.50586 L 267.7871 376.50586 C 267.7871 371.35361 271.84777 367.29297 277 367.29297 L 333 367.29297 C 338.15223 367.29297 342.21484 371.35361 342.21484 376.50586 L 342.21484 380.45117 L 347.7871 380.45117 L 347.7871 376.50586 C 347.7871 368.36213 341.14373 361.71875 333 361.71875 L 277 361.71875 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;-inkscape-stroke:none\"/>\n    <path d=\"m 313.45641,424.478 v 20.49362\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"M 313.45641,347.3957 V 364.89\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        PERSONA("02", "Persona", CyberspaceEntity.DATA, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" opacity=\"0.93\" transform=\"translate(-0.1217,0.28209)\">\n    <g>\n      <path d=\"m 269.55623,373.03407 -0.0308,70.9835 h 71.19531 v -95.98633 l -46.22066,0.0309 z\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4\"/>\n      <path d=\"M 295.676,346.34543 V 374.155 h -28.14692\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4\"/>\n    </g>\n    <g transform=\"translate(0.1217,-0.28209)\">\n      <path d=\"M 316.70508 399.74414 A 14 14 0 0 1 307.34766 403.37695 A 14 14 0 0 1 298.0625 399.81445 C 294.01962 403.94385 285 415.24347 285 434 L 330 434 C 330 416.13632 320.62272 404.02846 316.70508 399.74414 z\" style=\"fill:none;stroke:#000000;stroke-width:4;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <circle cx=\"307.34827\" cy=\"389.3772\" r=\"14\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4;stroke-dasharray:none\"/>\n    </g>\n  </g>";
            }
        },
        DATA_PATH_SEGMENT("01", "Data Path Segment", CyberspaceEntity.PATHS, GraphicType.FREE_CANVAS) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(97.85574,28.0985)\">\n    <path d=\"m 122.68503,150.65468 64.20305,-25.42695 c 0,0 93.44404,38.14043 93.44404,38.14043\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g><g display=\"inline\" font-style=\"normal\" id=\"template\" transform=\"translate(-86.72435,-134.18963)\">\n    <g display=\"inline\" font-style=\"normal\" id=\"varT\" transform=\"translate(-16.122385,10.30876)\">\n      <text dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"383.53568\" y=\"261.52139\">T</text>\n      <rect font-style=\"normal\" height=\"34.8595\" rx=\"0\" ry=\"0\" style=\"fill:none;fill-rule:evenodd;stroke:#0000ff;stroke-width:1.86791;stroke-dasharray:none\" width=\"36.3596\" x=\"372.7504\" y=\"235.36702\"/>\n    </g>\n    <g id=\"pt2\" transform=\"translate(-55.376888,-49.7691)\">\n      <text display=\"inline\" dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"489.64783\" y=\"461.101\">PT 2</text>\n      <path d=\"m 517.77832,435.80202 0.052,-21.317 c 0.029,-1.003 0.839,-1.79 1.817,-1.79 1.001,0 1.813,0.813 1.813,1.82 l -0.084,21.291 c 0,1 -0.809,1.816 -1.813,1.816 -0.998,-0.001 -1.785,-0.816 -1.785,-1.82 z m -8.966,-17.741 10.938,-36.087 10.732,36.166 z\" display=\"inline\" fill=\"#0000FF\" font-style=\"normal\" stroke=\"#0000ff\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" stroke-width=\"0.4335\" style=\"fill:#0000ff;fill-opacity:1\"/>\n    </g>\n    <g id=\"pt1\" transform=\"translate(213.79685,-61.68565)\">\n      <text display=\"inline\" dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"67.3806\" y=\"461.10104\">PT 1</text>\n      <path d=\"m 92.5111,435.80203 0.052,-21.317 c 0.029,-1.003 0.839,-1.79 1.817,-1.79 1.001,0 1.813,0.813 1.813,1.82 l -0.084,21.291 c 0,1 -0.809,1.816 -1.813,1.816 -0.998,-10e-4 -1.785,-0.816 -1.785,-1.82 z m -8.966,-17.741 10.94,-36.087 10.732,36.166 z\" display=\"inline\" fill=\"#0000FF\" font-style=\"normal\" stroke=\"#0000ff\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" stroke-width=\"0.4335\" style=\"fill:#0000ff;fill-opacity:1\"/>\n    </g>\n    <g id=\"pt3\" transform=\"translate(-147.20439,-87.62166)\">\n      <text display=\"inline\" dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"489.64783\" y=\"461.101\">PT 3</text>\n      <path d=\"m 517.77832,435.80202 0.052,-21.317 c 0.029,-1.003 0.839,-1.79 1.817,-1.79 1.001,0 1.813,0.813 1.813,1.82 l -0.084,21.291 c 0,1 -0.809,1.816 -1.813,1.816 -0.998,-0.001 -1.785,-0.816 -1.785,-1.82 z m -8.966,-17.741 10.938,-36.087 10.732,36.166 z\" display=\"inline\" fill=\"#0000FF\" font-style=\"normal\" stroke=\"#0000ff\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" stroke-width=\"0.4335\" style=\"fill:#0000ff;fill-opacity:1\"/>\n    </g>\n  </g>";
            }

            @Override
            public Rectangle2D getIconBounds() {
                return new Rectangle2D(114.28, 110.55, 371.45, 166.59);
            }
        },
        DATA_TUNNEL("02", "Data Tunnel", CyberspaceEntity.PATHS, GraphicType.FREE_CANVAS) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(0,14)\">\n    <path d=\"m 188.33598,111.857 24.7219,25.621 H 378.02043 L 403.591,111.857\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n    <path d=\"m 188.33598,213.6248 24.7219,-25.621 h 164.96254 l 25.57057,25.621\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n  </g><g display=\"inline\" font-style=\"normal\" id=\"template\" transform=\"translate(-7.72435,-86.18963)\">\n    <g id=\"pt2\" transform=\"translate(-136.30731,-88.72367)\">\n      <text display=\"inline\" dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"489.64783\" y=\"461.101\">PT 2</text>\n      <path d=\"m 517.77832,435.80202 0.052,-21.317 c 0.029,-1.003 0.839,-1.79 1.817,-1.79 1.001,0 1.813,0.813 1.813,1.82 l -0.084,21.291 c 0,1 -0.809,1.816 -1.813,1.816 -0.998,-0.001 -1.785,-0.816 -1.785,-1.82 z m -8.966,-17.741 10.938,-36.087 10.732,36.166 z\" display=\"inline\" fill=\"#0000FF\" font-style=\"normal\" stroke=\"#0000ff\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" stroke-width=\"0.4335\" style=\"fill:#0000ff;fill-opacity:1\"/>\n    </g>\n    <g id=\"pt1\" transform=\"translate(288.47584,-286.98885)\">\n      <text display=\"inline\" dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"67.3806\" y=\"461.10104\">PT 1</text>\n      <path d=\"m 93.50243,467.21928 0.052,21.317 c 0.029,1.003 0.839,1.79 1.817,1.79 1.001,0 1.813,-0.813 1.813,-1.82 l -0.084,-21.291 c 0,-1 -0.809,-1.816 -1.813,-1.816 -0.998,0.001 -1.785,0.816 -1.785,1.82 z m -8.966,17.741 10.94,36.087 10.732,-36.166 z\" display=\"inline\" fill=\"#0000FF\" font-style=\"normal\" stroke=\"#0000ff\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" stroke-width=\"0.4335\" style=\"fill:#0000ff;fill-opacity:1\"/>\n    </g>\n    <g display=\"inline\" font-style=\"normal\" id=\"varT\" transform=\"translate(-87.26599,-39.578)\">\n      <text dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"383.53568\" y=\"261.52139\">T</text>\n      <rect font-style=\"normal\" height=\"34.8595\" rx=\"0\" ry=\"0\" style=\"fill:none;fill-rule:evenodd;stroke:#0000ff;stroke-width:1.86791;stroke-dasharray:none\" width=\"36.3596\" x=\"372.7504\" y=\"235.36702\"/>\n    </g>\n    <g id=\"pt3\" transform=\"translate(-329.1202,-146.22056)\">\n      <text display=\"inline\" dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"435.62057\" y=\"418.96967\">PT 3</text>\n      <path d=\"m 493.72044,408.00578 21.317,0.052 c 1.003,0.029 1.79,0.839 1.79,1.817 0,1.001 -0.813,1.813 -1.82,1.813 l -21.291,-0.084 c -1,0 -1.816,-0.809 -1.816,-1.813 10e-4,-0.998 0.816,-1.785 1.82,-1.785 z m 17.741,-8.966 36.087,10.938 -36.166,10.732 z\" display=\"inline\" fill=\"#0000FF\" font-style=\"normal\" stroke=\"#0000ff\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" stroke-width=\"0.4335\" style=\"fill:#0000ff;fill-opacity:1\"/>\n    </g>\n  </g>";
            }

            @Override
            public Rectangle2D getIconBounds() {
                return new Rectangle2D(88.87, 70.67, 410.98, 215.52);
            }
        },
        NETWORK("01", "Network", CyberspaceEntity.TERRAIN, GraphicType.FREE_CANVAS) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"215.40518\" rx=\"18\" ry=\"18\" style=\"fill:none;fill-rule:evenodd;stroke:#000001;stroke-width:8;stroke-linecap:round;stroke-dasharray:none;stroke-opacity:1\" width=\"365.8737\" x=\"92.61177\" y=\"100.68933\"/>\n    <rect height=\"18.4852\" rx=\"5\" ry=\"5\" style=\"display:inline;fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000001;stroke-width:1;stroke-linecap:round;stroke-dasharray:none;stroke-opacity:1\" transform=\"translate(-146.084,2.24745)\" width=\"67.16994\" x=\"266.41504\" y=\"89.29805\"/>\n    <rect height=\"18.4852\" rx=\"7.36592\" ry=\"5\" style=\"display:inline;fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:1.21375;stroke-linecap:round;stroke-dasharray:none;stroke-opacity:1\" transform=\"translate(-34)\" width=\"98.95363\" x=\"320.80322\" y=\"90.64652\"/>\n  </g><g display=\"inline\" font-style=\"normal\" id=\"template\" transform=\"translate(-53.57225,-227.81012)\">\n    <g id=\"pt2\">\n      <text display=\"inline\" dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"403.5321\" y=\"503.63568\">PT 2</text>\n      <path d=\"m 462.95287,501.25474 16.6707,13.28552 c 0.76789,0.6459 0.88127,1.76957 0.27362,2.53588 -0.62195,0.78434 -1.76349,0.91545 -2.55253,0.28977 l -16.63045,-13.29443 c -0.78355,-0.62133 -0.92028,-1.76222 -0.29647,-2.5489 0.62087,-0.78137 1.74845,-0.89164 2.53513,-0.26783 z m 19.47182,3.99758 21.48004,30.99224 -35.00604,-14.06173 z\" display=\"inline\" fill=\"#0000FF\" font-style=\"normal\" stroke=\"#0000ff\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" stroke-width=\"0.4335\" style=\"fill:#0000ff;fill-opacity:1\"/>\n    </g>\n    <g id=\"pt1\">\n      <text display=\"inline\" dx=\"0\" dy=\"0\" fill=\"#0000FF\" font-family=\"sans-serif\" font-size=\"24px\" font-style=\"normal\" style=\"fill:#0000ff;fill-opacity:1\" x=\"196.49986\" y=\"392.60721\">PT 1</text>\n      <path d=\"m 192.51104,374.4029 -15.47753,-14.6582 c -0.71004,-0.70902 -0.72722,-1.83825 -0.0565,-2.54998 0.68654,-0.72847 1.83511,-0.76179 2.56794,-0.0711 l 15.43667,14.66366 c 0.72774,0.68585 0.76672,1.83425 0.0781,2.5649 -0.6852,0.7256 -1.81809,0.73936 -2.54874,0.0508 z m -19.06018,-5.64285 -18.75865,-32.71189 33.67999,16.99453 z\" display=\"inline\" fill=\"#0000FF\" font-style=\"normal\" stroke=\"#0000ff\" stroke-linejoin=\"bevel\" stroke-miterlimit=\"10\" stroke-width=\"0.4335\" style=\"fill:#0000ff;fill-opacity:1\"/>\n    </g>\n    <g id=\"varAY\" transform=\"translate(19.88728,228.94802)\">\n      <rect height=\"15.16186\" style=\"display:inline;fill:none;fill-opacity:1;stroke:#0000ff;stroke-width:1;stroke-dasharray:none;stroke-opacity:1\" width=\"79.38846\" x=\"330.58582\" y=\"92.3082\"/>\n      <text style=\"font-style:normal;font-weight:normal;font-size:14px;line-height:1.25;font-family:sans-serif;fill-opacity:1;stroke:#0000ff;stroke-opacity:1\" x=\"362.07886\" xml:space=\"preserve\" y=\"104.97846\">\n        <tspan style=\"fill:#0000ff;fill-opacity:1;stroke:#0000ff;stroke-opacity:1\" x=\"362.07886\" y=\"104.97846\">AY</tspan>\n      </text>\n    </g>\n    <g id=\"varT\" style=\"display:inline\" transform=\"translate(-92.51175,230.05757)\">\n      <rect height=\"18.4852\" rx=\"5\" ry=\"5\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#0000ff;stroke-width:1;stroke-linecap:round;stroke-dasharray:none;stroke-opacity:1\" width=\"67.16994\" x=\"266.41504\" y=\"89.29805\"/>\n      <text style=\"font-style:normal;font-weight:normal;font-size:14px;line-height:1.25;font-family:sans-serif;fill:#000000;fill-opacity:1;stroke:#0000ff;stroke-opacity:1\" x=\"295.23438\" xml:space=\"preserve\" y=\"103.63\">\n        <tspan style=\"stroke:#0000ff;stroke-opacity:1\" x=\"295.23438\" y=\"103.63\">T</tspan>\n      </text>\n    </g>\n  </g>";
            }

            @Override
            public Rectangle2D getIconBounds() {
                return new Rectangle2D(88.61, 90.65, 373.87, 229.45);
            }
        };

    private final String id;
    private final String label;
    private final CyberspaceEntity entity;
    private final GraphicType graphicType;

    CyberspaceEntityType(String id, String label, CyberspaceEntity entity, GraphicType graphicType) {
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
    public Entity getEntity() {
        return entity;
    }

}