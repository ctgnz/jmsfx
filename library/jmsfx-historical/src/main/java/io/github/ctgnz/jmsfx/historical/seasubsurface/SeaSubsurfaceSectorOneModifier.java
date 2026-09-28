package io.github.ctgnz.jmsfx.historical.seasubsurface;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.ModifierBounds;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum SeaSubsurfaceSectorOneModifier implements SectorOneModifier {
        AUXILIARY("02", "Auxiliary", ModifierCategory.MissionArea) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"64\" id=\"AUX\" transform=\"matrix(1 0 0 1 230 344.5146)\">AUX</text>\n  </g>";
            }
        },
        POSSIBLE_SUBMARINE_LOW_1("13", "Possible Submarine Low 1", ModifierCategory.SubmarineConfidence) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"76\" id=\"P1\" transform=\"matrix(1.0329 0 0 1 261.2549 346.0469)\">P1</text>\n  </g>";
            }
        },
        POSSIBLE_SUBMARINE_LOW("14", "Possible Submarine Low 2", ModifierCategory.SubmarineConfidence) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"76\" id=\"P2\" transform=\"matrix(1.0329 0 0 1 261.2549 346.0469)\">P2</text>\n  </g>";
            }
        },
        POSSIBLE_SUBMARINE_HIGH_3("15", "Possible Submarine High 3", ModifierCategory.SubmarineConfidence) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"76\" id=\"P3\" transform=\"matrix(1.0329 0 0 1 261.2549 346.0469)\">P3</text>\n  </g>";
            }
        },
        POSSIBLE_SUBMARINE_HIGH_4("16", "Possible Submarine High 4", ModifierCategory.SubmarineConfidence) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"76\" id=\"P4\" transform=\"matrix(1.0329 0 0 1 261.2549 346.0469)\">P4</text>\n  </g>";
            }
        },
        PROBABLE_SUBMARINE("17", "Probable Submarine", ModifierCategory.SubmarineConfidence) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"76\" id=\"PB\" transform=\"matrix(1.0329 0 0 1 261.2549 346.0469)\">PB</text>\n  </g>";
            }
        },
        CERTAIN_SUBMARINE("18", "Certain Submarine", ModifierCategory.SubmarineConfidence) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"76\" id=\"CT\" transform=\"matrix(1.0329 0 0 1 243.2549 346.0469)\">CT</text>\n  </g>";
            }
        },
        ANTI_TORPEDO_TORPEDO("19", "Anti-torpedo Torpedo", ModifierCategory.WeaponsCapability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"68\" id=\"ATT\" transform=\"matrix(1 0 0 1 235 344.5146)\">ATT</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    SeaSubsurfaceSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.SEA_SUBSURFACE;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}