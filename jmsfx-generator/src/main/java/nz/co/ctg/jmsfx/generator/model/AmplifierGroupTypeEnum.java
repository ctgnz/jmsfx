package nz.co.ctg.jmsfx.generator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nz.co.ctg.jmsfx.generator.AmplifierGroupConfig;
import nz.co.ctg.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup;
import nz.co.ctg.jmsfx.generator.schema.Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier;
import nz.co.ctg.jmsfx.generator.schema.Library.Dimensions.Dimension.SymbolSets.SymbolSetRef;

public class AmplifierGroupTypeEnum extends StandardEnum {
    private final List<AmplifierGroupEnum> values = new ArrayList<>();
    private final String typeName;
    private final String graphicLocation;
    private final String[] symbolSets;
    private final String enumId;
    private final String enumDesc;
    private final boolean frameAmplifier;
    private final boolean unknown;

    public AmplifierGroupTypeEnum(AmplifierGroupConfig groupConfig, AmplifierGroup group) {
        super(group.getName(), group.getLabel(), Integer.toString(group.getAmplifierGroupCode()));
        this.typeName = groupConfig.getEnumType();
        this.graphicLocation = groupConfig.getGraphicLocation();
        this.enumId = groupConfig.getEnumId();
        this.enumDesc = groupConfig.getEnumDesc();
        this.frameAmplifier = groupConfig.isFrameAmplifier();
        this.unknown = groupConfig.isUnknown();
        this.symbolSets = group.getCompatibleSymbolSetIDs().stream().map(id -> (SymbolSetRef) id).map(SymbolSetRef::getID).toArray(size -> new String[size]);
    }

    public void addAmplifier(AmplifierGroup group, Amplifier amplifier) {
        if (!amplifier.getName().equals("EXTENSION")) {
            values.add(new AmplifierGroupEnum(group, amplifier));
        }
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

    public List<AmplifierGroupEnum> getValues() {
        return values;
    }

    public boolean isFor(String symbolSetId) {
        return Arrays.stream(symbolSets).anyMatch(id -> id.equals(symbolSetId));
    }

    public boolean isFrameAmplifier() {
        return frameAmplifier;
    }

    public boolean isUnknown() {
        return unknown;
    }

}
