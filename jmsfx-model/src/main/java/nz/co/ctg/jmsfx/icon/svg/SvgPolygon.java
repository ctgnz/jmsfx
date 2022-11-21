package nz.co.ctg.jmsfx.icon.svg;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class SvgPolygon extends SvgShape {
    private List<Double> points;


    public SvgPolygon(List<Double> points) {
        this.points = points;
    }

    @Override
    public Shape createShape() {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(points);
        setColors(polygon);
        setStrokeProperties(polygon);
        setTransforms(polygon);
        return polygon;
    }

    public List<Double> getPoints() {
        return points;
    }

    public void setPoints(List<Double> points) {
        this.points = points;
    }

    @Override
    protected void drawGraphics(GraphicsContext graphics) {
        AtomicInteger index = new AtomicInteger(0);
        Map<Boolean, List<Double>> pointsMap = points.stream().collect(partitioningBy(value -> index.getAndIncrement() % 2 == 0, toList()));
        double[] xPoints = pointsMap.get(Boolean.TRUE).stream().mapToDouble(Double::doubleValue).toArray();
        double[] yPoints = pointsMap.get(Boolean.FALSE).stream().mapToDouble(Double::doubleValue).toArray();
        if (fill != null) {
            graphics.fillPolygon(xPoints, yPoints, points.size() / 2);
        }
        graphics.strokePolygon(xPoints, yPoints, points.size() / 2);
    }
}
