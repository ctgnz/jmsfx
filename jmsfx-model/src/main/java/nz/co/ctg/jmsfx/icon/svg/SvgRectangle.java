package nz.co.ctg.jmsfx.icon.svg;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class SvgRectangle extends SvgShape {

    private double x;
    private double y;
    private double width;
    private double height;

    public SvgRectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape createShape() {
        Rectangle rect = new Rectangle(x, y, width, height);
        setColors(rect);
        setStrokeProperties(rect);
        setTransforms(rect);
        return rect;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    protected void drawGraphics(GraphicsContext graphics) {
        if (fill != null) {
            graphics.fillRect(x, y, width, height);
        }
        graphics.strokeRect(x, y, width, height);
    }
}
