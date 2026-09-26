package io.github.ctgnz.jmsfx.server.icon;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.foxglove.FoxgloveParser;

import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.IdentificationSymbol;

/**
 * The icon API, for whichever symbology library is on the classpath.
 * <p>
 * This used to be an abstract class with six type parameters and twenty-three subclasses, one per symbol set, each binding those parameters to one set's generated enums and fixing
 * its own URL prefix. That shape existed for a single reason: Spring converts a {@code @PathVariable} of an enum type through {@code Enum.valueOf}, so a handler had to name a
 * concrete enum to accept one. The symbol set moves into the path and {@link SymbologyArgumentResolver} does the resolving, so the handlers can take jmsfx-core's interfaces and no
 * generated type is named anywhere in this module.
 * <p>
 * The URLs are unchanged. The prefix each subclass declared was {@link SymbolSetSummary#pathFor} applied to its set, which is now simply matched rather than hard-coded, and path
 * segments are still the Java enum constant names {@link CodeElementSummary} publishes.
 * <p>
 * See jmsfx#93, and jmsfx#76 for the same move made in jmsfx-creator.
 */
@RestController
@RequestMapping("/{" + SymbologyArgumentResolver.SYMBOL_SET + "}")
public class IconRestController {

    private final FoxgloveParser parser = new FoxgloveParser();

    @GetMapping("/modifier/one")
    public List<CodeElementSummary> listSectorOneModifiers(SymbolSet symbolSet) {
        return summarise(symbolSet.getSectorOneModifiers());
    }

    @GetMapping("/modifier/two")
    public List<CodeElementSummary> listSectorTwoModifiers(SymbolSet symbolSet) {
        return summarise(symbolSet.getSectorTwoModifiers());
    }

    @GetMapping("/amplifier")
    public List<CodeElementSummary> listAmplifiers(SymbolSet symbolSet) {
        return summarise(symbolSet.getAmplifierList());
    }

    @GetMapping("/entity/list")
    public List<CodeElementSummary> listEntities(SymbolSet symbolSet) {
        return summarise(symbolSet.getEntities());
    }

    @GetMapping("/entityType/{entity}/list")
    public List<CodeElementSummary> listEntityTypes(Entity entity) {
        return summarise(entity.getEntityTypes());
    }

    @GetMapping("/entitySubType/{entityType}/list")
    public List<CodeElementSummary> listEntitySubTypes(EntityType entityType) {
        return summarise(entityType.getEntitySubTypes());
    }

    @GetMapping("/symbol")
    public ResponseEntity<byte[]> generateFrameOnlySymbol(SymbolSet symbolSet, SectorOneModifier sectorOneMod, SectorTwoModifier sectorTwoMod, AmplifierListItem amplifier,
                                                          @RequestParam(defaultValue = "false") boolean trim) throws Exception {
        return renderSvg(buildSymbol(symbolSet, null, null, null, sectorOneMod, sectorTwoMod, amplifier), trim);
    }

    @GetMapping("/symbol/modifier/one/{sectorOneMod}")
    public ResponseEntity<byte[]> generateModifierOneSymbol(SymbolSet symbolSet, SectorOneModifier sectorOneMod,
                                                            @RequestParam(defaultValue = "false") boolean trim) throws Exception {
        return renderSvg(buildSymbol(symbolSet, null, null, null, sectorOneMod, null, null), trim);
    }

    @GetMapping("/symbol/modifier/two/{sectorTwoMod}")
    public ResponseEntity<byte[]> generateModifierTwoSymbol(SymbolSet symbolSet, SectorTwoModifier sectorTwoMod,
                                                            @RequestParam(defaultValue = "false") boolean trim) throws Exception {
        return renderSvg(buildSymbol(symbolSet, null, null, null, null, sectorTwoMod, null), trim);
    }

    @GetMapping("/symbol/entity/{entity}")
    public ResponseEntity<byte[]> generateEntitySymbol(SymbolSet symbolSet, Entity entity, SectorOneModifier sectorOneMod, SectorTwoModifier sectorTwoMod,
                                                       AmplifierListItem amplifier, @RequestParam(defaultValue = "false") boolean trim) throws Exception {
        return renderSvg(buildSymbol(symbolSet, entity, null, null, sectorOneMod, sectorTwoMod, amplifier), trim);
    }

    @GetMapping("/symbol/{entityType}/{entitySubType}")
    public ResponseEntity<byte[]> generateEntitySubTypeSymbol(SymbolSet symbolSet, EntityType entityType, EntitySubType entitySubType, SectorOneModifier sectorOneMod,
                                                              SectorTwoModifier sectorTwoMod, AmplifierListItem amplifier,
                                                              @RequestParam(defaultValue = "false") boolean trim) throws Exception {
        return renderSvg(buildSymbol(symbolSet, entityType.getEntity(), entityType, entitySubType, sectorOneMod, sectorTwoMod, amplifier), trim);
    }

    @GetMapping("/symbol/{entityType}")
    public ResponseEntity<byte[]> generateSymbol(SymbolSet symbolSet, EntityType entityType, SectorOneModifier sectorOneMod, SectorTwoModifier sectorTwoMod,
                                                 AmplifierListItem amplifier, @RequestParam(defaultValue = "false") boolean trim) throws Exception {
        return renderSvg(buildSymbol(symbolSet, entityType.getEntity(), entityType, null, sectorOneMod, sectorTwoMod, amplifier), trim);
    }

    private static List<CodeElementSummary> summarise(List<? extends io.github.ctgnz.jmsfx.CodeElement> elements) {
        return elements.stream()
            .map(CodeElementSummary::of)
            .toList();
    }

    private IdentificationSymbol buildSymbol(SymbolSet symbolSet, Entity entity, EntityType entityType, EntitySubType entitySubType, SectorOneModifier sectorOneMod,
                                             SectorTwoModifier sectorTwoMod, AmplifierListItem amplifier) {
        IdentificationSymbol symbol = new IdentificationSymbol(IconLibrary.discover());
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

    /**
     * {@code trim} crops the viewBox to what the symbol draws, plus a little padding. Off by default, so an existing caller keeps the shared 612 x 792 canvas and two symbols still
     * line up with each other; on, the symbol fills the space it is given, which is what a thumbnail or a standalone file wants. See jmsfx#45.
     */
    private ResponseEntity<byte[]> renderSvg(IdentificationSymbol symbol, boolean trim) throws Exception {
        String svg = parser.write(symbol.getCombinedGraphic(trim), false);
        return ResponseEntity.ok()
            .contentType(MediaType.valueOf("image/svg+xml"))
            .body(svg.getBytes(StandardCharsets.UTF_8));
    }

}
