package io.github.ctgnz.jmsfx.generator.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;

@YamlFlowStyle
public class AmplifierGuideModel {
    private @JsonBackReference SymbolSetModel symbolSet;
    private String code;
    private GuideType type;
    private String amplifier;
    private double[] points;

    public AmplifierGuideModel() {
    }

    public String getAmplifier() {
        return amplifier;
    }

    public String getCode() {
        return code;
    }

    @JsonIgnore
    public double getHeight() {
        return points[3];
    }

    public double[] getPoints() {
        return points;
    }

    public SymbolSetModel getSymbolSet() {
        return symbolSet;
    }

    public GuideType getType() {
        return type;
    }

    @JsonIgnore
    public double getWidth() {
        return points[2];
    }

    @JsonIgnore
    public double getX() {
        return points[0];
    }

    @JsonIgnore
    public double getX1() {
        return points[2];
    }

    @JsonIgnore
    public double getY() {
        return points[1];
    }

    @JsonIgnore
    public double getY1() {
        return points[3];
    }

    @JsonIgnore
    public boolean isGraphical() {
        return type != GuideType.SYSTEM;
    }

    public void setAmplifier(String amplifier) {
        this.amplifier = amplifier;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }

    public void setSymbolSet(SymbolSetModel symbolSet) {
        this.symbolSet = symbolSet;
    }

    public void setType(GuideType type) {
        this.type = type;
    }
}
