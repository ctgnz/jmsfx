package io.github.ctgnz.jmsfx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import nz.co.ctg.foxglove.FoxgloveParser;

/**
 * That every element in a generated library was given the drawing of the fragment it names, and not some other element's.
 * <p>
 * Shared by every library rather than copied into each. The checks reach everything through {@link IconLibrary#discover()} and jmsfx-core's own interfaces, so they are
 * library-agnostic - but they cannot run in jmsfx-core, which deliberately has no library on its classpath (jmsfx#76). So they are published in this module's test jar and each
 * library's own test is a subclass with nothing in it. Verification code that exists three times is verification code that drifts.
 * <p>
 * This is the check jmsfx#122 rests on, and it works by playing two independent derivations against each other. The markup was put on each constant by the generator, which worked
 * out for itself which file belonged to which element. {@code getGraphicLocation} is jmsfx-core's own, unrelated derivation of the same thing, used at render time. If they
 * disagree, an element is carrying the wrong picture - which nothing else would catch: the symbol would render, and render something plausible.
 * <p>
 * The content root is extracted here rather than by calling the generator's extractor, deliberately. A shared implementation would agree with itself whatever it did; two
 * implementations agreeing is the evidence.
 */
public abstract class InjectedMarkupContract {

    /** Enough to reach every identity group, since a FULL_FRAME element draws a different picture for each. */
    private static final List<StandardIdentity> IDENTITIES = IconLibrary.discover()
        .getStandardIdentities();

    private static final Pattern GROUP_TAG = Pattern.compile("<(/?)(?:svg:)?g\\b([^>]*?)(/?)>");

    @Test
    public void everyInjectedMainIconMatchesItsFragment() throws IOException {
        List<String> wrong = new ArrayList<>();
        int checked = 0;
        for (SymbolSet symbolSet : IconLibrary.discover()
            .getSymbolSets()) {
            for (Entity entity : symbolSet.getEntities()) {
                checked += checkElement(entity, wrong);
                for (EntityType entityType : entity.getEntityTypes()) {
                    checked += checkElement(entityType, wrong);
                    for (EntitySubType subType : entityType.getEntitySubTypes()) {
                        checked += checkElement(subType, wrong);
                    }
                }
            }
        }
        assertThat(checked, is(greaterThan(1000)));
        assertThat(wrong, is(List.of()));
    }

    @Test
    public void everyInjectedModifierMatchesItsFragment() throws IOException {
        List<String> wrong = new ArrayList<>();
        int checked = 0;
        for (SymbolSet symbolSet : IconLibrary.discover()
            .getSymbolSets()) {
            for (SectorOneModifier modifier : symbolSet.getSectorOneModifiers()) {
                String markup = modifier.getGraphicMarkup();
                if (markup != null) {
                    checked++;
                    compare(modifier.getFullGraphicLocation(), "mod1", markup, wrong);
                }
            }
            for (SectorTwoModifier modifier : symbolSet.getSectorTwoModifiers()) {
                String markup = modifier.getGraphicMarkup();
                if (markup != null) {
                    checked++;
                    compare(modifier.getFullGraphicLocation(), "mod2", markup, wrong);
                }
            }
        }
        assertThat(checked, is(greaterThan(400)));
        assertThat(wrong, is(List.of()));
    }

    /**
     * That every injected drawing is well-formed enough to parse.
     * <p>
     * Here rather than at generation time for two reasons. The generator cannot see {@code FragmentMarkup}, having no dependency on jmsfx-core, and giving it one to reach a single
     * constant would be a worse trade than testing the output. And generation is a manual step while this runs on every build, so a template change that produces markup nothing
     * can parse fails here rather than whenever someone next regenerates.
     * <p>
     * It matters because the runtime cannot report this. {@code parseResource} catches a parse failure and hands back an empty graphic, so malformed markup would draw nothing at
     * all and look like a missing icon rather than a broken one - the same silent failure the Invalid Symbol fallback exists to prevent one level up.
     */
    @Test
    public void everyInjectedDocumentParses() {
        FoxgloveParser parser = new FoxgloveParser();
        List<String> unparseable = new ArrayList<>();
        int parsed = 0;
        for (String markup : everyInjectedMarkup()) {
            try {
                parser.parse(new ByteArrayInputStream(FragmentMarkup.document(markup)
                    .getBytes(StandardCharsets.UTF_8)));
                parsed++;
            } catch (Exception e) {
                unparseable.add(markup.substring(0, Math.min(90, markup.length())) + " -> " + e.getMessage());
            }
        }
        assertThat(parsed, is(greaterThan(1000)));
        assertThat(unparseable, is(List.of()));
    }

    /** That the check above would notice. A parse that cannot fail is not a check, and this one is only meaningful if malformed markup throws rather than coming back empty. */
    @Test
    public void theParseCheckWouldNoticeMalformedMarkup() {
        FoxgloveParser parser = new FoxgloveParser();

        assertThrows(Exception.class, () -> parser.parse(new ByteArrayInputStream(FragmentMarkup.document("<g id=\"main\"><path")
            .getBytes(StandardCharsets.UTF_8))));
    }

    /** Every drawing this library carries, however it is reached. */
    private List<String> everyInjectedMarkup() {
        List<String> markup = new ArrayList<>();
        for (SymbolSet symbolSet : IconLibrary.discover()
            .getSymbolSets()) {
            for (Entity entity : symbolSet.getEntities()) {
                collect(entity, markup);
                for (EntityType entityType : entity.getEntityTypes()) {
                    collect(entityType, markup);
                    entityType.getEntitySubTypes()
                        .forEach(subType -> collect(subType, markup));
                }
            }
            symbolSet.getSectorOneModifiers()
                .forEach(modifier -> add(modifier.getGraphicMarkup(), markup));
            symbolSet.getSectorTwoModifiers()
                .forEach(modifier -> add(modifier.getGraphicMarkup(), markup));
        }
        return markup;
    }

    private void collect(MainElement element, List<String> markup) {
        IDENTITIES.forEach(identity -> add(element.getGraphicMarkup(identity), markup));
    }

    private static void add(String value, List<String> markup) {
        if (value != null) {
            markup.add(value);
        }
    }

    /** @return how many drawings this element contributed - four for a FULL_FRAME element, one for anything else that has markup. */
    private int checkElement(MainElement element, List<String> wrong) throws IOException {
        int checked = 0;
        for (StandardIdentity identity : IDENTITIES) {
            String markup = element.getGraphicMarkup(identity);
            if (markup == null) {
                continue;
            }
            checked++;
            compare(element.getGraphicLocation(identity), "main", markup, wrong);
        }
        return checked;
    }

    private void compare(String location, String contentRootId, String markup, List<String> wrong) throws IOException {
        String fromFile = contentRoot(read(location), contentRootId);
        if (!markup.equals(fromFile)) {
            wrong.add(String.format("%s: injected markup differs from the fragment's %s group", location, contentRootId));
        }
    }

    private String read(String location) throws IOException {
        try (InputStream in = getClass().getResourceAsStream(location)) {
            if (in == null) {
                return "";
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

    /** Depth-counted, because these groups nest and a self-closing one closes itself - an empty content root is legitimate. */
    private String contentRoot(String svg, String id) {
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
