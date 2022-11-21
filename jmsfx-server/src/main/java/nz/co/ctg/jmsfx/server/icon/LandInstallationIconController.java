package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.landinstallation.LandInstallationEntity;
import nz.co.ctg.jmsfx.model.landinstallation.LandInstallationEntitySubType;
import nz.co.ctg.jmsfx.model.landinstallation.LandInstallationEntityType;
import nz.co.ctg.jmsfx.model.landinstallation.LandInstallationSectorOneModifier;
import nz.co.ctg.jmsfx.model.landinstallation.LandInstallationSectorTwoModifier;

@RestController
@RequestMapping("/LandInstallation")
public class LandInstallationIconController extends IconRestController<LandInstallationEntity, LandInstallationEntityType, LandInstallationEntitySubType, LandInstallationSectorOneModifier, LandInstallationSectorTwoModifier, AmplifierGroup> {

    public LandInstallationIconController() {
        super(SymbolSet.SS_LAND_INSTALLATION);
    }

}
