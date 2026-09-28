package io.github.ctgnz.jmsfx.battleorder.landcivilian;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.battleorder.ModifierBounds;
import io.github.ctgnz.jmsfx.battleorder.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum LandCivilianSectorOneModifier implements SectorOneModifier {
        MURDER_VICTIMS("03", "Murder Victims", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"68\" id=\"MU\" transform=\"matrix(1.0329 0 0 1 252.2549 343.0469)\">MU</text>\n  </g>";
            }
        },
        DISPLACED("09", "Displaced Person(s), Refugee(s) and Evacuee(s)", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"54\" id=\"DPRE\" transform=\"matrix(1 0 0 1 228 344.25)\">DPRE</text>\n  </g>";
            }
        },
        FOREIGN_FIGHTER("10", "Foreign Fighter(s)", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"FF\" transform=\"matrix(1.0329 0 0 1 257.2549 344.0469)\">FF</text>\n  </g>";
            }
        },
        GANG("11", "Gang Member or Gang", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"54\" id=\"GANG\" transform=\"matrix(1 0 0 1 228 344.25)\">GANG</text>\n  </g>";
            }
        },
        LEADER_1("13", "Leader or Leadership", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"LDR\" transform=\"matrix(1 0 0 1 245 342.5146)\">LDR</text>\n  </g>";
            }
        },
        NONGOVERNMENTAL_ORGANIZATION("14", "Nongovernmental Organization Member or Nongovernmental Organization", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"NGO\" transform=\"matrix(1 0 0 1 240 342.5146)\">NGO</text>\n  </g>";
            }
        },
        COERCED_RECRUIT("15", "Coerced/Impressed Recruit", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"68\" id=\"UR\" transform=\"matrix(1 0 0 1 260 344.25)\">UR</text>\n  </g>";
            }
        },
        WILLING_RECRUIT("16", "Willing Recruit", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"68\" id=\"WR\" transform=\"matrix(1 0 0 1 254 344.25)\">WR</text>\n  </g>";
            }
        },
        RELIGIOUS("17", "Religious or Religious Organization", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"REL\" transform=\"matrix(1 0 0 1 250 342.5146)\">REL</text>\n  </g>";
            }
        },
        TARGETED("18", "Targeted Individual or Organization", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"TGT\" transform=\"matrix(1 0 0 1 247 342.5146)\">TGT</text>\n  </g>";
            }
        },
        TERRORIST("19", "Terrorist or Terrorist Organization", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" id=\"TER\" transform=\"matrix(1 0 0 1 245 342.5146)\">TER</text>\n  </g>";
            }
        },
        SPEAKER("20", "Speaker", ModifierCategory.Organization) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <g id=\"SPK\">\n      <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 243.9277 342.9229)\">SPK</text>\n    </g>\n  </g>";
            }
        },
        OTHER("23", "Other", ModifierCategory.CompositeLoss) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 240 341.5146)\">OTH</text>\n  </g>";
            }
        },
        LOOT("24", "Loot", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"51.8993\" transform=\"matrix(1 0 0 1 234.9272 345.9717)\">LOOT</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    LandCivilianSectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.LAND_CIVILIAN;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}