package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.signalsintelligenceland.SignalsIntelligenceLandEntity;
import nz.co.ctg.jmsfx.model.signalsintelligenceland.SignalsIntelligenceLandEntityType;
import nz.co.ctg.jmsfx.model.signalsintelligenceland.SignalsIntelligenceLandSectorOneModifier;

@RestController
@RequestMapping("/SignalsIntelligenceLand")
public class SignalsIntelligenceLandIconController extends IconRestController<SignalsIntelligenceLandEntity, SignalsIntelligenceLandEntityType, EntitySubType, SignalsIntelligenceLandSectorOneModifier, SectorTwoModifier, AmplifierGroup>{

    public SignalsIntelligenceLandIconController() {
        super(SymbolSet.SS_SIGINT_LAND);
    }

}
