package io.github.ctgnz.jmsfx.generator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Where a library's fragments are found: its own tree first, then the tree of the library it extends.
 * <p>
 * Before jmsfx#133 each library carried a complete copy of the fragments, so one root was enough. That copy was the cost: jmsfx-battleorder's 2,886 files were byte-identical to
 * jmsfx-standard's with nothing of its own, and jmsfx-historical held those same 2,886 plus 314 additions. Editing a shared frame meant editing it three times, and nothing checked
 * that the three stayed equal.
 * <p>
 * The search is ordered, not merged: a library that ships its own version of a shared fragment wins, and one that ships nothing falls through to the base. That makes an override
 * possible without making it necessary - which is what the measurements said was wanted, since neither extension had a single fragment whose content differed from the base's at a
 * path they shared.
 * <p>
 * This is a source-tree arrangement and not an artifact one. Each library's jar still carries every drawing it can render, as constants since jmsfx#122 and jmsfx#124, because a
 * library has to stand alone - two {@code IconLibrary} implementations on one classpath is the case discovery must fail on (jmsfx#76).
 */
public final class FragmentTree {

    private final List<Path> roots;

    private FragmentTree(List<Path> roots) {
        this.roots = List.copyOf(roots);
    }

    /**
     * A tree rooted in this library's own fragments, then the base's where there is one.
     *
     * @param base
     *            the config of the library this one extends, or null when it extends nothing
     */
    public static FragmentTree of(GeneratorConfig config, GeneratorConfig base) {
        List<Path> roots = new ArrayList<>();
        roots.add(config.getSvgDir());
        if (base != null) {
            roots.add(base.getSvgDir());
        }
        return new FragmentTree(roots);
    }

    /** A tree of exactly these roots, searched in order. For the fragment tools, which are given directories rather than configs. */
    public static FragmentTree of(List<Path> roots) {
        return new FragmentTree(roots);
    }

    /**
     * Where this fragment is, or where it would go if it existed.
     * <p>
     * The first root holding it, and failing that the path under this library's own tree - so a caller that reports a fragment as missing names the place it should have been,
     * rather than somewhere in a library it does not own.
     */
    public Path resolve(String first, String... more) {
        Path relative = Path.of(first, more);
        for (Path root : roots) {
            Path candidate = root.resolve(relative);
            if (Files.exists(candidate)) {
                return candidate;
            }
        }
        return own().resolve(relative);
    }

    /** Whether any root holds this fragment. */
    public boolean exists(String first, String... more) {
        return Files.exists(resolve(first, more));
    }

    /** This library's own tree - where a fragment it adds or overrides belongs. */
    public Path own() {
        return roots.getFirst();
    }

    /** Every root, this library's own first. For a tool that walks the trees rather than resolving a name. */
    public List<Path> roots() {
        return roots;
    }

    @Override
    public String toString() {
        return roots.toString();
    }

}
