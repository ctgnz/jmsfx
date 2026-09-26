package io.github.ctgnz.jmsfx.server;

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

    @GetMapping({
        "/download"
    })
    public String downloadCreator() {
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
