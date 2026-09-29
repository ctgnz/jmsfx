package io.github.ctgnz.jmsfx.standard.air;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum AirSectorTwoModifier implements SectorTwoModifier {
        BOOM("04", "Boom-Only", ModifierCategory.RefuelingCapability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"B\" transform=\"matrix(1 0 0 1 282.0005 504.5557)\">B</text>\n  </g>";
            }
        },
        DROGUE("05", "Drogue-Only", ModifierCategory.RefuelingCapability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"D\" transform=\"matrix(1 0 0 1 282.0005 506.5557)\">D</text>\n  </g>";
            }
        },
        BOOM_DROGUE("06", "Boom and Drogue", ModifierCategory.RefuelingCapability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" id=\"B_x2F_D\" transform=\"matrix(1.0329 0 0 1 250.2549 496.0469)\">B/D</text>\n  </g>";
            }
        },
        DOWNLINK("11", "Downlinked", ModifierCategory.TrackLinkAvailability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"70\" id=\"DL\" transform=\"matrix(1.0329 0 0 1 255.2549 496.0469)\">DL</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.AIR;
    }

}