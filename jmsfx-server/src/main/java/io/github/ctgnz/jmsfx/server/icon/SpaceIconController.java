package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.space.SpaceEntity;
import io.github.ctgnz.jmsfx.icon.space.SpaceEntityType;
import io.github.ctgnz.jmsfx.icon.space.SpaceSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.space.SpaceSectorTwoModifier;

@RestController
@RequestMapping("/Space")
public class SpaceIconController extends IconRestController<SpaceEntity, SpaceEntityType, EntitySubType, SpaceSectorOneModifier, SpaceSectorTwoModifier, AmplifierListItem> {

    public SpaceIconController() {
        super(SymbolSetEnum.SPACE);
    }

}
