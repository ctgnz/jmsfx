package io.github.ctgnz.jmsfx.server;

import java.util.List;
import java.util.Locale;

import io.github.ctgnz.jmsfx.IconLibrary;

/**
 * The Icon Creator bundles this server instance should offer: the three platforms, for the one library it is running.
 * <p>
 * The download page used to be the same page everywhere - a link to the releases page and a table saying which filename to look for. With an instance per library, each on its own
 * subdomain, that asks the visitor to know something they came here to be told: someone on a historical subdomain wants the historical creator, and should not have to recognise
 * that from a list of nine files.
 * <p>
 * Naming a bundle needs two facts about this instance, and neither is a build-time constant any more. The library comes from {@link IconLibrary#getName()} (jmsfx#111, which exists
 * for exactly this), and the version from Spring's {@code BuildProperties} - so a 2.0.0 server offers the 2.0.0 creator rather than whatever happens to be newest.
 * <p>
 * Deliberately not the manifest's {@code Implementation-Version}, which is the obvious guess and is simply absent here: maven-jar-plugin writes those entries only when
 * {@code addDefaultImplementationEntries} is set, which {@code spring-boot-starter-parent} does and {@code jmsfx-parent} does not. The fat jar carries no {@code Implementation-*}
 * at all, so reading it returned null on every real deployment - while every unit test that passed a version in looked perfectly healthy.
 * <p>
 * A version can still be absent, when there is no build-info on the classpath, and a snapshot is present but is not a release. Neither is an error and neither must look like one:
 * with nothing to name, {@link #versioned()} is false and the page falls back to the releases page, as it did before. See jmsfx#112.
 */
public record CreatorDownloads(String library, String version, List<Bundle> bundles) {

    private static final String RELEASES = "https://github.com/ctgnz/jmsfx/releases";

    /**
     * One platform's bundle.
     *
     * @param system
     *            what a reader calls the platform - this is button text, not an identifier
     * @param platform
     *            the token in the filename, matching the release workflow's packaging matrix
     * @param filename
     *            the asset name, or null when the version is unknown
     * @param url
     *            where to get it, or the releases page when the version is unknown
     */
    public record Bundle(String system, String platform, String filename, String url) {
    }

    /**
     * Windows and macOS ship as zip; Linux as tar.gz, which preserves the launcher's permission bits. Kept in step with the {@code Archive the image} step in release.yml - the
     * workflow writes these names and this reads them, and nothing checks that they agree.
     */
    private static final List<String[]> PLATFORMS = List.of(new String[] {
        "Windows", "windows", "zip"
    }, new String[] {
        "macOS", "macos", "zip"
    }, new String[] {
        "Linux", "linux", "tar.gz"
    });

    /** Takes the library's name rather than the library, and the version rather than a way of finding one, because that is all this needs to name a file. */
    public static CreatorDownloads of(String libraryName, String version) {
        // The classifier is the lowercased library name, which is how the profile ids and the
        // bundle filenames spell it - "Standard" here is "standard" there.
        String library = libraryName.toLowerCase(Locale.ROOT);
        List<Bundle> bundles = PLATFORMS.stream()
            .map(platform -> bundle(library, version, platform[0], platform[1], platform[2]))
            .toList();
        return new CreatorDownloads(library, version, bundles);
    }

    private static Bundle bundle(String library, String version, String system, String platform, String extension) {
        if (!isRelease(version)) {
            return new Bundle(system, platform, null, RELEASES + "/latest");
        }
        String filename = String.format("jmsfx-creator-%s-%s-%s.%s", version, library, platform, extension);
        return new Bundle(system, platform, filename, String.format("%s/download/%s/%s", RELEASES, version, filename));
    }

    /**
     * Whether this instance can name the release its bundles came from, and so offer them directly.
     * <p>
     * False in the two cases where it cannot, both of which are normal rather than faults. Running from exploded classes - any run from an IDE - leaves no manifest to read a
     * version from. And a snapshot is not a release: the live site is deployed straight from the working tree, so it reports something like {@code 2.0.0-SNAPSHOT}, for which no
     * GitHub release exists and every button would be a 404. Offering the releases page instead is worse than a direct download and much better than a dead link.
     */
    public boolean versioned() {
        return isRelease(version);
    }

    private static boolean isRelease(String version) {
        return version != null && !version.isBlank() && !version.endsWith("-SNAPSHOT");
    }

    /** The releases page, for the cases the buttons cannot cover. */
    public String releasesUrl() {
        return RELEASES;
    }

}
