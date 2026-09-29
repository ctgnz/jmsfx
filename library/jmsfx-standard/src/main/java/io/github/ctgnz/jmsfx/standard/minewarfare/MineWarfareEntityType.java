package io.github.ctgnz.jmsfx.standard.minewarfare;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum MineWarfareEntityType implements EntityType {
        SEA_MINE_BOTTOM("01", "Sea Mine-Bottom", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FF0000\" points=\"286.326,326.25 286.326,291.25 326.326,291.25 326.326,326.25\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"249.095,358.357 224.354,333.6 252.648,305.325 277.389,330.083\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"334.606,330.038 359.303,305.237 387.646,333.462 362.949,358.263\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306.326\" cy=\"386.25\" fill=\"#FF0000\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <g>\n      <rect fill=\"#FF0000\" height=\"30\" stroke=\"#000000\" stroke-width=\"10\" width=\"150\" x=\"231.326\" y=\"448.25\"/>\n    </g>\n  </g>";
            }
        },
        SEA_MINE_MOORED("02", "Sea Mine-Moored", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"453\" y2=\"488\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"485\" y2=\"485\"/>\n    </g>\n    <polygon fill=\"#FF0000\" points=\"286,323 286,288 326,288 326,323\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"248.769,355.107 224.028,330.35 252.322,302.075 277.063,326.833\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"334.28,326.788 358.977,301.987 387.32,330.212 362.623,355.013\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306\" cy=\"383\" fill=\"#FF0000\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        SEA_MINE_FLOATING("03", "Sea Mine-Floating", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"251.343,487 265.775,453.323 280.208,487 294.642,453.323 309.074,487 323.507,453.323 337.94,487 352.373,453.323 366.806,487\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"289.831,323.427 289.831,289.75 328.318,289.75 328.318,323.427\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"254.006,354.32 230.202,330.499 257.426,303.293 281.231,327.114\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"336.285,327.071 360.048,303.208 387.32,330.367 363.557,354.229\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"309.074\" cy=\"381.158\" fill=\"#FF0000\" r=\"67.354\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        SEA_MINE_RISING("04", "Sea Mine-Rising", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"455\" y2=\"490\"/>\n      <polygon fill=\"#FF0000\" points=\"306,468 286,503 326,503\" stroke=\"#000000\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    </g>\n    <polygon fill=\"#FF0000\" points=\"286,325 286,290 326,290 326,325\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"248.769,357.107 224.028,332.35 252.322,304.075 277.063,328.833\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"334.28,328.788 358.977,303.987 387.32,332.212 362.623,357.013\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306\" cy=\"385\" fill=\"#FF0000\" r=\"70\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        SEA_MINE_OTHER_POSITION("05", "Sea Mine-Other Position", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"189.189\" x2=\"420.895\" y1=\"410.47\" y2=\"410.47\"/>\n    <polygon fill=\"#FF0000\" points=\"283.227,341.015 283.227,300.5 329.529,300.5 329.529,341.015\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"240.128,378.181 211.489,349.523 244.242,316.793 272.881,345.452\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF0000\" points=\"339.114,345.4 367.701,316.691 400.512,349.364 371.923,378.073\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306.378\" cy=\"410.47\" fill=\"#FF0000\" r=\"81.03\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        KINGFISHER("06", "Kingfisher", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.NA),
        SMALL_OBJECT_MINE_LIKE("07", "Small Object-Mine-Like", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.NA),
        EXERCISE_MINE_GENERAL("08", "Exercise Mine-General", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#008000\" points=\"283.227,341.015 283.227,300.5 329.529,300.5 329.529,341.015\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"240.128,378.181 211.489,349.523 244.242,316.793 272.881,345.452\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"339.114,345.4 367.701,316.691 400.512,349.364 371.923,378.073\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306.378\" cy=\"410.47\" fill=\"#008000\" r=\"81.03\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"78\" transform=\"matrix(1 0 0 1 253.9746 435)\">EX</text>\n  </g>";
            }
        },
        NEUTRALIZED_MINE_GENERAL("09", "Neutralized Mine-General", MineWarfareEntity.SEA_MINE_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#00FF00\" points=\"283.227,341.015 283.227,300.5 329.529,300.5 329.529,341.015\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"240.128,378.181 211.489,349.523 244.242,316.793 272.881,345.452\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#00FF00\" points=\"339.114,345.4 367.701,316.691 400.512,349.364 371.923,378.073\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <circle cx=\"306.378\" cy=\"410.47\" fill=\"#00FF00\" r=\"81.03\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"215.185\" x2=\"390.5\" y1=\"320.758\" y2=\"481.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"220\" x2=\"395.25\" y1=\"481.5\" y2=\"320.758\"/>\n    </g>\n  </g>";
            }
        },
        SEA_MINE_DECOY_BOTTOM("01", "Sea Mine Decoy-Bottom", MineWarfareEntity.SEA_MINE_DECOY, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#008000\" points=\"286.891,326.809 286.891,293 325.529,293 325.529,326.809\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"250.927,357.823 227.028,333.908 254.359,306.596 278.258,330.511\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"333.528,330.468 357.384,306.511 384.764,333.776 360.906,357.732\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"M238.593,384.767c0-38.639,28.979-67.618,67.618-67.618 c38.639,0,67.618,28.979,67.618,67.618H238.593L238.593,384.767z\" fill=\"#008000\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"373.828,452.385 340.02,428.235 373.828,404.086\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"325.529,452.385 291.721,428.235 325.529,404.086\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"277.231,452.385 243.422,428.235 277.231,404.086\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <rect fill=\"#008000\" height=\"24.149\" stroke=\"#000000\" stroke-width=\"10\" width=\"144.896\" x=\"233.763\" y=\"453.351\"/>\n  </g>";
            }
        },
        SEA_MINE_DECOY_MOORED("02", "Sea Mine Decoy-Moored", MineWarfareEntity.SEA_MINE_DECOY, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"386\" y2=\"486\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"251\" x2=\"361\" y1=\"489\" y2=\"489\"/>\n    <polygon fill=\"#008000\" points=\"286,326 286,291 326,291 326,326\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"248.769,358.107 224.028,333.35 252.322,305.075 277.063,329.833\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"334.28,329.788 358.977,304.987 387.32,333.212 362.623,358.013\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <path d=\"M236,386c0-40,30-70,70-70s70,30,70,70H236z\" fill=\"#008000\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"376,456 341,431 376,406\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"326,456 291,431 326,406\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"276,456 241,431 276,406\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        MILCO_GENERAL("01", "MILCO - General", MineWarfareEntity.MINE_LIKE_CONTACT_MILCO, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FF8C00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        MILCO_BOTTOM("02", "MILCO - Bottom", MineWarfareEntity.MINE_LIKE_CONTACT_MILCO, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FF8C00\" height=\"31.632\" stroke=\"#000000\" stroke-width=\"10\" width=\"158.158\" x=\"226\" y=\"446.868\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,296.538 335.298,296.538 378.839,340.079 378.839,402.281 335.298,445.823 273.094,445.823 229.553,402.281 229.553,340.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        MILCO_MOORED("03", "MILCO - Moored", MineWarfareEntity.MINE_LIKE_CONTACT_MILCO, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"482.823\" y2=\"482.823\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"450.823\" y2=\"485.823\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        MILCO_FLOATING("04", "MILCO - Floating", MineWarfareEntity.MINE_LIKE_CONTACT_MILCO, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"247.343,489 261.775,455.323 276.208,489 290.642,455.323 305.074,489 319.507,455.323 333.94,489 348.373,455.323 362.806,489\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FF8C00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n  </g>";
            }
        },
        MINE_LIKE_ECHO_BOTTOM("01", "Mine-Like Echo-Bottom", MineWarfareEntity.MINE_LIKE_ECHO_MILEC_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#FFFF00\" height=\"31.632\" stroke=\"#000000\" stroke-width=\"10\" width=\"158.158\" x=\"226\" y=\"446.868\"/>\n    <polygon fill=\"#FFFF00\" points=\"273.094,296.538 335.298,296.538 378.839,340.079 378.839,402.281 335.298,445.823 273.094,445.823 229.553,402.281 229.553,340.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 256.5146 421.207)\">E</text>\n  </g>";
            }
        },
        MINE_LIKE_ECHO_MOORED("02", "Mine-Like Echo-Moored", MineWarfareEntity.MINE_LIKE_ECHO_MILEC_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"482.823\" y2=\"482.823\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"450.823\" y2=\"485.823\"/>\n    <polygon fill=\"#FFFF00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 256.5146 426.207)\">E</text>\n  </g>";
            }
        },
        MINE_LIKE_ECHO_FLOATING("03", "Mine-Like Echo-Floating", MineWarfareEntity.MINE_LIKE_ECHO_MILEC_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"247.343,489 261.775,455.323 276.208,489 290.642,455.323 305.074,489 319.507,455.323 333.94,489 348.373,455.323 362.806,489\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FFFF00\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 257.5146 426.207)\">E</text>\n  </g>";
            }
        },
        NEGATIVE_REACQUISITION_BOTTOM("01", "Negative Reacquisition-Bottom", MineWarfareEntity.NEGATIVE_REACQUISITION_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#FFFF00\" points=\"275.372,298.101 334.607,298.101 376.073,339.566 376.073,398.801 334.607,440.267 275.372,440.267 233.907,398.801 233.907,339.566\" stroke=\"#000000\" stroke-dasharray=\"29.0794,11.8471\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"77.545\" transform=\"matrix(1 0 0 1 248.7729 399.125)\">NR</text>\n    <rect fill=\"#FFFF00\" height=\"32.311\" stroke=\"#000000\" stroke-width=\"10\" width=\"161.552\" x=\"223.998\" y=\"439.189\"/>\n  </g>";
            }
        },
        NEGATIVE_REACQUISITION_MOORED("02", "Negative Reacquisition-Moored", MineWarfareEntity.NEGATIVE_REACQUISITION_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"305.75\" x2=\"305.75\" y1=\"434.362\" y2=\"480.267\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"220.5\" x2=\"391\" y1=\"476.332\" y2=\"476.332\"/>\n    <polygon fill=\"#FFFF00\" points=\"275.372,295.101 334.607,295.101 376.073,336.566 376.073,395.801 334.607,437.267 275.372,437.267 233.907,395.801 233.907,336.566\" stroke=\"#000000\" stroke-dasharray=\"29.0794,11.8471\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"77.545\" transform=\"matrix(1 0 0 1 248.7729 396.125)\">NR</text>\n  </g>";
            }
        },
        NEGATIVE_REACQUISITION_FLOATING("03", "Negative Reacquisition-Floating", MineWarfareEntity.NEGATIVE_REACQUISITION_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"237.146,485.66 254.053,446.211 270.959,485.66 287.866,446.211 304.773,485.66 321.681,446.211 338.587,485.66 355.494,446.211 372.401,485.66\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#FFFF00\" points=\"275.372,295.101 334.607,295.101 376.073,336.566 376.073,395.801 334.607,437.267 275.372,437.267 233.907,395.801 233.907,336.566\" stroke=\"#000000\" stroke-dasharray=\"29.0794,11.8471\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"77.545\" transform=\"matrix(1 0 0 1 248.7729 396.125)\">NR</text>\n  </g>";
            }
        },
        NEUTRALIZED_OBSTRUCTOR("01", "Neutralized Obstructor", MineWarfareEntity.OBSTRUCTOR, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polygon fill=\"#00FF00\" points=\"266.79,301.895 345.211,301.895 400.105,356.79 400.105,435.211 345.211,490.105 266.79,490.105 211.895,435.211 211.895,356.79\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"120\" transform=\"matrix(1 0 0 1 217.625 437.6348)\">OB</text>\n    <g>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.3056\" x1=\"222\" x2=\"389.5\" y1=\"313\" y2=\"480.5\"/>\n      <line fill=\"none\" stroke=\"#000000\" stroke-width=\"9.3056\" x1=\"222\" x2=\"389.5\" y1=\"480.5\" y2=\"313\"/>\n    </g>\n  </g>";
            }
        },
        NON_MINE_MINE_LIKE_BOTTOM("01", "Non-Mine Mine-Like Object-Bottom", MineWarfareEntity.NON_MINE_MINE_LIKE_NMLO_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <rect fill=\"#008000\" height=\"31.632\" stroke=\"#000000\" stroke-width=\"10\" width=\"158.158\" x=\"226\" y=\"446.868\"/>\n    <polygon fill=\"#008000\" points=\"273.094,296.538 335.298,296.538 378.839,340.079 378.839,402.281 335.298,445.823 273.094,445.823 229.553,402.281 229.553,340.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 256.5146 421.207)\">N</text>\n  </g>";
            }
        },
        NON_MINE_MINE_LIKE_MOORED("02", "Non-Mine Mine-Like Object-Moored", MineWarfareEntity.NON_MINE_MINE_LIKE_NMLO_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"241\" x2=\"371\" y1=\"482.823\" y2=\"482.823\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"450.823\" y2=\"485.823\"/>\n    <polygon fill=\"#008000\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 256.5146 426.207)\">N</text>\n  </g>";
            }
        },
        NON_MINE_MINE_LIKE_FLOATING("03", "Non-Mine Mine-Like Object-Floating", MineWarfareEntity.NON_MINE_MINE_LIKE_NMLO_GENERAL, GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <polyline fill=\"none\" points=\"247.343,489 261.775,455.323 276.208,489 290.642,455.323 305.074,489 319.507,455.323 333.94,489 348.373,455.323 362.806,489\" stroke=\"#000000\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"10\"/>\n    <polygon fill=\"#008000\" points=\"273.094,301.538 335.298,301.538 378.839,345.079 378.839,407.281 335.298,450.823 273.094,450.823 229.553,407.281 229.553,345.079\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <text font-family=\"sans-serif\" font-size=\"140\" transform=\"matrix(1 0 0 1 257.5146 426.207)\">N</text>\n  </g>";
            }
        };

    private final String id;
    private final String label;
    private final MineWarfareEntity entity;
    private final GraphicType graphicType;

    MineWarfareEntityType(String id, String label, MineWarfareEntity entity, GraphicType graphicType) {
        this.id = id;
        this.label = label;
        this.entity = entity;
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
    public Entity getEntity() {
        return entity;
    }

    @Override
    public List<EntitySubType> getEntitySubTypes() {
        return MineWarfareSymbolSet.INSTANCE.getEntitySubTypes(this);
    }

}