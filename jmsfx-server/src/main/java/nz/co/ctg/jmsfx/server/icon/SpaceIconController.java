package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.space.SpaceEntity;
import nz.co.ctg.jmsfx.model.space.SpaceEntityType;
import nz.co.ctg.jmsfx.model.space.SpaceSectorOneModifier;
import nz.co.ctg.jmsfx.model.space.SpaceSectorTwoModifier;

@RestController
@RequestMapping("/Space")
public class SpaceIconController extends IconRestController<SpaceEntity, SpaceEntityType, EntitySubType, SpaceSectorOneModifier, SpaceSectorTwoModifier, AmplifierGroup> {

    public SpaceIconController() {
        super(SymbolSet.SS_SPACE);
    }

}
