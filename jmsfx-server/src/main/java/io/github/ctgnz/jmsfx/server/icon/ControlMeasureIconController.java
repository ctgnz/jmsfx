package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureEntity;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureEntitySubType;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureEntityType;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.controlmeasure.ControlMeasureSectorTwoModifier;

@RestController
@RequestMapping("/ControlMeasure")
public class ControlMeasureIconController extends IconRestController<ControlMeasureEntity, ControlMeasureEntityType, ControlMeasureEntitySubType, ControlMeasureSectorOneModifier, ControlMeasureSectorTwoModifier, IAmplifierListItem> {

    public ControlMeasureIconController() {
        super(SymbolSet.CONTROL_MEASURE);
    }

}
