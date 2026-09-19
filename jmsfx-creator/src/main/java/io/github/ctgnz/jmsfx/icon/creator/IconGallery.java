package io.github.ctgnz.jmsfx.icon.creator;

import java.util.Arrays;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.standard.SymbolSetEnum;

public class IconGallery extends TabPane {

    private final IconLibrary library;
    private final Stage mainStage;

    @SuppressWarnings("this-escape")
    public IconGallery(IconLibrary library, Stage mainStage) {
        this.library = library;
        this.mainStage = mainStage;
        setMaxWidth(mainStage.getWidth());
        Arrays.stream(SymbolSetEnum.values())
            .forEach(sym -> {
                Tab tab = new Tab(sym.getLabel());
                tab.setUserData(sym);
                getTabs().add(tab);
            });

        // Rendering every combination of every symbol set up front froze the UI
        // before the dialog could even appear. A tab now builds its gallery the
        // first time it is shown - the work has to stay on the FX thread, since
        // it builds scene graph nodes, so it is deferred rather than moved off.
        getSelectionModel().selectedItemProperty()
            .addListener((obs, oldTab, newTab) -> populate(newTab));
        populate(getSelectionModel().getSelectedItem());
    }

    private void populate(Tab tab) {
        if (tab == null || tab.getContent() != null) {
            return;
        }
        SymbolSetGallery gallery = new SymbolSetGallery(library, (SymbolSetEnum) tab.getUserData());
        gallery.setMinWidth(mainStage.getWidth());
        tab.setContent(new ScrollPane(gallery));
    }

}
