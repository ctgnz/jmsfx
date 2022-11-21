package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.UnitEchelon;
import nz.co.ctg.jmsfx.model.landunits.LandUnitsEntity;
import nz.co.ctg.jmsfx.model.landunits.LandUnitsEntitySubType;
import nz.co.ctg.jmsfx.model.landunits.LandUnitsEntityType;
import nz.co.ctg.jmsfx.model.landunits.LandUnitsSectorOneModifier;
import nz.co.ctg.jmsfx.model.landunits.LandUnitsSectorTwoModifier;

@RestController
@RequestMapping("/LandUnits")
public class LandUnitsIconController extends IconRestController<LandUnitsEntity, LandUnitsEntityType, LandUnitsEntitySubType, LandUnitsSectorOneModifier, LandUnitsSectorTwoModifier, UnitEchelon> {


    public LandUnitsIconController() {
        super(SymbolSet.SS_LAND_UNIT);
    }

}
