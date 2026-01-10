package io.github.ctgnz.jmsfx.generator.model;

import java.util.Comparator;

import org.apache.commons.lang3.RegExUtils;

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

    public AbstractModel() {
    }

    public AbstractModel(String id, String label, String code, String remarks) {
        this.id = sanitiseId(id);
        this.label = label;
        this.code = code;
        this.remarks = remarks;
    }

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

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public void setExtension(boolean extension) {
        this.extension = extension;
    }

    protected String sanitiseId(String id) {
        String result = RegExUtils.removeAll(id, "[-\\(\\)]");
        result = RegExUtils.replaceAll(result, "(\\s+)", " ");
        result = RegExUtils.replaceAll(result, " ", "_");
        return result;
    }

}
