package io.github.ctgnz.jmsfx;

import io.github.ctgnz.jmsfx.types.GuideType;
import javafx.scene.shape.Shape;

public interface IAmplifierGuide {

    IAmplifier getAmplifier();

    String getCode();

    double getHeight();

    double[] getPoints();

    Shape getShape();

    GuideType getType();

    double getWidth();

    double getX();

    double getY();

}
