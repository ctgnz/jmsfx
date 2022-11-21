package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.seasubsurface.SeaSubsurfaceEntity;
import nz.co.ctg.jmsfx.model.seasubsurface.SeaSubsurfaceEntitySubType;
import nz.co.ctg.jmsfx.model.seasubsurface.SeaSubsurfaceEntityType;
import nz.co.ctg.jmsfx.model.seasubsurface.SeaSubsurfaceSectorOneModifier;
import nz.co.ctg.jmsfx.model.seasubsurface.SeaSubsurfaceSectorTwoModifier;

@RestController
@RequestMapping("/SeaSubsurface")
public class SeaSubsurfaceIconController extends IconRestController<SeaSubsurfaceEntity, SeaSubsurfaceEntityType, SeaSubsurfaceEntitySubType, SeaSubsurfaceSectorOneModifier, SeaSubsurfaceSectorTwoModifier, AmplifierGroup> {

    public SeaSubsurfaceIconController() {
        super(SymbolSet.SS_SEA_SUBSURFACE);
    }

}
