package io.github.ctgnz.jmsfx.server;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.info.BuildProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.server.icon.SymbolSetSummary;

@Controller
public class WebController {

    /**
     * Absent when nothing put build-info on the classpath. ObjectProvider rather than a required bean so that stays a page that offers the releases page instead of an application
     * that will not start.
     */
    private final ObjectProvider<BuildProperties> buildProperties;

    WebController(ObjectProvider<BuildProperties> buildProperties) {
        this.buildProperties = buildProperties;
    }

    @GetMapping({
        "/"
    })
    public String homePage() {
        return "index";
    }

    @GetMapping({
        "/generate"
    })
    public String generateIcons() {
        return "generate";
    }

    @GetMapping({
        "/browse"
    })
    public String browseSymbolSets() {
        return "entity-list";
    }

    /**
     * The bundles offered here are the ones for the library this instance is running, so a visitor to a hallux subdomain gets the hallux creator without having to know that is
     * what they want. See jmsfx#112.
     */
    @GetMapping({
        "/download"
    })
    public String downloadCreator(Model model) {
        String version = buildProperties.getIfAvailable() == null ? null
            : buildProperties.getObject()
                .getVersion();
        model.addAttribute("downloads", CreatorDownloads.of(IconLibrary.discover()
            .getName(), version));
        return "download";
    }

    @GetMapping({
        "/symbology"
    })
    public String symbologyPrimer() {
        return "symbology";
    }

    @GetMapping({
        "/browse/{symbolSetId}"
    })
    public String browseSymbolSet(@PathVariable String symbolSetId, Model model) {
        SymbolSet symbolSet = IconLibrary.discover()
            .getSymbolSets()
            .stream()
            .filter(candidate -> candidate.getId()
                .equals(symbolSetId))
            .findFirst()
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Unknown symbol set: " + symbolSetId));
        model.addAttribute("symbolSet", symbolSet);
        model.addAttribute("symbolSetPath", SymbolSetSummary.pathFor(symbolSet));
        return "entity-list :: entities";
    }

}
