package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.ListAmplifier;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspace.CyberspaceEntity;
import io.github.ctgnz.jmsfx.icon.cyberspace.CyberspaceEntityType;

@RestController
@RequestMapping("/Cyberspace")
public class CyberspaceIconController extends IconRestController<CyberspaceEntity, CyberspaceEntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, ListAmplifier> {

    public CyberspaceIconController() {
        super(SymbolSet.CYBERSPACE);
    }

}
