package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.minewarfare.MineWarfareEntity;
import io.github.ctgnz.jmsfx.standard.minewarfare.MineWarfareEntitySubType;
import io.github.ctgnz.jmsfx.standard.minewarfare.MineWarfareEntityType;
import io.github.ctgnz.jmsfx.standard.minewarfare.MineWarfareSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.minewarfare.MineWarfareSectorTwoModifier;

@RestController
@RequestMapping("/MineWarfare")
public class MineWarfareIconController extends IconRestController<MineWarfareEntity, MineWarfareEntityType, MineWarfareEntitySubType, MineWarfareSectorOneModifier, MineWarfareSectorTwoModifier, AmplifierListItem> {

    public MineWarfareIconController() {
        super(SymbolSetEnum.MINE_WARFARE);
    }

}
