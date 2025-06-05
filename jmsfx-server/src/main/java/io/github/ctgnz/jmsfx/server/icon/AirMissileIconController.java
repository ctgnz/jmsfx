package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileEntity;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.airmissile.AirMissileSectorTwoModifier;

@RestController
@RequestMapping("/AirMissile")
public class AirMissileIconController extends IconRestController<AirMissileEntity, IEntityType, IEntitySubType, AirMissileSectorOneModifier, AirMissileSectorTwoModifier, IListAmplifier>{

    public AirMissileIconController() {
        super(SymbolSet.AIR_MISSILE);
    }

}
