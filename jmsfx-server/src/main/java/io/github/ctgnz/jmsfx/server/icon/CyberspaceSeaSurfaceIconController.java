package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.cyberspaceseasurface.CyberspaceSeaSurfaceEntity;
import io.github.ctgnz.jmsfx.standard.cyberspaceseasurface.CyberspaceSeaSurfaceEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspaceseasurface.CyberspaceSeaSurfaceSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspaceseasurface.CyberspaceSeaSurfaceSectorTwoModifier;

@RestController
@RequestMapping("/CyberspaceSeaSurface")
public class CyberspaceSeaSurfaceIconController extends IconRestController<CyberspaceSeaSurfaceEntity, CyberspaceSeaSurfaceEntityType, EntitySubType, CyberspaceSeaSurfaceSectorOneModifier, CyberspaceSeaSurfaceSectorTwoModifier, AmplifierListItem> {

    public CyberspaceSeaSurfaceIconController() {
        super(SymbolSetEnum.CYBERSPACE_SEA_SURFACE);
    }

}
