package io.github.ctgnz.jmsfx.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.icon.editor.SymbolSetImpl;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

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
    public String browseSymbolSet(@PathVariable SymbolSet symbolSet, Model model) {
        model.addAttribute("symbolSet", new SymbolSetImpl((SymbolSetEnum) symbolSet));
        return "entity-list :: entities";
    }

}
