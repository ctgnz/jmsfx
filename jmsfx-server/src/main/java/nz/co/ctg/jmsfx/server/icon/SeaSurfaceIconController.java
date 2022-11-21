package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.TowedArrayType;
import nz.co.ctg.jmsfx.model.seasurface.SeaSurfaceEntity;
import nz.co.ctg.jmsfx.model.seasurface.SeaSurfaceEntitySubType;
import nz.co.ctg.jmsfx.model.seasurface.SeaSurfaceEntityType;
import nz.co.ctg.jmsfx.model.seasurface.SeaSurfaceSectorOneModifier;
import nz.co.ctg.jmsfx.model.seasurface.SeaSurfaceSectorTwoModifier;

@RestController
@RequestMapping("/SeaSurface")
public class SeaSurfaceIconController extends IconRestController<SeaSurfaceEntity, SeaSurfaceEntityType, SeaSurfaceEntitySubType, SeaSurfaceSectorOneModifier, SeaSurfaceSectorTwoModifier, TowedArrayType> {

    public SeaSurfaceIconController() {
        super(SymbolSet.SS_SEA_SURFACE);
    }

}
