package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileEntity;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileSectorTwoModifier;

@RestController
@RequestMapping("/AirMissile")
public class AirMissileIconController extends IconRestController<AirMissileEntity, EntityType, EntitySubType, AirMissileSectorOneModifier, AirMissileSectorTwoModifier, EnumeratedAmplifier>{

    public AirMissileIconController() {
        super(SymbolSet.AIR_MISSILE);
    }

}
