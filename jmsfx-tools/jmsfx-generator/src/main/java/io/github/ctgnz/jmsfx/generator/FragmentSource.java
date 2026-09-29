package io.github.ctgnz.jmsfx.generator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.github.ctgnz.jmsfx.generator.model.AbstractModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierListItemModel;
import io.github.ctgnz.jmsfx.generator.model.AmplifierListModel;
import io.github.ctgnz.jmsfx.generator.model.ContextModel;
import io.github.ctgnz.jmsfx.generator.model.DimensionModel;
import io.github.ctgnz.jmsfx.generator.model.GraphicType;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SectorOneModifierModel;
import io.github.ctgnz.jmsfx.generator.model.SectorTwoModifierModel;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityGroupModel;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityModel;
import io.github.ctgnz.jmsfx.generator.model.StatusModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;

/**
 * The drawable content of every main icon and sector modifier fragment, keyed by the identifier that names it.
 * <p>
 * This is what jmsfx#122 injects. A fragment file is mostly not drawing: its {@code octagon} and {@code outFrame} groups are reference scaffolding, there so the fragment can be
 * edited against a visible frame, and they never render. Measured across jmsfx-standard the content roots are 26% of the bytes - 0.90 MB against 3.52 MB of files - so what reaches
 * a generated class is the content root alone, and the {@code svg} envelope is added back once at load time rather than 1,600 times in the source.
 * <p>
 * Which root is the content is never guessed: a main icon's is {@code main}, a sector modifier's is {@code mod1} or {@code mod2}. Anything else in the file is left behind, being
 * scaffolding - except for a free canvas icon, which contributes its {@code template} as well, since for those the template is part of what a preview has to show. Its
 * {@code example} groups are left behind either way.
 * <p>
 * Main icon identifiers come from {@link FreeCanvasIcons}, so the derivation mapping an element to its fragment keeps one copy rather than gaining one per caller; jmsfx#52 is what
 * happens when it drifts. Modifier identifiers are derived here, no other tool having needed them, and follow the generated classes exactly.
 * <p>
 * No symbol set is excluded. Control Measures used to be, on the grounds that APP-6E 8.1.3 exempts them from icon composition - but what makes them different is that every one of
 * their icons is {@code FREE_CANVAS}, and Cyberspace has three of those too. So the behaviour is keyed by graphic type, which is where it belongs, and their sector modifiers are
 * injected like any other symbol set's. {@link FragmentMeasurer} still excludes them from bounds, which is a separate question - a free canvas icon has no meaningful extent.
 */
public final class FragmentSource {

    /**
     * One fragment: the element that draws it, the key it is filed under when the element draws more than one, the file it came from, and the markup of its content root - null
     * when the file holds none. The identifier is kept only to report by; nothing is keyed on it.
     * <p>
     * The key is null for an element with a single drawing, the identity group for a {@code FULL_FRAME} element, and identity plus status frame id for a dimension's frame.
     */
    public record Fragment(String identifier, AbstractModel element, String key, Path file, String markup) {
    }

    /** What an ordinary main icon contributes: the group that draws, and nothing else in the file. */
    private static final List<String> MAIN_ROOTS = List.of("main");

    /**
     * What a free canvas icon contributes.
     * <p>
     * A free canvas fragment holds one {@code main}, an optional {@code template}, and any number of {@code example} groups (jmsfx#78). The creator and the server show what an
     * implementation would look like rather than offering a drawing toolkit, so the preview is the main group plus the template that frames it; the examples are illustration for
     * whoever is authoring the fragment and stay in the source file.
     * <p>
     * This is the one place a fragment contributes two groups rather than one - a deliberate exception, because for these icons the template is part of what there is to show.
     */
    private static final List<String> FREE_CANVAS_ROOTS = List.of("main", "template");
    /** The graphic location a text amplifier list carries: it draws nothing, so there is no directory behind it. */
    private static final String NO_GRAPHIC = "NA";
    /** The content root each amplifier directory files its drawing under. */
    private static final Map<String, String> CONTENT_ROOTS = Map.of("Amplifier", "amplifier", "Echelon", "echelon");
    /** The code {@link io.github.ctgnz.jmsfx.CodeElement#isUnknown()} treats as "nothing to draw". */
    private static final String UNSPECIFIED = "00";
    /** The Common entity APP-6E provides for a symbol that cannot be resolved. */
    private static final String INVALID = "INVALID";
    private static final Pattern GROUP_TAG = Pattern.compile("<(/?)(?:svg:)?g\\b([^>]*?)(/?)>");

