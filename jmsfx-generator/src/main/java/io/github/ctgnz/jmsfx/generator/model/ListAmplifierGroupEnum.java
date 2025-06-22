package io.github.ctgnz.jmsfx.generator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.ctgnz.jmsfx.generator.ListAmplifierConfig;
import io.github.ctgnz.jmsfx.generator.StandardAmplifierConfig;
import io.github.ctgnz.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup;
import io.github.ctgnz.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier;
import io.github.ctgnz.jmsfx.generator.schema.Library.Amplifiers.Amplifier.Values;
import io.github.ctgnz.jmsfx.generator.schema.Library.Dimensions.Dimension.SymbolSets.SymbolSetRef;

public class ListAmplifierGroupEnum extends StandardEnum {
    private final List<ListAmplifierElementEnum> values = new ArrayList<>();
    private final String typeName;
    private final String graphicLocation;
    private final String[] symbolSets;
    private final String enumId;
    private final String enumDesc;
    private final boolean standard;
    private final boolean country;
    private final boolean coded;
    private final boolean frameAmplifier;
    private final boolean unknown;
    private String amplifierId;

    public ListAmplifierGroupEnum(ListAmplifierConfig groupConfig, Values group) {
        super(groupConfig.getEnumId(), group.getLabel(), groupConfig.getCode(), null);
        this.typeName = groupConfig.getEnumType();
        this.graphicLocation = "NA";
        this.enumId = groupConfig.getEnumId();
        this.enumDesc = groupConfig.getEnumDesc();
        this.coded = groupConfig.isCoded();
        this.frameAmplifier = false;
        this.unknown = false;
        this.symbolSets = new String[0];
        this.standard = false;
        this.country = "NatoCountryCode".equals(groupConfig.getEnumType());
    }

    public ListAmplifierGroupEnum(StandardAmplifierConfig groupConfig, AmplifierGroup group) {
        super(group.getName(), group.getLabel(), Integer.toString(group.getAmplifierGroupCode()), null);
        this.typeName = groupConfig.getEnumType();
        this.graphicLocation = groupConfig.getGraphicLocation();
        this.enumId = groupConfig.getEnumId();
        this.enumDesc = groupConfig.getEnumDesc();
        this.coded = false;
        this.frameAmplifier = groupConfig.isFrameAmplifier();
        this.unknown = groupConfig.isUnknown();
        this.symbolSets = group.getCompatibleSymbolSetIDs().stream().map(id -> (SymbolSetRef) id).map(SymbolSetRef::getID).toArray(size -> new String[size]);
        this.standard = true;
        this.country = false;
    }

    public void addAmplifier(AmplifierGroup group, Amplifier amplifier) {
        if (!amplifier.getName().equals("EXTENSION")) {
            values.add(new ListAmplifierElementEnum(group, amplifier));
        }
    }

    public void addAmplifier(Values.Value group) {
        values.add(new ListAmplifierElementEnum(group));
    }

    public String getAmplifierId() {
        return amplifierId;
    }

    public String getEnumDesc() {
        return enumDesc;
    }

    public String getEnumId() {
        return enumId;
    }

    public String getGraphicLocation() {
        return graphicLocation;
    }

    public String[] getSymbolSets() {
        return symbolSets;
    }

    public String getTypeName() {
        return typeName;
    }

    public List<ListAmplifierElementEnum> getValues() {
        return values;
    }

    public boolean isCoded() {
        return coded;
    }

    @Override
    public boolean isExtension() {
        return values.stream().anyMatch(ListAmplifierElementEnum::isExtension);
    }

    public boolean isFor(String symbolSetId) {
        return Arrays.stream(symbolSets).anyMatch(id -> id.equals(symbolSetId));
    }

    public boolean isFrameAmplifier() {
        return frameAmplifier;
    }

    public boolean isStandard() {
        return standard;
    }

    public boolean isUnknown() {
        return unknown;
    }

    public void setAmplifierId(String amplifierId) {
        this.amplifierId = amplifierId;
    }

    public boolean isCountry() {
        return country;
    }

}
