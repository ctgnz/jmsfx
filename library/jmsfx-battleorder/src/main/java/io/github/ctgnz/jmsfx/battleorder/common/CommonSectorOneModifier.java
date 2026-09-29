package io.github.ctgnz.jmsfx.battleorder.common;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum CommonSectorOneModifier implements SectorOneModifier {
        UNSPECIFIED("0", "00", "Unspecified", ModifierCategory.None),
        UAV_DRONE("1", "00", "UAV/Drone Equipped/Drone", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.486,0,0,0.486,156.28496,128.299)\">\n    <polyline points=\"206,346 206,386 306,446 406,386 406,346 306,406\"/>\n  </g>";
            }
        },
        ROBOTIC("1", "01", "Robotic", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(1.21,0,0,1.21,-329.4642,124.06885)\">\n    <path d=\"m 524.908,125.86341 -36.593,36.8516 28.48775,-12.537 8.10525,23.0431 8.422,-23.0431 27.0164,12.537 z\" style=\"fill:#000000;fill-opacity:1;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <circle cx=\"488.59473\" cy=\"162.01735\" r=\"7\" style=\"fill:#000000;fill-rule:evenodd;stroke:none;stroke-linecap:round;stroke-opacity:1\"/>\n    <circle cx=\"560.10803\" cy=\"162.01735\" r=\"7\" style=\"fill:#000000;fill-rule:evenodd;stroke:none;stroke-linecap:round;stroke-opacity:1\"/>\n    <circle cx=\"524.3307\" cy=\"173.30057\" r=\"7\" style=\"fill:#000000;fill-rule:evenodd;stroke:none;stroke-linecap:round;stroke-opacity:1\"/>\n  </g>";
            }
        },
        FIXED_WING("1", "02", "Fixed Wing", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.6,0,0,0.6,123.5384,83.2651)\">\n    <path d=\"m 422.706,395.541 c 0,17.741 -15.521,32.123 -34.665,32.123 -19.145,0 -81.748,-32.123 -81.748,-32.123 0,0 62.604,-32.123 81.748,-32.123 19.144,0 34.665,14.383 34.665,32.123 z\" stroke=\"#000000\"/>\n    <path d=\"m 187.011,395.817 c 0,-18.037 15.781,-32.661 35.246,-32.661 19.465,0 83.118,32.661 83.118,32.661 0,0 -63.653,32.66 -83.118,32.66 -19.465,0 -35.246,-14.623 -35.246,-32.66 z\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        ROTARY_WING("1", "03", "Rotary Wing", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polygon points=\"357.787,298.805 357.787,342.705 310.171,320.755\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polygon points=\"255.12,342.705 255.12,298.805 302.736,320.755\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        TILT_ROTOR("1", "04", "Tilt Rotor", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(3.1913)\">\n    <text font-family=\"sans-serif\" font-size=\"70px\" transform=\"matrix(1.0329,0,0,1,254.2549,345.1309)\">TR</text>\n  </g>";
            }
        },
        VSTOL_VTOL("1", "05", "VSTOL/VTOL or Helicopter Equipped", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(7.91402)\">\n    <text font-family=\"sans-serif\" font-size=\"54px\" transform=\"translate(226.001,344.5967)\">VTOL</text>\n  </g>";
            }
        },
        ATTACK("1", "06", "Attack or Attack/Strike", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(5.39108)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(275.0005,343.5557)\">A</text>\n  </g>";
            }
        },
        ARMOURED("1", "07", "Armoured", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.55,0,0,0.55,136.70096,99.82803)\">\n    <path d=\"m 250.552,441 c -22.895,0 -41.457,-19.98 -41.457,-44.626 0,-24.646 18.562,-44.624 41.457,-44.624\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 361.448,351.75 c 22.896,0 41.457,19.979 41.457,44.624 0,24.645 -18.561,44.626 -41.457,44.626\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"351.75\" y2=\"351.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"250.552\" x2=\"361.448\" y1=\"441\" y2=\"441\"/>\n  </g>";
            }
        },
        BALLISTIC_MISSILE("1", "08", "Ballistic Missile/Ballistic Missile Defence Shooter", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-6.08362)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"matrix(1.0329,0,0,1,254.2549,345.1309)\">BM</text>\n  </g>";
            }
        },
        BRIDGE("1", "09", "Bridge/Bridging", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polyline fill=\"none\" points=\"246.208,301.708 257.875,311.292 354.541,311.292 365.791,301.708\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"365.791,337.75 354.124,328.167 257.458,328.167 246.208,337.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CARGO("1", "10", "Cargo", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"m 305.00096,298.44883 v 43.8615 m -40.0836,-44.67616 h 80.1672 v 44.53733 h -80.1672 z\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        UTILITY("1", "11", "Utility", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(3.65085)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(275.0005,345.5557)\">U</text>\n  </g>";
            }
        },
        LIGHT("1", "12", "Light", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(2.41061)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" id=\"V\" transform=\"translate(279.0005,344.5557)\">L</text>\n  </g>";
            }
        },
        MEDIUM("1", "13", "Medium", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-4.33939)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" id=\"M\" transform=\"translate(279.0005,344.5557)\">M</text>\n  </g>";
            }
        },
        HEAVY("1", "14", "Heavy", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(2.94772)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(275.0005,344.5557)\">H</text>\n  </g>";
            }
        },
        CYBERSPACE("1", "15", "Cyberspace", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-1.4678)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(246,343.5146)\">CYB</text>\n  </g>";
            }
        },
        COMMAND_POST_NODE("1", "16", "Command Post Node", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(5.70799)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(239,343.5146)\">CPN</text>\n  </g>";
            }
        },
        JOINT_NETWORK_NODE("1", "17", "Joint Network Node", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(10.707012)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(238,344.5146)\">JNN</text>\n  </g>";
            }
        },
        RETRANSMISSION("1", "18", "Retransmission", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(4.6444886)\">\n    <text font-family=\"sans-serif\" font-size=\"54px\" transform=\"translate(226.001,344.5967)\">RTNS</text>\n  </g>";
            }
        },
        BRIGADE("1", "19", "Brigade", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"m 328.02333,292.78324 -18.66483,25.875 18.6285,26.47266 h -8.31565 l -14.74303,-21.55078 -15.10616,21.55078 h -7.84359 l 18.8464,-26.15625 -18.41063,-26.1914 h 8.27934 l 14.56146,21.26953 14.8883,-21.26953 z\" style=\"font-size:72px;stroke-width:1.01632\"/>\n  </g>";
            }
        },
        CLOSE_PROTECTION("1", "20", "Close Protection", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 247 341.5146)\">CLP</text>\n  </g>";
            }
        },
        COMBAT("1", "21", "Combat", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 242 341.5146)\">CBT</text>\n  </g>";
            }
        },
        COMMAND_CONTROL("1", "22", "Command and Control", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1.0329 0 0 1 249.001 346.3857)\">C2</text>\n  </g>";
            }
        },
        CROWD_RIOT_CONTROL("1", "23", "Crowd and Riot Control", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 242 341.5146)\">CRC</text>\n  </g>";
            }
        },
        EXPLOSIVE_ORDNANCE_DISPOSAL("1", "24", "Explosive Ordnance Disposal (EOD)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 240 343.5146)\">EOD</text>\n  </g>";
            }
        },
        INTELLIGENCE_SURVEILLANCE_RECONNAISSANCE("1", "25", "Intelligence, Surveillance, Reconnaissance", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(8.8828)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(240,343.5146)\">ISR</text>\n  </g>";
            }
        },
        MAINTENANCE("1", "26", "Maintenance", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"265.167\" x2=\"344.834\" y1=\"320.5\" y2=\"320.5\"/>\n    <path d=\"M248.834,305.167c9.021,0,16.333,7.313,16.333,16.333 c0,9.021-7.313,16.333-16.333,16.333\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M359.168,336.833c-9.021,0-16.334-7.313-16.334-16.333 c0-9.021,7.313-16.333,16.334-16.333\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MEDEVAC_MEDICAL("1", "27", "MEDEVAC/Medic/Medical", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"m 295.33155,280.58095 v 21.07482 h -21.07482 v 23.97557 h 21.07482 v 21.07482 h 23.97557 v -21.07482 h 21.07482 v -23.97557 h -21.07482 v -21.07482 z\" style=\"color:#000000;fill:#000000;stroke-width:1.11;-inkscape-stroke:none\"/>\n  </g>";
            }
        },
        SEARCH_RESCUE("1", "28", "Search and Rescue", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 239 343.5146)\">SAR</text>\n  </g>";
            }
        },
        SECURITY("1", "29", "Security", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 245 342.5146)\">SEC</text>\n  </g>";
            }
        },
        SNIPER("1", "30", "Sniper", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"236.5\" x2=\"287.5\" y1=\"309.5\" y2=\"309.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"371.25\" x2=\"321.5\" y1=\"309.5\" y2=\"309.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.083\" x2=\"305.083\" y1=\"346.705\" y2=\"309.5\"/>\n  </g>";
            }
        },
        SPECIAL_OPERATIONS_FORCES("1", "31", "Special Operations Forces", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"63\" id=\"mod1\" transform=\"matrix(1 0 0 1 237 343.5146)\">SOF</text>\n  </g>";
            }
        },
        SPECIAL_WEAPONS_TACTICS("1", "32", "Special Weapons and Tactics (SWAT)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"54\" transform=\"matrix(1 0 0 1 226.001 344.5967)\">SWAT</text>\n  </g>";
            }
        },
        GUIDED_MISSILE("1", "33", "Guided Missile", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-2.64258)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(280.2744,346.7051)\">G</text>\n  </g>";
            }
        },
        OTHER_GUIDED_MISSILE("1", "34", "Other Guided Missile", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-6.25257)\">\n    <text font-family=\"sans-serif\" font-size=\"70px\" transform=\"matrix(1.0329,0,0,1,254.2549,345.1309)\">GM</text>\n  </g>";
            }
        },
        POL("1", "35", "Petroleum, Oil and Lubricants", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" style=\"stroke-width:10;stroke-dasharray:none\" transform=\"matrix(0.6,0,0,0.6,121.40096,78.197)\">\n    <polyline fill=\"none\" points=\"306,408.679 268.649,349.985 343.351,349.985 306,408.679 306,446.029\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:10;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        WATER("1", "36", "Water", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" style=\"stroke-width:12;stroke-dasharray:none\" transform=\"matrix(0.6,0,0,0.6,120.25503,75.46648)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:12;stroke-dasharray:none\" x1=\"295.495\" x2=\"342.603\" y1=\"351.784\" y2=\"351.784\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:12;stroke-dasharray:none\" x1=\"319.04901\" x2=\"319.04901\" y1=\"375.338\" y2=\"351.784\"/>\n    <path d=\"m 224.833,375.338 h 113.059 c 37.688,0 45.227,42.397 47.108,70.662\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" style=\"stroke-width:12;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        WEAPONS("1", "37", "Weapon or Weapons", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-4.67092)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(241,343.5146)\">WPN</text>\n  </g>";
            }
        },
        CHEMICAL("1", "38", "Chemical", ModifierCategory.CBRN) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(4.2485)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(275.0005,343.5557)\">C</text>\n  </g>";
            }
        },
        BIOLOGICAL("1", "39", "Biological", ModifierCategory.CBRN) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-2.77103)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(281.0005,343.5557)\">B</text>\n  </g>";
            }
        },
        RADIOLOGICAL("1", "40", "Radiological", ModifierCategory.CBRN) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-2.68704)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" id=\"R\" transform=\"translate(279.0005,344.5557)\">R</text>\n  </g>";
            }
        },
        NUCLEAR("1", "41", "Nuclear", ModifierCategory.CBRN) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(4.00046)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(274.0005,345.5557)\">N</text>\n  </g>";
            }
        },
        DECONTAMINATION("1", "42", "Decontamination", ModifierCategory.CBRN) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-3.14407)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(279.0005,344.5557)\">D</text>\n  </g>";
            }
        },
        CIVILIAN("1", "43", "Civilian", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 253 341.5146)\">CIV</text>\n  </g>";
            }
        },
        GOVERNMENT_ORGANIZATION("1", "44", "Government Organization/Government Organization Member", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(10.73338)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" id=\"GOV\" transform=\"translate(238,345.5146)\">GO</text>\n  </g>";
            }
        },
        ACCIDENT("1", "45", "Accident", ModifierCategory.CompositeLoss) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 240 343.5146)\">ACC</text>\n  </g>";
            }
        },
        ASSASSINATION("1", "46", "Assassination", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(19.57518)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" id=\"GOV\" transform=\"translate(238,345.5146)\">AS</text>\n  </g>";
            }
        },
        EXECUTION("1", "47", "Execution", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(19.237285)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" id=\"GOV\" transform=\"translate(238,345.5146)\">EX</text>\n  </g>";
            }
        },
        KIDNAPPING("1", "48", "Kidnapping", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(1.57322)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(240,343.5146)\">KNP</text>\n  </g>";
            }
        },
        PIRACY("1", "49", "Piracy", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(29.0322)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" id=\"GOV\" transform=\"translate(238,345.5146)\">PI</text>\n  </g>";
            }
        },
        RAPE("1", "50", "Rape", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(18.30174)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" id=\"GOV\" transform=\"translate(238,345.5146)\">RA</text>\n  </g>";
            }
        },
        ANTISUBMARINE_WARFARE("1", "51", "Antisubmarine Warfare", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"ASW\" transform=\"matrix(1 0 0 1 231 344.5146)\">ASW</text>\n  </g>";
            }
        },
        ESCORT("1", "52", "Escort", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-0.9722)\">\n    <text font-family=\"sans-serif\" font-size=\"80px\" id=\"E\" transform=\"translate(279.0005,344.5557)\">E</text>\n  </g>";
            }
        },
        MINE_COUNTERMEASURES("1", "53", "Mine Countermeasures", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 233 345.5146)\">MCM</text>\n  </g>";
            }
        },
        MINE_WARFARE("1", "54", "Mine Warfare", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(6.70408)\">\n    <text font-family=\"sans-serif\" font-size=\"64px\" id=\"GOV\" transform=\"translate(238,345.5146)\">MW</text>\n  </g>";
            }
        },
        SURFACE_WARFARE("1", "55", "Surface Warfare", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"SUW\" transform=\"matrix(1 0 0 1 232 345.5146)\">SUW</text>\n  </g>";
            }
        },
        HIJACK("1", "65", "Hijack/Hijacking/Hijacker", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(15.97264)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(240,343.5146)\">HIJ</text>\n  </g>";
            }
        },
        ELECTROMAGNETIC_WARFARE("1", "66", "Electromagnetic Warfare", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(10.0908)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" id=\"GOV\" transform=\"translate(238,345.5146)\">EW</text>\n  </g>";
            }
        };

    private final String groupId;
    private final String id;
    private final String label;
    private final ModifierCategory category;

    CommonSectorOneModifier(String groupId, String id, String label, ModifierCategory category) {
        this.groupId = groupId;
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
        return category;
    }

    @Override
    public String getGraphicIdentifier() {
        return String.format("C1%s%s", getGroupId(), getId());
    }

    @Override
    public String getGroupId() {
        return groupId;
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
        return SymbolSetEnum.COMMON;
    }

    @Override
    public boolean isUnknown() {
        return "0".equals(groupId) && "00".equals(id);
    }

}