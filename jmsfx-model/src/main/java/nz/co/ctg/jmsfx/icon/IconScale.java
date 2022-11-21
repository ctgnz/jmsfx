package nz.co.ctg.jmsfx.icon;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
import static org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase;

public enum IconScale {
    Tiny(0.05, 15.0 / 800.0),
    ExtraSmall(0.1, 30.0 / 800.0),
    Small(4.0 / 30.0, 40.0 / 800.0),
    MediumSmall(5.0 / 30.0, 75.0 / 800.0),
    Medium(8.0 / 30.0, 150.0 / 800.0),
    MediumLarge(0.4, 300.0 / 800.0),
    Large(16.0 / 30.0, 400.0 / 800.0),
    ExtraLarge(1.0, 1.0);

    private final double factor;
    private final double trfFactor;

    private IconScale(double factor, double trfFactor) {
        this.factor = factor;
        this.trfFactor = trfFactor;
    }

    public String getDescription() {
        return stream(splitByCharacterTypeCamelCase(name())).collect(joining(" "));
    }

    public double getFactor() {
        return factor;
    }

    public double getTrfFactor() {
        return trfFactor;
    }

}
