package io.github.ctgnz.jmsfx.standard.seasurface;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum SeaSurfaceSectorOneModifier implements SectorOneModifier {
        OWN("01", "Own Ship", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"OWN\" transform=\"matrix(1 0 0 1 230 344.5146)\">OWN</text>\n  </g>";
            }
        },
        AA("02", "Antiair Warfare", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"AAW\" transform=\"matrix(1 0 0 1 230 344.5146)\">AAW</text>\n  </g>";
            }
        },
        MD("08", "Missile Defense", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"MD\" transform=\"matrix(1.0329 0 0 1 252.2549 345.0469)\">MD</text>\n  </g>";
            }
        },
        RMV("11", "Remote Multi-Mission Vehicle (USV-only)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"RMV\" transform=\"matrix(1 0 0 1 233 344.5146)\">RMV</text>\n  </g>";
            }
        },
        TORPEDO("17", "Torpedo", ModifierCategory.WeaponsCapability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text enable-background=\"new    \" font-family=\"sans-serif\" font-size=\"80\" id=\"T\" opacity=\"0.98\" transform=\"matrix(1 0 0 1 279 344.25)\">T</text>\n  </g>";
            }
        },
        LRST("21", "Ballistic Missile Defense, Long-Range Surveillance and Track (LRST)", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"ST\" transform=\"matrix(1.0329 0 0 1 257.2549 345.0469)\">ST</text>\n  </g>";
            }
        },
        SEA_BASED_X("22", "Sea-Base X-Band", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"64\" id=\"SBX\" transform=\"matrix(1 0 0 1 235 344.5146)\">SBX</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SeaSurfaceSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.SEA_SURFACE;
    }

}