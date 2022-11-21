package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.unknown.UnknownEntity;

@RestController
@RequestMapping("/Unknown")
public class UnknownIconController extends IconRestController<UnknownEntity, EntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public UnknownIconController() {
        super(SymbolSet.SS_AIR);
    }

}
