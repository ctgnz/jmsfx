package io.github.ctgnz.jmsfx.battleorder.space;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum SpaceEntityType implements EntityType {
        SPACE_VEHICLE("01", "Space Vehicle", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 222.9995 443.25)\">SV</text>\n  </g>";
            }
        },
        RE_ENTRY_VEHICLE("02", "Re-Entry Vehicle", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 222.9995 443.25)\">RV</text>\n  </g>";
            }
        },
        PLANET_LANDER("03", "Planet Lander", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"130\" transform=\"matrix(1 0 0 1 231.9995 443.25)\">PL</text>\n  </g>";
            }
        },
        ORBITER_SHUTTLE("04", "Orbiter Shuttle", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M270.416,439.092c1.367-12.253,5.57-27.861,9.99-42.336 c7.369-24.123,16.037-45.674,23.344-45.674c7.23,0,16.008,22.864,24.156,46.68c5.022,14.681,9.506,29.87,11.844,41.33\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect height=\"3.655\" stroke=\"#000000\" stroke-width=\"5\" width=\"3.568\" x=\"303.299\" y=\"437.264\"/>\n  </g>";
            }
        },
        CAPSULE("05", "Capsule", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M347.679,429.224c0,6.329-5.276,11.459-11.785,11.459h-65.306 c-4.473-2.341-8.102-4.963-8.102-11.292l12.767-44.192c2.454-6.138,8.222-30.935,14.73-30.935l16.203-2.946l18.66,2.946 c1.872,0.308,10.104,27.475,11.933,33.858L347.679,429.224z\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        GENERAL_SATELLITE("06", "Satellite, General", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"115\" transform=\"matrix(1 0 0 1 188.5005 437.3975)\">SAT</text>\n  </g>";
            }
        },
        SATELLITE("07", "Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect height=\"48.758\" width=\"81.694\" x=\"194.976\" y=\"371.621\"/>\n    <rect height=\"48.759\" width=\"37.495\" x=\"286.172\" y=\"371.62\"/>\n    <rect height=\"48.759\" width=\"81.695\" x=\"333.169\" y=\"371.62\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.669\" x2=\"335.155\" y1=\"396\" y2=\"396\"/>\n  </g>";
            }
        },
        ANTISATELLITE_WEAPON("08", "Antisatellite Weapon", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect height=\"48.758\" width=\"81.694\" x=\"194.976\" y=\"371.621\"/>\n      <rect height=\"48.759\" width=\"37.495\" x=\"286.172\" y=\"371.62\"/>\n      <rect height=\"48.759\" width=\"81.695\" x=\"333.169\" y=\"371.62\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.669\" x2=\"335.155\" y1=\"396\" y2=\"396\"/>\n    </g>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"304.919\" x2=\"304.919\" y1=\"443.5\" y2=\"362.985\"/>\n      <polygon points=\"314.922,365.903 304.951,348.631 294.979,365.903\"/>\n    </g>\n  </g>";
            }
        },
        ASTRONOMICAL_SATELLITE("09", "Astronomical Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"310.081,441.143 300.228,441.143 295.534,350.856 314.305,350.856\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <g id=\"Satellite\">\n      <rect height=\"48.758\" width=\"81.694\" x=\"194.976\" y=\"371.621\"/>\n      <rect height=\"48.759\" width=\"37.495\" x=\"286.172\" y=\"371.62\"/>\n      <rect height=\"48.759\" width=\"81.695\" x=\"333.169\" y=\"371.62\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"275.669\" x2=\"335.155\" y1=\"396\" y2=\"396\"/>\n    </g>\n  </g>";
            }
        },
        BIOSATELLITE("10", "Biosatellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Bio\">\n      <circle cx=\"285.964\" cy=\"370.881\" r=\"19.13\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <rect height=\"11.795\" stroke=\"#000000\" stroke-width=\"5\" transform=\"matrix(-0.869 -0.4948 0.4948 -0.869 401.9549 849.9518)\" width=\"54.518\" x=\"286.228\" y=\"365.871\"/>\n    </g>\n    <g id=\"Satellite\">\n      <rect height=\"44.979\" width=\"75.362\" x=\"204.216\" y=\"395.136\"/>\n      <rect height=\"44.98\" width=\"34.588\" x=\"288.345\" y=\"395.135\"/>\n      <rect height=\"44.98\" width=\"75.365\" x=\"331.699\" y=\"395.135\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.656\" x2=\"333.532\" y1=\"417.625\" y2=\"417.625\"/>\n    </g>\n  </g>";
            }
        },
        COMMUNICATIONS_SATELLITE("11", "Communications Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Comm\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.094\" x2=\"306.094\" y1=\"381.833\" y2=\"401.833\"/>\n      <path d=\"M237.726,353.912c37.114,38.465,98.271,39.559,136.738,2.445\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"Satellite\">\n      <rect height=\"44.979\" width=\"75.362\" x=\"204.216\" y=\"395.136\"/>\n      <rect height=\"44.98\" width=\"34.588\" x=\"288.345\" y=\"395.135\"/>\n      <rect height=\"44.98\" width=\"75.365\" x=\"331.699\" y=\"395.135\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.656\" x2=\"333.532\" y1=\"417.625\" y2=\"417.625\"/>\n    </g>\n  </g>";
            }
        },
        EARTH_OBSERVATION_SATELLITE("12", "Earth Observation Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect height=\"44.979\" width=\"75.362\" x=\"204.216\" y=\"353.136\"/>\n      <rect height=\"44.98\" width=\"34.588\" x=\"288.345\" y=\"353.135\"/>\n      <rect height=\"44.98\" width=\"75.365\" x=\"331.699\" y=\"353.135\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.656\" x2=\"333.532\" y1=\"375.625\" y2=\"375.625\"/>\n    </g>\n    <g id=\"EarthObs\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.639\" x2=\"305.639\" y1=\"398.115\" y2=\"401.75\"/>\n      <polyline fill=\"none\" points=\"284.5,414.5 292.286,401.75 317.476,401.75 325.834,414.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <circle cx=\"305.083\" cy=\"425.499\" r=\"14.782\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        MINIATURIZED_SATELLITE("13", "Miniaturized Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect height=\"37.299\" width=\"62.496\" x=\"220.813\" y=\"377.35\"/>\n      <rect height=\"37.3\" width=\"28.683\" x=\"290.578\" y=\"377.349\"/>\n      <rect height=\"37.3\" width=\"62.497\" x=\"326.53\" y=\"377.349\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"282.543\" x2=\"328.05\" y1=\"396\" y2=\"396\"/>\n    </g>\n    <g id=\"Mini\">\n      <polyline fill=\"#FFFFFF\" points=\"284.728,440.999 306.005,419.731 327.273,441.008\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"#FFFFFF\" points=\"326.192,350.759 304.915,372.026 283.646,350.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"#FFFFFF\" points=\"195.55,374.727 216.818,396.004 195.542,417.273\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"#FFFFFF\" points=\"414.296,417.273 393.027,395.996 414.305,374.727\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        NAVIGATIONAL_SATELLITE("14", "Navigational Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect height=\"44.014\" width=\"73.745\" x=\"205.674\" y=\"398.992\"/>\n      <rect height=\"44.014\" width=\"33.845\" x=\"287.997\" y=\"398.992\"/>\n      <rect height=\"44.014\" width=\"73.747\" x=\"330.42\" y=\"398.992\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.515\" x2=\"332.213\" y1=\"421\" y2=\"421\"/>\n    </g>\n    <g id=\"Nav\">\n      <g id=\"Mini\">\n        <polyline fill=\"#FFFFFF\" points=\"281.167,397 306.005,353.187 330.42,397\" stroke=\"#000000\" stroke-width=\"5\"/>\n      </g>\n      <path d=\"M281.322,351.75c0,10.136,10.985,18.353,24.536,18.353 c13.55,0,24.537-8.217,24.537-18.353\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        RECONNAISSANCE_SATELLITE("15", "Reconnaissance Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect height=\"44.014\" width=\"73.745\" x=\"205.674\" y=\"348.992\"/>\n      <rect height=\"44.014\" width=\"33.845\" x=\"287.997\" y=\"348.992\"/>\n      <rect height=\"44.014\" width=\"73.747\" x=\"330.42\" y=\"348.992\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.515\" x2=\"332.213\" y1=\"371\" y2=\"371\"/>\n    </g>\n    <g id=\"Recon\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"290.5\" x2=\"278.419\" y1=\"391.167\" y2=\"441.833\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"319.507\" x2=\"331.085\" y1=\"391.167\" y2=\"441.833\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"300.5\" x2=\"295.833\" y1=\"391.167\" y2=\"441.833\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"311.167\" x2=\"316.834\" y1=\"391.167\" y2=\"441.833\"/>\n    </g>\n  </g>";
            }
        },
        SPACE_STATION("16", "Space Station", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306.48\" cy=\"398\" rx=\"74.5\" ry=\"28.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"306.48\" cy=\"397.001\" fill=\"#FFFFFF\" rx=\"59.167\" ry=\"13.499\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect height=\"89.75\" stroke=\"#000000\" stroke-width=\"7\" width=\"9.999\" x=\"301.48\" y=\"351.125\"/>\n  </g>";
            }
        },
        TETHERED_SATELLITE("17", "Tethered Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect height=\"44.014\" width=\"73.745\" x=\"205.674\" y=\"398.992\"/>\n      <rect height=\"44.014\" width=\"33.845\" x=\"287.997\" y=\"398.992\"/>\n      <rect height=\"44.014\" width=\"73.747\" x=\"330.42\" y=\"398.992\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.515\" x2=\"332.213\" y1=\"421\" y2=\"421\"/>\n    </g>\n    <g id=\"tethered\">\n      <circle cx=\"367.293\" cy=\"367.5\" r=\"17.019\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.083\" x2=\"357.167\" y1=\"403.167\" y2=\"373.833\"/>\n    </g>\n  </g>";
            }
        },
        WEATHER_SATELLITE("18", "Weather Satellite", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect height=\"44.014\" width=\"73.745\" x=\"205.674\" y=\"398.992\"/>\n      <rect height=\"44.014\" width=\"33.845\" x=\"287.997\" y=\"398.992\"/>\n      <rect height=\"44.014\" width=\"73.747\" x=\"330.42\" y=\"398.992\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.515\" x2=\"332.213\" y1=\"421\" y2=\"421\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1.0329 0 0 1 253.6665 396)\">WX</text>\n  </g>";
            }
        },
        SPACE_LAUNCHED_VEHICLE("19", "Space Launched Vehicle (SLV)", SpaceEntity.MILITARY, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Symbol\">\n      <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 194 435.25)\">SLV</text>\n    </g>\n  </g>";
            }
        },
        CIV_ORBITER_SHUTTLE("01", "Orbiter Shuttle", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M270.416,439.063c1.367-12.253,5.57-27.86,9.99-42.336 c7.369-24.123,16.037-45.674,23.344-45.674c7.23,0,16.008,22.864,24.156,46.682c5.021,14.68,9.506,30.024,11.844,41.484\" fill=\"#FFFFFF\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"272.833\" x2=\"337.375\" y1=\"437.125\" y2=\"437.125\"/>\n    <rect fill=\"none\" height=\"3.655\" stroke=\"#000000\" stroke-width=\"5\" width=\"3.568\" x=\"303.299\" y=\"436.993\"/>\n  </g>";
            }
        },
        CIV_CAPSULE("02", "Capsule", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M347.679,429.224c0,6.329-5.275,11.459-11.785,11.459h-65.306 c-4.473-2.341-8.102-4.963-8.102-11.292l12.767-44.191c2.454-6.138,8.222-30.935,14.73-30.935l16.203-2.946l18.66,2.946 c1.872,0.308,10.104,27.475,11.934,33.858L347.679,429.224z\" fill=\"#FFFFFF\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        CIV_SATELLITE("03", "Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FFFFFF\" height=\"47.295\" stroke=\"#000000\" stroke-width=\"5\" width=\"79.243\" x=\"198.274\" y=\"372.353\"/>\n    <rect fill=\"#FFFFFF\" height=\"47.296\" stroke=\"#000000\" stroke-width=\"5\" width=\"36.37\" x=\"286.734\" y=\"372.352\"/>\n    <rect fill=\"#FFFFFF\" height=\"47.296\" stroke=\"#000000\" stroke-width=\"5\" width=\"79.245\" x=\"332.321\" y=\"372.352\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"321.75\" x2=\"334.248\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.546\" x2=\"287.25\" y1=\"396\" y2=\"396\"/>\n  </g>";
            }
        },
        CIV_ASTRONOMICAL_SATELLITE("04", "Astronomical Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Astro\">\n      <polyline fill=\"#FFFFFF\" points=\"311.171,417.834 310.081,441.143 300.228,441.143 299.016,417.833\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"#FFFFFF\" points=\"296.712,373.506 295.534,350.856 314.305,350.856 313.215,374.154\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"Satellite\">\n      <rect fill=\"#FFFFFF\" height=\"47.295\" stroke=\"#000000\" stroke-width=\"5\" width=\"79.243\" x=\"198.274\" y=\"372.353\"/>\n      <rect fill=\"#FFFFFF\" height=\"47.296\" stroke=\"#000000\" stroke-width=\"5\" width=\"36.37\" x=\"286.734\" y=\"372.352\"/>\n      <rect fill=\"#FFFFFF\" height=\"47.296\" stroke=\"#000000\" stroke-width=\"5\" width=\"79.245\" x=\"332.321\" y=\"372.352\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"323.104\" x2=\"334.248\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"276.546\" x2=\"287.5\" y1=\"396\" y2=\"396\"/>\n    </g>\n  </g>";
            }
        },
        CIV_BIOSATELLITE("05", "Biosatellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Bio\">\n      <polyline fill=\"#FFFFFF\" points=\"292.408,351.9 339.218,378.27 333.451,388.29 304.388,371.917\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <ellipse cx=\"285.735\" cy=\"369.327\" fill=\"#FFFFFF\" rx=\"18.901\" ry=\"18.701\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"Satellite\">\n      <rect fill=\"#FFFFFF\" height=\"43.673\" stroke=\"#000000\" stroke-width=\"5\" width=\"73.173\" x=\"206.21\" y=\"395.356\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.674\" stroke=\"#000000\" stroke-width=\"5\" width=\"33.584\" x=\"287.896\" y=\"395.355\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.674\" stroke=\"#000000\" stroke-width=\"5\" width=\"73.176\" x=\"329.991\" y=\"395.355\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"321.48\" x2=\"331.771\" y1=\"417.192\" y2=\"417.192\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.489\" x2=\"287.896\" y1=\"417.192\" y2=\"417.192\"/>\n    </g>\n  </g>";
            }
        },
        CIV_COMMUNICATIONS_SATELLITE("06", "Communications Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Comm\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.094\" x2=\"306.094\" y1=\"381.833\" y2=\"396\"/>\n      <path d=\"M237.726,353.912c37.114,38.465,98.271,39.559,136.738,2.445\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n    <g id=\"Satellite\">\n      <rect fill=\"#FFFFFF\" height=\"43.114\" stroke=\"#000000\" stroke-width=\"5\" width=\"72.237\" x=\"208.216\" y=\"395.136\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.115\" stroke=\"#000000\" stroke-width=\"5\" width=\"33.154\" x=\"288.856\" y=\"395.135\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.115\" stroke=\"#000000\" stroke-width=\"5\" width=\"72.239\" x=\"330.413\" y=\"395.135\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"322.01\" x2=\"331.699\" y1=\"417.625\" y2=\"417.625\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"279.569\" x2=\"288.856\" y1=\"416.692\" y2=\"416.692\"/>\n    </g>\n  </g>";
            }
        },
        CIV_EARTH_OBSERVATION_SATELLITE("07", "Earth Observation Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect fill=\"#FFFFFF\" height=\"44.08\" stroke=\"#000000\" stroke-width=\"5\" width=\"73.855\" x=\"206.244\" y=\"353.585\"/>\n      <rect fill=\"#FFFFFF\" height=\"44.081\" stroke=\"#000000\" stroke-width=\"5\" width=\"33.897\" x=\"288.69\" y=\"353.584\"/>\n      <rect fill=\"#FFFFFF\" height=\"44.081\" stroke=\"#000000\" stroke-width=\"5\" width=\"73.858\" x=\"331.178\" y=\"353.584\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"279.196\" x2=\"288.69\" y1=\"375.625\" y2=\"375.625\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"322.588\" x2=\"332.083\" y1=\"375.625\" y2=\"375.625\"/>\n    </g>\n    <g id=\"EarthObs\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"305.616\" x2=\"305.616\" y1=\"398.661\" y2=\"403.626\"/>\n      <polyline fill=\"none\" points=\"285.533,416.735 292.93,404.622 316.86,404.622 324.801,416.735\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <circle cx=\"305.087\" cy=\"427.184\" fill=\"#FFFFFF\" r=\"14.043\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        CIV_MINIATURIZED_SATELLITE("08", "Miniaturized Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect fill=\"#FFFFFF\" height=\"36.182\" stroke=\"#000000\" stroke-width=\"5\" width=\"60.621\" x=\"223.336\" y=\"377.91\"/>\n      <rect fill=\"#FFFFFF\" height=\"36.182\" stroke=\"#000000\" stroke-width=\"5\" width=\"27.822\" x=\"291.008\" y=\"377.91\"/>\n      <rect fill=\"#FFFFFF\" height=\"36.182\" stroke=\"#000000\" stroke-width=\"5\" width=\"60.622\" x=\"325.882\" y=\"377.91\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"317.795\" x2=\"327.355\" y1=\"396\" y2=\"396\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"283.213\" x2=\"291.402\" y1=\"396\" y2=\"396\"/>\n    </g>\n    <g id=\"Mini\">\n      <polyline fill=\"none\" points=\"283.728,441.999 305.005,420.731 326.273,442.008\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"none\" points=\"325.192,349.759 303.915,371.026 282.646,349.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"none\" points=\"194.55,374.727 215.818,396.004 194.542,417.273\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <polyline fill=\"none\" points=\"414.296,417.273 393.027,395.996 414.305,374.727\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        CIV_NAVIGATIONAL_SATELLITE("09", "Navigational Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"72.745\" x=\"207.019\" y=\"397.292\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"33.387\" x=\"288.226\" y=\"397.292\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"72.746\" x=\"330.074\" y=\"397.292\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"320.37\" x2=\"331.843\" y1=\"419\" y2=\"419\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.872\" x2=\"288.699\" y1=\"419\" y2=\"419\"/>\n    </g>\n    <g id=\"Nav\">\n      <g id=\"Mini\">\n        <polyline fill=\"none\" points=\"283.836,392.737 306.19,353.305 328.163,392.737\" stroke=\"#000000\" stroke-width=\"5\"/>\n      </g>\n      <path d=\"M283.976,352.013c0,9.122,9.886,16.518,22.082,16.518 c12.196,0,22.083-7.396,22.083-16.518\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    </g>\n  </g>";
            }
        },
        CIV_SPACE_STATION("10", "Space Station", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M310.947,384.162c24.048,0.621,42.869,6.209,42.869,13.01 c0,7.217-21.191,13.066-47.333,13.066c-26.144,0-47.335-5.852-47.335-13.066c0-6.898,19.361-12.548,43.899-13.033l-0.235-14.605 C263.37,370.266,231.98,382.731,231.98,398c0,15.74,33.354,28.5,74.5,28.5c41.145,0,74.5-12.76,74.5-28.5 c0-15.143-30.874-27.528-69.855-28.445\" fill=\"#FFFFFF\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <rect fill=\"#FFFFFF\" height=\"61.295\" stroke=\"#000000\" stroke-width=\"5\" width=\"11.25\" x=\"300.375\" y=\"348.943\"/>\n    <rect fill=\"#FFFFFF\" height=\"13.75\" stroke=\"#000000\" stroke-width=\"5\" width=\"11.25\" x=\"300.375\" y=\"426.5\"/>\n  </g>";
            }
        },
        CIV_TETHERED_SATELLITE("11", "Tethered Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"72.745\" x=\"207.019\" y=\"397.292\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"33.387\" x=\"288.226\" y=\"397.292\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"72.746\" x=\"330.074\" y=\"397.292\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"320.37\" x2=\"331.843\" y1=\"419\" y2=\"419\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.872\" x2=\"288.699\" y1=\"419\" y2=\"419\"/>\n    </g>\n    <g id=\"tehered\">\n      <circle cx=\"366.447\" cy=\"367.796\" fill=\"#FFFFFF\" r=\"17.019\" stroke=\"#000000\" stroke-width=\"5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"309.5\" x2=\"349.429\" y1=\"396.864\" y2=\"376.167\"/>\n    </g>\n  </g>";
            }
        },
        CIV_WEATHER_SATELLITE("12", "Weather Satellite", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g id=\"Satellite\">\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"72.745\" x=\"207.019\" y=\"397.292\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"33.387\" x=\"288.226\" y=\"397.292\"/>\n      <rect fill=\"#FFFFFF\" height=\"43.418\" stroke=\"#000000\" stroke-width=\"5\" width=\"72.746\" x=\"330.074\" y=\"397.292\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"320.37\" x2=\"331.843\" y1=\"419\" y2=\"419\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"278.872\" x2=\"288.699\" y1=\"419\" y2=\"419\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1.0329 0 0 1 258 392.7139)\">WX</text>\n  </g>";
            }
        },
        CIV_PLANET_LANDER("13", "Planet Lander", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g aria-label=\"PL\" style=\"font-size:130px;stroke:#000000;stroke-opacity:1;stroke-width:5;stroke-dasharray:none;fill:none\" transform=\"matrix(1 0 0 1 231.9995 443.25)\">\n      <path d=\"m 74.52148,-65.95215 q 0,6.28418 -2.22168,11.679687 -2.1582,5.33203 -6.09375,9.26758 -4.8877,4.8877 -11.55274,7.36328 -6.66504,2.41211 -16.821289,2.41211 H 25.26367 V 0 H 12.695313 v -94.5166 h 25.64453 q 8.50586,0 14.40918,1.45996 5.90332,1.39649 10.47363,4.44336 5.3955,3.61816 8.31543,9.01367 2.9834,5.3955 2.9834,13.64746 z m -13.07617,0.31738 q 0,-4.8877 -1.71387,-8.50586 -1.71387,-3.61816 -5.20508,-5.90332 -3.04688,-1.96777 -6.98242,-2.79297 -3.87207,-0.88867 -9.83887,-0.88867 H 25.26367 v 37.76856 h 10.600586 q 7.61719,0 12.37793,-1.333 4.76074,-1.39648 7.74414,-4.37988 2.9834,-3.04688 4.18945,-6.41113 1.26953,-3.36426 1.26953,-7.553711 z\" style=\"stroke:#000000;stroke-opacity:1;stroke-width:5;stroke-dasharray:none;fill:#ffffff;fill-opacity:1\"/>\n      <path d=\"M 150.88379,0 H 91.08887 v -94.5166 h 12.56836 v 83.34473 h 47.22656 z\" style=\"stroke:#000000;stroke-opacity:1;stroke-width:5;stroke-dasharray:none;fill:#ffffff;fill-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        CIV_SPACE_VEHICLE("14", "Space Vehicle", SpaceEntity.CIVILIAN, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g aria-label=\"SV\" style=\"font-size:130px\" transform=\"matrix(1 0 0 1 222.9995 443.25)\">\n      <path d=\"m 81.37695,-26.97754 q 0,5.52246 -2.60254,10.91797 -2.53906,5.3955 -7.17285,9.14062 -5.07813,4.0625 -11.87012,6.34766 -6.72852,2.28516 -16.25,2.28516 -10.21973,0 -18.4082,-1.9043 -8.125,-1.9043 -16.56738,-5.64941401 V -21.58203 h 0.88867 q 7.17285,5.9668 16.56738,9.2041 9.39453,3.2373 17.64648,3.2373 11.679688,0 18.1543,-4.37988 6.538086,-4.37988 6.538086,-11.679687 0,-6.28418 -3.11035,-9.26758 -3.04688,-2.9834 -9.33106,-4.633789 -4.76074,-1.26953 -10.34668,-2.09473 -5.52246,-0.8252 -11.74316,-2.09473 -12.56836,-2.66602 -18.6621,-9.07715 -6.03027,-6.4746 -6.03027,-16.821289 0,-11.87012 10.0293,-19.42383 10.0293,-7.61719 25.4541,-7.61719 9.96582,0 18.28125,1.9043 8.31543,1.9043 14.72656,4.69727 v 14.85352 h -0.88867 q -5.3955,-4.57031 -14.21875,-7.553711 -8.75977,-3.04688 -17.96387,-3.04688 -10.09277,0 -16.25,4.18945 -6.09375,4.18945 -6.09375,10.79102 0,5.90332 3.04688,9.26758 3.04688,3.36426 10.72754,5.1416 4.0625,0.88867 11.55274,2.1582 7.49023,1.26953 12.695312,2.60254 10.5371,2.79297 15.86914,8.44238 5.33203,5.649414 5.33203,15.80566 z\" style=\"stroke:#000000;stroke-opacity:1;fill:#ffffff;stroke-width:5;stroke-dasharray:none;fill-opacity:1\"/>\n      <path d=\"M 176.08398,-94.5166 141.67969,0 H 124.92188 L 90.51758,-94.5166 h 13.45703 l 29.64355,83.1543 29.64356,-83.1543 z\" style=\"stroke:#000000;stroke-opacity:1;fill:#ffffff;stroke-width:5;stroke-dasharray:none;fill-opacity:1\"/>\n    </g>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final SpaceEntity entity;
    private final GraphicType graphicType;

    SpaceEntityType(String id, String label, SpaceEntity entity, GraphicType graphicType) {
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