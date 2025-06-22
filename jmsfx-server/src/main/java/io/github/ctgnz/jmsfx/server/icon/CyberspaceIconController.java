package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.cyberspace.CyberspaceEntity;
import io.github.ctgnz.jmsfx.icon.cyberspace.CyberspaceEntityType;

@RestController
@RequestMapping("/Cyberspace")
public class CyberspaceIconController extends IconRestController<CyberspaceEntity, CyberspaceEntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierListItem> {

    public CyberspaceIconController() {
        super(SymbolSetEnum.CYBERSPACE);
    }

}
