package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.internal.InternalEntity;

@RestController
@RequestMapping("/Internal")
public class InternalIconController extends IconRestController<InternalEntity, EntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public InternalIconController() {
        super(SymbolSet.SS_INTERNAL);
    }

}
