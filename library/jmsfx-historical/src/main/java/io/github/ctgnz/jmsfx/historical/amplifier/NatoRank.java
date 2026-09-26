package io.github.ctgnz.jmsfx.historical.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.historical.AmplifierListEnum;

public enum NatoRank implements AmplifierListItem {
        RANK_OR1("11", "OR-1"),
        RANK_OR2("12", "OR-2"),
        RANK_OR3("13", "OR-3"),
        RANK_OR4("14", "OR-4"),
        RANK_OR5("15", "OR-5"),
        RANK_OR6("16", "OR-6"),
        RANK_OR7("17", "OR-7"),
        RANK_OR8("18", "OR-8"),
        RANK_OR9("19", "OR-9"),
        RANK_WO1("21", "WO-1"),
        RANK_WO2("22", "WO-2"),
        RANK_WO3("23", "WO-3"),
        RANK_WO4("24", "WO-4"),
        RANK_WO5("25", "WO-5"),
        RANK_OFD("2F", "OF-D"),
        RANK_OF1A("30", "OF-1A"),
        RANK_OF1("31", "OF-1"),
        RANK_OF2("32", "OF-2"),
        RANK_OF3("33", "OF-3"),
        RANK_OF4("34", "OF-4"),
        RANK_OF5("35", "OF-5"),
        RANK_OF6("36", "OF-6"),
        RANK_OF7("37", "OF-7"),
        RANK_OF8("38", "OF-8"),
        RANK_OF9("39", "OF-9"),
        RANK_OF10("3A", "OF-10");

    private final String id;
    private final String label;

    NatoRank(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.NATO_RANK;
    }

    @Override
    public String getGraphicLocation() {
        return "Amplifier";
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
    public boolean isGraphicalIcon() {
        return true;
    }

}