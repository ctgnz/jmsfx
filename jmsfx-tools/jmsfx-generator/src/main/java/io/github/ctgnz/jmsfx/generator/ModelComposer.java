package io.github.ctgnz.jmsfx.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import io.github.ctgnz.jmsfx.generator.model.AbstractModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierGuideModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierListModel;
import io.github.ctgnz.jmsfx.generator.model.EntityModel;
import io.github.ctgnz.jmsfx.generator.model.EntityTypeModel;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SectorOneModifierModel;
import io.github.ctgnz.jmsfx.generator.model.SectorTwoModifierModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;

/**
 * Builds one library model from a base model plus an extension overlay.
 * <p>
 * This is what jmsfx#81 exists for and jmsfx#137 completed. {@code model.yml} for the historical extension was a 4,700-line file of which all but a few hundred entries were a
 * verbatim copy of the standard one - a lot of duplication to maintain by hand and an invitation for the two to drift. An overlay carries only what the extension adds, and
 * composition puts the two together at generation time, so the output is still a single library, which is what {@link io.github.ctgnz.jmsfx.IconLibrary} discovery requires
 * (jmsfx#76).
 * <h2>What an overlay may say</h2> Three things, and they were chosen by measuring what jmsfx-historical actually needs rather than by guessing at what an extension might want:
 * <ul>
 * <li><b>add</b> an element the base does not have - 323 of them, which is nearly all of it</li>
 * <li><b>add at a position</b>, through {@link AbstractModel#getBefore()} - 3 of the 11 differing lists interleave rather than append, and constant order carries meaning</li>
 * <li><b>fill a field the base left unset</b> - 2 cases, both {@code amplifierTwoClass}</li>
 * </ul>
 * It may not <b>alter</b> or <b>remove</b>, and both are refused rather than ignored. Neither is needed - across 3,309 base elements jmsfx-historical alters none and removes none
 * - so supporting them would mean shipping operations nothing exercises, which also means nothing verifies them. A real need can add them later.
 * <p>
 * Filling an unset field is not an alteration, which is the distinction worth being careful about: the base leaving {@code amplifierTwoClass} null says it has no second amplifier,
 * not that it has none and no extension may give it one. Overwriting a value the base <em>did</em> set would change what a shared element means, and is refused.
 * <h2>Why a frame amplifier is the interesting case</h2> Adding elements <em>inside</em> a symbol set is easy - an entity, a modifier, an amplifier value all just join a list.
 * Adding a frame amplifier is not, because it changes the symbol set itself: {@code getFrameAmplifiers()} on the generated {@code SymbolSet} returns the values of whatever class
 * {@code frameAmplifierClass} names, so a new frame amplifier means an existing symbol set now has a property it did not have.
 * <p>
 * That relationship is already stated from the other end: an amplifier group declares {@code frameAmplifier: true} and the {@code symbolSets} it applies to. The symbol set's
 * {@code frameAmplifierClass} is the same fact written twice, so composition derives it rather than asking an overlay to repeat it - which is why an overlay that adds a frame
 * amplifier group <em>must</em> name its {@code symbolSets}, or the amplifier is generated and nothing offers it.
 * <p>
 * The same trick does not work for the other amplifier slots, and that is worth knowing before anyone tries. A group's {@code symbolSets} feeds
 * {@code AmplifierListEnum.getSymbolSets()}, which is a different fact: jmsfx-standard's {@code EQUIP_MOBILITY} already names Land Unit, Land Equipment and Land Installation
 * there, and none of those symbol sets has an {@code amplifierTwoClass}. Deriving one from the other would change the base library's output, not just the extension's. So
 * {@code amplifierTwoClass} is filled, and is the reason field-filling exists at all.
 */
public class ModelComposer {

    private final List<String> report = new ArrayList<>();

