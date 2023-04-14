package nz.co.ctg.jmsfx.server.icon;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import nz.co.ctg.jmsfx.icon.IdentificationSymbol;
import nz.co.ctg.jmsfx.icon.parser.SvgParser;
import nz.co.ctg.jmsfx.model.AmplifierGroup;
import nz.co.ctg.jmsfx.model.Entity;
import nz.co.ctg.jmsfx.model.EntitySubType;
import nz.co.ctg.jmsfx.model.EntityType;
import nz.co.ctg.jmsfx.model.SectorOneModifier;
import nz.co.ctg.jmsfx.model.SectorTwoModifier;
import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.model.SymbolSetInfo;
import nz.co.ctg.jmsfx.server.model.AmplifierData;
import nz.co.ctg.jmsfx.server.model.EntityData;
import nz.co.ctg.jmsfx.server.model.EntitySubTypeData;
import nz.co.ctg.jmsfx.server.model.EntityTypeData;
import nz.co.ctg.jmsfx.server.model.SectorOneModifierData;
import nz.co.ctg.jmsfx.server.model.SectorTwoModifierData;

import static java.util.stream.Collectors.toList;

public abstract class IconRestController<E extends Entity, T extends EntityType, S extends EntitySubType, M extends SectorOneModifier, N extends SectorTwoModifier, A extends AmplifierGroup> {
    private SymbolSet symbolSet;
    private SymbolSetInfo symbolSetInfo;
    private SvgParser parser = new SvgParser();

    public IconRestController(SymbolSet symbolSet) {
        this.symbolSet = symbolSet;
        this.symbolSetInfo = symbolSet.getSymbolSetInfo();
    }

    @GetMapping("/modifier/one")
    public List<SectorOneModifierData<M>> listSectorOneModifiers() {
        List<M> modifiers = symbolSetInfo.getSectorOneModifiers();
        return modifiers.stream().map(SectorOneModifierData::new).collect(toList());
    }

    @GetMapping("/modifier/two")
    public List<SectorTwoModifierData<N>> listSectorTwoModifiers() {
        List<N> modifiers = symbolSetInfo.getSectorTwoModifiers();
        return modifiers.stream().map(SectorTwoModifierData::new).collect(toList());
    }

    @GetMapping("/amplifier")
    public List<AmplifierData<A>> listAmplifiers() {
        List<A> modifiers = symbolSetInfo.getAmplifiers();
        return modifiers.stream().map(AmplifierData::new).collect(toList());
    }

    @GetMapping("/entity/list")
    public List<EntityData<E>> listEntities() {
        List<E> entities = symbolSetInfo.getEntities();
        return entities.stream().map(EntityData::new).collect(toList());
    }

    @GetMapping("/entityType/{entity}/list")
    public List<EntityTypeData<T>> listEntityTypes(@PathVariable E entity) {
        List<T> entityTypes = symbolSetInfo.getEntityTypes(entity);
        return entityTypes.stream().map(EntityTypeData::new).collect(toList());
    }

    @GetMapping("/entitySubType/{entityType}/list")
    public List<EntitySubTypeData<S>> listEntitySubTypes(@PathVariable T entityType) {
        List<S> entitySubTypes = symbolSetInfo.getEntitySubTypes(entityType);
        return entitySubTypes.stream().map(EntitySubTypeData::new).collect(toList());
    }

    @GetMapping(value = "/symbol/modifier/one/{sectorOneMod}", produces = "image/svg+xml")
    public String generateModifierOneSymbol(@PathVariable M sectorOneMod) {
        return createGraphic(null, null, null, sectorOneMod, null, null);
    }

    @GetMapping(value = "/symbol/modifier/two/{sectorTwoMod}", produces = "image/svg+xml")
    public String generateModifierTwoSymbol(@PathVariable N sectorTwoMod) {
        return createGraphic(null, null, null, null, sectorTwoMod, null);
    }

    @GetMapping(value = "/symbol/entity/{entity}", produces = "image/svg+xml")
    public String generateEntitySymbol(@PathVariable E entity,
                                       @RequestParam(required = false) M sectorOneMod,
                                       @RequestParam(required = false) N sectorTwoMod,
                                       @RequestParam(required = false) A amplifier) {
        return createGraphic(entity, null, null, sectorOneMod, sectorTwoMod, amplifier);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/symbol/{entityType}/{entitySubType}", produces = "image/svg+xml")
    public String generateEntitySubTypeSymbol(@PathVariable T entityType,
                                              @PathVariable S entitySubType,
                                              @RequestParam(required = false) M sectorOneMod,
                                              @RequestParam(required = false) N sectorTwoMod,
                                              @RequestParam(required = false) A amplifier) {
        return createGraphic((E) entityType.getEntity(), entityType, entitySubType, sectorOneMod, sectorTwoMod, amplifier);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/symbol/{entityType}", produces = "image/svg+xml")
    public String generateSymbol(@PathVariable T entityType,
                                 @RequestParam(required = false) M sectorOneMod,
                                 @RequestParam(required = false) N sectorTwoMod,
                                 @RequestParam(required = false) A amplifier) {
        return createGraphic((E) entityType.getEntity(), entityType, null, sectorOneMod, sectorTwoMod, amplifier);
    }

    private String createGraphic(E entity, T entityType, S entitySubType, M sectorOneMod, N sectorTwoMod, A amplifier) {
        IdentificationSymbol symbol = new IdentificationSymbol();
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
        return parser.writeGraphic(symbol.getCombinedGraphic());
    }

}
