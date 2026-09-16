package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.common.CommonEntity;
import io.github.ctgnz.jmsfx.standard.common.CommonEntitySubType;
import io.github.ctgnz.jmsfx.standard.common.CommonEntityType;
import io.github.ctgnz.jmsfx.standard.common.CommonSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.common.CommonSectorTwoModifier;

@RestController
@RequestMapping("/Common")
public class CommonIconController extends IconRestController<CommonEntity, CommonEntityType, CommonEntitySubType, CommonSectorOneModifier, CommonSectorTwoModifier, AmplifierListItem> {

    public CommonIconController() {
        super(SymbolSetEnum.COMMON);
    }

}
