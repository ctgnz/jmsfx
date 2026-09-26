package io.github.ctgnz.jmsfx.server.icon;

import io.github.ctgnz.jmsfx.IconLibrary;

/**
 * What this instance can say about itself: which symbology library it discovered, and how many symbol sets that library offers.
 * <p>
 * Since jmsfx#93 the server names no library and runs against whichever one is on its classpath, so the answer is not a property of the build anyone can read off. With an instance
 * per library planned, each on its own subdomain, "which library is this one running" needs to be answerable from outside rather than inferred from which symbol sets happen to
 * appear in a listing. See jmsfx#111.
 */
public record LibrarySummary(String name, int symbolSets) {

    public static LibrarySummary of(IconLibrary library) {
        return new LibrarySummary(library.getName(), library.getSymbolSets()
            .size());
    }

}
