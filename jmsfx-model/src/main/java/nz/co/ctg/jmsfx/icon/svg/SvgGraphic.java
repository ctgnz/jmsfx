package nz.co.ctg.jmsfx.icon.svg;

import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;

public class SvgGraphic {
    private final SvgGroup baseGroup = new SvgGroup();
    private double x;
    private double y;
    private double width;
    private double height;
    private String title;

    public Group createGroup() {
        return baseGroup.createGroup();
    }

    public void drawGraphic(GraphicsContext graphicsContext) {
        baseGroup.drawGraphic(graphicsContext);
    }

    public SvgGroup getBaseGroup() {
        return baseGroup;
    }

    public double getHeight() {
        return height;
    }

    public String getTitle() {
        return title;
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

    public void setTitle(String title) {
        this.title = title;
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

}
