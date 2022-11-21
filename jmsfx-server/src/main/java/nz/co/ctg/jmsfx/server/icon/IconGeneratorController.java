package nz.co.ctg.jmsfx.server.icon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.model.SymbolSet;
import nz.co.ctg.jmsfx.server.model.SymbolSetData;

@RestController
@RequestMapping("/generate")
public class IconGeneratorController {

    @GetMapping("/symbols")
    public List<SymbolSetData> getSupportedSymbolSets() {
        return Arrays.stream(SymbolSet.values()).map(SymbolSetData::new).collect(Collectors.toList());
    }

}
