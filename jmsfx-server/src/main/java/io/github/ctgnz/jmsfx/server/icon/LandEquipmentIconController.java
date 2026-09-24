package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.amplifier.EquipmentMobility;
import io.github.ctgnz.jmsfx.standard.landequipment.LandEquipmentEntity;
import io.github.ctgnz.jmsfx.standard.landequipment.LandEquipmentEntitySubType;
import io.github.ctgnz.jmsfx.standard.landequipment.LandEquipmentEntityType;
import io.github.ctgnz.jmsfx.standard.landequipment.LandEquipmentSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.landequipment.LandEquipmentSectorTwoModifier;

@RestController
@RequestMapping("/LandEquipment")
public class LandEquipmentIconController extends IconRestController<LandEquipmentEntity, LandEquipmentEntityType, LandEquipmentEntitySubType, LandEquipmentSectorOneModifier, LandEquipmentSectorTwoModifier, EquipmentMobility> {

    public LandEquipmentIconController() {
        super(SymbolSetEnum.LAND_EQUIPMENT);
    }

}
