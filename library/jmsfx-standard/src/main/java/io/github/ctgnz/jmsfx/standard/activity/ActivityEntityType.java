package io.github.ctgnz.jmsfx.standard.activity;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum ActivityEntityType implements EntityType {
        CRIMINAL_ACTIVITY_INCIDENT("01", "Criminal Activity Incident", ActivityEntity.INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M263.5,345.1v1.1c0,0.8,2.1,2.5,2.8,2.5h0.6c2.4,0,2.8-2.4,3.7-3.6c0.7-0.8,3.2-2.8,4.3-3.6 l-5-4c-0.3,1-2.2,3.1-2.9,4.2C266.3,342.9,263.5,343.6,263.5,345.1z\" fill=\"#FFFFFF\" id=\"_65081736\"/>\n    <path d=\"M351.1,344.8c3.4,0.8,6.7,7,6.7,11.2v2.2c0,2.7-2,7.6-4.2,7.6h-0.8c-3.3,0-6.2-8.2-6.2-12.1v-1 c0-2,0.801-3.5,1.101-5.1h0.6c0.2,0.7,2.2,3.7,2.8,3.7c1.301,0,2-0.7,2-2v-1.1C353.1,347.7,351.5,345.4,351.1,344.8z M341,329.9 c-1.1-0.8-1.8-3.1-3.6-3.1c-0.801,0-1.7,1.2-1.7,2.2c0,0.4,1.399,2.2,1.7,2.8c-0.9,0.1-1,0.3-2,0.3H334.6c-4,0-11.899-3.2-12.6-5.9 h4.8c1.4,0,2.5-0.8,2.5-2.2c0-2.7-3.7-2.2-6.5-2.2c2.9-2.5,8.9-1.6,12.101,0C338.5,323.6,342.1,325.1,341,329.9z M290.4,332.2 c0-6.9,12.6-15.9,16.3-10.4c-2.7,0-5.6-0.5-5.6,2.2c0,2,1.1,2.2,3.1,2.2h2c-1.1,4.9-7.3,10.5-13.5,10.5c-1,0-2.2-1.5-2.2-2.8v-1.7 H290.4z M287.1,334.4c0,2.7,2.7,4.7,5.3,5.1c2.9,0.5,5.5-0.7,7.7-1.9c3.1-1.7,8.8-7.2,9.2-11.3h8.4c0.5,0,2.399,2.9,3.2,3.6 c1.3,1.3,2,1.8,3.8,2.7c1.7,0.8,8,3.1,10.5,2.7l4.2-0.5l6.699,9.8c-1.5,2.1-2.6,4.5-2.6,8.1v3.1c0,4.3,4.3,12.9,8.7,12.9h1.399 c4.4,0,7-5.8,7-10.4v-2c0-3.2-1.699-7.9-3-9.9c-2.399-3.8-3.199-4.1-8.199-4.1c-0.301,0-6.101-8.6-6.7-9.6c0.7-0.8,2-2.2,2-3.7 c0-4.1-2.8-6.7-5.4-8.4c-1.899-1.1-7.5-3.3-10.399-3.3h-2.5c-3.4,0-7.5,1.9-8.101,4.5h-8.7c-0.6-2.5-2.6-4.8-5.7-4.8h-1.7 c-5.6,0-15.2,9.6-15.2,15.2v2.2H287.1z\" id=\"_65428032\"/>\n    <path d=\"M364.6,378.6l0.601,9c0.2,2.4,1.6,2.1,3.1,2.8c1.3-0.7,3.101-1.2,3.101-3.1 c0-1.3-0.301-1.7-0.9-2.5l0.9-6.5L364.6,378.6z\" fill=\"#FFFFFF\" id=\"_65789088\"/>\n    <path d=\"M330.1,423.2c0-8.5,5.2-16.4,10.2-19.8c7.4-5,12.5-5.4,24.3-5.4c1.2,0,7.4,2.7,8.801,3.3 c2.1,0.8,5.6,3.4,6.899,5.101c1.8,2.3,3.7,3.899,5.101,7c1.199,2.5,2.199,6.199,2.199,9.8v3.7c0,8-3.5,12.1-7,16.6 c-3.699,4.8-9.699,5.7-15.1,8.3c-1.1-1.6-3.4-2.2-6.2-2.2h-1.1c-2.5,0-3.8,1.5-5.3,2.5C339.1,451,330.1,439.4,330.1,424V423.2z M371.4,378.2l-1,6.5c0.6,0.8,1,1.2,1,2.5c0,1.8-1.801,2.4-3.101,3.1c-1.5-0.7-3-0.4-3.1-2.8l-0.601-9L371.4,378.2z M328.8,398.7 c-1.1,1.5-2.899,3.3-4.1,5c-0.9,1.3-2.5,4.399-3.2,5.899c-1.7,4-2.7,9.7-2.7,15.301c0,12,3.9,19.399,9.601,25.8 c2.8,3.1,6.1,5.7,10,7.7c2.399,1.199,10,4.399,13.199,4.5c2,3.8,7,6.1,11.801,3.699c2-1,3.8-3.899,4.8-4.199 c2.5-0.801,4.2-1.2,6.6-2.101c9.5-3.8,14-8.1,19.2-16.2c4.4-7,5.5-19.5,3.3-29.6c-1.2-5.4-3.2-8.1-5.7-12c-1.3-2-6.899-7.8-9-8.4 l-0.6-16.4c-3-1.5-8.7-3.7-12-4.9c-0.3-0.1-13.4,0.6-15.8,0.7c-4.9,0.1-11.5,0.2-15.2,1.6c-3.4,1.3-8.3,3.7-11.4,5.4L328.8,398.7z\" id=\"_66342352\"/>\n    <path d=\"M263.5,345.1c0-1.5,2.8-2.2,3.6-3.4c0.7-1.1,2.6-3.1,2.9-4.2l4.9,4.1c-1.1,0.7-3.6,2.7-4.3,3.6 c-1,1.2-1.3,3.6-3.7,3.6h-0.6c-0.7,0-2.8-1.7-2.8-2.5V345.1z M222.5,380.5c0-13.7,13.4-27.3,27-27.3h2.5c9.9,0,14.8,6.8,20.2,11.6 c2.8,2.6,5.5,4.9,8.2,7.6c2,2,6.1,6.1,8.2,7.5c1.4-2.3,12.8-12.9,12.8-14.3c0-0.8-5.3-12.5-6-13.1c-3.3-3.3-6.6-6.1-9.8-9.3 c-3-3-6.7-6.6-10-9.1c-2-1.6-10.3-4-13.3-5.6l-13,13.9c-11.5-0.1-19.6,5.2-25.4,10.9c-5,5-12.2,14.3-12.2,24.1v3.4 c0,4.6,1.6,10,2.8,13.5c0.8,1.8,1.7,3.7,2.7,5.5c1.6,2.9,1.7,2,1.5,5.601c-0.2,3.8,0.9,1.8-1.4,5.6c-1,1.5-2.1,3.7-2.8,5.4 c-1.3,3-3,9-3,13v3.6c0,16.1,17.2,34.2,32,35.4l-1.4,4.199l11.3-3v5l9.7-6.6l1.3,3.8l7-8.6l2.5,2.899l0.2-0.199 c0.1-1.2,1.8-4.801,2.3-6.101c0.8-2.2,0.3-1.1,1.8-2.399c0.6-0.5,1.2-1.7,1.2-2.7c0-2.4-3.2-5.601-5.5-6c-2.3-0.5-5.4,2.5-7.2,3.6 c-4.2,2.601-10.4,5.5-17,5.5h-0.8c-13,0-26.1-13-26.1-26.1v-1.2c0-6.3,2.9-11.6,5.1-15.7c11.6,0,12.7-18.3-0.3-18.3 c-2.5-3.6-5.1-9.2-5.1-15.2V380.5z\" id=\"_66285896\"/>\n  </g>";
            }
        },
        BOMB_BOMBING("02", "Bomb/Bombing", ActivityEntity.INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 195.5005 424.3975)\">BOMB</text>\n  </g>";
            }
        },
        IED_EVENT("03", "IED Event", ActivityEntity.INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 208.5 439.25)\">IED</text>\n  </g>";
            }
        },
        SHOOTING("04", "Shooting", ActivityEntity.INCIDENT, GraphicType.NA),
        ILLEGAL_DRUG_OPERATION("05", "Illegal Drug Operation", ActivityEntity.INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"76\" transform=\"matrix(1 0 0 1 192.5 426.25)\">DRUG</text>\n  </g>";
            }
        },
        EXPLOSION("06", "Explosion", ActivityEntity.INCIDENT, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"191.4,394.2 230.6,364.6 223.4,319.8 253.8,341.4 262.6,301.4 288.2,348.6 301,287.8 318.6,334.2 347.4,299.8 353,344.6 381.8,320.6 381.8,370.2 416.2,401.4 381.8,430.2 389,462.2 356.2,446.2 351.4,486.2 325.8,440.6 305,505.4 284.2,455.8 265.8,481.4 249.8,433.4 216.2,447.8 226.6,425.4 191.4,394.2\" stroke=\"#000000\" stroke-width=\"8\" transform=\"matrix(0.98,0,0,0.98,6.11034,7.9055)\"/>\n  </g>";
            }
        },
        HOUSE("07", "House", ActivityEntity.INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M 270,443.382 V 396.025 H 260 L 309.77526,349.62992 360,396.025 h -10 v 47.357 h -30 v -40.365 h -20 v 40.365 z\" style=\"fill:#000000;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1;fill-opacity:1\"/>\n  </g>";
            }
        },
        DEMONSTRATION("01", "Demonstration", ActivityEntity.CIVIL_DISTURBANCE, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"80\" transform=\"matrix(1 0 0 1 190.5 426.25)\">MASS</text>\n  </g>";
            }
        },
        PATROLLING("01", "Patrolling", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"201\" x2=\"289\" y1=\"399\" y2=\"399\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"196\" x2=\"216\" y1=\"402\" y2=\"379\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"196\" x2=\"216\" y1=\"396\" y2=\"419\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"266\" x2=\"286\" y1=\"380\" y2=\"398\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"263\" x2=\"381\" y1=\"379\" y2=\"379\"/>\n    <text font-family=\"sans-serif\" font-size=\"48\" transform=\"matrix(1 0 0 1 382.9951 396)\">P</text>\n  </g>";
            }
        },
        PSYCHOLOGICAL_OPERATIONS("02", "Psychological Operation (PSYOPS)", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"#FFFFFF\" points=\"223,356 223,436 313,436 353,476 353,316 313,356 223,356 223,436\" stroke=\"#000000\" stroke-width=\"10\" style=\"fill:#000000;fill-opacity:1\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"353\" x2=\"393\" y1=\"413\" y2=\"413\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"353\" x2=\"393\" y1=\"379\" y2=\"379\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"353\" x2=\"393\" y1=\"346\" y2=\"346\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"353\" x2=\"393\" y1=\"446\" y2=\"446\"/>\n  </g>";
            }
        },
        FORAGING_SEARCHING("03", "Foraging/Searching", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M205.101,394c0-30,54.6-30,54.6,0s54.601,30,54.601,0s54.6-30,54.6,0 c0,10,9.1,10,9.1,10h26\" fill=\"none\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"382\" x2=\"407\" y1=\"384\" y2=\"407\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"382\" x2=\"407\" y1=\"424\" y2=\"401\"/>\n  </g>";
            }
        },
        RECRUITMENT("04", "Recruitment", ActivityEntity.OPERATION, GraphicType.NA),
        MINE_LAYING("05", "Mine Laying", ActivityEntity.OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"none\" height=\"60\" stroke=\"#000000\" stroke-width=\"10\" width=\"180\" x=\"215\" y=\"366\"/>\n    <ellipse cx=\"245\" cy=\"396\" rx=\"20\" ry=\"20\"/>\n    <ellipse cx=\"305\" cy=\"396\" rx=\"20\" ry=\"20\"/>\n    <ellipse cx=\"365\" cy=\"396\" rx=\"20\" ry=\"20\"/>\n  </g>";
            }
        },
        SPY("06", "Spy", ActivityEntity.OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"110\" transform=\"matrix(1 0 0 1 192.5 439.25)\">SPY</text>\n  </g>";
            }
        },
        WARRANT_SERVED("07", "Warrant Served", ActivityEntity.OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"90\" transform=\"matrix(1 0 0 1 201.5 435.25)\">WNT</text>\n  </g>";
            }
        },
        EXFILTRATION("08", "Exfiltration", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 234.3296 345.25)\">EXFL</text>\n    <ellipse cx=\"305.999\" cy=\"371.25\" fill=\"none\" rx=\"20\" ry=\"20\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305.999\" x2=\"305.999\" y1=\"391.25\" y2=\"501.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"275.999\" x2=\"335.999\" y1=\"421.25\" y2=\"421.25\"/>\n  </g>";
            }
        },
        INFILTRATION("09", "Infiltration", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 243.3296 345.25)\">INFL</text>\n    <ellipse cx=\"305.999\" cy=\"371.25\" fill=\"none\" rx=\"20\" ry=\"20\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305.999\" x2=\"305.999\" y1=\"391.25\" y2=\"501.25\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"275.999\" x2=\"335.999\" y1=\"421.25\" y2=\"421.25\"/>\n  </g>";
            }
        },
        MEETING("10", "Meeting", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <ellipse cx=\"237.999\" cy=\"368.916\" fill=\"none\" rx=\"18\" ry=\"18\" stroke=\"#000000\" stroke-width=\"9.0002\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.0002\" x1=\"237.999\" x2=\"237.999\" y1=\"386.916\" y2=\"485.918\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.0002\" x1=\"210.998\" x2=\"264.999\" y1=\"413.917\" y2=\"413.917\"/>\n    </g>\n    <g>\n      <ellipse cx=\"307.002\" cy=\"394.998\" fill=\"none\" rx=\"18\" ry=\"18\" stroke=\"#000000\" stroke-width=\"9.0002\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.0002\" x1=\"307.002\" x2=\"307.002\" y1=\"412.998\" y2=\"512\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.0002\" x1=\"280.001\" x2=\"334.002\" y1=\"439.999\" y2=\"439.999\"/>\n    </g>\n    <g>\n      <ellipse cx=\"375.25\" cy=\"368.916\" fill=\"none\" rx=\"18\" ry=\"18\" stroke=\"#000000\" stroke-width=\"9.0002\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.0002\" x1=\"375.25\" x2=\"375.25\" y1=\"386.916\" y2=\"485.918\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.0002\" x1=\"348.25\" x2=\"402.25\" y1=\"413.917\" y2=\"413.917\"/>\n    </g>\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 239.3491 342.25)\">MTG</text>\n  </g>";
            }
        },
        RAID_ON_HOUSE("11", "Raid on House", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"#FFFFFF\" points=\"229.104,406.214 229.104,472.75 229.104,472.75 383.5,472.75 383.5,406.214 307.006,350.5 229.104,406.214 229.104,472.75\" stroke=\"#000000\" stroke-width=\"9.3858\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.3858\" x1=\"229.104\" x2=\"383.5\" y1=\"406.214\" y2=\"406.214\"/>\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 235.5 344.5)\">RAID</text>\n  </g>";
            }
        },
        EMERGENCY_OPERATION("12", "Emergency Operation", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306\" cy=\"396\" rx=\"80\" ry=\"80\" stroke=\"#000000\"/>\n    <polygon fill=\"#FFFFFF\" points=\"306,316 375,436 237,436\" stroke=\"#000000\" stroke-linejoin=\"bevel\"/>\n  </g>";
            }
        },
        EMERGENCY_MEDICAL_OPERATION("13", "Emergency Medical Operation", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"259,395.3 220.8,417.8 243.5,457.4 282.1,435.2 282.2,479.4 327.8,479.4 327.8,435.4 366.4,457.5 389.5,418.2 351.3,395.4 389.7,373 366.5,333.4 327.9,355.6 327.8,310.9 282.2,310.9 282.2,355.4 243.6,333.4 220.9,373\"/>\n  </g>";
            }
        },
        FIRE_FIGHTING_OPERATION("14", "Fire Fighting Operation", ActivityEntity.OPERATION, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline points=\"255,316 355,316 305,396 355,476 255,476 305,396\" stroke=\"#000000\"/>\n    <polyline points=\"225,346 225,446 305,396 385,446 385,346 305,396\" stroke=\"#000000\"/>\n    <ellipse cx=\"305\" cy=\"396\" rx=\"65\" ry=\"65\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        LAW_ENFORCEMENT_OPERATION("15", "Law Enforcement Operation", ActivityEntity.OPERATION, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon points=\"304.5,297 333.355,346.522 390.67,346.75 362.21,396.5 390.67,446.25 333.355,446.479 304.5,496 275.645,446.479 218.33,446.25 246.79,396.5 218.33,346.75 275.645,346.522\" stroke=\"#000000\"/>\n    <ellipse cx=\"304\" cy=\"296\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"304\" cy=\"496\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"220\" cy=\"347\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"390\" cy=\"346\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"390\" cy=\"447\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n    <ellipse cx=\"220\" cy=\"447\" rx=\"12\" ry=\"12\" stroke=\"#000000\"/>\n  </g>";
            }
        },
        HAZARD_MATERIALS_INCIDENT("01", "Hazard Materials Incident", ActivityEntity.HAZARD_MATERIALS, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M207.3,397.1l196.3-0.1l-98.2,98.1L207.3,397.1z M374.6,365c1.5,1,15.2,14.7,15.2,15.6v14.9h-15.2V365z M343.8,334.2c1.5,1,15.2,14.7,15.2,15.6v45.7h-15.2V334.2z M282.5,319.3c0-0.9,13.7-14.6,15.2-15.6v91.8h-15.2V319.3z M252,349.8 c0-0.9,13.7-14.6,15.2-15.6v61.3H252V349.8z M236.3,364.9l0.1,30.5h-14.8V381c0-0.7-0.1-0.7-0.3-1L236.3,364.9z M313.3,303.7 l15.5,15.3c-0.399,1-0.3-0.3-0.3,1.1v75.4h-15.2V303.7z M197.3,395.4l108.3,108.3l108.1-108.3L305.4,287.3L197.3,395.4z\" id=\"_65673176\"/>\n  </g>";
            }
        },
        AIR("01", "Air", ActivityEntity.TRANSPORTATION_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FFFFFF\" height=\"90.75\" stroke=\"#231F20\" stroke-miterlimit=\"10\" stroke-width=\"5\" width=\"19.46\" x=\"268.5\" y=\"348.5\"/>\n    <rect fill=\"#FFFFFF\" height=\"57\" stroke=\"#231F20\" stroke-miterlimit=\"10\" stroke-width=\"5\" width=\"15\" x=\"351.5\" y=\"365.5\"/>\n    <rect fill=\"#FFFFFF\" height=\"14\" stroke=\"#231F20\" stroke-miterlimit=\"10\" stroke-width=\"5\" width=\"136.56\" x=\"243.4\" y=\"387.5\"/>\n  </g>";
            }
        },
        MARINE("02", "Marine", ActivityEntity.TRANSPORTATION_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFFFF\" points=\"250,400.66 276.996,441.154 344.485,441.154 371.481,400.66 250,400.66 344.485,400.66 310.74,360.167 310.74,400.66\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        RAIL("03", "Rail", ActivityEntity.TRANSPORTATION_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"none\" points=\"356.189,440.25 263.276,440.25 263.276,350.475 313.5,350.475 313.5,393.165 356.189,393.165\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        VEHICLE("04", "Vehicle", ActivityEntity.TRANSPORTATION_INCIDENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"194\" x2=\"414\" y1=\"378.5\" y2=\"378.5\"/>\n    <ellipse cx=\"384\" cy=\"403.5\" fill=\"none\" rx=\"25\" ry=\"25\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"224\" cy=\"403.5\" fill=\"none\" rx=\"25\" ry=\"25\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        GEOLOGIC("01", "Geologic", ActivityEntity.NATURAL_EVENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-9.96098)\">\n    <text font-family=\"sans-serif\" font-size=\"84px\" transform=\"translate(195.001,426.0098)\">GEOL</text>\n  </g>";
            }
        },
        HYDRO_METEOROLOGICAL("02", "Hydro-Meteorological", ActivityEntity.NATURAL_EVENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" style=\"display:inline\" transform=\"translate(-8.36332,-2.42213)\">\n    <text font-family=\"sans-serif\" font-size=\"80px\" transform=\"translate(196.001,426.0098)\">HYDR</text>\n  </g>";
            }
        },
        INFESTATION("03", "Infestation", ActivityEntity.NATURAL_EVENT, GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-7.58012,-1.07833)\">\n    <text font-family=\"sans-serif\" font-size=\"92px\" transform=\"translate(200.501,429.0283)\">INFS</text>\n  </g>";
            }
        },
        RELIGIOUS_LEADER("01", "Religious Leader", ActivityEntity.INDIVIDUAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <text font-family=\"sans-serif\" font-size=\"55\" transform=\"matrix(1 0 0 1 254.9004 492.5)\">REL</text>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"308.402\" x2=\"308.402\" y1=\"377.951\" y2=\"444.105\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"290.361\" x2=\"326.445\" y1=\"395.992\" y2=\"395.992\"/>\n    <ellipse cx=\"308.402\" cy=\"365.923\" fill=\"none\" rx=\"12.028\" ry=\"12.028\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <text font-family=\"sans-serif\" font-size=\"55\" transform=\"matrix(1 0 0 1 253.3828 337.5)\">LDR</text>\n  </g>";
            }
        },
        SPEAKER("02", "Speaker", ActivityEntity.INDIVIDUAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <ellipse cx=\"306.947\" cy=\"391.346\" fill=\"none\" rx=\"12.028\" ry=\"12.028\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"306.947\" x2=\"306.947\" y1=\"403.374\" y2=\"469.528\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"288.906\" x2=\"324.99\" y1=\"421.415\" y2=\"421.415\"/>\n    <text font-family=\"sans-serif\" font-size=\"55\" transform=\"matrix(1 0 0 1 251.9277 362.9229)\">SPK</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ActivityEntity entity;
    private final GraphicType graphicType;

    ActivityEntityType(String id, String label, ActivityEntity entity, GraphicType graphicType) {
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

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return ActivitySymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}