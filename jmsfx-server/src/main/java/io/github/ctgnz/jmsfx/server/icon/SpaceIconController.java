package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.space.SpaceEntity;
import io.github.ctgnz.jmsfx.standard.space.SpaceEntityType;
import io.github.ctgnz.jmsfx.standard.space.SpaceSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.space.SpaceSectorTwoModifier;
import io.github.ctgnz.jmsfx.AmplifierListItem;

@RestController
@RequestMapping("/Space")
public class SpaceIconController extends IconRestController<SpaceEntity, SpaceEntityType, EntitySubType, SpaceSectorOneModifier, SpaceSectorTwoModifier, AmplifierListItem> {

    public SpaceIconController() {
        super(SymbolSetEnum.SPACE);
    }

}
