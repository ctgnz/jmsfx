package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.minewarfare.MineWarfareEntity;
import io.github.ctgnz.jmsfx.icon.minewarfare.MineWarfareEntitySubType;
import io.github.ctgnz.jmsfx.icon.minewarfare.MineWarfareEntityType;

@RestController
@RequestMapping("/MineWarfare")
public class MineWarfareIconController extends IconRestController<MineWarfareEntity, MineWarfareEntityType, MineWarfareEntitySubType, ISectorOneModifier, ISectorTwoModifier, IListAmplifier> {

    public MineWarfareIconController() {
        super(SymbolSet.MINE_WARFARE);
    }

}
