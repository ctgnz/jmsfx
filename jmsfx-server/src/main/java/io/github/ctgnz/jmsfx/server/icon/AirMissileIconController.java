package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileEntity;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileSectorTwoModifier;

@RestController
@RequestMapping("/AirMissile")
public class AirMissileIconController extends IconRestController<AirMissileEntity, EntityType, EntitySubType, AirMissileSectorOneModifier, AirMissileSectorTwoModifier, AmplifierListItem>{

    public AirMissileIconController() {
        super(SymbolSetEnum.AIR_MISSILE);
    }

}