    /**
     * Applies the overlay onto the base, and returns the base.
     * <p>
     * Mutates rather than copies. The base is parsed for this composition and discarded after it, and the model's collections are live lists the parser filled - so copying would
     * mean a deep clone of four thousand elements to protect something nothing else holds a reference to.
     */
    public LibraryModel compose(LibraryModel base, LibraryModel overlay) {
        report.clear();
        addAll("status", base.getStatuses(), overlay.getStatuses());
        addAll("amplifier", base.getAmplifiers(), overlay.getAmplifiers());
        addAll("version", base.getVersions(), overlay.getVersions());
        addAll("context", base.getContexts(), overlay.getContexts());
        addAll("identity group", base.getIdentityGroups(), overlay.getIdentityGroups());
        addAll("identity", base.getIdentities(), overlay.getIdentities());
        addAll("hqtf/dummy", base.getHqtfDummies(), overlay.getHqtfDummies());
        addAll("dimension", base.getDimensions(), overlay.getDimensions());
        composeAmplifierGroups(base, overlay);
        composeSymbolSets(base, overlay);
        report.forEach(line -> System.out.format("  %s%n", line));
        System.out.format("Composed %d change%s onto the base%n", report.size(), report.size() == 1 ? "" : "s");
        return base;
    }

    /** An amplifier group the base does not have joins it; one it does gains the values the overlay adds to it. */
    private void composeAmplifierGroups(LibraryModel base, LibraryModel overlay) {
        for (AmplifierListModel group : overlay.getAmplifierGroups()) {
            AmplifierListModel existing = find(base.getAmplifierGroups(), group.getCode());
            if (existing == null) {
                insert(base.getAmplifierGroups(), group);
                report.add(String.format("added amplifier group %s (%s) with %d value%s", group.getCode(), group.getTypeName(), group.getValues().size(), group.getValues().size() == 1 ? "" : "s"));
                bindFrameAmplifier(base, group);
                continue;
            }
            addAll(String.format("value of amplifier group %s (%s)", existing.getCode(), existing.getTypeName()), existing.getValues(), group.getValues());
        }
    }

    /** A symbol set the base does not have joins it; one it does may gain children, and may have a field the base left unset filled in. */
    private void composeSymbolSets(LibraryModel base, LibraryModel overlay) {
        for (SymbolSetModel symbolSet : overlay.getSymbolSets()) {
            SymbolSetModel existing = find(base.getSymbolSets(), symbolSet.getCode());
            if (existing == null) {
                insert(base.getSymbolSets(), symbolSet);
                report.add(String.format("added symbol set %s (%s)", symbolSet.getCode(), symbolSet.getId()));
                continue;
            }
            String where = String.format("symbol set %s (%s)", existing.getCode(), existing.getId());
            fill(where, "amplifierTwoClass", existing.getAmplifierTwoClass(), symbolSet.getAmplifierTwoClass(), existing::setAmplifierTwoClass);
            fill(where, "amplifierThreeClass", existing.getAmplifierThreeClass(), symbolSet.getAmplifierThreeClass(), existing::setAmplifierThreeClass);
            addAmplifierGuides(where, existing, symbolSet);
            addAll(where + " sector one modifier", existing.getSectorOneMods(), symbolSet.getSectorOneMods());
            addAll(where + " sector two modifier", existing.getSectorTwoMods(), symbolSet.getSectorTwoMods());
            composeEntities(where, existing, symbolSet);
        }
    }

