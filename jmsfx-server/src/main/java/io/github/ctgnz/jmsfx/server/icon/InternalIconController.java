package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.internal.InternalEntity;

@RestController
@RequestMapping("/Internal")
public class InternalIconController extends IconRestController<InternalEntity, IEntityType, IEntitySubType, ISectorOneModifier, ISectorTwoModifier, IAmplifierListItem> {

    public InternalIconController() {
        super(SymbolSet.INTERNAL);
    }

}
