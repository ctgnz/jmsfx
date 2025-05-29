package io.github.ctgnz.jmsfx.server.icon;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import nz.co.ctg.foxglove.FoxgloveParser;

import static java.util.stream.Collectors.toList;

import io.github.ctgnz.jmsfx.icon.Entity;
import io.github.ctgnz.jmsfx.icon.EntitySubType;
import io.github.ctgnz.jmsfx.icon.EntityType;
import io.github.ctgnz.jmsfx.icon.EnumeratedAmplifier;
import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;
import io.github.ctgnz.jmsfx.icon.SectorOneModifier;
import io.github.ctgnz.jmsfx.icon.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.dto.AmplifierGroupDto;
import io.github.ctgnz.jmsfx.icon.dto.EntityDto;
import io.github.ctgnz.jmsfx.icon.dto.EntitySubTypeDto;
import io.github.ctgnz.jmsfx.icon.dto.EntityTypeDto;
import io.github.ctgnz.jmsfx.icon.dto.SectorOneModifierDto;
import io.github.ctgnz.jmsfx.icon.dto.SectorTwoModifierDto;

public abstract class IconRestController<E extends Entity, T extends EntityType, S extends EntitySubType, M extends SectorOneModifier, N extends SectorTwoModifier, A extends EnumeratedAmplifier> {
    private SymbolSet symbolSet;
    private SymbolSetInfo symbolSetInfo;
    private FoxgloveParser parser = new FoxgloveParser();

    public IconRestController(SymbolSet symbolSet) {
        this.symbolSet = symbolSet;
        this.symbolSetInfo = symbolSet.getSymbolSetInfo();
    }

    @GetMapping("/modifier/one")
    public List<SectorOneModifierDto<M>> listSectorOneModifiers() {
        List<M> modifiers = symbolSetInfo.getSectorOneModifiers();
        return modifiers.stream().map(SectorOneModifierDto::new).collect(toList());
    }

    @GetMapping("/modifier/two")
    public List<SectorTwoModifierDto<N>> listSectorTwoModifiers() {
        List<N> modifiers = symbolSetInfo.getSectorTwoModifiers();
        return modifiers.stream().map(SectorTwoModifierDto::new).collect(toList());
    }

    @GetMapping("/amplifier")
    public List<AmplifierGroupDto<A>> listAmplifiers() {
        List<A> modifiers = symbolSetInfo.getAmplifiers();
        return modifiers.stream().map(AmplifierGroupDto::new).collect(toList());
    }

    @GetMapping("/entity/list")
    public List<EntityDto<E>> listEntities() {
        List<E> entities = symbolSetInfo.getEntities();
        return entities.stream().map(EntityDto::new).collect(toList());
    }

    @GetMapping("/entityType/{entity}/list")
    public List<EntityTypeDto<T>> listEntityTypes(@PathVariable E entity) {
        List<T> entityTypes = symbolSetInfo.getEntityTypes(entity);
        return entityTypes.stream().map(EntityTypeDto::new).collect(toList());
    }

    @GetMapping("/entitySubType/{entityType}/list")
    public List<EntitySubTypeDto<S>> listEntitySubTypes(@PathVariable T entityType) {
        List<S> entitySubTypes = symbolSetInfo.getEntitySubTypes(entityType);
        return entitySubTypes.stream().map(EntitySubTypeDto::new).collect(toList());
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
