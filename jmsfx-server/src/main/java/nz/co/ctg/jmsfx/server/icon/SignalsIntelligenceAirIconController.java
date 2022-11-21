package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.signalsintelligenceair.SignalsIntelligenceAirEntity;
import nz.co.ctg.jmsfx.model.signalsintelligenceair.SignalsIntelligenceAirEntityType;
import nz.co.ctg.jmsfx.model.signalsintelligenceair.SignalsIntelligenceAirSectorOneModifier;

@RestController
@RequestMapping("/SignalsIntelligenceAir")
public class SignalsIntelligenceAirIconController extends IconRestController<SignalsIntelligenceAirEntity, SignalsIntelligenceAirEntityType, EntitySubType, SignalsIntelligenceAirSectorOneModifier, SectorTwoModifier, AmplifierGroup>{

    public SignalsIntelligenceAirIconController() {
        super(SymbolSet.SS_SIGINT_AIR);
    }

}
