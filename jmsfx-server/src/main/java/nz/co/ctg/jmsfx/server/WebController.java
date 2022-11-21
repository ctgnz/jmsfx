package nz.co.ctg.jmsfx.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.server.model.SymbolSetData;

@Controller
public class WebController {

    @RequestMapping({"/"})
    public String homePage() {
        return "index";
    }

    @RequestMapping({"/generate"})
    public String generateIcons() {
        return "generate";
    }

    @RequestMapping({"/browse"})
    public String browseSymbolSets() {
        return "entity-list";
    }

    @RequestMapping({"/browse/{symbolSet}"})
    public String browseSymbolSet(@PathVariable SymbolSet symbolSet, Model model) {
        model.addAttribute("symbolSet", new SymbolSetData(symbolSet));
        model.addAttribute("entities", symbolSet.getSymbolSetInfo().getEntities());
        return "entity-list :: entities";
    }

}
