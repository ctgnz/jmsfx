package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.unknown.UnknownEntity;

@RestController
@RequestMapping("/Unknown")
public class UnknownIconController extends IconRestController<UnknownEntity, IEntityType, IEntitySubType, ISectorOneModifier, ISectorTwoModifier, IListAmplifier> {

    public UnknownIconController() {
        super(SymbolSet.AIR);
    }

}
