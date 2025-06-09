package io.github.ctgnz.jmsfx.generator.model;

import org.apache.commons.lang3.StringUtils;

import io.github.ctgnz.jmsfx.generator.schema.ModifiersType.Modifier;

public class SectorOneModEnum extends StandardEnum {

    private final String groupId;
    private final String category;

    public SectorOneModEnum(Modifier modifier) {
        super(modifier.getID().toString(), modifier.getLabel(), modifier.getModifierCode().getCodeString(), null);
        this.groupId = modifier.getExtensionCode();
        this.category = StringUtils.defaultIfBlank(modifier.getCategory(), "General");
    }

    public String getCategory() {
        return category;
    }

    public String getGroupId() {
        return groupId;
    }

}
