package io.github.ctgnz.jmsfx.icon;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import io.github.ctgnz.jmsfx.icon.model.AmplifierListImpl;
import io.github.ctgnz.jmsfx.icon.model.EntitySubTypeImpl;
import io.github.ctgnz.jmsfx.icon.model.LibraryImpl;
import io.github.ctgnz.jmsfx.icon.model.StatusImpl;

public class VerifyIcons {

    private List<Path> usedPaths;

    public static void main(String[] args) {
        try {
            VerifyIcons verifier = new VerifyIcons();
            verifier.verify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verify() throws Exception {
        this.usedPaths = new ArrayList<>();
        LibraryImpl library = new LibraryImpl();
        System.out.println("Version");
        library.getVersion().forEach(version -> {
            System.out.format("  [%s] %s%n", version.getId(), version.getLabel());
        });
        System.out.println("Context");
        library.getContext().forEach(context -> {
            System.out.format("  [%s] %s%n", context.getId(), context.getLabel());
            if (!context.isReality()) {
                String location = context.getOverlayGraphicLocation();
                if (!isGraphicPresent(location)) {
                    System.out.format("    [%s]: %s not found%n", context.getLabel(), location);
                }
            }
        });
        System.out.println("Standard Identity");
        library.getStandardIdentity().forEach(sid -> {
            System.out.format("  [%s] %s (%s)%n", sid.getId(), sid.getLabel(), sid.getGroup());
        });
        System.out.println("Status");
        library.getStatus().forEach(status -> {
            System.out.format("  [%s] %s%n", status.getId(), status.getLabel());
            if (status.isOperationalCondition()) {
                library.getSymbolSets().stream().filter(sym -> status.isSupported(sym)).forEach(symbolSet -> {
                    library.getStandardIdentity().forEach(identity -> {
                        String location = status.getGraphicLocation(identity, symbolSet);
                        if (!isGraphicPresent(location)) {
                            System.out.format("    [%s:%s:%s]: %s not found%n", status.getLabel(), symbolSet.getLabel(), identity.getLabel(), location);
                        }
                    });
                });
            }
        });
        System.out.println("HQ/TF/Dummy");
        library.getHqtfDummy().forEach(dummy -> {
            System.out.format("  [%s] %s%n", dummy.getId(), dummy.getLabel());
            library.getSymbolSets().stream().filter(sym -> dummy.isSupported(sym)).forEach(symbolSet -> {
                library.getStandardIdentity().forEach(identity -> {
                    String location = dummy.getGraphicLocation(identity, symbolSet);
                    if (!isGraphicPresent(location) && !dummy.isUnknown()) {
                        System.out.format("    [%s:%s:%s]: %s not found%n", dummy.getLabel(), symbolSet.getLabel(), identity.getLabel(), location);
                    }
                });
            });
        });
        library.getDimension().forEach(dimension -> {
            System.out.format("%s%n", dimension.getLabel());
            dimension.getSymbolSetAdapters().forEach(symSet -> {
                System.out.format("  %s%n", symSet.getLabel());
                if (symSet.isFramedIcon()) {
                    if (symSet.isAmplifierGuidesPresent()) {
                        String location = symSet.getAmplifierGuideTemplateLocation();
                        if (!isGraphicPresent(location)) {
                            System.out.format("    [%s]: %s not found%n", symSet.getLabel(), location);
                        }
                    }
                    library.getStandardIdentity().forEach(identity -> {
                        library.getStatus().stream().filter(StatusImpl::isFrameStatus).forEach(status -> {
                            if (identity.isConfirmed() || status.isPresent()) {
                                String location = symSet.getFrameLocation(identity, status, false);
                                if (!isGraphicPresent(location)) {
                                    System.out.format("    [%s:%s:%s]: %s not found%n", symSet.getLabel(), identity.getLabel(), status.getLabel(), location);
                                }
                                if (!identity.isHostile()) {
                                    location = symSet.getFrameLocation(identity, status, true);
                                    if (!isGraphicPresent(location)) {
                                        System.out.format("    [%s:%s:%s]: %s not found%n", symSet.getLabel(), identity.getLabel(), status.getLabel(), location);
                                    }
                                }
                            }
                        });
                    });
                }
                symSet.getEntities().forEach(entity -> {
                    System.out.format("    %s%n", entity.getLabel());
                    if (entity.isGraphicalIcon()) {
                        library.getStandardIdentity().forEach(identity -> {
                            String location = entity.getGraphicLocation(identity);
                            if (!isGraphicPresent(location)) {
                                System.out.format("      [%s] Missing entity icon: %s (%s) (%s)%n", symSet.getLabel(), entity.getLabel(), identity.getLabel(), location);
                            }
                        });
                    }
                    entity.getEntityTypes().forEach(entityType -> {
                        System.out.format("      %s%n", entityType.getLabel());
                        if (entityType.isGraphicalIcon()) {
                            library.getStandardIdentity().forEach(identity -> {
                                String location = entityType.getGraphicLocation(identity);
                                if (!isGraphicPresent(location)) {
                                    System.out.format("      [%s] Missing entity icon: %s (%s) (%s)%n", symSet.getLabel(), entityType.getLabel(), identity.getLabel(), location);
                                }
                            });
                        }
                        entityType.getEntitySubTypes().forEach(subType -> {
                            System.out.format("        %s%n", subType.getLabel());
                            if (subType.isGraphicalIcon()) {
                                library.getStandardIdentity().forEach(identity -> {
                                    String location = ((EntitySubTypeImpl) subType).getGraphicLocation(identity);
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
                        String location = mod1.getFullGraphicLocation();
                        if (!isGraphicPresent(location)) {
                            System.out.format("      [%s] Missing mod1 icon: %s (%s)%n", symSet.getLabel(), mod1.getLabel(), location);
                        }
                    }
                });
                System.out.println("    Sector 2 Modifiers");
                symSet.getSectorTwoModifiers().forEach(mod2 -> {
                    System.out.format("      %s%n", mod2.getLabel());
                    if (!mod2.isUnknown()) {
                        String location = mod2.getFullGraphicLocation();
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
            amp.getValues().forEach(value -> {
                System.out.format("    [%s] %s%n", value.getFullId(), value.getLabel());
            });
        });
        System.out.println("Standard Amplifiers");
        library.getListAmplifiers().stream().filter(AmplifierListImpl::isStandardAmplifier).forEach(amp -> {
            System.out.format("  [%s] %s%n", amp.getId(), amp.getLabel());
            amp.getValues().forEach(value -> {
                System.out.format("    [%s] %s%n", value.getFullId(), value.getLabel());
                if (!amp.isUnknown()) {
                    library.getStandardIdentity().forEach(identity -> {
                        String location = value.getGraphicLocation(identity);
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
        Path rootDir = Paths.get(IdentificationSymbol.class.getResource("/svg").toURI());
        Files.walk(rootDir).forEach(path -> {
            if (Files.isRegularFile(path) && path.toFile().getName().endsWith(".svg")) {
                if (!usedPaths.contains(path)) {
                    System.out.format("%s%n", path);
                }
            }
        });
    }

    private boolean isGraphicPresent(String location) {
        try {
            URL resource = IdentificationSymbol.class.getResource(location);
            Path path = Paths.get(resource.toURI());
            usedPaths.add(path);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
