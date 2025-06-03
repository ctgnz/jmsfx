package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.ListAmplifier;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.unknown.UnknownEntity;

@RestController
@RequestMapping("/Unknown")
public class UnknownIconController extends IconRestController<UnknownEntity, EntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, ListAmplifier> {

    public UnknownIconController() {
        super(SymbolSet.AIR);
    }

}
