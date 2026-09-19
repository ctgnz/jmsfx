package io.github.ctgnz.jmsfx.server.icon;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import nz.co.ctg.foxglove.FoxgloveParser;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;
import io.github.ctgnz.jmsfx.standard.StandardIconLibrary;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public abstract class IconRestController<E extends Entity, T extends EntityType, S extends EntitySubType, M extends SectorOneModifier, N extends SectorTwoModifier, A extends AmplifierListItem> {
    private final SymbolSetEnum symbolSet;
    private final FoxgloveParser parser = new FoxgloveParser();

    public IconRestController(SymbolSetEnum symbolSet) {
        this.symbolSet = symbolSet;
    }

    @GetMapping("/modifier/one")
    public List<CodeElementSummary> listSectorOneModifiers() {
        return symbolSet.getSectorOneModifiers()
            .stream()
            .map(CodeElementSummary::of)
            .toList();
    }

    @GetMapping("/modifier/two")
    public List<CodeElementSummary> listSectorTwoModifiers() {
        return symbolSet.getSectorTwoModifiers()
            .stream()
            .map(CodeElementSummary::of)
            .toList();
    }

    @GetMapping("/amplifier")
    public List<CodeElementSummary> listAmplifiers() {
        return symbolSet.getAmplifierList()
            .stream()
            .map(CodeElementSummary::of)
            .toList();
    }

    @GetMapping("/entity/list")
    public List<CodeElementSummary> listEntities() {
        return symbolSet.getEntities()
            .stream()
            .map(CodeElementSummary::of)
            .toList();
    }

    @GetMapping("/entityType/{entity}/list")
    public List<CodeElementSummary> listEntityTypes(@PathVariable E entity) {
        return entity.getEntityTypes()
            .stream()
            .map(CodeElementSummary::of)
            .toList();
    }

    @GetMapping("/entitySubType/{entityType}/list")
    public List<CodeElementSummary> listEntitySubTypes(@PathVariable T entityType) {
        return entityType.getEntitySubTypes()
            .stream()
            .map(CodeElementSummary::of)
            .toList();
    }

    @GetMapping("/symbol")
    public ResponseEntity<byte[]> generateFrameOnlySymbol(@RequestParam(required = false) M sectorOneMod,
                                                          @RequestParam(required = false) N sectorTwoMod,
                                                          @RequestParam(required = false) A amplifier) throws Exception {
        return renderSvg(buildSymbol(null, null, null, sectorOneMod, sectorTwoMod, amplifier));
    }

    @GetMapping("/symbol/modifier/one/{sectorOneMod}")
    public ResponseEntity<byte[]> generateModifierOneSymbol(@PathVariable M sectorOneMod) throws Exception {
        return renderSvg(buildSymbol(null, null, null, sectorOneMod, null, null));
    }

    @GetMapping("/symbol/modifier/two/{sectorTwoMod}")
    public ResponseEntity<byte[]> generateModifierTwoSymbol(@PathVariable N sectorTwoMod) throws Exception {
        return renderSvg(buildSymbol(null, null, null, null, sectorTwoMod, null));
    }

    @GetMapping("/symbol/entity/{entity}")
    public ResponseEntity<byte[]> generateEntitySymbol(@PathVariable E entity,
                                                       @RequestParam(required = false) M sectorOneMod,
                                                       @RequestParam(required = false) N sectorTwoMod,
                                                       @RequestParam(required = false) A amplifier) throws Exception {
        return renderSvg(buildSymbol(entity, null, null, sectorOneMod, sectorTwoMod, amplifier));
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/symbol/{entityType}/{entitySubType}")
    public ResponseEntity<byte[]> generateEntitySubTypeSymbol(@PathVariable T entityType,
                                                              @PathVariable S entitySubType,
                                                              @RequestParam(required = false) M sectorOneMod,
                                                              @RequestParam(required = false) N sectorTwoMod,
                                                              @RequestParam(required = false) A amplifier) throws Exception {
        return renderSvg(buildSymbol((E) entityType.getEntity(), entityType, entitySubType, sectorOneMod, sectorTwoMod, amplifier));
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/symbol/{entityType}")
    public ResponseEntity<byte[]> generateSymbol(@PathVariable T entityType,
                                                 @RequestParam(required = false) M sectorOneMod,
                                                 @RequestParam(required = false) N sectorTwoMod,
                                                 @RequestParam(required = false) A amplifier) throws Exception {
        return renderSvg(buildSymbol((E) entityType.getEntity(), entityType, null, sectorOneMod, sectorTwoMod, amplifier));
    }

    private IdentificationSymbol buildSymbol(E entity, T entityType, S entitySubType, M sectorOneMod, N sectorTwoMod, A amplifier) {
        IdentificationSymbol symbol = new IdentificationSymbol(StandardIconLibrary.instance());
        symbol.symbolSetProperty()
            .set(symbolSet);
        symbol.entityProperty()
            .set(entity);
        symbol.entityTypeProperty()
            .set(entityType);
        symbol.entitySubTypeProperty()
            .set(entitySubType);
        if (sectorOneMod != null) {
            symbol.sectorOneModifierProperty()
                .set(sectorOneMod);
        }
        if (sectorTwoMod != null) {
            symbol.sectorTwoModifierProperty()
                .set(sectorTwoMod);
        }
        if (amplifier != null) {
            symbol.amplifierProperty()
                .set(amplifier);
        }
        return symbol;
    }

    private ResponseEntity<byte[]> renderSvg(IdentificationSymbol symbol) throws Exception {
        String svg = parser.write(symbol.getCombinedGraphic(), false);
        return ResponseEntity.ok()
            .contentType(MediaType.valueOf("image/svg+xml"))
            .body(svg.getBytes(StandardCharsets.UTF_8));
    }

}
