package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.Contexts.Context;

public class ContextEnum extends StandardEnum {

    public ContextEnum(Context context) {
        super(context.getID(), context.getLabel(), Integer.toString(context.getContextCode()), null);
    }

}
