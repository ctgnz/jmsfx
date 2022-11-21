package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.atmospheric.AtmosphericEntity;
import nz.co.ctg.jmsfx.model.atmospheric.AtmosphericEntitySubType;
import nz.co.ctg.jmsfx.model.atmospheric.AtmosphericEntityType;

@RestController
@RequestMapping("/Atmospheric")
public class AtmosphericIconController extends IconRestController<AtmosphericEntity, AtmosphericEntityType, AtmosphericEntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public AtmosphericIconController() {
        super(SymbolSet.SS_ATMOSPHERIC);
    }

}
