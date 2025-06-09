package io.github.ctgnz.jmsfx.icon.model;

import java.util.Arrays;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IAmplifierGuide;
import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class AmplifierGuideAdapter implements IAmplifierGuide {
    private final ObjectProperty<SymbolSetAdapter> symbolSet = new SimpleObjectProperty<>();
    private final ObjectProperty<IAmplifier> amplifier = new SimpleObjectProperty<>();
    private final ObjectProperty<GuideType> type = new SimpleObjectProperty<>();
    private final ObjectProperty<Shape> shape = new SimpleObjectProperty<>();
    private final StringProperty code = new SimpleStringProperty();
    private final ObservableList<Double> points = FXCollections.observableArrayList();

    public AmplifierGuideAdapter() {
    }

    public AmplifierGuideAdapter(IAmplifierGuide model) {
        this.amplifier.set(model.getAmplifier());
        this.type.set(model.getType());
        this.code.set(model.getCode());
        this.shape.set(createShape(model.getPoints()));
        Arrays.stream(model.getPoints()).forEach(points::add);
    }

    @Override
    public IAmplifier getAmplifier() {
        return amplifier.get();
    }

    @Override
    public String getCode() {
        return code.get();
    }

    @Override
    public double getHeight() {
        return getShape().getLayoutBounds().getHeight();
    }

    @Override
    public double[] getPoints() {
        return points.stream().mapToDouble(Double::doubleValue).toArray();
    }

    @Override
    public Shape getShape() {
        return shape.get();
    }

    @Override
    public GuideType getType() {
        return type.get();
    }

    @Override
    public double getWidth() {
        return getShape().getLayoutBounds().getWidth();
    }

    @Override
    public double getX() {
        return getShape().getLayoutBounds().getMinX();
    }

    @Override
    public double getY() {
        return getShape().getLayoutBounds().getMinY();
    }

    private Shape createShape(double[] points) {
        return switch (type.get()) {
            case LINE -> new Line(points[0], points[1], points[2], points[3]);
            case POLYLINE -> new Polyline(points);
            case POLYGON -> new Polygon(points);
            case RECTANGLE -> new Rectangle(points[0], points[1], points[2], points[3]);
            default -> new Rectangle(0, 0, 0, 0);
        };
    }

    protected void setSymbolSet(SymbolSetAdapter symbolSet) {
        this.symbolSet.set(symbolSet);
    }

}
