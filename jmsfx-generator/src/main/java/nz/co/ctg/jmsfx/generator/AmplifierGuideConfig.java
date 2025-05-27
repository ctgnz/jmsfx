package nz.co.ctg.jmsfx.generator;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import nz.co.ctg.jmsfx.generator.schema.GuideType;
import nz.co.ctg.jmsfx.generator.schema.SymbolSet;

public class AmplifierGuideConfig {
    private String code;
    private GuideType type;
    private String amplifier;
    private double[] points;

    public AmplifierGuideConfig(SymbolSet.Amplifiers.AmplifierRef source) {
        this.code = source.getID();
        this.type = source.getType();
        if (type != GuideType.SYSTEM) {
            String[] split = StringUtils.split(StringUtils.remove(source.getPoints(), " "), ",");
            this.points = Arrays.stream(split).mapToDouble(val -> Double.parseDouble(val)).toArray();
        }
    }

    public String getAmplifier() {
        return amplifier;
    }

    public String getCode() {
        return code;
    }

    public double getHeight() {
        return points[3];
    }

    public double getY1() {
        return points[3];
    }

    public double[] getPoints() {
        return points;
    }

    public GuideType getType() {
        return type;
    }

    public double getWidth() {
        return points[2];
    }

    public double getX1() {
        return points[2];
    }

    public double getX() {
        return points[0];
    }

    public double getY() {
        return points[1];
    }

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

    public void setType(GuideType type) {
        this.type = type;
    }
}
