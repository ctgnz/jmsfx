package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.signalsintelligencespace.SignalsIntelligenceSpaceEntity;
import nz.co.ctg.jmsfx.model.signalsintelligencespace.SignalsIntelligenceSpaceEntityType;
import nz.co.ctg.jmsfx.model.signalsintelligencespace.SignalsIntelligenceSpaceSectorOneModifier;

@RestController
@RequestMapping("/SignalsIntelligenceSpace")
public class SignalsIntelligenceSpaceIconController extends IconRestController<SignalsIntelligenceSpaceEntity, SignalsIntelligenceSpaceEntityType, EntitySubType, SignalsIntelligenceSpaceSectorOneModifier, SectorTwoModifier, AmplifierGroup>{

    public SignalsIntelligenceSpaceIconController() {
        super(SymbolSet.SS_SIGINT_SPACE);
    }

}
