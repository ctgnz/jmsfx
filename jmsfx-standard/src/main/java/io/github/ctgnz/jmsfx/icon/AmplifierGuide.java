package io.github.ctgnz.jmsfx.icon;

import io.github.ctgnz.jmsfx.IAmplifier;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class AmplifierGuide {
    private final Amplifier amplifier;
    private final GuideType type;
    private final double[] points;
    private Shape shape;

    public AmplifierGuide(Amplifier amplifier, GuideType type, double... points) {
        this.amplifier = amplifier;
        this.type = type;
        this.points = points;
        this.shape = createShape();
    }

    public IAmplifier getAmplifier() {
        return amplifier;
    }

    public String getCode() {
        return amplifier.getId();
    }

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

    public double getWidth() {
        return shape.getLayoutBounds().getWidth();
    }

    public double getX() {
        return shape.getLayoutBounds().getMinX();
    }

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