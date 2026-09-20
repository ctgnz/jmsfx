package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;

/**
 * A measured rectangle on the shared 612 x 792 canvas, as written back into the model by {@code FragmentMeasurer}.
 * <p>
 * Named minX and minY rather than x and y because YAML 1.1 reads a bare {@code y} as a boolean, so the key would come back quoted.
 * <p>
 * Flow style keeps an entry on one line, which matters where bounds are the values of a map - a block-style rectangle costs five lines apiece.
 */
@YamlFlowStyle
@JsonPropertyOrder({
    "minX", "minY", "width", "height"
})
public class BoundsModel {
    private double minX;
    private double minY;
    private double width;
    private double height;

    public BoundsModel() {
    }

    public BoundsModel(double minX, double minY, double width, double height) {
        this.minX = minX;
        this.minY = minY;
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getMinX() {
        return minX;
    }

    public double getMinY() {
        return minY;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMinX(double minX) {
        this.minX = minX;
    }

    public void setMinY(double minY) {
        this.minY = minY;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
