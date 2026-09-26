package io.github.ctgnz.jmsfx.server.icon;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.IconLibrary;

@RestController
@RequestMapping("/info")
public class IconGeneratorController {

    /** Which library this instance is running. See jmsfx#111. */
    @GetMapping("/library")
    public LibrarySummary getLibrary() {
        return LibrarySummary.of(IconLibrary.discover());
    }

    /** The symbol sets of whichever library is on the classpath, each carrying the path segment the icon API is reached at. */
    @GetMapping("/symbols")
    public List<SymbolSetSummary> getSupportedSymbolSets() {
        return IconLibrary.discover()
            .getSymbolSets()
            .stream()
            .map(SymbolSetSummary::of)
            .toList();
    }

}
