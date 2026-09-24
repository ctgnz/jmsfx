package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.amplifier.EquipmentMobility;
import io.github.ctgnz.jmsfx.standard.landinstallation.LandInstallationEntity;
import io.github.ctgnz.jmsfx.standard.landinstallation.LandInstallationEntitySubType;
import io.github.ctgnz.jmsfx.standard.landinstallation.LandInstallationEntityType;
import io.github.ctgnz.jmsfx.standard.landinstallation.LandInstallationSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.landinstallation.LandInstallationSectorTwoModifier;

@RestController
@RequestMapping("/LandInstallation")
public class LandInstallationIconController extends IconRestController<LandInstallationEntity, LandInstallationEntityType, LandInstallationEntitySubType, LandInstallationSectorOneModifier, LandInstallationSectorTwoModifier, EquipmentMobility> {

    public LandInstallationIconController() {
        super(SymbolSetEnum.LAND_INSTALLATION);
    }

}
