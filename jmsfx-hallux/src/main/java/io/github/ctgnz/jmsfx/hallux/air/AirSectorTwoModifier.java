package io.github.ctgnz.jmsfx.hallux.air;

import javafx.geometry.Rectangle2D;

import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.hallux.ModifierBounds;
import io.github.ctgnz.jmsfx.hallux.SymbolSetEnum;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

public enum AirSectorTwoModifier implements SectorTwoModifier {
        BOOM("04", "Boom-Only", ModifierCategory.RefuelingCapability),
        DROGUE("05", "Drogue-Only", ModifierCategory.RefuelingCapability),
        BOOM_DROGUE("06", "Boom and Drogue", ModifierCategory.RefuelingCapability),
        DOWNLINK("11", "Downlinked", ModifierCategory.TrackLinkAvailability),
        BOMBER("A1", "Bomber", ModifierCategory.MissionArea),
        FIGHTER("A2", "Fighter", ModifierCategory.MissionArea),
        INTERCEPTOR("A3", "Interceptor", ModifierCategory.MissionArea),
        TANKER("A4", "Tanker", ModifierCategory.MissionArea),
        PASSENGER("A5", "Passenger", ModifierCategory.MissionArea),
        ULTRA_LIGHT("A6", "Ultra Light", ModifierCategory.MissionArea),
        ACP("A7", "Airborne Command Post (ACP)", ModifierCategory.MissionArea),
        AEW("A8", "Airborne Early Warning (AEW)", ModifierCategory.MissionArea),
        GOV("A9", "Government", ModifierCategory.MissionArea),
        EC("AA", "Electronic Combat (EC)/Jammer", ModifierCategory.MissionArea),
        PATROL("AB", "Patrol", ModifierCategory.MissionArea),
        RECON("AC", "Reconnaissance", ModifierCategory.MissionArea),
        TRAINER("AD", "Trainer", ModifierCategory.MissionArea),
        PHOTO("AE", "Photographic (Reconnaissance)", ModifierCategory.MissionArea),
        PERSONNEL_RECOVERY("AF", "Personnel Recovery", ModifierCategory.MissionArea),
        COMMS("B1", "Communications", ModifierCategory.MissionArea),
        ESM("B2", "Electronic Support Measures (ESM)", ModifierCategory.MissionArea),
        VIP("B3", "Very Important Person (VIP) Transport", ModifierCategory.MissionArea),
        CSAR("B4", "Combat Search and Rescue (CSAR)", ModifierCategory.MissionArea),
        SUPP_EAD("B5", "Suppression of Enemy Air Defenses", ModifierCategory.MissionArea),
        ASUW("B6", "Antisurface Warfare", ModifierCategory.MissionArea),
        FB("B7", "Fighter/Bomber", ModifierCategory.MissionArea),
        IC("B8", "Intensive Care", ModifierCategory.MissionArea),
        EA("B9", "Electronic Attack (EA)", ModifierCategory.MissionArea),
        MULTIMISSION("BA", "Multimission", ModifierCategory.MissionArea),
        LIAISON("BB", "Liaison", ModifierCategory.MissionArea),
        ESCORT("BC", "Escort", ModifierCategory.MissionArea),
        CARGO("BD", "Cargo/Transport", ModifierCategory.MissionArea),
        WEATHER("BE", "Weather", ModifierCategory.MissionArea),
        OBSERVATION("BF", "Observation", ModifierCategory.MissionArea),
        DAY("C1", "Day", ModifierCategory.Capability),
        NIGHT("C2", "Night", ModifierCategory.Capability),
        ALL_WEATHER("C3", "All Weather", ModifierCategory.Capability),
        DIVE("C4", "Dive", ModifierCategory.Capability);

    private final String id;
    private final String label;
    private final ModifierCategory category;

    AirSectorTwoModifier(String id, String label, ModifierCategory category) {
        this.id = id;
        this.label = label;
        this.category = category;
    }

    @Override
    public ModifierCategory getCategory() {
        return category;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public SymbolSet getSymbolSet() {
        return SymbolSetEnum.AIR;
    }

    @Override
    public Rectangle2D getModifierBounds() {
        return ModifierBounds.lookup(getGraphicIdentifier());
    }
}