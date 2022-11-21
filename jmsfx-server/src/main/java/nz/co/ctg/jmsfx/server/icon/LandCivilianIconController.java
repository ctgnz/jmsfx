package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.landcivilian.LandCivilianEntity;
import nz.co.ctg.jmsfx.model.landcivilian.LandCivilianEntityType;
import nz.co.ctg.jmsfx.model.landcivilian.LandCivilianSectorOneModifier;
import nz.co.ctg.jmsfx.model.landcivilian.LandCivilianSectorTwoModifier;

@RestController
@RequestMapping("/LandCivilian")
public class LandCivilianIconController extends IconRestController<LandCivilianEntity, LandCivilianEntityType, EntitySubType, LandCivilianSectorOneModifier, LandCivilianSectorTwoModifier, AmplifierGroup> {

    public LandCivilianIconController() {
        super(SymbolSet.SS_LAND_CIVILIAN);
    }

}
