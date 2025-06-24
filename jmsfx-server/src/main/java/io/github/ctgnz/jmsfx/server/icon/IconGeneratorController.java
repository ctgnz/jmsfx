package io.github.ctgnz.jmsfx.server.icon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import io.github.ctgnz.jmsfx.icon.editor.SymbolSetImpl;

@RestController
@RequestMapping("/info")
public class IconGeneratorController {

    @GetMapping("/symbols")
    public List<SymbolSetImpl> getSupportedSymbolSets() {
        return Arrays.stream(SymbolSetEnum.values()).map(SymbolSetImpl::new).collect(Collectors.toList());
    }

}
