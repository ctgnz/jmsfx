package nz.co.ctg.jmsfx.server.icon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ctg.jmsfx.icon.dto.SymbolSetDto;
import nz.co.ctg.jmsfx.model.SymbolSet;

@RestController
@RequestMapping("/info")
public class IconGeneratorController {

    @GetMapping("/symbols")
    public List<SymbolSetDto> getSupportedSymbolSets() {
        return Arrays.stream(SymbolSet.values()).map(SymbolSetDto::new).collect(Collectors.toList());
    }

}
