package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.amplifier.UnitEchelon;
import io.github.ctgnz.jmsfx.icon.landunits.LandUnitsEntity;
import io.github.ctgnz.jmsfx.icon.landunits.LandUnitsEntitySubType;
import io.github.ctgnz.jmsfx.icon.landunits.LandUnitsEntityType;
import io.github.ctgnz.jmsfx.icon.landunits.LandUnitsSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.landunits.LandUnitsSectorTwoModifier;

@RestController
@RequestMapping("/LandUnits")
public class LandUnitsIconController extends IconRestController<LandUnitsEntity, LandUnitsEntityType, LandUnitsEntitySubType, LandUnitsSectorOneModifier, LandUnitsSectorTwoModifier, UnitEchelon> {


    public LandUnitsIconController() {
        super(SymbolSet.LAND_UNIT);
    }

}
