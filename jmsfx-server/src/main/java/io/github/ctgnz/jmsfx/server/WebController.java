package io.github.ctgnz.jmsfx.server;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import io.github.ctgnz.jmsfx.server.icon.SymbolSetSummary;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

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
        "/browse/{symbolSetId}"
    })
    public String browseSymbolSet(@PathVariable String symbolSetId, Model model) {
        SymbolSetEnum symbolSet = Arrays.stream(SymbolSetEnum.values())
            .filter(candidate -> candidate.getId()
                .equals(symbolSetId))
            .findFirst()
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Unknown symbol set: " + symbolSetId));
        model.addAttribute("symbolSet", symbolSet);
        model.addAttribute("symbolSetPath", SymbolSetSummary.pathFor(symbolSet));
        return "entity-list :: entities";
    }

}
