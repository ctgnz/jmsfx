package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.EquipmentMobility;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.landequipment.LandEquipmentEntity;
import nz.co.ctg.jmsfx.model.landequipment.LandEquipmentEntitySubType;
import nz.co.ctg.jmsfx.model.landequipment.LandEquipmentEntityType;
import nz.co.ctg.jmsfx.model.landequipment.LandEquipmentSectorOneModifier;

@RestController
@RequestMapping("/LandEquipment")
public class LandEquipmentIconController extends IconRestController<LandEquipmentEntity, LandEquipmentEntityType, LandEquipmentEntitySubType, LandEquipmentSectorOneModifier, SectorTwoModifier, EquipmentMobility> {

    public LandEquipmentIconController() {
        super(SymbolSet.SS_LAND_EQUIPMENT);
    }

}
