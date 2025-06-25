package io.github.ctgnz.jmsfx.standard.cyberspacedismountedindividual;

import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.standard.AmplifierEnum;
import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public enum CyberspaceDismountedIndividualAmplifierGuide implements AmplifierGuide {
    B(AmplifierEnum.B_Echelon, GuideType.RECTANGLE, 205, 192, 200, 80),
    C(AmplifierEnum.C_Quantity, GuideType.RECTANGLE, 205, 192, 200, 80),
    D(AmplifierEnum.D_TaskForceIndicator, GuideType.RECTANGLE, 205, 192, 200, 80),
    F(AmplifierEnum.F_ReinforcedOrReduced, GuideType.RECTANGLE, 486, 196, 126, 80),
    G(AmplifierEnum.G_StaffComments, GuideType.RECTANGLE, 486, 276, 126, 80),
    H(AmplifierEnum.H_AdditionalInformation, GuideType.RECTANGLE, 486, 356, 126, 80),
    K(AmplifierEnum.K_CombatEffectiveness, GuideType.RECTANGLE, 486, 516, 126, 80),
    L(AmplifierEnum.L_SignatureEquipment, GuideType.RECTANGLE, 486, 516, 126, 80),
    M(AmplifierEnum.M_HigherFormation, GuideType.RECTANGLE, 486, 436, 126, 80),
    P(AmplifierEnum.P_IffSifAis, GuideType.RECTANGLE, 486, 516, 126, 80),
    S(AmplifierEnum.S_HeadquartersStaffIndicator, GuideType.LINE, 126.082, 514.75, 126.082, 759.658),
    S2(AmplifierEnum.S2_OffsetLocationIndicator, GuideType.LINE, 127.671, 759.934, 0, 792),
    T(AmplifierEnum.T_UniqueDesignation, GuideType.RECTANGLE, 0, 436, 126, 80),
    V(AmplifierEnum.V_TypeOfEquipment, GuideType.RECTANGLE, 0, 356, 126, 80),
    W(AmplifierEnum.W_DateTimeGroupDtg, GuideType.RECTANGLE, 0, 196, 126, 80),
    Y(AmplifierEnum.Y_Location, GuideType.RECTANGLE, 0, 276, 126, 80),
    AA(AmplifierEnum.AA_NamedC2Headquarters, GuideType.RECTANGLE, 205.444, 346, 200, 98),
    AB(AmplifierEnum.AB_FeintDummyIndicator, GuideType.POLYGON, 126.082, 276, 304.754, 80, 486, 276),
    AD(AmplifierEnum.AD_PlatformType, GuideType.RECTANGLE, 0, 356, 126, 80),
    AE(AmplifierEnum.AE_EquipmentTeardownTime, GuideType.RECTANGLE, 0, 356, 126, 80),
    AF(AmplifierEnum.AF_CommonIdentifier, GuideType.RECTANGLE, 486, 356, 126, 80),
    AH(AmplifierEnum.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
    AH1(AmplifierEnum.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
    AL(AmplifierEnum.AL_OperationalCondition, GuideType.RECTANGLE, 132, 520, 348, 80),
    AO(AmplifierEnum.AO_EngagementBar, GuideType.RECTANGLE, 130, 5, 350, 80),
    AO1(AmplifierEnum.AO1_TargetDesignation, GuideType.SYSTEM),
    AR(AmplifierEnum.AR_SpecialDesignator, GuideType.RECTANGLE, 0, 196, 126, 80),
    AS(AmplifierEnum.AS_Country, GuideType.RECTANGLE, 486, 196, 126, 80),
    AW(AmplifierEnum.AW_HeadquartersElement, GuideType.RECTANGLE, 185, 520, 240, 80),
    AY(AmplifierEnum.AY_NetworkIdentifier, GuideType.RECTANGLE, 0, 516, 126, 80);

    private final AmplifierEnum amplifier;
    private final GuideType type;
    private final double[] points;
    private final Shape shape;

    CyberspaceDismountedIndividualAmplifierGuide(AmplifierEnum amplifier, GuideType type, double... points) {
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
