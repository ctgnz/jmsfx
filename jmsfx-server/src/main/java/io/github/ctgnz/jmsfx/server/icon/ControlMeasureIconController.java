package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.controlmeasure.ControlMeasureEntity;
import io.github.ctgnz.jmsfx.standard.controlmeasure.ControlMeasureEntitySubType;
import io.github.ctgnz.jmsfx.standard.controlmeasure.ControlMeasureEntityType;
import io.github.ctgnz.jmsfx.standard.controlmeasure.ControlMeasureSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.controlmeasure.ControlMeasureSectorTwoModifier;

@RestController
@RequestMapping("/ControlMeasure")
public class ControlMeasureIconController extends IconRestController<ControlMeasureEntity, ControlMeasureEntityType, ControlMeasureEntitySubType, ControlMeasureSectorOneModifier, ControlMeasureSectorTwoModifier, AmplifierListItem> {

    public ControlMeasureIconController() {
        super(SymbolSetEnum.CONTROL_MEASURE);
    }

}
