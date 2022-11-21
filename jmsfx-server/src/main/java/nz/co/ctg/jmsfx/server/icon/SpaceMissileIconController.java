package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.spacemissile.SpaceMissileEntity;
import nz.co.ctg.jmsfx.model.spacemissile.SpaceMissileSectorOneModifier;
import nz.co.ctg.jmsfx.model.spacemissile.SpaceMissileSectorTwoModifier;

@RestController
@RequestMapping("/SpaceMissile")
public class SpaceMissileIconController extends IconRestController<SpaceMissileEntity, EntityType, EntitySubType, SpaceMissileSectorOneModifier, SpaceMissileSectorTwoModifier, AmplifierGroup>{

    public SpaceMissileIconController() {
        super(SymbolSet.SS_SPACE_MISSILE);
    }

}
