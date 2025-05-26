package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.EnumeratedAmplifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.air.AirEntity;
import nz.co.ctg.jmsfx.model.air.AirEntitySubType;
import nz.co.ctg.jmsfx.model.air.AirEntityType;
import nz.co.ctg.jmsfx.model.air.AirSectorOneModifier;
import nz.co.ctg.jmsfx.model.air.AirSectorTwoModifier;

@RestController
@RequestMapping("/Air")
public class AirIconController extends IconRestController<AirEntity, AirEntityType, AirEntitySubType, AirSectorOneModifier, AirSectorTwoModifier, EnumeratedAmplifier> {

    public AirIconController() {
        super(SymbolSet.AIR);
    }

}
