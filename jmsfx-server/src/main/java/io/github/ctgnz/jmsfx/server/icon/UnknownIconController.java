package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.unknown.UnknownEntity;

@RestController
@RequestMapping("/Unknown")
public class UnknownIconController extends IconRestController<UnknownEntity, EntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierListItem> {

    public UnknownIconController() {
        super(SymbolSetEnum.AIR);
    }

}
