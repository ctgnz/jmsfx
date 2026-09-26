package io.github.ctgnz.jmsfx.generator;

import java.util.ArrayList;
import java.util.List;

import io.github.ctgnz.jmsfx.generator.model.AmplifierListModel;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;

/**
 * Builds one library model from a base model plus an extension overlay.
 * <p>
 * This is what jmsfx#81 exists for. {@code model.yml} for the historical extension is a 4,729-line file of which all but a few hundred entries are a verbatim copy of the standard
 * one, which is a lot of duplication to maintain by hand and an invitation for the two to drift. An overlay carries only what the extension adds, and composition puts the two
 * together at generation time - so the output is still a single library, which is what {@link io.github.ctgnz.jmsfx.IconLibrary} discovery requires (jmsfx#76).
 * <p>
 * An overlay may only <em>add</em>. {@link ModelComparator} enforces that for a whole model, and the same rule is what makes composition predictable: a base element means the same
 * thing in every library generated from it.
 * <h2>Why a frame amplifier is the interesting case</h2> Adding elements <em>inside</em> a symbol set is easy - an entity, a modifier, an amplifier value all just join a list.
 * Adding a frame amplifier is not, because it changes the symbol set itself: {@code getFrameAmplifiers()} on the generated {@code SymbolSet} returns the values of whatever class
 * {@code frameAmplifierClass} names, so a new frame amplifier means an existing symbol set now has a property it did not have.
 * <p>
 * That looked like it needed the overlay format to express "set a field the base left unset" as well as "add an element". It does not, because the relationship is already stated
 * from the other end: an amplifier group declares {@code frameAmplifier: true} and the {@code symbolSets} it applies to, which the generated {@code AmplifierListEnum} carries as
 * {@code getSymbolSets()}. The symbol set's {@code frameAmplifierClass} is the same fact written twice, so composition derives it rather than asking an overlay to repeat it.
 * <p>
 * The consequence worth knowing: an overlay that adds a frame amplifier group <em>must</em> name its {@code symbolSets}, or the amplifier is generated and nothing offers it. The
 * historical model binds {@code frameAmplifierClass: ServiceTier} on Land Units directly and leaves that group's {@code symbolSets} empty - which works for a whole model, and
 * would silently do nothing as an overlay.
 */
public class ModelComposer {

    /**
     * Applies the overlay onto the base, and returns the base.
     * <p>
     * Mutates rather than copies. The base is parsed for this composition and discarded after it, and the model's collections are live lists the parser filled - so copying would
     * mean a deep clone of four thousand elements to protect something nothing else holds a reference to.
     */
    public LibraryModel compose(LibraryModel base, LibraryModel overlay) {
        List<String> added = new ArrayList<>();
        for (AmplifierListModel group : overlay.getAmplifierGroups()) {
            if (base.getAmplifierGroups()
                .stream()
                .anyMatch(existing -> existing.getCode()
                    .equals(group.getCode()))) {
                throw new IllegalStateException(String.format("overlay amplifier group %s (%s) already exists in the base - an overlay may only add, see jmsfx#81", group.getCode(),
                    group.getTypeName()));
            }
            base.getAmplifierGroups()
                .add(group);
            added.add(group.getTypeName());
            bindFrameAmplifier(base, group);
        }
        System.out.format("Composed %d amplifier group%s onto the base: %s%n", added.size(), added.size() == 1 ? "" : "s", String.join(", ", added));
        return base;
    }

    /**
     * Points every symbol set the group names at it, so the generated symbol set offers the amplifier.
     * <p>
     * Only for a frame amplifier: the other three amplifier slots are bound by the base model and an overlay adding values to one of them needs nothing here.
     */
    private void bindFrameAmplifier(LibraryModel base, AmplifierListModel group) {
        if (!group.isFrameAmplifier()) {
            return;
        }
        if (group.getSymbolSets()
            .isEmpty()) {
            throw new IllegalStateException(String.format(
                "overlay frame amplifier %s names no symbolSets, so nothing would offer it - see jmsfx#81", group.getTypeName()));
        }
        for (String symbolSetId : group.getSymbolSets()) {
            SymbolSetModel symbolSet = base.getSymbolSets()
                .stream()
                .filter(candidate -> symbolSetId.equals(candidate.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("overlay frame amplifier %s names symbol set %s, which the base does not have", group.getTypeName(),
                    symbolSetId)));
            if (symbolSet.isFrameAmplifierPresent()) {
                throw new IllegalStateException(String.format("%s already has frame amplifier %s, so overlay %s would replace it rather than add - see jmsfx#81",
                    symbolSetId, symbolSet.getFrameAmplifierClass(), group.getTypeName()));
            }
            symbolSet.setFrameAmplifierClass(group.getTypeName());
            System.out.format("  %s now offers frame amplifier %s%n", symbolSetId, group.getTypeName());
        }
    }

}
