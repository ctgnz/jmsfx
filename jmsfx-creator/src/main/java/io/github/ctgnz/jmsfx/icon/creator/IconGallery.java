package io.github.ctgnz.jmsfx.icon.creator;

import java.util.Arrays;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public class IconGallery extends TabPane {

    @SuppressWarnings("this-escape")
    public IconGallery(IconLibrary library, Stage mainStage) {
        setMaxWidth(mainStage.getWidth());
        Arrays.stream(SymbolSetEnum.values())
            .forEach(sym -> {
                SymbolSetGallery gallery = new SymbolSetGallery(library, sym);
                gallery.setMinWidth(mainStage.getWidth());
                Tab tab = new Tab(sym.getLabel(), new ScrollPane(gallery));
                getTabs().add(tab);
            });
    }

}
