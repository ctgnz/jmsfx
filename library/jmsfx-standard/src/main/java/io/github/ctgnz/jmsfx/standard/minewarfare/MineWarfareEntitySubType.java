package io.github.ctgnz.jmsfx.standard.minewarfare;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum MineWarfareEntitySubType implements EntitySubType {
        EXERCISE_MINE_BOTTOM("01", "Exercise Mine-Bottom", MineWarfareEntityType.EXERCISE_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon display=\"none\" fill=\"#008000\" points=\"286.326,326.25 286.326,291.25 326.326,291.25 326.326,326.25\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"249.095,358.357 224.354,333.6 252.648,305.325 277.389,330.083\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"334.606,330.038 359.303,305.237 387.646,333.462 362.949,358.263\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306.326\" cy=\"386.25\" fill=\"#008000\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect fill=\"#008000\" height=\"30\" stroke=\"#000000\" stroke-width=\"10\" width=\"150\" x=\"231.326\" y=\"448.25\"/>\n    <text font-family=\"sans-serif\" font-size=\"78\" transform=\"matrix(1 0 0 1 252.8711 414)\">EX</text>\n  </g>";
            }
        },
        EXERCISE_MINE_MOORED("02", "Exercise Mine-Moored", MineWarfareEntityType.EXERCISE_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"453\" y2=\"488\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"485\" y2=\"485\"/>\n    </g>\n    <polygon fill=\"#008000\" points=\"286,323 286,288 326,288 326,323\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"248.769,355.107 224.028,330.35 252.322,302.075 277.063,326.833\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"334.28,326.788 358.977,301.987 387.32,330.212 362.623,355.013\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306\" cy=\"383\" fill=\"#008000\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"78\" transform=\"matrix(1 0 0 1 252.9746 408)\">EX</text>\n  </g>";
            }
        },
        EXERCISE_MINE_FLOATING("03", "Exercise Mine-Floating", MineWarfareEntityType.EXERCISE_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"251.343,487 265.775,453.323 280.208,487 294.642,453.323 309.074,487 323.507,453.323 337.94,487 352.373,453.323 366.806,487\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"289.831,323.427 289.831,289.75 328.318,289.75 328.318,323.427\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"254.006,354.32 230.202,330.499 257.426,303.293 281.231,327.114\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"336.285,327.071 360.048,303.208 387.32,330.367 363.557,354.229\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"309.074\" cy=\"381.158\" fill=\"#008000\" r=\"67.354\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"78\" transform=\"matrix(1 0 0 1 255.7168 410)\">EX</text>\n  </g>";
            }
        },
        EXERCISE_MINE_RISING("04", "Exercise Mine-Rising", MineWarfareEntityType.EXERCISE_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"455\" y2=\"490\"/>\n      <polygon fill=\"#008000\" points=\"306,468 286,503 326,503\" stroke=\"#000000\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    </g>\n    <polygon fill=\"#008000\" points=\"286,325 286,290 326,290 326,325\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"248.769,357.107 224.028,332.35 252.322,304.075 277.063,328.833\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"334.28,328.788 358.977,303.987 387.32,332.212 362.623,357.013\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306\" cy=\"385\" fill=\"#008000\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"78\" transform=\"matrix(1 0 0 1 253.9746 416)\">EX</text>\n  </g>";
            }
        },
        NEUTRALIZED_MINE_BOTTOM("01", "Neutralized Mine-Bottom", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#00FF00\" points=\"286.326,326.25 286.326,291.25 326.326,291.25 326.326,326.25\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"249.095,358.357 224.354,333.6 252.648,305.325 277.389,330.083\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"334.606,330.038 359.303,305.237 387.646,333.462 362.949,358.263\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306.326\" cy=\"386.25\" fill=\"#00FF00\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect fill=\"#00FF00\" height=\"30\" stroke=\"#000000\" stroke-width=\"10\" width=\"150\" x=\"231.326\" y=\"448.25\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"226.354\" x2=\"392.5\" y1=\"307.652\" y2=\"481.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"223\" x2=\"383.551\" y1=\"482.5\" y2=\"306.325\"/>\n    </g>\n  </g>";
            }
        },
        NEUTRALIZED_MINE_MOORED("02", "Neutralized Mine-Moored", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"453\" y2=\"488\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"485\" y2=\"485\"/>\n    </g>\n    <polygon fill=\"#00FF00\" points=\"286,323 286,288 326,288 326,323\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"248.769,355.107 224.028,330.35 252.322,302.075 277.063,326.833\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"334.28,326.788 358.977,301.987 387.32,330.212 362.623,355.013\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306\" cy=\"383\" fill=\"#00FF00\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"228.73\" x2=\"390.5\" y1=\"304.795\" y2=\"481.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"220\" x2=\"381.239\" y1=\"481.5\" y2=\"305.5\"/>\n    </g>\n  </g>";
            }
        },
        NEUTRALIZED_MINE_FLOATING("03", "Neutralized Mine-Floating", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <polyline fill=\"none\" points=\"247.343,487 261.775,453.323 276.208,487 290.642,453.323 305.074,487 319.507,453.323 333.94,487 348.373,453.323 362.806,487\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"9.622\"/>\n    </g>\n    <polygon fill=\"#00FF00\" points=\"285.831,323.427 285.831,289.75 324.318,289.75 324.318,323.427\" stroke=\"#000000\" stroke-width=\"9.622\"/>\n    <polygon fill=\"#00FF00\" points=\"250.006,354.32 226.202,330.499 253.426,303.293 277.231,327.114\" stroke=\"#000000\" stroke-width=\"9.622\"/>\n    <polygon fill=\"#00FF00\" points=\"332.285,327.071 356.048,303.208 383.32,330.367 359.557,354.229\" stroke=\"#000000\" stroke-width=\"9.622\"/>\n    <circle cx=\"305.074\" cy=\"381.158\" fill=\"#00FF00\" r=\"67.354\" stroke=\"#000000\" stroke-width=\"9.622\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.5331\" x1=\"231.016\" x2=\"391.944\" y1=\"306.589\" y2=\"473.162\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.4364\" x1=\"219\" x2=\"378.76\" y1=\"471.994\" y2=\"307.588\"/>\n    </g>\n  </g>";
            }
        },
        NEUTRALIZED_MINE_RISING("04", "Neutralized Mine-Rising", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"455\" y2=\"490\"/>\n    <polygon fill=\"#00FF00\" points=\"306,468 286,503 326,503\" stroke=\"#000000\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"286,325 286,290 326,290 326,325\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"248.769,357.107 224.028,332.35 252.322,304.075 277.063,328.833\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"334.28,328.788 358.977,303.987 387.32,332.212 362.623,357.013\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306\" cy=\"385\" fill=\"#00FF00\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"229.5\" x2=\"390.5\" y1=\"307.5\" y2=\"482.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"220\" x2=\"385.87\" y1=\"482.5\" y2=\"307.5\"/>\n    </g>\n  </g>";
            }
        },
        NEUTRALIZED_MINE_OTHER_POSITION("05", "Neutralized Mine-Other Position", MineWarfareEntityType.NEUTRALIZED_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"183.5\" x2=\"426.5\" y1=\"396\" y2=\"396\"/>\n    <polygon fill=\"#00FF00\" points=\"282.227,338.015 282.227,297.5 328.529,297.5 328.529,338.015\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"239.128,375.181 210.489,346.523 243.242,313.793 271.881,342.452\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"338.114,342.4 366.701,313.691 399.512,346.364 370.923,375.073\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"305.378\" cy=\"407.47\" fill=\"#00FF00\" r=\"81.03\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"216.468\" x2=\"390.5\" y1=\"317.758\" y2=\"481.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"222.348\" x2=\"394.25\" y1=\"480.5\" y2=\"321.757\"/>\n    </g>\n  </g>";
            }
        },
        MILCO_GENERAL_CONFIDENCE_LEVEL_1("01", "MILCO - General-Confidence-Level 1", MineWarfareEntityType.MILCO_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FF8C00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"200\" transform=\"matrix(1 0 0 1 244.625 466.6348)\">1</text>\n  </g>";
            }
        },
        MILCO_GENERAL_CONFIDENCE_LEVEL_2("02", "MILCO - General-Confidence-Level 2", MineWarfareEntityType.MILCO_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FF8C00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"200\" transform=\"matrix(1 0 0 1 252.625 463.6348)\">2</text>\n  </g>";
            }
        },
        MILCO_GENERAL_CONFIDENCE_LEVEL_3("03", "MILCO - General-Confidence-Level 3", MineWarfareEntityType.MILCO_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FF8C00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"200\" transform=\"matrix(1 0 0 1 252.625 463.6348)\">3</text>\n  </g>";
            }
        },
        MILCO_GENERAL_CONFIDENCE_LEVEL_4("04", "MILCO - General-Confidence-Level 4", MineWarfareEntityType.MILCO_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FF8C00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"200\" transform=\"matrix(1 0 0 1 244.625 466.6348)\">4</text>\n  </g>";
            }
        },
        MILCO_GENERAL_CONFIDENCE_LEVEL_5("05", "MILCO - General-Confidence-Level 5", MineWarfareEntityType.MILCO_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FF8C00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"200\" transform=\"matrix(1 0 0 1 244.625 466.6348)\">5</text>\n  </g>";
            }
        },
        MILCO_BOTTOM_CONFIDENCE_LEVEL_1("01", "MILCO - Bottom-Confidence-Level 1", MineWarfareEntityType.MILCO_BOTTOM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FF8C00\" height=\"31.632\" stroke=\"#000000\" stroke-width=\"10\" width=\"158.158\" x=\"226\" y=\"446.868\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,296.538 335.298,296.538 378.839,340.079 378.839,402.281 335.298,445.823 273.094,445.823 229.553,402.281 229.553,340.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 257.5146 428.207)\">1</text>\n  </g>";
            }
        },
        MILCO_BOTTOM_CONFIDENCE_LEVEL_2("02", "MILCO - Bottom-Confidence-Level 2", MineWarfareEntityType.MILCO_BOTTOM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FF8C00\" height=\"31.632\" stroke=\"#000000\" stroke-width=\"10\" width=\"158.158\" x=\"226\" y=\"446.868\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,296.538 335.298,296.538 378.839,340.079 378.839,402.281 335.298,445.823 273.094,445.823 229.553,402.281 229.553,340.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 263.5146 424.207)\">2</text>\n  </g>";
            }
        },
        MILCO_BOTTOM_CONFIDENCE_LEVEL_3("03", "MILCO - Bottom-Confidence-Level 3", MineWarfareEntityType.MILCO_BOTTOM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FF8C00\" height=\"31.632\" stroke=\"#000000\" stroke-width=\"10\" width=\"158.158\" x=\"226\" y=\"446.868\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,296.538 335.298,296.538 378.839,340.079 378.839,402.281 335.298,445.823 273.094,445.823 229.553,402.281 229.553,340.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 263.5146 424.207)\">3</text>\n  </g>";
            }
        },
        MILCO_BOTTOM_CONFIDENCE_LEVEL_4("04", "MILCO - Bottom-Confidence-Level 4", MineWarfareEntityType.MILCO_BOTTOM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FF8C00\" height=\"31.632\" stroke=\"#000000\" stroke-width=\"10\" width=\"158.158\" x=\"226\" y=\"446.868\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,296.538 335.298,296.538 378.839,340.079 378.839,402.281 335.298,445.823 273.094,445.823 229.553,402.281 229.553,340.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 256.5146 424.207)\">4</text>\n  </g>";
            }
        },
        MILCO_BOTTOM_CONFIDENCE_LEVEL_5("05", "MILCO - Bottom-Confidence-Level 5", MineWarfareEntityType.MILCO_BOTTOM, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FF8C00\" height=\"31.632\" stroke=\"#000000\" stroke-width=\"10\" width=\"158.158\" x=\"226\" y=\"446.868\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,296.538 335.298,296.538 378.839,340.079 378.839,402.281 335.298,445.823 273.094,445.823 229.553,402.281 229.553,340.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 258.5146 428.207)\">5</text>\n  </g>";
            }
        },
        MILCO_MOORED_CONFIDENCE_LEVEL_1("01", "MILCO - Moored-Confidence-Level 1", MineWarfareEntityType.MILCO_MOORED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"482.823\" y2=\"482.823\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"450.823\" y2=\"485.823\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 257.5146 433.207)\">1</text>\n  </g>";
            }
        },
        MILCO_MOORED_CONFIDENCE_LEVEL_2("02", "MILCO - Moored-Confidence-Level 2", MineWarfareEntityType.MILCO_MOORED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"482.823\" y2=\"482.823\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"450.823\" y2=\"485.823\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 262.5146 429.207)\">2</text>\n  </g>";
            }
        },
        MILCO_MOORED_CONFIDENCE_LEVEL_3("03", "MILCO - Moored-Confidence-Level 3", MineWarfareEntityType.MILCO_MOORED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"482.823\" y2=\"482.823\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"450.823\" y2=\"485.823\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 262.5146 429.207)\">3</text>\n  </g>";
            }
        },
        MILCO_MOORED_CONFIDENCE_LEVEL_4("04", "MILCO - Moored-Confidence-Level 4", MineWarfareEntityType.MILCO_MOORED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"482.823\" y2=\"482.823\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"450.823\" y2=\"485.823\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 255.5146 429.207)\">4</text>\n  </g>";
            }
        },
        MILCO_MOORED_CONFIDENCE_LEVEL_5("05", "MILCO - Moored-Confidence-Level 5", MineWarfareEntityType.MILCO_MOORED, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"482.823\" y2=\"482.823\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"450.823\" y2=\"485.823\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 259.5146 431.207)\">5</text>\n  </g>";
            }
        },
        MILCO_FLOATING_CONFIDENCE_LEVEL_1("01", "MILCO - Floating-Confidence-Level 1", MineWarfareEntityType.MILCO_FLOATING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"247.343,489 261.775,455.323 276.208,489 290.642,455.323 305.074,489 319.507,455.323 333.94,489 348.373,455.323 362.806,489\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 257.5146 433.207)\">1</text>\n  </g>";
            }
        },
        MILCO_FLOATING_CONFIDENCE_LEVEL_2("02", "MILCO - Floating-Confidence-Level 2", MineWarfareEntityType.MILCO_FLOATING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"247.343,489 261.775,455.323 276.208,489 290.642,455.323 305.074,489 319.507,455.323 333.94,489 348.373,455.323 362.806,489\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 262.5146 429.207)\">2</text>\n  </g>";
            }
        },
        MILCO_FLOATING_CONFIDENCE_LEVEL_3("03", "MILCO - Floating-Confidence-Level 3", MineWarfareEntityType.MILCO_FLOATING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"247.343,489 261.775,455.323 276.208,489 290.642,455.323 305.074,489 319.507,455.323 333.94,489 348.373,455.323 362.806,489\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 262.5146 429.207)\">3</text>\n  </g>";
            }
        },
        MILCO_FLOATING_CONFIDENCE_LEVEL_4("04", "MILCO - Floating-Confidence-Level 4", MineWarfareEntityType.MILCO_FLOATING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"247.343,489 261.775,455.323 276.208,489 290.642,455.323 305.074,489 319.507,455.323 333.94,489 348.373,455.323 362.806,489\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 258.5146 429.207)\">4</text>\n  </g>";
            }
        },
        MILCO_FLOATING_CONFIDENCE_LEVEL_5("05", "MILCO - Floating-Confidence-Level 5", MineWarfareEntityType.MILCO_FLOATING, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"247.343,489 261.775,455.323 276.208,489 290.642,455.323 305.074,489 319.507,455.323 333.94,489 348.373,455.323 362.806,489\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"155\" transform=\"matrix(1 0 0 1 258.5146 429.207)\">5</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final MineWarfareEntityType entityType;
    private final GraphicType graphicType;

    MineWarfareEntitySubType(String id, String label, MineWarfareEntityType entityType, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entityType = entityType;
        this.graphicType = graphicType;
    }

    @Override
    public GraphicType getGraphicType() {
        return graphicType;
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
    public EntityType getEntityType() {
        return entityType;
    }

}