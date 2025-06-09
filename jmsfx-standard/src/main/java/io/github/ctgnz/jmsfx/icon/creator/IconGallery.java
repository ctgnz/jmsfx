package io.github.ctgnz.jmsfx.icon.creator;

import java.util.Arrays;

import nz.co.ctg.foxglove.FoxgloveParser;

import io.github.ctgnz.jmsfx.icon.SymbolSet;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class IconGallery extends TabPane {
    private FoxgloveParser parser = new FoxgloveParser();

    public IconGallery(Stage mainStage) {
        setMaxWidth(mainStage.getWidth());
        Arrays.stream(SymbolSet.values()).forEach(sym -> {
            SymbolSetGallery gallery = new SymbolSetGallery(parser, sym);
            gallery.setMinWidth(mainStage.getWidth());
            Tab tab = new Tab(sym.getLabel(), new ScrollPane(gallery));
            getTabs().add(tab);
        });
    }

}
