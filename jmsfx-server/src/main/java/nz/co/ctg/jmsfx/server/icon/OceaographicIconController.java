package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.oceanographic.OceanographicEntity;
import nz.co.ctg.jmsfx.model.oceanographic.OceanographicEntitySubType;
import nz.co.ctg.jmsfx.model.oceanographic.OceanographicEntityType;

@RestController
@RequestMapping("/Oceanographic")
public class OceaographicIconController extends IconRestController<OceanographicEntity, OceanographicEntityType, OceanographicEntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public OceaographicIconController() {
        super(SymbolSet.SS_OCEANIC);
    }

}
