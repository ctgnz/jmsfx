package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.ListAmplifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.space.SpaceEntity;
import io.github.ctgnz.jmsfx.icon.space.SpaceEntityType;
import io.github.ctgnz.jmsfx.icon.space.SpaceSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.space.SpaceSectorTwoModifier;

@RestController
@RequestMapping("/Space")
public class SpaceIconController extends IconRestController<SpaceEntity, SpaceEntityType, EntitySubType, SpaceSectorOneModifier, SpaceSectorTwoModifier, ListAmplifier> {

    public SpaceIconController() {
        super(SymbolSet.SPACE);
    }

}