    private FragmentSource() {
    }

    /** What an injection did: how many elements were given markup, and what the model named that the tree could not supply. */
    public record Result(int injected, List<String> missing) {
    }

    /**
     * Reads every fragment the model names and hangs its markup on the element that draws it.
     * <p>
     * On the element rather than in a table keyed by the fragment's filename, which would make the current layout permanent - jmsfx#124 exists to change it, and a generated lookup
     * keyed on {@code 10110100} would have to be rewritten with it. The generated constant carries its own drawing instead.
     * <p>
     * A fragment the model names but the tree cannot supply gets the Invalid Symbol's markup, so the element renders as the standard "this is wrong" marker. Reading nothing would
     * be quieter and worse: {@code FoxgloveParser} already swallows a missing file and returns an empty graphic, which is how three fragments in jmsfx-historical came to draw
     * nothing unnoticed. A generation failure should be visible at runtime.
     */
    public static Result inject(LibraryModel model, FragmentTree tree) throws IOException {
        List<Fragment> fragments = locate(model, tree);
        String invalidSymbol = invalidSymbolMarkup(fragments);
        List<String> missing = new ArrayList<>();
        Map<AbstractModel, Map<String, String>> byKey = new LinkedHashMap<>();
        int injected = 0;
        for (Fragment fragment : fragments) {
            String markup = fragment.markup();
            if (markup == null) {
                missing.add(fragment.identifier());
                markup = invalidSymbol;
                if (markup == null) {
                    continue;
                }
            }
            if (fragment.key() == null) {
                fragment.element()
                    .setGraphicMarkup(markup);
            } else {
                byKey.computeIfAbsent(fragment.element(), element -> new LinkedHashMap<>())
                    .put(fragment.key(), markup);
            }
            injected++;
        }
        byKey.forEach((element, markupByKey) -> element.setGraphicMarkupByKey(markupByKey));
        return new Result(injected, missing);
    }

    /**
     * The Invalid Symbol's markup, which is what an element with no fragment falls back to.
     * <p>
     * Found through the model rather than by naming a file, so it survives jmsfx#124: it is the Common symbol set's {@code INVALID} entity, which APP-6E provides for exactly this
     * purpose. Null if that entity has no fragment either, in which case there is nothing sensible to substitute and the element is left without markup.
     */
    private static String invalidSymbolMarkup(List<Fragment> fragments) {
        return fragments.stream()
            .filter(fragment -> INVALID.equals(fragment.element()
                .getId()) && fragment.markup() != null)
            .map(Fragment::markup)
            .findFirst()
            .orElse(null);
    }

    /** The roots this graphic type contributes, in the order they are drawn. */
    private static List<String> rootsFor(GraphicType graphicType) {
        return graphicType == GraphicType.FREE_CANVAS ? FREE_CANVAS_ROOTS : MAIN_ROOTS;
    }

