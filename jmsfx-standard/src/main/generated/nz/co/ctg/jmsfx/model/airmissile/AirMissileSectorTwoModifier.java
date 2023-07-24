package nz.co.ctg.jmsfx.model.airmissile;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum AirMissileSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_AIR_MISSILE),
    AIR_DEST_MOD("01", "Air", SymbolSet.SS_AIR_MISSILE),
    SURFACE_DEST_MOD("02", "Surface", SymbolSet.SS_AIR_MISSILE),
    SUB_DEST_MOD("03", "Subsurface", SymbolSet.SS_AIR_MISSILE),
    SPACE_DEST_MOD("04", "Space", SymbolSet.SS_AIR_MISSILE),
    LAUNCHED_MOD("05", "Launched", SymbolSet.SS_AIR_MISSILE),
    MISSILE_MOD("06", "Missile", SymbolSet.SS_AIR_MISSILE),
    PATRIOT_MOD("07", "Patriot", SymbolSet.SS_AIR_MISSILE),
    SM2_MOD("08", "Standard Missile-2 (SM-2)", SymbolSet.SS_AIR_MISSILE),
    SM6_MOD("09", "Standard Missile-6 (SM-6)", SymbolSet.SS_AIR_MISSILE),
    ESSM_MOD("10", "Evolved Sea Sparrow Missile (ESSM)", SymbolSet.SS_AIR_MISSILE),
    RAM_MOD("11", "Rolling Airframe Missile (RAM)", SymbolSet.SS_AIR_MISSILE),
    SHORT_MOD("12", "Short Range", SymbolSet.SS_AIR_MISSILE),
    MED_MOD("13", "Medium Range", SymbolSet.SS_AIR_MISSILE),
    INTER_MOD("14", "Intermediate Range", SymbolSet.SS_AIR_MISSILE),
    LONG_MOD("15", "Long Range", SymbolSet.SS_AIR_MISSILE),
    INTERCONT_MOD("16", "Intercontinental", SymbolSet.SS_AIR_MISSILE);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private AirMissileSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
        this.id = id;
        this.label = label;
        this.symbolSet = symbolSet;
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
        return symbolSet;
    }
    
}