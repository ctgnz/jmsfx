package io.github.ctgnz.jmsfx.server.icon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import io.github.ctgnz.jmsfx.icon.dto.SymbolSetDto;

@RestController
@RequestMapping("/info")
public class IconGeneratorController {

    @GetMapping("/symbols")
    public List<SymbolSetDto> getSupportedSymbolSets() {
        return Arrays.stream(SymbolSet.values()).map(SymbolSetDto::new).collect(Collectors.toList());
    }

}
