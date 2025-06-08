package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.air.AirEntity;
import io.github.ctgnz.jmsfx.icon.air.AirEntitySubType;
import io.github.ctgnz.jmsfx.icon.air.AirEntityType;
import io.github.ctgnz.jmsfx.icon.air.AirSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.air.AirSectorTwoModifier;

@RestController
@RequestMapping("/Air")
public class AirIconController extends IconRestController<AirEntity, AirEntityType, AirEntitySubType, AirSectorOneModifier, AirSectorTwoModifier, IAmplifierListItem> {

    public AirIconController() {
        super(SymbolSet.AIR);
    }

}
