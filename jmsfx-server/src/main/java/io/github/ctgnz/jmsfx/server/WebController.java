package io.github.ctgnz.jmsfx.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.dto.SymbolSetDto;

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
        model.addAttribute("symbolSet", new SymbolSetDto(symbolSet));
        model.addAttribute("entities", symbolSet.getSymbolSetInfo().getEntities());
        model.addAttribute("sectorOneMods", symbolSet.getSymbolSetInfo().getSectorOneModifiers());
        model.addAttribute("sectorTwoMods", symbolSet.getSymbolSetInfo().getSectorTwoModifiers());
        return "entity-list :: entities";
    }

}
