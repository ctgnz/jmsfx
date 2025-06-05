package io.github.ctgnz.jmsfx.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.model.SymbolSetAdapter;

@Controller
public class WebController {

    @GetMapping({"/"})
    public String homePage() {
        return "index";
    }

    @GetMapping({"/generate"})
    public String generateIcons() {
        return "generate";
    }

    @GetMapping({"/browse"})
    public String browseSymbolSets() {
        return "entity-list";
    }

    @GetMapping({"/browse/{symbolSet}"})
    public String browseSymbolSet(@PathVariable ISymbolSet symbolSet, Model model) {
        model.addAttribute("symbolSet", new SymbolSetAdapter((SymbolSet) symbolSet));
        return "entity-list :: entities";
    }

}
