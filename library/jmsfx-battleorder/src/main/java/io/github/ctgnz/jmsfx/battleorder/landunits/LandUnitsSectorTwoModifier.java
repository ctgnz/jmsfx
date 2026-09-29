package io.github.ctgnz.jmsfx.battleorder.landunits;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum LandUnitsSectorTwoModifier implements SectorTwoModifier {
        ARCTIC("02", "Arctic", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"234\" x2=\"378\" y1=\"482.5\" y2=\"482.5\"/>\n    <path d=\"M236,452.5c-15,0-15,30,0,30\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"M376,452.5c15,0,15,30,0,30\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        BATTLE_DAMAGE_REPAIR("03", "Battle Damage Repair", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 240 490.5146)\">BDR</text>\n  </g>";
            }
        },
        CASUALTY_STAGING("05", "Casualty Staging", ModifierCategory.CloseRangeSupport) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"50\" transform=\"matrix(1 0 0 1 311 487.8174)\">CS</text>\n  </g>";
            }
        },
        CLEARING("06", "Clearing", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 491.5146)\">CLR</text>\n  </g>";
            }
        },
        CONTROL("08", "Control", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.583\" x2=\"327.582\" y1=\"478.984\" y2=\"478.984\"/>\n      <polygon points=\"325.394,486.486 338.348,479.008 325.394,471.529\"/>\n      <polygon points=\"285.771,471.482 272.817,478.961 285.771,486.439\"/>\n    </g>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.582\" x2=\"305.582\" y1=\"502\" y2=\"458\"/>\n      <polygon points=\"313.084,460.188 305.605,447.234 298.126,460.188\"/>\n      <polygon points=\"298.08,499.813 305.559,512.765 313.037,499.813\"/>\n    </g>\n  </g>";
            }
        },
        DECONTAMINATION("09", "Decontamination", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"85\" transform=\"matrix(1 0 0 1 283.0005 508.5557)\">D</text>\n  </g>";
            }
        },
        DEMOLITION("10", "Demolition", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 491.5146)\">DEM</text>\n  </g>";
            }
        },
        DENTAL("11", "Dental", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <path d=\"m 348.66705,450.37485 c 6.40522,-5.16913 15.34596,-3.20096 17.48103,-0.9535 4.66345,6.74234 0.96013,19.30762 -3.31002,21.8922 1.91033,5.84336 -1.8299,20.07825 -3.29074,21.20197 -5.731,5.11294 -5.2523,-0.17957 -5.2523,-4.9554 0.16856,-4.8882 -3.08527,-9.38252 -3.08527,-9.38252 -1.79796,-3.2588 -5.02756,-3.61519 -7.16263,0.26165 -1.47113,2.2844 -2.90947,6.17449 -2.59722,10.03748 0.0562,5.61861 -1.28567,8.2318 -4.65684,4.24259 -3.6521,-3.53972 -5.5525,-15.48862 -4.65353,-21.44435 -5.56243,-5.33768 -5.74365,-18.18555 -2.93434,-20.93867 2.97787,-4.77583 12.0453,-4.5687 19.46186,0.0386 z\" style=\"fill:#000000;stroke:none;stroke-width:0.1;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1;fill-opacity:1\"/>\n  </g>";
            }
        },
        DIGITAL("12", "Digital", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 254 493.5146)\">DIG</text>\n  </g>";
            }
        },
        ENHANCED_POSITION_LOCATION_REPORTING_SYSTEM_EPLRS("13", "Enhanced Position Location Reporting System (EPLRS)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.083\" x2=\"306.083\" y1=\"446.5\" y2=\"503.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.416\" x2=\"276.249\" y1=\"471.991\" y2=\"502.491\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306\" x2=\"336.167\" y1=\"471.5\" y2=\"502\"/>\n  </g>";
            }
        },
        EQUIPMENT("14", "Equipment", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"84\" transform=\"matrix(1 0 0 1 275.0005 506.5557)\">E</text>\n  </g>";
            }
        },
        HIGH_ALTITUDE("16", "High Altitude", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 254.2549 496.0469)\">HA</text>\n  </g>";
            }
        },
        INTERMODAL("17", "Intermodal", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <polygon fill=\"#FFFFFF\" points=\"366.75,455.347 366.75,462.162 249.25,462.162 249.25,455.347 226.5,468.424 249.25,481.5 249.25,474.685 366.75,474.685 366.75,481.5 385.5,468.424\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        INTENSIVE_CARE("18", "Intensive Care", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 315 491.8174)\">IC</text>\n  </g>";
            }
        },
        LABORATORY("20", "Laboratory", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 249 492.5146)\">LAB</text>\n  </g>";
            }
        },
        LAUNCHER("21", "Launcher", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <polyline fill=\"none\" points=\"258.377,495.24 346.5,450.833 346.5,495.24\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        LOW_ALTITUDE("23", "Low Altitude", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 259.2549 496.0469)\">LA</text>\n  </g>";
            }
        },
        MEDIUM_ALTITUDE("25", "Medium Altitude", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1.0329 0 0 1 251.2549 495.0469)\">MA</text>\n  </g>";
            }
        },
        HIGH_MEDIUM_ALTITUDE("28", "High to Medium Altitude", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 235 489.5146)\">HMA</text>\n  </g>";
            }
        },
        MULTI_CHANNEL("29", "Multi-Channel", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1.0329 0 0 1 256.2549 497.0469)\">MC</text>\n  </g>";
            }
        },
        OPTICAL_FLASH("30", "Optical (Flash)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 247 492.5146)\">OPT</text>\n  </g>";
            }
        },
        PACK_ANIMAL("31", "Pack Animal", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <path d=\"M266,497.015l20.613-41.227l20.613,41.227l20.613-41.227l20.613,41.227\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        PATIENT_EVACUATION_COORDINATION("32", "Patient Evacuation Coordination", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"42\" transform=\"matrix(1 0 0 1 309.999 477.9629)\">PEC</text>\n  </g>";
            }
        },
        PREVENTIVE_MAINTENANCE("33", "Preventive Maintenance", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1.0329 0 0 1 256.2549 497.0469)\">PM</text>\n  </g>";
            }
        },
        PSYCHOLOGICAL("34", "Psychological", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1 0 0 1 321 497.4922)\">P</text>\n  </g>";
            }
        },
        RADIO_RELAY_LOS("35", "Radio Relay Line of Sight", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <circle cx=\"305.75\" cy=\"478.545\" fill=\"none\" r=\"29.75\" stroke=\"#000000\" stroke-width=\"6\"/>\n    <g id=\"mod2\">\n      <polyline points=\"304.914,478.045 333.031,464.07 333.031,492.021\"/>\n    </g>\n    <g id=\"mod2_1_\">\n      <polyline points=\"277.801,492.041 277.801,464.641 305.263,478.34\"/>\n    </g>\n  </g>";
            }
        },
        RECOVERY_UNMANNED_SYSTEMS("37", "Recovery (Unmanned Systems)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <path d=\"M376.334,448.724c0,28.099-31.488,50.875-70.334,50.875 c-38.844,0-70.333-22.776-70.333-50.875\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RECOVERY_MAINTENANCE("38", "Recovery (Maintenance)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <path d=\"M253.025,450.5c11.294,0,20.451,9.155,20.451,20.449 c0,11.296-9.156,20.451-20.451,20.451\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"273.476\" x2=\"336.457\" y1=\"470.95\" y2=\"470.95\"/>\n    <path d=\"M356.907,491.4c-11.294,0-20.45-9.156-20.45-20.45s9.156-20.45,20.45-20.45\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RESCUE_COORDINATION_CENTER("39", "Rescue Coordination Center", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"42\" transform=\"matrix(1 0 0 1 306.999 477.9629)\">RCC</text>\n  </g>";
            }
        },
        RIVERINE("40", "Riverine", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"220.25\" x2=\"392.75\" y1=\"453.133\" y2=\"453.133\"/>\n    <path d=\"M390.5,453.133c0,22.717-37.608,41.132-84,41.132 c-46.392,0-84-18.415-84-41.132\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        SINGLE_CHANNEL("41", "Single Channel", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" transform=\"matrix(1.0329 0 0 1 257.2549 499.0469)\">SC</text>\n  </g>";
            }
        },
        STRATEGIC("44", "Strategic", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 247 492.5146)\">STR</text>\n  </g>";
            }
        },
        SUPPORT("45", "Support", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 247 492.5146)\">SPT</text>\n  </g>";
            }
        },
        TACTICAL("46", "Tactical", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 247 492.5146)\">TAC</text>\n  </g>";
            }
        },
        TOWED("47", "Towed", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <circle cx=\"251.778\" cy=\"468.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <circle cx=\"359.167\" cy=\"468.983\" fill=\"none\" r=\"18\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"272.5\" x2=\"338\" y1=\"468.983\" y2=\"468.983\"/>\n  </g>";
            }
        },
        TROOP("48", "Troop", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"85\" transform=\"matrix(1 0 0 1 279.0005 509.5557)\">T</text>\n  </g>";
            }
        },
        VERTICAL_TAKE_OFF_LANDING_VTOL("49", "Vertical or Short Take-Off and Landing (VTOL/VSTOL)", ModifierCategory.Mobility) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"52\" transform=\"matrix(1 0 0 1 240.3496 486.4736)\">VTOL</text>\n  </g>";
            }
        },
        VETERINARY("50", "Veterinary", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"68\" transform=\"matrix(1 0 0 1 321 497.4922)\">V</text>\n  </g>";
            }
        },
        HIGH_LOW_ALTITUDE("52", "High to Low Altitude", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 490.5146)\">HLA</text>\n  </g>";
            }
        },
        MEDIUM_LOW_ALTITUDE("53", "Medium to Low Altitude", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241 490.5146)\">MLA</text>\n  </g>";
            }
        },
        ATTACK("54", "Attack", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"82\" transform=\"matrix(1 0 0 1 275.0005 505.5557)\">A</text>\n  </g>";
            }
        },
        REFUEL("55", "Refuel", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"82\" transform=\"matrix(1 0 0 1 275.0005 505.5557)\">K</text>\n  </g>";
            }
        },
        UTILITY("56", "Utility", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"82\" transform=\"matrix(1 0 0 1 275.0005 507.5557)\">U</text>\n  </g>";
            }
        },
        COMBAT_SEARCH_RESCUE("57", "Combat Search and Rescue", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"52.1932\" transform=\"matrix(0.8997 0 0 1 236.0005 489.7773)\">CSAR</text>\n  </g>";
            }
        },
        GUERILLA("58", "Guerilla", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-1.16995)\">\n    <text font-family=\"sans-serif\" font-size=\"82px\" transform=\"translate(275.0005,507.5557)\">G</text>\n  </g>";
            }
        },
        AIR_ASSAULT("59", "Air Assault", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(0.84773,168)\">\n    <polyline fill=\"none\" id=\"symbol\" points=\"259.071,294.37 305.083,340.38 354.5,294.37\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        AMPHIBIOUS("60", "Amphibious", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(0.6,0,0,0.6,122.03876,220.8816)\">\n    <path d=\"m 147.176,398.398 c 0,12.438 -10.082,22.519 -22.518,22.519\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 147.176,399.268 c 0,-12.436 10.082,-22.518 22.519,-22.518 12.436,0 22.518,10.082 22.518,22.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 237.518,398.398 c 0,12.438 -10.081,22.519 -22.518,22.519 -12.436,0 -22.519,-10.081 -22.519,-22.519\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 237.518,399.268 c 0,-12.436 10.082,-22.518 22.519,-22.518 12.436,0 22.517,10.082 22.517,22.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 327.59,398.398 c 0,12.438 -10.082,22.519 -22.517,22.519 -12.438,0 -22.519,-10.081 -22.519,-22.519\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 327.59,399.268 c 0,-12.436 10.082,-22.518 22.521,-22.518 12.437,0 22.518,10.082 22.518,22.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 417.662,398.398 c 0,12.438 -10.082,22.519 -22.521,22.519 -12.436,0 -22.518,-10.081 -22.518,-22.519\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 417.662,399.268 c 0,-12.436 10.082,-22.518 22.518,-22.518 12.438,0 22.521,10.082 22.521,22.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 485.216,420.917 c -12.436,0 -22.517,-10.081 -22.517,-22.519\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        VERY_HEAVY("61", "Very Heavy", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-21.90286,-6)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" transform=\"translate(275.0005,507.5557)\">VH</text>\n  </g>";
            }
        },
        SUPPLY("62", "Supply", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"123.5\" x2=\"488.5\" y1=\"445.01501\" y2=\"445.295\"/>\n  </g>";
            }

            @Override
            public Rectangle2D getModifierBounds() {
                return new Rectangle2D(121, 442.52, 370, 5.28);
            }
        },
        NAVY_BARGE_SELF_PROPELLED("64", "Navy Barge Self-Propelled", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-12.30032,-6)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" transform=\"translate(275.0005,507.5557)\">YS</text>\n  </g>";
            }
        },
        NAVY_BARGE_NOT_SELF_PROPELLED("65", "Navy Barge Not Self-Propelled", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-12.980988,-6)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" transform=\"translate(275.0005,507.5557)\">YB</text>\n  </g>";
            }
        },
        LAUNCH("66", "Launch", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-28.35892,-10)\">\n    <text font-family=\"sans-serif\" font-size=\"64px\" transform=\"translate(275.0005,507.5557)\">YFT</text>\n  </g>";
            }
        },
        LANDING_CRAFT("67", "Landing Craft", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-14.32572,-8)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" transform=\"translate(275.0005,507.5557)\">LC</text>\n  </g>";
            }
        },
        LANDING_SHIP("68", "Landing Ship", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-9.52884,-8)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" transform=\"translate(275.0005,507.5557)\">LS</text>\n  </g>";
            }
        },
        SERVICE_CRAFT_YARD("69", "Service Craft/Yard", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-11.83548,-6)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" transform=\"translate(275.0005,507.5557)\">YY</text>\n  </g>";
            }
        },
        TUG_HARBOUR("70", "Tug, Harbour", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-11.9683,-6)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" transform=\"translate(275.0005,507.5557)\">YT</text>\n  </g>";
            }
        },
        TUG_BOAT_OCEAN_GOING("71", "Tug Boat, Ocean-going", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-4.63236,-8)\">\n    <text font-family=\"sans-serif\" font-size=\"68px\" transform=\"translate(275.0005,507.5557)\">AT</text>\n  </g>";
            }
        },
        SURFACE_DEPLOYMENT_DISTRIBUTION_COMMAND("72", "Surface Deployment and Distribution Command (SDDC)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-40.7808,-20)\">\n    <text font-family=\"sans-serif\" font-size=\"48px\" transform=\"translate(275.0005,507.5557)\">SDDC</text>\n  </g>";
            }
        },
        NON_COMBATANT_VESSEL("73", "Non-Combatant Vessel, Generic", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <path d=\"m 267.61718,500 v -32.04324 h 21.36216 V 446.5946 h 32.04324 v 21.36216 h 21.36215 V 500 Z\" style=\"fill:#000000;fill-opacity:1;stroke:none;stroke-width:1.0681px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        COMPOSITE("74", "Composite", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-40.98001,-18)\">\n    <text font-family=\"sans-serif\" font-size=\"48px\" transform=\"translate(275.0005,507.5557)\">COMP</text>\n  </g>";
            }
        },
        SHELTER("75", "Shelter", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" style=\"fill:#000000;fill-opacity:1;stroke:none\" transform=\"matrix(0.43094,0,0,0.43094,173.96512,302.8667)\">\n    <polygon fill=\"none\" points=\"250,358.5 305,333.5 360,358.5 390,458.5 220,458.5\" stroke=\"#000000\" stroke-width=\"5\" style=\"fill:#000000;fill-opacity:1;stroke:none\"/>\n  </g>";
            }
        },
        SURGICAL("81", "Surgical", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(0,2)\">\n    <path d=\"m 322.287,457.36726 60.542,16.72774 -60.542,21.73052 z\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <ellipse cx=\"321.01523\" cy=\"455.93698\" rx=\"9.5351\" ry=\"9.05835\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:5;stroke-linecap:round;stroke-dasharray:none\"/>\n    <ellipse cx=\"321.01523\" cy=\"493.93698\" rx=\"9.5351\" ry=\"9.05835\" style=\"fill:#ffffff;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:5;stroke-linecap:round;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        BLOOD_SUPPORT("82", "Blood Support", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <path d=\"m 329.9251,498.03405 c -4.2908,-0.9535 -9.27568,-5.54343 -12.1362,-10.78774 -2.54269,-6.0389 -2.21357,-11.7545 2.23615,-17.47555 0,0 9.79761,-9.06416 15.51867,-20.5063 5.87998,11.44213 14,19.76624 14,19.76624 6.51566,6.35674 4.24756,16.2108 1.86378,20.97836 -2.70161,4.76755 -7.51627,6.7922 -10.3768,8.06355 -3.65513,0.9535 -9.35748,0.91494 -11.10558,-0.0386 z\" style=\"fill:#000000;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;fill-opacity:1\"/>\n  </g>";
            }
        },
        COMBAT_OPERATIONAL_STRESS_CONTROL("83", "Combat and Operational Stress Control (COSC)", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" style=\"stroke-width:1;stroke-dasharray:none;fill:#000000;fill-opacity:1\" transform=\"translate(0,-0.90047)\">\n    <path d=\"m 344.91184,473.7012 q 4.76146,0 7.21222,-1.61049 2.48577,-1.6105 3.29101,-3.92121 0.84026,-2.3107 1.08534,-7.70238 0.24507,-5.98684 2.66082,-8.89274 2.45075,-2.9409 8.01747,-2.9409 v 1.33041 q -1.99561,0.14004 -2.73084,1.57548 -0.70022,1.40043 -0.70022,5.98685 0,6.72207 -1.43544,10.3982 -1.40043,3.64113 -5.67175,5.91683 -4.2713,2.2757 -11.7286,2.45075 v 11.09842 q 0,4.09627 0.45514,5.32164 0.49015,1.19037 1.99561,1.9256 1.54048,0.73522 4.72646,0.73522 v 1.2954 h -21.0765 v -1.2954 q 3.11596,-0.035 4.62143,-0.6652 1.54047,-0.6652 2.03062,-1.89058 0.52516,-1.26039 0.52516,-5.42668 v -11.09842 q -7.52732,-0.17505 -11.6936,-2.41574 -4.16628,-2.24069 -5.67175,-5.8468 -1.47045,-3.64113 -1.47045,-10.53825 0,-4.41136 -0.6652,-5.8468 -0.6652,-1.47046 -2.76585,-1.68052 v -1.33041 q 3.5361,0.07 5.70676,1.12034 2.17067,1.05033 3.46607,3.71115 1.33041,2.66082 1.50546,7.00215 0.24508,5.35666 1.01532,7.66737 0.80524,2.3107 3.32602,3.95622 2.52078,1.61049 7.24723,1.61049 v -15.2647 q 0,-4.09626 -0.49015,-5.28663 -0.45514,-1.22538 -1.9606,-1.92559 -1.50547,-0.70022 -4.72646,-0.73523 v -1.2954 h 21.0765 v 1.2954 q -3.22099,0.035 -4.72646,0.73523 -1.50546,0.6652 -1.99561,1.89058 -0.45514,1.22538 -0.45514,5.32164 z\" style=\"font-size:71.7021px;stroke-width:1;stroke-dasharray:none;fill:#000000;fill-opacity:1\"/>\n  </g>";
            }
        },
        JAMMING("84", "Jamming", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(0.44894,0,0,0.73271101,169.74633,238.96108)\">\n    <g id=\"waves2\">\n      <path d=\"m 239.603,301.813 c 0,1.889 -0.383,3.688 -1.075,5.324 -0.692,1.637 -1.694,3.111 -2.932,4.349 -1.238,1.238 -2.712,2.239 -4.349,2.932 -1.637,0.693 -3.436,1.075 -5.325,1.075 -1.889,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.111,-1.694 -4.349,-2.932 -1.238,-1.238 -2.24,-2.712 -2.932,-4.349 -0.692,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 184.882,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.692,-1.637 1.694,-3.111 2.932,-4.349 1.238,-1.238 2.712,-2.239 4.349,-2.932 1.637,-0.693 3.436,-1.075 5.325,-1.075 1.889,0 3.688,0.383 5.325,1.075 1.637,0.692 3.111,1.694 4.349,2.932 1.238,1.238 2.24,2.712 2.932,4.349 0.692,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 294.324,301.813 c 0,1.889 -0.383,3.688 -1.075,5.324 -0.692,1.637 -1.694,3.111 -2.932,4.349 -1.238,1.238 -2.712,2.239 -4.349,2.932 -1.637,0.693 -3.436,1.075 -5.325,1.075 -1.889,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.111,-1.694 -4.349,-2.932 -1.238,-1.238 -2.24,-2.712 -2.932,-4.349 -0.692,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 239.603,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.692,-1.637 1.694,-3.111 2.932,-4.349 1.238,-1.238 2.712,-2.239 4.349,-2.932 1.637,-0.693 3.436,-1.075 5.325,-1.075 1.889,0 3.688,0.383 5.325,1.075 1.637,0.692 3.111,1.694 4.349,2.932 1.238,1.238 2.24,2.712 2.932,4.349 0.692,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 349.046,301.813 c 0,1.889 -0.383,3.688 -1.075,5.324 -0.688,1.636 -1.689,3.111 -2.932,4.349 -1.239,1.238 -2.712,2.239 -4.349,2.932 -1.641,0.693 -3.438,1.075 -5.325,1.075 -1.892,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.11,-1.694 -4.349,-2.932 -1.239,-1.238 -2.239,-2.712 -2.936,-4.349 -0.689,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 294.324,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.692,-1.636 1.694,-3.111 2.932,-4.349 1.238,-1.238 2.712,-2.239 4.348,-2.932 1.637,-0.692 3.436,-1.075 5.325,-1.075 1.889,0 3.688,0.383 5.324,1.075 1.636,0.692 3.111,1.694 4.349,2.932 1.238,1.238 2.239,2.712 2.936,4.349 0.689,1.637 1.071,3.436 1.071,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 184.882,301.813 c 0,1.889 -0.383,3.688 -1.075,5.324 -0.692,1.637 -1.694,3.111 -2.932,4.349 -1.238,1.238 -2.712,2.239 -4.349,2.932 -1.637,0.693 -3.436,1.075 -5.325,1.075 -1.889,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.111,-1.694 -4.349,-2.932 -1.238,-1.238 -2.24,-2.712 -2.932,-4.349 -0.692,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 130.162,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.692,-1.637 1.694,-3.111 2.932,-4.349 1.238,-1.238 2.712,-2.239 4.349,-2.932 1.637,-0.693 3.436,-1.075 5.325,-1.075 1.889,0 3.688,0.383 5.325,1.075 1.637,0.692 3.111,1.694 4.349,2.932 1.238,1.238 2.24,2.712 2.932,4.349 0.692,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 403.767,301.813 c 0,1.889 -0.383,3.688 -1.071,5.324 -0.692,1.636 -1.693,3.111 -2.936,4.349 -1.237,1.238 -2.712,2.239 -4.349,2.932 -1.637,0.693 -3.438,1.075 -5.325,1.075 -1.887,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.106,-1.694 -4.349,-2.932 -1.239,-1.238 -2.239,-2.712 -2.936,-4.349 -0.689,-1.637 -1.071,-3.436 -1.071,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 349.046,302.053 c 0,-1.889 0.383,-3.688 1.075,-5.324 0.691,-1.636 1.693,-3.111 2.932,-4.349 1.239,-1.238 2.712,-2.239 4.353,-2.932 1.636,-0.692 3.436,-1.075 5.32,-1.075 1.892,0 3.688,0.383 5.324,1.075 1.641,0.692 3.11,1.694 4.353,2.932 1.235,1.238 2.235,2.712 2.932,4.349 0.693,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 458.487,301.813 c 0,1.889 -0.387,3.688 -1.075,5.324 -0.692,1.636 -1.693,3.111 -2.932,4.349 -1.239,1.238 -2.716,2.239 -4.353,2.932 -1.637,0.693 -3.437,1.075 -5.325,1.075 -1.888,0 -3.688,-0.383 -5.325,-1.075 -1.637,-0.692 -3.106,-1.694 -4.349,-2.932 -1.239,-1.238 -2.239,-2.712 -2.932,-4.349 -0.693,-1.637 -1.075,-3.436 -1.075,-5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 403.765,302.053 c 0,-1.889 0.387,-3.688 1.075,-5.324 0.692,-1.636 1.693,-3.111 2.936,-4.349 1.235,-1.238 2.712,-2.239 4.349,-2.932 1.636,-0.692 3.436,-1.075 5.324,-1.075 1.888,0 3.688,0.383 5.324,1.075 1.636,0.692 3.106,1.694 4.349,2.932 1.239,1.238 2.239,2.712 2.932,4.349 0.693,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 458.485,302.053 c 0,-1.889 0.383,-3.688 1.071,-5.324 0.692,-1.636 1.693,-3.111 2.936,-4.349 1.239,-1.238 2.712,-2.239 4.349,-2.932 1.636,-0.692 3.438,-1.075 5.324,-1.075 1.886,0 3.688,0.383 5.324,1.075 1.636,0.692 3.106,1.694 4.349,2.932 1.239,1.238 2.239,2.712 2.932,4.349 0.693,1.637 1.075,3.436 1.075,5.324\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 130.162,300.864 c 0,0.472 -0.024,0.938 -0.071,1.399 -0.046,0.46 -0.116,0.913 -0.207,1.358 -0.091,0.444 -0.204,0.882 -0.337,1.311 -0.133,0.429 -0.287,0.848 -0.46,1.257 -0.173,0.409 -0.366,0.809 -0.576,1.195 -0.21,0.388 -0.439,0.764 -0.685,1.128 -0.246,0.364 -0.509,0.715 -0.788,1.053 -0.279,0.338 -0.574,0.662 -0.883,0.972 -0.309,0.31 -0.633,0.604 -0.971,0.883 -0.338,0.279 -0.689,0.542 -1.054,0.788 -0.364,0.245 -0.74,0.475 -1.128,0.685 -0.194,0.105 -0.392,0.207 -0.591,0.303\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 488.181,309.461 c -0.245,-0.364 -0.475,-0.74 -0.685,-1.129 -0.211,-0.387 -0.403,-0.786 -0.576,-1.195 -0.173,-0.409 -0.326,-0.828 -0.46,-1.257 -0.134,-0.429 -0.246,-0.866 -0.337,-1.311 -0.092,-0.445 -0.161,-0.898 -0.208,-1.358 -0.046,-0.46 -0.07,-0.926 -0.07,-1.398\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"waves1\" transform=\"translate(0,-9.82652)\">\n      <path d=\"m 239.604,332.305 c 0,7.556 -6.125,13.68 -13.68,13.68 -7.555,0 -13.68,-6.124 -13.68,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 184.883,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 294.325,332.305 c 0,7.556 -6.125,13.68 -13.681,13.68 -7.555,0 -13.68,-6.124 -13.68,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 239.604,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 349.047,332.305 c 0,7.556 -6.125,13.68 -13.681,13.68 -7.56,0 -13.685,-6.124 -13.685,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 294.325,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 184.883,332.305 c 0,7.556 -6.125,13.68 -13.68,13.68 -7.555,0 -13.68,-6.124 -13.68,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 130.163,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 403.768,332.305 c 0,7.556 -6.125,13.68 -13.681,13.68 -7.556,0 -13.681,-6.124 -13.681,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 349.047,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.559,0 13.684,6.124 13.684,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 458.488,332.305 c 0,7.556 -6.125,13.68 -13.685,13.68 -7.556,0 -13.681,-6.124 -13.681,-13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 403.766,332.545 c 0,-7.556 6.125,-13.68 13.684,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 458.486,332.545 c 0,-7.556 6.125,-13.68 13.68,-13.68 7.555,0 13.68,6.124 13.68,13.68\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 130.163,331.356 c 0,0.472 -0.024,0.939 -0.071,1.399 -0.046,0.46 -0.116,0.913 -0.208,1.358 -0.091,0.445 -0.204,0.883 -0.337,1.311 -0.133,0.428 -0.287,0.847 -0.46,1.257 -0.173,0.409 -0.365,0.808 -0.576,1.196 -0.211,0.388 -0.44,0.764 -0.686,1.127 -0.246,0.363 -0.509,0.715 -0.788,1.053 -0.279,0.338 -0.574,0.662 -0.883,0.971 -0.309,0.31 -0.633,0.604 -0.971,0.883 -0.338,0.279 -0.689,0.542 -1.054,0.787 -0.364,0.246 -0.74,0.475 -1.128,0.685 -0.245,0.133 -0.494,0.259 -0.748,0.377\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <path d=\"m 488.182,339.953 c -0.246,-0.364 -0.475,-0.74 -0.685,-1.129 -0.21,-0.387 -0.403,-0.786 -0.576,-1.195 -0.173,-0.409 -0.327,-0.828 -0.46,-1.257 -0.134,-0.429 -0.246,-0.866 -0.337,-1.311 -0.091,-0.445 -0.161,-0.898 -0.208,-1.358 -0.047,-0.46 -0.07,-0.926 -0.07,-1.398\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        OPTOMETRY("86", "Optometry", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <circle cx=\"348.82599\" cy=\"469.12723\" r=\"10\" style=\"fill:#000000;fill-rule:evenodd;stroke-width:5;stroke-linecap:round\"/>\n    <path d=\"m 313.705,468.17371 c 2.22486,-1.43027 16.52334,-17.87827 35.59773,-18.1167 19.0744,-0.23843 33.37288,17.48103 35.91557,18.75238 -2.22485,1.27135 -15.87662,20.6589 -35.2799,21.29507 -19.40327,0.63617 -33.84963,-20.34157 -36.2334,-21.93075 z\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;stroke-dasharray:none\"/>\n  </g>";
            }
        },
        PREVENTATIVE_MEDICINE("87", "Preventative Medicine", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <path d=\"m 337.4004,447.4925 -16.06445,25.70703 h 10.31445 l 5.42188,-11.77344 6.39648,16.0371 2.03125,-4.26367 h 7.625 0.33984 z m -0.6582,26.60547 -1.88867,4.10156 h -13.79297 -2.84961 l -7.81055,12.5 h 54 l -7.81055,-12.5 h -3.46484 -4.46875 l -5.5957,11.73828 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandUnitsSectorTwoModifier(String id, String label, ModifierCategory category) {
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
    public String getName() {
        return name();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.LAND_UNIT;
    }

}