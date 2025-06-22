package ${iconPackage}.${symbolSet.packageName};

import ${basePackage}.AmplifierGuide;
import ${iconPackage}.AmplifierEnum;
import ${typePackage}.GuideType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public enum ${symbolSet.baseTypeName}AmplifierGuide implements AmplifierGuide {
<#list symbolSet.amplifierGuides as guide>
    <#if guide.graphical>${guide.code}(AmplifierEnum.${guide.amplifier}, GuideType.${guide.type}<#list guide.points as pt>, ${pt}</#list>)<#else>${guide.code}(AmplifierEnum.${guide.amplifier}, GuideType.${guide.type})</#if><#sep>,
</#list>;

    private final AmplifierEnum amplifier;
    private final GuideType type;
    private final double[] points;
    private final Shape shape;

    ${symbolSet.baseTypeName}AmplifierGuide(AmplifierEnum amplifier, GuideType type, double... points) {
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
