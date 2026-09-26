package io.github.ctgnz.jmsfx.server;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import org.junit.jupiter.api.Test;

/**
 * These names have to match the ones release.yml writes, and nothing enforces that: the workflow builds the files and this reads them, with no shared definition between the two.
 * So the expected names are spelled out in full here rather than rebuilt from the same parts, which would agree with itself whatever it did.
 */
class CreatorDownloadsTest {

    @Test
    void namesTheBundlesForItsOwnLibraryAndVersion() {
        CreatorDownloads downloads = CreatorDownloads.of("Standard", "2.0.0");

        assertThat(downloads.bundles()
            .stream()
            .map(CreatorDownloads.Bundle::filename)
            .toList(),
            contains("jmsfx-creator-2.0.0-standard-windows.zip", "jmsfx-creator-2.0.0-standard-macos.zip", "jmsfx-creator-2.0.0-standard-linux.tar.gz"));
    }

    @Test
    void linksToTheReleaseTheVersionNames() {
        assertThat(CreatorDownloads.of("Hallux", "2.1.0")
            .bundles()
            .getFirst()
            .url(), is("https://github.com/ctgnz/jmsfx/releases/download/2.1.0/jmsfx-creator-2.1.0-hallux-windows.zip"));
    }

    /** The library name is capitalised on IconLibrary and lowercase in a filename, which is also how the Maven profile and the jar classifier spell it. */
    @Test
    void lowercasesTheLibraryName() {
        assertThat(CreatorDownloads.of("BattleOrder", "2.0.0")
            .library(), is("battleorder"));
    }

    /** Running from exploded classes - an IDE - leaves no manifest to read, which is not an error. */
    @Test
    void fallsBackToTheReleasesPageWithNoVersion() {
        CreatorDownloads downloads = CreatorDownloads.of("Standard", null);

        assertThat(downloads.versioned(), is(false));
        assertThat(downloads.bundles()
            .getFirst()
            .filename(), is(nullValue()));
        assertThat(downloads.bundles()
            .getFirst()
            .url(), is("https://github.com/ctgnz/jmsfx/releases/latest"));
    }

    /**
     * The live site is deployed from the working tree, so it reports a snapshot version - and there is no GitHub release by that name, which would make every button a 404.
     */
    @Test
    void treatsASnapshotAsNotAReleaseAtAll() {
        CreatorDownloads downloads = CreatorDownloads.of("Standard", "2.0.0-SNAPSHOT");

        assertThat(downloads.versioned(), is(false));
        assertThat(downloads.bundles()
            .getFirst()
            .url(), is("https://github.com/ctgnz/jmsfx/releases/latest"));
    }

    @Test
    void treatsABlankVersionAsAbsent() {
        assertThat(CreatorDownloads.of("Standard", "  ")
            .versioned(), is(false));
    }

}
