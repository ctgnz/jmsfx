package nz.co.ctg.jmsfx.model.landinstallation;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;

public enum LandInstallationSectorTwoModifier implements SectorTwoModifier {
    UNSPECIFIED_2_MOD("00", "Unspecified", SymbolSet.SS_LAND_INSTALLATION),
    BIOLOGICAL_2_MOD("01", "Biological", SymbolSet.SS_LAND_INSTALLATION),
    CHEMICAL_2_MOD("02", "Chemical", SymbolSet.SS_LAND_INSTALLATION),
    NUCLEAR_2_MOD("03", "Nuclear", SymbolSet.SS_LAND_INSTALLATION),
    RADIOLOGICAL_2_MOD("04", "Radiological", SymbolSet.SS_LAND_INSTALLATION),
    ATOMIC_ENERGY_REACTOR_MOD("05", "Atomic Energy Reactor", SymbolSet.SS_LAND_INSTALLATION),
    NUCLEAR_MATERIAL_PRODUCTION_MOD("06", "Nuclear Material Production", SymbolSet.SS_LAND_INSTALLATION),
    NUCLEAR_MATERIAL_STORAGE_MOD("07", "Nuclear Material Storage", SymbolSet.SS_LAND_INSTALLATION),
    WEAPONS_GRADE_MOD("08", "Weapons Grade", SymbolSet.SS_LAND_INSTALLATION);

    private final String id;
    private final String label;
    private final SymbolSet symbolSet;
    
    private LandInstallationSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
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