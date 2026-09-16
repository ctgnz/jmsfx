package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.cyberspacelandunit.CyberspaceLandUnitEntity;
import io.github.ctgnz.jmsfx.standard.cyberspacelandunit.CyberspaceLandUnitEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspacelandunit.CyberspaceLandUnitSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspacelandunit.CyberspaceLandUnitSectorTwoModifier;

@RestController
@RequestMapping("/CyberspaceLandUnit")
public class CyberspaceLandUnitIconController extends IconRestController<CyberspaceLandUnitEntity, CyberspaceLandUnitEntityType, EntitySubType, CyberspaceLandUnitSectorOneModifier, CyberspaceLandUnitSectorTwoModifier, AmplifierListItem> {

    public CyberspaceLandUnitIconController() {
        super(SymbolSetEnum.CYBERSPACE_LAND_UNIT);
    }

}
