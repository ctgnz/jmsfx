package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.ListAmplifier;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.internal.InternalEntity;

@RestController
@RequestMapping("/Internal")
public class InternalIconController extends IconRestController<InternalEntity, EntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, ListAmplifier> {

    public InternalIconController() {
        super(SymbolSet.INTERNAL);
    }

}
