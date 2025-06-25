package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.airmissile.AirMissileEntity;
import io.github.ctgnz.jmsfx.standard.airmissile.AirMissileSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.airmissile.AirMissileSectorTwoModifier;
import io.github.ctgnz.jmsfx.AmplifierListItem;

@RestController
@RequestMapping("/AirMissile")
public class AirMissileIconController extends IconRestController<AirMissileEntity, EntityType, EntitySubType, AirMissileSectorOneModifier, AirMissileSectorTwoModifier, AmplifierListItem>{

    public AirMissileIconController() {
        super(SymbolSetEnum.AIR_MISSILE);
    }

}
