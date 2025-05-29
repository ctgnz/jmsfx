package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.amplifier.TowedArrayType;
import io.github.ctgnz.jmsfx.icon.seasurface.SeaSurfaceEntity;
import io.github.ctgnz.jmsfx.icon.seasurface.SeaSurfaceEntitySubType;
import io.github.ctgnz.jmsfx.icon.seasurface.SeaSurfaceEntityType;
import io.github.ctgnz.jmsfx.icon.seasurface.SeaSurfaceSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.seasurface.SeaSurfaceSectorTwoModifier;

@RestController
@RequestMapping("/SeaSurface")
public class SeaSurfaceIconController extends IconRestController<SeaSurfaceEntity, SeaSurfaceEntityType, SeaSurfaceEntitySubType, SeaSurfaceSectorOneModifier, SeaSurfaceSectorTwoModifier, TowedArrayType> {

    public SeaSurfaceIconController() {
        super(SymbolSet.SEA_SURFACE);
    }

}
