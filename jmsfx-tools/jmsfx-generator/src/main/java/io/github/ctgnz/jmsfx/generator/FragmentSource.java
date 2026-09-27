package io.github.ctgnz.jmsfx.generator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.github.ctgnz.jmsfx.generator.model.GraphicType;
import io.github.ctgnz.jmsfx.generator.model.LibraryModel;
import io.github.ctgnz.jmsfx.generator.model.SectorOneModifierModel;
import io.github.ctgnz.jmsfx.generator.model.SectorTwoModifierModel;
import io.github.ctgnz.jmsfx.generator.model.StandardIdentityGroupModel;
import io.github.ctgnz.jmsfx.generator.model.SymbolSetModel;

/**
 * The drawable content of every main icon and sector modifier fragment, keyed by the identifier that names it.
 * <p>
 * This is what jmsfx#122 injects. A fragment file is mostly not drawing: its {@code octagon} and {@code outFrame} groups are reference scaffolding, there so the fragment can be
 * edited against a visible frame, and they never render. Measured across jmsfx-standard the content roots are 26% of the bytes - 0.90 MB against 3.52 MB of files - so what reaches
 * a generated class is the content root alone, and the {@code svg} envelope is added back once at load time rather than 1,600 times in the source.
 * <p>
 * Which root is the content is never guessed: a main icon's is {@code main}, a sector modifier's is {@code mod1} or {@code mod2}. Anything else in the file is left behind -
 * scaffolding, and the {@code template} and {@code example} groups a free canvas fragment carries by jmsfx#78.
 * <p>
 * Main icon identifiers come from {@link FreeCanvasIcons}, so the derivation mapping an element to its fragment keeps one copy rather than gaining one per caller; jmsfx#52 is what
 * happens when it drifts. Modifier identifiers are derived here, no other tool having needed them, and follow the generated classes exactly.
 * <p>
 * Control Measures are excluded throughout, as they are in {@link FragmentMeasurer}: APP-6E 8.1.3 exempts them from icon composition, and they are map graphics rather than icons.
 */
public final class FragmentSource {

    /** One fragment: the identifier a renderer asks for, the file it came from, and the markup of its content root - null when the file is not there. */
    public record Fragment(String identifier, Path file, String markup) {
    }

    private static final String CONTROL_MEASURES = "ControlMeasures";
    /** The code {@link io.github.ctgnz.jmsfx.CodeElement#isUnknown()} treats as "nothing to draw". */
    private static final String UNSPECIFIED = "00";
    private static final Pattern GROUP_TAG = Pattern.compile("<(/?)(?:svg:)?g\\b([^>]*?)(/?)>");

    private FragmentSource() {
    }

    /** What a collection found: the markup to inject, and the identifiers the model named but the tree could not supply. */
    public record Fragments(Map<String, String> markup, List<String> missing) {
    }

    /**
     * Every injectable fragment in the model, resolved against the {@code svg} directory of a resource tree.
     * <p>
     * A fragment the model names but the tree does not hold is reported rather than thrown on, because it is not a new problem and injection must not invent one: today
     * {@code FoxgloveParser.parseFile} catches the failure and hands back an empty graphic, so such an element already draws nothing and has done so unnoticed. Four of them exist
     * in jmsfx-historical. Refusing to generate would turn a silent gap into a blocked build; reporting it and letting the runtime fall back to the file keeps behaviour identical
     * while making the gap visible.
     */
    public static Fragments collect(LibraryModel model, Path svgRoot) throws IOException {
        Map<String, String> fragments = new TreeMap<>();
        List<String> missing = new ArrayList<>();
        for (Fragment fragment : locate(model, svgRoot)) {
            if (fragment.markup() == null) {
                missing.add(fragment.identifier());
            } else {
                fragments.put(fragment.identifier(), fragment.markup());
            }
        }
        return new Fragments(fragments, missing);
    }

    /** Every fragment the model names, with its content root read where the file holds one and null where it does not. */
    static List<Fragment> locate(LibraryModel model, Path svgRoot) throws IOException {
        List<Fragment> fragments = new ArrayList<>();
        for (FreeCanvasIcons.Icon icon : FreeCanvasIcons.collect(model, svgRoot, type -> type != GraphicType.NA)) {
            if (CONTROL_MEASURES.equals(directoryOf(icon.fragment()))) {
                continue;
            }
            if (icon.graphicType() == GraphicType.FULL_FRAME) {
                // Four files, one per identity group, because a full frame icon is the frame and each
                // identity draws a different one. The suffix is the group's own, as MainElement uses it.
                for (StandardIdentityGroupModel group : model.getIdentityGroups()) {
                    if (group.getGraphicSuffix() != null) {
                        String identifier = icon.identifier() + group.getGraphicSuffix();
                        add(fragments, identifier, icon.fragment()
                            .resolveSibling(identifier + ".svg"), "main");
                    }
                }
            } else {
                add(fragments, icon.identifier(), icon.fragment(), "main");
            }
        }
        for (SymbolSetModel symbolSet : model.getSymbolSets()) {
            Path location = modifierRoot(svgRoot, model, symbolSet);
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
                add(fragments, identifier, location.resolve("mod1")
                    .resolve(identifier + ".svg"), "mod1");
            }
            for (SectorTwoModifierModel modifier : symbolSet.getSectorTwoMods()) {
                if (drawsNothing(modifier.getGroupId(), modifier.getCode())) {
                    continue;
                }
                String identifier = modifierIdentifier(baseCode, modifier.getGroupId(), modifier.getCode(), "2");
                add(fragments, identifier, location.resolve("mod2")
                    .resolve(identifier + ".svg"), "mod2");
            }
        }
        return fragments;
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

    /** Where a symbol set's modifier directories sit, or null when it files its fragments somewhere this does not cover. */
    private static Path modifierRoot(Path svgRoot, LibraryModel model, SymbolSetModel symbolSet) {
        String location = symbolSet.getGraphicLocation();
        if (location == null && model.getDimension(symbolSet.getDimensionId()) != null) {
            location = model.getDimension(symbolSet.getDimensionId())
                .getGraphicLocation();
        }
        return location == null || CONTROL_MEASURES.equals(location) ? null
            : svgRoot.resolve("Appendices")
                .resolve(location);
    }

    private static void add(List<Fragment> fragments, String identifier, Path file, String contentRoot) throws IOException {
        String markup = Files.exists(file) ? contentRoot(Files.readString(file, StandardCharsets.UTF_8), contentRoot) : null;
        fragments.add(new Fragment(identifier, file, markup));
    }

    private static String directoryOf(Path fragment) {
        Path parent = fragment.getParent();
        return parent == null ? null
            : parent.getFileName()
                .toString();
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
