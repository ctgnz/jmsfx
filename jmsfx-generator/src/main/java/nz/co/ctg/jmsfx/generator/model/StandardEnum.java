package nz.co.ctg.jmsfx.generator.model;

import java.util.Comparator;

public abstract class StandardEnum {

    public static <E extends StandardEnum> Comparator<E> getStandardOrder() {
        return Comparator.comparing(StandardEnum::getCode);
    }

    protected final String id;
    protected final String label;
    protected final String code;

    public StandardEnum(String id, String label, String code) {
        this.id = id;
        this.label = label;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getCode() {
        return code;
    }

}
