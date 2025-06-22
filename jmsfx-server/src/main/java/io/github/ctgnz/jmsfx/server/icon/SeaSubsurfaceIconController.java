package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.seasubsurface.SeaSubsurfaceEntity;
import io.github.ctgnz.jmsfx.icon.seasubsurface.SeaSubsurfaceEntitySubType;
import io.github.ctgnz.jmsfx.icon.seasubsurface.SeaSubsurfaceEntityType;
import io.github.ctgnz.jmsfx.icon.seasubsurface.SeaSubsurfaceSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.seasubsurface.SeaSubsurfaceSectorTwoModifier;

@RestController
@RequestMapping("/SeaSubsurface")
public class SeaSubsurfaceIconController extends IconRestController<SeaSubsurfaceEntity, SeaSubsurfaceEntityType, SeaSubsurfaceEntitySubType, SeaSubsurfaceSectorOneModifier, SeaSubsurfaceSectorTwoModifier, AmplifierListItem> {

    public SeaSubsurfaceIconController() {
        super(SymbolSetEnum.SEA_SUBSURFACE);
    }

}
