package io.github.ctgnz.jmsfx.icon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.icon.editor.DynamicIconLibrary;
import io.github.ctgnz.jmsfx.icon.editor.EntitySubTypeImpl;
import io.github.ctgnz.jmsfx.icon.editor.SymbolSetImpl;

public class VerifyIcons {

    /** The group ids a fragment's own drawing sits under, as the generator names them. */
    private static final List<String> CONTENT_ROOTS = List.of("main", "mod1", "mod2", "frame", "oca", "hqtffd", "amplifier", "echelon");

    private List<Path> usedPaths;
    private List<Path> fragmentRoots;

    /**
     * @param args
     *            the {@code src/main/model} directories to search, nearest first - the library's own tree, then the tree of each library it overlays.
     *            <p>
     *            Named rather than found. Until jmsfx#124 the tree was on the classpath and this could reach it through {@code getResource}; it is now build input, and which
     *            library to check is the caller's choice for the same reason the generator makes it one. More than one because since jmsfx#133 an overlay holds only the fragments
     *            it adds, and the rest are its base library's - the same search path the generator walks, given here rather than inferred so this stays a tool you point at trees.
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("usage: VerifyIcons <library>/src/main/model [<base library>/src/main/model ...]");
            return;
        }
        try {
            VerifyIcons verifier = new VerifyIcons();
            verifier.verify(Arrays.stream(args).map(Path::of).toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verify(List<Path> fragmentRoots) throws Exception {
        this.fragmentRoots = fragmentRoots;
        this.usedPaths = new ArrayList<>();
        DynamicIconLibrary library = new DynamicIconLibrary(IconLibrary.discover(), fragmentRoots.get(0));
        System.out.println("Version");
        library.getVersions().forEach(version -> {
            System.out.format("  [%s] %s%n", version.getId(), version.getLabel());
        });
        System.out.println("Context");
        library.getContexts().forEach(context -> {
            System.out.format("  [%s] %s%n", context.getId(), context.getLabel());
            if (!context.isReality()) {
                String location = context.getOverlayGraphicKey();
                if (!isGraphicPresent(location)) {
                    System.out.format("    [%s]: %s not found%n", context.getLabel(), location);
                }
            }
        });
        System.out.println("Standard Identity");
        library.getStandardIdentities().forEach(sid -> {
            System.out.format("  [%s] %s (%s)%n", sid.getId(), sid.getLabel(), sid.getGroup());
        });
        System.out.println("Status");
        library.getStatuses().forEach(status -> {
            System.out.format("  [%s] %s%n", status.getId(), status.getLabel());
            if (status.isOperationalCondition()) {
                library.getSymbolSets().stream().filter(sym -> status.isSupported(sym)).forEach(symbolSet -> {
                    library.getStandardIdentities().forEach(identity -> {
                        String location = status.getGraphicKey(identity, symbolSet);
                        if (!isGraphicPresent(location)) {
                            System.out.format("    [%s:%s:%s]: %s not found%n", status.getLabel(), symbolSet.getLabel(), identity.getLabel(), location);
                        }
                    });
                });
            }
        });
        System.out.println("HQ/TF/Dummy");
        library.getHqtfDummys().forEach(dummy -> {
            System.out.format("  [%s] %s%n", dummy.getId(), dummy.getLabel());
            library.getSymbolSets().stream().filter(sym -> dummy.isSupported(sym)).forEach(symbolSet -> {
                library.getStandardIdentities().forEach(identity -> {
                    String location = dummy.getGraphicKey(identity, symbolSet);
                    if (!isGraphicPresent(location) && !dummy.isUnknown()) {
                        System.out.format("    [%s:%s:%s]: %s not found%n", dummy.getLabel(), symbolSet.getLabel(), identity.getLabel(), location);
                    }
                });
            });
        });
        library.getDimensions().forEach(dimension -> {
            System.out.format("%s%n", dimension.getLabel());
            dimension.getSymbolSets().forEach(ss -> {
                SymbolSetImpl symSet = (SymbolSetImpl) ss;
                System.out.format("  %s%n", symSet.getLabel());
                if (symSet.isFramedIcon()) {
                    if (symSet.isAmplifierGuidesPresent()) {
                        String location = symSet.getAmplifierGuideTemplateLocation();
                        if (!isGraphicPresent(location)) {
                            System.out.format("    [%s]: %s not found%n", symSet.getLabel(), location);
                        }
                    }
                    library.getStandardIdentities().forEach(identity -> {
                        library.getStatuses().stream().filter(Status::isFrameStatus).forEach(status -> {
                            if (identity.isConfirmed() || status.isPresent()) {
                                String location = symSet.getFrameKey(identity, status, false);
                                if (!isGraphicPresent(location)) {
                                    System.out.format("    [%s:%s:%s]: %s not found%n", symSet.getLabel(), identity.getLabel(), status.getLabel(), location);
                                }
                            }
                        });
                    });
                }
                symSet.getEntities().forEach(entity -> {
                    System.out.format("    %s%n", entity.getLabel());
                    if (entity.isGraphicalIcon()) {
                        library.getStandardIdentities().forEach(identity -> {
                            String location = entity.getGraphicKey(identity);
                            if (!isGraphicPresent(location)) {
                                System.out.format("      [%s] Missing entity icon: %s (%s) (%s)%n", symSet.getLabel(), entity.getLabel(), identity.getLabel(), location);
                            }
                        });
                    }
                    entity.getEntityTypes().forEach(entityType -> {
                        System.out.format("      %s%n", entityType.getLabel());
                        if (entityType.isGraphicalIcon()) {
                            library.getStandardIdentities().forEach(identity -> {
                                String location = entityType.getGraphicKey(identity);
                                if (!isGraphicPresent(location)) {
                                    System.out.format("      [%s] Missing entity icon: %s (%s) (%s)%n", symSet.getLabel(), entityType.getLabel(), identity.getLabel(), location);
                                }
                            });
                        }
                        entityType.getEntitySubTypes().forEach(subType -> {
                            System.out.format("        %s%n", subType.getLabel());
                            if (subType.isGraphicalIcon()) {
                                library.getStandardIdentities().forEach(identity -> {
                                    String location = ((EntitySubTypeImpl) subType).getGraphicKey(identity);
                                    if (!isGraphicPresent(location)) {
                                        System.out.format("      [%s] Missing entity icon: %s (%s) (%s)%n", symSet.getLabel(), subType.getLabel(), identity.getLabel(), location);
                                    }
                                });
                            }
                        });
                    });
                });
                System.out.println("    Sector 1 Modifiers");
                symSet.getSectorOneModifiers().forEach(mod1 -> {
                    System.out.format("      %s%n", mod1.getLabel());
                    if (!mod1.isUnknown()) {
                        String location = mod1.getGraphicKey();
                        if (!isGraphicPresent(location)) {
                            System.out.format("      [%s] Missing mod1 icon: %s (%s)%n", symSet.getLabel(), mod1.getLabel(), location);
                        }
                    }
                });
                System.out.println("    Sector 2 Modifiers");
                symSet.getSectorTwoModifiers().forEach(mod2 -> {
                    System.out.format("      %s%n", mod2.getLabel());
                    if (!mod2.isUnknown()) {
                        String location = mod2.getGraphicKey();
                        if (!isGraphicPresent(location)) {
                            System.out.format("      [%s] Missing mod2 icon: %s (%s)%n", symSet.getLabel(), mod2.getLabel(), location);
                        }
                    }
                });
            });
        });
        System.out.println("Amplifiers");
        library.getAmplifiers().forEach(amp -> {
            System.out.format("  [%s] %s%n", amp.getId(), amp.getLabel());
        });
        System.out.println("List Amplifiers");
        library.getListAmplifiers().stream().filter(amp -> !amp.isStandardAmplifier()).forEach(amp -> {
            System.out.format("  [%s] %s%n", amp.getId(), amp.getLabel());
            amp.getItems().forEach(value -> {
                System.out.format("    [%s] %s%n", value.getFullId(), value.getLabel());
            });
        });
        System.out.println("Standard Amplifiers");
        // Since jmsfx#121 a frame amplifier is a fill substituted into the frame, not a fragment of
        // its own, so none of its values names a file and asking for one would report the whole list
        // missing. Taken from the symbol sets rather than a flag on the list because that is where
        // the library states it.
        Set<String> frameAmplifiers = library.getSymbolSets()
            .stream()
            .flatMap(symbolSet -> symbolSet.getFrameAmplifierList().stream())
            .map(AmplifierListItem::getFullId)
            .collect(Collectors.toCollection(HashSet::new));
        library.getListAmplifiers().stream().filter(AmplifierList::isStandardAmplifier).forEach(amp -> {
            System.out.format("  [%s] %s%n", amp.getId(), amp.getLabel());
            amp.getItems().forEach(value -> {
                System.out.format("    [%s] %s%n", value.getFullId(), value.getLabel());
                if (!amp.isUnknown() && !frameAmplifiers.contains(value.getFullId())) {
                    library.getStandardIdentities().forEach(identity -> {
                        String location = value.getGraphicKey(identity);
                        if (!isGraphicPresent(location)) {
                            System.out.format("    [%s:%s]: %s not found%n", value.getLabel(), identity.getLabel(), location);
                        }
                    });
                }
            });
        });
        System.out.println();
        System.out.println();
        System.out.println("Unused Files");
        Path rootDir = fragmentRoots.get(0).resolve("svg");
        // Since jmsfx#133 an overlay may add no fragments of its own, so its tree is absent rather
        // than empty - jmsfx-battleorder has none at all. Nothing of its own can be unused.
        if (!Files.isDirectory(rootDir)) {
            System.out.format("  no fragments of its own: %s%n", rootDir);
            return;
        }
        List<Path> blank = new ArrayList<>();
        try (Stream<Path> tree = Files.walk(rootDir)) {
            tree.filter(Files::isRegularFile).filter(path -> path.getFileName().toString().endsWith(".svg")).filter(path -> !usedPaths.contains(path)).forEach(path -> {
                if (isDeliberatelyBlank(path)) {
                    blank.add(path);
                } else {
                    System.out.format("%s%n", path);
                }
            });
        }
        System.out.format("%n%d deliberately blank%n", blank.size());
        blank.forEach(path -> System.out.format("  %s%n", path));
    }

    /**
     * Whether a fragment nothing asked for says so, by carrying an empty content group.
     * <p>
     * An element that draws nothing - an "unspecified" modifier, or a type that exists only to hold its sub-types - still has a file, and nothing ever names it. Without a mark
     * there is no way to read that file apart from one whose drawing was never finished, which is how the eight orphans jmsfx#136 found sat there unnoticed. An empty {@code <g>}
     * at the content root is that mark: the blank is the drawing.
     */
    private boolean isDeliberatelyBlank(Path path) {
        try {
            String markup = Files.readString(path);
            return CONTENT_ROOTS.stream().anyMatch(root -> markup.contains(String.format("<g id=\"%s\"/>", root)) || markup.contains(String.format("<g id=\"%s\"></g>", root)));
        } catch (IOException e) {
            return false;
        }
    }

    private boolean isGraphicPresent(String location) {
        String relative = location.startsWith("/") ? location.substring(1) : location;
        for (Path root : fragmentRoots) {
            Path path = root.resolve(relative);
            if (Files.exists(path)) {
                usedPaths.add(path);
                return true;
            }
        }
        return false;
    }
}
