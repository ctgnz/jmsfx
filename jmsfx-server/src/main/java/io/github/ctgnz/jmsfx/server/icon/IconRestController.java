package io.github.ctgnz.jmsfx.server.icon;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.transform.Scale;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.SvgGraphic;

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
                                                          @RequestParam(required = false) A amplifier,
                                                          @RequestParam(required = false) Integer pngWidth) throws Exception {
        return render(buildSymbol(null, null, null, sectorOneMod, sectorTwoMod, amplifier), pngWidth);
    }

    @GetMapping("/symbol/modifier/one/{sectorOneMod}")
    public ResponseEntity<byte[]> generateModifierOneSymbol(@PathVariable M sectorOneMod, @RequestParam(required = false) Integer pngWidth) throws Exception {
        return render(buildSymbol(null, null, null, sectorOneMod, null, null), pngWidth);
    }

    @GetMapping("/symbol/modifier/two/{sectorTwoMod}")
    public ResponseEntity<byte[]> generateModifierTwoSymbol(@PathVariable N sectorTwoMod, @RequestParam(required = false) Integer pngWidth) throws Exception {
        return render(buildSymbol(null, null, null, null, sectorTwoMod, null), pngWidth);
    }

    @GetMapping("/symbol/entity/{entity}")
    public ResponseEntity<byte[]> generateEntitySymbol(@PathVariable E entity,
                                                       @RequestParam(required = false) M sectorOneMod,
                                                       @RequestParam(required = false) N sectorTwoMod,
                                                       @RequestParam(required = false) A amplifier,
                                                       @RequestParam(required = false) Integer pngWidth) throws Exception {
        return render(buildSymbol(entity, null, null, sectorOneMod, sectorTwoMod, amplifier), pngWidth);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/symbol/{entityType}/{entitySubType}")
    public ResponseEntity<byte[]> generateEntitySubTypeSymbol(@PathVariable T entityType,
                                                              @PathVariable S entitySubType,
                                                              @RequestParam(required = false) M sectorOneMod,
                                                              @RequestParam(required = false) N sectorTwoMod,
                                                              @RequestParam(required = false) A amplifier,
                                                              @RequestParam(required = false) Integer pngWidth) throws Exception {
        return render(buildSymbol((E) entityType.getEntity(), entityType, entitySubType, sectorOneMod, sectorTwoMod, amplifier), pngWidth);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/symbol/{entityType}")
    public ResponseEntity<byte[]> generateSymbol(@PathVariable T entityType,
                                                 @RequestParam(required = false) M sectorOneMod,
                                                 @RequestParam(required = false) N sectorTwoMod,
                                                 @RequestParam(required = false) A amplifier,
                                                 @RequestParam(required = false) Integer pngWidth) throws Exception {
        return render(buildSymbol((E) entityType.getEntity(), entityType, null, sectorOneMod, sectorTwoMod, amplifier), pngWidth);
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

    private ResponseEntity<byte[]> render(IdentificationSymbol symbol, Integer pngWidth) throws Exception {
        if (pngWidth != null) {
            return renderPng(symbol, pngWidth);
        }
        return renderSvg(symbol);
    }

    private ResponseEntity<byte[]> renderSvg(IdentificationSymbol symbol) throws Exception {
        String svg = parser.write(symbol.getCombinedGraphic(), false);
        return ResponseEntity.ok()
            .contentType(MediaType.valueOf("image/svg+xml"))
            .body(svg.getBytes(StandardCharsets.UTF_8));
    }

    private ResponseEntity<byte[]> renderPng(IdentificationSymbol symbol, int targetWidth) throws Exception {
        SvgGraphic graphic = symbol.getCombinedGraphic();
        double scale = targetWidth / graphic.getPixelsWidth();
        SnapshotParameters params = new SnapshotParameters();
        params.setTransform(new Scale(scale, scale));
        params.setFill(Color.TRANSPARENT);

        CompletableFuture<WritableImage> snapshot = new CompletableFuture<>();
        Platform.runLater(() -> {
            try {
                Group group = graphic.createGroup();
                snapshot.complete(group.snapshot(params, null));
            } catch (Exception e) {
                snapshot.completeExceptionally(e);
            }
        });
        WritableImage image = snapshot.get(10, TimeUnit.SECONDS);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", out);
        return ResponseEntity.ok()
            .contentType(MediaType.IMAGE_PNG)
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"icon.png\"")
            .body(out.toByteArray());
    }

}
