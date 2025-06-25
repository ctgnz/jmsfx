package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.common.CommonEntity;
import io.github.ctgnz.jmsfx.icon.common.CommonEntitySubType;
import io.github.ctgnz.jmsfx.icon.common.CommonEntityType;
import io.github.ctgnz.jmsfx.icon.common.CommonSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.common.CommonSectorTwoModifier;

@RestController
@RequestMapping("/Common")
public class CommonIconController extends IconRestController<CommonEntity, CommonEntityType, CommonEntitySubType, CommonSectorOneModifier, CommonSectorTwoModifier, AmplifierListItem> {

    public CommonIconController() {
        super(SymbolSetEnum.COMMON);
    }

}
