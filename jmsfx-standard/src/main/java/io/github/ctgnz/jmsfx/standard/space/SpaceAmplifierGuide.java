package io.github.ctgnz.jmsfx.standard.space;

import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.standard.AmplifierEnum;
import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public enum SpaceAmplifierGuide implements AmplifierGuide {
    G(AmplifierEnum.G_StaffComments, GuideType.RECTANGLE, 478, 436, 134, 80),
    H(AmplifierEnum.H_AdditionalInformation, GuideType.RECTANGLE, 478, 436, 134, 80),
    T(AmplifierEnum.T_UniqueDesignation, GuideType.RECTANGLE, 478, 196, 134, 80),
    V(AmplifierEnum.V_TypeOfEquipment, GuideType.RECTANGLE, 478, 276, 134, 80),
    X(AmplifierEnum.X_AltitudeDepth, GuideType.RECTANGLE, 478, 356, 134, 80),
    Z(AmplifierEnum.Z_Speed, GuideType.RECTANGLE, 478, 356, 134, 80),
    AH(AmplifierEnum.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
    AH1(AmplifierEnum.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
    AJ(AmplifierEnum.AJ_SpeedLeader, GuideType.LINE, 176.341, 469.248, 17.069, 557.214),
    AL(AmplifierEnum.AL_OperationalCondition, GuideType.RECTANGLE, 142, 518, 328, 80),
    AO(AmplifierEnum.AO_EngagementBar, GuideType.RECTANGLE, 132, 116, 346, 80),
    AO1(AmplifierEnum.AO1_TargetDesignation, GuideType.SYSTEM),
    AS(AmplifierEnum.AS_Country, GuideType.RECTANGLE, 478, 196, 134, 80);

    private final AmplifierEnum amplifier;
    private final GuideType type;
    private final double[] points;
    private final Shape shape;

    SpaceAmplifierGuide(AmplifierEnum amplifier, GuideType type, double... points) {
        this.amplifier = amplifier;
        this.type = type;
        this.points = points;
        this.shape = createShape();
    }

    public AmplifierEnum getAmplifier() {
        return amplifier;
    }
    
    @Override
    public String getCode() {
        return name();
    }

    @Override
    public double getHeight() {
        return shape.getLayoutBounds().getHeight();
    }

    public double[] getPoints() {
        return points;
    }

    public Shape getShape() {
        return shape;
    }

    public GuideType getType() {
        return type;
    }

    @Override
    public double getWidth() {
        return shape.getLayoutBounds().getWidth();
    }

    @Override
    public double getX() {
        return shape.getLayoutBounds().getMinX();
    }

    @Override
    public double getY() {
        return shape.getLayoutBounds().getMinY();
    }

    private Shape createShape() {
        return switch (type) {
            case LINE -> new Line(points[0], points[1], points[2], points[3]);
            case POLYLINE -> new Polyline(points);
            case POLYGON -> new Polygon(points);
            case RECTANGLE -> new Rectangle(points[0], points[1], points[2], points[3]);
            default -> new Rectangle(0, 0, 0, 0);
        };
    }

}
