package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.landcivilian.LandCivilianEntity;
import io.github.ctgnz.jmsfx.standard.landcivilian.LandCivilianEntityType;
import io.github.ctgnz.jmsfx.standard.landcivilian.LandCivilianSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.landcivilian.LandCivilianSectorTwoModifier;
import io.github.ctgnz.jmsfx.AmplifierListItem;

@RestController
@RequestMapping("/LandCivilian")
public class LandCivilianIconController extends IconRestController<LandCivilianEntity, LandCivilianEntityType, EntitySubType, LandCivilianSectorOneModifier, LandCivilianSectorTwoModifier, AmplifierListItem> {

    public LandCivilianIconController() {
        super(SymbolSetEnum.LAND_CIVILIAN);
    }

}
