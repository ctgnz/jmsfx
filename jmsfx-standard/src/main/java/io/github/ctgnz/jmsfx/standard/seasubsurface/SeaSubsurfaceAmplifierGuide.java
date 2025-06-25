package io.github.ctgnz.jmsfx.standard.seasubsurface;

import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.standard.AmplifierEnum;
import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public enum SeaSubsurfaceAmplifierGuide implements AmplifierGuide {
    G(AmplifierEnum.G_StaffComments, GuideType.RECTANGLE, 478, 466, 134, 96),
    H(AmplifierEnum.H_AdditionalInformation, GuideType.RECTANGLE, 478, 466, 134, 96),
    P(AmplifierEnum.P_IffSifAis, GuideType.RECTANGLE, 478, 370, 134, 96),
    T(AmplifierEnum.T_UniqueDesignation, GuideType.RECTANGLE, 478, 178, 134, 96),
    V(AmplifierEnum.V_TypeOfEquipment, GuideType.RECTANGLE, 478, 274, 134, 96),
    X(AmplifierEnum.X_AltitudeDepth, GuideType.RECTANGLE, 478, 370, 134, 96),
    Y(AmplifierEnum.Y_Location, GuideType.RECTANGLE, 478, 562, 134, 96),
    Z(AmplifierEnum.Z_Speed, GuideType.RECTANGLE, 478, 562, 134, 96),
    AH(AmplifierEnum.AH_AreaOfUncertaintyIndicator, GuideType.SYSTEM),
    AH1(AmplifierEnum.AH1_AreaOfUncertaintyIndicatorLongitude, GuideType.SYSTEM),
    AJ(AmplifierEnum.AJ_SpeedLeader, GuideType.LINE, 197.657, 458.077, 17.069, 557.214),
    AL(AmplifierEnum.AL_OperationalCondition, GuideType.RECTANGLE, 142, 592, 328, 96),
    AO(AmplifierEnum.AO_EngagementBar, GuideType.RECTANGLE, 134, 178, 344, 96),
    AO1(AmplifierEnum.AO1_TargetDesignation, GuideType.SYSTEM),
    AR(AmplifierEnum.AR_SpecialDesignator, GuideType.RECTANGLE, 0, 178, 134, 96),
    AS(AmplifierEnum.AS_Country, GuideType.RECTANGLE, 478, 178, 134, 96);

    private final AmplifierEnum amplifier;
    private final GuideType type;
    private final double[] points;
    private final Shape shape;

    SeaSubsurfaceAmplifierGuide(AmplifierEnum amplifier, GuideType type, double... points) {
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
