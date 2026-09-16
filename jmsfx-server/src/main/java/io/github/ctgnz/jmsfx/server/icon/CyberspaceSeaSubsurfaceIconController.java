package io.github.ctgnz.jmsfx.server.icon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;
import io.github.ctgnz.jmsfx.standard.cyberspaceseasubsurface.CyberspaceSeaSubsurfaceEntity;
import io.github.ctgnz.jmsfx.standard.cyberspaceseasubsurface.CyberspaceSeaSubsurfaceEntityType;
import io.github.ctgnz.jmsfx.standard.cyberspaceseasubsurface.CyberspaceSeaSubsurfaceSectorOneModifier;
import io.github.ctgnz.jmsfx.standard.cyberspaceseasubsurface.CyberspaceSeaSubsurfaceSectorTwoModifier;

@RestController
@RequestMapping("/CyberspaceSeaSubsurface")
public class CyberspaceSeaSubsurfaceIconController extends IconRestController<CyberspaceSeaSubsurfaceEntity, CyberspaceSeaSubsurfaceEntityType, EntitySubType, CyberspaceSeaSubsurfaceSectorOneModifier, CyberspaceSeaSubsurfaceSectorTwoModifier, AmplifierListItem> {

    public CyberspaceSeaSubsurfaceIconController() {
        super(SymbolSetEnum.CYBERSPACE_SEA_SUBSURFACE);
    }

}
