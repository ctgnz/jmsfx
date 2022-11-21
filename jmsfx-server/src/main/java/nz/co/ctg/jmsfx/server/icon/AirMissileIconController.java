package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.airmissile.AirMissileEntity;
import nz.co.ctg.jmsfx.model.airmissile.AirMissileSectorOneModifier;
import nz.co.ctg.jmsfx.model.airmissile.AirMissileSectorTwoModifier;

@RestController
@RequestMapping("/AirMissile")
public class AirMissileIconController extends IconRestController<AirMissileEntity, EntityType, EntitySubType, AirMissileSectorOneModifier, AirMissileSectorTwoModifier, AmplifierGroup>{

    public AirMissileIconController() {
        super(SymbolSet.SS_AIR_MISSILE);
    }

}
