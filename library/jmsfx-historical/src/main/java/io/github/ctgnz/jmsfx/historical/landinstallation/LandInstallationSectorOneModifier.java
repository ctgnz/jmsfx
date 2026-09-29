package io.github.ctgnz.jmsfx.historical.landinstallation;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.historical.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum LandInstallationSectorOneModifier implements SectorOneModifier {
        COAL("06", "Coal", ModifierCategory.ElectricPowerType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"76\" id=\"CO\" transform=\"matrix(1 0 0 1 248 344.7051)\">CO</text>\n  </g>";
            }
        },
        GEOTHERMAL("07", "Geothermal", ModifierCategory.ElectricPowerType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"GT\" transform=\"matrix(1 0 0 1 248 344.7051)\">GT</text>\n  </g>";
            }
        },
        HYDROELECTRIC("08", "Hydroelectric", ModifierCategory.ElectricPowerType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"HY\" transform=\"matrix(1 0 0 1 252 344.7051)\">HY</text>\n  </g>";
            }
        },
        NATURAL_GAS("09", "Natural Gas", ModifierCategory.ElectricPowerType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"NG\" transform=\"matrix(1 0 0 1 254 344.7051)\">NG</text>\n  </g>";
            }
        },
        CIVILIAN_TELEPHONE("12", "Civilian Telephone", ModifierCategory.CivilianTelecommunicationsType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"80\" id=\"T\" transform=\"matrix(1 0 0 1 281 343.25)\">T</text>\n  </g>";
            }
        },
        CIVILIAN_TELEVISION("13", "Civilian Television", ModifierCategory.CivilianTelecommunicationsType) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"TV\" transform=\"matrix(1 0 0 1 256 344.7051)\">TV</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandInstallationSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_INSTALLATION;
    }

}