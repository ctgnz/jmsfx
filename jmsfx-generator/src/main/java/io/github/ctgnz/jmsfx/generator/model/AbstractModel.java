package io.github.ctgnz.jmsfx.generator.model;

import java.util.Comparator;
import java.util.Map;

import org.apache.commons.lang3.RegExUtils;

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
    protected Map<String, BoundsModel> bounds;

    public AbstractModel() {
    }

    public AbstractModel(String id, String label, String code, String remarks) {
        this.id = sanitiseId(id);
        this.label = label;
        this.code = code;
        this.remarks = remarks;
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
