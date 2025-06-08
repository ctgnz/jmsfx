package io.github.ctgnz.jmsfx.server.icon;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import nz.co.ctg.foxglove.FoxgloveParser;

import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.model.AmplifierListItemAdapter;
import io.github.ctgnz.jmsfx.icon.model.SymbolSetAdapter;

public abstract class IconRestController<E extends IEntity, T extends IEntityType, S extends IEntitySubType, M extends ISectorOneModifier, N extends ISectorTwoModifier, A extends IAmplifierListItem> {
    private SymbolSet symbolSet;
    private FoxgloveParser parser = new FoxgloveParser();
    private SymbolSetAdapter dto;

    public IconRestController(SymbolSet symbolSet) {
        this.symbolSet = symbolSet;
        this.dto = new SymbolSetAdapter(symbolSet);
    }

    @GetMapping("/modifier/one")
    public List<ISectorOneModifier> listSectorOneModifiers() {
        return dto.getSectorOneModifiers();
    }

    @GetMapping("/modifier/two")
    public List<ISectorTwoModifier> listSectorTwoModifiers() {
        return dto.getSectorTwoModifiers();
    }

    @GetMapping("/amplifier")
    public List<AmplifierListItemAdapter<A>> listAmplifiers() {
        return Collections.emptyList();
    }

    @GetMapping("/entity/list")
    public List<IEntity> listEntities() {
        return dto.getEntities();
    }

    @GetMapping(value = "/symbol/modifier/one/{sectorOneMod}", produces = "image/svg+xml")
    public String generateModifierOneSymbol(@PathVariable M sectorOneMod) throws Exception {
        return createGraphic(null, null, null, sectorOneMod, null, null);
    }

    @GetMapping(value = "/symbol/modifier/two/{sectorTwoMod}", produces = "image/svg+xml")
    public String generateModifierTwoSymbol(@PathVariable N sectorTwoMod) throws Exception {
        return createGraphic(null, null, null, null, sectorTwoMod, null);
    }

    @GetMapping(value = "/symbol/entity/{entity}", produces = "image/svg+xml")
    public String generateEntitySymbol(@PathVariable E entity,
                                       @RequestParam(required = false) M sectorOneMod,
                                       @RequestParam(required = false) N sectorTwoMod,
                                       @RequestParam(required = false) A amplifier) throws Exception {
        return createGraphic(entity, null, null, sectorOneMod, sectorTwoMod, amplifier);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/symbol/{entityType}/{entitySubType}", produces = "image/svg+xml")
    public String generateEntitySubTypeSymbol(@PathVariable T entityType,
                                              @PathVariable S entitySubType,
                                              @RequestParam(required = false) M sectorOneMod,
                                              @RequestParam(required = false) N sectorTwoMod,
                                              @RequestParam(required = false) A amplifier) throws Exception {
        return createGraphic((E) entityType.getEntity(), entityType, entitySubType, sectorOneMod, sectorTwoMod, amplifier);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/symbol/{entityType}", produces = "image/svg+xml")
    public String generateSymbol(@PathVariable T entityType,
                                 @RequestParam(required = false) M sectorOneMod,
                                 @RequestParam(required = false) N sectorTwoMod,
                                 @RequestParam(required = false) A amplifier) throws Exception {
        return createGraphic((E) entityType.getEntity(), entityType, null, sectorOneMod, sectorTwoMod, amplifier);
    }

    private String createGraphic(E entity, T entityType, S entitySubType, M sectorOneMod, N sectorTwoMod, A amplifier) throws Exception {
        IdentificationSymbol symbol = new IdentificationSymbol(parser);
        symbol.symbolSetProperty().set(symbolSet);
        symbol.entityProperty().set(entity);
        symbol.entityTypeProperty().set(entityType);
        symbol.entitySubTypeProperty().set(entitySubType);
        if (sectorOneMod != null) {
            symbol.sectorOneModifierProperty().set(sectorOneMod);
        }
        if (sectorTwoMod != null) {
            symbol.sectorTwoModifierProperty().set(sectorTwoMod);
        }
        if (amplifier != null) {
            symbol.amplifierProperty().set(amplifier);
        }
        return parser.write(symbol.getCombinedGraphic(), false);
    }

}
