package io.github.ctgnz.jmsfx.standard;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.MainElement;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.SymbolSet;

/**
 * That every element was given the drawing of the fragment it names, and not some other element's.
 * <p>
 * This is the check jmsfx#122 rests on, and it works by playing two independent derivations against each other. The markup was put on each constant by the generator, which worked
 * out for itself which file belonged to which element. {@code getGraphicLocation} is jmsfx-core's own, unrelated derivation of the same thing, used at render time. If they
 * disagree, an element is carrying the wrong picture - which nothing else would catch: the symbol would render, and render something plausible.
 * <p>
 * The content root is extracted here rather than by calling the generator's extractor, deliberately. A shared implementation would agree with itself whatever it did; two
 * implementations agreeing is the evidence.
 */
class InjectedMarkupMatchesTheFragmentTest {

    /** Enough to reach every identity group, since a FULL_FRAME element draws a different picture for each. */
    private static final List<StandardIdentity> IDENTITIES = IconLibrary.discover()
        .getStandardIdentities();

    private static final Pattern GROUP_TAG = Pattern.compile("<(/?)(?:svg:)?g\\b([^>]*?)(/?)>");

    @Test
    void everyInjectedMainIconMatchesItsFragment() throws IOException {
        List<String> wrong = new ArrayList<>();
        int checked = 0;
        for (SymbolSet symbolSet : IconLibrary.discover()
            .getSymbolSets()) {
            for (Entity entity : symbolSet.getEntities()) {
                checked += check(entity, wrong);
                for (EntityType entityType : entity.getEntityTypes()) {
                    checked += check(entityType, wrong);
                    for (EntitySubType subType : entityType.getEntitySubTypes()) {
                        checked += check(subType, wrong);
                    }
                }
            }
        }
        assertThat(checked, is(greaterThan(1000)));
        assertThat(wrong, is(List.of()));
    }

    @Test
    void everyInjectedModifierMatchesItsFragment() throws IOException {
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

    /** @return how many drawings this element contributed - four for a FULL_FRAME element, one for anything else that has markup. */
    private int check(MainElement element, List<String> wrong) throws IOException {
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
