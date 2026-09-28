package io.github.ctgnz.jmsfx.battleorder.landequipment;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.ModifierBounds;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum LandEquipmentSectorOneModifier implements SectorOneModifier {
        EARLY_WARNING_RADAR("03", "Early Warning Radar", ModifierCategory.SensorType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"58\" transform=\"matrix(1 0 0 1 237 344.5146)\">EWR</text>\n  </g>";
            }
        },
        INTRUSION("04", "Intrusion", ModifierCategory.SensorType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"I\" transform=\"matrix(1 0 0 1 295 342.25)\">I</text>\n  </g>";
            }
        },
        UPGRADED_EARLY_WARNING_RADAR("07", "Upgraded Early Warning Radar", ModifierCategory.SensorType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"58\" transform=\"matrix(1 0 0 1 237 344.5146)\">UEW</text>\n  </g>";
            }
        },
        MULTI_PURPOSE_BLADE("12", "Multi Purpose Blade", ModifierCategory.EngineerEquipment) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"m 248.90087,305 57,-24.51873 57,24.51873 m -57,40.32 v -64.83873\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n  </g>";
            }
        },
        TANK_WIDTH_MINE_PLOW("13", "Tank Width Mine Plow", ModifierCategory.EngineerEquipment) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"M 305.90087,345.3202 V 280.48148\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:none;stroke-opacity:1\"/>\n    <path d=\"m 248.90087,305.0002 57,-24.51873 57,24.51873\" style=\"fill:none;stroke:#000000;stroke-width:5;stroke-linecap:butt;stroke-linejoin:miter;stroke-dasharray:15,5;stroke-opacity:1;stroke-dashoffset:0\"/>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandEquipmentSectorOneModifier(String id, String label, ModifierCategory category) {
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

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}