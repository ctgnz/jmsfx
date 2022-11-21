package nz.co.ctg.jmsfx.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import nz.co.ctg.jmsfx.model.SymbolSet;

public class SymbolSetData {

    private final SymbolSet symbolSet;

    public @JsonCreator SymbolSetData(@JsonProperty("symbolSet") SymbolSet symbolSet) {
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
