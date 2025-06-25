package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.air.AirEntity;
import io.github.ctgnz.jmsfx.standard.air.AirEntitySubType;
import io.github.ctgnz.jmsfx.standard.air.AirEntityType;
import io.github.ctgnz.jmsfx.standard.air.AirSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.air.AirSectorTwoModifier;

@RestController
@RequestMapping("/Air")
public class AirIconController extends IconRestController<AirEntity, AirEntityType, AirEntitySubType, AirSectorOneModifier, AirSectorTwoModifier, AmplifierListItem> {

    public AirIconController() {
        super(SymbolSetEnum.AIR);
    }

}
