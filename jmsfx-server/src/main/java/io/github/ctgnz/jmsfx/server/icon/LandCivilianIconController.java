package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianEntity;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianEntityType;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianSectorTwoModifier;

@RestController
@RequestMapping("/LandCivilian")
public class LandCivilianIconController extends IconRestController<LandCivilianEntity, LandCivilianEntityType, EntitySubType, LandCivilianSectorOneModifier, LandCivilianSectorTwoModifier, AmplifierListItem> {

    public LandCivilianIconController() {
        super(SymbolSetEnum.LAND_CIVILIAN);
    }

}