    /** Every fragment the model names, with its content root read where the file holds one and null where it does not. */
    static List<Fragment> locate(LibraryModel model, FragmentTree tree) throws IOException {
        List<Fragment> fragments = new ArrayList<>();
        for (FreeCanvasIcons.Icon icon : FreeCanvasIcons.collect(model, tree, type -> type != GraphicType.NA)) {
            if (icon.graphicType() == GraphicType.FULL_FRAME) {
                // Four files, one per identity group, because a full frame icon is the frame and each
                // identity draws a different one. The suffix is the group's own, as MainElement uses it.
                for (StandardIdentityGroupModel group : model.getIdentityGroups()) {
                    if (group.getGraphicSuffix() != null) {
                        String identifier = icon.identifier() + group.getGraphicSuffix();
                        // Searched through the tree, not resolved against icon.fragment(): a FULL_FRAME
                        // element has no fragment under its canonical name, so that path resolves to this
                        // library's own root whether or not anything is there - and since jmsfx#133 a
                        // library may hold none of these files itself.
                        add(fragments, identifier, icon.element(), group.getCode(), icon.sibling(tree, identifier), MAIN_ROOTS);
                    }
                }
            } else {
                add(fragments, icon.identifier(), icon.element(), null, icon.fragment(), rootsFor(icon.graphicType()));
            }
        }
        for (SymbolSetModel symbolSet : model.getSymbolSets()) {
            String location = modifierLocation(model, symbolSet);
            if (location == null) {
                continue;
            }
            String baseCode = FreeCanvasIcons.baseCode(model, symbolSet, null);
            // An "unspecified" modifier draws nothing and has no fragment - the generated library returns
            // null from loadSectorOneModifierGraphic when isUnknown(). See drawsNothing for why that is
            // not simply "the code is 00".
            for (SectorOneModifierModel modifier : symbolSet.getSectorOneMods()) {
                if (drawsNothing(modifier.getGroupId(), modifier.getCode())) {
                    continue;
                }
                String identifier = modifierIdentifier(baseCode, modifier.getGroupId(), modifier.getCode(), "1");
                add(fragments, identifier, modifier, null, tree.resolve("Appendices", location, "mod1", identifier + ".svg"), "mod1");
            }
            for (SectorTwoModifierModel modifier : symbolSet.getSectorTwoMods()) {
                if (drawsNothing(modifier.getGroupId(), modifier.getCode())) {
                    continue;
                }
                String identifier = modifierIdentifier(baseCode, modifier.getGroupId(), modifier.getCode(), "2");
                add(fragments, identifier, modifier, null, tree.resolve("Appendices", location, "mod2", identifier + ".svg"), "mod2");
            }
        }
        addFrames(fragments, model, tree);
        addFrameFurniture(fragments, model, tree, "OCA", "oca", model.getStatuses(), (key, code) -> "0" + key + code + "2");
        addFrameFurniture(fragments, model, tree, "HQTFFD", "hqtffd", model.getHqtfDummies(), (key, code) -> key + code);
        addAmplifiers(fragments, model, tree);
        addOverlays(fragments, model, tree);
        return fragments;
    }

    /**
     * Every amplifier drawing, hung on the item that draws it and keyed by identity group.
     * <p>
     * One key rather than the two the frame furniture needs: an amplifier's fragment is {@code /svg/{list}/{identityGroup}{itemId}.svg}, so the group is the only thing that varies
     * it. Keyed as {@link FragmentMeasurer} keys the matching bounds.
     * <p>
     * Only the standard lists are walked, matching the measurer. A list whose {@code graphicLocation} is {@code NA} carries no drawings at all - it is a text amplifier, and the
     * paths it can derive name a directory that does not exist.
     */
    private static void addAmplifiers(List<Fragment> fragments, LibraryModel model, FragmentTree tree) throws IOException {
        for (AmplifierListModel list : model.getAmplifierGroups()) {
            if (!list.isStandard() || list.isUnknown() || NO_GRAPHIC.equals(list.getGraphicLocation())) {
                continue;
            }
            for (AmplifierListItemModel item : list.getValues()) {
                for (StandardIdentityGroupModel group : model.getIdentityGroups()) {
                    String identifier = group.getCode() + item.getCode();
                    Path file = tree.resolve(list.getGraphicLocation(), identifier + ".svg");
                    if (Files.exists(file)) {
                        add(fragments, identifier, item, group.getCode(), file, CONTENT_ROOTS.get(list.getGraphicLocation()));
                    }
                }
            }
        }
    }

    /**
     * The frame overlays - the context indicators - hung on the context that draws them.
     * <p>
     * The only category with no key at all: a context indicator is one drawing, the same whatever the symbol underneath it. Reality has no file and draws nothing, which is the
     * same reason it has no location worth reading.
     */
    private static void addOverlays(List<Fragment> fragments, LibraryModel model, FragmentTree tree) throws IOException {
        for (ContextModel context : model.getContexts()) {
            // The model's code, not its id: ContextEnum passes the code as the field its
            // getOverlayGraphicLocation formats, so the file is 2.svg and not EXERCISE.svg.
            Path file = tree.resolve("Frames", "Overlay", context.getCode() + ".svg");
            if (Files.exists(file)) {
                add(fragments, context.getCode(), context, null, file, "frame_overlay");
            }
        }
    }

