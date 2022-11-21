package nz.co.ctg.jmsfx.icon.svg;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

public class SvgLine extends SvgShape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public SvgLine(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public Shape createShape() {
        Line line = new Line(x1, y1, x2, y2);
        setColors(line);
        setStrokeProperties(line);
        setTransforms(line);
        return line;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    protected void drawGraphics(GraphicsContext graphics) {
        graphics.strokeLine(x1, y1, x2, y2);
    }
}
