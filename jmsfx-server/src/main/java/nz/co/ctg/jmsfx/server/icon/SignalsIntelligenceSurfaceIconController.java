package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.signalsintelligencesurface.SignalsIntelligenceSurfaceEntity;
import nz.co.ctg.jmsfx.model.signalsintelligencesurface.SignalsIntelligenceSurfaceEntityType;
import nz.co.ctg.jmsfx.model.signalsintelligencesurface.SignalsIntelligenceSurfaceSectorOneModifier;

@RestController
@RequestMapping("/SignalsIntelligenceSurface")
public class SignalsIntelligenceSurfaceIconController extends IconRestController<SignalsIntelligenceSurfaceEntity, SignalsIntelligenceSurfaceEntityType, EntitySubType, SignalsIntelligenceSurfaceSectorOneModifier, SectorTwoModifier, AmplifierGroup>{

    public SignalsIntelligenceSurfaceIconController() {
        super(SymbolSet.SS_SIGINT_SURFACE);
    }

}
