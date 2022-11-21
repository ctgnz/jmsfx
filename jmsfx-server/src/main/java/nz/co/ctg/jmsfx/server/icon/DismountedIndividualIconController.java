package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.LeadershipRole;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.dismountedindividual.DismountedIndividualEntity;
import nz.co.ctg.jmsfx.model.dismountedindividual.DismountedIndividualEntitySubType;
import nz.co.ctg.jmsfx.model.dismountedindividual.DismountedIndividualEntityType;
import nz.co.ctg.jmsfx.model.dismountedindividual.DismountedIndividualSectorOneModifier;
import nz.co.ctg.jmsfx.model.dismountedindividual.DismountedIndividualSectorTwoModifier;

@RestController
@RequestMapping("/DismountedIndividual")
public class DismountedIndividualIconController extends IconRestController<DismountedIndividualEntity, DismountedIndividualEntityType, DismountedIndividualEntitySubType, DismountedIndividualSectorOneModifier, DismountedIndividualSectorTwoModifier, LeadershipRole> {

    public DismountedIndividualIconController() {
        super(SymbolSet.SS_DISMOUNTED);
    }

}
