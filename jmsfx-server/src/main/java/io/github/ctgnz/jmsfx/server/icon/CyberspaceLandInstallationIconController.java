package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.cyberspacelandinstallation.CyberspaceLandInstallationEntity;
import io.github.ctgnz.jmsfx.standard.cyberspacelandinstallation.CyberspaceLandInstallationEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspacelandinstallation.CyberspaceLandInstallationSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspacelandinstallation.CyberspaceLandInstallationSectorTwoModifier;

@RestController
@RequestMapping("/CyberspaceLandInstallation")
public class CyberspaceLandInstallationIconController extends IconRestController<CyberspaceLandInstallationEntity, CyberspaceLandInstallationEntityType, EntitySubType, CyberspaceLandInstallationSectorOneModifier, CyberspaceLandInstallationSectorTwoModifier, AmplifierListItem> {

    public CyberspaceLandInstallationIconController() {
        super(SymbolSetEnum.CYBERSPACE_LAND_INSTALLATION);
    }

}
