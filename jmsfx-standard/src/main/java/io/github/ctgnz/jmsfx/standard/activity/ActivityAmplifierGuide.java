package io.github.ctgnz.jmsfx.standard.activity;

import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.standard.AmplifierEnum;
import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public enum ActivityAmplifierGuide implements AmplifierGuide {
    G(AmplifierEnum.G_StaffComments, GuideType.RECTANGLE, 486, 276, 126, 80),
    H(AmplifierEnum.H_AdditionalInformation, GuideType.RECTANGLE, 486, 356, 126, 80),
    J(AmplifierEnum.J_EvaluationRating, GuideType.RECTANGLE, 486, 516, 126, 80),
    Q(AmplifierEnum.Q_DirectionOfMovementIndicator, GuideType.POLYLINE, 306.602, 518.205, 306.602, 578.661, 210.072, 637.723),
    S2(AmplifierEnum.S2_OffsetLocationIndicator, GuideType.POLYLINE, 126.082, 514.75, 126.082, 759.796, 0, 792),
    T(AmplifierEnum.T_UniqueDesignation, GuideType.RECTANGLE, 0, 356, 126, 80),
    W(AmplifierEnum.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 196, 126, 80),
    Y(AmplifierEnum.Y_Location, GuideType.RECTANGLE, 0, 276, 126, 80),
    AH(AmplifierEnum.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
    AH1(AmplifierEnum.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
    AS(AmplifierEnum.AS_Country, GuideType.RECTANGLE, 486, 196, 126, 80);

    private final AmplifierEnum amplifier;
    private final GuideType type;
    private final double[] points;
    private final Shape shape;

    ActivityAmplifierGuide(AmplifierEnum amplifier, GuideType type, double... points) {
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
