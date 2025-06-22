package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.minewarfare.MineWarfareEntity;
import io.github.ctgnz.jmsfx.icon.minewarfare.MineWarfareEntitySubType;
import io.github.ctgnz.jmsfx.icon.minewarfare.MineWarfareEntityType;

@RestController
@RequestMapping("/MineWarfare")
public class MineWarfareIconController extends IconRestController<MineWarfareEntity, MineWarfareEntityType, MineWarfareEntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierListItem> {

    public MineWarfareIconController() {
        super(SymbolSetEnum.MINE_WARFARE);
    }

}
