package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.amplifier.UnitEchelon;
import io.github.ctgnz.jmsfx.standard.landunits.LandUnitsEntity;
import io.github.ctgnz.jmsfx.standard.landunits.LandUnitsEntitySubType;
import io.github.ctgnz.jmsfx.standard.landunits.LandUnitsEntityType;
import io.github.ctgnz.jmsfx.standard.landunits.LandUnitsSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.landunits.LandUnitsSectorTwoModifier;

@RestController
@RequestMapping("/LandUnits")
public class LandUnitsIconController extends IconRestController<LandUnitsEntity, LandUnitsEntityType, LandUnitsEntitySubType, LandUnitsSectorOneModifier, LandUnitsSectorTwoModifier, UnitEchelon> {


    public LandUnitsIconController() {
        super(SymbolSetEnum.LAND_UNIT);
    }

}
