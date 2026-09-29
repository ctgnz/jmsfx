package io.github.ctgnz.jmsfx.standard.activity;

import java.util.List;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.GraphicType;

public enum ActivityEntity implements Entity {
        INCIDENT("11", "Incident", GraphicType.NA),
        CIVIL_DISTURBANCE("12", "Civil Disturbance", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <path d=\"M296.3,431.8H314V402.4h60.9v-62.2H359.1v46.5H314v-26.8c0-2.3,5.2-3.1,7.4-4.3c1.899-1,5.3-3.6,6.8-5 c3.7-3.6,8-9,9.5-14.8c4-15.8-0.601-26.4-9.5-35.3c-7.5-7.7-23.1-12.2-35.8-6.8c-9,3.9-20.9,15.4-20.9,27.5v7.9 c0,6.9,4.8,15.5,8.3,19.2c2.5,2.5,4.4,4.3,7.6,6.2c2.4,1.4,9,3.3,9,5.4v26.8h-45.2v-46.5h-15.7v62.2h60.9V431.8H296.3z\" id=\"_72297208\"/>\n    <polygon id=\"_40642360\" points=\"296.3,431.8 278.6,431.8 278.6,503.2 296.3,503.2\"/>\n    <polygon id=\"_39018016\" points=\"314,431.8 314,503.2 331.7,503.2 331.7,431.8\"/>\n  </g>";
            }
        },
        OPERATION("13", "Operation", GraphicType.NA),
        HAZARD_MATERIALS("15", "Hazard Materials", GraphicType.NA),
        TRANSPORTATION_INCIDENT("16", "Transportation Incident", GraphicType.FULL_OCTAGON) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\">\n    <circle cx=\"306\" cy=\"396\" fill=\"none\" r=\"54\" stroke=\"#000000\" stroke-width=\"10\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"268.188\" x2=\"344.542\" y1=\"434.546\" y2=\"358.192\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"268.188\" x2=\"344.086\" y1=\"357.453\" y2=\"433.351\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"252\" x2=\"360\" y1=\"396\" y2=\"396\"/>\n    <line fill=\"none\" stroke=\"#000000\" stroke-width=\"10\" x1=\"306\" x2=\"306\" y1=\"342\" y2=\"450\"/>\n  </g>";
            }
        },
        NATURAL_EVENT("17", "Natural Event", GraphicType.MAIN) {
            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "<g id=\"main\" transform=\"translate(-20.39275,-0.95207)\">\n    <text font-family=\"sans-serif\" font-size=\"110.107px\" transform=\"translate(210.502,435.4844)\">NAT</text>\n  </g>";
            }
        },
        INDIVIDUAL("18", "Individual", GraphicType.NA);

    private final String id;
    private final String label;
    private final GraphicType graphicType;

    ActivityEntity(String id, String label, GraphicType graphicType) {
        this.id = id;
        this.label = label;
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
    public String getName() {
        return name();
    }

    @Override
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.ACTIVITY;
    }

    @Override
    public List<EntityType> getEntityTypes() {
        return ActivitySymbolSet.INSTANCE.getEntityTypes(this);
    }

    @Override
    public boolean isCivilian() {
        return name().contains("CIVILIAN");
    }

}