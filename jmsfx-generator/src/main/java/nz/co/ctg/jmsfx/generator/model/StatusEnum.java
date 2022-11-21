package nz.co.ctg.jmsfx.generator.model;

import nz.co.ctg.jmsfx.generator.schema.Library.Statuses.Status;

public class StatusEnum extends StandardEnum {

    public StatusEnum(Status status) {
        super(status.getName(), status.getLabel(), Integer.toString(status.getStatusCode()));
    }

}
