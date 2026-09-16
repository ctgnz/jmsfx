package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.cyberspacespace.CyberspaceSpaceEntity;
import io.github.ctgnz.jmsfx.standard.cyberspacespace.CyberspaceSpaceEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspacespace.CyberspaceSpaceSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspacespace.CyberspaceSpaceSectorTwoModifier;

@RestController
@RequestMapping("/CyberspaceSpace")
public class CyberspaceSpaceIconController extends IconRestController<CyberspaceSpaceEntity, CyberspaceSpaceEntityType, EntitySubType, CyberspaceSpaceSectorOneModifier, CyberspaceSpaceSectorTwoModifier, AmplifierListItem> {

    public CyberspaceSpaceIconController() {
        super(SymbolSetEnum.CYBERSPACE_SPACE);
    }

}
