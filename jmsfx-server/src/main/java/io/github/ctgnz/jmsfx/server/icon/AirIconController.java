package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.air.AirEntity;
import io.github.ctgnz.jmsfx.icon.air.AirEntitySubType;
import io.github.ctgnz.jmsfx.icon.air.AirEntityType;
import io.github.ctgnz.jmsfx.icon.air.AirSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.air.AirSectorTwoModifier;

@RestController
@RequestMapping("/Air")
public class AirIconController extends IconRestController<AirEntity, AirEntityType, AirEntitySubType, AirSectorOneModifier, AirSectorTwoModifier, AmplifierListItem> {

    public AirIconController() {
        super(SymbolSetEnum.AIR);
    }

}
