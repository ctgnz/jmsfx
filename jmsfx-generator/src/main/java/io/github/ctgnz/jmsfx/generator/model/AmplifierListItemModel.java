package io.github.ctgnz.jmsfx.generator.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.github.ctgnz.jmsfx.generator.yaml.YamlFlowStyle;
import io.github.ctgnz.jmsfx.generator.yaml.YamlForceQuote;

@YamlFlowStyle
@YamlForceQuote(properties = {
    "id", "code", "label", "remarks"
})
@JsonPropertyOrder({
    "code", "id", "extension", "deprecated", "label", "backgroundFill", "bounds", "remarks"
})
public class AmplifierListItemModel extends AbstractModel {
    private String backgroundFill;
    private Map<String, List<Double>> bounds;

    public AmplifierListItemModel() {
    }

    public String getBackgroundFill() {
        return backgroundFill;
    }

    /**
     * Where this amplifier's graphic actually draws, as <code>[x, y, width, height]</code> keyed by standard identity group code. There is an entry per group because the same
     * glyph sits at a different height for each - the amplifier hangs off the frame, and each group's frame has its own height.
     * <p>
     * Measured by {@link io.github.ctgnz.jmsfx.generator.FragmentMeasurer} rather than maintained by hand, and absent for amplifiers that carry no graphic.
     */
    public Map<String, List<Double>> getBounds() {
        return bounds;
    }

    public void setBackgroundFill(String backgroundFill) {
        this.backgroundFill = backgroundFill;
    }

    public void setBounds(Map<String, List<Double>> bounds) {
        this.bounds = bounds;
    }

}
