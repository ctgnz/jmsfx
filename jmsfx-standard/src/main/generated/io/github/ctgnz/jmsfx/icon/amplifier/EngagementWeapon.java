package io.github.ctgnz.jmsfx.icon.amplifier;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.AmplifierListEnum;
import io.github.ctgnz.jmsfx.icon.Extension;

public enum EngagementWeapon implements AmplifierListItem {
    NA("", "Unspecified"),
    M("-M", "Missile"),
    BM("-BM", "Ballistic Missile"),
    CM("-CM", "Cruise Missile"),
    GN("-GN", "Gun"),
    T("-T", "Torpedo"),
    A("-A", "Attack Aircraft"),
    C("-C", "Combat Air Patrol"),
    D("-D", "Defensive Counter Air"),
    UW("-UW", "Undersea Warfare (USW)/Antisubmarine Warfare (ASW)Engagement"),
    MW("-MW", "Mine Warfare (MW) Engagement"),
    SW("-SW", "Surface Warfare (SUW) Engagement"),
    EA("-EA", "Electronic Attack"),
    ED("-ED", "Electronic Defence"),
    UV("-UV", "Unmanned Vehicle"),
    CW("-CW", "Close in Weapon System"),
    L3("-L3", "Lamps"),
    VA("-VA", "Vertical Launch ASROC");

    private final String id;
    private final String label;

    EngagementWeapon(String id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public AmplifierList getAmplifierList() {
        return AmplifierListEnum.ENGAGEMENT_WEAPON;
    }

    @Override
    public String getGraphicLocation() {
        return "NA";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public boolean isDeprecated() {
        try {
            return EngagementWeapon.class.getField(name()).getAnnotation(Deprecated.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    public boolean isExtension() {
        try {
            return EngagementWeapon.class.getField(name()).getAnnotation(Extension.class) != null;
        } catch (NoSuchFieldException | SecurityException e) {
            return false;
        }
    }

    @Override
    public boolean isGraphicalIcon() {
        return true;
    }

}