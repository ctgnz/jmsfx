package io.github.ctgnz.jmsfx.icon.creator;

import javafx.scene.control.ListCell;

import io.github.ctgnz.jmsfx.types.IconScale;

public class IconScaleListCell extends ListCell<IconScale> {

    @Override
    protected void updateItem(IconScale item, boolean empty) {
        super.updateItem(item, empty);
        if (item == null || empty) {
            setText("");
        } else {
            setText(item.getDescription());
        }
    }

}