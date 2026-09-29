package io.github.ctgnz.jmsfx.historical.dismountedindividual;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum DismountedIndividualSectorOneModifier implements SectorOneModifier {
        NGO("07", "Non-Governmental Organization Member", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(0,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(239.665,343.5029)\">NGO</text>\n  </g>";
            }
        },
        FAO("11", "Field Artillery Observer", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.6,0,0,0.6,121.9508,71.83343)\">\n    <polygon fill=\"none\" id=\"symbol\" points=\"364.479,441.015 245.685,441.015 305.082,353.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"245.685\" x2=\"334.78\" y1=\"441.01501\" y2=\"397.38199\"/>\n    <circle cx=\"304\" cy=\"411\" r=\"16.5\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        JOINT_FIRE_SUPPORT("12", "Joint Fire Support", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(16.36136,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"59.1785px\" transform=\"matrix(1.0139,0,0,1,238.335,344.2832)\">JFS</text>\n  </g>";
            }
        },
        LIAISON("13", "Liaison", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(6.44018,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"66.7872px\" transform=\"matrix(1.0761,0,0,1,249.1143,344.3135)\">LO</text>\n  </g>";
            }
        },
        MESSENGER("14", "Messenger", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-4.50875,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(239.665,343.5029)\">MSG</text>\n  </g>";
            }
        },
        MILITARY_POLICE("15", "Military Police (MP)", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(1.49212,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"66.7872px\" transform=\"matrix(1.0761,0,0,1,249.1143,344.3135)\">MP</text>\n  </g>";
            }
        },
        OBSERVER("16", "Observer", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.6,0,0,0.6,121.9508,71.83343)\">\n    <polygon fill=\"none\" id=\"symbol\" points=\"364.479,441.015 245.685,441.015 305.082,353.75\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        DESIGNATED_MARKSMAN("17", "Designated Marksman (DM)", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-2.08733,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"66.7872px\" transform=\"matrix(1.0761,0,0,1,249.1143,344.3135)\">DM</text>\n  </g>";
            }
        },
        SIGNALLER("20", "Signaller", ModifierCategory.Service) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(9.1143,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(239.665,343.5029)\">SIG</text>\n  </g>";
            }
        },
        RECONNAISSANCE("21", "Reconnaissance", ModifierCategory.Service) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(2.80082,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(239.665,343.5029)\">REC</text>\n  </g>";
            }
        },
        INFANTRY("22", "Infantry", ModifierCategory.Service) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(14.91505,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"66.7872px\" transform=\"matrix(1.0761,0,0,1,249.1143,344.3135)\">IN</text>\n  </g>";
            }
        },
        COMMANDER("23", "Commander (CDR)", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-1.38864,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(239.665,343.5029)\">CDR</text>\n  </g>";
            }
        },
        SECOND_IN_COMMAND("24", "Second in Command (SIC)", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(10.46195,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(239.665,343.5029)\">SIC</text>\n  </g>";
            }
        },
        DEMOLITION("25", "Demolition", ModifierCategory.Task) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-2.03317,-4)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(239.665,343.5029)\">DEM</text>\n  </g>";
            }
        },
        POLICE("26", "Police", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.6,0,0,0.6,122.36381,78.22658)\">\n    <path d=\"m 261.659,351.621 c 0,71.906 16.594,77.438 45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 350.159,351.621 c 0,71.906 -16.594,77.438 -45.909,88.5\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <path d=\"m 260,351.621 c 23.785,13.828 23.785,13.828 45.91,0 22.125,13.828 22.125,13.828 45.909,0\" fill=\"none\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        INDIVIDUAL("46", "Individual", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <linearGradient gradientUnits=\"userSpaceOnUse\" x1=\"270\" x2=\"340\" y1=\"321.5\" y2=\"321.5\">\n      <stop offset=\"0\" style=\"stop-color:#FFFFFF\"/>\n      <stop offset=\"1\" style=\"stop-color:#000000\"/>\n    </linearGradient>\n    <line fill=\"url(#mod1_3_)\" stroke=\"#000000\" stroke-width=\"12\" x1=\"270\" x2=\"340\" y1=\"321.5\" y2=\"321.5\"/>\n  </g>";
            }
        },
        TEAM("47", "Team/Crew", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"70.2819\" transform=\"matrix(0.7882 0 0 1 283.4556 341.2451)\">Ø</text>\n  </g>";
            }
        },
        SQUAD("48", "Squad", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <circle cx=\"305\" cy=\"319.5\" r=\"17.5\"/>\n  </g>";
            }
        },
        SECTION("49", "Section", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <circle cx=\"282.5\" cy=\"319.5\" r=\"17.5\"/>\n    <circle cx=\"327.5\" cy=\"319.5\" r=\"17.5\"/>\n  </g>";
            }
        },
        PLATOON("50", "Platoon/Detachment", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <circle cx=\"305\" cy=\"319.5\" r=\"17.5\"/>\n    <circle cx=\"346.5\" cy=\"319.5\" r=\"17.5\"/>\n    <circle cx=\"263.5\" cy=\"319.5\" r=\"17.5\"/>\n  </g>";
            }
        },
        STAFFEL("A0", "Staffel", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-20)\">\n    <circle cx=\"304.5\" cy=\"319.5\" r=\"17.5\"/>\n    <circle cx=\"345.5\" cy=\"319.5\" r=\"17.5\"/>\n    <circle cx=\"263.5\" cy=\"319.5\" r=\"17.5\"/>\n    <circle cx=\"386.5\" cy=\"319.5\" r=\"17.5\"/>\n  </g>";
            }
        },
        COMPANY("51", "Company", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"305\" x2=\"305\" y1=\"294.5\" y2=\"344.5\"/>\n  </g>";
            }
        },
        BATTALION("52", "Battalion", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"296.75\" x2=\"296.75\" y1=\"294.5\" y2=\"344.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"313.25\" x2=\"313.25\" y1=\"294.5\" y2=\"344.5\"/>\n  </g>";
            }
        },
        REGIMENT("53", "Regiment/Group", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"305\" x2=\"305\" y1=\"294.5\" y2=\"344.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"321\" x2=\"321\" y1=\"294.5\" y2=\"344.5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"289\" x2=\"289\" y1=\"294.5\" y2=\"344.5\"/>\n  </g>";
            }
        },
        BRIGADE("A1", "Brigade", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n  </g>";
            }
        },
        DIVISION("A2", "Division", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-19)\">\n    <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    <g transform=\"translate(38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        CORPS("A3", "Corps/MEF", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    <g transform=\"translate(-38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <g transform=\"translate(38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        ARMY("A4", "Army", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(19)\">\n    <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    <g transform=\"translate(-38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <g transform=\"translate(-76)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <g transform=\"translate(38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        ARMY_GROUP("A5", "Army Group/Front", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    <g transform=\"translate(-38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <g transform=\"translate(-76)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <g transform=\"translate(38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <g transform=\"translate(76)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        THEATRE("A6", "Theatre/Region", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-57)\">\n    <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    <g transform=\"translate(-38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <g transform=\"translate(38)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <path d=\"M 409.96484,295.85 H 403.035 l 1.6e-4,3.99961 L 414.38086,319.5 403.035,339.1504 V 343.15 h 6.92984 L 419,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 423.61914,319.5 434.96484,299.8496 434.965,295.85 h -6.92984 L 419,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    <g transform=\"translate(76)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n    <g transform=\"translate(152)\">\n      <path d=\"M 295.96484,295.85 H 289.035 l 1.6e-4,3.99961 L 300.38086,319.5 289.035,339.1504 V 343.15 h 6.92984 L 305,327.50195 l 9.03516,15.64844 6.92984,-3.9e-4 v -3.99961 L 309.61914,319.5 320.96484,299.8496 320.965,295.85 h -6.92984 L 305,311.49805 Z\" style=\"baseline-shift:baseline;display:inline;overflow:visible;opacity:1;vector-effect:none;enable-background:accumulate;stop-color:#000000;stop-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        COMMAND("A7", "Command", ModifierCategory.Echelon) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-21.75)\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"296.75\" x2=\"296.75\" y1=\"294.5\" y2=\"344.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"321.75\" x2=\"271.75\" y1=\"319.5\" y2=\"319.5\"/>\n    </g>\n    <g transform=\"translate(60)\">\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"296.75\" x2=\"296.75\" y1=\"294.5\" y2=\"344.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"8\" x1=\"321.75\" x2=\"271.75\" y1=\"319.5\" y2=\"319.5\"/>\n    </g>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    DismountedIndividualSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.DISMOUNTED;
    }

}