package io.github.ctgnz.jmsfx.icon.creator;

import java.util.Arrays;

import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.icon.SymbolSetEnum;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class IconGallery extends TabPane {

    public IconGallery(IconLibrary library, Stage mainStage) {
        setMaxWidth(mainStage.getWidth());
        Arrays.stream(SymbolSetEnum.values()).forEach(sym -> {
            SymbolSetGallery gallery = new SymbolSetGallery(library, sym);
            gallery.setMinWidth(mainStage.getWidth());
            Tab tab = new Tab(sym.getLabel(), new ScrollPane(gallery));
            getTabs().add(tab);
        });
    }

}
