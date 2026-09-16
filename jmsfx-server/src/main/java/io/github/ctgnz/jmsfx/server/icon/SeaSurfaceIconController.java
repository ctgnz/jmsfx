package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.amplifier.TowedArrayType;
import io.github.ctgnz.jmsfx.standard.seasurface.SeaSurfaceEntity;
import io.github.ctgnz.jmsfx.standard.seasurface.SeaSurfaceEntitySubType;
import io.github.ctgnz.jmsfx.standard.seasurface.SeaSurfaceEntityType;
import io.github.ctgnz.jmsfx.standard.seasurface.SeaSurfaceSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.seasurface.SeaSurfaceSectorTwoModifier;

@RestController
@RequestMapping("/SeaSurface")
public class SeaSurfaceIconController extends IconRestController<SeaSurfaceEntity, SeaSurfaceEntityType, SeaSurfaceEntitySubType, SeaSurfaceSectorOneModifier, SeaSurfaceSectorTwoModifier, TowedArrayType> {

    public SeaSurfaceIconController() {
        super(SymbolSetEnum.SEA_SURFACE);
    }

}
