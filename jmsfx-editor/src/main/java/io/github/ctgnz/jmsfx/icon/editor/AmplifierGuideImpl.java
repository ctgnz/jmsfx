package io.github.ctgnz.jmsfx.icon.editor;

import java.util.Arrays;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierGuide;
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

public class AmplifierGuideImpl implements AmplifierGuide {
    private final ObjectProperty<SymbolSetImpl> symbolSet = new SimpleObjectProperty<>();
    private final ObjectProperty<Amplifier> amplifier = new SimpleObjectProperty<>();
    private final ObjectProperty<GuideType> type = new SimpleObjectProperty<>();
    private final ObjectProperty<Shape> shape = new SimpleObjectProperty<>();
    private final StringProperty code = new SimpleStringProperty();
    private final ObservableList<Double> points = FXCollections.observableArrayList();

    public AmplifierGuideImpl() {
    }

    public AmplifierGuideImpl(AmplifierGuide model) {
        this.amplifier.set(model.getAmplifier());
        this.type.set(model.getType());
        this.code.set(model.getCode());
        this.shape.set(createShape(model.getPoints()));
        Arrays.stream(model.getPoints()).forEach(points::add);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AmplifierGuideImpl rhs) {
            return new EqualsBuilder()
                .append(getCode(), rhs.getCode())
                .isEquals();
        }
        return super.equals(obj);
    }

    @Override
    public Amplifier getAmplifier() {
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

    @Override
    public int hashCode() {
        return new HashCodeBuilder(6449, 9461).append(getCode()).toHashCode();
    }

    protected void setSymbolSet(SymbolSetImpl symbolSet) {
        this.symbolSet.set(symbolSet);
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

}
