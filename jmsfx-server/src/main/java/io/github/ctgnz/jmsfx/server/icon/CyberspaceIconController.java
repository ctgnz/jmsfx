package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.cyberspace.CyberspaceEntity;
import io.github.ctgnz.jmsfx.icon.cyberspace.CyberspaceEntityType;

@RestController
@RequestMapping("/Cyberspace")
public class CyberspaceIconController extends IconRestController<CyberspaceEntity, CyberspaceEntityType, IEntitySubType, ISectorOneModifier, ISectorTwoModifier, IListAmplifier> {

    public CyberspaceIconController() {
        super(SymbolSet.CYBERSPACE);
    }

}
