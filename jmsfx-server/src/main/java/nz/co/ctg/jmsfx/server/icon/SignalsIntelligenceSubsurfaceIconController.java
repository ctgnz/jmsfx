package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.signalsintelligencesubsurface.SignalsIntelligenceSubsurfaceEntity;
import nz.co.ctg.jmsfx.model.signalsintelligencesubsurface.SignalsIntelligenceSubsurfaceEntityType;
import nz.co.ctg.jmsfx.model.signalsintelligencesubsurface.SignalsIntelligenceSubsurfaceSectorOneModifier;

@RestController
@RequestMapping("/SignalsIntelligenceSubsurface")
public class SignalsIntelligenceSubsurfaceIconController extends IconRestController<SignalsIntelligenceSubsurfaceEntity, SignalsIntelligenceSubsurfaceEntityType, EntitySubType, SignalsIntelligenceSubsurfaceSectorOneModifier, SectorTwoModifier, AmplifierGroup>{

    public SignalsIntelligenceSubsurfaceIconController() {
        super(SymbolSet.SS_SIGINT_SUBSURFACE);
    }

}
