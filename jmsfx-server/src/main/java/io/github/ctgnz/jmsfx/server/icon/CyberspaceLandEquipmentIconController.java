package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.cyberspacelandequipment.CyberspaceLandEquipmentEntity;
import io.github.ctgnz.jmsfx.standard.cyberspacelandequipment.CyberspaceLandEquipmentEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspacelandequipment.CyberspaceLandEquipmentSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspacelandequipment.CyberspaceLandEquipmentSectorTwoModifier;

@RestController
@RequestMapping("/CyberspaceLandEquipment")
public class CyberspaceLandEquipmentIconController extends IconRestController<CyberspaceLandEquipmentEntity, CyberspaceLandEquipmentEntityType, EntitySubType, CyberspaceLandEquipmentSectorOneModifier, CyberspaceLandEquipmentSectorTwoModifier, AmplifierListItem> {

    public CyberspaceLandEquipmentIconController() {
        super(SymbolSetEnum.CYBERSPACE_LAND_EQUIPMENT);
    }

}
