package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.landinstallation.LandInstallationEntity;
import io.github.ctgnz.jmsfx.icon.landinstallation.LandInstallationEntitySubType;
import io.github.ctgnz.jmsfx.icon.landinstallation.LandInstallationEntityType;
import io.github.ctgnz.jmsfx.icon.landinstallation.LandInstallationSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.landinstallation.LandInstallationSectorTwoModifier;

@RestController
@RequestMapping("/LandInstallation")
public class LandInstallationIconController extends IconRestController<LandInstallationEntity, LandInstallationEntityType, LandInstallationEntitySubType, LandInstallationSectorOneModifier, LandInstallationSectorTwoModifier, AmplifierListItem> {

    public LandInstallationIconController() {
        super(SymbolSetEnum.LAND_INSTALLATION);
    }

}
