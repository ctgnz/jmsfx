package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifier;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureEntity;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureEntitySubType;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureEntityType;

@RestController
@RequestMapping("/ControlMeasure")
public class ControlMeasureIconController extends IconRestController<ControlMeasureEntity, ControlMeasureEntityType, ControlMeasureEntitySubType, SectorOneModifier, SectorTwoModifier, EnumeratedAmplifier> {

    public ControlMeasureIconController() {
        super(SymbolSet.CONTROL_MEASURE);
    }

}
