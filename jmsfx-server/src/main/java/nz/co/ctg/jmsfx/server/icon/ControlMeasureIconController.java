package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.controlmeasure.ControlMeasureEntity;
import nz.co.ctg.jmsfx.model.controlmeasure.ControlMeasureEntitySubType;
import nz.co.ctg.jmsfx.model.controlmeasure.ControlMeasureEntityType;

@RestController
@RequestMapping("/ControlMeasure")
public class ControlMeasureIconController extends IconRestController<ControlMeasureEntity, ControlMeasureEntityType, ControlMeasureEntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public ControlMeasureIconController() {
        super(SymbolSet.SS_CONTROL_MEASURE);
    }

}
