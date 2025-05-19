package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.cyberspace.CyberspaceEntity;
import nz.co.ctg.jmsfx.model.cyberspace.CyberspaceEntityType;

@RestController
@RequestMapping("/Cyberspace")
public class CyberspaceIconController extends IconRestController<CyberspaceEntity, CyberspaceEntityType, EntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public CyberspaceIconController() {
        super(SymbolSet.SS_CYBERSPACE);
    }

}
