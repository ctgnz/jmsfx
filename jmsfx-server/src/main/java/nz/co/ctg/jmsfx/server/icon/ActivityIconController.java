package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.activity.ActivityEntity;
import nz.co.ctg.jmsfx.model.activity.ActivityEntitySubType;
import nz.co.ctg.jmsfx.model.activity.ActivityEntityType;
import nz.co.ctg.jmsfx.model.activity.ActivitySectorOneModifier;

@RestController
@RequestMapping("/Activity")
public class ActivityIconController extends IconRestController<ActivityEntity, ActivityEntityType, ActivityEntitySubType, ActivitySectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public ActivityIconController() {
        super(SymbolSet.SS_ACTIVITY);
    }

}
