package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.cyberspaceair.CyberspaceAirEntity;
import io.github.ctgnz.jmsfx.standard.cyberspaceair.CyberspaceAirEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspaceair.CyberspaceAirSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspaceair.CyberspaceAirSectorTwoModifier;

@RestController
@RequestMapping("/CyberspaceAir")
public class CyberspaceAirIconController extends IconRestController<CyberspaceAirEntity, CyberspaceAirEntityType, EntitySubType, CyberspaceAirSectorOneModifier, CyberspaceAirSectorTwoModifier, AmplifierListItem> {

    public CyberspaceAirIconController() {
        super(SymbolSetEnum.CYBERSPACE_AIR);
    }

}
