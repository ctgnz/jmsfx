package nz.co.ctg.jmsfx.icon.svg;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;
import javafx.scene.shape.FillRule;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;

public abstract class SvgShape {
    protected Paint fill;
    protected Paint stroke;
    protected FillRule fillRule;
    protected double strokeWidth;
    protected double strokeMiterLimit = 4.0;
    protected StrokeLineCap strokeLineCap = StrokeLineCap.BUTT;
    protected StrokeLineJoin strokeLineJoin = StrokeLineJoin.MITER;
    protected double strokeDashOffset = 0.0;
    protected List<Double> strokeDashArray = new ArrayList<>();
    protected List<Transform> transforms = new ArrayList<>();

    public SvgShape() {
    }

    public abstract Shape createShape();

    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.save();
        graphicsContext.setFill(fill);
        graphicsContext.setFillRule(fillRule);
        graphicsContext.setStroke(stroke);
        graphicsContext.setLineWidth(strokeWidth);
        graphicsContext.setMiterLimit(strokeMiterLimit);
        graphicsContext.setLineJoin(strokeLineJoin);
        graphicsContext.setLineCap(strokeLineCap);
        graphicsContext.setLineDashOffset(strokeDashOffset);
        if (!strokeDashArray.isEmpty()) {
            graphicsContext.setLineDashes(strokeDashArray.stream().mapToDouble(Double::doubleValue).toArray());
        }
        transforms.forEach(trans -> transform(graphicsContext, trans));
        drawGraphics(graphicsContext);
        graphicsContext.restore();
    }

    public Paint getFill() {
        return fill;
    }

    public FillRule getFillRule() {
        return fillRule;
    }

    public Paint getStroke() {
        return stroke;
    }

    public List<Double> getStrokeDashArray() {
        return strokeDashArray;
    }

    public double getStrokeDashOffset() {
        return strokeDashOffset;
    }

    public StrokeLineCap getStrokeLineCap() {
        return strokeLineCap;
    }

    public StrokeLineJoin getStrokeLineJoin() {
        return strokeLineJoin;
    }

    public double getStrokeMiterLimit() {
        return strokeMiterLimit;
    }

    public double getStrokeWidth() {
        return strokeWidth;
    }

    public List<Transform> getTransforms() {
        return transforms;
    }

    public void setFill(Paint fill) {
        this.fill = fill;
    }

    public void setFillRule(FillRule fillRule) {
        this.fillRule = fillRule;
    }

    public void setStroke(Paint stroke) {
        this.stroke = stroke;
    }

    public void setStrokeDashArray(List<Double> strokeDashArray) {
        this.strokeDashArray = strokeDashArray;
    }

    public void setStrokeDashOffset(double strokeDashOffset) {
        this.strokeDashOffset = strokeDashOffset;
    }

    public void setStrokeLineCap(StrokeLineCap strokeLineCap) {
        this.strokeLineCap = strokeLineCap;
    }

    public void setStrokeLineJoin(StrokeLineJoin strokeLineJoin) {
        this.strokeLineJoin = strokeLineJoin;
    }

    public void setStrokeMiterLimit(double strokeMiterLimit) {
        this.strokeMiterLimit = strokeMiterLimit;
    }

    public void setStrokeWidth(double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setTransforms(List<Transform> transforms) {
        this.transforms = transforms;
    }

    protected abstract void drawGraphics(GraphicsContext graphicsContext);

    protected void setColors(Shape shape) {
        shape.setFill(fill);
        shape.setStroke(stroke);
    }

    protected void setStrokeProperties(Shape shape) {
        shape.setStrokeWidth(strokeWidth);
        shape.setStrokeMiterLimit(strokeMiterLimit);
        shape.setStrokeLineCap(strokeLineCap);
        shape.setStrokeLineJoin(strokeLineJoin);
        shape.setStrokeDashOffset(strokeDashOffset);
        if (strokeDashArray != null) {
            shape.getStrokeDashArray().addAll(strokeDashArray);
        }
    }

    protected void setTransforms(Shape shape) {
        shape.getTransforms().addAll(transforms);
    }

    private void transform(GraphicsContext graphicsContext, Transform transform) {
        if (transform instanceof Affine) {
            graphicsContext.transform((Affine) transform);
        }
        if (transform instanceof Translate) {
            Translate xlate = (Translate) transform;
            graphicsContext.translate(xlate.getX(), xlate.getY());
        }
        if (transform instanceof Rotate) {
            Rotate rotate = (Rotate) transform;
            graphicsContext.rotate(rotate.getAngle());
        }
        if (transform instanceof Scale) {
            Scale scale = (Scale) transform;
            graphicsContext.scale(scale.getX(), scale.getY());
        }
        if (transform instanceof Shear) {
            Shear shear = (Shear) transform;
            graphicsContext.transform(shear.getMxx(), shear.getMyx(), shear.getMxy(), shear.getMyy(), shear.getTx(), shear.getTy());
        }
    }

}
