package nz.co.ctg.jmsfx.icon.svg;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class SvgPath extends SvgShape {

    private String svgPath;

    public SvgPath(String svgPath) {
        this.svgPath = svgPath;
    }

    @Override
    public Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent(svgPath);
        setColors(path);
        path.setFillRule(fillRule);
        setStrokeProperties(path);
        setTransforms(path);
        return path;
    }

    public String getSvgPath() {
        return svgPath;
    }

    public void setSvgPath(String svgPath) {
        this.svgPath = svgPath;
    }

    @Override
    protected void drawGraphics(GraphicsContext graphics) {
        graphics.beginPath();
        graphics.appendSVGPath(svgPath);
        if (fill != null) {
            graphics.fill();
        }
        graphics.stroke();
    }

}
