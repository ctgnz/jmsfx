package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.internal.InternalEntity;

@RestController
@RequestMapping("/Internal")
public class InternalIconController extends IconRestController<InternalEntity, EntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierListItem> {

    public InternalIconController() {
        super(SymbolSetEnum.INTERNAL);
    }

}
