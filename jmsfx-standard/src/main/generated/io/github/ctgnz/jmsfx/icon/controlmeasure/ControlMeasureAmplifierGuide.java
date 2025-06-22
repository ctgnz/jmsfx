package io.github.ctgnz.jmsfx.icon.controlmeasure;

import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.AmplifierEnum;
import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public enum ControlMeasureAmplifierGuide implements AmplifierGuide {
    B(AmplifierEnum.B_Echelon, GuideType.SYSTEM),
    C(AmplifierEnum.C_Quantity, GuideType.SYSTEM),
    H(AmplifierEnum.H_AdditionalInformation, GuideType.SYSTEM),
    H1(AmplifierEnum.H1_UnlistedPointInformation, GuideType.SYSTEM),
    N(AmplifierEnum.N_HostileEnemy, GuideType.SYSTEM),
    Q(AmplifierEnum.Q_DirectionOfMovementIndicator, GuideType.SYSTEM),
    S2(AmplifierEnum.S2_OffsetLocationIndicator, GuideType.SYSTEM),
    T(AmplifierEnum.T_UniqueDesignation, GuideType.SYSTEM),
    T1(AmplifierEnum.T1_UniqueIdentifierPrimaryPurpose, GuideType.SYSTEM),
    T2(AmplifierEnum.T2_ControllingHeadquarters, GuideType.SYSTEM),
    V(AmplifierEnum.V_TypeOfEquipment, GuideType.SYSTEM),
    W(AmplifierEnum.W_DateTimeGroupDtg, GuideType.SYSTEM),
    W1(AmplifierEnum.W1_DateTimeGroupDtgPeriod, GuideType.SYSTEM),
    X(AmplifierEnum.X_AltitudeDepth, GuideType.SYSTEM),
    Y(AmplifierEnum.Y_Location, GuideType.SYSTEM),
    AH(AmplifierEnum.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
    AH1(AmplifierEnum.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
    AM(AmplifierEnum.AM_Distance, GuideType.SYSTEM),
    AN(AmplifierEnum.AN_Azimuth, GuideType.SYSTEM),
    AP(AmplifierEnum.AP_TargetNumber, GuideType.SYSTEM),
    AP1(AmplifierEnum.AP1_TargetNumberExtension, GuideType.SYSTEM),
    AS(AmplifierEnum.AS_Country, GuideType.SYSTEM);

    private final AmplifierEnum amplifier;
    private final GuideType type;
    private final double[] points;
    private final Shape shape;

    ControlMeasureAmplifierGuide(AmplifierEnum amplifier, GuideType type, double... points) {
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
