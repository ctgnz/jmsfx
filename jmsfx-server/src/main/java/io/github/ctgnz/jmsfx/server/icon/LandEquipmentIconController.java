package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.amplifier.EquipmentMobility;
import io.github.ctgnz.jmsfx.icon.landequipment.LandEquipmentEntity;
import io.github.ctgnz.jmsfx.icon.landequipment.LandEquipmentEntitySubType;
import io.github.ctgnz.jmsfx.icon.landequipment.LandEquipmentEntityType;
import io.github.ctgnz.jmsfx.icon.landequipment.LandEquipmentSectorOneModifier;

@RestController
@RequestMapping("/LandEquipment")
public class LandEquipmentIconController extends IconRestController<LandEquipmentEntity, LandEquipmentEntityType, LandEquipmentEntitySubType, LandEquipmentSectorOneModifier, SectorTwoModifier, EquipmentMobility> {

    public LandEquipmentIconController() {
        super(SymbolSet.LAND_EQUIPMENT);
    }

}
