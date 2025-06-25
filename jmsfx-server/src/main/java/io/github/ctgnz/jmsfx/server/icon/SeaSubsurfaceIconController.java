package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.seasubsurface.SeaSubsurfaceEntity;
import io.github.ctgnz.jmsfx.standard.seasubsurface.SeaSubsurfaceEntitySubType;
import io.github.ctgnz.jmsfx.standard.seasubsurface.SeaSubsurfaceEntityType;
import io.github.ctgnz.jmsfx.standard.seasubsurface.SeaSubsurfaceSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.seasubsurface.SeaSubsurfaceSectorTwoModifier;

@RestController
@RequestMapping("/SeaSubsurface")
public class SeaSubsurfaceIconController extends IconRestController<SeaSubsurfaceEntity, SeaSubsurfaceEntityType, SeaSubsurfaceEntitySubType, SeaSubsurfaceSectorOneModifier, SeaSubsurfaceSectorTwoModifier, AmplifierListItem> {

    public SeaSubsurfaceIconController() {
        super(SymbolSetEnum.SEA_SUBSURFACE);
    }

}
