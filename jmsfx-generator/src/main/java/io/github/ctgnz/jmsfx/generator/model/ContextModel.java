package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.Contexts.Context;

public class ContextModel extends StandardEnumModel {

    public ContextModel(Context context) {
        super(context.getID(), context.getLabel(), Integer.toString(context.getContextCode()), null);
    }

}
