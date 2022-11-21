package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.Library.Contexts.Context;

public class ContextEnum extends StandardEnum {

    public ContextEnum(Context context) {
        super(context.getID(), context.getLabel(), Integer.toString(context.getContextCode()));
    }

}