    /** How a category of frame furniture names the file for one element under one key. */
    private interface Naming {
        String identifier(String key, String code);
    }

    /**
     * The status bars and the headquarters/task force/dummy indicators, hung on the element that draws them.
     * <p>
     * These two are the same shape of problem and so share an implementation: both are keyed by identity group and dimension, both file one fragment per combination, and both have
     * exactly one content root in every file they ship. Only the directory, that root's id and the filename differ - a status adds the trailing {@code 2} that selects APP-6E's
     * alternate rendering of the operational condition codes, which is the only form the shipped fragments cover.
     * <p>
     * Keyed exactly as {@link FragmentMeasurer} keys the matching bounds, so a drawing and its measurements cannot disagree about which fragment they describe. As with frames, a
     * combination the tree does not hold is skipped rather than reported missing: not every identity group draws in every dimension, and absence is how the tree says so.
     */
    private static void addFrameFurniture(List<Fragment> fragments, LibraryModel model, FragmentTree tree, String directory, String contentRoot,
                                          List<? extends AbstractModel> elements, Naming naming) throws IOException {
        for (AbstractModel element : elements) {
            for (StandardIdentityGroupModel group : model.getIdentityGroups()) {
                for (DimensionModel dimension : model.getDimensions()) {
                    String key = group.getCode() + dimension.getCode();
                    String identifier = naming.identifier(key, element.getCode());
                    Path file = tree.resolve(directory, identifier + ".svg");
                    if (Files.exists(file)) {
                        add(fragments, identifier, element, key, file, contentRoot);
                    }
                }
            }
        }
    }

    /**
     * Every frame the model can draw, hung on the dimension whose code names it.
     * <p>
     * Frames are keyed three ways where a main icon is keyed one: identity, frame id and status. The frame id is the dimension's own code, which is why they hang off the
     * dimension, and the status contributes its code only for a confirmed identity - an unconfirmed one always draws the "0" variant, which is what {@code Status.getFrameId}
     * encodes. Keyed exactly as {@link FragmentMeasurer} keys the matching bounds, so a frame's markup and its measurements cannot disagree about which frame they describe.
     * <p>
     * Civilian is not a key. A civilian frame is its military counterpart with the identity fill replaced, derived at load time by {@code FragmentMarkup.replaceFill}, so the 90
     * {@code c} files were removed rather than injected twice over (jmsfx#123).
     * <p>
     * A frame the tree does not hold is skipped rather than reported missing or filled with the Invalid Symbol. Not every combination of dimension, identity and status names a
     * real frame, and there is no enumeration of the ones that do - absence is how the tree says so, which is how {@link FragmentMeasurer} reads it too.
     */
    private static void addFrames(List<Fragment> fragments, LibraryModel model, FragmentTree tree) throws IOException {
        for (DimensionModel dimension : model.getDimensions()) {
            Set<String> seen = new LinkedHashSet<>();
            for (StandardIdentityModel identity : model.getIdentities()) {
                for (StatusModel status : model.getStatuses()) {
                    String statusFrameId = identity.isConfirmed() ? status.getCode() : "0";
                    String key = identity.getCode() + statusFrameId;
                    if (!seen.add(key)) {
                        continue;
                    }
                    String identifier = String.format("0_%s%s_%s", identity.getCode(), dimension.getCode(), statusFrameId);
                    Path file = tree.resolve("Frames", identifier + ".svg");
                    if (Files.exists(file)) {
                        add(fragments, identifier, dimension, key, file, "frame");
                    }
                }
            }
        }
    }