    /**
     * The amplifier guides a symbol set gains.
     * <p>
     * Handled separately because {@link AmplifierGuideModel} is not an {@link AbstractModel} - it is a placement hint rather than a symbology element, carrying a shape and the
     * points to draw it at - so it carries its own {@code before} rather than inheriting one. Nearly all of them append; exactly one does not, Dismounted's {@code R}.
     */
    private void addAmplifierGuides(String where, SymbolSetModel base, SymbolSetModel overlay) {
        for (AmplifierGuideModel guide : overlay.getAmplifierGuides()) {
            boolean present = base.getAmplifierGuides().stream().anyMatch(existing -> existing.getCode().equals(guide.getCode()));
            if (present) {
                throw new IllegalStateException(String.format("overlay amplifier guide %s already exists on %s - an overlay may add, position and fill, but not alter, " + "see jmsfx#137",
                    guide.getCode(), where));
            }
            String before = guide.getBefore();
            guide.setBefore(null);
            if (before == null) {
                base.getAmplifierGuides().add(guide);
            } else {
                AmplifierGuideModel anchor = base.getAmplifierGuides()
                    .stream()
                    .filter(candidate -> candidate.getCode().equals(before))
                    .findFirst()
                    .orElseThrow(
                        () -> new IllegalStateException(String.format("overlay amplifier guide %s asks to go before %s, which %s does not have - see jmsfx#137", guide.getCode(), before, where)));
                base.getAmplifierGuides().add(base.getAmplifierGuides().indexOf(anchor), guide);
            }
            report.add(String.format("added amplifier guide %s to %s%s", guide.getCode(), where, before == null ? "" : " before " + before));
        }
    }

    /** Entities, and within an entity the types and subtypes, each added where the overlay says and nowhere else. */
    private void composeEntities(String where, SymbolSetModel base, SymbolSetModel overlay) {
        for (EntityModel entity : overlay.getEntities()) {
            EntityModel existing = find(base.getEntities(), entity.getCode());
            if (existing == null) {
                insert(base.getEntities(), entity);
                entity.setSymbolSet(base);
                report.add(String.format("added entity %s (%s) to %s", entity.getCode(), entity.getLabel(), where));
                continue;
            }
            for (EntityTypeModel type : entity.getEntityTypes()) {
                EntityTypeModel existingType = find(existing.getEntityTypes(), type.getCode());
                if (existingType == null) {
                    insert(existing.getEntityTypes(), type);
                    type.setEntity(existing);
                    report.add(String.format("added entity type %s/%s (%s) to %s", existing.getCode(), type.getCode(), type.getLabel(), where));
                    continue;
                }
                addAll(String.format("%s entity subtype under %s/%s", where, existing.getCode(), existingType.getCode()), existingType.getEntitySubTypes(), type.getEntitySubTypes());
            }
        }
    }

    /**
     * Adds every element of {@code additions} that the base list does not already have, at the position each names.
     * <p>
     * An element the base already has is refused rather than skipped. An overlay restating a base element either means it is trying to change it, which is not allowed, or it is
     * duplication that will drift - and neither should pass quietly.
     */
    private <T extends AbstractModel> void addAll(String what, List<T> base, List<T> additions) {
        for (T addition : additions) {
            T existing = find(base, addition);
            if (existing != null) {
                throw new IllegalStateException(String.format("overlay %s %s (%s) already exists in the base - an overlay may add, position and fill, but not alter, see jmsfx#137", what,
                    addition.getCode(), addition.getLabel()));
            }
            String before = addition.getBefore();
            insert(base, addition);
            report.add(String.format("added %s %s (%s)%s", what, addition.getCode(), addition.getLabel(), before == null ? "" : " before " + before));
        }
    }

    /**
     * Puts the addition where it says it goes: immediately before the named element, or at the end when it names none.
     * <p>
     * Appending is the common case - most of what jmsfx-historical adds goes on the end. The rest place themselves, because constant order comes from model-file order and carries
     * meaning: {@code Staffel} belongs between Platoon and Company, which is echelon order rather than code order.
     * <p>
     * Before rather than after, for two reasons. An addition at the head of a list has nothing to follow, and {@code after} could not express it at all. And several additions
     * naming the same anchor keep their order this way - inserting A before X then B before X gives A, B, X - where following an anchor would reverse them.
     */
    private <T extends AbstractModel> void insert(List<T> base, T addition) {
        if (addition.getBefore() == null) {
            base.add(addition);
            return;
        }
        String before = addition.getBefore();
        // Consumed, not carried: it describes where this element goes relative to the base, which stops
        // meaning anything the moment it is there. Leaving it on would also put it in a measured model,
        // since FragmentMeasurer writes the model it was given back out.
        addition.setBefore(null);
        List<T> anchors = base.stream().filter(candidate -> candidate.getCode().equals(before)).toList();
        if (anchors.size() > 1) {
            throw new IllegalStateException(String.format("overlay element %s asks to go before %s, which appears %d times in the base - see jmsfx#137", addition.getCode(), before, anchors.size()));
        }
        if (anchors.isEmpty()) {
            throw new IllegalStateException(String.format("overlay element %s asks to go before %s, which is not in the base - see jmsfx#137", addition.getCode(), before));
        }
        T anchor = anchors.getFirst();
        base.add(base.indexOf(anchor), addition);
    }

