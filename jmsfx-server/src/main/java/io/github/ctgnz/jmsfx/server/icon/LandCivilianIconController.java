package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianEntity;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianEntityType;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.landcivilian.LandCivilianSectorTwoModifier;

@RestController
@RequestMapping("/LandCivilian")
public class LandCivilianIconController extends IconRestController<LandCivilianEntity, LandCivilianEntityType, IEntitySubType, LandCivilianSectorOneModifier, LandCivilianSectorTwoModifier, IListAmplifier> {

    public LandCivilianIconController() {
        super(SymbolSet.LAND_CIVILIAN);
    }

}
