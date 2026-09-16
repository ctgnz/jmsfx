package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.amplifier.LeadershipRole;
import io.github.ctgnz.jmsfx.standard.dismountedindividual.DismountedIndividualEntity;
import io.github.ctgnz.jmsfx.standard.dismountedindividual.DismountedIndividualEntitySubType;
import io.github.ctgnz.jmsfx.standard.dismountedindividual.DismountedIndividualEntityType;
import io.github.ctgnz.jmsfx.standard.dismountedindividual.DismountedIndividualSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.dismountedindividual.DismountedIndividualSectorTwoModifier;

@RestController
@RequestMapping("/DismountedIndividual")
public class DismountedIndividualIconController extends IconRestController<DismountedIndividualEntity, DismountedIndividualEntityType, DismountedIndividualEntitySubType, DismountedIndividualSectorOneModifier, DismountedIndividualSectorTwoModifier, LeadershipRole> {

    public DismountedIndividualIconController() {
        super(SymbolSetEnum.DISMOUNTED);
    }

}
