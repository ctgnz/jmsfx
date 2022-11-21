package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.meteorologicalspace.MeteorologicalSpaceEntity;

@RestController
@RequestMapping("/MeteorologicalSpace")
public class MeteorologicalSpaceIconController extends IconRestController<MeteorologicalSpaceEntity, EntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public MeteorologicalSpaceIconController() {
        super(SymbolSet.SS_MET_SPACE);
    }

}
