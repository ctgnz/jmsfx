package nz.co.ctg.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.minewarfare.MineWarfareEntity;
import nz.co.ctg.jmsfx.model.minewarfare.MineWarfareEntitySubType;
import nz.co.ctg.jmsfx.model.minewarfare.MineWarfareEntityType;

@RestController
@RequestMapping("/MineWarfare")
public class MineWarfareIconController extends IconRestController<MineWarfareEntity, MineWarfareEntityType, MineWarfareEntitySubType, SectorOneModifier, SectorTwoModifier, AmplifierGroup> {

    public MineWarfareIconController() {
        super(SymbolSet.SS_MINE_WARFARE);
    }

}
