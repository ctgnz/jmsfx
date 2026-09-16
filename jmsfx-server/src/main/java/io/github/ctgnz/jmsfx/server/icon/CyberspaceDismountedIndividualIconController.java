package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.cyberspacedismountedindividual.CyberspaceDismountedIndividualEntity;
import io.github.ctgnz.jmsfx.standard.cyberspacedismountedindividual.CyberspaceDismountedIndividualEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspacedismountedindividual.CyberspaceDismountedIndividualSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspacedismountedindividual.CyberspaceDismountedIndividualSectorTwoModifier;

@RestController
@RequestMapping("/CyberspaceDismountedIndividual")
public class CyberspaceDismountedIndividualIconController extends IconRestController<CyberspaceDismountedIndividualEntity, CyberspaceDismountedIndividualEntityType, EntitySubType, CyberspaceDismountedIndividualSectorOneModifier, CyberspaceDismountedIndividualSectorTwoModifier, AmplifierListItem> {

    public CyberspaceDismountedIndividualIconController() {
        super(SymbolSetEnum.CYBERSPACE_DISMOUNTED);
    }

}
