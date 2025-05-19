package nz.co.ctg.jmsfx.generator.model;

import java.util.Comparator;

import org.apache.commons.lang3.RegExUtils;

public abstract class StandardEnum {

    public static <E extends StandardEnum> Comparator<E> getStandardOrder() {
        return Comparator.comparing(StandardEnum::getCode);
    }

    protected final String id;
    protected final String label;
    protected final String code;

    public StandardEnum(String id, String label, String code) {
        this.id = sanitiseId(id);
        this.label = label;
        this.code = code;
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

    protected String sanitiseId(String id) {
        String result = RegExUtils.removeAll(id, "[-\\(\\)]");
        result = RegExUtils.replaceAll(result, "(\\s+)", " ");
        result = RegExUtils.replaceAll(result, " ", "_");
        return result;
    }

}
