package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.activity.ActivityEntity;
import io.github.ctgnz.jmsfx.standard.activity.ActivityEntitySubType;
import io.github.ctgnz.jmsfx.standard.activity.ActivityEntityType;
import io.github.ctgnz.jmsfx.standard.activity.ActivitySectorOneModifier;

@RestController
@RequestMapping("/Activity")
public class ActivityIconController extends IconRestController<ActivityEntity, ActivityEntityType, ActivityEntitySubType, ActivitySectorOneModifier, SectorTwoModifier, AmplifierListItem> {

    public ActivityIconController() {
        super(SymbolSetEnum.ACTIVITY);
    }

}
