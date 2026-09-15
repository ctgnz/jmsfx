package io.github.ctgnz.jmsfx;

import javafx.scene.shape.Shape;

import io.github.ctgnz.jmsfx.types.GuideType;

public interface AmplifierGuide {

    Amplifier getAmplifier();

    String getCode();

    double getHeight();

    double[] getPoints();

    Shape getShape();

    GuideType getType();

    double getWidth();

    double getX();

    double getY();

}
