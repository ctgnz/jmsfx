package io.github.ctgnz.jmsfx.historical.landequipment;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum LandEquipmentSectorTwoModifier implements SectorTwoModifier {
        TRACTOR_TRAILER("06", "Tractor Trailer", ModifierCategory.Capability) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod2\" transform=\"matrix(0.8,0,0,0.7,40,-26)\">\n    <ellipse cx=\"243.51601\" cy=\"703.542\" fill=\"none\" rx=\"14.396\" ry=\"14.395\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"283.38\" cy=\"703.542\" fill=\"none\" rx=\"14.396\" ry=\"14.395\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <ellipse cx=\"420.69199\" cy=\"703.542\" fill=\"none\" rx=\"14.397\" ry=\"14.395\" stroke=\"#000000\" stroke-width=\"5\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"5\" x1=\"223.58299\" x2=\"440.625\" y1=\"684.71698\" y2=\"684.71698\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandEquipmentSectorTwoModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_EQUIPMENT;
    }

}