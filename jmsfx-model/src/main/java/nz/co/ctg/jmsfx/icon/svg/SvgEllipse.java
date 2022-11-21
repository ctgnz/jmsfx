package nz.co.ctg.jmsfx.icon.svg;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;

public class SvgEllipse extends SvgShape {

    private double cx;
    private double cy;
    private double rx;
    private double ry;

    public SvgEllipse(double cx, double cy, double rx, double ry) {
        this.cx = cx;
        this.cy = cy;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public Shape createShape() {
        Ellipse ellipse = new Ellipse(cx, cy, rx, ry);
        setColors(ellipse);
        setStrokeProperties(ellipse);
        setTransforms(ellipse);
        return ellipse;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getRx() {
        return rx;
    }

    public double getRy() {
        return ry;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public void setRx(double rx) {
        this.rx = rx;
    }

    public void setRy(double ry) {
        this.ry = ry;
    }

    @Override
    protected void drawGraphics(GraphicsContext graphics) {
        if (fill != null) {
            graphics.fillOval(cx - rx, cy - ry, rx * 2, ry * 2);
        }
        graphics.strokeOval(cx - rx, cy - ry, rx * 2, ry * 2);
    }
}
