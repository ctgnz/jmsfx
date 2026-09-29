package io.github.ctgnz.jmsfx.historical.cyberspaceseasurface;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum CyberspaceSeaSurfaceSectorTwoModifier implements SectorTwoModifier {
        SECURED("01", "Secured", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <rect height=\"29.53846\" rx=\"6\" ry=\"6\" style=\"fill:#000000;fill-rule:evenodd;stroke-width:3.25846;fill-opacity:1\" width=\"49.84615\" x=\"280.07788\" y=\"474.61539\"/>\n    <path d=\"m 318.21842,475.42311 c 0.11538,-4.38462 1.18595,-22.0093 -13.21746,-22.0291 -14.4034,-0.0198 -13.21746,16.95217 -13.21746,22.0291\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        OPEN("02", "Open", ModifierCategory.None) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <rect height=\"29.53846\" rx=\"6\" ry=\"6\" style=\"fill:#000000;fill-opacity:1;fill-rule:evenodd;stroke-width:3.25846\" width=\"49.84615\" x=\"280.07788\" y=\"474.61539\"/>\n    <path d=\"m 344.61879,475.42311 c 0.11538,-4.38462 1.18595,-22.0093 -13.21746,-22.0291 -14.4034,-0.0198 -13.21746,16.95217 -13.21746,22.0291\" style=\"fill:none;stroke:#000000;stroke-width:8;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <rect height=\"2.69694\" style=\"fill:#000000;fill-rule:evenodd;stroke-width:6.99393\" width=\"7.9873886\" x=\"287.8003\" y=\"473.0874\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    CyberspaceSeaSurfaceSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.CYBERSPACE_SEA_SURFACE;
    }

    @Override
    public SymbolSet getBaseSymbolSet() {
        return SymbolSetEnum.CYBERSPACE;
    }

}