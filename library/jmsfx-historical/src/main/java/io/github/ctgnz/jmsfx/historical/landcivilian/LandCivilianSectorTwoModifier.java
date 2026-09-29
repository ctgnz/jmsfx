package io.github.ctgnz.jmsfx.historical.landcivilian;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum LandCivilianSectorTwoModifier implements SectorTwoModifier {
        LEADER("01", "Leader or Leadership", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"LDR\" transform=\"matrix(1 0 0 1 245 490.5146)\">LDR</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandCivilianSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_CIVILIAN;
    }

}