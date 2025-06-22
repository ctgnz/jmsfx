package io.github.ctgnz.jmsfx.icon.landequipment;

import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.icon.AmplifierEnum;
import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public enum LandEquipmentAmplifierGuide implements AmplifierGuide {
    C(AmplifierEnum.C_Quantity, GuideType.RECTANGLE, 205, 190, 200, 60),
    G(AmplifierEnum.G_StaffComments, GuideType.RECTANGLE, 486, 250, 126, 90),
    H(AmplifierEnum.H_AdditionalInformation, GuideType.RECTANGLE, 486, 340, 126, 90),
    J(AmplifierEnum.J_EvaluationRating, GuideType.RECTANGLE, 486, 520, 126, 90),
    K(AmplifierEnum.K_CombatEffectiveness, GuideType.RECTANGLE, 486, 520, 126, 90),
    L(AmplifierEnum.L_SignatureEquipment, GuideType.RECTANGLE, 486, 520, 126, 90),
    M(AmplifierEnum.M_HigherFormation, GuideType.RECTANGLE, 486, 430, 126, 90),
    N(AmplifierEnum.N_HostileEnemy, GuideType.RECTANGLE, 486, 520, 126, 90),
    P(AmplifierEnum.P_IffSifAis, GuideType.RECTANGLE, 486, 520, 126, 90),
    Q(AmplifierEnum.Q_DirectionOfMovementIndicator, GuideType.POLYLINE, 305.105, 622, 305.105, 765, 218.428, 774.077),
    R(AmplifierEnum.R_MobilityIndicator, GuideType.RECTANGLE, 185, 542, 240, 90),
    S2(AmplifierEnum.S2_OffsetLocationIndicator, GuideType.POLYLINE, 191.707, 488.132, 92.754, 702.34, 28.614, 739.366),
    T(AmplifierEnum.T_UniqueDesignation, GuideType.RECTANGLE, 0, 430, 126, 90),
    V(AmplifierEnum.V_TypeOfEquipment, GuideType.RECTANGLE, 0, 340, 126, 90),
    W(AmplifierEnum.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 160, 126, 90),
    X(AmplifierEnum.X_AltitudeDepth, GuideType.RECTANGLE, 0, 250, 126, 90),
    Y(AmplifierEnum.Y_Location, GuideType.RECTANGLE, 0, 250, 126, 90),
    Z(AmplifierEnum.Z_Speed, GuideType.RECTANGLE, 0, 520, 126, 90),
    AB(AmplifierEnum.AB_FeintDummyIndicator, GuideType.POLYGON, 126, 251, 305, 85, 486, 251),
    AD(AmplifierEnum.AD_PlatformType, GuideType.RECTANGLE, 0, 340, 126, 90),
    AE(AmplifierEnum.AE_EquipmentTeardownTime, GuideType.RECTANGLE, 486, 340, 126, 90),
    AF(AmplifierEnum.AF_CommonIdentifier, GuideType.RECTANGLE, 0, 340, 126, 90),
    AH(AmplifierEnum.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
    AH1(AmplifierEnum.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
    AL(AmplifierEnum.AL_OperationalCondition, GuideType.RECTANGLE, 142, 542, 328, 80),
    AO(AmplifierEnum.AO_EngagementBar, GuideType.RECTANGLE, 132, 5, 344, 80),
    AO1(AmplifierEnum.AO1_TargetDesignation, GuideType.SYSTEM),
    AS(AmplifierEnum.AS_Country, GuideType.RECTANGLE, 486, 160, 126, 90);

    private final AmplifierEnum amplifier;
    private final GuideType type;
    private final double[] points;
    private final Shape shape;

    LandEquipmentAmplifierGuide(AmplifierEnum amplifier, GuideType type, double... points) {
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