    /**
     * Gives a field a value where the base left it unset, and refuses to change one it set.
     * <p>
     * The base leaving a field null says this element has no such thing, not that no extension may give it one - so filling it is an addition in every sense that matters.
     * Overwriting a value the base did set would change what a shared element means in a library generated from it, which is the thing an overlay must not do.
     */
    private void fill(String where, String field, String baseValue, String overlayValue, Consumer<String> setter) {
        if (overlayValue == null || overlayValue.equals(baseValue)) {
            return;
        }
        if (baseValue != null) {
            throw new IllegalStateException(String.format("overlay sets %s on %s to %s, but the base already has %s - an overlay may fill an unset field, not change one, " + "see jmsfx#137", field,
                where, overlayValue, baseValue));
        }
        setter.accept(overlayValue);
        report.add(String.format("filled %s on %s with %s", field, where, overlayValue));
    }

    private <T extends AbstractModel> T find(List<T> elements, T wanted) {
        return elements.stream().filter(candidate -> keyOf(candidate).equals(keyOf(wanted))).findFirst().orElse(null);
    }

    private <T extends AbstractModel> T find(List<T> elements, String code) {
        return elements.stream().filter(candidate -> candidate.getCode().equals(code)).findFirst().orElse(null);
    }

    /**
     * What makes an element unique among its siblings.
     * <p>
     * A code, except for a sector modifier, where it is the group id and the code together. A modifier's code is only unique within its group - jmsfx-historical's Common set has
     * {@code A1} twice, Very Heavy in group 1 and Liaison in group 2 - and keying on the code alone made the second look like a duplicate of the first. jmsfx#122 hit the same
     * collision from the other direction, where a common modifier's {@code isUnknown} needed the group id as well as the code.
     */
    private String keyOf(AbstractModel element) {
        if (element instanceof SectorOneModifierModel modifier) {
            return modifier.getGroupId() + "/" + modifier.getCode();
        }
        if (element instanceof SectorTwoModifierModel modifier) {
            return modifier.getGroupId() + "/" + modifier.getCode();
        }
        return element.getCode();
    }

    /**
     * Points every symbol set the group names at it, so the generated symbol set offers the amplifier.
     * <p>
     * Only for a frame amplifier: the other three amplifier slots are bound by the symbol set's own config, and an overlay that needs one filled says so there.
     */
    private void bindFrameAmplifier(LibraryModel base, AmplifierListModel group) {
        if (!group.isFrameAmplifier()) {
            return;
        }
        if (group.getSymbolSets().isEmpty()) {
            throw new IllegalStateException(String.format("overlay frame amplifier %s names no symbolSets, so nothing would offer it - see jmsfx#81", group.getTypeName()));
        }
        for (String symbolSetId : group.getSymbolSets()) {
            SymbolSetModel symbolSet = base.getSymbolSets()
                .stream()
                .filter(candidate -> symbolSetId.equals(candidate.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("overlay frame amplifier %s names symbol set %s, which the base does not have", group.getTypeName(), symbolSetId)));
            if (symbolSet.isFrameAmplifierPresent()) {
                throw new IllegalStateException(String.format("%s already has frame amplifier %s, so overlay %s would replace it rather than add - see jmsfx#81", symbolSetId,
                    symbolSet.getFrameAmplifierClass(), group.getTypeName()));
            }
            symbolSet.setFrameAmplifierClass(group.getTypeName());
            report.add(String.format("%s now offers frame amplifier %s", symbolSetId, group.getTypeName()));
        }
    }

}
