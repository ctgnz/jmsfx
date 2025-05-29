package io.github.ctgnz.jmsfx.generator.model;

import io.github.ctgnz.jmsfx.generator.schema.Library.Statuses.Status;

public class StatusEnum extends StandardEnum {

    public StatusEnum(Status status) {
        super(status.getName(), status.getLabel(), Integer.toString(status.getStatusCode()), null);
    }

}
