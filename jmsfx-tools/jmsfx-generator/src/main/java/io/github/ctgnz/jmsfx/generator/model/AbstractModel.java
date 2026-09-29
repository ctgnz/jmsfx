package io.github.ctgnz.jmsfx.generator.model;

import java.util.Comparator;
import java.util.Map;

import org.apache.commons.lang3.RegExUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public abstract class AbstractModel {

    public static <E extends AbstractModel> Comparator<E> getStandardOrder() {
        return Comparator.comparing(AbstractModel::getCode);
    }

    protected String id;
    protected String label;
    protected String code;
    protected String remarks;
    protected boolean extension;
    protected boolean deprecated;
    protected String before;
    protected Map<String, BoundsModel> bounds;
    protected String graphicMarkup;
    protected Map<String, String> graphicMarkupByKey;

    public AbstractModel() {
    }

    public AbstractModel(String id, String label, String code, String remarks) {
        this.id = sanitiseId(id);
        this.label = label;
        this.code = code;
        this.remarks = remarks;
    }

    /**
     * Where this element goes among the base's, when it is an addition in an overlay - the code of the element it follows.
     * <p>
     * Only meaningful in an overlay, and only where an addition is not simply appended. Constant order in a generated enum comes from the order of the values in the model file
     * rather than from their codes, and that order carries meaning - jmsfx-historical puts {@code Staffel} between Platoon and Company, which is echelon order and not code order.
     * So an overlay has to be able to say where an addition sits. Measured across jmsfx-historical, 8 of the 11 lists that differ simply append and need nothing here; 3 interleave
     * and do. See jmsfx#137.
     * <p>
     * Null everywhere else, and absent from a whole model - the base never has anything to position itself against.
     */
    @JsonInclude(Include.NON_NULL)
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    /**
     * The markup this element draws, or null when it has none.
     * <p>
     * Read from the fragment by {@link io.github.ctgnz.jmsfx.generator.FragmentSource} and emitted onto the generated constant, so the drawing lives on the element rather than in
     * a table keyed by a filename. {@code @JsonIgnore} is load-bearing: this is 0.6 MB across a library, and writing it into {@code model.yml} would bury the symbology it
     * describes.
     */
    @JsonIgnore
    public String getGraphicMarkup() {
        return graphicMarkup;
    }

    /**
     * The markup this element draws when one drawing is not enough, keyed by whatever discriminates the fragment - the identity group for a {@code FULL_FRAME} element, whose icon
     * is the frame and so differs per identity, and identity plus status frame id for a dimension's frame. Null for an element whose drawing does not vary, which carries
     * {@link #getGraphicMarkup()} instead. Keyed the same way as {@link #getBounds()}, and {@code @JsonIgnore} for the same reason as {@link #getGraphicMarkup()}.
     */
    @JsonIgnore
    public Map<String, String> getGraphicMarkupByKey() {
        return graphicMarkupByKey;
    }

    public void setGraphicMarkup(String graphicMarkup) {
        this.graphicMarkup = graphicMarkup;
    }

    public void setGraphicMarkupByKey(Map<String, String> graphicMarkupByKey) {
        this.graphicMarkupByKey = graphicMarkupByKey;
    }

    /**
     * Measured bounds for this element's graphic, keyed by whatever discriminates the fragment - the standard identity group for an amplifier, group plus frame id for a status,
     * and so on. Written by {@link io.github.ctgnz.jmsfx.generator.FragmentMeasurer} rather than maintained by hand, and absent for elements with no graphic of their own.
     */
    public Map<String, BoundsModel> getBounds() {
        return bounds;
    }

    /**
     * An empty code is meaningful - "Local" engagement type and "Unspecified" engagement stage both carry one - so it has to survive a write/read round trip. The mapper's blanket
     * {@code NON_DEFAULT} inclusion would otherwise drop it, and the templates emit <code>"${val.code}"</code> straight into a string literal, so the code coming back as null
     * breaks generation rather than merely changing the file.
     */
    @JsonInclude(Include.NON_NULL)
    public String getCode() {
        return code;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getRemarks() {
        return remarks;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public boolean isExtension() {
        return extension;
    }

    public void setBounds(Map<String, BoundsModel> bounds) {
        this.bounds = bounds;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public void setExtension(boolean extension) {
        this.extension = extension;
    }

    private static String sanitiseId(String id) {
        String result = RegExUtils.removeAll(id, "[-\\(\\)]");
        result = RegExUtils.replaceAll(result, "(\\s+)", " ");
        result = RegExUtils.replaceAll(result, " ", "_");
        return result;
    }

}
