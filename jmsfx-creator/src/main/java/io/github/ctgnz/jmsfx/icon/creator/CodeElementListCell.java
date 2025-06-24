package io.github.ctgnz.jmsfx.icon.creator;

import io.github.ctgnz.jmsfx.CodeElement;
import javafx.scene.control.ListCell;

public class CodeElementListCell<E extends CodeElement> extends ListCell<E> {
    @Override
    protected void updateItem(E item, boolean empty) {
        super.updateItem(item, empty);
        if (item == null || empty) {
            setText("");
        } else {
            setText(item.getLabel());
        }
    }
}