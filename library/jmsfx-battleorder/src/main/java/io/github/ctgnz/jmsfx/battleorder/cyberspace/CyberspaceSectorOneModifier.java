package io.github.ctgnz.jmsfx.battleorder.cyberspace;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum CyberspaceSectorOneModifier implements SectorOneModifier {
        DEFENSIVE_CYBERSPACE("01", "Defensive Cyberspace", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-11.10046)\">\n    <path d=\"M 240,345 265.84615,300 290,345 Z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 291.11538,345 25.84616,-45 24.15384,45 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 342.23077,345 25.84615,-45 24.15385,45 z\" style=\"fill:#000000;fill-opacity:1;stroke:#000000;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        },
        OFFENSIVE_CYBERSPACE("02", "Offensive Cyberspace", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(1.0201,0,0,1.15299,-15.70958,-54.2774)\">\n    <path d=\"m 249.91602,315.93555 v 10 h 102.48437 v -10 z\" style=\"color:#000000;fill:#000000;-inkscape-stroke:none\"/>\n    <path d=\"m 342.39027,298.40584 v 45.05942 l 35.93945,-22.5297 c -11.9782,-7.51297 -23.95937,-15.02029 -35.93945,-22.52972 z\" style=\"color:#000000;fill:#000000;fill-rule:evenodd;stroke-width:1.04137;-inkscape-stroke:none\"/>\n  </g>";
            }
        },
        RESPONSE_ACTIONS("03", "Response Actions", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text style=\"font-style:normal;font-weight:normal;font-size:72px;line-height:1.25;font-family:sans-serif;fill:#000000;fill-opacity:1;stroke:none\" x=\"254.30174\" xml:space=\"preserve\" y=\"344.84366\">\n      <tspan x=\"254.30174\" y=\"344.84366\">RA</tspan>\n    </text>\n  </g>";
            }
        },
        EXTERNAL_DEFENCE_MEASURES("04", "External Defence Measures", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text style=\"font-style:normal;font-weight:normal;font-size:56px;line-height:1.25;font-family:sans-serif;fill:#000000;fill-opacity:1;stroke:none\" x=\"242.12401\" xml:space=\"preserve\" y=\"343.74347\">\n      <tspan x=\"242.12401\" y=\"343.74347\">EDM</tspan>\n    </text>\n  </g>";
            }
        },
        INTERNAL_DEFENCE_MEASURES("05", "Internal Defence Measures", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text style=\"font-style:normal;font-weight:normal;font-size:56px;line-height:1.25;font-family:sans-serif;fill:#000000;fill-opacity:1;stroke:none\" x=\"248.90526\" xml:space=\"preserve\" y=\"343.74347\">\n      <tspan x=\"248.90526\" y=\"343.74347\">IDM</tspan>\n    </text>\n  </g>";
            }
        },
        SOCIAL("06", "Social", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-2.47443)\">\n    <g transform=\"matrix(0.8,0,0,0.8,62.61387,63.11082)\">\n      <path d=\"M 306.0769,352.8784 V 307.98393\" style=\"fill:none;stroke:#000000;stroke-width:6.64962;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 288.55698,316.64664 h 35.03985\" style=\"fill:none;stroke:#000000;stroke-width:7.16796;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <circle cx=\"306.0769\" cy=\"294.03799\" r=\"14\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:6;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <g transform=\"matrix(0.8,0,0,0.8,61.40608,61.96661)\">\n      <path d=\"M 269.8435,354.30865 V 308.6196\" style=\"fill:none;stroke:#000000;stroke-width:6.7082;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 252.32358,317.2823 h 35.03985\" style=\"fill:none;stroke:#000000;stroke-width:7.16796;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <circle cx=\"269.8435\" cy=\"298.67368\" r=\"11.2\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4.8;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n    <g transform=\"matrix(0.8,0,0,0.8,121.79509,61.96661)\">\n      <path d=\"M 269.8435,354.30865 V 308.6196\" style=\"fill:none;stroke:#000000;stroke-width:6.7082;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <path d=\"m 252.32358,317.2823 h 35.03985\" style=\"fill:none;stroke:#000000;stroke-width:7.16796;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n      <circle cx=\"269.8435\" cy=\"298.67368\" r=\"11.2\" style=\"fill:none;fill-rule:evenodd;stroke:#000000;stroke-width:4.8;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        WIRED("07", "Wired", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(1.7846)\">\n    <g transform=\"matrix(1.1,0,0,1.1,-30.32164,-31.87904)\">\n      <rect height=\"25.42695\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:6\" transform=\"rotate(45)\" width=\"25.42695\" x=\"397.22067\" y=\"28.19004\"/>\n      <rect height=\"25.42695\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke:none;stroke-width:6\" transform=\"rotate(45)\" width=\"25.42695\" x=\"457.00275\" y=\"-31.59202\"/>\n      <path d=\"m 262.21542,319.10822 83.90894,-0.31784\" style=\"fill:none;stroke:#000000;stroke-width:6;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    </g>\n  </g>";
            }
        },
        RADIO_FREQUENCY("08", "Radio Frequency", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text style=\"font-style:normal;font-weight:normal;font-size:72px;line-height:1.25;font-family:sans-serif;fill:#000000;fill-opacity:1;stroke:none\" x=\"256.22165\" xml:space=\"preserve\" y=\"343.74347\">\n      <tspan x=\"256.22165\" y=\"343.74347\">RF</tspan>\n    </text>\n  </g>";
            }
        },
        OPERATING_SYSTEM("09", "Operating System", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"matrix(0.9,0,0,0.9,-237.93315,24.0621)\">\n    <path d=\"m 564.02734,303.42969 -4.65234,6.52734 -3.91602,0.082 -6.52734,-5.2207 -4.56836,2.2832 1.63281,8.73047 -2.9375,3.3457 -8.24023,-0.49023 -0.73438,5.79297 5.71094,4.16015 0.48828,4.97852 -5.30273,5.62891 1.55078,4.81445 9.46484,-1.38672 2.60938,2.93555 0.49023,8.64844 5.79297,1.71484 3.99805,-7.26172 4.56836,-0.082 6.03711,5.79297 4.40625,-2.5293 -1.14258,-8.24023 2.61133,-3.50782 8.8125,-0.082 0.9785,-5.63086 -6.52734,-4.16015 v -5.54883 l 4.97656,-4.73242 -1.87695,-5.0586 -9.13672,0.89844 -2.36719,-2.61133 -0.4082,-8.48437 z m -4.64257,13.28125 a 13,13 0 0 1 13,13 13,13 0 0 1 -13,13 13,13 0 0 1 -13,-13 13,13 0 0 1 13,-13 z\" style=\"fill:#000000;fill-opacity:1;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n    <path d=\"m 606.01362,282.756 -3.4482,7.23605 -3.8423,0.76076 -7.33474,-4.00793 -4.10248,3.0418 3.12403,8.3143 -2.3119,3.80497 -8.20017,0.94812 0.28272,5.83248 6.34658,3.10526 1.34537,4.81809 -4.24472,6.4642 2.36324,4.472 9.08025,-3.0092 3.07949,2.43784 1.98457,8.43192 6.00274,0.68285 2.67632,-7.84565 4.48472,-0.87405 6.95133,4.65663 3.9001,-3.25601 -2.55612,-7.91663 1.96253,-3.90798 8.66438,-1.61103 -0.0141,-5.71523 -7.15058,-2.9635 -0.96354,-5.46453 4.07917,-5.5247 -2.72685,-4.65582 -8.8419,2.47137 -2.78468,-2.1606 -1.87529,-8.2846 z m -2.26578,13.88565 a 13,13 0 0 1 15.05993,10.54508 13,13 0 0 1 -10.54507,15.05992 13,13 0 0 1 -15.05993,-10.54507 13,13 0 0 1 10.54507,-15.05993 z\" style=\"fill:#000000;fill-opacity:1;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    CyberspaceSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.CYBERSPACE;
    }

}