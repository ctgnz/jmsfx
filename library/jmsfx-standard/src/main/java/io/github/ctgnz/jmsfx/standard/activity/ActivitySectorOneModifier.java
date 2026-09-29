package io.github.ctgnz.jmsfx.standard.activity;

import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum ActivitySectorOneModifier implements SectorOneModifier {
        HOUSE_TO_HOUSE("04", "House-to-House", ModifierCategory.PsychologicalOperations) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <rect fill=\"none\" height=\"39.835\" stroke=\"#000000\" stroke-width=\"5\" width=\"70.818\" x=\"269.673\" y=\"302.87\"/>\n    <polyline fill=\"none\" points=\"269.23,301.985 305.653,279.705 340.934,301.985\" stroke=\"#000000\" stroke-width=\"5\"/>\n  </g>";
            }
        },
        MURDER("06", "Murder", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"68\" id=\"MU\" transform=\"matrix(1.0329 0 0 1 252.2549 345.0469)\">MU</text>\n  </g>";
            }
        },
        WRITTEN_PSYCHOLOGICAL_OPERATIONS("09", "Written Psychological Operations", ModifierCategory.PsychologicalOperations) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"72\" id=\"W\" transform=\"matrix(1 0 0 1 273 344.25)\">W</text>\n  </g>";
            }
        },
        PIRATE("10", "Pirate", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <path d=\"M339.765,295.867c1.183,0.15,1.171,1.5,2.36,1.65 c-8.76,10.58-22.25,16.45-34.48,23.57c7.32,3.94,14.541,7.96,21.963,11.79c1.697-2.32,3.5-4.53,5.197-6.84 c1.063,0.2,1.303,1.22,2.36,1.41c-1.31,2.7-3.57,4.45-4.96,7.08c3.4,1.55,6.6,3.31,9.68,5.18c-0.55,0.71-0.93,1.58-1.42,2.36 c-3.49-1.7-6.779-3.6-10.148-5.42c-1.552,2.3-3.352,4.35-4.96,6.6c-1.149-0.27-1.979-0.85-2.36-1.89 c1.671-1.95,3.181-4.06,4.721-6.13c-7.857-4.09-15.471-8.43-23.37-12.49c-6.42,3.81-13.42,7.03-19.6,11.08 c1.12,2.26,2.68,4.08,3.78,6.36c-0.58,0.76-1.66,1.02-2.36,1.65c-1.51-2.18-2.49-4.9-4.49-6.6c-3.24,1.72-6.27,3.64-9.68,5.19 c-0.52-0.82-1.12-1.56-1.42-2.59c3.38-1.66,6.77-3.3,9.68-5.43c-1.16-2.22-2.71-4.05-3.77-6.36c0.77-0.56,1.43-1.24,2.59-1.41 c1.28,2.26,2.34,4.73,4.25,6.36c5.91-3.45,12.32-6.4,17.95-10.14c-11.32-6.46-24.58-10.97-31.4-21.92c1.13-0.2,1.69-0.98,2.83-1.18 c3.83,7.02,12.2,10.77,18.65,14.38c-1.06-1.97-1.88-3.79-2.12-6.13c-1.77-17.2,18.412-22.69,27.623-12.96 c3.639,3.84,5.76,10.67,2.84,17.91C327.494,307.037,334.045,301.867,339.765,295.867z M318.275,304.347 c0.229-18.07-27.413-16.82-26.21,0.71c0.43,6.27,5.11,10.88,11.1,11.79c4.79,0.72,8.771-0.98,11.329-3.54 C315.475,312.327,318.234,307.697,318.275,304.347z\" stroke=\"#000000\" stroke-miterlimit=\"10\" stroke-width=\"4\"/>\n  </g>";
            }
        },
        FALSE("11", "False", ModifierCategory.IEDCategory) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 249.5 340.5)\">FAL</text>\n  </g>";
            }
        },
        FIND("12", "Find", ModifierCategory.IEDCategory) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 249.5 340.5)\">FND</text>\n  </g>";
            }
        },
        FOUND_AND_CLEARED("13", "Found and Cleared", ModifierCategory.IEDCategory) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"60\" transform=\"matrix(1 0 0 1 241.5 340.5)\">CLR</text>\n  </g>";
            }
        },
        HOAX_DECOY("14", "Hoax (Decoy)", ModifierCategory.IEDCategory) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <polygon points=\"319.801,316.914 343.236,294 343.236,339.829\" stroke=\"#000000\" stroke-width=\"5.4619\"/>\n    <polygon points=\"284.652,316.914 308.085,294 308.085,339.829\" stroke=\"#000000\" stroke-width=\"5.4619\"/>\n    <polygon points=\"249.5,316.914 272.934,294 272.934,339.829\" stroke=\"#000000\" stroke-width=\"5.4619\"/>\n  </g>";
            }
        },
        ATTEMPTED("15", "Attempted", ModifierCategory.IncidentQualifier) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(1.52635)\">\n    <text font-family=\"sans-serif\" font-size=\"60px\" transform=\"translate(244.5,340.5)\">ATD</text>\n  </g>";
            }
        },
        INCIDENT("17", "Incident", ModifierCategory.IncidentQualifier) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"65\" transform=\"matrix(1 0 0 1 252.8252 344.7051)\">INC</text>\n  </g>";
            }
        },
        THEFT("18", "Theft", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"65\" transform=\"matrix(1 0 0 1 241.8252 346.7051)\">THF</text>\n  </g>";
            }
        },
        EVICTION("21", "Eviction", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\">\n    <text font-family=\"sans-serif\" font-size=\"68\" id=\"MU\" transform=\"matrix(1.0329 0 0 1 252.2549 345.0469)\">MU</text>\n  </g>";
            }
        },
        RAID("22", "Raid", ModifierCategory.Crime) {
            @Override
            public String getGraphicMarkup() {
                return "<g id=\"mod1\" transform=\"translate(-11.56154)\">\n    <text font-family=\"sans-serif\" font-size=\"56px\" transform=\"translate(249.5,340.5)\">RAID</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final ModifierCategory category;

    ActivitySectorOneModifier(String id, String label, ModifierCategory category) {
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
        return SymbolSetEnum.ACTIVITY;
    }

}