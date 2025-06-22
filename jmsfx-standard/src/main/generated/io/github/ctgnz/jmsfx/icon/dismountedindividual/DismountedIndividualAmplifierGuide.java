package io.github.ctgnz.jmsfx.icon.dismountedindividual;

import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.AmplifierEnum;
import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public enum DismountedIndividualAmplifierGuide implements AmplifierGuide {
    C(AmplifierEnum.C_Quantity, GuideType.RECTANGLE, 205, 546, 200, 96),
    G(AmplifierEnum.G_StaffComments, GuideType.RECTANGLE, 478, 248, 134, 96),
    H(AmplifierEnum.H_AdditionalInformation, GuideType.RECTANGLE, 478, 344, 134, 96),
    J(AmplifierEnum.J_EvaluationRating, GuideType.RECTANGLE, 478, 536, 134, 96),
    K(AmplifierEnum.K_CombatEffectiveness, GuideType.RECTANGLE, 478, 536, 134, 96),
    M(AmplifierEnum.M_HigherFormation, GuideType.RECTANGLE, 478, 440, 134, 96),
    P(AmplifierEnum.P_IffSifAis, GuideType.RECTANGLE, 478, 536, 134, 96),
    Q(AmplifierEnum.Q_DirectionOfMovementIndicator, GuideType.POLYLINE, 304.754, 641.628, 304.754, 702.084, 380.942, 734.447),
    S2(AmplifierEnum.S2_OffsetLocationIndicator, GuideType.POLYLINE, 180.082, 470, 180.082, 693.086, 62.332, 757.333),
    T(AmplifierEnum.T_UniqueDesignation, GuideType.RECTANGLE, 0, 440, 134, 96),
    V(AmplifierEnum.V_TypeOfEquipment, GuideType.RECTANGLE, 0, 344, 134, 96),
    W(AmplifierEnum.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 152, 134, 96),
    X(AmplifierEnum.X_AltitudeDepth, GuideType.RECTANGLE, 0, 248, 134, 96),
    Y(AmplifierEnum.Y_Location, GuideType.RECTANGLE, 0, 248, 134, 96),
    Z(AmplifierEnum.Z_Speed, GuideType.RECTANGLE, 0, 536, 134, 96),
    AB(AmplifierEnum.AB_FeintDummyIndicator, GuideType.POLYGON, 134, 302, 305, 150, 478, 302),
    AF(AmplifierEnum.AF_CommonIdentifier, GuideType.RECTANGLE, 0, 344, 134, 96),
    AH(AmplifierEnum.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
    AH1(AmplifierEnum.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
    AS(AmplifierEnum.AS_Country, GuideType.RECTANGLE, 478, 152, 134, 96),
    AV(AmplifierEnum.AV_LeadershipIdentifier, GuideType.POLYGON, 150, 302, 305, 205, 460, 302);

    private final AmplifierEnum amplifier;
    private final GuideType type;
    private final double[] points;
    private final Shape shape;

    DismountedIndividualAmplifierGuide(AmplifierEnum amplifier, GuideType type, double... points) {
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
