package nz.co.ctg.jmsfx.icon.svg;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class SvgCircle extends SvgShape {
    private double cx;
    private double cy;
    private double r;

    public SvgCircle(double cx, double cy, double r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    @Override
    public Shape createShape() {
        Circle circle = new Circle(cx, cy, r);
        setColors(circle);
        setStrokeProperties(circle);
        setTransforms(circle);
        return circle;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getR() {
        return r;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    protected void drawGraphics(GraphicsContext graphics) {
        if (fill != null) {
            graphics.fillOval(cx - r, cy - r, r * 2, r * 2);
        }
        graphics.strokeOval(cx - r, cy - r, r * 2, r * 2);
    }
}
