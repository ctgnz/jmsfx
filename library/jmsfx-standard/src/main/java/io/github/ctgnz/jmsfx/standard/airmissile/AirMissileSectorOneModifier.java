package io.github.ctgnz.jmsfx.standard.airmissile;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum AirMissileSectorOneModifier implements SectorOneModifier {
        AIR("01", "Air", ModifierCategory.LaunchOrigin) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"A\" transform=\"matrix(1 0 0 1 195.543 423.5166)\">A</text>\n  </g>";
            }
        },
        SURFACE("02", "Surface", ModifierCategory.LaunchOrigin) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"S\" transform=\"matrix(1 0 0 1 195.543 423.5166)\">S</text>\n  </g>";
            }
        },
        SUB("03", "Subsurface", ModifierCategory.LaunchOrigin) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g id=\"SU\">\n      <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 205.75 391.9072)\">S</text>\n      <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 204.75 448.3164)\">U</text>\n    </g>\n  </g>";
            }
        },
        SPACE("04", "Space", ModifierCategory.LaunchOrigin) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g id=\"SP\">\n      <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 205.75 391.9072)\">S</text>\n      <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 205.75 448.3164)\">P</text>\n    </g>\n  </g>";
            }
        },
        AB("05", "Anti-Ballistic", ModifierCategory.MissileClass) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g id=\"AB\">\n      <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 202.75 389.9072)\">A</text>\n      <text font-family=\"sans-serif\" font-size=\"74.919\" transform=\"matrix(1 0 0 1 202.75 446.3164)\">B</text>\n    </g>\n  </g>";
            }
        },
        BALLISTIC("06", "Ballistic", ModifierCategory.MissileClass) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"88\" id=\"B\" transform=\"matrix(1 0 0 1 195.543 425.5166)\">B</text>\n  </g>";
            }
        },
        CRUISE("07", "Cruise", ModifierCategory.MissileClass) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"C\" transform=\"matrix(1 0 0 1 195.543 423.5166)\">C</text>\n  </g>";
            }
        },
        INTERCEPTOR_MISSILE("08", "Interceptor", ModifierCategory.MissileClass) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"85\" id=\"I\" transform=\"matrix(1 0 0 1 213.543 423.5166)\">I</text>\n  </g>";
            }
        },
        HYPERSONIC("09", "Interceptor", ModifierCategory.MissileClass) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-2,1.6222)\">\n    <g id=\"HV\">\n      <text font-family=\"sans-serif\" font-size=\"74.919px\" transform=\"translate(205.75,391.9072)\">H</text>\n      <text font-family=\"sans-serif\" font-size=\"74.919px\" transform=\"translate(204.75,448.3164)\">V</text>\n    </g>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirMissileSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.AIR_MISSILE;
    }

}