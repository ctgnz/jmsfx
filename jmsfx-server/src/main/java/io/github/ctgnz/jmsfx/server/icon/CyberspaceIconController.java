package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.amplifier.UnitEchelon;
import io.github.ctgnz.jmsfx.standard.cyberspace.CyberspaceEntity;
import io.github.ctgnz.jmsfx.standard.cyberspace.CyberspaceEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspace.CyberspaceSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspace.CyberspaceSectorTwoModifier;

@RestController
@RequestMapping("/Cyberspace")
public class CyberspaceIconController extends IconRestController<CyberspaceEntity, CyberspaceEntityType, EntitySubType, CyberspaceSectorOneModifier, CyberspaceSectorTwoModifier, UnitEchelon> {

    public CyberspaceIconController() {
        super(SymbolSetEnum.CYBERSPACE);
    }

}
