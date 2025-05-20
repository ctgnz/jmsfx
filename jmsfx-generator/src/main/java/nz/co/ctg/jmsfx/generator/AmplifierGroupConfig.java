package nz.co.ctg.jmsfx.generator;

import java.util.Arrays;

public class AmplifierGroupConfig {
    private String enumType;
    private String enumId;
    private String enumDesc;
    private String graphicLocation;
    private String[] groupIds;
    private boolean frameAmplifier;
    private boolean unknown;

     public String getEnumDesc() {
        return enumDesc;
    }

    public String getEnumId() {
        return enumId;
    }

    public String getEnumType() {
        return enumType;
    }

    public String getGraphicLocation() {
        return graphicLocation;
    }

    public String[] getGroupIds() {
        return groupIds;
    }

    public boolean isForGroup(String name) {
        return Arrays.stream(groupIds).anyMatch(group -> group.equals(name));
    }

    public boolean isFrameAmplifier() {
        return frameAmplifier;
    }

    public boolean isUnknown() {
        return unknown;
    }

    public void setEnumDesc(String enumDesc) {
        this.enumDesc = enumDesc;
    }

    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }

    public void setFrameAmplifier(boolean colorModifier) {
        this.frameAmplifier = colorModifier;
    }

    public void setGraphicLocation(String graphicLocation) {
        this.graphicLocation = graphicLocation;
    }

    public void setGroupIds(String[] groupIds) {
        this.groupIds = groupIds;
    }

    public void setUnknown(boolean unknown) {
        this.unknown = unknown;
    }
}
