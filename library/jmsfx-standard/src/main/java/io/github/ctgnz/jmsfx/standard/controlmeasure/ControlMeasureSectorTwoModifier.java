package io.github.ctgnz.jmsfx.standard.controlmeasure;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.ModifierBounds;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum ControlMeasureSectorTwoModifier implements SectorTwoModifier {
        URBAN("01", "Urban", ModifierCategory.Terrain) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-26.15916,85.2027)\">\n    <text font-family=\"sans-serif\" font-size=\"90px\" x=\"173.05516\" y=\"343.5146\">URBAN</text>\n  </g>";
            }
        },
        WATER("02", "Water", ModifierCategory.Terrain) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-26.15916,85.2027)\">\n    <text font-family=\"sans-serif\" font-size=\"90px\" x=\"170.96776\" y=\"343.5146\">WATER</text>\n  </g>";
            }
        },
        GROUND("03", "Ground", ModifierCategory.Terrain) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-26.15916,85.2027)\">\n    <text font-family=\"sans-serif\" font-size=\"90px\" x=\"129.39549\" y=\"343.5146\">GROUND</text>\n  </g>";
            }
        },
        VEGETATION("04", "Vegetation", ModifierCategory.Terrain) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-26.15916,85.2027)\">\n    <text font-family=\"sans-serif\" font-size=\"90px\" x=\"44.36131\" y=\"343.5146\">VEGETATION</text>\n  </g>";
            }
        },
        OBSTACLES("05", "Obstacles", ModifierCategory.Terrain) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"translate(-26.15916,85.2027)\">\n    <text font-family=\"sans-serif\" font-size=\"90px\" x=\"63.6533\" y=\"343.5146\">OBSTACLES</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    ControlMeasureSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.CONTROL_MEASURE;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}