    /**
     * Whether a modifier draws nothing, and so needs no fragment.
     * <p>
     * Not simply a code of {@code 00}. A common modifier's generated class overrides {@code isUnknown} to require the group id to be {@code 0} <em>as well</em>, because
     * {@code C1100} - group 1, code 00 - is UAV/Drone Equipped and has a fragment of its own. Taking the code alone dropped it.
     */
    private static boolean drawsNothing(String groupId, String code) {
        return groupId == null ? UNSPECIFIED.equals(code) : "0".equals(groupId) && UNSPECIFIED.equals(code);
    }

    /**
     * A modifier's identifier, matching what the generated class returns.
     * <p>
     * A modifier carrying a group id belongs to the common table, which numbers its fragments {@code C1} then the group id then the modifier id - see
     * {@code CommonSectorOneModifier}. Every other modifier is numbered with its <em>base</em> symbol set's code, the modifier id, and the sector: the nine Cyberspace variants
     * file their modifiers under Cyberspace's numbering, and the generated classes override {@code getBaseSymbolSet} per class to say so.
     */
    private static String modifierIdentifier(String baseCode, String groupId, String code, String sector) {
        // The model's code is what the generated class returns from getId(); the model's id names the Java
        // constant. Reading the wrong one asked for C10UNSPECIFIED instead of C1000.
        return groupId == null ? baseCode + code + sector : String.format("C%s%s%s", sector, groupId, code);
    }

    /** The appendix directory a symbol set files its modifiers under, or null when it names none. */
    private static String modifierLocation(LibraryModel model, SymbolSetModel symbolSet) {
        String location = symbolSet.getGraphicLocation();
        if (location == null && model.getDimension(symbolSet.getDimensionId()) != null) {
            location = model.getDimension(symbolSet.getDimensionId())
                .getGraphicLocation();
        }
        return location;
    }

    private static void add(List<Fragment> fragments, String identifier, AbstractModel element, String key, Path file, String contentRoot) throws IOException {
        add(fragments, identifier, element, key, file, List.of(contentRoot));
    }

    /**
     * Reads the roots this fragment contributes and hangs them on the element, in the order given.
     * <p>
     * More than one only for a free canvas icon. A root the file does not hold is skipped rather than failing, because {@code template} is optional; all of them missing leaves the
     * markup null, which is what reports a fragment as missing.
     */
    private static void add(List<Fragment> fragments, String identifier, AbstractModel element, String key, Path file, List<String> contentRoots) throws IOException {
        String markup = null;
        if (Files.exists(file)) {
            String svg = Files.readString(file, StandardCharsets.UTF_8);
            StringBuilder found = new StringBuilder();
            for (String root : contentRoots) {
                String content = contentRoot(svg, root);
                if (content != null) {
                    found.append(content);
                }
            }
            markup = found.isEmpty() ? null : found.toString();
        }
        fragments.add(new Fragment(identifier, element, key, file, markup));
    }

    /**
     * The markup of the group with this id, brackets included, or null when the file has no such group.
     * <p>
     * Depth-counted rather than reaching for a closing tag with a regex: these groups nest, and a non-greedy match on the close has truncated fragment rewrites three separate
     * times in this codebase's history.
     */
    static String contentRoot(String svg, String id) {
        Matcher opening = Pattern.compile("<(?:svg:)?g\\b[^>]*id=\"" + Pattern.quote(id) + "\"")
            .matcher(svg);
        if (!opening.find()) {
            return null;
        }
        int start = opening.start();
        int depth = 0;
        Matcher tags = GROUP_TAG.matcher(svg);
        tags.region(start, svg.length());
        while (tags.find()) {
            if (!tags.group(3)
                .isEmpty()) {
                // A self-closing group closes itself. When it is the one being extracted that is the
                // whole answer: an empty content root is legitimate - "General" in the Dismounted set is
                // a synonym for Unknown and draws an empty frame, so its fragment is <g id="main"/>.
                // Skipping it unconditionally left the depth count open and reported the fragment as
                // having no content at all.
                if (tags.start() == start) {
                    return svg.substring(start, tags.end());
                }
                continue;
            }
            depth += tags.group(1)
                .isEmpty() ? 1 : -1;
            if (depth == 0) {
                return svg.substring(start, tags.end());
            }
        }
        return null;
    }

}
