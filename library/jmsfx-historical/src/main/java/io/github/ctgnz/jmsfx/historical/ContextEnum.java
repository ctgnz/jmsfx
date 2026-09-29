package io.github.ctgnz.jmsfx.historical;

import io.github.ctgnz.jmsfx.Context;

public enum ContextEnum implements Context {
        REALITY("0", "Reality"),
        EXERCISE("1", "Exercise") {

            @Override
            public String getOverlayGraphicMarkup() {
                return "<g id=\"frame_overlay\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 452.082 269.8145)\">X</text>\n  </g>";
            }
        },
        SIMULATION("2", "Simulation") {

            @Override
            public String getOverlayGraphicMarkup() {
                return "<g id=\"frame_overlay\">\n    <text font-family=\"sans-serif\" font-size=\"72\" transform=\"matrix(1 0 0 1 452.082 269.8145)\">S</text>\n  </g>";
            }
        },
        RESTRICTED_TARGET("3", "Restricted Target") {

            @Override
            public String getOverlayGraphicMarkup() {
                return "<g id=\"frame_overlay\">\n    <path d=\"M 483.974,318.612 H 371.204 L 427.589,217.62612 Z\" fill=\"#faf183\" stroke=\"#000000\" stroke-dasharray=\"5,5\" stroke-linecap=\"butt\" stroke-miterlimit=\"10\" stroke-width=\"5\" style=\"stroke-dasharray:none;fill:#ffff00;fill-opacity:1\"/>\n    <g transform=\"translate(-1.58918,3.118)\">\n      <path d=\"m 436.01736,239.90652 -1.58767,50.57813 c -2.04943,4.0454 -7.59954,4.15778 -10.3809,0 l -1.7098,-50.57813 c 3.65969,-4.94438 10.31145,-4.94438 13.67837,0 z\" style=\"font-size:96px;stroke-width:1.14136\"/>\n      <ellipse cx=\"429.17816\" cy=\"302.48773\" rx=\"6.09452\" ry=\"6.0944\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:2.6;stroke-dasharray:none\"/>\n    </g>\n  </g>";
            }
        },
        NO_STRIKE_ENTITY("4", "No Strike Entity") {

            @Override
            public String getOverlayGraphicMarkup() {
                return "<g id=\"frame_overlay\">\n    <circle cx=\"428.81268\" cy=\"273.2894\" r=\"50.89394\" style=\"fill:#ffff00;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:8;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 393.21495,237.69166 71.19546,71.19547\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        RESTRICTED_TARGET_EXERCISE("5", "Restricted Target - Exercise") {

            @Override
            public String getOverlayGraphicMarkup() {
                return "<g id=\"frame_overlay\">\n    <path d=\"M 483.974,318.612 H 371.204 L 427.589,217.62612 Z\" fill=\"#faf183\" stroke=\"#000000\" stroke-dasharray=\"5,5\" stroke-linecap=\"butt\" stroke-miterlimit=\"10\" stroke-width=\"5\" style=\"stroke-dasharray:none;fill:#ffff00;fill-opacity:1\"/>\n    <g transform=\"translate(-1.58918,3.118)\">\n      <path d=\"m 436.01736,239.90652 -1.58767,50.57813 c -2.04943,4.0454 -7.59954,4.15778 -10.3809,0 l -1.7098,-50.57813 c 3.65969,-4.94438 10.31145,-4.94438 13.67837,0 z\" style=\"font-size:96px;stroke-width:1.14136\"/>\n      <ellipse cx=\"429.17816\" cy=\"302.48773\" rx=\"6.09452\" ry=\"6.0944\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:2.6;stroke-dasharray:none\"/>\n    </g>\n    <g id=\"frame_overlay-7\" transform=\"translate(8)\">\n      <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(452.082,269.8145)\">X</text>\n    </g>\n  </g>";
            }
        },
        NO_STRIKE_ENTITY_EXERCISE("6", "No Strike Entity - Exercise") {

            @Override
            public String getOverlayGraphicMarkup() {
                return "<g id=\"frame_overlay\">\n    <circle cx=\"428.81268\" cy=\"273.2894\" r=\"50.89394\" style=\"fill:#ffff00;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:8;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 393.21495,237.69166 71.19546,71.19547\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <g id=\"frame_overlay-3\" transform=\"translate(28,-22)\">\n      <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(452.082,269.8145)\">X</text>\n    </g>\n  </g>";
            }
        },
        RESTRICTED_TARGET_SIMULATION("7", "Restricted Target - Simulation") {

            @Override
            public String getOverlayGraphicMarkup() {
                return "<g id=\"frame_overlay\">\n    <path d=\"M 483.974,318.612 H 371.204 L 427.589,217.62612 Z\" fill=\"#faf183\" stroke=\"#000000\" stroke-dasharray=\"5,5\" stroke-linecap=\"butt\" stroke-miterlimit=\"10\" stroke-width=\"5\" style=\"stroke-dasharray:none;fill:#ffff00;fill-opacity:1\"/>\n    <g transform=\"translate(-1.58918,3.118)\">\n      <path d=\"m 436.01736,239.90652 -1.58767,50.57813 c -2.04943,4.0454 -7.59954,4.15778 -10.3809,0 l -1.7098,-50.57813 c 3.65969,-4.94438 10.31145,-4.94438 13.67837,0 z\" style=\"font-size:96px;stroke-width:1.14136\"/>\n      <ellipse cx=\"429.17816\" cy=\"302.48773\" rx=\"6.09452\" ry=\"6.0944\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:2.6;stroke-dasharray:none\"/>\n    </g>\n    <g id=\"frame_overlay-0\" transform=\"translate(2,-6)\">\n      <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(452.082,269.8145)\">S</text>\n    </g>\n  </g>";
            }
        },
        NO_STRIKE_ENTITY_SIMULATION("8", "No Strike Entity - Simulation") {

            @Override
            public String getOverlayGraphicMarkup() {
                return "<g id=\"frame_overlay\">\n    <circle cx=\"428.81268\" cy=\"273.2894\" r=\"50.89394\" style=\"fill:#ffff00;fill-opacity:1;fill-rule:evenodd;stroke:#000000;stroke-width:8;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 393.21495,237.69166 71.19546,71.19547\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <g id=\"frame_overlay-5\" transform=\"translate(22,-20)\">\n      <text font-family=\"sans-serif\" font-size=\"72px\" transform=\"translate(452.082,269.8145)\">S</text>\n    </g>\n  </g>";
            }
        };

    private final String id;
    private final String label;

    ContextEnum(String id, String label) {
        this.id = id;
        this.label = label;
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
    public boolean isReality() {
        return ordinal() == 0;
    }

}