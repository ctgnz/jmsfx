package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.amplifier.LeadershipRole;
import io.github.ctgnz.jmsfx.icon.dismountedindividual.DismountedIndividualEntity;
import io.github.ctgnz.jmsfx.icon.dismountedindividual.DismountedIndividualEntitySubType;
import io.github.ctgnz.jmsfx.icon.dismountedindividual.DismountedIndividualEntityType;
import io.github.ctgnz.jmsfx.icon.dismountedindividual.DismountedIndividualSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.dismountedindividual.DismountedIndividualSectorTwoModifier;

@RestController
@RequestMapping("/DismountedIndividual")
public class DismountedIndividualIconController extends IconRestController<DismountedIndividualEntity, DismountedIndividualEntityType, DismountedIndividualEntitySubType, DismountedIndividualSectorOneModifier, DismountedIndividualSectorTwoModifier, LeadershipRole> {

    public DismountedIndividualIconController() {
        super(SymbolSet.DISMOUNTED);
    }

}
