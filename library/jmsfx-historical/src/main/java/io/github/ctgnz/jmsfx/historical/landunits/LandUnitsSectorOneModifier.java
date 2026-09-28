package io.github.ctgnz.jmsfx.historical.landunits;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.ModifierBounds;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum LandUnitsSectorOneModifier implements SectorOneModifier {
        TACTICAL_SATELLITE("01", "Tactical Satellite", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.54,0,0,-0.54,141.70782,535.8151)\">\n    <g id=\"Comm\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.094\" x2=\"306.094\" y1=\"381.833\" y2=\"401.833\"/>\n      <path d=\"m 237.726,353.912 c 37.114,38.465 98.271,39.559 136.738,2.445\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"Satellite\">\n      <rect height=\"44.979\" width=\"75.362\" x=\"204.216\" y=\"395.13599\"/>\n      <rect height=\"44.98\" width=\"34.588\" x=\"288.345\" y=\"395.13501\"/>\n      <rect height=\"44.98\" width=\"75.365\" x=\"331.699\" y=\"395.13501\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.656\" x2=\"333.53201\" y1=\"417.625\" y2=\"417.625\"/>\n    </g>\n  </g>";
            }
        },
        AREA("02", "Area", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 222.001 345.5967)\">AREA</text>\n  </g>";
            }
        },
        BORDER("05", "Border", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 343.5146)\">BOR</text>\n  </g>";
            }
        },
        COMMUNICATIONS_CONTINGENCY_PACKAGE("11", "Communications Contingency Package", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 242 341.5146)\">CCP</text>\n  </g>";
            }
        },
        CONSTRUCTION("12", "Construction", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"48\" transform=\"matrix(1 0 0 1 220.001 344.0059)\">CONST</text>\n  </g>";
            }
        },
        CROSS_CULTURAL_COMMUNICATION("13", "Cross Cultural Communication", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 242 341.5146)\">CCC</text>\n  </g>";
            }
        },
        DETENTION("16", "Detention", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 242 341.5146)\">DET</text>\n  </g>";
            }
        },
        DIRECT_COMMUNICATIONS("17", "Direct Communications", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <circle cx=\"251.778\" cy=\"322.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"359.167\" cy=\"322.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"288.833\" x2=\"321.5\" y1=\"322.983\" y2=\"322.983\"/>\n      <polygon points=\"320.582,332.986 336.479,323.505 320.582,314.023\"/>\n      <polygon points=\"288.751,314.105 273.73,323.015 288.751,331.924\"/>\n    </g>\n  </g>";
            }
        },
        DIVING("18", "Diving", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <circle cx=\"305.923\" cy=\"304.9\" fill=\"none\" r=\"8.869\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"306.083\" cy=\"304.755\" fill=\"none\" r=\"23.352\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect fill=\"none\" height=\"16.601\" stroke=\"#000000\" stroke-width=\"5\" width=\"10.736\" x=\"271.799\" y=\"296.455\"/>\n    <rect fill=\"none\" height=\"16.601\" stroke=\"#000000\" stroke-width=\"5\" width=\"10.736\" x=\"329.435\" y=\"296.03\"/>\n    <polygon fill=\"none\" points=\"332.818,342.833 320.516,328.791 292.25,328.791 278.125,342.833\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        DIVISION("19", "Division (Echelon of Support)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g aria-label=\"XX\" style=\"font-size:72px\" transform=\"matrix(1.0329 0 0 1 254.2549 345.1309)\">\n      <path d=\"m 46.96875,-52.34766 -18.070313,25.875 L 46.9336,0 H 38.882812 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.070313,25.875 L 96.25781,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 h -7.59375 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 L 74.25,-31.07813 88.66406,-52.34766 Z\"/>\n    </g>\n  </g>";
            }
        },
        DOG("20", "Dog", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 240 343.5146)\">DOG</text>\n  </g>";
            }
        },
        DRILLING("21", "Drilling", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polygon id=\"symbol\" points=\"325.5,341.75 285.167,341.75 279.832,291.25 330.332,291.25\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        ELECTRO_OPTICAL("22", "Electro-Optical", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"75\" transform=\"matrix(1.0329 0 0 1 255.2544 346.2158)\">EO</text>\n  </g>";
            }
        },
        ENHANCED("23", "Enhanced", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 240 343.5146)\">ENH</text>\n  </g>";
            }
        },
        FIRE_DIRECTION_CENTER("25", "Fire Direction Center", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 247 343.5146)\">FDC</text>\n  </g>";
            }
        },
        FORCE("26", "Force", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-1.04593)\">\n    <text font-family=\"sans-serif\" font-size=\"82px\" transform=\"translate(279.0005,344.5557)\">F</text>\n  </g>";
            }
        },
        FORWARD("27", "Forward", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 343.5146)\">FWD</text>\n  </g>";
            }
        },
        GROUND_STATION_MODULE("28", "Ground Station Module", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 233 343.5146)\">GSM</text>\n  </g>";
            }
        },
        LANDING_SUPPORT("29", "Landing Support", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"75\" transform=\"matrix(1.0329 0 0 1 258.2544 345.2158)\">LS</text>\n  </g>";
            }
        },
        COMPANY("30", "Company (Echelon of Support)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"305\" x2=\"305\" y1=\"290.5\" y2=\"340.5\"/>\n  </g>";
            }
        },
        METEOROLOGICAL("32", "Meteorological", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 243 344.5146)\">MET</text>\n  </g>";
            }
        },
        MISSILE("34", "Missile", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"M293,345.242v-54.558c0-4.52,3.664-8.184,8.184-8.184 h8.184c4.52,0,8.185,3.664,8.185,8.184v53.876\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MOBILE_ADVISOR_SUPPORT("35", "Mobile Advisor and Support", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <circle cx=\"251.778\" cy=\"322.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"359.167\" cy=\"322.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275\" x2=\"322\" y1=\"322.983\" y2=\"322.983\"/>\n      <polygon points=\"319.082,332.986 336.354,323.015 319.082,313.043\"/>\n    </g>\n  </g>";
            }
        },
        MOBILE_SUBSCRIBER_EQUIPMENT("36", "Mobile Subscriber Equipment", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 239 343.5146)\">MSE</text>\n  </g>";
            }
        },
        MOBILITY_SUPPORT("37", "Mobility Support", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1.0329 0 0 1 250.2554 345.4365)\">MS</text>\n  </g>";
            }
        },
        BATTALION("38", "Battalion (Echelon of Support)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"296.75\" x2=\"296.75\" y1=\"294.5\" y2=\"344.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"313.25\" x2=\"313.25\" y1=\"294.5\" y2=\"344.5\"/>\n  </g>";
            }
        },
        MULTINATIONAL("39", "Multinational", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 250.2549 346.0469)\">MN</text>\n  </g>";
            }
        },
        MULTINATIONAL_SPECIALIZED_UNIT("40", "Multinational Specialized Unit", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 239 343.5146)\">MSU</text>\n  </g>";
            }
        },
        MULTIPLE_ROCKET_LAUNCHER("41", "Multiple Rocket Launcher", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polyline fill=\"none\" points=\"255.708,313.855 306.207,284.855 355.167,313.855\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"255.708,335.855 306.207,306.855 355.167,335.855\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        NATO_MEDICAL_ROLE_1("42", "NATO Medical Role 1", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1.0329 0 0 1 318.2549 344.9854)\">1</text>\n  </g>";
            }
        },
        NATO_MEDICAL_ROLE_2("43", "NATO Medical Role 2", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1.0329 0 0 1 318.2549 344.9854)\">2</text>\n  </g>";
            }
        },
        NATO_MEDICAL_ROLE_3("44", "NATO Medical Role 3", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1.0329 0 0 1 318.2549 344.9854)\">3</text>\n  </g>";
            }
        },
        NATO_MEDICAL_ROLE_4("45", "NATO Medical Role 4", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1.0329 0 0 1 318.2549 344.9854)\">4</text>\n  </g>";
            }
        },
        NAVAL("46", "Naval", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g>\n      <path d=\"M328.495,322.854c0,10.565-12.523,19.13-23.088,19.13 c-10.565,0-22.825-8.565-22.825-19.13\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polygon points=\"288.507,327.348 282.583,324.832 276.656,327.348 282.583,313.304\"/>\n      <polygon points=\"334.42,327.348 328.495,324.832 322.568,327.348 328.495,313.304\"/>\n    </g>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.407\" x2=\"305.407\" y1=\"341.985\" y2=\"295.413\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"288.652\" x2=\"324.01\" y1=\"294.094\" y2=\"294.094\"/>\n    <circle cx=\"305.407\" cy=\"285.386\" fill=\"none\" r=\"6.333\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        UNMANNED_AIRCRAFT_SYSTEMS("47", "Unmanned Aircraft Systems (UAS)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.486,0,0,0.486,156.28496,128.299)\">\n    <polyline points=\"206,346 206,386 306,446 406,386 406,346 306,406\"/>\n  </g>";
            }
        },
        OPERATIONS("49", "Operations", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 239 343.5146)\">OPS</text>\n  </g>";
            }
        },
        RADAR("50", "Radar", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"M305.269,343.25c-23.344,0-45.269-24.937-45.269-48.281\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <polyline fill=\"none\" points=\"267.384,316.463 302.249,296.933 302.387,323.5 338.875,298.125\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RFID_INTERROGATOR_SENSOR("51", "Radio Frequency Identification (RFID) Interrogator / Sensor", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-25.89992)\">\n    <text font-family=\"sans-serif\" font-size=\"58px\" transform=\"matrix(1.0329,0,0,1,256.001,345.3857)\">RFID</text>\n  </g>";
            }
        },
        SENSOR("55", "Sensor", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"M305.151,338.686c-1.019-1.962-2.107-3.912-3.274-5.822 c-5.833-9.553-13.615-18.157-24.409-22.803c6.389-2.277,12.003-6.881,16.803-11.424c1.19-1.246,2.327-2.543,3.406-3.877 c3.39-3.8,5.446-8.132,8.096-12.511c2.356,4.519,5.272,8.659,8.624,12.43c1.116,1.258,2.28,2.474,3.488,3.649 c4.39,4.737,9.45,8.526,15.652,11.633c-5.729,3.122-10.965,6.802-15.487,11.141c-1.131,1.085-2.217,2.21-3.248,3.371 C312,328,310,332,307.197,335.805C305.958,337.615,305.151,338.686,305.151,338.686z\" stroke=\"#000000\" stroke-width=\"8\"/>\n  </g>";
            }
        },
        WEAPON("56", "Weapon/Weapons", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-9.67092)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(246,342.5146)\">WPN</text>\n  </g>";
            }
        },
        SIGNALS_INTELLIGENCE("57", "Signals Intelligence", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.082\" x2=\"305.082\" y1=\"289.75\" y2=\"345.525\"/>\n    <polyline fill=\"none\" points=\"272.619,302.015 281.407,289.498 292.401,303.852 304.313,289.498 317.142,303.852 329.052,289.498 339.546,303.752\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SINGLE_ROCKET_LAUNCHER("59", "Single Rocket Launcher", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polyline fill=\"none\" id=\"symbol\" points=\"253.5,325.167 306.207,298.75 360.833,327.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SMOKE("60", "Smoke", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" transform=\"matrix(1 0 0 1 279.0005 343.5557)\">S</text>\n  </g>";
            }
        },
        SOUND_RANGING("62", "Sound Ranging", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 246 342.5146)\">SDR</text>\n  </g>";
            }
        },
        SURVEY("65", "Survey", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polygon points=\"306.145,319.144 306.534,287.125 337.156,305.248\" stroke=\"#000000\" stroke-width=\"8\"/>\n    <polyline fill=\"none\" points=\"284.302,344.849 304.5,324.651 324.698,344.849\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        TACTICAL_EXPLOITATION("66", "Tactical Exploitation", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1.0329 0 0 1 254.2549 345.1309)\">TE</text>\n  </g>";
            }
        },
        TARGET_ACQUISITION("67", "Target Acquisition", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1.0329 0 0 1 265.2549 345.1309)\">TA</text>\n  </g>";
            }
        },
        TOPOGRAPHIC_GEOSPATIAL("68", "Topographic/Geospatial", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polyline fill=\"none\" points=\"275.5,342.353 305.92,297.077 331.034,342.353\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.92\" x2=\"305.92\" y1=\"297.077\" y2=\"275.5\"/>\n    <path d=\"M336.5,328c-7.529,6.089-20.071,11.876-31.11,11.876 c-11.505,0-23.768-5.826-31.39-12.376\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        VIDEO_IMAGERY("70", "Video Imagery (Combat Camera)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polygon fill=\"none\" points=\"319.72,342.627 263.004,342.627 263.004,297.933 340.193,297.933\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"361.161\" x2=\"361.161\" y1=\"300.199\" y2=\"340.904\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"361.161\" x2=\"323.055\" y1=\"335.213\" y2=\"335.213\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"359.954\" x2=\"337.119\" y1=\"305.891\" y2=\"305.891\"/>\n  </g>";
            }
        },
        MOBILITY_ASSAULT("71", "Mobility Assault", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-12.17021)\">\n    <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"matrix(1.0329,0,0,1,265.2549,345.1309)\">MA</text>\n  </g>";
            }
        },
        AMPHIBIOUS_WARFARE_SHIP("72", "Amphibious Warfare Ship", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.6,0,0,0.6,120.75176,75.87588)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"7.2218\" x1=\"307.083\" x2=\"372.079\" y1=\"440.89001\" y2=\"440.89001\"/>\n    <path d=\"m 307.083,444.5 -72.219,-68.607 43.331,7.222 v -36.109 h 57.774 v 36.109 l 43.331,-7.222 z\"/>\n  </g>";
            }
        },
        LOAD_HANDLING_SYSTEM("73", "Load Handling System (LHS)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(3.0488)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(241,343.5146)\">LHS</text>\n  </g>";
            }
        },
        PALLETISED_LOAD_SYSTEM("74", "Palletised Load System (PLS)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(7.50193)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(241,343.5146)\">PLS</text>\n  </g>";
            }
        },
        SUPPORT("77", "Support", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 343.5146)\">SPT</text>\n  </g>";
            }
        },
        ROUTE_RECON_CLEARANCE("79", "Route, Reconnaissance and Clearing (RRC)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 343.5146)\">RRC</text>\n  </g>";
            }
        },
        NATO_MEDICAL_ROLE_2_BASIC("81", "NATO Medical Role 2 (Basic)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1.0329 0 0 1 318.2549 344.9854)\">2B</text>\n  </g>";
            }
        },
        NATO_MEDICAL_ROLE_2_ENHANCED("82", "NATO Medical Role 2 (Enhanced)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1.0329 0 0 1 318.2549 344.9854)\">2E</text>\n  </g>";
            }
        },
        NATO_MEDICAL_ROLE_2_FORWARD("83", "NATO Medical Role 2 (Forward)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1.0329 0 0 1 318.2549 344.9854)\">2F</text>\n  </g>";
            }
        },
        ASSAULT("84", "Assault", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-24.83222,-2)\">\n    <text font-family=\"sans-serif\" font-size=\"58px\" transform=\"matrix(1.0329,0,0,1,256.001,345.3857)\">ASLT</text>\n  </g>";
            }
        },
        CRIMINAL_INVESTIGATION_DIVISION("86", "Criminal Investigation Division", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(7.38475)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(241,343.5146)\">CID</text>\n  </g>";
            }
        },
        DIGITAL("87", "Digital", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(4.20604)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(241,343.5146)\">DIG</text>\n  </g>";
            }
        },
        NETWORK_OPERATIONS("88", "Network or Network Operations", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(1.1738)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(241,343.5146)\">NET</text>\n  </g>";
            }
        },
        AIR_TERMINAL("89", "Air Terminal", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(1.17647,0,0,1.17647,-54.51608,-60.41605)\">\n    <path d=\"m 269.30082,327.3179 h 81.04841\" style=\"fill:none;stroke:#000000;stroke-width:4.25;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 278.42511,343.58167 47.99337,-48.94688\" style=\"fill:none;stroke:#000000;stroke-width:4.25;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        PIPELINE("90", "Pipeline", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.6,0,0,0.6,121.02596,73.87967)\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"306\" y1=\"374.57599\" y2=\"352.75\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"280\" x2=\"332\" y1=\"352.833\" y2=\"352.833\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"274.667\" x2=\"220\" y1=\"384.5\" y2=\"384.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.417\" x2=\"220.75\" y1=\"428.5\" y2=\"428.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"393.25\" x2=\"338.584\" y1=\"428.5\" y2=\"428.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"392.5\" x2=\"337.834\" y1=\"384.5\" y2=\"384.5\"/>\n    <rect fill=\"none\" height=\"64.674\" stroke=\"#000000\" stroke-width=\"5\" width=\"64.666\" x=\"274.667\" y=\"374.57599\"/>\n  </g>";
            }
        },
        POSTAL("91", "Postal", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"m 341.81143,341.786 c -3.62701,0 -8.1222,-0.8694 -13.4862,-2.6178 -15.978,-5.0886 -28.731,-14.0058 -38.2596,-26.745 -0.8082,-1.071 -2.68741,-4.4184 -5.6382,-10.0512 -2.556,-4.8186 -4.167,-9.5118 -4.83241,-14.073 h 51.7398 c 0,0.9396 0,1.944 0,3.015 0,5.7696 0.9396,11.3292 2.8182,16.6938 2.8194,7.6404 6.1134,13.8102 9.8694,18.4944 4.2936,5.0952 8.5908,10.194 12.8892,15.2844 z m -13.2738,-50.3412 h -45.522 c 7.7832,22.4718 23.2908,37.4124 46.5156,44.8128 5.235,1.5906 9.5334,2.3826 12.8874,2.3826 h 8.2584 c -14.493,-13.3494 -21.8712,-29.0808 -22.1394,-47.1954 z\" stroke=\"#000000\" stroke-width=\"3\"/>\n  </g>";
            }
        },
        INDEPENDENT_COMMAND("93", "Independent Command", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(2.84875,-4)\">\n    <g transform=\"matrix(1.04696,0,0,1.04696,6.19103,-14.329486)\">\n      <g>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"313.25\" x2=\"313.25\" y1=\"294.5\" y2=\"344.5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"338.25\" x2=\"288.25\" y1=\"319.5\" y2=\"319.5\"/>\n      </g>\n      <g>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"313.25\" x2=\"313.25\" y1=\"294.5\" y2=\"344.5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"338.25\" x2=\"288.25\" y1=\"319.5\" y2=\"319.5\"/>\n      </g>\n    </g>\n    <g transform=\"matrix(1.04696,0,0,1.04696,-57.80897,-14.329486)\">\n      <g>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"313.25\" x2=\"313.25\" y1=\"294.5\" y2=\"344.5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"338.25\" x2=\"288.25\" y1=\"319.5\" y2=\"319.5\"/>\n      </g>\n      <g>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"313.25\" x2=\"313.25\" y1=\"294.5\" y2=\"344.5\"/>\n        <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"338.25\" x2=\"288.25\" y1=\"319.5\" y2=\"319.5\"/>\n      </g>\n    </g>\n  </g>";
            }
        },
        THEATRE("94", "Theatre", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g aria-label=\"XXXXX\" style=\"font-size:72px\" transform=\"matrix(1.0329 0 0 1 184.3594 345.1309)\">\n      <path d=\"m 46.96875,-52.34766 -18.070313,25.875 L 46.9336,0 H 38.882812 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.070313,25.875 L 96.25781,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 h -7.59375 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 L 74.25,-31.07813 88.66406,-52.34766 Z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58203,0 h -8.05078 L 123.25781,-21.55078 108.63281,0 h -7.59375 l 18.2461,-26.15625 -17.82422,-26.1914 h 8.01562 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.07032,25.875 L 194.90625,0 h -8.05078 L 172.58203,-21.55078 157.95703,0 h -7.59375 l 18.2461,-26.15625 -17.8242,-26.1914 h 8.01562 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 244.26562,-52.34766 -18.0703,25.875 L 244.23047,0 h -8.05078 L 221.90625,-21.55078 207.28125,0 h -7.59375 l 18.2461,-26.15625 -17.82422,-26.1914 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
            }
        },
        ARMY_THEATRE_ARMY("95", "Army or Theatre Army", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g aria-label=\"XXXX\" style=\"font-size:72px\" transform=\"matrix(1.0329 0 0 1 209.3594 345.1309)\">\n      <path d=\"m 46.96875,-52.34766 -18.070313,25.875 L 46.9336,0 H 38.882812 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.070313,25.875 L 96.25781,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 h -7.59375 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 L 74.25,-31.07813 88.66406,-52.34766 Z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58203,0 h -8.05078 L 123.25781,-21.55078 108.63281,0 h -7.59375 l 18.2461,-26.15625 -17.82422,-26.1914 h 8.01562 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 194.94141,-52.34766 -18.07032,25.875 L 194.90625,0 h -8.05078 L 172.58203,-21.55078 157.95703,0 h -7.59375 l 18.2461,-26.15625 -17.8242,-26.1914 h 8.01562 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
            }
        },
        CORPS("96", "Corps", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g aria-label=\"XXX\" style=\"font-size:72px\" transform=\"matrix(1.0329 0 0 1 234.3594 345.1309)\">\n      <path d=\"m 46.96875,-52.34766 -18.070313,25.875 L 46.9336,0 H 38.882812 L 24.60938,-21.55078 9.98438,0 H 2.39063 L 20.63672,-26.15625 2.8125,-52.34766 h 8.01563 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n      <path d=\"m 96.29297,-52.34766 -18.070313,25.875 L 96.25781,0 H 88.20703 L 73.9336,-21.55078 59.3086,0 h -7.59375 L 69.96094,-26.15625 52.13672,-52.34766 h 8.01563 L 74.25,-31.07813 88.66406,-52.34766 Z\"/>\n      <path d=\"m 145.61719,-52.34766 -18.0703,25.875 L 145.58203,0 h -8.05078 L 123.25781,-21.55078 108.63281,0 h -7.59375 l 18.2461,-26.15625 -17.82422,-26.1914 h 8.01562 l 14.09766,21.26953 14.41406,-21.26953 z\"/>\n    </g>\n  </g>";
            }
        },
        HEADQUARTERS("98", "Headquarters or Headquarters Element", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"131.5\" x2=\"479.5\" y1=\"345\" y2=\"345\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandUnitsSectorOneModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
        return category;
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
        return SymbolSetEnum.LAND_UNIT;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}