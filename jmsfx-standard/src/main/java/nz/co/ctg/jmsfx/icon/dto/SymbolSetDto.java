package nz.co.ctg.jmsfx.icon.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import nz.co.ctg.jmsfx.model.SymbolSet;

public class SymbolSetDto {

    private final SymbolSet symbolSet;

    public @JsonCreator SymbolSetDto(@JsonProperty("symbolSet") SymbolSet symbolSet) {
        this.symbolSet = symbolSet;
    }

    public SymbolSet getSymbolSet() {
        return symbolSet;
    }

    public String getId() {
        return symbolSet.name();
    }

    public String getLabel() {
        return symbolSet.getLabel();
    }

    public String getPath() {
        return getLabel().replaceAll("\\s", "").replaceAll("-", "");
    }

}
